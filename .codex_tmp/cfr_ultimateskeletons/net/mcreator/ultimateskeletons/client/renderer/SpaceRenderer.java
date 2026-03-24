/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.EntityModel
 *  net.minecraft.client.model.SlimeModel
 *  net.minecraft.client.model.geom.ModelLayers
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.MobRenderer
 *  net.minecraft.resources.ResourceLocation
 */
package net.mcreator.ultimateskeletons.client.renderer;

import net.mcreator.ultimateskeletons.entity.SpaceEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.SlimeModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SpaceRenderer
extends MobRenderer<SpaceEntity, SlimeModel<SpaceEntity>> {
    public SpaceRenderer(EntityRendererProvider.Context context) {
        super(context, (EntityModel)new SlimeModel(context.m_174023_(ModelLayers.f_171241_)), 0.5f);
    }

    public ResourceLocation getTextureLocation(SpaceEntity entity) {
        return new ResourceLocation("ultimateskeletons:textures/entities/alhpa.png");
    }
}

