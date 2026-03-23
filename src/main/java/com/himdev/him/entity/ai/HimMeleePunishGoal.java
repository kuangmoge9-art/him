package com.himdev.him.entity.ai;

import com.himdev.him.entity.HimEntity;
import com.himdev.him.guardian.DivinePunisher;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;

public final class HimMeleePunishGoal extends MeleeAttackGoal {
    private final HimAttackSelector selector;
    private final DivinePunisher punisher = new DivinePunisher();

    public HimMeleePunishGoal(HimEntity him, HimAttackSelector selector) {
        super(him, 1.2D, true);
        this.selector = selector;
    }

    @Override
    public boolean canUse() {
        return selector.shouldUseMelee() && super.canUse();
    }

    @Override
    public boolean canContinueToUse() {
        return selector.shouldUseMelee() && super.canContinueToUse();
    }

    @Override
    protected void checkAndPerformAttack(LivingEntity target, double adjustedDistance) {
        if (adjustedDistance > this.getAttackReachSqr(target) || !this.isTimeToAttack()) {
            return;
        }

        this.resetAttackCooldown();
        if (this.mob.level() instanceof ServerLevel serverLevel) {
            punisher.punish(serverLevel, target);
        }
    }
}
