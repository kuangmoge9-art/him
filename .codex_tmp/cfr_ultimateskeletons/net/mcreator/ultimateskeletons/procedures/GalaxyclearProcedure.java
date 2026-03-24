/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.entity.GalaxyEntity;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.Entity;

public class GalaxyclearProcedure {
    public static void execute(Entity entity) {
        int n;
        if (entity == null) {
            return;
        }
        if (entity instanceof GalaxyEntity) {
            int n2;
            GalaxyEntity _datEntSetI = (GalaxyEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof GalaxyEntity) {
                GalaxyEntity _datEntI = (GalaxyEntity)entity;
                n2 = (Integer)_datEntI.m_20088_().m_135370_(GalaxyEntity.DATA_animationTick);
            } else {
                n2 = 0;
            }
            synchedEntityData.m_135381_(GalaxyEntity.DATA_animationTick, (Object)(n2 + 1));
        }
        if (entity instanceof GalaxyEntity) {
            GalaxyEntity _datEntI = (GalaxyEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(GalaxyEntity.DATA_animationTick);
        } else {
            n = 0;
        }
        if (n >= 40) {
            if (entity instanceof GalaxyEntity) {
                GalaxyEntity _datEntSetI = (GalaxyEntity)entity;
                _datEntSetI.m_20088_().m_135381_(GalaxyEntity.DATA_animationTick, (Object)0);
            }
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
        }
    }
}

