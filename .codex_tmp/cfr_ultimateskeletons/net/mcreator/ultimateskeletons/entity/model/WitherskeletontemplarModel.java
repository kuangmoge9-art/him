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
import net.mcreator.ultimateskeletons.entity.WitherskeletontemplarEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;

public class WitherskeletontemplarModel
extends GeoModel<WitherskeletontemplarEntity> {
    public void setCustomAnimations(WitherskeletontemplarEntity animatable, long instanceId, AnimationState<WitherskeletontemplarEntity> animationState) {
        super.setCustomAnimations((GeoAnimatable)animatable, instanceId, animationState);
        CoreGeoBone swordLocate1 = this.getAnimationProcessor().getBone("sword1");
        CoreGeoBone swordLocate2 = this.getAnimationProcessor().getBone("sword2");
        Vec3 vec31 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate1);
        Vec3 vec32 = MathUtils.getWorldPosFromModel((Entity)animatable, animatable.f_20883_, (GeoBone)swordLocate2);
        animatable.updateTrail(vec31, vec32);
    }

    public ResourceLocation getAnimationResource(WitherskeletontemplarEntity entity) {
        return new ResourceLocation("ultimateskeletons", "animations/witherskeletontemplar.animation.json");
    }

    public ResourceLocation getModelResource(WitherskeletontemplarEntity entity) {
        return new ResourceLocation("ultimateskeletons", "geo/witherskeletontemplar.geo.json");
    }

    public ResourceLocation getTextureResource(WitherskeletontemplarEntity entity) {
        return new ResourceLocation("ultimateskeletons", "textures/entities/" + entity.getTexture() + ".png");
    }
}

