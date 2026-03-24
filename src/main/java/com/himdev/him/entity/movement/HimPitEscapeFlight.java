package com.himdev.him.entity.movement;

import com.himdev.him.entity.HimEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public final class HimPitEscapeFlight {
    private static final int SEARCH_RADIUS = 4;
    private static final int SEARCH_HEIGHT = 12;
    private static final int CRUISE_HEIGHT_SEARCH_STEPS = 6;
    private static final double MIN_ASCENT_TO_ESCAPE = 0.5D;
    private static final int PIT_WALL_THRESHOLD = 2;
    private static final int SAFE_LANDING_MAX_BLOCKED_SIDES = 1;
    private static final double DIRECT_FLIGHT_SPEED = 0.6D;
    private static final double ASCENT_SPEED = 0.8D;
    private static final double CRUISE_SPEED = 0.45D;
    private static final double DESCENT_SPEED = 0.5D;
    private static final double CRUISE_HEIGHT_ABOVE_LANDING = 1.5D;
    private static final double CRUISE_HEIGHT_EPSILON = 0.05D;
    private static final double HORIZONTAL_ALIGNMENT_REACHED_SQR = 0.25D * 0.25D;
    private static final double LANDING_REACHED_SQR = 0.5D * 0.5D;

    public boolean shouldStart(ServerLevel level, HimEntity him, HimEnvironmentPressureTracker tracker, Vec3 landing) {
        if (landing == null || landing.y < him.getY() + MIN_ASCENT_TO_ESCAPE) {
            return false;
        }
        return isPitLikeTrap(level, him) || tracker.isPersistentlyObstructed();
    }

    public Vec3 findEscapeLanding(ServerLevel level, HimEntity him) {
        BlockPos origin = him.blockPosition();
        Vec3 currentPosition = him.position();
        Vec3 bestCandidate = null;
        int bestRise = Integer.MIN_VALUE;
        double bestScore = Double.MAX_VALUE;

        for (int yOffset = 1; yOffset <= SEARCH_HEIGHT; yOffset++) {
            int feetY = origin.getY() + yOffset;
            for (int dx = -SEARCH_RADIUS; dx <= SEARCH_RADIUS; dx++) {
                for (int dz = -SEARCH_RADIUS; dz <= SEARCH_RADIUS; dz++) {
                    BlockPos feet = new BlockPos(origin.getX() + dx, feetY, origin.getZ() + dz);
                    if (!isSafeLanding(level, him, feet)) {
                        continue;
                    }
                    if (!clearlyEscapesCurrentTrap(origin, feet)) {
                        continue;
                    }
                    if (!isReleasedFromTrap(level, feet)) {
                        continue;
                    }

                    Vec3 candidate = new Vec3(feet.getX() + 0.5D, feet.getY(), feet.getZ() + 0.5D);
                    int rise = feet.getY() - origin.getY();
                    double dxScore = candidate.x - currentPosition.x;
                    double dyScore = candidate.y - currentPosition.y;
                    double dzScore = candidate.z - currentPosition.z;
                    double score = (dxScore * dxScore) + (dzScore * dzScore) + (dyScore * dyScore * 0.75D);
                    if (rise > bestRise || (rise == bestRise && score < bestScore)) {
                        bestRise = rise;
                        bestScore = score;
                        bestCandidate = candidate;
                    }
                }
            }
        }

        return bestCandidate;
    }

    public boolean shouldUseCruisePath(ServerLevel level, HimEntity him, Vec3 landing) {
        return shouldUseCruisePath(isPitLikeTrap(level, him), hasClearVerticalAscent(level, him, him.position(), landing.y + CRUISE_HEIGHT_ABOVE_LANDING));
    }

    static boolean shouldUseCruisePath(boolean pitLikeTrap, boolean clearVerticalAscent) {
        return pitLikeTrap && clearVerticalAscent;
    }

    public Vec3 nextStep(ServerLevel level, HimEntity him, Vec3 landing, boolean useCruisePath) {
        Vec3 current = him.position();
        if (!useCruisePath) {
            return directNextStep(current, landing, DIRECT_FLIGHT_SPEED);
        }

        for (int extraHeight = 0; extraHeight <= CRUISE_HEIGHT_SEARCH_STEPS; extraHeight++) {
            double cruiseY = Math.max(current.y, landing.y + CRUISE_HEIGHT_ABOVE_LANDING + extraHeight);
            Vec3 next = nextStepForPhasedPath(current, landing, cruiseY, ASCENT_SPEED, CRUISE_SPEED, DESCENT_SPEED);
            if (isCollisionFree(level, him, next)) {
                return next;
            }
        }
        return current;
    }

    static Vec3 nextStepForPhasedPath(Vec3 current, Vec3 landing, double cruiseY,
                                      double ascentSpeed, double cruiseSpeed, double descentSpeed) {
        Vec3 stageTarget = resolveStageTarget(current, landing, cruiseY);
        Vec3 delta = stageTarget.subtract(current);
        if (delta.lengthSqr() <= LANDING_REACHED_SQR) {
            return stageTarget;
        }

        double speed = movementSpeedForStage(current, landing, cruiseY, ascentSpeed, cruiseSpeed, descentSpeed);
        Vec3 direction = delta.normalize().scale(Math.min(speed, delta.length()));
        return current.add(direction);
    }

    private static Vec3 directNextStep(Vec3 current, Vec3 landing, double speed) {
        Vec3 delta = landing.subtract(current);
        if (delta.lengthSqr() <= LANDING_REACHED_SQR) {
            return landing;
        }

        Vec3 direction = delta.normalize().scale(Math.min(speed, delta.length()));
        return current.add(direction);
    }

    public boolean hasReachedLanding(ServerLevel level, HimEntity him, Vec3 landing) {
        if (landing == null || him.position().distanceToSqr(landing) > LANDING_REACHED_SQR) {
            return false;
        }
        return isSafeLanding(level, him, BlockPos.containing(landing.x, landing.y, landing.z));
    }

    private boolean isPitLikeTrap(ServerLevel level, HimEntity him) {
        return blockedCardinalSides(level, him.blockPosition()) >= PIT_WALL_THRESHOLD;
    }

    private boolean clearlyEscapesCurrentTrap(BlockPos origin, BlockPos candidateFeet) {
        int rise = candidateFeet.getY() - origin.getY();
        int horizontalDistance = Math.abs(candidateFeet.getX() - origin.getX()) + Math.abs(candidateFeet.getZ() - origin.getZ());
        return rise >= 1 || horizontalDistance >= 2;
    }

    private boolean isSafeLanding(ServerLevel level, HimEntity him, BlockPos feet) {
        BlockPos head = feet.above();
        BlockPos floor = feet.below();

        BlockState feetState = level.getBlockState(feet);
        BlockState headState = level.getBlockState(head);
        BlockState floorState = level.getBlockState(floor);
        if (!canOccupy(feetState) || !canOccupy(headState)) {
            return false;
        }
        if (feetState.liquid() || headState.liquid()) {
            return false;
        }
        if (floorState.isAir() || floorState.liquid()) {
            return false;
        }

        Vec3 candidate = new Vec3(feet.getX() + 0.5D, feet.getY(), feet.getZ() + 0.5D);
        AABB candidateBox = him.getBoundingBox().move(
                candidate.x - him.getX(),
                candidate.y - him.getY(),
                candidate.z - him.getZ()
        );
        return level.noCollision(him, candidateBox);
    }

    private static Vec3 resolveStageTarget(Vec3 current, Vec3 landing, double cruiseY) {
        double effectiveCruiseY = Math.max(cruiseY, landing.y);
        double dx = landing.x - current.x;
        double dz = landing.z - current.z;
        boolean horizontallyAligned = (dx * dx) + (dz * dz) <= HORIZONTAL_ALIGNMENT_REACHED_SQR;
        if (!horizontallyAligned && current.y + CRUISE_HEIGHT_EPSILON < effectiveCruiseY) {
            return new Vec3(current.x, effectiveCruiseY, current.z);
        }

        if (!horizontallyAligned) {
            return new Vec3(landing.x, Math.max(current.y, effectiveCruiseY), landing.z);
        }

        return landing;
    }

    private static double movementSpeedForStage(Vec3 current, Vec3 landing, double cruiseY,
                                                double ascentSpeed, double cruiseSpeed, double descentSpeed) {
        double effectiveCruiseY = Math.max(cruiseY, landing.y);
        double dx = landing.x - current.x;
        double dz = landing.z - current.z;
        boolean horizontallyAligned = (dx * dx) + (dz * dz) <= HORIZONTAL_ALIGNMENT_REACHED_SQR;
        if (!horizontallyAligned && current.y + CRUISE_HEIGHT_EPSILON < effectiveCruiseY) {
            return ascentSpeed;
        }

        if (!horizontallyAligned) {
            return cruiseSpeed;
        }

        return descentSpeed;
    }

    private boolean isCollisionFree(ServerLevel level, HimEntity him, Vec3 next) {
        Vec3 current = him.position();
        AABB nextBox = him.getBoundingBox().move(
                next.x - current.x,
                next.y - current.y,
                next.z - current.z
        );
        return level.noCollision(him, nextBox);
    }

    private boolean hasClearVerticalAscent(ServerLevel level, HimEntity him, Vec3 current, double targetY) {
        double sampleY = current.y;
        double requiredY = Math.max(current.y, targetY);
        while (sampleY + CRUISE_HEIGHT_EPSILON < requiredY) {
            sampleY = Math.min(requiredY, sampleY + ASCENT_SPEED);
            if (!isCollisionFree(level, him, new Vec3(current.x, sampleY, current.z))) {
                return false;
            }
        }
        return true;
    }

    private boolean isReleasedFromTrap(ServerLevel level, BlockPos feet) {
        return blockedCardinalSides(level, feet) <= SAFE_LANDING_MAX_BLOCKED_SIDES;
    }

    private int blockedCardinalSides(ServerLevel level, BlockPos feet) {
        BlockPos head = feet.above();
        int blockedSides = 0;

        for (Direction direction : Direction.Plane.HORIZONTAL) {
            BlockState feetState = level.getBlockState(feet.relative(direction));
            BlockState headState = level.getBlockState(head.relative(direction));
            if (isSolidTrapWall(feetState) && isSolidTrapWall(headState)) {
                blockedSides++;
            }
        }

        return blockedSides;
    }

    private boolean canOccupy(BlockState state) {
        return state.isAir() || state.canBeReplaced();
    }

    private boolean isSolidTrapWall(BlockState state) {
        return !state.isAir() && !state.canBeReplaced();
    }
}
