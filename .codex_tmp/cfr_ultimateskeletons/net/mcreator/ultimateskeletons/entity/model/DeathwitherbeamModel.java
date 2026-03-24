/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.DeathwitherbeamEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DeathwitherbeamModel
extends GeoModel<DeathwitherbeamEntity> {
    public ResourceLocation getAnimationResource(DeathwitherbeamEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/deathwitherbeam.animation.json");
    }

    public ResourceLocation getModelResource(DeathwitherbeamEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/deathwitherbeam.geo.json");
    }

    public ResourceLocation getTextureResource(DeathwitherbeamEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

