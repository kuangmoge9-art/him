/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;

public class OriginallightninganimateProcedure {
    public static void execute(Entity entity) {
        int n;
        if (entity == null) {
            return;
        }
        if (entity instanceof OriginallightningEntity) {
            int n2;
            OriginallightningEntity _datEntSetI = (OriginallightningEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof OriginallightningEntity) {
                OriginallightningEntity _datEntI = (OriginallightningEntity)entity;
                n2 = (Integer)_datEntI.m_20088_().m_135370_(OriginallightningEntity.DATA_animationID);
            } else {
                n2 = 0;
            }
            synchedEntityData.m_135381_(OriginallightningEntity.DATA_animationID, (Object)(n2 + 1));
        }
        if (entity instanceof OriginallightningEntity) {
            OriginallightningEntity _datEntI = (OriginallightningEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(OriginallightningEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n >= 15 && !entity.m_9236_().m_5776_()) {
            entity.m_146870_();
        }
        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 1) {
            if (entity instanceof OriginallightningEntity) {
                ((OriginallightningEntity)entity).setAnimation("animation.original.lightning");
            }
        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 2) {
            if (entity instanceof OriginallightningEntity) {
                ((OriginallightningEntity)entity).setAnimation("animation.original.lightning2");
            }
        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 3) {
            if (entity instanceof OriginallightningEntity) {
                ((OriginallightningEntity)entity).setAnimation("animation.original.lightning3");
            }
        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 4) {
            if (entity instanceof OriginallightningEntity) {
                ((OriginallightningEntity)entity).setAnimation("animation.original.lightning4");
            }
        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 5) {
            if (entity instanceof OriginallightningEntity) {
                ((OriginallightningEntity)entity).setAnimation("animation.original.lightning5");
            }
        } else if (entity instanceof OriginallightningEntity) {
            ((OriginallightningEntity)entity).setAnimation("animation.original.lightning6");
        }
    }
}

