package com.himdev.him.client.render.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;

final class HimGrabVictimTransform {
    private static final double HAND_SIDE_OFFSET = 0.05D;
    private static final double HAND_FORWARD_OFFSET = -0.10D;
    private static final double NECK_HOLD_HEIGHT_RATIO = 0.75D;

    private HimGrabVictimTransform() {
    }

    static void apply(
            PoseStack poseStack,
            float armXRot,
            float armYRot,
            float armZRot,
            float victimBodyYawDegrees,
            float victimHeight
    ) {
        poseStack.mulPose(Axis.XP.rotation(-armXRot));
        poseStack.mulPose(Axis.YP.rotation(-armYRot));
        poseStack.mulPose(Axis.ZP.rotation(-armZRot));
        poseStack.translate(HAND_SIDE_OFFSET, -victimHeight * NECK_HOLD_HEIGHT_RATIO, HAND_FORWARD_OFFSET);
        // LivingEntityRenderer reapplies the victim's body yaw during render, so neutralize it here
        // and keep the held target facing back toward Him's choke hand. The victim render path
        // also contributes a Z-axis flip, so the yaw compensation must use the mirrored sign.
        poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - victimBodyYawDegrees));
        poseStack.mulPose(Axis.ZP.rotationDegrees(180.0F));
        poseStack.scale(0.85F, 0.85F, 0.85F);
    }
}
