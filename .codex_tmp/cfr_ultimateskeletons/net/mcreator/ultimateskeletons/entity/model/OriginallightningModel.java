/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class OriginallightningModel
extends GeoModel<OriginallightningEntity> {
    public ResourceLocation getAnimationResource(OriginallightningEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/lightning.animation.json");
    }

    public ResourceLocation getModelResource(OriginallightningEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/lightning.geo.json");
    }

    public ResourceLocation getTextureResource(OriginallightningEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

