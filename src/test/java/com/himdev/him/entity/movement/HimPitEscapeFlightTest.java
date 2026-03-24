package com.himdev.him.entity.movement;

import net.minecraft.world.phys.Vec3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HimPitEscapeFlightTest {
    @Test
    void nextStepRisesStraightUpUntilCruiseHeight() {
        Vec3 current = new Vec3(0.5D, -6.0D, 0.5D);
        Vec3 landing = new Vec3(2.5D, 0.0D, 0.5D);

        Vec3 next = HimPitEscapeFlight.nextStepForPath(current, landing, 1.0D, 0.6D);

        assertEquals(current.x, next.x, 1.0E-9D);
        assertEquals(current.z, next.z, 1.0E-9D);
        assertEquals(-5.4D, next.y, 1.0E-9D);
    }

    @Test
    void nextStepCruisesHorizontallyAfterClearingPitMouth() {
        Vec3 current = new Vec3(0.5D, 1.0D, 0.5D);
        Vec3 landing = new Vec3(2.5D, 0.0D, 1.5D);

        Vec3 next = HimPitEscapeFlight.nextStepForPath(current, landing, 1.0D, 0.6D);

        assertEquals(0.5D + (0.6D * 2.0D / Math.sqrt(5.0D)), next.x, 1.0E-9D);
        assertEquals(1.0D, next.y, 1.0E-9D);
        assertEquals(0.5D + (0.6D * 1.0D / Math.sqrt(5.0D)), next.z, 1.0E-9D);
    }

    @Test
    void nextStepDescendsOnlyAfterHorizontalAlignment() {
        Vec3 current = new Vec3(2.5D, 1.0D, 1.5D);
        Vec3 landing = new Vec3(2.5D, 0.0D, 1.5D);

        Vec3 next = HimPitEscapeFlight.nextStepForPath(current, landing, 1.0D, 0.6D);

        assertEquals(2.5D, next.x, 1.0E-9D);
        assertEquals(0.4D, next.y, 1.0E-9D);
        assertEquals(1.5D, next.z, 1.0E-9D);
    }
}
