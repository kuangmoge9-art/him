/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffect
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class DeathcurecureProcedure {
    public static void execute(Entity entity) {
        float f;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _livEnt = (LivingEntity)entity;
            f = _livEnt.m_21223_();
        } else {
            f = -1.0f;
        }
        if (f > 0.0f && entity instanceof LivingEntity) {
            LivingEntity _livEnt;
            float f2;
            LivingEntity _entity = (LivingEntity)entity;
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt2 = (LivingEntity)entity;
                f2 = _livEnt2.m_21223_();
            } else {
                f2 = -1.0f;
            }
            _entity.m_21153_((float)((double)f2 + 0.2 * (double)(entity instanceof LivingEntity && (_livEnt = (LivingEntity)entity).m_21023_((MobEffect)UltimateskeletonsModMobEffects.DEATHCURE.get()) ? _livEnt.m_21124_((MobEffect)UltimateskeletonsModMobEffects.DEATHCURE.get()).m_19564_() : 0)));
        }
    }
}

