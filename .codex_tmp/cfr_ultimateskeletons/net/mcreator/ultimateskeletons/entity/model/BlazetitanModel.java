/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.BlazetitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BlazetitanModel
extends GeoModel<BlazetitanEntity> {
    public ResourceLocation getAnimationResource(BlazetitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/blazetitan.animation.json");
    }

    public ResourceLocation getModelResource(BlazetitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/blazetitan.geo.json");
    }

    public ResourceLocation getTextureResource(BlazetitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

