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
import net.mcreator.ultimateskeletons.entity.DeathlaserEntity;
import net.mcreator.ultimateskeletons.entity.DeathshockEntity;
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

public class DeathlaserATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        LivingEntity _entity;
        LivingEntity _livEnt;
        List<Entity> _entfound;
        Vec3 _center;
        DeathlaserEntity _datEntI;
        Level _level;
        int n2;
        int n3;
        DeathlaserEntity _datEntI2;
        DeathlaserEntity _datEntI3;
        DeathlaserEntity _datEntSetI;
        if (entity == null) {
            return;
        }
        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
        if (entity instanceof DeathlaserEntity) {
            int n4;
            _datEntSetI = (DeathlaserEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof DeathlaserEntity) {
                _datEntI3 = (DeathlaserEntity)entity;
                n4 = (Integer)_datEntI3.m_20088_().m_135370_(DeathlaserEntity.DATA_gamaspawnTick);
            } else {
                n4 = 0;
            }
            synchedEntityData.m_135381_(DeathlaserEntity.DATA_gamaspawnTick, (Object)(n4 + 1));
        }
        if (entity instanceof DeathlaserEntity) {
            _datEntI2 = (DeathlaserEntity)entity;
            n3 = (Integer)_datEntI2.m_20088_().m_135370_(DeathlaserEntity.DATA_gamaspawnTick);
        } else {
            n3 = 0;
        }
        if (n3 >= 30) {
            if (entity instanceof DeathlaserEntity) {
                DeathlaserEntity _datEntSetI2 = (DeathlaserEntity)entity;
                _datEntSetI2.m_20088_().m_135381_(DeathlaserEntity.DATA_gamaspawnTick, (Object)0);
            }
            if (!entity.m_9236_().m_5776_()) {
                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
            }
        }
        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
            if (entity instanceof DeathlaserEntity) {
                _datEntSetI = (DeathlaserEntity)entity;
                _datEntSetI.m_20088_().m_135381_(DeathlaserEntity.DATA_gamaTick, (Object)1);
            }
        } else if (entity instanceof DeathlaserEntity) {
            _datEntSetI = (DeathlaserEntity)entity;
            _datEntSetI.m_20088_().m_135381_(DeathlaserEntity.DATA_gamaTick, (Object)2);
        }
        if (entity instanceof DeathlaserEntity) {
            _datEntI2 = (DeathlaserEntity)entity;
            n2 = (Integer)_datEntI2.m_20088_().m_135370_(DeathlaserEntity.DATA_gamaTick);
        } else {
            n2 = 0;
        }
        if (n2 == 1) {
            int n5;
            int n6;
            if (entity instanceof DeathlaserEntity) {
                ((DeathlaserEntity)entity).setAnimation("animation.laser");
            }
            if (entity instanceof DeathlaserEntity) {
                _datEntI3 = (DeathlaserEntity)entity;
                n6 = (Integer)_datEntI3.m_20088_().m_135370_(DeathlaserEntity.DATA_gamaspawnTick);
            } else {
                n6 = 0;
            }
            if (n6 == 3 && world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 40.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 40.0f, 1.0f, false);
                }
            }
            if (entity instanceof DeathlaserEntity) {
                _datEntI3 = (DeathlaserEntity)entity;
                n5 = (Integer)_datEntI3.m_20088_().m_135370_(DeathlaserEntity.DATA_gamaspawnTick);
            } else {
                n5 = 0;
            }
            if (n5 >= 3) {
                int n7;
                if (entity instanceof DeathlaserEntity) {
                    _datEntI = (DeathlaserEntity)entity;
                    n7 = (Integer)_datEntI.m_20088_().m_135370_(DeathlaserEntity.DATA_gamaspawnTick);
                } else {
                    n7 = 0;
                }
                if (n7 <= 21) {
                    _center = new Vec3(x, y, z);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(50.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        float f;
                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                            if (entityiterator instanceof UltimatedeathskullEntity) continue;
                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage")))), 1280.0f);
                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 1280.0f);
                            continue;
                        }
                        if (entityiterator instanceof UltimatedeathskullEntity || entityiterator instanceof DeathlaserEntity || entityiterator instanceof DeathshockEntity || entityiterator instanceof Player) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))));
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f = _livEnt.m_21223_();
                        } else {
                            f = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f);
                        if (entityiterator instanceof LivingEntity) {
                            _entity = (LivingEntity)entityiterator;
                            _entity.m_21153_(0.0f);
                        }
                        if (entityiterator.m_9236_().m_5776_()) continue;
                        entityiterator.m_146870_();
                    }
                }
            }
        }
        if (entity instanceof DeathlaserEntity) {
            _datEntI2 = (DeathlaserEntity)entity;
            n = (Integer)_datEntI2.m_20088_().m_135370_(DeathlaserEntity.DATA_gamaTick);
        } else {
            n = 0;
        }
        if (n == 2) {
            int n8;
            int n9;
            if (entity instanceof DeathlaserEntity) {
                ((DeathlaserEntity)entity).setAnimation("animation.laser");
            }
            if (entity instanceof DeathlaserEntity) {
                _datEntI3 = (DeathlaserEntity)entity;
                n9 = (Integer)_datEntI3.m_20088_().m_135370_(DeathlaserEntity.DATA_gamaspawnTick);
            } else {
                n9 = 0;
            }
            if (n9 == 3 && world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 40.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 40.0f, 1.0f, false);
                }
            }
            if (entity instanceof DeathlaserEntity) {
                _datEntI3 = (DeathlaserEntity)entity;
                n8 = (Integer)_datEntI3.m_20088_().m_135370_(DeathlaserEntity.DATA_gamaspawnTick);
            } else {
                n8 = 0;
            }
            if (n8 >= 3) {
                int n10;
                if (entity instanceof DeathlaserEntity) {
                    _datEntI = (DeathlaserEntity)entity;
                    n10 = (Integer)_datEntI.m_20088_().m_135370_(DeathlaserEntity.DATA_gamaspawnTick);
                } else {
                    n10 = 0;
                }
                if (n10 <= 21) {
                    _center = new Vec3(x, y, z);
                    _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(50.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                    for (Entity entityiterator : _entfound) {
                        float f;
                        float f2;
                        if (entityiterator instanceof UltimatedeathskullEntity) continue;
                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                            float f3;
                            if (entityiterator instanceof DeathlaserEntity || entityiterator instanceof Player) continue;
                            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))));
                            if (entityiterator instanceof LivingEntity) {
                                _livEnt = (LivingEntity)entityiterator;
                                f3 = _livEnt.m_21223_();
                            } else {
                                f3 = -1.0f;
                            }
                            entityiterator.m_6469_(damageSource, f3);
                            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 2560.0f);
                            continue;
                        }
                        if (entityiterator instanceof UltimatedeathskullEntity || entityiterator instanceof DeathlaserEntity || entityiterator instanceof Player) continue;
                        DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))));
                        if (entityiterator instanceof LivingEntity) {
                            _livEnt = (LivingEntity)entityiterator;
                            f2 = _livEnt.m_21223_();
                        } else {
                            f2 = -1.0f;
                        }
                        entityiterator.m_6469_(damageSource, f2 / 2.0f + 640.0f);
                        if (!(entityiterator instanceof LivingEntity)) continue;
                        _entity = (LivingEntity)entityiterator;
                        if (entityiterator instanceof LivingEntity) {
                            LivingEntity _livEnt2 = (LivingEntity)entityiterator;
                            f = _livEnt2.m_21223_();
                        } else {
                            f = -1.0f;
                        }
                        _entity.m_21153_(f / 2.0f);
                    }
                }
            }
        }
    }
}

