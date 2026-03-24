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
import net.mcreator.ultimateskeletons.entity.AdamantiumgolemtitanEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class AdamantiumgolemtitanModel
extends GeoModel<AdamantiumgolemtitanEntity> {
    public void setCustomAnimations(AdamantiumgolemtitanEntity animatable, long instanceId, AnimationState<AdamantiumgolemtitanEntity> animationState) {
        super.setCustomAnimations((GeoAnimatable)animatable, instanceId, animationState);
        CoreGeoBone swordLocate1 = this.getAnimationProcessor().getBone("trailL1");
        CoreGeoBone swordLocate2 = this.getAnimationProcessor().getBone("trailL2");
        CoreGeoBone swordLocate3 = this.getAnimationProcessor().getBone("trailR1");
        CoreGeoBone swordLocate4 = this.getAnimationProcessor().getBone("trailR2");
        Vec3 vec31 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate1);
        Vec3 vec32 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate2);
        Vec3 vec33 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate3);
        Vec3 vec34 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate4);
        animatable.updateTrail(vec31, vec32);
        animatable.updateTrail2(vec33, vec34);
    }

    public ResourceLocation getAnimationResource(AdamantiumgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/irongolemtitan.animation.json");
    }

    public ResourceLocation getModelResource(AdamantiumgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/irongolemtitan.geo.json");
    }

    public ResourceLocation getTextureResource(AdamantiumgolemtitanEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

