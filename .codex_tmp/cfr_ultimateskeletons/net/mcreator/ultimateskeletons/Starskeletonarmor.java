/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons;

import net.mcreator.ultimateskeletons.entity.StarskeletonEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class Starskeletonarmor
extends GeoModel<StarskeletonEntity> {
    public ResourceLocation getAnimationResource(StarskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/starskeleton.animation.json");
    }

    public ResourceLocation getModelResource(StarskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/starskeletonarmor.geo.json");
    }

    public ResourceLocation getTextureResource(StarskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

