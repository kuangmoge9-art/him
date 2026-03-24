/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.StarlightblackholeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class StarlightblackholeModel
extends GeoModel<StarlightblackholeEntity> {
    public ResourceLocation getAnimationResource(StarlightblackholeEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/earth.animation.json");
    }

    public ResourceLocation getModelResource(StarlightblackholeEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/earth.geo.json");
    }

    public ResourceLocation getTextureResource(StarlightblackholeEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

