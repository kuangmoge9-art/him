package com.himdev.him.entity;

import com.himdev.him.entity.ai.HimAttackSelector;
import com.himdev.him.entity.ai.HimMeleePunishGoal;
import com.himdev.him.entity.ai.HimRangedPunishGoal;
import com.himdev.him.guardian.DivinePunisher;
import com.himdev.him.registry.HimEntityTypes;
import com.himdev.him.world.HimLocator;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
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
            if (!HimLocator.tryRegister(serverLevel, getUUID())) {
                discard();
            }
        }
    }

    @Override
    public void remove(RemovalReason reason) {
        if (!level().isClientSide && level() instanceof ServerLevel serverLevel && reason.shouldDestroy()) {
            HimLocator.clear(serverLevel, getUUID());
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
    protected void customServerAiStep() {
        super.customServerAiStep();

        if (!isValidCombatTarget(this.getTarget())) {
            this.setTarget(findNearestHostileTarget());
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
}
