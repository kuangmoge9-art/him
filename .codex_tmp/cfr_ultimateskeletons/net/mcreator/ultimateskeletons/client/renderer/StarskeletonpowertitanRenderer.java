/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.PoseStack$Pose
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  software.bernie.geckolib.cache.object.BakedGeoModel
 *  software.bernie.geckolib.model.GeoModel
 *  software.bernie.geckolib.renderer.GeoEntityRenderer
 *  software.bernie.geckolib.renderer.GeoRenderer
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.ultimateskeletons.FFRenderTypes;
import net.mcreator.ultimateskeletons.Starpowerskeletontitanarmor;
import net.mcreator.ultimateskeletons.entity.StarskeletonpowertitanEntity;
import net.mcreator.ultimateskeletons.entity.layer.StarskeletonpowertitanLayer;
import net.mcreator.ultimateskeletons.entity.model.StarskeletonpowertitanModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;

public class StarskeletonpowertitanRenderer
extends GeoEntityRenderer<StarskeletonpowertitanEntity> {
    private static final ResourceLocation TRAIL_TEXTURE = new ResourceLocation("ultimateskeletons", "textures/particle/trail1.png");

    public StarskeletonpowertitanRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, (GeoModel)new StarskeletonpowertitanModel());
        this.f_114477_ = 0.5f;
        this.addRenderLayer(new StarskeletonpowertitanLayer((GeoRenderer<StarskeletonpowertitanEntity>)this));
        this.addRenderLayer(new Starpowerskeletontitanarmor((GeoRenderer<StarskeletonpowertitanEntity>)this));
    }

    public RenderType getRenderType(StarskeletonpowertitanEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.m_110473_((ResourceLocation)this.m_5478_((Entity)animatable));
    }

    public void preRender(PoseStack poseStack, StarskeletonpowertitanEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        float scale;
        this.scaleHeight = scale = 30.0f;
        this.scaleWidth = scale;
        super.preRender(poseStack, (Entity)entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public boolean shouldRender(StarskeletonpowertitanEntity p_114491_, Frustum p_114492_, double p_114493_, double p_114494_, double p_114495_) {
        return true;
    }

    public void render(StarskeletonpowertitanEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        Mth.m_14179_((float)partialTick, (float)entity.f_20884_, (float)entity.f_20883_);
        int r = 0;
        int g = 150;
        int b = 255;
        int alpha = 255;
        int light = 15;
        VertexConsumer vertexConsumer = bufferSource.m_6299_(RenderType.m_110488_((ResourceLocation)new ResourceLocation("ultimateskeletons", "textures/entities/glow.png")));
        poseStack.m_85836_();
        Matrix4f matrix4f = poseStack.m_85850_().m_252922_();
        Matrix3f matrix3f = poseStack.m_85850_().m_252943_();
        poseStack.m_252781_(this.f_114476_.m_253208_());
        poseStack.m_85841_(30.0f, 30.0f, 30.0f);
        poseStack.m_252880_(0.0f, entity.m_20206_() / 2.0f - 0.25f, 0.0f);
        vertexConsumer.m_252986_(matrix4f, -1.0f, -1.0f, 0.0f).m_6122_(r, g, b, alpha).m_7421_(0.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(light).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
        vertexConsumer.m_252986_(matrix4f, -1.0f, 1.0f, 0.0f).m_6122_(r, g, b, alpha).m_7421_(0.0f, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(light).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
        vertexConsumer.m_252986_(matrix4f, 1.0f, 1.0f, 0.0f).m_6122_(r, g, b, alpha).m_7421_(1.0f, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(light).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
        vertexConsumer.m_252986_(matrix4f, 1.0f, -1.0f, 0.0f).m_6122_(r, g, b, alpha).m_7421_(1.0f, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(light).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
        poseStack.m_85849_();
        if (entity.hasTrail()) {
            double x = Mth.m_14139_((double)partialTick, (double)entity.f_19790_, (double)entity.m_20185_());
            double y = Mth.m_14139_((double)partialTick, (double)entity.f_19791_, (double)entity.m_20186_());
            double z = Mth.m_14139_((double)partialTick, (double)entity.f_19792_, (double)entity.m_20189_());
            poseStack.m_85836_();
            poseStack.m_85841_(30.0f, 30.0f, 30.0f);
            poseStack.m_85837_(-x, -y, -z);
            this.renderTrail(entity, partialTick, poseStack, bufferSource, 1.0f, packedLight);
            poseStack.m_85849_();
        }
        super.m_7392_((Entity)entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    private void renderTrail(StarskeletonpowertitanEntity entityIn, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, float trailA, int packedLightIn) {
        int sampleSize = 16;
        Vec3[] drawFrom = entityIn.getTrailPosition(0, partialTicks);
        VertexConsumer vertexconsumer = bufferIn.m_6299_(FFRenderTypes.getGlowingEffect(TRAIL_TEXTURE));
        for (int samples = 0; samples < sampleSize; ++samples) {
            Vec3[] sample = entityIn.getTrailPosition(samples + 2, partialTicks);
            float u1 = (float)samples / (float)sampleSize;
            float u2 = u1 + 1.0f / (float)sampleSize;
            Vec3[] draw1 = drawFrom;
            Vec3[] draw2 = sample;
            PoseStack.Pose posestack$pose = poseStack.m_85850_();
            Matrix4f matrix4f = posestack$pose.m_252922_();
            Matrix3f matrix3f = posestack$pose.m_252943_();
            vertexconsumer.m_252986_(matrix4f, (float)draw1[0].f_82479_, (float)draw1[0].f_82480_, (float)draw1[0].f_82481_).m_85950_(0.2f, 0.8f, 1.0f, trailA).m_7421_(u1, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw2[0].f_82479_, (float)draw2[0].f_82480_, (float)draw2[0].f_82481_).m_85950_(0.2f, 0.8f, 1.0f, trailA).m_7421_(u2, 1.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw2[1].f_82479_, (float)draw2[1].f_82480_, (float)draw2[1].f_82481_).m_85950_(0.2f, 0.8f, 1.0f, trailA).m_7421_(u2, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            vertexconsumer.m_252986_(matrix4f, (float)draw1[1].f_82479_, (float)draw1[1].f_82480_, (float)draw1[1].f_82481_).m_85950_(0.2f, 0.8f, 1.0f, trailA).m_7421_(u1, 0.0f).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLightIn).m_252939_(matrix3f, 0.0f, 1.0f, 0.0f).m_5752_();
            drawFrom = sample;
        }
    }

    protected float getDeathMaxRotation(StarskeletonpowertitanEntity entityLivingBaseIn) {
        return 0.0f;
    }
}

