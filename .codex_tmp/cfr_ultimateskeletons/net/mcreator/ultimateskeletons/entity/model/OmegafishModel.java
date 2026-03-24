/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.OmegafishEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OmegafishModel
extends GeoModel<OmegafishEntity> {
    public ResourceLocation getAnimationResource(OmegafishEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/silverfishtitan.animation.json");
    }

    public ResourceLocation getModelResource(OmegafishEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/silverfishtitan.geo.json");
    }

    public ResourceLocation getTextureResource(OmegafishEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

