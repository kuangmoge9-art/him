/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.DeathshockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DeathshockModel
extends GeoModel<DeathshockEntity> {
    public ResourceLocation getAnimationResource(DeathshockEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/deathshocker.animation.json");
    }

    public ResourceLocation getModelResource(DeathshockEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/deathshocker.geo.json");
    }

    public ResourceLocation getTextureResource(DeathshockEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

