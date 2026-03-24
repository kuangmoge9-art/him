/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.CommandSource
 *  net.minecraft.commands.CommandSourceStack
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec2
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.RenderUtils;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.configuration.SkeletonsConfiguration;
import net.mcreator.ultimateskeletons.entity.ExplosionshockwaveEntity;
import net.mcreator.ultimateskeletons.entity.ExplosiontitanEntity;
import net.mcreator.ultimateskeletons.entity.ShiningEntity;
import net.mcreator.ultimateskeletons.entity.TitanspiritEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontemplarEntity;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class TitanspiritATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        TitanspiritEntity _datEntI;
        Mob _entity;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            LivingEntity _entity2 = (LivingEntity)entity;
            _entity2.m_21153_(1024.0f);
        }
        world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y, z, 0.0, 0.0, 0.0);
        if (entity instanceof TitanspiritEntity) {
            int n4;
            TitanspiritEntity _datEntSetI = (TitanspiritEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof TitanspiritEntity) {
                TitanspiritEntity _datEntI2 = (TitanspiritEntity)entity;
                n4 = (Integer)_datEntI2.m_20088_().m_135370_(TitanspiritEntity.DATA_spawnTick);
            } else {
                n4 = 0;
            }
            synchedEntityData.m_135381_(TitanspiritEntity.DATA_spawnTick, (Object)(n4 + 1));
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(8.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
        for (Entity entityiterator : _entfound) {
            Level _level;
            float f;
            LivingEntity _livEnt;
            if (entityiterator instanceof Titangodentity || entityiterator instanceof TitanspiritEntity) continue;
            DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity);
            if (entityiterator instanceof LivingEntity) {
                _livEnt = (LivingEntity)entityiterator;
                f = _livEnt.m_21233_();
            } else {
                f = -1.0f;
            }
            entityiterator.m_6469_(damageSource, f / 20.0f);
            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity), 200.0f);
            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity), 200.0f);
            entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity), 200.0f);
            if (entityiterator.m_20206_() > 6.0f) {
                float f2;
                float f3;
                float f4;
                float f5;
                LivingEntity _livEnt2;
                DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity);
                if (entityiterator instanceof LivingEntity) {
                    _livEnt2 = (LivingEntity)entityiterator;
                    f5 = _livEnt2.m_21223_();
                } else {
                    f5 = -1.0f;
                }
                if (entityiterator instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entityiterator;
                    f4 = _livEnt.m_21233_();
                } else {
                    f4 = -1.0f;
                }
                entityiterator.m_6469_(damageSource2, (f5 + f4) / 5.0f + 200.0f);
                DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity);
                if (entityiterator instanceof LivingEntity) {
                    _livEnt2 = (LivingEntity)entityiterator;
                    f3 = _livEnt2.m_21223_();
                } else {
                    f3 = -1.0f;
                }
                if (entityiterator instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entityiterator;
                    f2 = _livEnt.m_21233_();
                } else {
                    f2 = -1.0f;
                }
                entityiterator.m_6469_(damageSource3, (f3 + f2) / 5.0f + 200.0f);
            }
            if (entityiterator instanceof Player || !(entityiterator instanceof LivingEntity) || entityiterator instanceof ExplosionshockwaveEntity || entityiterator instanceof ExplosiontitanEntity || entityiterator instanceof ShiningEntity) continue;
            entityiterator.f_19802_ = 0;
            if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue()) {
                Deathlist.normalattack(entityiterator);
            }
            if (entity.m_5446_().getString().equals("skeletontitan") && entityiterator instanceof WitherskeletontemplarEntity) {
                Deathlist.normalattack(entityiterator);
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                RenderUtils.spawn1(10000, entity.m_20182_(), entity.m_9236_(), "growing");
                if (!entity.m_9236_().m_5776_()) {
                    entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                }
            }
            if (!entity.m_5446_().getString().equals("witherskeletontitan") || !(entityiterator instanceof WitherskeletontemplarEntity)) continue;
            Deathlist.normalattack(entityiterator);
            if (world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            RenderUtils.spawn(20000, entity.m_20182_(), entity.m_9236_(), "growing");
            if (entity.m_9236_().m_5776_()) continue;
            entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
        }
        _center = new Vec3(x, y, z);
        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
        for (Entity entityiterator : _entfound) {
            if (entityiterator instanceof Player || entityiterator instanceof Titangodentity || entityiterator instanceof TitanspiritEntity || !(entityiterator instanceof LivingEntity) || !(entity instanceof Mob)) continue;
            _entity = (Mob)entity;
            if (!(entityiterator instanceof LivingEntity)) continue;
            LivingEntity _ent = (LivingEntity)entityiterator;
            _entity.m_6710_(_ent);
        }
        _center = new Vec3(x, y, z);
        _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(80.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
        for (Entity entityiterator : _entfound) {
            if (entityiterator instanceof Titangodentity || entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
            entityiterator.m_20256_(new Vec3((entity.m_20185_() - entityiterator.m_20185_()) / (double)(entityiterator != null ? entity.m_20270_(entityiterator) : -1.0f) * 2.0, (entity.m_20186_() - entityiterator.m_20186_()) / (double)(entityiterator != null ? entity.m_20270_(entityiterator) : -1.0f) * 2.0, (entity.m_20189_() - entityiterator.m_20189_()) / (double)(entityiterator != null ? entity.m_20270_(entityiterator) : -1.0f) * 2.0));
        }
        if (entity instanceof TitanspiritEntity) {
            _datEntI = (TitanspiritEntity)entity;
            n3 = (Integer)_datEntI.m_20088_().m_135370_(TitanspiritEntity.DATA_killCount);
        } else {
            n3 = 0;
        }
        if (n3 >= 200) {
            Level _level;
            if (entity instanceof Mob) {
                Mob _entity3 = (Mob)entity;
                _entity3.m_6710_(null);
            }
            entity.m_20256_(new Vec3(0.0, -2.0, 0.0));
            if (!entity.m_9236_().m_5776_()) {
                entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
            }
            if (world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titancreation")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titancreation")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity.m_5446_().getString().equals("omegafish") && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:omegafish ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
            if (entity.m_5446_().getString().equals("cavespidertitan") && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:cavespidertitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
            if (entity.m_5446_().getString().equals("spidertitan") && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:spidertitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
            if (entity.m_5446_().getString().equals("skeletontitan") && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:skeletontitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
            if (entity.m_5446_().getString().equals("zombietitan") && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:zombietitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
            if (entity.m_5446_().getString().equals("creepertitan") && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:creepertitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
            if (entity.m_5446_().getString().equals("zombiepigmantitan") && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:zombiepigmantitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
            if (entity.m_5446_().getString().equals("blazetitan") && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:blazetitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
            if (entity.m_5446_().getString().equals("witherskeletontitan") && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:witherskeletontitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
            if (entity.m_5446_().getString().equals("ghasttitan") && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:ghasttitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
            if (entity.m_5446_().getString().equals("endermantitan") && world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, (ServerLevel)_level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:endermantitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
        }
        if (entity instanceof TitanspiritEntity) {
            _datEntI = (TitanspiritEntity)entity;
            n2 = (Integer)_datEntI.m_20088_().m_135370_(TitanspiritEntity.DATA_spawnTick);
        } else {
            n2 = 0;
        }
        if (n2 > 20) {
            LivingEntity livingEntity;
            if (entity instanceof Mob) {
                Mob _mobEnt = (Mob)entity;
                livingEntity = _mobEnt.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                float f;
                if (entity instanceof Mob) {
                    Mob _mobEnt = (Mob)entity;
                    v13 = _mobEnt.m_5448_();
                } else {
                    v13 = _entity = null;
                }
                if (_entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)_entity;
                    f = _livEnt.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    LivingEntity livingEntity2;
                    if (entity instanceof Mob) {
                        Mob _mobEnt = (Mob)entity;
                        livingEntity2 = _mobEnt.m_5448_();
                    } else {
                        livingEntity2 = null;
                    }
                    if (!(livingEntity2 instanceof Titangodentity)) {
                        float f6;
                        LivingEntity livingEntity3;
                        if (entity instanceof Mob) {
                            Mob _mobEnt = (Mob)entity;
                            livingEntity3 = _mobEnt.m_5448_();
                        } else {
                            livingEntity3 = null;
                        }
                        if (livingEntity3 != null) {
                            LivingEntity livingEntity4;
                            if (entity instanceof Mob) {
                                Mob _mobEnt = (Mob)entity;
                                livingEntity4 = _mobEnt.m_5448_();
                            } else {
                                livingEntity4 = null;
                            }
                            f6 = entity.m_20270_(livingEntity4);
                        } else {
                            f6 = -1.0f;
                        }
                        if (f6 > 4.0f) {
                            float f7;
                            LivingEntity livingEntity5;
                            LivingEntity livingEntity6;
                            float f8;
                            LivingEntity livingEntity7;
                            LivingEntity livingEntity8;
                            float f9;
                            Mob _mobEnt;
                            LivingEntity livingEntity9;
                            Mob _mobEnt2;
                            LivingEntity livingEntity10;
                            Mob _mobEnt3;
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity10 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity10 = null;
                            }
                            double d = livingEntity10.m_20185_() - entity.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity9 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity9 = null;
                            }
                            if (livingEntity9 != null) {
                                LivingEntity livingEntity11;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity11 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity11 = null;
                                }
                                f9 = entity.m_20270_(livingEntity11);
                            } else {
                                f9 = -1.0f;
                            }
                            double d2 = d / (double)f9;
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity8 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity8 = null;
                            }
                            double d3 = livingEntity8.m_20186_() - entity.m_20186_();
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity7 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity7 = null;
                            }
                            if (livingEntity7 != null) {
                                LivingEntity livingEntity12;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity12 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity12 = null;
                                }
                                f8 = entity.m_20270_(livingEntity12);
                            } else {
                                f8 = -1.0f;
                            }
                            double d4 = d3 / (double)f8;
                            if (entity instanceof Mob) {
                                _mobEnt3 = (Mob)entity;
                                livingEntity6 = _mobEnt3.m_5448_();
                            } else {
                                livingEntity6 = null;
                            }
                            double d5 = livingEntity6.m_20189_() - entity.m_20189_();
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity5 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity5 = null;
                            }
                            if (livingEntity5 != null) {
                                LivingEntity livingEntity13;
                                if (entity instanceof Mob) {
                                    _mobEnt = (Mob)entity;
                                    livingEntity13 = _mobEnt.m_5448_();
                                } else {
                                    livingEntity13 = null;
                                }
                                f7 = entity.m_20270_(livingEntity13);
                            } else {
                                f7 = -1.0f;
                            }
                            entity.m_20256_(new Vec3(d2, d4, d5 / (double)f7));
                        }
                    }
                }
            }
        }
        if (entity instanceof TitanspiritEntity) {
            _datEntI = (TitanspiritEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(TitanspiritEntity.DATA_spawnTick);
        } else {
            n = 0;
        }
        if (n <= 20) {
            entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
        }
    }
}

