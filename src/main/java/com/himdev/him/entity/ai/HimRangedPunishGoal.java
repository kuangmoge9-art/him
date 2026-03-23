package com.himdev.him.entity.ai;

import com.himdev.him.entity.HimEntity;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;

public final class HimRangedPunishGoal extends RangedAttackGoal {
    private final HimAttackSelector selector;

    public HimRangedPunishGoal(HimEntity him, HimAttackSelector selector) {
        super(him, 1.1D, 20, 24.0F);
        this.selector = selector;
    }

    @Override
    public boolean canUse() {
        return selector.shouldUseRanged() && super.canUse();
    }

    @Override
    public boolean canContinueToUse() {
        return selector.shouldUseRanged() && super.canContinueToUse();
    }
}
