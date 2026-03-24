/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.entity.GiantwitherskeletonEntity;
import net.minecraft.world.entity.Entity;

public class GiantwitherskeletonvisionProcedure {
    public static double execute(Entity entity) {
        int n;
        if (entity == null) {
            return 0.0;
        }
        if (entity instanceof GiantwitherskeletonEntity) {
            GiantwitherskeletonEntity _datEntI = (GiantwitherskeletonEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_growTick);
        } else {
            n = 0;
        }
        return 22 + n / 50;
    }
}

