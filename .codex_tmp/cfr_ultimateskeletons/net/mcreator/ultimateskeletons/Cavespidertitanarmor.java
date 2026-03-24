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
import net.mcreator.ultimateskeletons.entity.CavespidertitanEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class Cavespidertitanarmor
extends GeoRenderLayer<CavespidertitanEntity> {
    public Cavespidertitanarmor(GeoRenderer<CavespidertitanEntity> entityRenderer) {
        super(entityRenderer);
    }

    public void render(PoseStack poseStack, CavespidertitanEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        float $10 = (float)animatable.f_19797_ + partialTick;
        float colorIntensity = (float)((double)0.2f + (Math.sin($10 * 0.1f) + 1.0) / 8.0);
        float red = (float)((double)0.3f + (Math.sin($10 * 0.1f) + 1.0) / 4.0);
        if (animatable.energy) {
            VertexConsumer $12 = bufferSource.m_6299_(RenderType.m_110436_((ResourceLocation)this.getTextureLocation(), (float)(this.xOffset($10) % 1.0f), (float)($10 * 0.01f % 1.0f)));
            RenderType glowRenderType = RenderType.m_110436_((ResourceLocation)this.getTextureLocation(), (float)(this.xOffset($10) % 1.0f), (float)($10 * 0.01f % 1.0f));
            this.getRenderer().reRender(this.getDefaultBakedModel((GeoAnimatable)animatable), poseStack, bufferSource, (GeoAnimatable)animatable, glowRenderType, bufferSource.m_6299_(glowRenderType), partialTick, packedLight, OverlayTexture.f_118083_, red, 0.0f, 0.0f, 0.6f);
        }
    }

    public float xOffset(float p_117702_) {
        return (float)(Math.cos(p_117702_ * 0.04f) * 8.0);
    }

    protected ResourceLocation getTextureLocation() {
        return new ResourceLocation("ultimateskeletons:textures/entities/armor.png");
    }
}

