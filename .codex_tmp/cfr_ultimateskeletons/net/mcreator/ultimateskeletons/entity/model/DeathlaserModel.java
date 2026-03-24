/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.DeathlaserEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DeathlaserModel
extends GeoModel<DeathlaserEntity> {
    public ResourceLocation getAnimationResource(DeathlaserEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/deathlaser.animation.json");
    }

    public ResourceLocation getModelResource(DeathlaserEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/deathlaser.geo.json");
    }

    public ResourceLocation getTextureResource(DeathlaserEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

