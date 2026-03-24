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
 *  net.minecraft.client.renderer.entity.EntityRenderer
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.Entity
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mcreator.ultimateskeletons.entity.AdamanshockEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class AdamanshockRenderer
extends EntityRenderer<AdamanshockEntity> {
    private static final ResourceLocation texture = new ResourceLocation("ultimateskeletons:textures/entities/armor.png");

    public AdamanshockRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public boolean shouldRender(AdamanshockEntity p_114491_, Frustum p_114492_, double p_114493_, double p_114494_, double p_114495_) {
        return true;
    }

    public float xOffset(float p_117702_) {
        return (float)(Math.cos(p_117702_ * 0.01f) * 2.0);
    }

    public void render(AdamanshockEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
        float currentRadius = entityIn.getCurrentRadius();
        float $10 = (float)entityIn.f_19797_ + partialTicks;
        VertexConsumer buffer = bufferIn.m_6299_(RenderType.m_110436_((ResourceLocation)texture, (float)(this.xOffset($10) % 1.0f), (float)($10 * 0.01f % 1.0f)));
        float radius = currentRadius;
        int segments = 64;
        int latitudeSegments = 64;
        int r = 255 - entityIn.age * 12;
        int g = Math.max(255 - entityIn.age * 24, 0);
        int b = Math.max(255 - entityIn.age * 24, 0);
        poseStack.m_85836_();
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
                AdamanshockRenderer.vertex(buffer, matrix4f, matrix3f, x4, y4, z4, r, g, b, packedLightIn, 1.0f, 1.0f);
                AdamanshockRenderer.vertex(buffer, matrix4f, matrix3f, x3, y3, z3, r, g, b, packedLightIn, 1.0f, 0.0f);
                AdamanshockRenderer.vertex(buffer, matrix4f, matrix3f, x2, y2, z2, r, g, b, packedLightIn, 0.0f, 0.0f);
                AdamanshockRenderer.vertex(buffer, matrix4f, matrix3f, x1, y1, z1, r, g, b, packedLightIn, 0.0f, 1.0f);
                AdamanshockRenderer.vertex(buffer, matrix4f, matrix3f, x1, y1, z1, r, g, b, packedLightIn, 0.0f, 1.0f);
                AdamanshockRenderer.vertex(buffer, matrix4f, matrix3f, x2, y2, z2, r, g, b, packedLightIn, 0.0f, 0.0f);
                AdamanshockRenderer.vertex(buffer, matrix4f, matrix3f, x3, y3, z3, r, g, b, packedLightIn, 1.0f, 0.0f);
                AdamanshockRenderer.vertex(buffer, matrix4f, matrix3f, x4, y4, z4, r, g, b, packedLightIn, 1.0f, 1.0f);
            }
        }
        poseStack.m_85849_();
        super.m_7392_((Entity)entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
    }

    private static void vertex(VertexConsumer vertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f, float x, float y, float z, int red, int green, int blue, int light, float u, float v) {
        vertexConsumer.m_252986_(matrix4f, x, y, z).m_6122_(red, green, blue, 255).m_7421_(u, v).m_86008_(OverlayTexture.f_118083_).m_85969_(light).m_252939_(matrix3f, 0.8f, 0.8f, 0.8f).m_5752_();
    }

    public ResourceLocation getTextureLocation(AdamanshockEntity entity) {
        return texture;
    }
}

