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
import net.mcreator.ultimateskeletons.entity.StarlightDeathEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class StarlightDeathModel
extends GeoModel<StarlightDeathEntity> {
    public void setCustomAnimations(StarlightDeathEntity animatable, long instanceId, AnimationState<StarlightDeathEntity> animationState) {
        super.setCustomAnimations((GeoAnimatable)animatable, instanceId, animationState);
        CoreGeoBone swordLocate1 = this.getAnimationProcessor().getBone("blade1");
        CoreGeoBone swordLocate2 = this.getAnimationProcessor().getBone("blade2");
        Vec3 vec31 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate1);
        Vec3 vec32 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate2);
        animatable.updateTrail(vec31, vec32);
    }

    public ResourceLocation getAnimationResource(StarlightDeathEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/starlightskeleton.animation.json");
    }

    public ResourceLocation getModelResource(StarlightDeathEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/starlightskeleton.geo.json");
    }

    public ResourceLocation getTextureResource(StarlightDeathEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

