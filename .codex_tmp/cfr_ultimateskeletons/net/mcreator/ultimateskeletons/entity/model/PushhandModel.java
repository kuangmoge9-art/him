/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.PushhandEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PushhandModel
extends GeoModel<PushhandEntity> {
    public ResourceLocation getAnimationResource(PushhandEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/pushhand.animation.json");
    }

    public ResourceLocation getModelResource(PushhandEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/pushhand.geo.json");
    }

    public ResourceLocation getTextureResource(PushhandEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

