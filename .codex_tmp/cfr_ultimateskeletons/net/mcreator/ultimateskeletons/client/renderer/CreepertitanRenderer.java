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
 *  software.bernie.geckolib.model.GeoModel
 *  software.bernie.geckolib.renderer.GeoEntityRenderer
 *  software.bernie.geckolib.renderer.GeoRenderer
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.Random;
import net.mcreator.ultimateskeletons.LightningChain;
import net.mcreator.ultimateskeletons.entity.CreepertitanEntity;
import net.mcreator.ultimateskeletons.entity.layer.CreepertitanLayer;
import net.mcreator.ultimateskeletons.entity.model.CreepertitanModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;

public class CreepertitanRenderer
extends GeoEntityRenderer<CreepertitanEntity> {
    public CreepertitanRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, (GeoModel)new CreepertitanModel());
        this.f_114477_ = 0.5f;
        this.addRenderLayer(new CreepertitanLayer((GeoRenderer<CreepertitanEntity>)this));
    }

    public RenderType getRenderType(CreepertitanEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.m_110473_((ResourceLocation)this.m_5478_((Entity)animatable));
    }

    public void render(CreepertitanEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if (entity.charged) {
            Random random = new Random();
            Vec3 start = new Vec3(0.0, 0.8, 0.0);
            Vec3 end = new Vec3(entity.m_20185_() + 200.0 * ((double)random.nextFloat() - 0.5), entity.m_20186_() + 200.0 * ((double)random.nextFloat() - 0.5), entity.m_20189_() + 200.0 * ((double)random.nextFloat() - 0.5));
            float thickness = 0.02f;
            int color = -1442775041;
            int segments = 24;
            poseStack.m_85836_();
            poseStack.m_85841_(16.0f, 16.0f, 16.0f);
            if (entity.getdeathtick() > 300 && entity.getdeathtick() <= 360) {
                for (int index0 = 0; index0 < entity.getdeathtick() - 300; ++index0) {
                    new LightningChain(poseStack, bufferSource, packedLight, start, new Vec3((double)(14.0f * random.nextFloat() - 7.0f), (double)(14.0f * random.nextFloat() - 7.0f), (double)(14.0f * random.nextFloat() - 7.0f)), thickness, color, segments);
                }
            }
            poseStack.m_85849_();
        }
        super.m_7392_((Entity)entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }

    public boolean shouldRender(CreepertitanEntity p_114491_, Frustum p_114492_, double p_114493_, double p_114494_, double p_114495_) {
        return true;
    }

    public void preRender(PoseStack poseStack, CreepertitanEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        float scale;
        this.scaleHeight = scale = 16.0f;
        this.scaleWidth = scale;
        super.preRender(poseStack, (Entity)entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

    protected float getDeathMaxRotation(CreepertitanEntity entityLivingBaseIn) {
        return 0.0f;
    }
}

