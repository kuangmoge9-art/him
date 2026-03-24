/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  com.mojang.math.Axis
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.culling.Frustum
 *  net.minecraft.client.renderer.entity.EntityRenderer
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mcreator.ultimateskeletons.client.model.Modelswordedge;
import net.mcreator.ultimateskeletons.entity.TitanswordedgeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class TitanswordedgeRenderer
extends EntityRenderer<TitanswordedgeEntity> {
    private static final ResourceLocation texture = new ResourceLocation("ultimateskeletons:textures/entities/slash.png");
    private final Modelswordedge model;

    public TitanswordedgeRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new Modelswordedge(context.m_174023_(Modelswordedge.LAYER_LOCATION));
    }

    public boolean shouldRender(TitanswordedgeEntity p_114491_, Frustum p_114492_, double p_114493_, double p_114494_, double p_114495_) {
        return true;
    }

    public void render(TitanswordedgeEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
        VertexConsumer vb = bufferIn.m_6299_(RenderType.m_110488_((ResourceLocation)this.getTextureLocation(entityIn)));
        poseStack.m_85836_();
        poseStack.m_85841_(8.0f, 8.0f, 8.0f);
        poseStack.m_252781_(Axis.f_252436_.m_252977_(Mth.m_14179_((float)partialTicks, (float)entityIn.f_19859_, (float)entityIn.m_146908_()) - 90.0f));
        poseStack.m_252781_(Axis.f_252403_.m_252977_(90.0f + Mth.m_14179_((float)partialTicks, (float)entityIn.f_19860_, (float)entityIn.m_146909_())));
        this.model.m_7695_(poseStack, vb, packedLightIn, OverlayTexture.f_118083_, 1.0f, 1.0f, 1.0f, 1.0f);
        poseStack.m_85849_();
        super.m_7392_((Entity)entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
    }

    public ResourceLocation getTextureLocation(TitanswordedgeEntity entity) {
        return texture;
    }
}

