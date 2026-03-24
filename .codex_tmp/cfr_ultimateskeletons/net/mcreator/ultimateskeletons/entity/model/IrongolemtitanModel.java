/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.IrongolemtitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class IrongolemtitanModel
extends GeoModel<IrongolemtitanEntity> {
    public ResourceLocation getAnimationResource(IrongolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/irongolemtitan.animation.json");
    }

    public ResourceLocation getModelResource(IrongolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/irongolemtitan.geo.json");
    }

    public ResourceLocation getTextureResource(IrongolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

