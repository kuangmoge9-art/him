/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class UltimatedeathskullModel
extends GeoModel<UltimatedeathskullEntity> {
    public ResourceLocation getAnimationResource(UltimatedeathskullEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/deathskull.animation.json");
    }

    public ResourceLocation getModelResource(UltimatedeathskullEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/deathskull.geo.json");
    }

    public ResourceLocation getTextureResource(UltimatedeathskullEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

