package com.himdev.him.client.render.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import org.joml.Vector3f;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

final class HimGrabVictimTransformTest {
    @Test
    void heldVictimTransformKeepsVictimUpright() {
        PoseStack poseStack = new PoseStack();

        HimGrabVictimTransform.apply(poseStack);

        Vector3f upVector = poseStack.last().normal().transform(new Vector3f(0.0F, 1.0F, 0.0F));
        assertTrue(upVector.y > 0.0F, "Expected held victim render transform to keep the victim upright");
    }
}
