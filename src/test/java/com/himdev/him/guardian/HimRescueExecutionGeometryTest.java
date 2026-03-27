package com.himdev.him.guardian;

import net.minecraft.world.phys.Vec3;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

final class HimRescueExecutionGeometryTest {
    @Test
    void stagingOffsetsKeepHimInFrontOfTheHostile() {
        Vec3 forward = new Vec3(0.0D, 0.0D, 1.0D);

        List<Vec3> offsets = HimRescueExecutionGeometry.stagingOffsets(forward);

        assertFalse(offsets.isEmpty(), "Expected rescue execution to provide staging offsets");
        assertTrue(
                offsets.stream().allMatch(offset -> offset.x * forward.x + offset.z * forward.z > 0.0D),
                "Expected every staging offset to stay in front of the hostile"
        );
    }
}
