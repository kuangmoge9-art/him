/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.ZombiepigmantitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ZombiepigmantitanModel
extends GeoModel<ZombiepigmantitanEntity> {
    public ResourceLocation getAnimationResource(ZombiepigmantitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/pigzombietitan.animation.json");
    }

    public ResourceLocation getModelResource(ZombiepigmantitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/pigzombietitan.geo.json");
    }

    public ResourceLocation getTextureResource(ZombiepigmantitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

