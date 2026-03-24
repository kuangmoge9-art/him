/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.CavespidertitanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CavespidertitanModel
extends GeoModel<CavespidertitanEntity> {
    public ResourceLocation getAnimationResource(CavespidertitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/spider.titan.animation.json");
    }

    public ResourceLocation getModelResource(CavespidertitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/spider.titan.geo.json");
    }

    public ResourceLocation getTextureResource(CavespidertitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

