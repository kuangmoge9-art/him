/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
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
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mcreator.ultimateskeletons.entity.ExplosionshockwaveEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class ExplosionshockwaveRenderer
extends EntityRenderer<ExplosionshockwaveEntity> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("ultimateskeletons", "textures/entities/general.png");

    public ExplosionshockwaveRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public boolean shouldRender(ExplosionshockwaveEntity p_114491_, Frustum p_114492_, double p_114493_, double p_114494_, double p_114495_) {
        return true;
    }

    public void render(ExplosionshockwaveEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
        float currentRadius = entityIn.getCurrentRadius();
        VertexConsumer vb = bufferIn.m_6299_(RenderType.m_110488_((ResourceLocation)TEXTURE));
        float radius = currentRadius;
        int longitudeSegments = 64;
        int latitudeSegments = 64;
        float r = 0.1f - (float)entityIn.age * 0.0025f;
        float g = 0.2f - (float)entityIn.age * 0.005f;
        float b = 0.4f - (float)entityIn.age * 0.01f;
        float a = 0.6f - (float)entityIn.age * 0.015f;
        poseStack.m_85836_();
        poseStack.m_252781_(Axis.f_252436_.m_252977_(Mth.m_14179_((float)partialTicks, (float)entityIn.f_19859_, (float)entityIn.m_146908_())));
        poseStack.m_252781_(Axis.f_252529_.m_252977_(Mth.m_14179_((float)partialTicks, (float)entityIn.f_19860_, (float)entityIn.m_146909_())));
        for (int i = 0; i < longitudeSegments; ++i) {
            for (int j = 0; j < latitudeSegments; ++j) {
                float angle1 = (float)j / (float)latitudeSegments * (float)Math.PI;
                float angle2 = (float)(j + 1) / (float)latitudeSegments * (float)Math.PI;
                float x1 = radius * (float)Math.sin(angle1) * (float)Math.cos((float)i / (float)longitudeSegments * 2.0f * (float)Math.PI);
                float y1 = radius * (float)Math.cos(angle1);
                float z1 = radius * (float)Math.sin(angle1) * (float)Math.sin((float)i / (float)longitudeSegments * 2.0f * (float)Math.PI);
                float x2 = radius * (float)Math.sin(angle2) * (float)Math.cos((float)i / (float)longitudeSegments * 2.0f * (float)Math.PI);
                float y2 = radius * (float)Math.cos(angle2);
                float z2 = radius * (float)Math.sin(angle2) * (float)Math.sin((float)i / (float)longitudeSegments * 2.0f * (float)Math.PI);
                float x3 = radius * (float)Math.sin(angle2) * (float)Math.cos((float)(i + 1) / (float)longitudeSegments * 2.0f * (float)Math.PI);
                float y3 = radius * (float)Math.cos(angle2);
                float z3 = radius * (float)Math.sin(angle2) * (float)Math.sin((float)(i + 1) / (float)longitudeSegments * 2.0f * (float)Math.PI);
                float x4 = radius * (float)Math.sin(angle1) * (float)Math.cos((float)(i + 1) / (float)longitudeSegments * 2.0f * (float)Math.PI);
                float y4 = radius * (float)Math.cos(angle1);
                float z4 = radius * (float)Math.sin(angle1) * (float)Math.sin((float)(i + 1) / (float)longitudeSegments * 2.0f * (float)Math.PI);
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x1, y1, z1).m_85950_(r, g, b, a).m_7421_(0.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(x1, y1, z1).m_5752_();
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x2, y2, z2).m_85950_(r, g, b, a).m_7421_(0.0f, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(x2, y2, z2).m_5752_();
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x3, y3, z3).m_85950_(r, g, b, a).m_7421_(1.0f, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(x3, y3, z3).m_5752_();
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x1, y1, z1).m_85950_(r, g, b, a).m_7421_(0.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(x1, y1, z1).m_5752_();
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x3, y3, z3).m_85950_(r, g, b, a).m_7421_(1.0f, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(x3, y3, z3).m_5752_();
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x4, y4, z4).m_85950_(r, g, b, a).m_7421_(1.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(x4, y4, z4).m_5752_();
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x1, y1, z1).m_85950_(r, g, b, a).m_7421_(0.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(-x1, -y1, -z1).m_5752_();
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x4, y4, z4).m_85950_(r, g, b, a).m_7421_(1.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(-x4, -y4, -z4).m_5752_();
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x3, y3, z3).m_85950_(r, g, b, a).m_7421_(1.0f, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(-x3, -y3, -z3).m_5752_();
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x1, y1, z1).m_85950_(r, g, b, a).m_7421_(0.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(-x1, -y1, -z1).m_5752_();
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x2, y2, z2).m_85950_(r, g, b, a).m_7421_(0.0f, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(-x2, -y2, -z2).m_5752_();
                vb.m_252986_(poseStack.m_85850_().m_252922_(), x3, y3, z3).m_85950_(r, g, b, a).m_7421_(1.0f, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_5601_(-x3, -y3, -z3).m_5752_();
            }
        }
        poseStack.m_85849_();
        super.m_7392_((Entity)entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
    }

    public ResourceLocation getTextureLocation(ExplosionshockwaveEntity entity) {
        return TEXTURE;
    }
}

