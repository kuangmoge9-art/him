/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.DeathskullEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DeathskullModel
extends GeoModel<DeathskullEntity> {
    public ResourceLocation getAnimationResource(DeathskullEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/death.animation.json");
    }

    public ResourceLocation getModelResource(DeathskullEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/death.geo.json");
    }

    public ResourceLocation getTextureResource(DeathskullEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

