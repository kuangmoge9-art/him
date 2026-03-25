package com.himdev.him.gametest;

import com.himdev.him.entity.HimEntity;
import com.himdev.him.entity.HimRemovalAuthorizer;
import com.himdev.him.world.HimLocator;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.UUID;
import java.util.stream.StreamSupport;

public final class HimTestState {
    private HimTestState() {
    }

    public static void resetUniqueHim(GameTestHelper helper) {
        ServerLevel level = helper.getLevel();
        List<HimEntity> existingHim = StreamSupport.stream(level.getAllEntities().spliterator(), false)
                .filter(HimEntity.class::isInstance)
                .map(HimEntity.class::cast)
                .toList();

        existingHim.forEach(entity -> {
            HimRemovalAuthorizer.authorize(entity.getUUID());
            entity.remove(Entity.RemovalReason.DISCARDED);
        });

        UUID currentHimId = HimLocator.currentHimId(level);
        if (currentHimId != null) {
            HimLocator.clear(level, currentHimId);
        }
        HimLocator.clearFirstJoinSpawnTriggered(level);
    }

    public static void removeHimForTest(GameTestHelper helper, HimEntity him) {
        HimRemovalAuthorizer.authorize(him.getUUID());
        him.remove(Entity.RemovalReason.DISCARDED);
        UUID currentHimId = HimLocator.currentHimId(helper.getLevel());
        if (currentHimId != null) {
            HimLocator.clear(helper.getLevel(), currentHimId);
        }
    }

    public static void buildTightObstruction(GameTestHelper helper, BlockPos origin) {
        ServerLevel level = helper.getLevel();
        surroundWithSolidShell(level, origin, false);
    }

    public static void buildFluidCell(GameTestHelper helper, BlockPos origin) {
        ServerLevel level = helper.getLevel();
        surroundWithSolidShell(level, origin, true);
    }

    public static BlockPos buildDeepEscapePit(GameTestHelper helper, BlockPos origin) {
        ServerLevel level = helper.getLevel();
        buildPitPlatform(level, origin, 4, 4);

        for (int dx = -1; dx <= 1; dx++) {
            for (int dz = -1; dz <= 1; dz++) {
                level.setBlockAndUpdate(origin.offset(dx, -7, dz), Blocks.STONE.defaultBlockState());
            }
        }

        for (int dy = -7; dy <= 6; dy++) {
            level.setBlockAndUpdate(origin.offset(0, dy, 0), Blocks.AIR.defaultBlockState());
        }

        for (int dx = -1; dx <= 1; dx++) {
            for (int dz = -1; dz <= 1; dz++) {
                if (dx == 0 && dz == 0) {
                    continue;
                }
                for (int dy = -6; dy <= -1; dy++) {
                    level.setBlockAndUpdate(origin.offset(dx, dy, dz), Blocks.STONE.defaultBlockState());
                }
            }
        }

        clearAir(level, origin, 2, 6);
        return origin.offset(2, 0, 0);
    }

    public static BlockPos buildOffsetEscapePit(GameTestHelper helper, BlockPos origin) {
        ServerLevel level = helper.getLevel();
        buildDeepEscapePit(helper, origin);

        for (int dy = -2; dy <= 3; dy++) {
            level.setBlockAndUpdate(origin.offset(0, dy, 0), Blocks.STONE.defaultBlockState());
            level.setBlockAndUpdate(origin.offset(1, dy, 0), Blocks.AIR.defaultBlockState());
            level.setBlockAndUpdate(origin.offset(1, dy, 1), Blocks.AIR.defaultBlockState());
        }

        for (int dy = -2; dy <= 1; dy++) {
            level.setBlockAndUpdate(origin.offset(2, dy, 1), Blocks.AIR.defaultBlockState());
        }

        clearAir(level, origin.offset(1, 0, 1), 2, 5);
        return origin.offset(2, 0, 1);
    }

    public static BlockPos buildShallowVoidPit(GameTestHelper helper, BlockPos origin) {
        ServerLevel level = helper.getLevel();
        int minBuildHeight = level.getMinBuildHeight();

        for (int dx = -1; dx <= 1; dx++) {
            for (int dz = -1; dz <= 1; dz++) {
                BlockPos lower = new BlockPos(origin.getX() + dx, minBuildHeight, origin.getZ() + dz);
                BlockPos upper = lower.above();
                boolean isCenter = dx == 0 && dz == 0;

                level.setBlockAndUpdate(lower, (isCenter ? Blocks.AIR : Blocks.STONE).defaultBlockState());
                level.setBlockAndUpdate(upper, (isCenter ? Blocks.AIR : Blocks.STONE).defaultBlockState());

                for (int dy = 2; dy <= 10; dy++) {
                    level.setBlockAndUpdate(lower.above(dy), Blocks.AIR.defaultBlockState());
                }
            }
        }

        return new BlockPos(origin.getX() + 1, minBuildHeight + 2, origin.getZ());
    }

    public static void buildAwkwardPursuitCourse(GameTestHelper helper, BlockPos origin) {
        ServerLevel level = helper.getLevel();
        for (int y = 0; y <= 2; y++) {
            for (int z = -3; z <= 3; z++) {
                level.setBlockAndUpdate(origin.offset(1, y, z), Blocks.STONE.defaultBlockState());
            }
        }
        for (int y = 0; y <= 2; y++) {
            level.setBlockAndUpdate(origin.offset(2, y, -1), Blocks.STONE.defaultBlockState());
            level.setBlockAndUpdate(origin.offset(2, y, 1), Blocks.STONE.defaultBlockState());
        }
        level.setBlockAndUpdate(origin.offset(2, 0, 0), Blocks.AIR.defaultBlockState());
        level.setBlockAndUpdate(origin.offset(2, 1, 0), Blocks.AIR.defaultBlockState());
        level.setBlockAndUpdate(origin.offset(2, 2, 0), Blocks.AIR.defaultBlockState());
    }

    public static void buildObservationArena(GameTestHelper helper, BlockPos origin) {
        ServerLevel level = helper.getLevel();
        for (int dx = -6; dx <= 8; dx++) {
            for (int dz = -6; dz <= 6; dz++) {
                level.setBlockAndUpdate(origin.offset(dx, -1, dz), Blocks.STONE.defaultBlockState());
                for (int dy = 0; dy <= 7; dy++) {
                    level.setBlockAndUpdate(origin.offset(dx, dy, dz), Blocks.AIR.defaultBlockState());
                }
            }
        }

        for (int dy = 0; dy <= 4; dy++) {
            level.setBlockAndUpdate(origin.offset(4, dy, 0), Blocks.STONE.defaultBlockState());
        }
        for (int dx = 3; dx <= 5; dx++) {
            for (int dz = -1; dz <= 1; dz++) {
                level.setBlockAndUpdate(origin.offset(dx, 4, dz), Blocks.STONE.defaultBlockState());
            }
        }
        for (int dx = 2; dx <= 6; dx++) {
            for (int dz = -2; dz <= 2; dz++) {
                level.setBlockAndUpdate(origin.offset(dx, 5, dz), Blocks.AIR.defaultBlockState());
            }
        }
    }

    private static void surroundWithSolidShell(ServerLevel level, BlockPos origin, boolean fillWithWater) {
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = 0; dy <= 2; dy++) {
                for (int dz = -1; dz <= 1; dz++) {
                    BlockPos current = origin.offset(dx, dy, dz);
                    boolean isCenter = dx == 0 && dz == 0 && (dy == 0 || dy == 1);
                    if (isCenter) {
                        level.setBlockAndUpdate(current, (fillWithWater ? Blocks.WATER : Blocks.AIR).defaultBlockState());
                    } else {
                        level.setBlockAndUpdate(current, Blocks.STONE.defaultBlockState());
                    }
                }
            }
        }
        level.setBlockAndUpdate(origin.above(3), Blocks.AIR.defaultBlockState());
    }

    private static void buildPitPlatform(ServerLevel level, BlockPos origin, int horizontalRadius, int verticalClearance) {
        for (int dx = -horizontalRadius; dx <= horizontalRadius; dx++) {
            for (int dz = -horizontalRadius; dz <= horizontalRadius; dz++) {
                level.setBlockAndUpdate(origin.offset(dx, -1, dz), Blocks.STONE.defaultBlockState());
            }
        }
        clearAir(level, origin, horizontalRadius, verticalClearance);
    }

    private static void clearAir(ServerLevel level, BlockPos origin, int horizontalRadius, int height) {
        for (int dx = -horizontalRadius; dx <= horizontalRadius; dx++) {
            for (int dz = -horizontalRadius; dz <= horizontalRadius; dz++) {
                for (int dy = 0; dy <= height; dy++) {
                    level.setBlockAndUpdate(origin.offset(dx, dy, dz), Blocks.AIR.defaultBlockState());
                }
            }
        }
    }
}
