package com.himdev.him.client.model;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

public final class HimModel extends HumanoidModel<HimEntity> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(HimMod.MOD_ID, "him"), "main");

    public HimModel(ModelPart root) {
        super(root);
    }

    @Override
    public void setupAnim(HimEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        if (!entity.isRescueExecutionVisualActive()) {
            return;
        }

        rightArm.xRot = -1.35F;
        rightArm.yRot = -0.25F;
        rightArm.zRot = 0.08F;
        leftArm.xRot = 0.10F;
        leftArm.yRot = 0.08F;
        body.yRot = 0.12F;
        rightLeg.xRot = 0.0F;
        rightLeg.yRot = 0.0F;
        leftLeg.xRot = 0.0F;
        leftLeg.yRot = 0.0F;
        head.yRot *= 0.5F;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
        PartDefinition root = meshDefinition.getRoot();
        root.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.ZERO);
        return LayerDefinition.create(meshDefinition, 64, 64);
    }
}
