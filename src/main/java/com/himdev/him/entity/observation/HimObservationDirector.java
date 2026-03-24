package com.himdev.him.entity.observation;

import com.himdev.him.entity.HimEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.Comparator;
import java.util.UUID;

public final class HimObservationDirector {
    private static final double PLAYER_DETECTION_RANGE = 12.0D;
    private static final double PLAYER_SCENE_RANGE = 16.0D;
    private static final int OBSERVATION_HOLD_TICKS = 240;
    private static final int OBSERVATION_COOLDOWN_TICKS = 160;
    private static final Vec3[] START_OFFSETS = new Vec3[] {
            new Vec3(0.0D, 3.0D, 0.0D),
            new Vec3(0.0D, 4.0D, 0.0D),
            new Vec3(1.0D, 3.0D, 0.0D),
            new Vec3(-1.0D, 3.0D, 0.0D),
            new Vec3(0.0D, 3.0D, 1.0D),
            new Vec3(0.0D, 3.0D, -1.0D)
    };

    private UUID observedPlayerId;
    private Vec3 observationPoint;
    private int holdTicksRemaining;
    private int cooldownTicksRemaining;

    public boolean tick(ServerLevel level, HimEntity him) {
        if (cooldownTicksRemaining > 0) {
            cooldownTicksRemaining--;
        }

        if (isObserving()) {
            return tickObservation(level, him);
        }

        if (cooldownTicksRemaining > 0 || !canStartObservation(him)) {
            return false;
        }

        Player player = findNearbyPlayer(level, him);
        if (player == null) {
            return false;
        }

        Vec3 candidate = findObservationStart(level, him, player);
        if (candidate == null) {
            return false;
        }

        startObservation(him, player, candidate);
        return true;
    }

    public void stop() {
        clearObservationState();
    }

    private boolean tickObservation(ServerLevel level, HimEntity him) {
        Player player = findObservedPlayer(level, him);
        if (player == null || !player.isAlive() || shouldAbortObservation(him, player)) {
            stopObservation(him);
            return false;
        }

        holdObservationPose(him, player);
        holdTicksRemaining--;
        if (holdTicksRemaining <= 0) {
            stopObservation(him);
        }
        return true;
    }

    private boolean canStartObservation(HimEntity him) {
        return !him.isReturnStabilizing()
                && !him.isRecoveringFromVoidState()
                && !him.hasAvailableHostileTarget()
                && !him.isUnderEnvironmentEscapePressure();
    }

    private boolean shouldAbortObservation(HimEntity him, Player player) {
        return !canStartObservation(him)
                || observationPoint == null
                || him.distanceToSqr(player) > PLAYER_SCENE_RANGE * PLAYER_SCENE_RANGE;
    }

    private Player findNearbyPlayer(ServerLevel level, HimEntity him) {
        return level.getEntitiesOfClass(
                        Player.class,
                        him.getBoundingBox().inflate(PLAYER_DETECTION_RANGE),
                        Player::isAlive
                ).stream()
                .min(Comparator.comparingDouble(him::distanceToSqr))
                .orElse(null);
    }

    private Vec3 findObservationStart(ServerLevel level, HimEntity him, Player player) {
        for (Vec3 offset : START_OFFSETS) {
            Vec3 candidate = him.position().add(offset);
            if (candidate.distanceToSqr(player.position()) > PLAYER_SCENE_RANGE * PLAYER_SCENE_RANGE) {
                continue;
            }
            if (!level.noCollision(him, shiftedBoundingBox(him, candidate))) {
                continue;
            }
            return candidate;
        }
        return null;
    }

    private AABB shiftedBoundingBox(HimEntity him, Vec3 candidate) {
        return him.getBoundingBox().move(
                candidate.x - him.getX(),
                candidate.y - him.getY(),
                candidate.z - him.getZ()
        );
    }

    private void startObservation(HimEntity him, Player player, Vec3 candidate) {
        observedPlayerId = player.getUUID();
        observationPoint = candidate;
        holdTicksRemaining = OBSERVATION_HOLD_TICKS;
        holdObservationPose(him, player);
    }

    private Player findObservedPlayer(ServerLevel level, HimEntity him) {
        if (observedPlayerId == null) {
            return null;
        }

        return level.getEntitiesOfClass(
                        Player.class,
                        him.getBoundingBox().inflate(PLAYER_SCENE_RANGE * 2.0D),
                        candidate -> candidate.isAlive() && observedPlayerId.equals(candidate.getUUID())
                ).stream()
                .findFirst()
                .orElse(null);
    }

    private void holdObservationPose(HimEntity him, Player player) {
        if (observationPoint == null) {
            return;
        }

        Vec3 delta = player.position().subtract(observationPoint);
        float yaw = (float) Math.toDegrees(Math.atan2(-delta.x, delta.z));
        him.setTarget(null);
        him.getNavigation().stop();
        him.setNoGravity(true);
        him.setDeltaMovement(Vec3.ZERO);
        him.moveTo(observationPoint.x, observationPoint.y, observationPoint.z, yaw, him.getXRot());
        him.setYRot(yaw);
        him.setYHeadRot(yaw);
        him.yBodyRot = yaw;
    }

    private void stopObservation(HimEntity him) {
        him.setNoGravity(false);
        him.setDeltaMovement(Vec3.ZERO);
        cooldownTicksRemaining = OBSERVATION_COOLDOWN_TICKS;
        clearObservationState();
    }

    private boolean isObserving() {
        return observationPoint != null && holdTicksRemaining > 0;
    }

    private void clearObservationState() {
        observedPlayerId = null;
        observationPoint = null;
        holdTicksRemaining = 0;
    }
}
