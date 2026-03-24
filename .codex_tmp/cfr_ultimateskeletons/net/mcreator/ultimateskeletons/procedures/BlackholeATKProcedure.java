/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Holder
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.configuration.SkeletonsConfiguration;
import net.mcreator.ultimateskeletons.entity.BlackholeEntity;
import net.mcreator.ultimateskeletons.entity.VoidgolemtitanEntity;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class BlackholeATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        BlackholeEntity _datEntI;
        List<Entity> _entfound;
        Vec3 _center;
        if (entity == null) {
            return;
        }
        if (entity instanceof BlackholeEntity) {
            int n3;
            BlackholeEntity _datEntSetI = (BlackholeEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof BlackholeEntity) {
                BlackholeEntity _datEntI2 = (BlackholeEntity)entity;
                n3 = (Integer)_datEntI2.m_20088_().m_135370_(BlackholeEntity.DATA_Tick);
            } else {
                n3 = 0;
            }
            synchedEntityData.m_135381_(BlackholeEntity.DATA_Tick, (Object)(n3 + 1));
        }
        if (entity instanceof BlackholeEntity) {
            _center = new Vec3(x, y, z);
            _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(32.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound) {
                float f;
                double _setval = 1.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
                if (!(entityiterator instanceof BlackholeEntity) && !(entityiterator instanceof VoidgolemtitanEntity) && entityiterator instanceof LivingEntity && !(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                    entityiterator.f_19802_ = 0;
                    Deathlist.normalattack(entityiterator);
                }
                if (entityiterator instanceof BlackholeEntity || entityiterator instanceof VoidgolemtitanEntity) continue;
                entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 256000.0f);
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))));
                if (entityiterator instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21223_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f / 8.0f + 256000.0f);
            }
        }
        _center = new Vec3(x, y, z);
        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
        for (Entity entityiterator : _entfound) {
            if (entityiterator instanceof Titangodentity || entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
            entityiterator.m_20256_(new Vec3((entity.m_20185_() - entityiterator.m_20185_()) / (double)(entityiterator != null ? entity.m_20270_(entityiterator) : -1.0f) * 2.0, (entity.m_20186_() - entityiterator.m_20186_()) / (double)(entityiterator != null ? entity.m_20270_(entityiterator) : -1.0f) * 2.0, (entity.m_20189_() - entityiterator.m_20189_()) / (double)(entityiterator != null ? entity.m_20270_(entityiterator) : -1.0f) * 2.0));
        }
        if (entity instanceof BlackholeEntity) {
            _datEntI = (BlackholeEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(BlackholeEntity.DATA_Tick);
        } else {
            n2 = 0;
        }
        if (n2 > 80) {
            LivingEntity livingEntity;
            if (entity instanceof Mob) {
                Mob _mobEnt = (Mob)entity;
                livingEntity = _mobEnt.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                float f;
                LivingEntity _livEnt;
                if (entity instanceof Mob) {
                    Mob _mobEnt = (Mob)entity;
                    v6 = _mobEnt.m_5448_();
                } else {
                    v6 = _livEnt = null;
                }
                if (_livEnt instanceof LivingEntity) {
                    LivingEntity _livEnt2 = _livEnt;
                    f = _livEnt2.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    float f2;
                    LivingEntity livingEntity2;
                    if (entity instanceof Mob) {
                        Mob _mobEnt = (Mob)entity;
                        livingEntity2 = _mobEnt.m_5448_();
                    } else {
                        livingEntity2 = null;
                    }
                    if (livingEntity2 != null) {
                        LivingEntity livingEntity3;
                        if (entity instanceof Mob) {
                            Mob _mobEnt = (Mob)entity;
                            livingEntity3 = _mobEnt.m_5448_();
                        } else {
                            livingEntity3 = null;
                        }
                        f2 = entity.m_20270_(livingEntity3);
                    } else {
                        f2 = -1.0f;
                    }
                    if (f2 > 4.0f) {
                        float f3;
                        LivingEntity livingEntity4;
                        LivingEntity livingEntity5;
                        float f4;
                        LivingEntity livingEntity6;
                        LivingEntity livingEntity7;
                        float f5;
                        Mob _mobEnt;
                        LivingEntity livingEntity8;
                        Mob _mobEnt2;
                        LivingEntity livingEntity9;
                        Mob _mobEnt3;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity9 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity9 = null;
                        }
                        double d = livingEntity9.m_20185_() - entity.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity8 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity8 = null;
                        }
                        if (livingEntity8 != null) {
                            LivingEntity livingEntity10;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity10 = _mobEnt.m_5448_();
                            } else {
                                livingEntity10 = null;
                            }
                            f5 = entity.m_20270_(livingEntity10);
                        } else {
                            f5 = -1.0f;
                        }
                        double d2 = d / (double)f5 * 2.0;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity7 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity7 = null;
                        }
                        double d3 = livingEntity7.m_20186_() - entity.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity6 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity6 = null;
                        }
                        if (livingEntity6 != null) {
                            LivingEntity livingEntity11;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity11 = _mobEnt.m_5448_();
                            } else {
                                livingEntity11 = null;
                            }
                            f4 = entity.m_20270_(livingEntity11);
                        } else {
                            f4 = -1.0f;
                        }
                        double d4 = d3 / (double)f4 * 2.0;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity5 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity5 = null;
                        }
                        double d5 = livingEntity5.m_20189_() - entity.m_20189_();
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity4 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity4 = null;
                        }
                        if (livingEntity4 != null) {
                            LivingEntity livingEntity12;
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity12 = _mobEnt.m_5448_();
                            } else {
                                livingEntity12 = null;
                            }
                            f3 = entity.m_20270_(livingEntity12);
                        } else {
                            f3 = -1.0f;
                        }
                        entity.m_20256_(new Vec3(d2, d4, d5 / (double)f3 * 2.0));
                    }
                }
            }
        }
        if (entity instanceof BlackholeEntity) {
            _datEntI = (BlackholeEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(BlackholeEntity.DATA_Tick);
        } else {
            n = 0;
        }
        if (n <= 80) {
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
        }
    }
}

