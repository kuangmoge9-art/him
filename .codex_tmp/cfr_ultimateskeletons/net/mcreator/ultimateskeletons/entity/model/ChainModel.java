/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.ChainEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ChainModel
extends GeoModel<ChainEntity> {
    public ResourceLocation getAnimationResource(ChainEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/chain.animation.json");
    }

    public ResourceLocation getModelResource(ChainEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/chain.geo.json");
    }

    public ResourceLocation getTextureResource(ChainEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

