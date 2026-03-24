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
 *  software.bernie.geckolib.cache.object.BakedGeoModel
 *  software.bernie.geckolib.cache.object.GeoBone
 *  software.bernie.geckolib.model.GeoModel
 *  software.bernie.geckolib.renderer.GeoEntityRenderer
 *  software.bernie.geckolib.renderer.GeoRenderer
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.ultimateskeletons.Withireniumgolemtitanarmor;
import net.mcreator.ultimateskeletons.entity.WithireniumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.layer.WithireniumgolemtitanLayer;
import net.mcreator.ultimateskeletons.entity.model.WithireniumgolemtitanModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;

public class WithireniumgolemtitanRenderer
extends GeoEntityRenderer<WithireniumgolemtitanEntity> {
    public WithireniumgolemtitanRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, (GeoModel)new WithireniumgolemtitanModel());
        this.f_114477_ = 0.6f;
        this.addRenderLayer(new WithireniumgolemtitanLayer((GeoRenderer<WithireniumgolemtitanEntity>)this));
        this.addRenderLayer(new Withireniumgolemtitanarmor((GeoRenderer<WithireniumgolemtitanEntity>)this));
    }

    public RenderType getRenderType(WithireniumgolemtitanEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
        return RenderType.m_110473_((ResourceLocation)this.m_5478_((Entity)animatable));
    }

    public boolean shouldRender(WithireniumgolemtitanEntity p_114491_, Frustum p_114492_, double p_114493_, double p_114494_, double p_114495_) {
        return true;
    }

    public void renderRecursively(PoseStack poseStack, WithireniumgolemtitanEntity animatable, GeoBone bone, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        if (!bone.getName().equals("weapon1")) {
            super.renderRecursively(poseStack, (Entity)animatable, bone, renderType, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
        }
    }

    public void preRender(PoseStack poseStack, WithireniumgolemtitanEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        float scale;
        this.scaleHeight = scale = 26.0f;
        this.scaleWidth = scale;
        super.preRender(poseStack, (Entity)entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
    }

    protected float getDeathMaxRotation(WithireniumgolemtitanEntity entityLivingBaseIn) {
        return 0.0f;
    }
}

