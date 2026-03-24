/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.GiantskeletonEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GiantskeletonModel
extends GeoModel<GiantskeletonEntity> {
    public ResourceLocation getAnimationResource(GiantskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/giantskeleton.animation.json");
    }

    public ResourceLocation getModelResource(GiantskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/giantskeleton.geo.json");
    }

    public ResourceLocation getTextureResource(GiantskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

