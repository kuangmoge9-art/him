/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.SkeletontitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SkeletontitanModel
extends GeoModel<SkeletontitanEntity> {
    public ResourceLocation getAnimationResource(SkeletontitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/skeletontitan.animation.json");
    }

    public ResourceLocation getModelResource(SkeletontitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/skeletontitan.geo.json");
    }

    public ResourceLocation getTextureResource(SkeletontitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

