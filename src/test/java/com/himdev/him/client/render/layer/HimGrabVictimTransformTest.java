package com.himdev.him.client.render.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

final class HimGrabVictimTransformTest {
    private static final float ARM_X_ROT = -1.35F;
    private static final float ARM_Y_ROT = -0.25F;
    private static final float ARM_Z_ROT = 0.08F;
    private static final float ZOMBIE_HEIGHT = 1.95F;

    @Test
    void heldVictimTransformKeepsVictimUprightAfterHandRotation() {
        PoseStack poseStack = heldVictimRenderPose(0.0F);
        Vector3f upVector = poseStack.last().normal().transform(new Vector3f(0.0F, 1.0F, 0.0F));
        assertTrue(upVector.y > 0.0F, "Expected held victim render transform to keep the victim upright");
    }

    @Test
    void heldVictimTransformDropsFeetBelowTheHandForNeckHold() {
        PoseStack poseStack = new PoseStack();
        poseStack.mulPose(new Quaternionf().rotationZYX(ARM_Z_ROT, ARM_Y_ROT, ARM_X_ROT));

        HimGrabVictimTransform.apply(poseStack, ARM_X_ROT, ARM_Y_ROT, ARM_Z_ROT, 0.0F, ZOMBIE_HEIGHT);

        Vector3f feetPosition = poseStack.last().pose().transformPosition(new Vector3f(0.0F, 0.0F, 0.0F));
        assertTrue(feetPosition.y < -1.0F, "Expected held victim feet to hang below the hand instead of standing on it");
    }

    @Test
    void heldVictimTransformCancelsVictimBodyYawSoFacingStaysFixed() {
        Vector3f forwardAtZeroYaw = heldVictimRenderPose(0.0F).last().normal().transform(new Vector3f(0.0F, 0.0F, 1.0F));
        Vector3f forwardAtNinetyYaw = heldVictimRenderPose(90.0F).last().normal().transform(new Vector3f(0.0F, 0.0F, 1.0F));

        assertTrue(
                forwardAtZeroYaw.dot(forwardAtNinetyYaw) > 0.99F,
                "Expected held victim facing to stay fixed instead of inheriting its pre-grab body yaw"
        );
    }

    private static PoseStack heldVictimRenderPose(float victimBodyYawDegrees) {
        PoseStack poseStack = new PoseStack();
        poseStack.scale(-1.0F, -1.0F, 1.0F);
        poseStack.mulPose(new Quaternionf().rotationZYX(ARM_Z_ROT, ARM_Y_ROT, ARM_X_ROT));
        HimGrabVictimTransform.apply(poseStack, ARM_X_ROT, ARM_Y_ROT, ARM_Z_ROT, victimBodyYawDegrees, ZOMBIE_HEIGHT);
        poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - victimBodyYawDegrees));
        poseStack.scale(-1.0F, -1.0F, 1.0F);
        return poseStack;
    }
}
