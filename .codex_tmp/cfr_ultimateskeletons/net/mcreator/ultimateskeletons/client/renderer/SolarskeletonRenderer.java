/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  com.mojang.math.Axis
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.phys.Vec3
 *  org.jetbrains.annotations.NotNull
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  software.bernie.geckolib.cache.object.BakedGeoModel
 *  software.bernie.geckolib.model.GeoModel
 *  software.bernie.geckolib.renderer.GeoEntityRenderer
 *  software.bernie.geckolib.renderer.GeoRenderer
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mcreator.ultimateskeletons.BrilliantRenderer;
import net.mcreator.ultimateskeletons.Solar;
import net.mcreator.ultimateskeletons.entity.ShiningEntity;
import net.mcreator.ultimateskeletons.entity.SolarskeletonEntity;
import net.mcreator.ultimateskeletons.entity.layer.SolarskeletonLayer;
import net.mcreator.ultimateskeletons.entity.model.SolarskeletonModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;

public class SolarskeletonRenderer
extends GeoEntityRenderer<SolarskeletonEntity> {
    private static final ResourceLocation texture = new ResourceLocation("ultimateskeletons:textures/entities/general.png");
    private static final float HALF_SQRT_3 = (float)(Math.sqrt(3.0) / 2.0);
    protected ItemStack mainHandItem;
    protected ItemStack offhandItem;

    public SolarskeletonRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, (GeoModel)new SolarskeletonModel());
        this.f_114477_ = 0.5f;
        this.addRenderLayer(new SolarskeletonLayer((GeoRenderer<SolarskeletonEntity>)this));
        this.addRenderLayer(new Solar((GeoRenderer<SolarskeletonEntity>)this));
    }

    public void preRender(PoseStack poseStack, SolarskeletonEntity animatable, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.mainHandItem = animatable.m_21205_();
        this.offhandItem = animatable.m_21206_();
        super.preRender(poseStack, (Entity)animatable, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public GeoModel<SolarskeletonEntity> getGeoModel() {
        return super.getGeoModel();
    }

    public RenderType getRenderType(SolarskeletonEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.m_110473_((ResourceLocation)this.m_5478_((Entity)animatable));
    }

    public void render(SolarskeletonEntity p_115455_, float p_115456_, float p_115457_, PoseStack p_115458_, MultiBufferSource p_115459_, int p_115460_) {
        p_115458_.m_85836_();
        p_115458_.m_85841_(1.4f, 1.4f, 1.4f);
        RenderSystem.depthFunc((int)1145);
        RenderSystem.depthMask((boolean)true);
        RenderSystem.enableDepthTest();
        p_115458_.m_85849_();
        p_115458_.m_85836_();
        VertexConsumer vertexconsumer2 = p_115459_.m_6299_(RenderType.m_110502_());
        RandomSource randomsource = RandomSource.m_216335_((long)432L);
        int maxVertices = 20;
        float f5 = ((float)p_115455_.f_19797_ + p_115457_) / 200.0f;
        float f7 = Math.min(f5 > 0.8f ? (f5 - 0.8f) / 0.2f : 0.0f, 1.0f);
        int vertexCount = Math.min((int)((f5 + f5 * f5) / 2.0f * 60.0f), maxVertices);
        p_115458_.m_252880_(0.0f, 3.8f, 0.0f);
        p_115458_.m_85841_(0.06f, 0.06f, 0.06f);
        RenderSystem.depthFunc((int)1140);
        if (p_115455_.m_9236_().f_46443_ && p_115455_.f_19797_ % 2 == 0) {
            Minecraft.m_91087_().f_91073_.m_7106_((ParticleOptions)ParticleTypes.f_123744_, p_115455_.m_20185_(), p_115455_.m_20186_() + 1.0, p_115455_.m_20189_(), 0.0, 0.1, 0.0);
        }
        for (int i = 0; i < vertexCount; ++i) {
            p_115458_.m_252781_(Axis.f_252529_.m_252977_(randomsource.m_188501_() * 360.0f));
            p_115458_.m_252781_(Axis.f_252436_.m_252977_(randomsource.m_188501_() * 360.0f));
            p_115458_.m_252781_(Axis.f_252403_.m_252977_(randomsource.m_188501_() * 360.0f));
            p_115458_.m_252781_(Axis.f_252529_.m_252977_(randomsource.m_188501_() * 360.0f));
            p_115458_.m_252781_(Axis.f_252436_.m_252977_(randomsource.m_188501_() * 360.0f));
            p_115458_.m_252781_(Axis.f_252403_.m_252977_(randomsource.m_188501_() * 360.0f + f5 * 90.0f));
            float f3 = randomsource.m_188501_() * 30.0f + 10.0f + f7 * 15.0f;
            float f4 = randomsource.m_188501_() * 3.0f + 2.0f + f7 * 3.0f;
            Matrix4f matrix4f = p_115458_.m_85850_().m_252922_();
            int j = -1;
            float phase = ((float)p_115455_.f_19797_ + p_115457_) * 0.1f;
            BrilliantRenderer.vertex01(vertexconsumer2, matrix4f, j);
            BrilliantRenderer.vertex2(vertexconsumer2, matrix4f, f3, f4, phase);
            BrilliantRenderer.vertex3(vertexconsumer2, matrix4f, f3, f4, phase);
            BrilliantRenderer.vertex01(vertexconsumer2, matrix4f, j);
            BrilliantRenderer.vertex3(vertexconsumer2, matrix4f, f3, f4, phase);
            BrilliantRenderer.vertex4(vertexconsumer2, matrix4f, f3, f4, phase);
            BrilliantRenderer.vertex01(vertexconsumer2, matrix4f, j);
            BrilliantRenderer.vertex4(vertexconsumer2, matrix4f, f3, f4, phase);
            BrilliantRenderer.vertex2(vertexconsumer2, matrix4f, f3, f4, phase);
        }
        RenderSystem.enableDepthTest();
        RenderSystem.disableCull();
        p_115458_.m_85849_();
        super.m_7392_((Entity)p_115455_, p_115456_, p_115457_, p_115458_, p_115459_, p_115460_);
    }

    public void renderRays(@NotNull SolarskeletonEntity shiningEntity, float partialTick, @NotNull PoseStack poseStack, @NotNull MultiBufferSource multiBufferSource) {
        int time2 = (Integer)shiningEntity.m_20088_().m_135370_(ShiningEntity.DATA_TIME);
        float size2 = 2.0f;
        float size = 0.95f * ((float)shiningEntity.f_19797_ + partialTick);
        if (0.95f * ((float)shiningEntity.f_19797_ + partialTick) > 1.0f) {
            size = 1.0f;
        }
        float progress = (float)shiningEntity.f_19797_ + partialTick;
        float alpha = 0.5f;
        Vec3 colour = new Vec3(100.0, 100.0, 100.0);
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
            float phase = ((float)shiningEntity.f_19797_ + partialTick) * 0.1f;
            SolarskeletonRenderer.vertex01(vertexConsumer, matrix4f, matrix3f, r, g, b, phase);
            SolarskeletonRenderer.vertex2(vertexConsumer, matrix4f, matrix3f, v2 *= size1, v3 *= size1);
            SolarskeletonRenderer.vertex3(vertexConsumer, matrix4f, matrix3f, v2, v3);
            SolarskeletonRenderer.vertex01(vertexConsumer, matrix4f, matrix3f, r, g, b, phase);
            SolarskeletonRenderer.vertex3(vertexConsumer, matrix4f, matrix3f, v2, v3);
            SolarskeletonRenderer.vertex4(vertexConsumer, matrix4f, matrix3f, v2, v3);
            SolarskeletonRenderer.vertex01(vertexConsumer, matrix4f, matrix3f, r, g, b, phase);
            SolarskeletonRenderer.vertex4(vertexConsumer, matrix4f, matrix3f, v2, v3);
            SolarskeletonRenderer.vertex2(vertexConsumer, matrix4f, matrix3f, v2, v3);
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

    protected float getDeathMaxRotation(SolarskeletonEntity entityLivingBaseIn) {
        return 0.0f;
    }
}

