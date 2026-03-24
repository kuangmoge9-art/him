/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.SolarskeletonEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SolarskeletonModel
extends GeoModel<SolarskeletonEntity> {
    public ResourceLocation getAnimationResource(SolarskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/huo_yan_hua_shen__-_converted.animation.json");
    }

    public ResourceLocation getModelResource(SolarskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/huo_yan_hua_shen__-_converted.geo.json");
    }

    public ResourceLocation getTextureResource(SolarskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

