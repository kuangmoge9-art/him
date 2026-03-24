/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.DemontiumgolemtitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DemontiumgolemtitanModel
extends GeoModel<DemontiumgolemtitanEntity> {
    public ResourceLocation getAnimationResource(DemontiumgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/irongolemtitan.animation.json");
    }

    public ResourceLocation getModelResource(DemontiumgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/irongolemtitan.geo.json");
    }

    public ResourceLocation getTextureResource(DemontiumgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

