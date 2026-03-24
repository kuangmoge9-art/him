/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.entity.DangerEntity;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;

public class DangerDangerProcedure {
    public static void execute(Entity entity) {
        int n;
        if (entity == null) {
            return;
        }
        double theta = 0.0;
        if (entity instanceof DangerEntity) {
            int n2;
            DangerEntity _datEntSetI = (DangerEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof DangerEntity) {
                DangerEntity _datEntI = (DangerEntity)entity;
                n2 = (Integer)_datEntI.m_20088_().m_135370_(DangerEntity.DATA_Tick);
            } else {
                n2 = 0;
            }
            synchedEntityData.m_135381_(DangerEntity.DATA_Tick, (Object)(n2 + 1));
        }
        if (entity instanceof DangerEntity) {
            DangerEntity _datEntI = (DangerEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(DangerEntity.DATA_Tick);
        } else {
            n = 0;
        }
        if (n > 20 && !entity.m_9236_().m_5776_()) {
            entity.m_146870_();
        }
    }
}

