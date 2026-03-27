package com.himdev.him.client.render.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;

final class HimGrabVictimTransform {
    private HimGrabVictimTransform() {
    }

    static void apply(PoseStack poseStack) {
        poseStack.translate(0.05D, 0.28D, -0.32D);
        poseStack.mulPose(Axis.YP.rotationDegrees(180.0F));
        poseStack.scale(0.85F, 0.85F, 0.85F);
    }
}
