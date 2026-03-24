/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.cache.object.BakedGeoModel
 *  software.bernie.geckolib.renderer.GeoEntityRenderer
 *  software.bernie.geckolib.renderer.GeoRenderer
 *  software.bernie.geckolib.renderer.layer.GeoRenderLayer
 */
package net.mcreator.ultimateskeletons;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.ultimateskeletons.entity.StarskeletonEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class Starglowlayer
extends GeoRenderLayer<StarskeletonEntity> {
    private static final ResourceLocation LAYER = new ResourceLocation("ultimateskeletons", "textures/entities/enchanted.png");

    public Starglowlayer(GeoRenderer<StarskeletonEntity> entityRenderer) {
        super(entityRenderer);
    }

    public void render(PoseStack poseStack, StarskeletonEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        RenderType glowRenderType = RenderType.m_110488_((ResourceLocation)LAYER);
        glowRenderType = RenderType.m_110436_((ResourceLocation)LAYER, (float)((float)animatable.f_19797_ * 0.004f), (float)((float)animatable.f_19797_ * 0.004f));
        GeoEntityRenderer entityRenderer = (GeoEntityRenderer)this.getRenderer();
        poseStack.m_85841_(1.01f, 1.01f, 1.01f);
    }
}

