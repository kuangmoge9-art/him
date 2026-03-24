/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  net.minecraft.client.model.HumanoidModel
 *  net.minecraft.client.model.geom.ModelLayers
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.HumanoidMobRenderer
 *  net.minecraft.client.renderer.entity.RenderLayerParent
 *  net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer
 *  net.minecraft.client.renderer.entity.layers.RenderLayer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import net.mcreator.ultimateskeletons.entity.TTTTEEEESSSSTTTTTEntity;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.resources.ResourceLocation;

public class TTTTEEEESSSSTTTTTRenderer
extends HumanoidMobRenderer<TTTTEEEESSSSTTTTTEntity, HumanoidModel<TTTTEEEESSSSTTTTTEntity>> {
    public TTTTEEEESSSSTTTTTRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel(context.m_174023_(ModelLayers.f_171162_)), 0.5f);
        this.m_115326_((RenderLayer)new HumanoidArmorLayer((RenderLayerParent)this, new HumanoidModel(context.m_174023_(ModelLayers.f_171164_)), new HumanoidModel(context.m_174023_(ModelLayers.f_171165_)), context.m_266367_()));
    }

    public void scale(TTTTEEEESSSSTTTTTEntity entity, PoseStack poseStack, float f) {
        poseStack.m_85841_(16.0f, 16.0f, 16.0f);
    }

    public ResourceLocation getTextureLocation(TTTTEEEESSSSTTTTTEntity entity) {
        return new ResourceLocation("ultimateskeletons:textures/entities/enchant.png");
    }
}

