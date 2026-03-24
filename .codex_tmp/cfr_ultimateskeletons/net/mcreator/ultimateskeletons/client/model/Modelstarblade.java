/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.model.EntityModel
 *  net.minecraft.client.model.geom.ModelLayerLocation
 *  net.minecraft.client.model.geom.ModelPart
 *  net.minecraft.client.model.geom.PartPose
 *  net.minecraft.client.model.geom.builders.CubeDeformation
 *  net.minecraft.client.model.geom.builders.CubeListBuilder
 *  net.minecraft.client.model.geom.builders.LayerDefinition
 *  net.minecraft.client.model.geom.builders.MeshDefinition
 *  net.minecraft.client.model.geom.builders.PartDefinition
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.ultimateskeletons.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Modelstarblade<T extends Entity>
extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("ultimateskeletons", "modelstarblade"), "main");
    public final ModelPart bb_main;

    public Modelstarblade(ModelPart root) {
        this.bb_main = root.m_171324_("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.m_171576_();
        PartDefinition bb_main = partdefinition.m_171599_("bb_main", CubeListBuilder.m_171558_(), PartPose.m_171419_((float)0.0f, (float)24.0f, (float)0.0f));
        PartDefinition cube_r1 = bb_main.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(432, 0).m_171488_(-14.5f, 199.3007f, -10.0f, 20.0f, 20.0f, 20.0f, new CubeDeformation(0.0f)), PartPose.m_171423_((float)2.5f, (float)370.6993f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-3.1416f));
        PartDefinition cube_r2 = bb_main.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(172, 367).m_171488_(-65.5f, -233.3007f, -8.0f, 128.0f, 145.0f, 0.0f, new CubeDeformation(0.0f)).m_171514_(172, 367).m_171488_(-65.5f, -233.3007f, 8.0f, 128.0f, 145.0f, 0.0f, new CubeDeformation(0.0f)).m_171514_(0, 256).m_171488_(-47.5f, -450.3007f, 0.0f, 86.0f, 256.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.m_171423_((float)2.5f, (float)370.6993f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f));
        PartDefinition cube_r3 = bb_main.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(432, 0).m_171488_(-12.5f, -293.6993f, -10.0f, 20.0f, 30.0f, 20.0f, new CubeDeformation(2.0f)).m_171514_(432, 0).m_171488_(-12.5f, -272.6993f, -10.0f, 20.0f, 492.0f, 20.0f, new CubeDeformation(-3.0f)), PartPose.m_171423_((float)-3.5f, (float)370.6993f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-3.1416f));
        PartDefinition cube_r4 = bb_main.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(171, 367).m_171488_(-118.0855f, 245.236f, 8.0f, 128.0f, 145.0f, 0.0f, new CubeDeformation(0.0f)).m_171514_(171, 367).m_171488_(-118.0855f, 245.236f, -8.0f, 128.0f, 145.0f, 0.0f, new CubeDeformation(0.0f)), PartPose.m_171423_((float)-3.5f, (float)370.6993f, (float)0.0f, (float)3.1416f, (float)0.0f, (float)-2.9671f));
        return LayerDefinition.m_171565_((MeshDefinition)meshdefinition, (int)512, (int)512);
    }

    public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.bb_main.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}

