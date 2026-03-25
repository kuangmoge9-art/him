package com.himdev.him.entity.movement;

import net.minecraft.world.phys.Vec3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HimPitEscapeFlightTest {
    @Test
    void flightPhaseNeverLeavesDescentOnceDescentStarts() {
        HimPitEscapeFlight.FlightPhase nextPhase = HimPitEscapeFlight.nextPhaseForPath(
                new Vec3(2.4D, 1.0D, 1.5D),
                new Vec3(2.5D, 0.0D, 1.5D),
                1.5D,
                HimPitEscapeFlight.FlightPhase.DESCENT
        );

        assertEquals(HimPitEscapeFlight.FlightPhase.DESCENT, nextPhase);
    }

    @Test
    void cruisePathIsOnlyUsedForOpenPitEscapes() {
        assertEquals(true, HimPitEscapeFlight.shouldUseCruisePath(true, true));
        assertEquals(false, HimPitEscapeFlight.shouldUseCruisePath(true, false));
        assertEquals(false, HimPitEscapeFlight.shouldUseCruisePath(false, true));
    }

    @Test
    void nextStepRisesStraightUpUntilCruiseHeight() {
        Vec3 current = new Vec3(0.5D, -6.0D, 0.5D);
        Vec3 landing = new Vec3(2.5D, 0.0D, 0.5D);

        Vec3 next = HimPitEscapeFlight.nextStepForPhasedPath(current, landing, 1.5D, 0.8D, 0.45D, 0.5D);

        assertEquals(current.x, next.x, 1.0E-9D);
        assertEquals(current.z, next.z, 1.0E-9D);
        assertEquals(-5.2D, next.y, 1.0E-9D);
    }

    @Test
    void nextStepCruisesHorizontallyAfterClearingPitMouth() {
        Vec3 current = new Vec3(0.5D, 1.5D, 0.5D);
        Vec3 landing = new Vec3(2.5D, 0.0D, 1.5D);

        Vec3 next = HimPitEscapeFlight.nextStepForPhasedPath(current, landing, 1.5D, 0.8D, 0.45D, 0.5D);

        assertEquals(0.5D + (0.45D * 2.0D / Math.sqrt(5.0D)), next.x, 1.0E-9D);
        assertEquals(1.5D, next.y, 1.0E-9D);
        assertEquals(0.5D + (0.45D * 1.0D / Math.sqrt(5.0D)), next.z, 1.0E-9D);
    }

    @Test
    void nextStepDescendsOnlyAfterHorizontalAlignment() {
        Vec3 current = new Vec3(2.5D, 1.5D, 1.5D);
        Vec3 landing = new Vec3(2.5D, 0.0D, 1.5D);

        Vec3 next = HimPitEscapeFlight.nextStepForPhasedPath(current, landing, 1.5D, 0.8D, 0.45D, 0.5D);

        assertEquals(2.5D, next.x, 1.0E-9D);
        assertEquals(1.0D, next.y, 1.0E-9D);
        assertEquals(1.5D, next.z, 1.0E-9D);
    }

    @Test
    void nextStepContinuesDescendingAtFullSpeedWhileStillHighAboveGround() {
        Vec3 current = new Vec3(2.5D, 1.0D, 1.5D);
        Vec3 landing = new Vec3(2.5D, 0.0D, 1.5D);

        Vec3 next = HimPitEscapeFlight.nextStepForPhase(
                current,
                landing,
                1.5D,
                HimPitEscapeFlight.FlightPhase.DESCENT,
                0.8D,
                0.45D,
                0.5D
        );

        assertEquals(2.5D, next.x, 1.0E-9D);
        assertEquals(0.5D, next.y, 1.0E-9D);
        assertEquals(1.5D, next.z, 1.0E-9D);
    }

    @Test
    void nextStepSlowsDescentAsItApproachesGround() {
        Vec3 current = new Vec3(2.3D, 0.6D, 1.5D);
        Vec3 landing = new Vec3(2.5D, 0.0D, 1.5D);

        Vec3 next = HimPitEscapeFlight.nextStepForPhase(
                current,
                landing,
                1.5D,
                HimPitEscapeFlight.FlightPhase.DESCENT,
                0.8D,
                0.45D,
                0.5D
        );

        assertEquals(2.42D, next.x, 1.0E-9D);
        assertEquals(0.24D, next.y, 1.0E-9D);
        assertEquals(landing.z, next.z, 1.0E-9D);
    }

    @Test
    void nextStepStillSnapsToLandingWhenAlreadyVeryCloseToGround() {
        Vec3 current = new Vec3(2.5D, 0.08D, 1.5D);
        Vec3 landing = new Vec3(2.5D, 0.0D, 1.5D);

        Vec3 next = HimPitEscapeFlight.nextStepForPhase(
                current,
                landing,
                1.5D,
                HimPitEscapeFlight.FlightPhase.DESCENT,
                0.8D,
                0.45D,
                0.5D
        );

        assertEquals(landing.x, next.x, 1.0E-9D);
        assertEquals(landing.y, next.y, 1.0E-9D);
        assertEquals(landing.z, next.z, 1.0E-9D);
    }
}
