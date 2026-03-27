package com.himdev.him.guardian;

import net.minecraft.world.phys.Vec3;

import java.util.List;

final class HimRescueExecutionGeometry {
    private static final double FORWARD_OFFSET = 0.85D;

    private HimRescueExecutionGeometry() {
    }

    static List<Vec3> stagingOffsets(Vec3 forward) {
        Vec3 lateral = new Vec3(-forward.z, 0.0D, forward.x);
        return List.of(
                forward.scale(FORWARD_OFFSET),
                forward.scale(FORWARD_OFFSET).add(lateral.scale(0.6D)),
                forward.scale(FORWARD_OFFSET).add(lateral.scale(-0.6D))
        );
    }
}
