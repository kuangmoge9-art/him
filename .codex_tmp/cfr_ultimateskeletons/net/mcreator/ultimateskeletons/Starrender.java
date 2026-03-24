/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$DestFactor
 *  com.mojang.blaze3d.platform.GlStateManager$SourceFactor
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.DefaultVertexFormat
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$Mode
 *  net.minecraft.client.renderer.GameRenderer
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderStateShard$EmptyTextureStateShard
 *  net.minecraft.client.renderer.RenderStateShard$MultiTextureStateShard$Builder
 *  net.minecraft.client.renderer.RenderStateShard$ShaderStateShard
 *  net.minecraft.client.renderer.RenderStateShard$TransparencyStateShard
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.RenderType$CompositeState
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.cache.object.BakedGeoModel
 *  software.bernie.geckolib.core.animatable.GeoAnimatable
 *  software.bernie.geckolib.renderer.GeoRenderer
 *  software.bernie.geckolib.renderer.layer.GeoRenderLayer
 */
package net.mcreator.ultimateskeletons;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Random;
import net.mcreator.ultimateskeletons.entity.StarskeletonEntity;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class Starrender
extends GeoRenderLayer<StarskeletonEntity> {
    private static final ResourceLocation LAYER = new ResourceLocation("ultimateskeletons", "textures/entities/galaxyer.png");
    private static final ResourceLocation LAYERR = new ResourceLocation("ultimateskeletons", "textures/entities/alpha.png");
    private static final ResourceLocation LAYER1 = new ResourceLocation("ultimateskeletons", "textures/entities/staruni1.png");
    private static final ResourceLocation LAYER2 = new ResourceLocation("ultimateskeletons", "textures/entities/cosmic_4.png");
    private static final ResourceLocation LAYER3 = new ResourceLocation("ultimateskeletons", "textures/entities/staruni.png");
    private static final ResourceLocation LAYER4 = new ResourceLocation("ultimateskeletons", "textures/entities/grey.png");
    private static final ResourceLocation LAYER5 = new ResourceLocation("ultimateskeletons", "textures/entities/star2.png");
    private static final ResourceLocation MODEL_LOCATION = new ResourceLocation("the_cosmic_spokespersons", "geo/guardianofcausalitylayer.geo.json");
    private final Random random = new Random();
    public static final RenderStateShard.TransparencyStateShard TRANSPARENCY_STATESHARD = new RenderStateShard.TransparencyStateShard("lightning_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    public static final RenderType glowRenderType = RenderType.m_173215_((String)"end_portall", (VertexFormat)DefaultVertexFormat.f_85814_, (VertexFormat.Mode)VertexFormat.Mode.QUADS, (int)256, (boolean)false, (boolean)false, (RenderType.CompositeState)RenderType.CompositeState.m_110628_().m_173292_(new RenderStateShard.ShaderStateShard(GameRenderer::m_172755_)).m_173290_((RenderStateShard.EmptyTextureStateShard)new RenderStateShard.MultiTextureStateShard.Builder().m_173132_(LAYERR, false, false).m_173132_(LAYER, false, false).m_173131_()).m_110685_(TRANSPARENCY_STATESHARD).m_110691_(false));
    float red = this.random.nextFloat();
    float green = this.random.nextFloat();
    float blue = this.random.nextFloat();

    public Starrender(GeoRenderer<StarskeletonEntity> entityRenderer) {
        super(entityRenderer);
    }

    public void render(PoseStack poseStack, StarskeletonEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
        RenderSystem.disableCull();
        float tick = (float)animatable.f_19797_ * 1.0f % 2.0f;
        this.getRenderer().reRender(bakedModel, poseStack, bufferSource, (GeoAnimatable)animatable, glowRenderType, bufferSource.m_6299_(glowRenderType), partialTick, packedLight, OverlayTexture.f_118083_, this.red, this.green, this.blue, Math.abs(1.0f - tick));
    }
}

