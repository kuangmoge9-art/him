/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
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
import net.mcreator.ultimateskeletons.entity.ChainEntity;
import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
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

public class ChainATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        ChainEntity _datEntI;
        ChainEntity _datEntI2;
        if (entity == null) {
            return;
        }
        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
        if (entity instanceof ChainEntity) {
            int n3;
            ChainEntity _datEntSetI = (ChainEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof ChainEntity) {
                _datEntI2 = (ChainEntity)entity;
                n3 = (Integer)_datEntI2.m_20088_().m_135370_(ChainEntity.DATA_gamaspawnTick);
            } else {
                n3 = 0;
            }
            synchedEntityData.m_135381_(ChainEntity.DATA_gamaspawnTick, (Object)(n3 + 1));
        }
        if (entity instanceof ChainEntity) {
            _datEntI = (ChainEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(ChainEntity.DATA_gamaspawnTick);
        } else {
            n2 = 0;
        }
        if ((double)n2 >= Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)23.0, (double)30.0)) {
            if (entity instanceof ChainEntity) {
                ChainEntity _datEntSetI = (ChainEntity)entity;
                _datEntSetI.m_20088_().m_135381_(ChainEntity.DATA_gamaspawnTick, (Object)0);
            }
            if (!entity.m_9236_().m_5776_()) {
                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
            }
        }
        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 1) {
            if (entity instanceof ChainEntity) {
                ((ChainEntity)entity).setAnimation("animation.chain1");
            }
        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 2) {
            if (entity instanceof ChainEntity) {
                ((ChainEntity)entity).setAnimation("animation.chain2");
            }
        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 3) {
            if (entity instanceof ChainEntity) {
                ((ChainEntity)entity).setAnimation("animation.chain3");
            }
        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 4) {
            if (entity instanceof ChainEntity) {
                ((ChainEntity)entity).setAnimation("animation.chain4");
            }
        } else if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)6) == 5) {
            if (entity instanceof ChainEntity) {
                ((ChainEntity)entity).setAnimation("animation.chain5");
            }
        } else if (entity instanceof ChainEntity) {
            ((ChainEntity)entity).setAnimation("animation.chain6");
        }
        if (entity instanceof ChainEntity) {
            _datEntI = (ChainEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(ChainEntity.DATA_gamaspawnTick);
        } else {
            n = 0;
        }
        if (n == 1) {
            int n4;
            int n5;
            Level _level;
            int n6;
            if (world instanceof Level) {
                Level _level2 = (Level)world;
                if (!_level2.m_5776_()) {
                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:summonappearance")), SoundSource.NEUTRAL, 10.0f, 1.0f);
                } else {
                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:summonappearance")), SoundSource.NEUTRAL, 10.0f, 1.0f, false);
                }
            }
            if (entity instanceof ChainEntity) {
                _datEntI2 = (ChainEntity)entity;
                n6 = (Integer)_datEntI2.m_20088_().m_135370_(ChainEntity.DATA_gamaspawnTick);
            } else {
                n6 = 0;
            }
            if (n6 == 4 && world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 10.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 10.0f, 1.0f, false);
                }
            }
            if (entity instanceof ChainEntity) {
                _datEntI2 = (ChainEntity)entity;
                n5 = (Integer)_datEntI2.m_20088_().m_135370_(ChainEntity.DATA_gamaspawnTick);
            } else {
                n5 = 0;
            }
            if (n5 == 6 && world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:chain")), SoundSource.NEUTRAL, 10.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:chain")), SoundSource.NEUTRAL, 10.0f, 1.0f, false);
                }
            }
            if (entity instanceof ChainEntity) {
                _datEntI2 = (ChainEntity)entity;
                n4 = (Integer)_datEntI2.m_20088_().m_135370_(ChainEntity.DATA_gamaspawnTick);
            } else {
                n4 = 0;
            }
            if (n4 > 7) {
                int n7;
                if (entity instanceof ChainEntity) {
                    ChainEntity _datEntI3 = (ChainEntity)entity;
                    n7 = (Integer)_datEntI3.m_20088_().m_135370_(ChainEntity.DATA_gamaspawnTick);
                } else {
                    n7 = 0;
                }
                if (n7 < 25) {
                    Vec3 _center = new Vec3(x, y, z);
                    List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        float f;
                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                            if (entityiterator instanceof UltimatedeathskullEntity || entityiterator instanceof ChainEntity) continue;
                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage")))), 666.0f);
                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 666.0f);
                            continue;
                        }
                        if (entityiterator instanceof UltimatedeathskullEntity || entityiterator instanceof ChainEntity || entityiterator instanceof Player) continue;
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
}

