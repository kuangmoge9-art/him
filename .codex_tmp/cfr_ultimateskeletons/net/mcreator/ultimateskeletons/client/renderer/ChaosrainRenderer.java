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
 *  net.minecraft.client.renderer.entity.EntityRenderer
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.projectile.DragonFireball
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mcreator.ultimateskeletons.FFRenderTypes;
import net.mcreator.ultimateskeletons.entity.ChaosrainEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

public class ChaosrainRenderer
extends EntityRenderer<ChaosrainEntity> {
    private static final ResourceLocation TEXTURE_LOCATION = new ResourceLocation("ultimateskeletons:textures/particle/chaospearl.png");
    private static final ResourceLocation TRAIL_TEXTURE = new ResourceLocation("ultimateskeletons", "textures/particle/trail_1.png");
    private static final RenderType RENDER_TYPE = RenderType.m_110458_((ResourceLocation)TEXTURE_LOCATION);

    public ChaosrainRenderer(EntityRendererProvider.Context p_173962_) {
        super(p_173962_);
    }

    protected int getBlockLightLevel(DragonFireball p_114087_, BlockPos p_114088_) {
        return 15;
    }

    public void render(ChaosrainEntity p_114080_, float p_114081_, float p_114082_, PoseStack p_114083_, MultiBufferSource p_114084_, int p_114085_) {
        float baseScale = 0.0f;
        p_114083_.m_85836_();
        p_114083_.m_85841_(8.0f, 8.0f, 8.0f);
        p_114083_.m_252781_(this.f_114476_.m_253208_());
        p_114083_.m_252781_(Axis.f_252436_.m_252977_(180.0f));
        PoseStack.Pose $$6 = p_114083_.m_85850_();
        Matrix4f $$7 = $$6.m_252922_();
        Matrix3f $$8 = $$6.m_252943_();
        VertexConsumer $$9 = p_114084_.m_6299_(RENDER_TYPE);
        ChaosrainRenderer.vertex($$9, $$7, $$8, p_114085_, 0.0f, 0, 0, 1);
        ChaosrainRenderer.vertex($$9, $$7, $$8, p_114085_, 1.0f, 0, 1, 1);
        ChaosrainRenderer.vertex($$9, $$7, $$8, p_114085_, 1.0f, 1, 1, 0);
        ChaosrainRenderer.vertex($$9, $$7, $$8, p_114085_, 0.0f, 1, 0, 0);
        if (p_114080_.hasTrail()) {
            double x = Mth.m_14139_((double)p_114082_, (double)p_114080_.f_19790_, (double)p_114080_.m_20185_());
            double y = Mth.m_14139_((double)p_114082_, (double)p_114080_.f_19791_, (double)p_114080_.m_20186_());
            double z = Mth.m_14139_((double)p_114082_, (double)p_114080_.f_19792_, (double)p_114080_.m_20189_());
            p_114083_.m_85837_(-x, -y, -z);
            this.renderTrail(p_114080_, p_114082_, p_114083_, p_114084_, p_114085_, 0.2f + baseScale);
        }
        p_114083_.m_85849_();
        super.m_7392_((Entity)p_114080_, p_114081_, p_114082_, p_114083_, p_114084_, p_114085_);
    }

    private void renderTrail(ChaosrainEntity entityIn, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn, float trailHeight) {
        int sampleSize = 2;
        float trailZRot = 0.0f;
        Vec3 topAngleVec = new Vec3(0.0, (double)trailHeight, 0.0).m_82535_(trailZRot);
        Vec3 bottomAngleVec = new Vec3(0.0, (double)(-trailHeight), 0.0).m_82535_(trailZRot);
        Vec3 drawFrom = entityIn.getTrailPosition(0, partialTicks);
        VertexConsumer vertexconsumer = bufferIn.m_6299_(FFRenderTypes.getGlowingEffect(TRAIL_TEXTURE));
        for (int samples = 0; samples < sampleSize; ++samples) {
            Vec3 sample = entityIn.getTrailPosition(samples + 1, partialTicks);
            float u1 = (float)samples / (float)sampleSize;
            float u2 = u1 + 1.0f / (float)sampleSize;
            Vec3 draw1 = drawFrom;
            Vec3 draw2 = sample;
            PoseStack.Pose posestack$pose = poseStack.m_85850_();
            Matrix4f matrix4f = posestack$pose.m_252922_();
            Matrix3f matrix3f = posestack$pose.m_252943_();
            vertexconsumer.m_252986_(matrix4f, (float)draw1.f_82479_ + (float)bottomAngleVec.f_82479_, (float)draw1.f_82480_ + (float)bottomAngleVec.f_82480_, (float)draw1.f_82481_ + (float)bottomAngleVec.f_82481_).m_85950_(1.0f, 0.2f, 0.2f, 0.8f).m_7421_(u1, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw2.f_82479_ + (float)bottomAngleVec.f_82479_, (float)draw2.f_82480_ + (float)bottomAngleVec.f_82480_, (float)draw2.f_82481_ + (float)bottomAngleVec.f_82481_).m_85950_(1.0f, 0.2f, 0.2f, 0.8f).m_7421_(u2, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw2.f_82479_ + (float)topAngleVec.f_82479_, (float)draw2.f_82480_ + (float)topAngleVec.f_82480_, (float)draw2.f_82481_ + (float)topAngleVec.f_82481_).m_85950_(1.0f, 0.2f, 0.2f, 0.8f).m_7421_(u2, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw1.f_82479_ + (float)topAngleVec.f_82479_, (float)draw1.f_82480_ + (float)topAngleVec.f_82480_, (float)draw1.f_82481_ + (float)topAngleVec.f_82481_).m_85950_(1.0f, 0.2f, 0.2f, 0.8f).m_7421_(u1, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            drawFrom = sample;
        }
    }

    private void renderTrail2(ChaosrainEntity entityIn, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn, float trailHeight) {
        int sampleSize = 4;
        Vec3 topAngleVec = new Vec3((double)trailHeight, 0.0, 0.0);
        Vec3 bottomAngleVec = new Vec3((double)(-trailHeight), 0.0, 0.0);
        Vec3 topAngleVec1 = new Vec3(0.0, 0.0, (double)trailHeight);
        Vec3 bottomAngleVec1 = new Vec3(0.0, 0.0, (double)(-trailHeight));
        Vec3 drawFrom = entityIn.getTrailPosition(0, partialTicks);
        VertexConsumer vertexconsumer = bufferIn.m_6299_(FFRenderTypes.getGlowingEffect(TRAIL_TEXTURE));
        for (int samples = 0; samples < sampleSize; ++samples) {
            Vec3 sample = entityIn.getTrailPosition(samples + 1, partialTicks);
            float u1 = (float)samples / (float)sampleSize;
            float u2 = u1 + 1.0f / (float)sampleSize;
            Vec3 draw1 = drawFrom;
            Vec3 draw2 = sample;
            PoseStack.Pose posestack$pose = poseStack.m_85850_();
            Matrix4f matrix4f = posestack$pose.m_252922_();
            Matrix3f matrix3f = posestack$pose.m_252943_();
            vertexconsumer.m_252986_(matrix4f, (float)draw1.f_82479_ + (float)bottomAngleVec.f_82479_, (float)draw1.f_82480_ + (float)bottomAngleVec.f_82480_, (float)draw1.f_82481_ + (float)bottomAngleVec.f_82481_).m_85950_(1.0f, 1.0f, 1.0f, 0.8f).m_7421_(u1, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw2.f_82479_ + (float)bottomAngleVec.f_82479_, (float)draw2.f_82480_ + (float)bottomAngleVec.f_82480_, (float)draw2.f_82481_ + (float)bottomAngleVec.f_82481_).m_85950_(1.0f, 1.0f, 1.0f, 0.8f).m_7421_(u2, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw2.f_82479_ + (float)topAngleVec.f_82479_, (float)draw2.f_82480_ + (float)topAngleVec.f_82480_, (float)draw2.f_82481_ + (float)topAngleVec.f_82481_).m_85950_(1.0f, 1.0f, 1.0f, 0.8f).m_7421_(u2, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw1.f_82479_ + (float)topAngleVec.f_82479_, (float)draw1.f_82480_ + (float)topAngleVec.f_82480_, (float)draw1.f_82481_ + (float)topAngleVec.f_82481_).m_85950_(1.0f, 1.0f, 1.0f, 0.8f).m_7421_(u1, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw1.f_82479_ + (float)bottomAngleVec1.f_82479_, (float)draw1.f_82480_ + (float)bottomAngleVec1.f_82480_, (float)draw1.f_82481_ + (float)bottomAngleVec1.f_82481_).m_85950_(1.0f, 1.0f, 1.0f, 0.8f).m_7421_(u1, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw2.f_82479_ + (float)bottomAngleVec1.f_82479_, (float)draw2.f_82480_ + (float)bottomAngleVec1.f_82480_, (float)draw2.f_82481_ + (float)bottomAngleVec1.f_82481_).m_85950_(1.0f, 1.0f, 1.0f, 0.8f).m_7421_(u2, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw2.f_82479_ + (float)topAngleVec1.f_82479_, (float)draw2.f_82480_ + (float)topAngleVec1.f_82480_, (float)draw2.f_82481_ + (float)topAngleVec1.f_82481_).m_85950_(1.0f, 1.0f, 1.0f, 0.8f).m_7421_(u2, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw1.f_82479_ + (float)topAngleVec1.f_82479_, (float)draw1.f_82480_ + (float)topAngleVec1.f_82480_, (float)draw1.f_82481_ + (float)topAngleVec1.f_82481_).m_85950_(1.0f, 1.0f, 1.0f, 0.8f).m_7421_(u1, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            drawFrom = sample;
        }
    }

    private static void vertex(VertexConsumer p_254095_, Matrix4f p_254477_, Matrix3f p_253948_, int p_253829_, float p_253995_, int p_254031_, int p_253641_, int p_254243_) {
        p_254095_.m_252986_(p_254477_, p_253995_ - 0.5f, (float)p_254031_ - 0.25f, 0.0f).m_6122_(255, 255, 255, 255).m_7421_((float)p_253641_, (float)p_254243_).m_86008_(OverlayTexture.f_118083_).m_85969_(p_253829_).m_252939_(p_253948_, 0.0f, 1.0f, 0.0f).m_5752_();
    }

    public ResourceLocation getTextureLocation(ChaosrainEntity p_114078_) {
        return TEXTURE_LOCATION;
    }
}

