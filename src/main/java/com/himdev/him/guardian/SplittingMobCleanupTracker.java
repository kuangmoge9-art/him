package com.himdev.him.guardian;

import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.level.Level;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class SplittingMobCleanupTracker {
    private static final long CLEANUP_WINDOW_TICKS = 20L;
    private static final List<PendingSplitCleanup> PENDING = new ArrayList<>();

    private SplittingMobCleanupTracker() {
    }

    static void track(ServerLevel level, Slime slime) {
        if (slime.getSize() <= 1) {
            return;
        }

        prune(level);
        PENDING.add(new PendingSplitCleanup(
                level.dimension(),
                slime.getType(),
                slime.getX(),
                slime.getY() + 0.5D,
                slime.getZ(),
                Math.max(2.0D, slime.getBbWidth() * 3.0D),
                level.getGameTime() + CLEANUP_WINDOW_TICKS
        ));
    }

    static boolean shouldPunish(ServerLevel level, Slime slime) {
        prune(level);
        for (PendingSplitCleanup pending : PENDING) {
            if (pending.matches(level, slime)) {
                return true;
            }
        }
        return false;
    }

    private static void prune(ServerLevel level) {
        long gameTime = level.getGameTime();
        Iterator<PendingSplitCleanup> iterator = PENDING.iterator();
        while (iterator.hasNext()) {
            PendingSplitCleanup pending = iterator.next();
            if (pending.expiresAtTick < gameTime) {
                iterator.remove();
            }
        }
    }

    private record PendingSplitCleanup(
            ResourceKey<Level> dimension,
            EntityType<?> entityType,
            double x,
            double y,
            double z,
            double radius,
            long expiresAtTick
    ) {
        private boolean matches(ServerLevel level, Slime slime) {
            return dimension.equals(level.dimension())
                    && entityType == slime.getType()
                    && slime.distanceToSqr(x, y, z) <= radius * radius;
        }
    }
}
