package com.himdev.him.spawn;

import net.minecraft.world.phys.Vec3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstJoinHimSpawnPlacementTest {
    @Test
    void resolvesPositionBehindSouthFacingPlayer() {
        Vec3 behind = FirstJoinHimSpawnPlacement.positionBehind(new Vec3(0.5D, 64.0D, 0.5D), 0.0F, 2.0D);

        assertEquals(0.5D, behind.x, 1.0E-6D);
        assertEquals(64.0D, behind.y, 1.0E-6D);
        assertEquals(-1.5D, behind.z, 1.0E-6D);
    }

    @Test
    void resolvesPositionBehindWestFacingPlayer() {
        Vec3 behind = FirstJoinHimSpawnPlacement.positionBehind(new Vec3(0.5D, 64.0D, 0.5D), 90.0F, 2.0D);

        assertEquals(2.5D, behind.x, 1.0E-6D);
        assertEquals(64.0D, behind.y, 1.0E-6D);
        assertEquals(0.5D, behind.z, 1.0E-6D);
    }
}
