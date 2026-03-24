/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffect
 *  net.minecraft.world.effect.MobEffectCategory
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 */
package net.mcreator.ultimateskeletons.potion;

import net.mcreator.ultimateskeletons.procedures.DeathcurecureProcedure;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class DeathcureMobEffect
extends MobEffect {
    public DeathcureMobEffect() {
        super(MobEffectCategory.BENEFICIAL, -10092442);
    }

    public void m_6742_(LivingEntity entity, int amplifier) {
        DeathcurecureProcedure.execute((Entity)entity);
    }

    public boolean m_6584_(int duration, int amplifier) {
        return true;
    }
}

