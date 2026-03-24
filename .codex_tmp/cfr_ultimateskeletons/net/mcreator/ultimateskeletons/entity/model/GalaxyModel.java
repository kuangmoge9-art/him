/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.GalaxyEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GalaxyModel
extends GeoModel<GalaxyEntity> {
    public ResourceLocation getAnimationResource(GalaxyEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/galaxy.animation.json");
    }

    public ResourceLocation getModelResource(GalaxyEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/galaxy.geo.json");
    }

    public ResourceLocation getTextureResource(GalaxyEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

