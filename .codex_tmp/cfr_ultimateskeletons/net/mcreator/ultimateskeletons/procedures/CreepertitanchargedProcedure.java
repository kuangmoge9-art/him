/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.entity.CreepertitanEntity;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;

public class CreepertitanchargedProcedure {
    public static void execute(Entity entity) {
        int n;
        if (entity == null) {
            return;
        }
        if (entity instanceof CreepertitanEntity) {
            CreepertitanEntity _datEntI = (CreepertitanEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
        } else {
            n = 0;
        }
        if (n < 3 && entity instanceof CreepertitanEntity) {
            int n2;
            CreepertitanEntity _datEntSetI = (CreepertitanEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof CreepertitanEntity) {
                CreepertitanEntity _datEntI = (CreepertitanEntity)entity;
                n2 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_chargeCount);
            } else {
                n2 = 0;
            }
            synchedEntityData.m_135381_(CreepertitanEntity.DATA_chargeCount, (Object)(n2 + 1));
        }
    }
}

