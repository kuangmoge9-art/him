package com.himdev.him.entity.movement;

import com.himdev.him.entity.HimEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class HimEnvironmentDominance {
    private static final Vec3[] LOCAL_ESCAPE_OFFSETS = new Vec3[] {
            new Vec3(2.0D, 0.0D, 0.0D),
            new Vec3(-2.0D, 0.0D, 0.0D),
            new Vec3(0.0D, 0.0D, 2.0D),
            new Vec3(0.0D, 0.0D, -2.0D),
            new Vec3(2.0D, 1.0D, 0.0D),
            new Vec3(-2.0D, 1.0D, 0.0D),
            new Vec3(0.0D, 1.0D, 2.0D),
            new Vec3(0.0D, 1.0D, -2.0D),
            new Vec3(0.0D, 2.0D, 0.0D)
    };
    public boolean applyIfNeeded(HimEntity him, HimEnvironmentPressureTracker tracker) {
        if (!(him.level() instanceof ServerLevel serverLevel)) {
            return false;
        }

        LivingEntity target = him.getTarget();
        if (target != null && target.isAlive()) {
            double distanceSqr = him.distanceToSqr(target);
            boolean lineBlocked = !him.hasLineOfSight(target);
            boolean divineBypass = tracker.isPersistentlyObstructed()
                    || (tracker.isPursuitStalled() && lineBlocked)
                    || (lineBlocked && distanceSqr <= 36.0D);
            if (divineBypass) {
                him.performRangedAttack(target, 1.0F);
                tracker.resetAfterCorrection(him);
                return true;
            }
        }

        if ((target == null || !target.isAlive()) && (tracker.isPersistentlyObstructed() || tracker.isPersistentlyInFluid())) {
            if (escapeNearby(serverLevel, him)) {
                tracker.resetAfterCorrection(him);
                return true;
            }
        }

        return false;
    }

    private boolean escapeNearby(ServerLevel level, HimEntity him) {
        for (Vec3 offset : LOCAL_ESCAPE_OFFSETS) {
            Vec3 candidate = him.position().add(offset);
            if (tryRelocate(level, him, candidate, him.getTarget())) {
                return true;
            }
        }

        Vec3 elevatedCandidate = him.position().add(0.0D, 3.0D, 0.0D);
        boolean relocated = tryRelocate(level, him, elevatedCandidate, him.getTarget());
        return relocated;
    }

    private boolean tryRelocate(ServerLevel level, HimEntity him, Vec3 anchor, LivingEntity lookTarget) {
        for (int yOffset = 0; yOffset <= 2; yOffset++) {
            BlockPos floor = BlockPos.containing(anchor.x, anchor.y + yOffset, anchor.z);
            Vec3 candidate = new Vec3(floor.getX() + 0.5D, floor.getY(), floor.getZ() + 0.5D);
            if (candidate.distanceToSqr(him.position()) < 1.0D) {
                continue;
            }
            if (!isSafeForHim(level, him, candidate)) {
                continue;
            }

            him.getNavigation().stop();
            him.setDeltaMovement(Vec3.ZERO);
            float yaw = lookTarget != null ? him.getYRot() : him.getYRot();
            if (lookTarget != null) {
                Vec3 delta = lookTarget.position().subtract(candidate);
                yaw = (float) (Math.toDegrees(Math.atan2(-delta.x, delta.z)));
            }
            him.moveTo(candidate.x, candidate.y, candidate.z, yaw, him.getXRot());
            him.setYHeadRot(yaw);
            him.yBodyRot = yaw;
            return true;
        }
        return false;
    }

    private boolean isSafeForHim(ServerLevel level, HimEntity him, Vec3 candidate) {
        BlockPos feet = BlockPos.containing(candidate.x, candidate.y, candidate.z);
        BlockPos head = feet.above();
        BlockPos floor = feet.below();

        BlockState feetState = level.getBlockState(feet);
        BlockState headState = level.getBlockState(head);
        BlockState floorState = level.getBlockState(floor);
        if (!feetState.canBeReplaced() && !feetState.isAir()) {
            return false;
        }
        if (!headState.canBeReplaced() && !headState.isAir()) {
            return false;
        }
        if (feetState.liquid() || headState.liquid()) {
            return false;
        }
        if (floorState.isAir() || floorState.liquid()) {
            return false;
        }

        AABB candidateBox = him.getBoundingBox().move(
                candidate.x - him.getX(),
                candidate.y - him.getY(),
                candidate.z - him.getZ()
        );
        return level.noCollision(him, candidateBox);
    }
}
