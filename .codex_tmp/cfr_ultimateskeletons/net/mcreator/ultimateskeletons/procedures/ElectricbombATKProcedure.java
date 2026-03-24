/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.entity.ElectricbombEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class ElectricbombATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        ElectricbombEntity _datEntI;
        ElectricbombEntity _datEntI2;
        ElectricbombEntity _datEntSetI;
        if (entity == null) {
            return;
        }
        if (entity instanceof ElectricbombEntity) {
            int n4;
            _datEntSetI = (ElectricbombEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof ElectricbombEntity) {
                _datEntI2 = (ElectricbombEntity)entity;
                n4 = (Integer)_datEntI2.m_20088_().m_135370_(ElectricbombEntity.DATA_gamaspawnTick);
            } else {
                n4 = 0;
            }
            synchedEntityData.m_135381_(ElectricbombEntity.DATA_gamaspawnTick, (Object)(n4 + 1));
        }
        if (entity instanceof ElectricbombEntity) {
            _datEntI = (ElectricbombEntity)entity;
            n3 = (Integer)_datEntI.m_20088_().m_135370_(ElectricbombEntity.DATA_gamaspawnTick);
        } else {
            n3 = 0;
        }
        if (n3 <= 1 && entity instanceof ElectricbombEntity) {
            ((ElectricbombEntity)entity).setAnimation("animation.ball");
        }
        if (entity instanceof ElectricbombEntity) {
            _datEntI = (ElectricbombEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(ElectricbombEntity.DATA_gamaspawnTick);
        } else {
            n2 = 0;
        }
        if (n2 >= 100) {
            if (entity instanceof ElectricbombEntity) {
                ElectricbombEntity _datEntSetI2 = (ElectricbombEntity)entity;
                _datEntSetI2.m_20088_().m_135381_(ElectricbombEntity.DATA_gamaspawnTick, (Object)0);
            }
            if (!entity.m_9236_().m_5776_()) {
                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
            }
        }
        if (entity instanceof ElectricbombEntity) {
            _datEntI = (ElectricbombEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(ElectricbombEntity.DATA_gamaspawnTick);
        } else {
            n = 0;
        }
        if (n >= 65) {
            if (world instanceof Level) {
                Level _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 40.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 40.0f, 1.0f, false);
                }
            }
            entity.m_20256_(new Vec3(0.0, -3.0, 0.0));
        } else {
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
        }
        if (entity.m_20096_()) {
            if (entity instanceof ElectricbombEntity) {
                int n5;
                _datEntSetI = (ElectricbombEntity)entity;
                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                if (entity instanceof ElectricbombEntity) {
                    _datEntI2 = (ElectricbombEntity)entity;
                    n5 = (Integer)_datEntI2.m_20088_().m_135370_(ElectricbombEntity.DATA_groundTick);
                } else {
                    n5 = 0;
                }
                synchedEntityData.m_135381_(ElectricbombEntity.DATA_groundTick, (Object)(n5 + 1));
            }
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel)world;
                Entity entityToSpawn = ((EntityType)UltimateskeletonsModEntities.DEATHSHOCK.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)y, (double)z), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn != null) {
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
            }
            if (!entity.m_9236_().m_5776_()) {
                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
            }
        }
    }
}

