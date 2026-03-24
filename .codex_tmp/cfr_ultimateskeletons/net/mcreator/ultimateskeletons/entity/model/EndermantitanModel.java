/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.EndermantitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class EndermantitanModel
extends GeoModel<EndermantitanEntity> {
    public ResourceLocation getAnimationResource(EndermantitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/endermantitan.animation.json");
    }

    public ResourceLocation getModelResource(EndermantitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/endermantitan.geo.json");
    }

    public ResourceLocation getTextureResource(EndermantitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

