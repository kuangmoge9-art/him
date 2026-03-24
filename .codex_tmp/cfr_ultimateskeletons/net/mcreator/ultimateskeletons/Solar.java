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
package net.mcreator.ultimateskeletons;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.ultimateskeletons.entity.SolarskeletonEntity;
import net.mcreator.ultimateskeletons.entity.model.SunsModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class Solar
extends GeoRenderLayer<SolarskeletonEntity> {
    private static final ResourceLocation LAYER = new ResourceLocation("ultimateskeletons", "textures/entities/sun.glow.png");
    private static final ResourceLocation MODEL = new ResourceLocation("ultimateskeletons", "geo/sun.geo.json");
    private static final ResourceLocation GMODEL = new ResourceLocation("ultimateskeletons", "geo/huo_yan_hua_shen__-_converted.geo.json");
    private final SunsModel sunModel = new SunsModel();

    public Solar(GeoRenderer<SolarskeletonEntity> entityRenderer) {
        super(entityRenderer);
    }

    public void render(PoseStack poseStack, SolarskeletonEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        RenderType glowRenderType = RenderType.m_110488_((ResourceLocation)LAYER);
        poseStack.m_85836_();
        poseStack.m_85837_(0.0, 3.5, 0.0);
        BakedGeoModel sunBakedModel = this.sunModel.getBakedModel(MODEL);
        this.getRenderer().reRender(sunBakedModel, poseStack, bufferSource, (GeoAnimatable)animatable, glowRenderType, bufferSource.m_6299_(glowRenderType), partialTick, packedLight, OverlayTexture.f_118083_, 1.0f, 1.0f, 1.0f, 1.0f);
        poseStack.m_85849_();
    }
}

