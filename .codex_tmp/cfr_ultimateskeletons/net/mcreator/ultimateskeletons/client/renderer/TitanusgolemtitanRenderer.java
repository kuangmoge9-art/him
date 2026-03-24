/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.PoseStack$Pose
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  com.mojang.math.Axis
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.Entity
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  software.bernie.geckolib.cache.object.BakedGeoModel
 *  software.bernie.geckolib.cache.object.GeoBone
 *  software.bernie.geckolib.model.GeoModel
 *  software.bernie.geckolib.renderer.GeoEntityRenderer
 *  software.bernie.geckolib.renderer.GeoRenderer
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mcreator.ultimateskeletons.entity.TitanusgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.layer.TitanusgolemtitanLayer;
import net.mcreator.ultimateskeletons.entity.model.TitanusgolemtitanModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;

public class TitanusgolemtitanRenderer
extends GeoEntityRenderer<TitanusgolemtitanEntity> {
    private static final ResourceLocation texture = new ResourceLocation("ultimateskeletons:textures/entities/enchanted.png");

    public TitanusgolemtitanRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, (GeoModel)new TitanusgolemtitanModel());
        this.f_114477_ = 0.5f;
        this.addRenderLayer(new TitanusgolemtitanLayer((GeoRenderer<TitanusgolemtitanEntity>)this));
    }

    public RenderType getRenderType(TitanusgolemtitanEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.m_110473_((ResourceLocation)this.m_5478_((Entity)animatable));
    }

    public boolean shouldRender(TitanusgolemtitanEntity p_114491_, Frustum p_114492_, double p_114493_, double p_114494_, double p_114495_) {
        return true;
    }

    public void renderRecursively(PoseStack poseStack, TitanusgolemtitanEntity animatable, GeoBone bone, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        if (!bone.getName().equals("weapon1")) {
            super.renderRecursively(poseStack, (Entity)animatable, bone, renderType, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
        }
    }

    public void preRender(PoseStack poseStack, TitanusgolemtitanEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        float scale;
        this.scaleHeight = scale = 26.0f;
        this.scaleWidth = scale;
        super.preRender(poseStack, (Entity)entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public float xOffset(float p_117702_) {
        return (float)(Math.cos(p_117702_ * 0.01f) * 2.0);
    }

    public void render(TitanusgolemtitanEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
        float currentRadius = entityIn.getCurrentRadius();
        float $10 = (float)entityIn.f_19797_ + partialTicks;
        VertexConsumer buffer = bufferIn.m_6299_(RenderType.m_110488_((ResourceLocation)texture));
        float radius = currentRadius;
        int segments = 64;
        int latitudeSegments = 64;
        int r = 0;
        int g = (int)Math.max(185.0 - Math.sin($10 * 0.1f) * 70.0, 0.0);
        int b = 0;
        float colorIntensity = (float)((double)0.1f + (Math.sin($10 * 0.1f) + 1.0) / 8.0);
        poseStack.m_85836_();
        poseStack.m_85841_(26.0f, 26.0f, 26.0f);
        poseStack.m_252880_(0.0f, 0.5f, 0.0f);
        poseStack.m_252781_(Axis.f_252436_.m_252977_(Mth.m_14179_((float)partialTicks, (float)entityIn.f_19859_, (float)entityIn.m_146908_())));
        poseStack.m_252781_(Axis.f_252529_.m_252977_(Mth.m_14179_((float)partialTicks, (float)entityIn.f_19860_, (float)entityIn.m_146909_())));
        PoseStack.Pose pose = poseStack.m_85850_();
        Matrix4f matrix4f = pose.m_252922_();
        Matrix3f matrix3f = pose.m_252943_();
        for (int i = 0; i < segments; ++i) {
            float theta1 = (float)(Math.PI * (double)i / (double)segments);
            float theta2 = (float)(Math.PI * (double)(i + 1) / (double)segments);
            for (int j = 0; j < segments * 2; ++j) {
                float phi1 = (float)(Math.PI * 2 * (double)j / (double)(segments * 2));
                float phi2 = (float)(Math.PI * 2 * (double)(j + 1) / (double)(segments * 2));
                float x1 = radius * Mth.m_14031_((float)theta1) * Mth.m_14089_((float)phi1);
                float y1 = radius * Mth.m_14089_((float)theta1) + 0.5f;
                float z1 = radius * Mth.m_14031_((float)theta1) * Mth.m_14031_((float)phi1);
                float x2 = radius * Mth.m_14031_((float)theta2) * Mth.m_14089_((float)phi1);
                float y2 = radius * Mth.m_14089_((float)theta2) + 0.5f;
                float z2 = radius * Mth.m_14031_((float)theta2) * Mth.m_14031_((float)phi1);
                float x3 = radius * Mth.m_14031_((float)theta2) * Mth.m_14089_((float)phi2);
                float y3 = radius * Mth.m_14089_((float)theta2) + 0.5f;
                float z3 = radius * Mth.m_14031_((float)theta2) * Mth.m_14031_((float)phi2);
                float x4 = radius * Mth.m_14031_((float)theta1) * Mth.m_14089_((float)phi2);
                float y4 = radius * Mth.m_14089_((float)theta1) + 0.5f;
                float z4 = radius * Mth.m_14031_((float)theta1) * Mth.m_14031_((float)phi2);
                TitanusgolemtitanRenderer.vertex(buffer, matrix4f, matrix3f, x4, y4, z4, r, g, b, packedLightIn, 1.0f, 1.0f);
                TitanusgolemtitanRenderer.vertex(buffer, matrix4f, matrix3f, x3, y3, z3, r, g, b, packedLightIn, 1.0f, 0.0f);
                TitanusgolemtitanRenderer.vertex(buffer, matrix4f, matrix3f, x2, y2, z2, r, g, b, packedLightIn, 0.0f, 0.0f);
                TitanusgolemtitanRenderer.vertex(buffer, matrix4f, matrix3f, x1, y1, z1, r, g, b, packedLightIn, 0.0f, 1.0f);
                TitanusgolemtitanRenderer.vertex(buffer, matrix4f, matrix3f, x1, y1, z1, r, g, b, packedLightIn, 0.0f, 1.0f);
                TitanusgolemtitanRenderer.vertex(buffer, matrix4f, matrix3f, x2, y2, z2, r, g, b, packedLightIn, 0.0f, 0.0f);
                TitanusgolemtitanRenderer.vertex(buffer, matrix4f, matrix3f, x3, y3, z3, r, g, b, packedLightIn, 1.0f, 0.0f);
                TitanusgolemtitanRenderer.vertex(buffer, matrix4f, matrix3f, x4, y4, z4, r, g, b, packedLightIn, 1.0f, 1.0f);
            }
        }
        poseStack.m_85849_();
        super.m_7392_((Entity)entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
    }

    private static void vertex(VertexConsumer vertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f, float x, float y, float z, int red, int green, int blue, int light, float u, float v) {
        vertexConsumer.m_252986_(matrix4f, x, y, z).m_6122_(red, green, blue, 255).m_7421_(u, v).m_86008_(OverlayTexture.f_118083_).m_85969_(light).m_252939_(matrix3f, 0.8f, 0.8f, 0.8f).m_5752_();
    }

    protected float getDeathMaxRotation(TitanusgolemtitanEntity entityLivingBaseIn) {
        return 0.0f;
    }
}

