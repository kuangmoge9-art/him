package com.himdev.him.client.render.layer;

import com.mojang.blaze3d.vertex.PoseStack;
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
        PoseStack poseStack = new PoseStack();
        poseStack.mulPose(new Quaternionf().rotationZYX(ARM_Z_ROT, ARM_Y_ROT, ARM_X_ROT));

        HimGrabVictimTransform.apply(poseStack, ARM_X_ROT, ARM_Y_ROT, ARM_Z_ROT, ZOMBIE_HEIGHT);

        Vector3f upVector = poseStack.last().normal().transform(new Vector3f(0.0F, 1.0F, 0.0F));
        assertTrue(upVector.y > 0.0F, "Expected held victim render transform to keep the victim upright");
    }

    @Test
    void heldVictimTransformDropsFeetBelowTheHandForNeckHold() {
        PoseStack poseStack = new PoseStack();
        poseStack.mulPose(new Quaternionf().rotationZYX(ARM_Z_ROT, ARM_Y_ROT, ARM_X_ROT));

        HimGrabVictimTransform.apply(poseStack, ARM_X_ROT, ARM_Y_ROT, ARM_Z_ROT, ZOMBIE_HEIGHT);

        Vector3f feetPosition = poseStack.last().pose().transformPosition(new Vector3f(0.0F, 0.0F, 0.0F));
        assertTrue(feetPosition.y < -1.0F, "Expected held victim feet to hang below the hand instead of standing on it");
    }
}
