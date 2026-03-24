package com.himdev.him.entity;

import com.himdev.him.entity.ai.HimAttackSelector;
import com.himdev.him.entity.ai.HimMeleePunishGoal;
import com.himdev.him.entity.ai.HimRangedPunishGoal;
import com.himdev.him.entity.movement.HimEnvironmentDominance;
import com.himdev.him.entity.movement.HimEnvironmentPressureTracker;
import com.himdev.him.entity.movement.HimPitEscapeFlight;
import com.himdev.him.guardian.DivinePunisher;
import com.himdev.him.registry.HimEntityTypes;
import com.himdev.him.util.HimLog;
import com.himdev.him.world.HimLocator;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.Comparator;

public class HimEntity extends PathfinderMob implements RangedAttackMob {
    private static final DivinePunisher DIVINE_PUNISHER = new DivinePunisher();
    private static final HimEnvironmentDominance ENVIRONMENT_DOMINANCE = new HimEnvironmentDominance();
    private static final HimPitEscapeFlight PIT_ESCAPE_FLIGHT = new HimPitEscapeFlight();
    private static final double VOID_RECOVERY_SPEED = 2.0D;
    private static final int VOID_TRIGGER_DEPTH = 4;
    private static final int VOID_SAFE_OFFSET = 8;
    private static final int VOID_RECOVERY_SEARCH_HEIGHT = 24;
    private static final int PIT_ESCAPE_MAX_TICKS = 40;
    private static final int PIT_ESCAPE_COOLDOWN_TICKS = 20;
    private static final int[][] VOID_RECOVERY_SEARCH_OFFSETS = new int[][] {
            {0, 0},
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1},
            {1, 1},
            {1, -1},
            {-1, 1},
            {-1, -1},
            {2, 0},
            {-2, 0},
            {0, 2},
            {0, -2}
    };
    private final HimEnvironmentPressureTracker environmentPressureTracker = new HimEnvironmentPressureTracker();
    private Vec3 pitEscapeLanding;
    private boolean pitEscapeUsesCruisePath;
    private int pitEscapeTicksRemaining;
    private int pitEscapeCooldownTicks;
    private boolean recoveringFromVoid;
    private boolean removalAuthorizedInProgress;
    private boolean deltaMovementUpdateAuthorizedInProgress;

    public HimEntity(EntityType<? extends PathfinderMob> entityType, Level level) {
        super(entityType, level);
        this.setPersistenceRequired();
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 1024.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.35D)
                .add(Attributes.ATTACK_DAMAGE, 100.0D)
                .add(Attributes.FOLLOW_RANGE, 64.0D);
    }

    public static HimEntity spawnForTest(ServerLevel level, BlockPos pos) {
        HimEntity him = HimEntityTypes.HIM.get().create(level);
        if (him == null) {
            throw new IllegalStateException("Failed to create Him entity");
        }
        him.moveTo(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, 0.0F, 0.0F);
        level.addFreshEntity(him);
        return him;
    }

    @Override
    protected void registerGoals() {
        HimAttackSelector attackSelector = new HimAttackSelector(this);
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new HimRangedPunishGoal(this, attackSelector));
        this.goalSelector.addGoal(3, new HimMeleePunishGoal(this, attackSelector));
        this.goalSelector.addGoal(7, new RandomStrollGoal(this, 0.9D));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 16.0F));
        this.goalSelector.addGoal(9, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(
                this,
                LivingEntity.class,
                10,
                true,
                false,
                this::isValidCombatTarget
        ));
    }

    @Override
    public void onAddedToWorld() {
        super.onAddedToWorld();
        if (!level().isClientSide && level() instanceof ServerLevel serverLevel) {
            HimLog.info("him spawn_attempt uuid={} pos={}", getUUID(), blockPosition());
            boolean registered = HimLocator.tryRegister(serverLevel, getUUID());
            HimLog.info("him uniqueness uuid={} accepted={} current={}", getUUID(), registered, HimLocator.currentHimId(serverLevel));
            if (!registered) {
                HimLog.info("him duplicate_discard uuid={}", getUUID());
                HimRemovalAuthorizer.authorize(getUUID());
                discard();
            }
        }
    }

    @Override
    public void kill() {
    }

    @Override
    public void remove(RemovalReason reason) {
        if (reason.shouldDestroy()) {
            boolean authorized = removalAuthorizedInProgress || (!level().isClientSide && HimRemovalAuthorizer.consume(getUUID()));
            if (HimRemovalProtection.shouldBlockDestroyRemoval(level().isClientSide, authorized)) {
                HimLog.info("him removal_blocked uuid={} reason={} client={}", getUUID(), reason, level().isClientSide);
                return;
            }

            if (!level().isClientSide && level() instanceof ServerLevel serverLevel) {
                HimLog.info("him removed uuid={} reason={}", getUUID(), reason);
                HimLocator.clear(serverLevel, getUUID());
            }
        }
        removalAuthorizedInProgress = true;
        try {
            super.remove(reason);
        } finally {
            removalAuthorizedInProgress = false;
        }
    }

    @Override
    public void onRemovedFromWorld() {
        if (HimRemovalProtection.shouldBlockOnRemovedFromWorld(removalAuthorizedInProgress)) {
            HimLog.info("him world_removal_blocked uuid={} client={}", getUUID(), level().isClientSide);
            return;
        }
        super.onRemovedFromWorld();
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        return false;
    }

    public boolean isRemovalAuthorizedInProgress() {
        return removalAuthorizedInProgress;
    }

    @Override
    public void setHealth(float health) {
        float maxHealth = (float) this.getMaxHealth();
        float currentHealth = super.getHealth() > 0.0F ? super.getHealth() : maxHealth;
        float safeHealth = Math.max(1.0F, Math.min(currentHealth, maxHealth));
        if (!Float.isFinite(health) || health < safeHealth) {
            super.setHealth(safeHealth);
            return;
        }
        super.setHealth(Math.min(health, maxHealth));
    }

    @Override
    public boolean isInvulnerableTo(DamageSource source) {
        return true;
    }

    @Override
    public boolean fireImmune() {
        return true;
    }

    @Override
    public boolean displayFireAnimation() {
        return false;
    }

    @Override
    public void setSecondsOnFire(int seconds) {
    }

    @Override
    public void setRemainingFireTicks(int ticks) {
    }

    @Override
    public boolean canBeAffected(MobEffectInstance effect) {
        return false;
    }

    @Override
    public boolean addEffect(MobEffectInstance effect, Entity source) {
        return false;
    }

    @Override
    public boolean isAffectedByPotions() {
        return false;
    }

    @Override
    public boolean causeFallDamage(float fallDistance, float multiplier, DamageSource source) {
        return false;
    }

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    public void setDeltaMovement(Vec3 deltaMovement) {
        Vec3 safeDeltaMovement = HimMotionProtection.sanitizeDeltaMovement(deltaMovement);
        if (HimMotionProtection.shouldBlockExternalDeltaMovement(deltaMovementUpdateAuthorizedInProgress, safeDeltaMovement)) {
            HimLog.info("him velocity_blocked uuid={} motion={}", getUUID(), safeDeltaMovement);
            super.setDeltaMovement(Vec3.ZERO);
            return;
        }
        super.setDeltaMovement(safeDeltaMovement);
    }

    @Override
    public void setDeltaMovement(double x, double y, double z) {
        this.setDeltaMovement(new Vec3(x, y, z));
    }

    @Override
    public boolean isPushedByFluid() {
        return false;
    }

    @Override
    public boolean ignoreExplosion() {
        return true;
    }

    @Override
    public void push(Entity entity) {
    }

    @Override
    public void push(double x, double y, double z) {
    }

    @Override
    protected boolean canRide(Entity vehicle) {
        return false;
    }

    @Override
    protected boolean canAddPassenger(Entity passenger) {
        return false;
    }

    @Override
    protected boolean couldAcceptPassenger() {
        return false;
    }

    @Override
    public boolean startRiding(Entity vehicle, boolean force) {
        return false;
    }

    @Override
    public boolean canCollideWith(Entity entity) {
        return false;
    }

    @Override
    public boolean canBeCollidedWith() {
        return false;
    }

    @Override
    public void tick() {
        sanitizeExternalVisualResidue();
        withAuthorizedDeltaMovementUpdates(() -> super.tick());
        sanitizeExternalVisualResidue();
    }

    @Override
    public void handleEntityEvent(byte entityEventId) {
        if (entityEventId == 2 || entityEventId == 3) {
            sanitizeExternalVisualResidue();
            return;
        }
        super.handleEntityEvent(entityEventId);
        sanitizeExternalVisualResidue();
    }

    @Override
    protected void customServerAiStep() {
        this.clearFire();
        this.removeAllEffects();
        this.fallDistance = 0.0F;
        updateVoidRecoveryState();

        if (shouldRecoverFromVoid()) {
            this.setTarget(null);
            this.setNoGravity(true);
            this.setDeltaMovement(0.0D, 0.0D, 0.0D);
            this.setPos(this.getX(), this.getY() + VOID_RECOVERY_SPEED, this.getZ());
            if (this.getY() >= this.level().getMinBuildHeight() + VOID_SAFE_OFFSET && finishVoidRecoveryIfPossible()) {
                this.setNoGravity(false);
            }
            environmentPressureTracker.resetAfterCorrection(this);
            return;
        }

        if (pitEscapeCooldownTicks > 0) {
            pitEscapeCooldownTicks--;
        }
        if (level() instanceof ServerLevel serverLevel && tickPitEscapeFlight(serverLevel)) {
            environmentPressureTracker.resetAfterCorrection(this);
            return;
        }
        if (level() instanceof ServerLevel serverLevel && tryStartPitEscapeFlight(serverLevel)) {
            tickPitEscapeFlight(serverLevel);
            environmentPressureTracker.resetAfterCorrection(this);
            return;
        }

        this.setNoGravity(false);
        super.customServerAiStep();

        if (!isValidCombatTarget(this.getTarget())) {
            this.setTarget(findNearestHostileTarget());
        }
        environmentPressureTracker.sample(this);
        ENVIRONMENT_DOMINANCE.applyIfNeeded(this, environmentPressureTracker);
    }

    @Override
    public void performRangedAttack(LivingEntity target, float velocity) {
        if (level() instanceof ServerLevel serverLevel && isValidCombatTarget(target)) {
            DIVINE_PUNISHER.punish(serverLevel, target);
        }
    }

    private boolean isValidCombatTarget(LivingEntity target) {
        return target != null && target.isAlive() && target instanceof Enemy && !(target instanceof Player);
    }

    private LivingEntity findNearestHostileTarget() {
        double followRange = this.getAttributeValue(Attributes.FOLLOW_RANGE);
        return this.level().getEntitiesOfClass(LivingEntity.class, this.getBoundingBox().inflate(followRange), this::isValidCombatTarget)
                .stream()
                .min(Comparator.comparingDouble(this::distanceToSqr))
                .orElse(null);
    }

    private boolean shouldRecoverFromVoid() {
        return recoveringFromVoid;
    }

    public boolean isRecoveringFromVoidState() {
        return recoveringFromVoid;
    }

    public boolean hasAvailableHostileTarget() {
        return isValidCombatTarget(this.getTarget()) || findNearestHostileTarget() != null;
    }

    public boolean isUnderEnvironmentEscapePressure() {
        return this.horizontalCollision
                || this.isInWall()
                || this.isInWaterOrBubble()
                || isEscapingPit()
                || environmentPressureTracker.isPersistentlyObstructed()
                || environmentPressureTracker.isPersistentlyInFluid();
    }

    public boolean isEscapingPit() {
        return pitEscapeTicksRemaining > 0 && pitEscapeLanding != null;
    }

    private void updateVoidRecoveryState() {
        int minBuildHeight = this.level().getMinBuildHeight();
        if (!recoveringFromVoid && this.getY() < minBuildHeight - VOID_TRIGGER_DEPTH) {
            recoveringFromVoid = true;
        }
    }

    private boolean finishVoidRecoveryIfPossible() {
        Vec3 landing = findVoidRecoveryLanding();
        if (landing == null) {
            return false;
        }

        this.getNavigation().stop();
        this.moveTo(landing.x, landing.y, landing.z, this.getYRot(), this.getXRot());
        this.setDeltaMovement(Vec3.ZERO);
        this.fallDistance = 0.0F;
        recoveringFromVoid = false;
        return true;
    }

    private Vec3 findVoidRecoveryLanding() {
        int minBuildHeight = this.level().getMinBuildHeight();
        BlockPos currentPos = this.blockPosition();
        int highestFeetY = Math.max(BlockPos.containing(this.getX(), this.getY(), this.getZ()).getY(), minBuildHeight + VOID_SAFE_OFFSET);

        for (int[] offset : VOID_RECOVERY_SEARCH_OFFSETS) {
            int candidateX = currentPos.getX() + offset[0];
            int candidateZ = currentPos.getZ() + offset[1];
            for (int feetY = highestFeetY; feetY >= minBuildHeight; feetY--) {
                if (highestFeetY - feetY > VOID_RECOVERY_SEARCH_HEIGHT) {
                    break;
                }

                BlockPos feet = new BlockPos(candidateX, feetY, candidateZ);
                if (isSafeVoidRecoveryLanding(feet)) {
                    return new Vec3(feet.getX() + 0.5D, feet.getY(), feet.getZ() + 0.5D);
                }
            }
        }

        return null;
    }

    private boolean isSafeVoidRecoveryLanding(BlockPos feet) {
        BlockPos head = feet.above();
        BlockPos floor = feet.below();

        BlockState feetState = this.level().getBlockState(feet);
        BlockState headState = this.level().getBlockState(head);
        BlockState floorState = this.level().getBlockState(floor);
        if (!canOccupyVoidRecoverySpace(feetState) || !canOccupyVoidRecoverySpace(headState)) {
            return false;
        }
        if (feetState.liquid() || headState.liquid()) {
            return false;
        }
        if (floorState.isAir() || floorState.liquid()) {
            return false;
        }

        AABB candidateBox = this.getBoundingBox().move(
                (feet.getX() + 0.5D) - this.getX(),
                feet.getY() - this.getY(),
                (feet.getZ() + 0.5D) - this.getZ()
        );
        return this.level().noCollision(this, candidateBox);
    }

    private boolean canOccupyVoidRecoverySpace(BlockState state) {
        return state.isAir() || state.canBeReplaced();
    }

    private boolean tryStartPitEscapeFlight(ServerLevel serverLevel) {
        if (isEscapingPit() || pitEscapeCooldownTicks > 0) {
            return false;
        }

        Vec3 landing = PIT_ESCAPE_FLIGHT.findEscapeLanding(serverLevel, this);
        boolean shouldStart = PIT_ESCAPE_FLIGHT.shouldStart(serverLevel, this, environmentPressureTracker, landing);
        if (!shouldStart) {
            return false;
        }

        startPitEscapeFlight(serverLevel, landing);
        return true;
    }

    private boolean tickPitEscapeFlight(ServerLevel serverLevel) {
        if (!isEscapingPit()) {
            return false;
        }

        this.getNavigation().stop();
        this.setTarget(null);
        this.setNoGravity(true);
        this.fallDistance = 0.0F;

        pitEscapeTicksRemaining--;
        if (pitEscapeLanding == null) {
            stopPitEscapeFlight();
            return true;
        }

        Vec3 nextStep = PIT_ESCAPE_FLIGHT.nextStep(serverLevel, this, pitEscapeLanding, pitEscapeUsesCruisePath);
        this.setDeltaMovement(nextStep.subtract(this.position()));
        this.moveTo(nextStep.x, nextStep.y, nextStep.z, this.getYRot(), this.getXRot());

        if (PIT_ESCAPE_FLIGHT.hasReachedLanding(serverLevel, this, pitEscapeLanding)) {
            stopPitEscapeFlight();
            return true;
        }

        if (pitEscapeTicksRemaining <= 0) {
            Vec3 timedOutLanding = pitEscapeLanding;
            stopPitEscapeFlight();
            if (timedOutLanding != null && !PIT_ESCAPE_FLIGHT.hasReachedLanding(serverLevel, this, timedOutLanding)) {
                ENVIRONMENT_DOMINANCE.forceLocalEscape(serverLevel, this);
            }
            return true;
        }

        return true;
    }

    private void startPitEscapeFlight(ServerLevel serverLevel, Vec3 landing) {
        pitEscapeLanding = landing;
        pitEscapeUsesCruisePath = PIT_ESCAPE_FLIGHT.shouldUseCruisePath(serverLevel, this, landing);
        pitEscapeTicksRemaining = PIT_ESCAPE_MAX_TICKS;
        this.setNoGravity(true);
        this.setDeltaMovement(Vec3.ZERO);
    }

    private void stopPitEscapeFlight() {
        pitEscapeLanding = null;
        pitEscapeUsesCruisePath = false;
        pitEscapeTicksRemaining = 0;
        pitEscapeCooldownTicks = PIT_ESCAPE_COOLDOWN_TICKS;
        this.setNoGravity(false);
        this.setDeltaMovement(Vec3.ZERO);
        this.fallDistance = 0.0F;
    }

    private void sanitizeExternalVisualResidue() {
        this.clearFire();
        this.fallDistance = 0.0F;
        this.hurtTime = 0;
        this.deathTime = 0;
        this.invulnerableTime = 0;
        if (this.getPose() == Pose.DYING) {
            this.setPose(Pose.STANDING);
        }
        if (!Float.isFinite(this.getHealth()) || this.getHealth() <= 0.0F) {
            this.setHealth((float) this.getMaxHealth());
        }
    }

    private void withAuthorizedDeltaMovementUpdates(Runnable action) {
        boolean previous = deltaMovementUpdateAuthorizedInProgress;
        deltaMovementUpdateAuthorizedInProgress = true;
        try {
            action.run();
        } finally {
            deltaMovementUpdateAuthorizedInProgress = previous;
        }
    }
}
