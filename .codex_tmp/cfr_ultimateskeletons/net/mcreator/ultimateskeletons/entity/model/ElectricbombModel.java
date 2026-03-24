/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.ElectricbombEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ElectricbombModel
extends GeoModel<ElectricbombEntity> {
    public ResourceLocation getAnimationResource(ElectricbombEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/electricball.animation.json");
    }

    public ResourceLocation getModelResource(ElectricbombEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/electricball.geo.json");
    }

    public ResourceLocation getTextureResource(ElectricbombEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

