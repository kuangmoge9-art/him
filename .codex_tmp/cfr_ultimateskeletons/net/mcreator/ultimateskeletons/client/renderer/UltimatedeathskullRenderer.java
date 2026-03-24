/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.phys.Vec3
 *  software.bernie.geckolib.cache.object.BakedGeoModel
 *  software.bernie.geckolib.cache.object.GeoBone
 *  software.bernie.geckolib.core.animatable.model.CoreGeoBone
 *  software.bernie.geckolib.model.GeoModel
 *  software.bernie.geckolib.renderer.GeoEntityRenderer
 *  software.bernie.geckolib.renderer.GeoRenderer
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.Random;
import net.mcreator.ultimateskeletons.LightningChain;
import net.mcreator.ultimateskeletons.MathUtils;
import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.mcreator.ultimateskeletons.entity.layer.UltimatedeathskullLayer;
import net.mcreator.ultimateskeletons.entity.model.UltimatedeathskullModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;

public class UltimatedeathskullRenderer
extends GeoEntityRenderer<UltimatedeathskullEntity> {
    public UltimatedeathskullRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, (GeoModel)new UltimatedeathskullModel());
        this.f_114477_ = 0.5f;
        this.addRenderLayer(new UltimatedeathskullLayer((GeoRenderer<UltimatedeathskullEntity>)this));
    }

    public RenderType getRenderType(UltimatedeathskullEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.m_110473_((ResourceLocation)this.m_5478_((Entity)animatable));
    }

    public boolean shouldRender(UltimatedeathskullEntity p_114491_, Frustum p_114492_, double p_114493_, double p_114494_, double p_114495_) {
        return true;
    }

    public void preRender(PoseStack poseStack, UltimatedeathskullEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        float scale;
        this.scaleHeight = scale = 1.8f;
        this.scaleWidth = scale;
        super.preRender(poseStack, (Entity)entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void render(UltimatedeathskullEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        CoreGeoBone swordLocate1 = this.getGeoModel().getAnimationProcessor().getBone("bone");
        CoreGeoBone swordLocate2 = this.getGeoModel().getAnimationProcessor().getBone("hair4");
        if (swordLocate1 != null) {
            Random random = new Random();
            Vec3 vec3 = MathUtils.getWorldPosFromModel((Entity)entity, entity.f_20883_, (GeoBone)swordLocate1);
            Vec3 vec31 = MathUtils.getWorldPosFromModel((Entity)entity, entity.f_20883_, (GeoBone)swordLocate2);
            Vec3 start = new Vec3(vec3.f_82479_ - entity.m_20185_(), vec3.f_82480_ - entity.m_20186_(), vec3.f_82481_ - entity.m_20189_());
            Vec3 end = new Vec3(vec31.f_82479_ - entity.m_20185_() + (double)(2.0f * random.nextFloat()) - 1.0, vec31.f_82480_ - entity.m_20186_() + (double)(2.0f * random.nextFloat()) - 1.0, vec31.f_82481_ - entity.m_20189_() + (double)(2.0f * random.nextFloat()) - 1.0);
            float thickness = 0.02f;
            int color = -1434451713;
            int segments = 5;
            poseStack.m_85836_();
            poseStack.m_85841_(1.8f, 1.8f, 1.8f);
            for (int index0 = 0; index0 < 24; ++index0) {
                new LightningChain(poseStack, bufferSource, packedLight, start, new Vec3(vec31.f_82479_ - entity.m_20185_() + (double)(2.0f * random.nextFloat()) - 1.0, vec31.f_82480_ - entity.m_20186_() + (double)(2.0f * random.nextFloat()) - 1.0, vec31.f_82481_ - entity.m_20189_() + (double)(2.0f * random.nextFloat()) - 1.0), thickness, color, segments);
            }
            poseStack.m_85849_();
        }
        super.m_7392_((Entity)entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    protected float getDeathMaxRotation(UltimatedeathskullEntity entityLivingBaseIn) {
        return 0.0f;
    }
}

