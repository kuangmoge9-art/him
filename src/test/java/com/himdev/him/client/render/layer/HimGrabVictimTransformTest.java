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
    void heldVictimTransformKeepsVictimUprightForGroundedChokeHold() {
        PoseStack poseStack = heldVictimRenderPose(0.0F);
        Vector3f headToFeetVector = poseStack.last().normal().transform(new Vector3f(0.0F, 1.0F, 0.0F));
        assertTrue(
                headToFeetVector.y > 0.0F,
                "Expected held victim to stay upright instead of hanging upside down"
        );
    }

    @Test
    void heldVictimTransformKeepsNeckCloseToTheHand() {
        PoseStack poseStack = new PoseStack();
        poseStack.mulPose(new Quaternionf().rotationZYX(ARM_Z_ROT, ARM_Y_ROT, ARM_X_ROT));

        HimGrabVictimTransform.apply(poseStack, ARM_X_ROT, ARM_Y_ROT, ARM_Z_ROT, 0.0F, ZOMBIE_HEIGHT);

        Vector3f neckPosition = poseStack.last().pose().transformPosition(new Vector3f(0.0F, ZOMBIE_HEIGHT * 0.75F, 0.0F));
        assertTrue(
                Math.abs(neckPosition.y) < 0.35F,
                "Expected held victim neck to stay near Him's choke hand instead of hanging away from it"
        );
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
