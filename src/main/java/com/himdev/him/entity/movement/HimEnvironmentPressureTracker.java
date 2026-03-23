package com.himdev.him.entity.movement;

import com.himdev.him.entity.HimEntity;

public final class HimEnvironmentPressureTracker {
    private static final double MIN_PROGRESS_SQR = 0.01D;
    private static final int STALLED_THRESHOLD = 8;
    private static final int OBSTRUCTED_THRESHOLD = 4;
    private static final int FLUID_THRESHOLD = 4;

    private double lastX;
    private double lastY;
    private double lastZ;
    private boolean seeded;
    private int stalledTicks;
    private int obstructedTicks;
    private int fluidTicks;

    public void sample(HimEntity him) {
        if (!seeded) {
            seed(him);
            return;
        }

        double dx = him.getX() - lastX;
        double dy = him.getY() - lastY;
        double dz = him.getZ() - lastZ;
        double progressSqr = dx * dx + dy * dy + dz * dz;

        boolean hasDistantTarget = him.getTarget() != null && him.distanceToSqr(him.getTarget()) > 9.0D;
        if (hasDistantTarget && progressSqr < MIN_PROGRESS_SQR) {
            stalledTicks++;
        } else {
            stalledTicks = 0;
        }

        if (him.horizontalCollision || him.isInWall()) {
            obstructedTicks++;
        } else {
            obstructedTicks = 0;
        }

        if (him.isInWaterOrBubble()) {
            fluidTicks++;
        } else {
            fluidTicks = 0;
        }

        lastX = him.getX();
        lastY = him.getY();
        lastZ = him.getZ();
    }

    public boolean isPursuitStalled() {
        return stalledTicks >= STALLED_THRESHOLD;
    }

    public boolean isPersistentlyObstructed() {
        return obstructedTicks >= OBSTRUCTED_THRESHOLD;
    }

    public boolean isPersistentlyInFluid() {
        return fluidTicks >= FLUID_THRESHOLD;
    }

    public void resetAfterCorrection(HimEntity him) {
        stalledTicks = 0;
        obstructedTicks = 0;
        fluidTicks = 0;
        seed(him);
    }

    private void seed(HimEntity him) {
        lastX = him.getX();
        lastY = him.getY();
        lastZ = him.getZ();
        seeded = true;
    }
}
