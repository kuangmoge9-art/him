package com.himdev.him.entity;

import net.minecraft.world.phys.Vec3;

public final class HimMotionProtection {
    private static final double MOTION_EPSILON = 1.0E-7D;

    private HimMotionProtection() {
    }

    public static boolean shouldBlockExternalDeltaMovement(boolean authorized, Vec3 deltaMovement) {
        return !authorized && deltaMovement.lengthSqr() > MOTION_EPSILON;
    }

    public static Vec3 sanitizeDeltaMovement(Vec3 deltaMovement) {
        if (!Double.isFinite(deltaMovement.x) || !Double.isFinite(deltaMovement.y) || !Double.isFinite(deltaMovement.z)) {
            return Vec3.ZERO;
        }
        return deltaMovement;
    }
}
