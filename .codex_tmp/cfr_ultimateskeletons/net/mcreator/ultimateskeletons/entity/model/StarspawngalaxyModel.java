/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.StarspawngalaxyEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class StarspawngalaxyModel
extends GeoModel<StarspawngalaxyEntity> {
    public ResourceLocation getAnimationResource(StarspawngalaxyEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/starspawngalaxy.animation.json");
    }

    public ResourceLocation getModelResource(StarspawngalaxyEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/starspawngalaxy.geo.json");
    }

    public ResourceLocation getTextureResource(StarspawngalaxyEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

