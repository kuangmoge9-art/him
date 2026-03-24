/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.entity.DeathlaserEntity;
import net.mcreator.ultimateskeletons.entity.DeathwitherbeamEntity;
import net.mcreator.ultimateskeletons.entity.MultiversespaceEntity;
import net.mcreator.ultimateskeletons.entity.PushhandEntity;
import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class MultiversespaceATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        MultiversespaceEntity _datEntI;
        MultiversespaceEntity _datEntI2;
        if (entity == null) {
            return;
        }
        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
        if (entity instanceof MultiversespaceEntity) {
            int n4;
            MultiversespaceEntity _datEntSetI = (MultiversespaceEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof MultiversespaceEntity) {
                _datEntI2 = (MultiversespaceEntity)entity;
                n4 = (Integer)_datEntI2.m_20088_().m_135370_(MultiversespaceEntity.DATA_gamaspawnTick);
            } else {
                n4 = 0;
            }
            synchedEntityData.m_135381_(MultiversespaceEntity.DATA_gamaspawnTick, (Object)(n4 + 1));
        }
        if (entity instanceof MultiversespaceEntity) {
            _datEntI = (MultiversespaceEntity)entity;
            n3 = (Integer)_datEntI.m_20088_().m_135370_(MultiversespaceEntity.DATA_gamaspawnTick);
        } else {
            n3 = 0;
        }
        if (n3 >= 40) {
            if (entity instanceof MultiversespaceEntity) {
                MultiversespaceEntity _datEntSetI = (MultiversespaceEntity)entity;
                _datEntSetI.m_20088_().m_135381_(MultiversespaceEntity.DATA_gamaspawnTick, (Object)0);
            }
            if (!entity.m_9236_().m_5776_()) {
                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
            }
        }
        if (entity instanceof MultiversespaceEntity) {
            ((MultiversespaceEntity)entity).setAnimation("animation.space");
        }
        if (entity instanceof MultiversespaceEntity) {
            _datEntI = (MultiversespaceEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(MultiversespaceEntity.DATA_gamaspawnTick);
        } else {
            n2 = 0;
        }
        if (n2 == 2 && world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 40.0f, 1.0f);
            } else {
                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 40.0f, 1.0f, false);
            }
        }
        if (entity instanceof MultiversespaceEntity) {
            _datEntI = (MultiversespaceEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(MultiversespaceEntity.DATA_gamaspawnTick);
        } else {
            n = 0;
        }
        if (n >= 7) {
            int n5;
            int n6;
            if (entity instanceof MultiversespaceEntity) {
                _datEntI2 = (MultiversespaceEntity)entity;
                n6 = (Integer)_datEntI2.m_20088_().m_135370_(MultiversespaceEntity.DATA_gamaspawnTick);
            } else {
                n6 = 0;
            }
            if (n6 <= 9) {
                for (int index0 = 0; index0 < 12; ++index0) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE_1.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE_2.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MUTIVERSE.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE_3.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
                }
            }
            if (entity instanceof MultiversespaceEntity) {
                _datEntI2 = (MultiversespaceEntity)entity;
                n5 = (Integer)_datEntI2.m_20088_().m_135370_(MultiversespaceEntity.DATA_gamaspawnTick);
            } else {
                n5 = 0;
            }
            if (n5 <= 40) {
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(50.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                        if (entityiterator instanceof UltimatedeathskullEntity || entityiterator instanceof DeathwitherbeamEntity || entityiterator instanceof MultiversespaceEntity || entityiterator instanceof Player) continue;
                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage")))), 1280.0f);
                        entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 1280.0f);
                        continue;
                    }
                    if (entityiterator instanceof UltimatedeathskullEntity || entityiterator instanceof DeathlaserEntity || entityiterator instanceof DeathwitherbeamEntity || entityiterator instanceof PushhandEntity || entityiterator instanceof MultiversespaceEntity || entityiterator instanceof Player) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))));
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _entity = (LivingEntity)entityiterator;
                        _entity.m_21153_(0.0f);
                    }
                    if (entityiterator.m_9236_().m_5776_()) continue;
                    entityiterator.m_146870_();
                }
            }
        }
    }
}

