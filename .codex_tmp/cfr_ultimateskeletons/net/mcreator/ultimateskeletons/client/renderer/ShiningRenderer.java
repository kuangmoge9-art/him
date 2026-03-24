/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  com.mojang.math.Axis
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.entity.EntityRenderer
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.phys.Vec3
 *  org.jetbrains.annotations.NotNull
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mcreator.ultimateskeletons.entity.ShiningEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class ShiningRenderer
extends EntityRenderer<ShiningEntity> {
    private static final float HALF_SQRT_3 = (float)(Math.sqrt(3.0) / 2.0);

    public ShiningRenderer(EntityRendererProvider.Context ctx) {
        super(ctx);
    }

    public void render(@NotNull ShiningEntity shiningEntity, float yaw, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource multiBufferSource, int light) {
        if (((Boolean)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_IS_BILLBOARD)).booleanValue()) {
            this.renderBillboard(shiningEntity, partialTick, poseStack, multiBufferSource);
        } else {
            this.renderRays(shiningEntity, partialTick, poseStack, multiBufferSource);
        }
    }

    public void renderBillboard(@NotNull ShiningEntity shiningEntity, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource multiBufferSource) {
        int time2 = (Integer)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_TIME);
        float size2 = ((Float)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_SIZE)).floatValue();
        Matrix4f matrix4f = poseStack.m_85850_().m_252922_();
        Matrix3f matrix3f = poseStack.m_85850_().m_252943_();
        poseStack.m_252781_(this.f_114476_.m_253208_());
        float size = 0.95f * ((float)shiningEntity.f_19797_ + partialTick);
        if (0.95f * ((float)shiningEntity.f_19797_ + partialTick) > 1.0f) {
            size = 1.0f;
        }
        poseStack.m_85841_(size2 * size, size2 * size, size2 * size);
        VertexConsumer vertexConsumer = multiBufferSource.m_6299_(RenderType.m_110488_((ResourceLocation)this.getTextureLocation(shiningEntity)));
        float alpha = 1.0f - ((float)shiningEntity.f_19797_ + partialTick) * (1.0f / (float)time2);
        if (((float)shiningEntity.f_19797_ + partialTick) * (255.0f / (float)time2) >= 255.0f) {
            alpha = 0.0f;
        }
        int light = 15;
        Vec3 colour = new Vec3((double)((Vector3f)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_COLOUR)).x, (double)((Vector3f)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_COLOUR)).y, (double)((Vector3f)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_COLOUR)).z);
        float r = (float)colour.f_82479_ / 255.0f * alpha;
        float g = (float)colour.f_82480_ / 255.0f * alpha;
        float b = (float)colour.f_82481_ / 255.0f * alpha;
        if (colour.equals((Object)new Vec3(-1.0, -1.0, -1.0))) {
            r = alpha;
            g = alpha - alpha / 5.0f;
            b = alpha - alpha / 2.0f;
        }
        for (int i = 0; i < 5; ++i) {
            vertexConsumer.m_252986_(matrix4f, -1.0f, -1.0f, 0.0f).m_85950_(r, g, b, alpha).m_7421_(0.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(light).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexConsumer.m_252986_(matrix4f, -1.0f, 1.0f, 0.0f).m_85950_(r, g, b, alpha).m_7421_(0.0f, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(light).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexConsumer.m_252986_(matrix4f, 1.0f, 1.0f, 0.0f).m_85950_(r, g, b, alpha).m_7421_(1.0f, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(light).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexConsumer.m_252986_(matrix4f, 1.0f, -1.0f, 0.0f).m_85950_(r, g, b, alpha).m_7421_(1.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(light).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
        }
    }

    public void renderRays(@NotNull ShiningEntity shiningEntity, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource multiBufferSource) {
        int time2 = (Integer)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_TIME);
        float size2 = ((Float)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_SIZE)).floatValue();
        float size = 0.95f * ((float)shiningEntity.f_19797_ + partialTick);
        if (0.95f * ((float)shiningEntity.f_19797_ + partialTick) > 1.0f) {
            size = 1.0f;
        }
        float progress = ((float)shiningEntity.f_19797_ + partialTick) / (float)time2;
        float alpha = 0.5f - (float)Math.sqrt(progress) * 0.5f;
        if (((float)shiningEntity.f_19797_ + partialTick) * (255.0f / (float)time2) >= 255.0f) {
            alpha = 0.0f;
        }
        Vec3 colour = new Vec3((double)((Vector3f)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_COLOUR)).x, (double)((Vector3f)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_COLOUR)).y, (double)((Vector3f)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_COLOUR)).z);
        float r = (float)colour.f_82479_ / 255.0f * alpha;
        float g = (float)colour.f_82480_ / 255.0f * alpha;
        float b = (float)colour.f_82481_ / 255.0f * alpha;
        if (colour.equals((Object)new Vec3(-1.0, -1.0, -1.0))) {
            r = alpha;
            g = alpha - alpha / 5.0f;
            b = alpha - alpha / 2.0f;
        }
        float v = 1.0f;
        RandomSource randomSource = RandomSource.m_216335_((long)432L);
        VertexConsumer vertexConsumer = multiBufferSource.m_6299_(RenderType.m_110488_((ResourceLocation)new ResourceLocation("ultimateskeletons", "textures/entities/general.png")));
        poseStack.m_85836_();
        poseStack.m_85837_(0.0, 1.5, 0.0);
        for (int i = 0; i < 250; ++i) {
            poseStack.m_252781_(Axis.f_252529_.m_252977_(randomSource.m_188501_() * 360.0f));
            poseStack.m_252781_(Axis.f_252436_.m_252977_(randomSource.m_188501_() * 360.0f));
            poseStack.m_252781_(Axis.f_252403_.m_252977_(randomSource.m_188501_() * 360.0f));
            poseStack.m_252781_(Axis.f_252529_.m_252977_(randomSource.m_188501_() * 360.0f));
            poseStack.m_252781_(Axis.f_252436_.m_252977_(randomSource.m_188501_() * 360.0f));
            poseStack.m_252781_(Axis.f_252403_.m_252977_(randomSource.m_188501_() * 360.0f + v * 90.0f));
            float v2 = randomSource.m_188501_() * 1.0f + 5.0f + 1.0f;
            float v3 = randomSource.m_188501_() * 1.0f + 1.0f + 1.0f;
            float size1 = size / 10.0f * size2;
            Matrix4f matrix4f = poseStack.m_85850_().m_252922_();
            Matrix3f matrix3f = poseStack.m_85850_().m_252943_();
            int i1 = 50;
            ShiningRenderer.vertex01(vertexConsumer, matrix4f, matrix3f, r, g, b, i1);
            ShiningRenderer.vertex2(vertexConsumer, matrix4f, matrix3f, v2 *= size1, v3 *= size1);
            ShiningRenderer.vertex3(vertexConsumer, matrix4f, matrix3f, v2, v3);
            ShiningRenderer.vertex01(vertexConsumer, matrix4f, matrix3f, r, g, b, i1);
            ShiningRenderer.vertex3(vertexConsumer, matrix4f, matrix3f, v2, v3);
            ShiningRenderer.vertex4(vertexConsumer, matrix4f, matrix3f, v2, v3);
            ShiningRenderer.vertex01(vertexConsumer, matrix4f, matrix3f, r, g, b, i1);
            ShiningRenderer.vertex4(vertexConsumer, matrix4f, matrix3f, v2, v3);
            ShiningRenderer.vertex2(vertexConsumer, matrix4f, matrix3f, v2, v3);
        }
        poseStack.m_85849_();
    }

    private static void vertex01(VertexConsumer vertexConsumer, Matrix4f matrix4f, Matrix3f matrix3f, float r, float g, float b, float alpha) {
        vertexConsumer.m_252986_(matrix4f, 0.0f, 0.0f, 0.0f).m_85950_(r, g, b, alpha).m_7421_(0.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(15).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
    }

    private static void vertex2(VertexConsumer p_253956_, Matrix4f p_254053_, Matrix3f matrix3f, float p_253704_, float p_253701_) {
        p_253956_.m_252986_(p_254053_, -HALF_SQRT_3 * p_253701_, p_253704_, -0.5f * p_253701_).m_6122_(0, 0, 0, 0).m_7421_(0.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(15).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
    }

    private static void vertex3(VertexConsumer p_253850_, Matrix4f p_254379_, Matrix3f matrix3f, float p_253729_, float p_254030_) {
        p_253850_.m_252986_(p_254379_, HALF_SQRT_3 * p_254030_, p_253729_, -0.5f * p_254030_).m_6122_(0, 0, 0, 0).m_7421_(0.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(15).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
    }

    private static void vertex4(VertexConsumer p_254184_, Matrix4f p_254082_, Matrix3f matrix3f, float p_253649_, float p_253694_) {
        p_254184_.m_252986_(p_254082_, 0.0f, p_253649_, 1.0f * p_253694_).m_6122_(0, 0, 0, 0).m_7421_(0.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(15).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
    }

    @NotNull
    public ResourceLocation getTextureLocation(@NotNull ShiningEntity shiningEntity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/glow.png");
    }
}

