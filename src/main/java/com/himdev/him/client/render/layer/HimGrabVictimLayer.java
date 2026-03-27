package com.himdev.him.client.render.layer;

import com.himdev.him.client.model.HimModel;
import com.himdev.him.entity.HimEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;

public final class HimGrabVictimLayer extends RenderLayer<HimEntity, HimModel> {
    private final EntityRenderDispatcher entityRenderDispatcher;

    public HimGrabVictimLayer(RenderLayerParent<HimEntity, HimModel> renderer, EntityRenderDispatcher entityRenderDispatcher) {
        super(renderer);
        this.entityRenderDispatcher = entityRenderDispatcher;
    }

    @Override
    public void render(
            PoseStack poseStack,
            MultiBufferSource buffer,
            int packedLight,
            HimEntity him,
            float limbSwing,
            float limbSwingAmount,
            float partialTick,
            float ageInTicks,
            float netHeadYaw,
            float headPitch
    ) {
        if (!him.isRescueExecutionVisualActive()) {
            return;
        }

        Entity victim = him.level().getEntity(him.rescueExecutionVictimId());
        if (!(victim instanceof LivingEntity living) || !living.isAlive() || living == him) {
            return;
        }

        poseStack.pushPose();
        getParentModel().translateToHand(HumanoidArm.RIGHT, poseStack);
        HimGrabVictimTransform.apply(
                poseStack,
                getParentModel().rightArm.xRot,
                getParentModel().rightArm.yRot,
                getParentModel().rightArm.zRot,
                living.getBbHeight()
        );
        boolean invisible = living.isInvisible();
        living.setInvisible(false);
        try {
            entityRenderDispatcher.render(living, 0.0D, 0.0D, 0.0D, 0.0F, partialTick, poseStack, buffer, packedLight);
        } finally {
            living.setInvisible(invisible);
        }
        poseStack.popPose();
    }
}
