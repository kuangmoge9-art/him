/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.WardentitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WardentitanModel
extends GeoModel<WardentitanEntity> {
    public ResourceLocation getAnimationResource(WardentitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/wardentitan.animation.json");
    }

    public ResourceLocation getModelResource(WardentitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/wardentitan.geo.json");
    }

    public ResourceLocation getTextureResource(WardentitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

