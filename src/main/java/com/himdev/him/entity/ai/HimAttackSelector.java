package com.himdev.him.entity.ai;

import com.himdev.him.entity.HimEntity;
import net.minecraft.world.entity.LivingEntity;

public final class HimAttackSelector {
    private static final double MELEE_RANGE_SQR = 9.0D;

    private final HimEntity him;

    public HimAttackSelector(HimEntity him) {
        this.him = him;
    }

    public LivingEntity currentTarget() {
        return him.getTarget();
    }

    public boolean hasTarget() {
        return currentTarget() != null;
    }

    public boolean shouldUseRanged() {
        LivingEntity target = currentTarget();
        return target != null && him.distanceToSqr(target) > MELEE_RANGE_SQR;
    }

    public boolean shouldUseMelee() {
        LivingEntity target = currentTarget();
        return target != null && him.distanceToSqr(target) <= MELEE_RANGE_SQR;
    }
}
