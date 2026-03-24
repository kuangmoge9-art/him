/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.cache.object.BakedGeoModel
 *  software.bernie.geckolib.core.animatable.GeoAnimatable
 *  software.bernie.geckolib.renderer.GeoRenderer
 *  software.bernie.geckolib.renderer.layer.GeoRenderLayer
 */
package net.mcreator.ultimateskeletons.entity.layer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.ultimateskeletons.entity.EnergyskeletontitanEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class EnergyskeletontitanLayer
extends GeoRenderLayer<EnergyskeletontitanEntity> {
    private static final ResourceLocation LAYER = new ResourceLocation("ultimateskeletons", "textures/entities/wither_skeleton_powerglow.png");

    public EnergyskeletontitanLayer(GeoRenderer<EnergyskeletontitanEntity> entityRenderer) {
        super(entityRenderer);
    }

    public void render(PoseStack poseStack, EnergyskeletontitanEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        float $10 = (float)animatable.f_19797_ + partialTick;
        float colorIntensity = (float)((double)0.33f + (Math.sin($10 * 0.1f) + 1.0) / 3.0);
        RenderType glowRenderType = RenderType.m_110488_((ResourceLocation)LAYER);
        this.getRenderer().reRender(this.getDefaultBakedModel((GeoAnimatable)animatable), poseStack, bufferSource, (GeoAnimatable)animatable, glowRenderType, bufferSource.m_6299_(glowRenderType), partialTick, packedLight, OverlayTexture.f_118083_, colorIntensity, colorIntensity, colorIntensity, 1.0f);
    }
}

