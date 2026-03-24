/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.ZombietitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ZombietitanModel
extends GeoModel<ZombietitanEntity> {
    public ResourceLocation getAnimationResource(ZombietitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/zombietitan.animation.json");
    }

    public ResourceLocation getModelResource(ZombietitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/zombietitan.geo.json");
    }

    public ResourceLocation getTextureResource(ZombietitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

