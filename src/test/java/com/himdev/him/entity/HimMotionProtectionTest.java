package com.himdev.him.entity;

import net.minecraft.world.phys.Vec3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HimMotionProtectionTest {
    @Test
    void blocksUnauthorizedNonZeroDeltaMovement() {
        assertTrue(HimMotionProtection.shouldBlockExternalDeltaMovement(false, new Vec3(0.0D, 1.0D, 0.0D)));
        assertTrue(HimMotionProtection.shouldBlockExternalDeltaMovement(false, new Vec3(0.25D, 0.0D, 0.0D)));
    }

    @Test
    void allowsAuthorizedAndZeroDeltaMovement() {
        assertFalse(HimMotionProtection.shouldBlockExternalDeltaMovement(true, new Vec3(1.0D, 2.0D, 3.0D)));
        assertFalse(HimMotionProtection.shouldBlockExternalDeltaMovement(false, Vec3.ZERO));
    }

    @Test
    void sanitizesNonFiniteDeltaMovementToZero() {
        assertEquals(Vec3.ZERO, HimMotionProtection.sanitizeDeltaMovement(new Vec3(Double.NaN, 0.0D, 0.0D)));
        assertEquals(Vec3.ZERO, HimMotionProtection.sanitizeDeltaMovement(new Vec3(0.0D, Double.POSITIVE_INFINITY, 0.0D)));
    }
}
