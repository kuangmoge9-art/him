package com.himdev.him.guardian;

import com.himdev.him.entity.HimEntity;
import com.himdev.him.world.HimLocator;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.List;
import java.util.UUID;

public final class HimRescueExecutionController {
    private static final double MAX_GRAB_WIDTH = 1.4D;
    private static final double MAX_GRAB_HEIGHT = 2.4D;
    private static final int HOLD_TICKS = 15;
    private static final double FORWARD_OFFSET = 0.85D;
    private static final int[] VERTICAL_OFFSETS = new int[] {0, 1, -1};
    private final DivinePunisher punisher;

    public HimRescueExecutionController(DivinePunisher punisher) {
        this.punisher = punisher;
    }

    public void executeOrFallback(ServerLevel level, UUID targetId) {
        Entity target = level.getEntity(targetId);
        HimEntity him = HimLocator.activeHim(level);
        if (!(target instanceof LivingEntity living)) {
            punisher.punish(level, targetId);
            return;
        }
        if (him == null) {
            punisher.punish(level, targetId);
            return;
        }
        if (!canUseGrabExecution(living)) {
            punisher.punish(level, targetId);
            return;
        }
        if (!tryStart(level, him, living)) {
            punisher.punish(level, targetId);
            return;
        }
    }

    public boolean canUseGrabExecution(LivingEntity target) {
        return target instanceof Enemy
                && !(target instanceof HimEntity)
                && !(target instanceof net.minecraft.world.entity.player.Player)
                && target.isAlive()
                && target.getBbWidth() <= MAX_GRAB_WIDTH
                && target.getBbHeight() <= MAX_GRAB_HEIGHT;
    }

    private boolean tryStart(ServerLevel level, HimEntity him, LivingEntity target) {
        Vec3 stagingPoint = findStagingPoint(level, him, target);
        return stagingPoint != null && him.startRescueExecution(target, stagingPoint, HOLD_TICKS);
    }

    private Vec3 findStagingPoint(ServerLevel level, HimEntity him, LivingEntity target) {
        Vec3 forward = horizontalForward(target);
        Vec3 lateral = new Vec3(-forward.z, 0.0D, forward.x);
        List<Vec3> offsets = List.of(
                forward.scale(-FORWARD_OFFSET),
                forward.scale(-FORWARD_OFFSET).add(lateral.scale(0.6D)),
                forward.scale(-FORWARD_OFFSET).add(lateral.scale(-0.6D))
        );

        for (Vec3 offset : offsets) {
            Vec3 candidate = target.position().add(offset.x, 0.0D, offset.z);
            Vec3 safePoint = findSafeFeetPosition(level, him, candidate, target.getY());
            if (safePoint != null) {
                return safePoint;
            }
        }

        return null;
    }

    private Vec3 horizontalForward(LivingEntity target) {
        Vec3 look = target.getLookAngle();
        Vec3 horizontal = new Vec3(look.x, 0.0D, look.z);
        if (horizontal.lengthSqr() < 1.0E-4D) {
            float radians = (float) Math.toRadians(target.getYRot());
            horizontal = new Vec3(-Math.sin(radians), 0.0D, Math.cos(radians));
        }
        return horizontal.normalize();
    }

    private Vec3 findSafeFeetPosition(ServerLevel level, HimEntity him, Vec3 candidate, double preferredY) {
        BlockPos baseFeet = BlockPos.containing(candidate.x, preferredY, candidate.z);
        for (int dy : VERTICAL_OFFSETS) {
            BlockPos feet = baseFeet.above(dy);
            if (isSafeForHim(level, him, feet)) {
                return new Vec3(feet.getX() + 0.5D, feet.getY(), feet.getZ() + 0.5D);
            }
        }
        return null;
    }

    private boolean isSafeForHim(ServerLevel level, HimEntity him, BlockPos feet) {
        BlockPos head = feet.above();
        BlockPos floor = feet.below();
        BlockState feetState = level.getBlockState(feet);
        BlockState headState = level.getBlockState(head);
        BlockState floorState = level.getBlockState(floor);
        if (!canOccupy(feetState) || !canOccupy(headState)) {
            return false;
        }
        if (feetState.liquid() || headState.liquid() || floorState.isAir() || floorState.liquid()) {
            return false;
        }

        AABB candidateBox = him.getBoundingBox().move(
                (feet.getX() + 0.5D) - him.getX(),
                feet.getY() - him.getY(),
                (feet.getZ() + 0.5D) - him.getZ()
        );
        return level.noCollision(him, candidateBox);
    }

    private boolean canOccupy(BlockState state) {
        return state.isAir() || state.canBeReplaced();
    }
}
