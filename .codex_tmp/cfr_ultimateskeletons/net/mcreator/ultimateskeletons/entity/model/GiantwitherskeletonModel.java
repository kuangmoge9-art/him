/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.GiantwitherskeletonEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GiantwitherskeletonModel
extends GeoModel<GiantwitherskeletonEntity> {
    public ResourceLocation getAnimationResource(GiantwitherskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/giantwitherskeleton.animation.json");
    }

    public ResourceLocation getModelResource(GiantwitherskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/giantwitherskeleton.geo.json");
    }

    public ResourceLocation getTextureResource(GiantwitherskeletonEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

