/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.TitanusgolemtitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TitanusgolemtitanModel
extends GeoModel<TitanusgolemtitanEntity> {
    public ResourceLocation getAnimationResource(TitanusgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/irongolemtitan.animation.json");
    }

    public ResourceLocation getModelResource(TitanusgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/irongolemtitan.geo.json");
    }

    public ResourceLocation getTextureResource(TitanusgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

