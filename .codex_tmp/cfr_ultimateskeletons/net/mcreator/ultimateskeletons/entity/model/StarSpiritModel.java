/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.phys.Vec3
 *  software.bernie.geckolib.cache.object.GeoBone
 *  software.bernie.geckolib.core.animatable.GeoAnimatable
 *  software.bernie.geckolib.core.animatable.model.CoreGeoBone
 *  software.bernie.geckolib.core.animation.AnimationState
 *  software.bernie.geckolib.model.GeoModel
 */
package net.mcreator.ultimateskeletons.entity.model;

import net.mcreator.ultimateskeletons.MathUtils;
import net.mcreator.ultimateskeletons.entity.StarSpiritEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class StarSpiritModel
extends GeoModel<StarSpiritEntity> {
    public void setCustomAnimations(StarSpiritEntity animatable, long instanceId, AnimationState<StarSpiritEntity> animationState) {
        super.setCustomAnimations((GeoAnimatable)animatable, instanceId, animationState);
        CoreGeoBone swordLocate1 = this.getAnimationProcessor().getBone("starpoint1");
        CoreGeoBone swordLocate2 = this.getAnimationProcessor().getBone("starpoint2");
        CoreGeoBone swordLocate3 = this.getAnimationProcessor().getBone("starpoint3");
        CoreGeoBone swordLocate4 = this.getAnimationProcessor().getBone("starpoint4");
        Vec3 vec31 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate1);
        Vec3 vec32 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate2);
        Vec3 vec33 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate3);
        Vec3 vec34 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate4);
        animatable.updateTrail(vec31, vec32);
        animatable.updateTrail2(vec33, vec34);
    }

    public ResourceLocation getAnimationResource(StarSpiritEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/starskeleton.animation.json");
    }

    public ResourceLocation getModelResource(StarSpiritEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/starskeleton.geo.json");
    }

    public ResourceLocation getTextureResource(StarSpiritEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

