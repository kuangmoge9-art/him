/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.SunsEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SunsModel
extends GeoModel<SunsEntity> {
    public ResourceLocation getAnimationResource(SunsEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/sun.animation.json");
    }

    public ResourceLocation getModelResource(SunsEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/sun.geo.json");
    }

    public ResourceLocation getTextureResource(SunsEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

