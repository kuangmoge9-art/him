package com.himdev.him.spawn;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public final class FirstJoinHimSpawnPlacement {
    private static final double DEFAULT_BEHIND_DISTANCE = 2.0D;
    private static final BlockPos[] SEARCH_OFFSETS = new BlockPos[] {
            BlockPos.ZERO,
            new BlockPos(0, 1, 0),
            new BlockPos(1, 0, 0),
            new BlockPos(-1, 0, 0),
            new BlockPos(0, 0, 1),
            new BlockPos(0, 0, -1),
            new BlockPos(1, 1, 0),
            new BlockPos(-1, 1, 0),
            new BlockPos(0, 1, 1),
            new BlockPos(0, 1, -1)
    };

    private FirstJoinHimSpawnPlacement() {
    }

    public static Vec3 resolve(ServerLevel level, Player player, Entity entity) {
        Vec3 desired = positionBehind(player.position(), player.getYRot(), DEFAULT_BEHIND_DISTANCE);
        BlockPos desiredFeet = BlockPos.containing(desired.x, player.getY(), desired.z);

        for (BlockPos offset : SEARCH_OFFSETS) {
            BlockPos candidateFeet = desiredFeet.offset(offset);
            if (isSafe(level, entity, candidateFeet)) {
                return center(candidateFeet);
            }
        }

        BlockPos playerFeet = player.blockPosition();
        return new Vec3(playerFeet.getX() + 0.5D, playerFeet.getY(), playerFeet.getZ() + 0.5D);
    }

    public static Vec3 positionBehind(Vec3 playerBase, float yawDegrees, double distance) {
        float radians = yawDegrees * Mth.DEG_TO_RAD;
        double x = playerBase.x + Mth.sin(radians) * distance;
        double z = playerBase.z - Mth.cos(radians) * distance;
        return new Vec3(x, playerBase.y, z);
    }

    private static boolean isSafe(ServerLevel level, Entity entity, BlockPos feet) {
        BlockState feetState = level.getBlockState(feet);
        BlockState headState = level.getBlockState(feet.above());
        BlockState floorState = level.getBlockState(feet.below());
        if (!canOccupy(feetState) || !canOccupy(headState)) {
            return false;
        }
        if (floorState.isAir() || floorState.liquid()) {
            return false;
        }

        Vec3 centered = center(feet);
        entity.moveTo(centered.x, centered.y, centered.z, entity.getYRot(), entity.getXRot());
        return level.noCollision(entity);
    }

    private static boolean canOccupy(BlockState state) {
        return (state.isAir() || state.canBeReplaced()) && !state.liquid();
    }

    private static Vec3 center(BlockPos feet) {
        return new Vec3(feet.getX() + 0.5D, feet.getY(), feet.getZ() + 0.5D);
    }
}
