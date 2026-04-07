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
import com.himdev.him.world.HimChunkLoading;
import com.himdev.him.world.HimLocator;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
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
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.Collections;
import java.util.Set;
import java.util.UUID;

public class HimEntity extends PathfinderMob implements RangedAttackMob {
    private static final EntityDataAccessor<Integer> RESCUE_EXECUTION_VICTIM_ID =
            SynchedEntityData.defineId(HimEntity.class, EntityDataSerializers.INT);
    private static final EntityDataAccessor<Boolean> RESCUE_EXECUTION_VISUAL_ACTIVE =
            SynchedEntityData.defineId(HimEntity.class, EntityDataSerializers.BOOLEAN);
    private static final DivinePunisher DIVINE_PUNISHER = new DivinePunisher();
    private static final HimEnvironmentDominance ENVIRONMENT_DOMINANCE = new HimEnvironmentDominance();
    private static final HimPitEscapeFlight PIT_ESCAPE_FLIGHT = new HimPitEscapeFlight();
    private static final int NO_RESCUE_VICTIM = -1;
    private static final double VOID_RECOVERY_SPEED = 2.0D;
    private static final int VOID_TRIGGER_DEPTH = 4;
    private static final int VOID_SAFE_OFFSET = 8;
    private static final int VOID_RECOVERY_SEARCH_HEIGHT = 24;
    private static final String GUARDED_PLAYER_ID_TAG = "GuardedPlayerId";
    private static final String GUARDIAN_MODE_TAG = "GuardianMode";
    private static final String GUARDIAN_TICKS_REMAINING_TAG = "GuardianTicksRemaining";
    private static final int PIT_ESCAPE_MAX_TICKS = 40;
    private static final int PIT_ESCAPE_COOLDOWN_TICKS = 20;
    private static final double RESCUE_EXECUTION_ASCENT_PER_TICK = 0.08D;
    private static final double RESCUE_EXECUTION_ASCENT_MAX_HEIGHT = 2.4D;
    private static final double GUARD_FOLLOW_SPEED = 1.25D;
    private static final double GUARD_STOP_DISTANCE_SQR = 1.2D * 1.2D;
    private static final double GUARD_FOLLOW_START_DISTANCE_SQR = 2.8D * 2.8D;
    private static final double GUARD_RECALL_DISTANCE_SQR = 10.0D * 10.0D;
    private static final int[] GUARD_VERTICAL_OFFSETS = new int[] {0, 1, -1};
    private static final Vec3[] GUARD_ANCHOR_OFFSETS = new Vec3[] {
            new Vec3(1.7D, 0.0D, 0.0D),
            new Vec3(1.7D, 0.0D, -0.8D),
            new Vec3(1.7D, 0.0D, 0.8D),
            new Vec3(-1.7D, 0.0D, 0.0D),
            new Vec3(-1.7D, 0.0D, -0.8D),
            new Vec3(-1.7D, 0.0D, 0.8D),
            new Vec3(0.0D, 0.0D, -1.8D),
            new Vec3(0.0D, 0.0D, 1.8D)
    };
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
    private enum RescueExecutionPhase {
        IDLE,
        HOLDING,
        RETURNING
    }

    private final HimEnvironmentPressureTracker environmentPressureTracker = new HimEnvironmentPressureTracker();
    private Vec3 pitEscapeLanding;
    private boolean pitEscapeUsesCruisePath;
    private double pitEscapeCruiseY;
    private HimPitEscapeFlight.FlightPhase pitEscapePhase;
    private LivingEntity angerTarget;
    private int pitEscapeTicksRemaining;
    private int pitEscapeCooldownTicks;
    private boolean recoveringFromVoid;
    private boolean removalAuthorizedInProgress;
    private boolean deltaMovementUpdateAuthorizedInProgress;
    private RescueExecutionPhase rescueExecutionPhase = RescueExecutionPhase.IDLE;
    private UUID rescueExecutionTargetId;
    private Vec3 rescueReturnPos;
    private float rescueReturnYRot;
    private float rescueReturnXRot;
    private int rescueExecutionTicksRemaining;
    private boolean rescueVictimNoGravity;
    private double rescueExecutionStartY;
    private double rescueExecutionMaxY;
    private UUID guardedPlayerId;
    private HimGuardianMode guardianMode = HimGuardianMode.NONE;
    private int guardianTicksRemaining;
    private Set<ChunkPos> forcedChunks = Collections.emptySet();

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
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(RESCUE_EXECUTION_VICTIM_ID, NO_RESCUE_VICTIM);
        this.entityData.define(RESCUE_EXECUTION_VISUAL_ACTIVE, false);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        if (guardedPlayerId != null) {
            tag.putUUID(GUARDED_PLAYER_ID_TAG, guardedPlayerId);
        }
        tag.putString(GUARDIAN_MODE_TAG, guardianMode.serializedName());
        if (guardianMode.isTimed()) {
            tag.putInt(GUARDIAN_TICKS_REMAINING_TAG, guardianTicksRemaining);
        }
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        guardedPlayerId = tag.hasUUID(GUARDED_PLAYER_ID_TAG) ? tag.getUUID(GUARDED_PLAYER_ID_TAG) : null;
        guardianMode = HimGuardianMode.fromSerializedName(tag.getString(GUARDIAN_MODE_TAG));
        guardianTicksRemaining = tag.getInt(GUARDIAN_TICKS_REMAINING_TAG);
        if (guardedPlayerId == null || guardianMode == HimGuardianMode.NONE) {
            clearGuardianState();
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
        if (!level().isClientSide && level() instanceof ServerLevel serverLevel) {
            HimChunkLoading.releaseEntityTickets(serverLevel, getUUID(), forcedChunks);
            forcedChunks = Collections.emptySet();
        }
        super.onRemovedFromWorld();
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        LivingEntity attacker = resolveAttacker(source);
        if (isValidAngerTarget(attacker)) {
            angerTarget = attacker;
            this.setTarget(attacker);
        }
        return false;
    }

    @Override
    public void setTarget(LivingEntity target) {
        if (target == null) {
            angerTarget = null;
            super.setTarget(null);
            return;
        }
        if (isValidAngerTarget(target)) {
            angerTarget = target;
            super.setTarget(target);
            return;
        }
        super.setTarget(null);
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
    public boolean canBeLeashed(Player player) {
        return false;
    }

    @Override
    public void setLeashedTo(Entity entity, boolean sendPacket) {
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
        if (!level().isClientSide && level() instanceof ServerLevel serverLevel && !this.isRemoved()) {
            forcedChunks = HimChunkLoading.syncEntityTickets(serverLevel, this, forcedChunks);
        }
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

        if (level() instanceof ServerLevel serverLevel && tickRescueExecution(serverLevel)) {
            environmentPressureTracker.resetAfterCorrection(this);
            return;
        }

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
        if (level() instanceof ServerLevel serverLevel && tickGuardianEscort(serverLevel)) {
            environmentPressureTracker.resetAfterCorrection(this);
            return;
        }

        this.setNoGravity(false);
        super.customServerAiStep();

        synchronizeAngerTarget();
        environmentPressureTracker.sample(this);
        ENVIRONMENT_DOMINANCE.applyIfNeeded(this, environmentPressureTracker);
    }

    @Override
    public void performRangedAttack(LivingEntity target, float velocity) {
        if (level() instanceof ServerLevel serverLevel && isValidCombatTarget(target)) {
            DIVINE_PUNISHER.punish(serverLevel, target);
        }
    }

    public boolean startRescueExecution(LivingEntity target, Vec3 stagingPoint, int holdTicks) {
        if (holdTicks <= 0 || isInRescueExecution() || !isValidRescueExecutionTarget(target) || target.level() != this.level()) {
            return false;
        }

        rescueReturnPos = this.position();
        rescueReturnYRot = this.getYRot();
        rescueReturnXRot = this.getXRot();
        rescueExecutionTargetId = target.getUUID();
        rescueExecutionTicksRemaining = holdTicks;
        rescueVictimNoGravity = target.isNoGravity();
        rescueExecutionPhase = RescueExecutionPhase.HOLDING;
        this.getNavigation().stop();
        this.setTarget(null);
        this.setNoGravity(true);
        this.setDeltaMovement(Vec3.ZERO);
        this.moveTo(stagingPoint.x, stagingPoint.y, stagingPoint.z, this.getYRot(), this.getXRot());
        rescueExecutionStartY = this.getY();
        rescueExecutionMaxY = rescueExecutionStartY + RESCUE_EXECUTION_ASCENT_MAX_HEIGHT;
        faceRescueVictim(target);
        setRescueExecutionVictimId(target.getId());
        setRescueExecutionVisualActive(true);
        return true;
    }

    public boolean isInRescueExecution() {
        return rescueExecutionPhase != RescueExecutionPhase.IDLE;
    }

    public int rescueExecutionVictimId() {
        return this.entityData.get(RESCUE_EXECUTION_VICTIM_ID);
    }

    public boolean isRescueExecutionVisualActive() {
        return this.entityData.get(RESCUE_EXECUTION_VISUAL_ACTIVE);
    }

    public void activateGuardian(Player player, HimGuardianMode mode) {
        int durationTicks = mode != null && mode.isTimed() ? mode.defaultDurationTicks() : 0;
        activateGuardian(player, mode, durationTicks);
    }

    public void activateGuardian(Player player, HimGuardianMode mode, int durationTicks) {
        if (player == null) {
            return;
        }

        HimGuardianMode selectedMode = mode == null ? HimGuardianMode.FOLLOW : mode;
        guardedPlayerId = player.getUUID();
        guardianMode = selectedMode;
        guardianTicksRemaining = selectedMode.isTimed() ? Math.max(1, durationTicks) : 0;
        angerTarget = null;
        this.setTarget(null);
        if (!isInRescueExecution() && player.level() == this.level()) {
            relocateBeside(player);
        }
        HimLog.info(
                "him guardian_mode uuid={} owner={} mode={} ticks={}",
                getUUID(),
                player.getScoreboardName(),
                guardianMode.serializedName(),
                guardianTicksRemaining
        );
    }

    public HimGuardianMode guardianMode() {
        return guardianMode;
    }

    public int guardianTicksRemaining() {
        return guardianTicksRemaining;
    }

    public boolean isGuardingPlayer(Player player) {
        return player != null && guardedPlayerId != null && guardedPlayerId.equals(player.getUUID()) && guardianMode != HimGuardianMode.NONE;
    }

    public boolean hasGuardianAssignment() {
        return guardianMode != HimGuardianMode.NONE && guardedPlayerId != null;
    }

    public void deactivateGuardian(Player player) {
        if (player != null && !isGuardingPlayer(player)) {
            return;
        }

        HimLog.info(
                "him guardian_mode_cleared uuid={} owner={} mode={}",
                getUUID(),
                player != null ? player.getScoreboardName() : guardedPlayerId,
                guardianMode.serializedName()
        );
        angerTarget = null;
        this.setTarget(null);
        this.getNavigation().stop();
        guardianTicksRemaining = 0;
        clearGuardianState();
    }

    public void relocateBeside(Player player) {
        if (!(this.level() instanceof ServerLevel serverLevel) || player == null || player.level() != this.level()) {
            return;
        }

        Vec3 anchor = resolveGuardianAnchor(serverLevel, player);
        this.getNavigation().stop();
        this.moveTo(anchor.x, anchor.y, anchor.z, player.getYRot(), 0.0F);
        this.setYHeadRot(player.getYRot());
        this.yHeadRotO = player.getYRot();
        this.yBodyRot = player.getYRot();
        this.yBodyRotO = player.getYRot();
        this.setDeltaMovement(Vec3.ZERO);
        this.fallDistance = 0.0F;
    }

    private boolean isValidCombatTarget(LivingEntity target) {
        return target != null
                && target.isAlive()
                && target != this
                && target instanceof Mob
                && !(target instanceof Player);
    }

    private boolean isValidRescueExecutionTarget(LivingEntity target) {
        return isValidCombatTarget(target) && target instanceof Enemy;
    }

    private boolean isValidAngerTarget(LivingEntity target) {
        if (!isValidCombatTarget(target) || target.level() != this.level()) {
            return false;
        }
        double followRange = this.getAttributeValue(Attributes.FOLLOW_RANGE);
        return this.distanceToSqr(target) <= followRange * followRange;
    }

    private LivingEntity resolveAttacker(DamageSource source) {
        Entity sourceEntity = source.getEntity();
        if (sourceEntity instanceof LivingEntity livingEntity) {
            return livingEntity;
        }

        Entity directEntity = source.getDirectEntity();
        if (directEntity instanceof LivingEntity livingEntity) {
            return livingEntity;
        }
        return null;
    }

    private void synchronizeAngerTarget() {
        if (!isValidAngerTarget(angerTarget)) {
            angerTarget = null;
        }
        if (this.getTarget() != angerTarget) {
            this.setTarget(angerTarget);
        }
    }

    private boolean shouldRecoverFromVoid() {
        return recoveringFromVoid;
    }

    private boolean tickRescueExecution(ServerLevel level) {
        if (!isInRescueExecution()) {
            return false;
        }
        if (rescueExecutionPhase == RescueExecutionPhase.RETURNING) {
            return finishRescueExecution(null);
        }

        LivingEntity victim = resolveRescueExecutionVictim(level);
        if (rescueExecutionPhase != RescueExecutionPhase.HOLDING || victim == null || !victim.isAlive()) {
            return finishRescueExecution(victim);
        }

        this.getNavigation().stop();
        this.setTarget(null);
        this.setNoGravity(true);
        this.setDeltaMovement(Vec3.ZERO);
        this.fallDistance = 0.0F;
        riseRescueExecutionHold();
        anchorRescueVictim(victim, rescueExecutionVictimAnchor(victim));
        faceRescueVictimTowardHim(victim);
        faceRescueVictim(victim);

        rescueExecutionTicksRemaining--;
        if (rescueExecutionTicksRemaining <= 0) {
            rescueExecutionPhase = RescueExecutionPhase.RETURNING;
            DIVINE_PUNISHER.punish(level, victim);
            return finishRescueExecution(victim);
        }
        return true;
    }

    private boolean tickGuardianEscort(ServerLevel level) {
        if (!hasGuardianAssignment()) {
            return false;
        }

        if (guardianMode.isTimed()) {
            guardianTicksRemaining--;
            if (guardianTicksRemaining <= 0) {
                HimLog.info("him guardian_departed uuid={} owner={} reason=timed_expired", getUUID(), guardedPlayerId);
                clearGuardianState();
                HimRemovalAuthorizer.authorize(getUUID());
                this.remove(RemovalReason.DISCARDED);
                return true;
            }
        }

        Player guardedPlayer = resolveGuardedPlayer(level);
        if (guardedPlayer == null || !guardedPlayer.isAlive() || guardedPlayer.isSpectator() || guardedPlayer.level() != this.level()) {
            this.getNavigation().stop();
            return false;
        }

        LivingEntity threat = resolveGuardianThreat(level, guardedPlayer);
        if (threat != null) {
            angerTarget = threat;
            this.setTarget(threat);
            return false;
        }

        LivingEntity currentTarget = this.getTarget();
        if (currentTarget != null && currentTarget.isAlive()) {
            return false;
        }

        angerTarget = null;
        this.setTarget(null);
        followGuardedPlayer(level, guardedPlayer);
        return false;
    }

    private Player resolveGuardedPlayer(ServerLevel level) {
        if (guardedPlayerId == null) {
            return null;
        }
        return level.getServer().getPlayerList().getPlayer(guardedPlayerId);
    }

    private LivingEntity resolveGuardianThreat(ServerLevel level, Player guardedPlayer) {
        LivingEntity directAttacker = guardedPlayer.getLastHurtByMob();
        if (isValidGuardianThreat(directAttacker, guardedPlayer)) {
            return directAttacker;
        }

        LivingEntity directTarget = guardedPlayer.getLastHurtMob();
        if (isValidGuardianThreat(directTarget, guardedPlayer)) {
            return directTarget;
        }

        double scanRange = Math.max(12.0D, this.getAttributeValue(Attributes.FOLLOW_RANGE) * 0.5D);
        LivingEntity bestThreat = null;
        double bestDistanceSqr = Double.MAX_VALUE;
        for (Mob mob : level.getEntitiesOfClass(Mob.class, guardedPlayer.getBoundingBox().inflate(scanRange))) {
            if (!isValidGuardianThreat(mob, guardedPlayer) || mob.getTarget() != guardedPlayer) {
                continue;
            }
            double distanceSqr = mob.distanceToSqr(guardedPlayer);
            if (distanceSqr < bestDistanceSqr) {
                bestThreat = mob;
                bestDistanceSqr = distanceSqr;
            }
        }
        return bestThreat;
    }

    private boolean isValidGuardianThreat(LivingEntity target, Player guardedPlayer) {
        return isValidCombatTarget(target)
                && target != guardedPlayer
                && target.level() == this.level();
    }

    private void followGuardedPlayer(ServerLevel level, Player guardedPlayer) {
        Vec3 anchor = resolveGuardianAnchor(level, guardedPlayer);
        double distanceToPlayerSqr = this.distanceToSqr(guardedPlayer);
        if (distanceToPlayerSqr >= GUARD_RECALL_DISTANCE_SQR) {
            this.getNavigation().stop();
            this.moveTo(anchor.x, anchor.y, anchor.z, guardedPlayer.getYRot(), 0.0F);
            this.setDeltaMovement(Vec3.ZERO);
            this.fallDistance = 0.0F;
            return;
        }

        double distanceToAnchorSqr = this.distanceToSqr(anchor.x, anchor.y, anchor.z);
        if (distanceToAnchorSqr > GUARD_FOLLOW_START_DISTANCE_SQR) {
            this.getNavigation().moveTo(anchor.x, anchor.y, anchor.z, GUARD_FOLLOW_SPEED);
            return;
        }
        if (distanceToAnchorSqr <= GUARD_STOP_DISTANCE_SQR) {
            this.getNavigation().stop();
        }
    }

    private Vec3 resolveGuardianAnchor(ServerLevel level, Player guardedPlayer) {
        Vec3 forward = horizontalFacingVector(guardedPlayer.getYRot());
        Vec3 right = new Vec3(forward.z, 0.0D, -forward.x);

        for (Vec3 offset : GUARD_ANCHOR_OFFSETS) {
            Vec3 candidate = guardedPlayer.position()
                    .add(right.scale(offset.x))
                    .add(forward.scale(offset.z));
            Vec3 safeAnchor = findSafeGuardianAnchor(level, candidate, guardedPlayer.getY());
            if (safeAnchor != null) {
                return safeAnchor;
            }
        }

        return guardedPlayer.position().add(right.scale(1.7D));
    }

    private Vec3 findSafeGuardianAnchor(ServerLevel level, Vec3 candidate, double preferredY) {
        BlockPos baseFeet = BlockPos.containing(candidate.x, preferredY, candidate.z);
        for (int dy : GUARD_VERTICAL_OFFSETS) {
            BlockPos feet = baseFeet.above(dy);
            if (isSafeGuardianFeet(level, feet)) {
                return new Vec3(feet.getX() + 0.5D, feet.getY(), feet.getZ() + 0.5D);
            }
        }
        return null;
    }

    private boolean isSafeGuardianFeet(ServerLevel level, BlockPos feet) {
        BlockPos head = feet.above();
        BlockPos floor = feet.below();
        BlockState feetState = level.getBlockState(feet);
        BlockState headState = level.getBlockState(head);
        BlockState floorState = level.getBlockState(floor);
        if (!canOccupyGuardSpace(feetState) || !canOccupyGuardSpace(headState)) {
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
        return level.noCollision(this, candidateBox);
    }

    private boolean canOccupyGuardSpace(BlockState state) {
        return state.isAir() || state.canBeReplaced();
    }

    public boolean isRecoveringFromVoidState() {
        return recoveringFromVoid;
    }

    public boolean hasAvailableHostileTarget() {
        return angerTarget != null;
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

        if (pitEscapeUsesCruisePath && pitEscapePhase != null) {
            pitEscapePhase = PIT_ESCAPE_FLIGHT.nextPhaseForPath(this.position(), pitEscapeLanding, pitEscapeCruiseY, pitEscapePhase);
        }

        Vec3 nextStep = PIT_ESCAPE_FLIGHT.nextStep(
                serverLevel,
                this,
                pitEscapeLanding,
                pitEscapeUsesCruisePath,
                pitEscapeCruiseY,
                pitEscapePhase
        );
        this.moveTo(nextStep.x, nextStep.y, nextStep.z, this.getYRot(), this.getXRot());
        // Pit escape already applies an explicit step position. Leaving a matching
        // delta movement here makes the client see a second motion source and causes
        // visible rubber-banding during the airborne phase.
        this.setDeltaMovement(Vec3.ZERO);

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
        pitEscapeCruiseY = pitEscapeUsesCruisePath ? PIT_ESCAPE_FLIGHT.selectCruiseHeight(serverLevel, this, landing) : landing.y;
        pitEscapePhase = pitEscapeUsesCruisePath ? HimPitEscapeFlight.FlightPhase.ASCENT : null;
        pitEscapeTicksRemaining = PIT_ESCAPE_MAX_TICKS;
        this.setNoGravity(true);
        this.setDeltaMovement(Vec3.ZERO);
    }

    private void stopPitEscapeFlight() {
        pitEscapeLanding = null;
        pitEscapeUsesCruisePath = false;
        pitEscapeCruiseY = 0.0D;
        pitEscapePhase = null;
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

    private LivingEntity resolveRescueExecutionVictim(ServerLevel level) {
        if (rescueExecutionTargetId == null) {
            return null;
        }
        Entity entity = level.getEntity(rescueExecutionTargetId);
        return entity instanceof LivingEntity living && !living.isRemoved() ? living : null;
    }

    private void anchorRescueVictim(LivingEntity victim, Vec3 anchor) {
        if (victim instanceof Mob mob) {
            mob.getNavigation().stop();
            mob.setTarget(null);
        }
        victim.setNoGravity(true);
        victim.setDeltaMovement(Vec3.ZERO);
        victim.fallDistance = 0.0F;
        victim.moveTo(anchor.x, anchor.y, anchor.z, victim.getYRot(), victim.getXRot());
    }

    private Vec3 rescueExecutionVictimAnchor(LivingEntity victim) {
        Vec3 forward = horizontalFacingVector(this.getYRot());
        double forwardOffset = Math.max(0.6D, ((this.getBbWidth() + victim.getBbWidth()) * 0.5D) + 0.12D);
        return this.position()
                .add(forward.scale(forwardOffset))
                .add(0.0D, 0.05D, 0.0D);
    }

    private void riseRescueExecutionHold() {
        double nextY = Math.min(this.getY() + RESCUE_EXECUTION_ASCENT_PER_TICK, rescueExecutionMaxY);
        if (nextY > this.getY() + 1.0E-5D) {
            this.moveTo(this.getX(), nextY, this.getZ(), this.getYRot(), this.getXRot());
        }
    }

    private Vec3 horizontalFacingVector(float yawDegrees) {
        float yawRadians = yawDegrees * ((float) Math.PI / 180.0F);
        return new Vec3(-Mth.sin(yawRadians), 0.0D, Mth.cos(yawRadians)).normalize();
    }

    private void faceRescueVictim(LivingEntity victim) {
        Vec3 delta = victim.getEyePosition().subtract(this.getEyePosition());
        double horizontalDistance = Math.sqrt(delta.x * delta.x + delta.z * delta.z);
        if (horizontalDistance < 1.0E-5D && Math.abs(delta.y) < 1.0E-5D) {
            return;
        }

        float targetYRot = (float) (Mth.atan2(delta.z, delta.x) * (180.0D / Math.PI)) - 90.0F;
        this.setYRot(targetYRot);
        this.yRotO = targetYRot;
        this.setXRot(0.0F);
        this.xRotO = 0.0F;
        this.yHeadRot = targetYRot;
        this.yHeadRotO = targetYRot;
        this.yBodyRot = targetYRot;
        this.yBodyRotO = targetYRot;
    }

    private void faceRescueVictimTowardHim(LivingEntity victim) {
        Vec3 delta = this.getEyePosition().subtract(victim.getEyePosition());
        double horizontalDistance = Math.sqrt(delta.x * delta.x + delta.z * delta.z);
        if (horizontalDistance < 1.0E-5D && Math.abs(delta.y) < 1.0E-5D) {
            return;
        }

        float targetYRot = (float) (Mth.atan2(delta.z, delta.x) * (180.0D / Math.PI)) - 90.0F;
        float targetXRot = (float) (-(Mth.atan2(delta.y, horizontalDistance) * (180.0D / Math.PI)));
        victim.setYRot(targetYRot);
        victim.yRotO = targetYRot;
        victim.setXRot(targetXRot);
        victim.xRotO = targetXRot;
        victim.setYHeadRot(targetYRot);
        victim.yHeadRotO = targetYRot;
        victim.setYBodyRot(targetYRot);
        victim.yBodyRotO = targetYRot;
    }

    private boolean finishRescueExecution(LivingEntity victim) {
        if (victim != null && !victim.isRemoved()) {
            if (victim.isAlive()) {
                victim.setNoGravity(rescueVictimNoGravity);
                victim.setDeltaMovement(Vec3.ZERO);
                victim.fallDistance = 0.0F;
            }
        }
        if (rescueReturnPos != null) {
            this.moveTo(rescueReturnPos.x, rescueReturnPos.y, rescueReturnPos.z, rescueReturnYRot, rescueReturnXRot);
        }
        this.setNoGravity(false);
        this.setDeltaMovement(Vec3.ZERO);
        clearRescueExecutionState();
        return true;
    }

    private void clearRescueExecutionState() {
        rescueExecutionPhase = RescueExecutionPhase.IDLE;
        rescueExecutionTargetId = null;
        rescueReturnPos = null;
        rescueReturnYRot = 0.0F;
        rescueReturnXRot = 0.0F;
        rescueExecutionTicksRemaining = 0;
        rescueVictimNoGravity = false;
        rescueExecutionStartY = 0.0D;
        rescueExecutionMaxY = 0.0D;
        setRescueExecutionVictimId(NO_RESCUE_VICTIM);
        setRescueExecutionVisualActive(false);
    }

    private void clearGuardianState() {
        guardedPlayerId = null;
        guardianMode = HimGuardianMode.NONE;
        guardianTicksRemaining = 0;
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

    private void setRescueExecutionVictimId(int victimId) {
        this.entityData.set(RESCUE_EXECUTION_VICTIM_ID, victimId);
    }

    private void setRescueExecutionVisualActive(boolean active) {
        this.entityData.set(RESCUE_EXECUTION_VISUAL_ACTIVE, active);
    }
}
