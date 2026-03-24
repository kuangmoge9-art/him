/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.WithireniumgolemtitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WithireniumgolemtitanModel
extends GeoModel<WithireniumgolemtitanEntity> {
    public ResourceLocation getAnimationResource(WithireniumgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/irongolemtitan.animation.json");
    }

    public ResourceLocation getModelResource(WithireniumgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/irongolemtitan.geo.json");
    }

    public ResourceLocation getTextureResource(WithireniumgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

