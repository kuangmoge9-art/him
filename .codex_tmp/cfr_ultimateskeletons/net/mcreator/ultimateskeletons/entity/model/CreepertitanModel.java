/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.CreepertitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CreepertitanModel
extends GeoModel<CreepertitanEntity> {
    public ResourceLocation getAnimationResource(CreepertitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/creepertitan.animation.json");
    }

    public ResourceLocation getModelResource(CreepertitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/creepertitan.geo.json");
    }

    public ResourceLocation getTextureResource(CreepertitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

