package com.himdev.him.entity;

import com.himdev.him.entity.ai.HimAttackSelector;
import com.himdev.him.entity.ai.HimMeleePunishGoal;
import com.himdev.him.entity.ai.HimRangedPunishGoal;
import com.himdev.him.entity.movement.HimEnvironmentDominance;
import com.himdev.him.entity.movement.HimEnvironmentPressureTracker;
import com.himdev.him.entity.observation.HimObservationDirector;
import com.himdev.him.guardian.DivinePunisher;
import com.himdev.him.registry.HimEntityTypes;
import com.himdev.him.util.HimLog;
import com.himdev.him.world.HimExistenceSeal;
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

import java.util.Comparator;

public class HimEntity extends PathfinderMob implements RangedAttackMob {
    private static final DivinePunisher DIVINE_PUNISHER = new DivinePunisher();
    private static final HimEnvironmentDominance ENVIRONMENT_DOMINANCE = new HimEnvironmentDominance();
    private static final double VOID_RECOVERY_SPEED = 2.0D;
    private static final int VOID_TRIGGER_DEPTH = 4;
    private static final int VOID_SAFE_OFFSET = 8;
    private static final int RETURN_STABILIZATION_TICKS = 20;

    private final HimEnvironmentPressureTracker environmentPressureTracker = new HimEnvironmentPressureTracker();
    private final HimObservationDirector observationDirector = new HimObservationDirector();
    private boolean recoveringFromVoid;
    private int returnStabilizationTicks;
    private float returnStabilizationYRot;
    private float returnStabilizationXRot;

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
    public void tick() {
        super.tick();
        if (!level().isClientSide && returnStabilizationTicks > 0) {
            this.setDeltaMovement(0.0D, 0.0D, 0.0D);
            this.setYRot(returnStabilizationYRot);
            this.setYHeadRot(returnStabilizationYRot);
            this.yBodyRot = returnStabilizationYRot;
            this.setXRot(returnStabilizationXRot);
        }
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
                return;
            }
            syncExistenceSeal(serverLevel);
        }
    }

    @Override
    public void kill() {
    }

    @Override
    public void remove(RemovalReason reason) {
        if (!level().isClientSide && reason.shouldDestroy()) {
            boolean authorized = HimRemovalAuthorizer.consume(getUUID());
            if (!authorized) {
                HimLog.info("him removal_blocked uuid={} reason={}", getUUID(), reason);
                return;
            }

            if (level() instanceof ServerLevel serverLevel) {
                syncExistenceSeal(serverLevel);
                HimExistenceSeal.prepareAuthorizedRemoval(serverLevel, this);
                HimLog.info("him removed uuid={} reason={}", getUUID(), reason);
                HimLocator.clear(serverLevel, getUUID());
            }
        }
        super.remove(reason);
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        return false;
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
    protected void customServerAiStep() {
        this.clearFire();
        this.removeAllEffects();
        this.fallDistance = 0.0F;
        updateVoidRecoveryState();

        if (returnStabilizationTicks > 0) {
            returnStabilizationTicks--;
            this.setNoGravity(false);
            this.setDeltaMovement(0.0D, 0.0D, 0.0D);
            this.setYRot(returnStabilizationYRot);
            this.setYHeadRot(returnStabilizationYRot);
            this.yBodyRot = returnStabilizationYRot;
            this.setXRot(returnStabilizationXRot);
            if (level() instanceof ServerLevel serverLevel) {
                syncExistenceSeal(serverLevel);
            }
            return;
        }

        if (level() instanceof ServerLevel serverLevel) {
            syncExistenceSeal(serverLevel);
        }

        if (shouldRecoverFromVoid()) {
            observationDirector.stop();
            this.setTarget(null);
            this.setNoGravity(true);
            this.setDeltaMovement(0.0D, 0.0D, 0.0D);
            this.setPos(this.getX(), this.getY() + VOID_RECOVERY_SPEED, this.getZ());
            environmentPressureTracker.resetAfterCorrection(this);
            return;
        }

        this.setNoGravity(false);
        if (level() instanceof ServerLevel serverLevel && observationDirector.tick(serverLevel, this)) {
            syncExistenceSeal(serverLevel);
            return;
        }

        super.customServerAiStep();

        if (!isValidCombatTarget(this.getTarget())) {
            this.setTarget(findNearestHostileTarget());
        }
        environmentPressureTracker.sample(this);
        if (ENVIRONMENT_DOMINANCE.applyIfNeeded(this, environmentPressureTracker) && level() instanceof ServerLevel serverLevel) {
            syncExistenceSeal(serverLevel);
        }
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

    public boolean isReturnStabilizing() {
        return returnStabilizationTicks > 0;
    }

    public boolean hasAvailableHostileTarget() {
        return isValidCombatTarget(this.getTarget()) || findNearestHostileTarget() != null;
    }

    public boolean isUnderEnvironmentEscapePressure() {
        return this.horizontalCollision
                || this.isInWall()
                || this.isInWaterOrBubble()
                || environmentPressureTracker.isPersistentlyObstructed()
                || environmentPressureTracker.isPersistentlyInFluid();
    }

    private void updateVoidRecoveryState() {
        int minBuildHeight = this.level().getMinBuildHeight();
        if (!recoveringFromVoid && this.getY() < minBuildHeight - VOID_TRIGGER_DEPTH) {
            recoveringFromVoid = true;
            return;
        }
        if (recoveringFromVoid && this.getY() >= minBuildHeight + VOID_SAFE_OFFSET) {
            recoveringFromVoid = false;
        }
    }

    private void syncExistenceSeal(ServerLevel serverLevel) {
        HimExistenceSeal.update(serverLevel.getServer(), serverLevel.dimension(), this.getX(), this.getY(), this.getZ(), this.getYRot(), this.getXRot());
    }

    public void stabilizeAfterReturn() {
        this.returnStabilizationTicks = RETURN_STABILIZATION_TICKS;
        this.returnStabilizationYRot = this.getYRot();
        this.returnStabilizationXRot = this.getXRot();
        this.setYHeadRot(returnStabilizationYRot);
        this.yBodyRot = returnStabilizationYRot;
        this.setDeltaMovement(0.0D, 0.0D, 0.0D);
    }
}
