/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.Vec3i
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.server.network.ServerGamePacketListenerImpl
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LightningBolt
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.LargeFireball
 *  net.minecraft.world.entity.projectile.Projectile
 *  net.minecraft.world.entity.projectile.SmallFireball
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.levelgen.Heightmap$Types
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.LightningChainEffect;
import net.mcreator.ultimateskeletons.entity.HarrowEntity;
import net.mcreator.ultimateskeletons.entity.SwordedgecutEntity;
import net.mcreator.ultimateskeletons.entity.SwordedgeslashEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontemplarEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Vec3i;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class WitherskeletontemplaratkProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        int n2;
        int n3;
        LivingEntity _entity;
        int n4;
        WitherskeletontemplarEntity _datEntSetI;
        List<Entity> _entfound;
        Vec3 _center;
        Level _level;
        Mob _mobEnt;
        int n5;
        Mob _mobEnt2;
        Mob _mobEnt3;
        int n6;
        int n7;
        LivingEntity _livEnt;
        int n8;
        WitherskeletontemplarEntity _datEntI;
        int n9;
        int n10;
        int n11;
        int n12;
        WitherskeletontemplarEntity _datEntI2;
        int n13;
        LivingEntity _entity2;
        LivingEntity _entity22;
        if (entity == null) {
            return;
        }
        double theta = 0.0;
        ((LivingEntity)entity).m_21051_(Attributes.f_22276_).m_22100_(4000.0);
        ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(222.0);
        if (entity instanceof LivingEntity && !(_entity22 = (LivingEntity)entity).m_9236_().m_5776_()) {
            _entity22.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 10000000, 3));
        }
        if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
            _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 10000000, 10));
        }
        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 1.0, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1), 0.1, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-0.1, (double)0.1));
        if (entity instanceof WitherskeletontemplarEntity) {
            int n14;
            WitherskeletontemplarEntity _datEntSetI2 = (WitherskeletontemplarEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI4 = (WitherskeletontemplarEntity)entity;
                n14 = (Integer)_datEntI4.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_spawnID);
            } else {
                n14 = 0;
            }
            synchedEntityData.m_135381_(WitherskeletontemplarEntity.DATA_spawnID, (Object)(n14 + 1));
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            WitherskeletontemplarEntity _datEntI3 = (WitherskeletontemplarEntity)entity;
            n13 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_spawnID);
        } else {
            n13 = 0;
        }
        if (n13 <= 113) {
            if (entity instanceof WitherskeletontemplarEntity) {
                ((WitherskeletontemplarEntity)entity).setAnimation("animation.spawn");
            }
            if (entity instanceof LivingEntity) {
                float f;
                LivingEntity _entity3 = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt2 = (LivingEntity)entity;
                    f = _livEnt2.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity3.m_21153_(f);
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n12 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_spawnID);
        } else {
            n12 = 0;
        }
        if (n12 == 97) {
            if (world instanceof Level) {
                Level _level2 = (Level)world;
                if (!_level2.m_5776_()) {
                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            for (int index0 = 0; index0 < 400; ++index0) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 1.5, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4));
            }
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n11 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_spawnID);
        } else {
            n11 = 0;
        }
        if (n11 == 102 && world instanceof Level) {
            Level _level3 = (Level)world;
            if (!_level3.m_5776_()) {
                _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletonshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
            } else {
                _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletonshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
            }
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n10 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationID);
        } else {
            n10 = 0;
        }
        if (n10 == 0 && entity instanceof WitherskeletontemplarEntity) {
            int n15;
            WitherskeletontemplarEntity _datEntSetI3 = (WitherskeletontemplarEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI3.m_20088_();
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI22 = (WitherskeletontemplarEntity)entity;
                n15 = (Integer)_datEntI22.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_spawnTick);
            } else {
                n15 = 0;
            }
            synchedEntityData.m_135381_(WitherskeletontemplarEntity.DATA_spawnTick, (Object)(n15 + 1));
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n9 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationID);
        } else {
            n9 = 0;
        }
        if (n9 != 0 && entity instanceof WitherskeletontemplarEntity) {
            int n16;
            WitherskeletontemplarEntity _datEntSetI4 = (WitherskeletontemplarEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI4.m_20088_();
            if (entity instanceof WitherskeletontemplarEntity) {
                _datEntI = (WitherskeletontemplarEntity)entity;
                n16 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n16 = 0;
            }
            synchedEntityData.m_135381_(WitherskeletontemplarEntity.DATA_animationTick, (Object)(n16 + 1));
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n8 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_spawnTick);
        } else {
            n8 = 0;
        }
        if (n8 == 80) {
            LivingEntity _entity5;
            if (entity instanceof LivingEntity && !(_entity5 = (LivingEntity)entity).m_9236_().m_5776_()) {
                _entity5.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 80, 9));
            }
            if (entity instanceof LivingEntity) {
                float f;
                LivingEntity _entity6 = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt2 = (LivingEntity)entity;
                    f = _livEnt2.m_21223_();
                } else {
                    f = -1.0f;
                }
                _entity6.m_21153_(f + 20.0f);
            }
            if (world instanceof Level) {
                Level _level4 = (Level)world;
                if (!_level4.m_5776_()) {
                    _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:summonappearance")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:summonappearance")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (world instanceof Level) {
                Level _level5 = (Level)world;
                if (!_level5.m_5776_()) {
                    _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                } else {
                    _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                }
            }
            if (world instanceof ServerLevel) {
                ServerLevel _level6 = (ServerLevel)world;
                _level6.m_8767_((ParticleOptions)ParticleTypes.f_123812_, x, y, z, 8, 4.0, 4.0, 4.0, 1.0);
            }
            Vec3 _center2 = new Vec3(x, y, z);
            List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(20.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
            for (Entity entity2 : _entfound2) {
                float f;
                if (entity2 instanceof WitherskeletontemplarEntity || !(entity2 instanceof LivingEntity)) continue;
                LivingEntity _entity4 = (LivingEntity)entity2;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21223_();
                } else {
                    f = -1.0f;
                }
                _entity4.m_21153_(f / 2.0f);
            }
            Vec3 _center3 = new Vec3(x, y, z);
            List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(100.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
            for (Entity entity3 : _entfound3) {
                if (!(entity3 instanceof WitherskeletontemplarEntity)) {
                    LivingEntity _entity3;
                    if (entity3 instanceof LivingEntity) {
                        _entity3 = (LivingEntity)entity3;
                        _entity3.m_21195_(MobEffects.f_19606_);
                    }
                    if (entity3 instanceof LivingEntity) {
                        _entity3 = (LivingEntity)entity3;
                        _entity3.m_21195_(MobEffects.f_19605_);
                    }
                    if (entity3 instanceof LivingEntity) {
                        _entity3 = (LivingEntity)entity3;
                        _entity3.m_21195_(MobEffects.f_19601_);
                    }
                }
                if (!(entity3 instanceof SmallFireball) || !(entity3 instanceof LargeFireball) || entity3.m_9236_().m_5776_()) continue;
                entity3.m_146870_();
            }
            for (int index1 = 0; index1 < 16; ++index1) {
                BlockPos start = new BlockPos((int)entity.m_20185_(), (int)entity.m_20186_(), (int)entity.m_20189_());
                LightningChainEffect.createLightningChainAtRandomPosition((Level)world, new Vec3((double)start.m_123341_(), (double)start.m_123342_(), (double)start.m_123343_()), entity);
            }
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n7 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_spawnTick);
        } else {
            n7 = 0;
        }
        if (n7 >= 160 && entity instanceof WitherskeletontemplarEntity) {
            WitherskeletontemplarEntity _datEntSetI5 = (WitherskeletontemplarEntity)entity;
            _datEntSetI5.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_spawnTick, (Object)0);
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n6 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_spawnID);
        } else {
            n6 = 0;
        }
        if (n6 > 113) {
            LivingEntity livingEntity;
            if (entity instanceof Mob) {
                Mob _mobEnt5 = (Mob)entity;
                livingEntity = _mobEnt5.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                float f;
                LivingEntity livingEntity2;
                if (entity instanceof Mob) {
                    Mob _mobEnt4 = (Mob)entity;
                    v18 = _mobEnt4.m_5448_();
                } else {
                    v18 = livingEntity2 = null;
                }
                if (livingEntity2 instanceof LivingEntity) {
                    LivingEntity _livEnt3 = livingEntity2;
                    f = _livEnt3.m_21223_();
                } else {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    int n17;
                    float f2;
                    LivingEntity livingEntity3;
                    float f3;
                    LivingEntity livingEntity4;
                    int n18;
                    if (entity instanceof WitherskeletontemplarEntity) {
                        WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                        n18 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationID);
                    } else {
                        n18 = 0;
                    }
                    if (n18 == 0) {
                        LivingEntity livingEntity5;
                        LivingEntity livingEntity6;
                        LivingEntity livingEntity7;
                        LivingEntity livingEntity8;
                        if (entity instanceof Mob) {
                            Mob _mobEnt32 = (Mob)entity;
                            livingEntity8 = _mobEnt32.m_5448_();
                        } else {
                            livingEntity8 = null;
                        }
                        double d = livingEntity8.m_20185_();
                        if (entity instanceof Mob) {
                            Mob _mobEnt22 = (Mob)entity;
                            livingEntity7 = _mobEnt22.m_5448_();
                        } else {
                            livingEntity7 = null;
                        }
                        double d2 = livingEntity7.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity6 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity6 = null;
                        }
                        double d3 = d2 + (double)livingEntity6.m_20206_() / 1.5;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity5 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity5 = null;
                        }
                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity5.m_20189_()));
                    }
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity4 = mob.m_5448_();
                    } else {
                        livingEntity4 = null;
                    }
                    if (livingEntity4 != null) {
                        LivingEntity livingEntity9;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity9 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity9 = null;
                        }
                        f3 = entity.m_20270_(livingEntity9);
                    } else {
                        f3 = -1.0f;
                    }
                    if (f3 >= 20.0f) {
                        entity.m_6858_(true);
                    } else {
                        entity.m_6858_(false);
                    }
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity3 = mob.m_5448_();
                    } else {
                        livingEntity3 = null;
                    }
                    if (livingEntity3 != null) {
                        LivingEntity livingEntity10;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity10 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity10 = null;
                        }
                        f2 = entity.m_20270_(livingEntity10);
                    } else {
                        f2 = -1.0f;
                    }
                    if (f2 > 4.0f) {
                        float f4;
                        LivingEntity livingEntity11;
                        LivingEntity livingEntity12;
                        float f5;
                        LivingEntity livingEntity13;
                        Mob _mobEnt4;
                        LivingEntity livingEntity14;
                        Mob _mobEnt5;
                        float f6;
                        LivingEntity livingEntity15;
                        LivingEntity livingEntity16;
                        if (entity instanceof Mob) {
                            Mob _mobEnt7 = (Mob)entity;
                            livingEntity16 = _mobEnt7.m_5448_();
                        } else {
                            livingEntity16 = null;
                        }
                        double d = livingEntity16.m_20185_() - entity.m_20185_();
                        if (entity instanceof Mob) {
                            Mob _mobEnt6 = (Mob)entity;
                            livingEntity15 = _mobEnt6.m_5448_();
                        } else {
                            livingEntity15 = null;
                        }
                        if (livingEntity15 != null) {
                            LivingEntity livingEntity17;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity17 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity17 = null;
                            }
                            f6 = entity.m_20270_(livingEntity17);
                        } else {
                            f6 = -1.0f;
                        }
                        double d4 = d / (double)f6 * 2.0;
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity14 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity14 = null;
                        }
                        double d5 = livingEntity14.m_20186_() - entity.m_20186_();
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity13 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity13 = null;
                        }
                        if (livingEntity13 != null) {
                            LivingEntity livingEntity18;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity18 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity18 = null;
                            }
                            f5 = entity.m_20270_(livingEntity18);
                        } else {
                            f5 = -1.0f;
                        }
                        double d6 = d5 / (double)f5 * 2.0;
                        if (entity instanceof Mob) {
                            _mobEnt5 = (Mob)entity;
                            livingEntity12 = _mobEnt5.m_5448_();
                        } else {
                            livingEntity12 = null;
                        }
                        double d7 = livingEntity12.m_20189_() - entity.m_20189_();
                        if (entity instanceof Mob) {
                            _mobEnt4 = (Mob)entity;
                            livingEntity11 = _mobEnt4.m_5448_();
                        } else {
                            livingEntity11 = null;
                        }
                        if (livingEntity11 != null) {
                            LivingEntity livingEntity19;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity19 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity19 = null;
                            }
                            f4 = entity.m_20270_(livingEntity19);
                        } else {
                            f4 = -1.0f;
                        }
                        entity.m_20256_(new Vec3(d4, d6, d7 / (double)f4 * 2.0));
                    }
                    if (entity instanceof WitherskeletontemplarEntity) {
                        WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                        n17 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationID);
                    } else {
                        n17 = 0;
                    }
                    if (n17 == 0 && Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)5) == 5) {
                        float f7;
                        LivingEntity livingEntity20;
                        WitherskeletontemplarEntity _datEntSetI2;
                        float f8;
                        LivingEntity livingEntity21;
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity21 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity21 = null;
                        }
                        if (livingEntity21 != null) {
                            LivingEntity livingEntity22;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity22 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity22 = null;
                            }
                            f8 = entity.m_20270_(livingEntity22);
                        } else {
                            f8 = -1.0f;
                        }
                        if (f8 < 120.0f) {
                            if (entity instanceof WitherskeletontemplarEntity) {
                                WitherskeletontemplarEntity _datEntSetI6 = (WitherskeletontemplarEntity)entity;
                                _datEntSetI6.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof WitherskeletontemplarEntity) {
                                _datEntSetI2 = (WitherskeletontemplarEntity)entity;
                                _datEntSetI2.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)2, (int)4));
                            }
                        }
                        if (entity instanceof Mob) {
                            _mobEnt3 = (Mob)entity;
                            livingEntity20 = _mobEnt3.m_5448_();
                        } else {
                            livingEntity20 = null;
                        }
                        if (livingEntity20 != null) {
                            LivingEntity livingEntity23;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity23 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity23 = null;
                            }
                            f7 = entity.m_20270_(livingEntity23);
                        } else {
                            f7 = -1.0f;
                        }
                        if (f7 < 9.0f) {
                            if (entity instanceof WitherskeletontemplarEntity) {
                                _datEntSetI2 = (WitherskeletontemplarEntity)entity;
                                _datEntSetI2.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof WitherskeletontemplarEntity) {
                                _datEntSetI2 = (WitherskeletontemplarEntity)entity;
                                _datEntSetI2.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4));
                            }
                        }
                    }
                } else if (entity.m_20186_() < -63.0) {
                    entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
                }
            } else if (entity.m_20186_() < -63.0) {
                entity.m_20256_(new Vec3(0.0, 1.0, 0.0));
            }
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n5 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationID);
        } else {
            n5 = 0;
        }
        if (n5 == 1) {
            int n19;
            int n20;
            int n21;
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI5 = (WitherskeletontemplarEntity)entity;
                n21 = (Integer)_datEntI5.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n21 = 0;
            }
            if (n21 == 12) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity = _mobEnt.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity24;
                    if (entity instanceof Mob) {
                        Mob _mobEnt8 = (Mob)entity;
                        livingEntity24 = _mobEnt8.m_5448_();
                    } else {
                        livingEntity24 = null;
                    }
                    f = entity.m_20270_(livingEntity24);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity25;
                    LivingEntity livingEntity26;
                    LivingEntity livingEntity27;
                    LivingEntity livingEntity28;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity28 = mob.m_5448_();
                    } else {
                        livingEntity28 = null;
                    }
                    double d = livingEntity28.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity27 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity27 = null;
                    }
                    double d8 = livingEntity27.m_20186_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity26 = mob.m_5448_();
                    } else {
                        livingEntity26 = null;
                    }
                    double d9 = d8 + (double)livingEntity26.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity25 = mob.m_5448_();
                    } else {
                        livingEntity25 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d9, livingEntity25.m_20189_()));
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x + entity.m_20154_().f_82479_ * 2.0, y, z + entity.m_20154_().f_82481_ * 2.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(6.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f9;
                    float f10;
                    if (entityiterator instanceof WitherskeletontemplarEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 66.0f);
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f10 = _livEnt.m_21233_();
                    } else {
                        f10 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f10 / 40.0f + 24.0f);
                    DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f9 = _livEnt.m_21233_();
                    } else {
                        f9 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource2, f9 / 40.0f + 24.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 12.0f);
                    if (entityiterator instanceof Player) continue;
                    entityiterator.f_19802_ = 0;
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI6 = (WitherskeletontemplarEntity)entity;
                n20 = (Integer)_datEntI6.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n20 = 0;
            }
            if (n20 == 25) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                _center = new Vec3(x + entity.m_20154_().f_82479_ * 2.0, y, z + entity.m_20154_().f_82481_ * 2.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(6.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f11;
                    if (entityiterator instanceof WitherskeletontemplarEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 66.0f);
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f11 = _livEnt.m_21233_();
                    } else {
                        f11 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f11 / 40.0f + 24.0f);
                    DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource3, f / 40.0f + 24.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 12.0f);
                    if (entityiterator instanceof Player) continue;
                    entityiterator.f_19802_ = 0;
                }
            }
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI7 = (WitherskeletontemplarEntity)entity;
                n19 = (Integer)_datEntI7.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n19 = 0;
            }
            if (n19 >= 43) {
                if (entity instanceof WitherskeletontemplarEntity) {
                    _datEntSetI = (WitherskeletontemplarEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WitherskeletontemplarEntity) {
                    _datEntSetI = (WitherskeletontemplarEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationID, (Object)0);
                }
            }
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n4 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationID);
        } else {
            n4 = 0;
        }
        if (n4 == 2) {
            int n22;
            int n23;
            int n24;
            int n25;
            int n26;
            int n27;
            int n28;
            WitherskeletontemplarEntity animatable;
            int n29;
            entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI8 = (WitherskeletontemplarEntity)entity;
                n29 = (Integer)_datEntI8.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n29 = 0;
            }
            if (n29 == 25 && entity instanceof WitherskeletontemplarEntity) {
                animatable = (WitherskeletontemplarEntity)entity;
                animatable.setTexture("alhpa");
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI9 = (WitherskeletontemplarEntity)entity;
                n28 = (Integer)_datEntI9.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n28 = 0;
            }
            if (n28 >= 26) {
                int n30;
                if (entity instanceof WitherskeletontemplarEntity) {
                    _datEntI = (WitherskeletontemplarEntity)entity;
                    n30 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                } else {
                    n30 = 0;
                }
                if (n30 <= 50) {
                    BlockPos start = new BlockPos((int)entity.m_20185_(), (int)entity.m_20186_(), (int)entity.m_20189_());
                    LightningChainEffect.createLightningChainAtRandomPosition((Level)world, new Vec3((double)start.m_123341_(), (double)start.m_123342_(), (double)start.m_123343_()), entity);
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI10 = (WitherskeletontemplarEntity)entity;
                n27 = (Integer)_datEntI10.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n27 = 0;
            }
            if (n27 == 28) {
                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                }
                if (world instanceof ServerLevel) {
                    _level = (ServerLevel)world;
                    LightningBolt entityToSpawn2 = (LightningBolt)EntityType.f_20465_.m_20615_(_level);
                    entityToSpawn2.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)x, (double)(y + 3.0), (double)z)));
                    entityToSpawn2.m_20874_(true);
                    _level.m_7967_((Entity)entityToSpawn2);
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:pili")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 1.0, z, 0.0, 0.0, 0.0);
                for (int index2 = 0; index2 < 500; ++index2) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 1.5, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-5, (int)5));
                }
                for (int index3 = 0; index3 < 16; ++index3) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level7 = (ServerLevel)world;
                    LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level7);
                    lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                    _level7.m_7967_((Entity)lightningBolt);
                }
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f12;
                    if (entityiterator instanceof WitherskeletontemplarEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f12 = _livEnt.m_21233_();
                    } else {
                        f12 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f12 / 48.0f + 48.0f);
                    DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource4, f / 48.0f + 48.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 48.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 88.0f);
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI11 = (WitherskeletontemplarEntity)entity;
                n26 = (Integer)_datEntI11.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n26 = 0;
            }
            if (n26 == 45 && world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletonshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletonshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI12 = (WitherskeletontemplarEntity)entity;
                n25 = (Integer)_datEntI12.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n25 = 0;
            }
            if (n25 == 62) {
                _center = new Vec3(x, y, z);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f13;
                    if (entityiterator instanceof WitherskeletontemplarEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f13 = _livEnt.m_21233_();
                    } else {
                        f13 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f13 / 48.0f + 48.0f);
                    DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource5, f / 48.0f + 48.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 48.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 88.0f);
                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3) != 3 || entityiterator instanceof Player || entityiterator instanceof SwordedgecutEntity || entityiterator instanceof SwordedgeslashEntity) continue;
                    entityiterator.m_142467_(Entity.RemovalReason.DISCARDED);
                    entityiterator.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                    entityiterator.m_142467_(Entity.RemovalReason.UNLOADED_WITH_PLAYER);
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI13 = (WitherskeletontemplarEntity)entity;
                n24 = (Integer)_datEntI13.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n24 = 0;
            }
            if (n24 == 63) {
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huidong")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:flashcut")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof ServerLevel) {
                    ServerLevel projectileLevel = (ServerLevel)world;
                    Projectile _entityToSpawn = new Object(){

                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                            SwordedgeslashEntity entityToSpawn = new SwordedgeslashEntity((EntityType<? extends SwordedgeslashEntity>)((EntityType)UltimateskeletonsModEntities.SWORDEDGESLASH.get()), level);
                            entityToSpawn.m_5602_(shooter);
                            entityToSpawn.m_36781_(damage);
                            entityToSpawn.m_36735_(knockback);
                            entityToSpawn.m_20225_(true);
                            entityToSpawn.m_36767_(piercing);
                            entityToSpawn.m_20254_(100);
                            entityToSpawn.m_36762_(true);
                            return entityToSpawn;
                        }
                    }.getArrow((Level)projectileLevel, entity, 1000.0f, 1, (byte)5);
                    _entityToSpawn.m_6034_(x, y + 1.8, z);
                    _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 4.0f, 0.0f);
                    projectileLevel.m_7967_((Entity)_entityToSpawn);
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI14 = (WitherskeletontemplarEntity)entity;
                n23 = (Integer)_datEntI14.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n23 = 0;
            }
            if (n23 >= 62) {
                int n31;
                if (entity instanceof WitherskeletontemplarEntity) {
                    _datEntI = (WitherskeletontemplarEntity)entity;
                    n31 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                } else {
                    n31 = 0;
                }
                if (n31 <= 70) {
                    for (int index4 = 0; index4 < 16; ++index4) {
                        int n32;
                        int n33;
                        int n34;
                        int n35;
                        SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYBLOCK.get();
                        double d = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n35 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n35 = 0;
                        }
                        double d10 = x + d * (double)(n35 - 60) * 4.0;
                        double d11 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n34 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n34 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType, d10, y + 6.0, z + d11 * (double)(n34 - 60) * 6.0, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-2, (int)2), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)0, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-2, (int)2));
                        SimpleParticleType simpleParticleType2 = (SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYBLOCK.get();
                        double d12 = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n33 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n33 = 0;
                        }
                        double d13 = x + d12 * (double)(n33 - 60) * 6.0;
                        double d14 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n32 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n32 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType2, d13, y + 4.0, z + d14 * (double)(n32 - 60) * 4.0, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-2, (int)2), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)0, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-2, (int)2));
                    }
                    for (int index5 = 0; index5 < 4; ++index5) {
                        int n36;
                        int n37;
                        int n38;
                        int n39;
                        int n40;
                        int n41;
                        int n42;
                        int n43;
                        int n44;
                        int n45;
                        int n46;
                        int n47;
                        SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get();
                        double d = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n47 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n47 = 0;
                        }
                        double d15 = x + d * (double)(n47 - 60) * 6.0;
                        double d16 = y + Math.random();
                        double d17 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n46 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n46 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType, d15, d16, z + d17 * (double)(n46 - 60) * 6.0, 3.0 * Math.cos(entity.m_146908_() + 90.0f), 0.0, 3.0 * Math.sin(entity.m_146908_() + 90.0f));
                        SimpleParticleType simpleParticleType3 = (SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get();
                        double d18 = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n45 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n45 = 0;
                        }
                        double d19 = x + d18 * (double)(n45 - 60) * 6.0;
                        double d20 = y + Math.random();
                        double d21 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n44 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n44 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType3, d19, d20, z + d21 * (double)(n44 - 60) * 6.0, 3.0 * Math.cos(entity.m_146908_() + 90.0f), 0.1, 3.0 * Math.sin(entity.m_146908_() + 90.0f));
                        SimpleParticleType simpleParticleType4 = (SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get();
                        double d22 = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n43 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n43 = 0;
                        }
                        double d23 = x + d22 * (double)(n43 - 60) * 6.0;
                        double d24 = y + Math.random();
                        double d25 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n42 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n42 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType4, d23, d24, z + d25 * (double)(n42 - 60) * 6.0, 3.0 * Math.cos(entity.m_146908_() + 90.0f), 0.2, 3.0 * Math.sin(entity.m_146908_() + 90.0f));
                        SimpleParticleType simpleParticleType5 = (SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get();
                        double d26 = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n41 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n41 = 0;
                        }
                        double d27 = x + d26 * (double)(n41 - 60) * 6.0;
                        double d28 = y + Math.random();
                        double d29 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n40 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n40 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType5, d27, d28, z + d29 * (double)(n40 - 60) * 6.0, 3.0 * Math.cos(entity.m_146908_() - 90.0f), 0.0, 3.0 * Math.sin(entity.m_146908_() - 90.0f));
                        SimpleParticleType simpleParticleType6 = (SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get();
                        double d30 = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n39 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n39 = 0;
                        }
                        double d31 = x + d30 * (double)(n39 - 60) * 6.0;
                        double d32 = y + Math.random();
                        double d33 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n38 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n38 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType6, d31, d32, z + d33 * (double)(n38 - 60) * 6.0, 3.0 * Math.cos(entity.m_146908_() - 90.0f), 0.1, 3.0 * Math.sin(entity.m_146908_() - 90.0f));
                        SimpleParticleType simpleParticleType7 = (SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get();
                        double d34 = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n37 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n37 = 0;
                        }
                        double d35 = x + d34 * (double)(n37 - 60) * 6.0;
                        double d36 = y + Math.random();
                        double d37 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n36 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n36 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType7, d35, d36, z + d37 * (double)(n36 - 60) * 6.0, 3.0 * Math.cos(entity.m_146908_() - 90.0f), 0.2, 3.0 * Math.sin(entity.m_146908_() - 90.0f));
                    }
                    for (int index6 = 0; index6 < 64; ++index6) {
                        int n48;
                        int n49;
                        int n50;
                        int n51;
                        SimpleParticleType simpleParticleType = (SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get();
                        double d = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n51 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n51 = 0;
                        }
                        double d38 = x + d * (double)(n51 - 60) * 3.0;
                        double d39 = y + Math.random();
                        double d40 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n50 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n50 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType, d38, d39, z + d40 * (double)(n50 - 60) * 3.0, 4.0 * Math.cos(entity.m_146908_() + (float)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)80, (int)100)), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)0, (int)0), 4.0 * Math.sin(entity.m_146908_() + (float)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)80, (int)100)));
                        SimpleParticleType simpleParticleType8 = (SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get();
                        double d41 = entity.m_20154_().f_82479_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n49 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n49 = 0;
                        }
                        double d42 = x + d41 * (double)(n49 - 60) * 3.0;
                        double d43 = y + Math.random();
                        double d44 = entity.m_20154_().f_82481_;
                        if (entity instanceof WitherskeletontemplarEntity) {
                            WitherskeletontemplarEntity witherskeletontemplarEntity = (WitherskeletontemplarEntity)entity;
                            n48 = (Integer)witherskeletontemplarEntity.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                        } else {
                            n48 = 0;
                        }
                        world.m_7106_((ParticleOptions)simpleParticleType8, d42, d43, z + d44 * (double)(n48 - 60) * 3.0, 4.0 * Math.cos(entity.m_146908_() - (float)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)80, (int)100)), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)0, (int)0), 4.0 * Math.sin(entity.m_146908_() - (float)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)80, (int)100)));
                    }
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI15 = (WitherskeletontemplarEntity)entity;
                n22 = (Integer)_datEntI15.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n22 = 0;
            }
            if (n22 >= 80) {
                if (entity instanceof WitherskeletontemplarEntity) {
                    _datEntSetI = (WitherskeletontemplarEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WitherskeletontemplarEntity) {
                    _datEntSetI = (WitherskeletontemplarEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WitherskeletontemplarEntity) {
                    animatable = (WitherskeletontemplarEntity)entity;
                    animatable.setTexture("wither_skeleton_templar");
                }
            }
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n3 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationID);
        } else {
            n3 = 0;
        }
        if (n3 == 3) {
            int n52;
            int n53;
            int n54;
            int n55;
            int n56;
            int n57;
            int n58;
            int n59;
            int n60;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof Mob) {
                Mob _mobEnt9 = (Mob)entity;
                livingEntity = _mobEnt9.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity29;
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity29 = _mobEnt.m_5448_();
                } else {
                    livingEntity29 = null;
                }
                f = entity.m_20270_(livingEntity29);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity30;
                LivingEntity livingEntity31;
                LivingEntity livingEntity32;
                LivingEntity _ent;
                if (entity instanceof Mob) {
                    Mob mob = (Mob)entity;
                    v171 = mob.m_5448_();
                } else {
                    v171 = _ent = null;
                }
                if (entity instanceof Mob) {
                    Mob mob = (Mob)entity;
                    livingEntity32 = mob.m_5448_();
                } else {
                    livingEntity32 = null;
                }
                double d = livingEntity32.m_20185_();
                double d45 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z);
                if (entity instanceof Mob) {
                    Mob mob = (Mob)entity;
                    livingEntity31 = mob.m_5448_();
                } else {
                    livingEntity31 = null;
                }
                _ent.m_6021_(d, d45, livingEntity31.m_20189_());
                if (_ent instanceof ServerPlayer) {
                    LivingEntity livingEntity33;
                    LivingEntity livingEntity34;
                    ServerPlayer serverPlayer = (ServerPlayer)_ent;
                    ServerGamePacketListenerImpl serverGamePacketListenerImpl = serverPlayer.f_8906_;
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity34 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity34 = null;
                    }
                    double d46 = livingEntity34.m_20185_();
                    double d47 = world.m_6924_(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int)x, (int)z);
                    if (entity instanceof Mob) {
                        _mobEnt2 = (Mob)entity;
                        livingEntity33 = _mobEnt2.m_5448_();
                    } else {
                        livingEntity33 = null;
                    }
                    serverGamePacketListenerImpl.m_9774_(d46, d47, livingEntity33.m_20189_(), _ent.m_146908_(), _ent.m_146909_());
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt10 = (Mob)entity;
                    livingEntity30 = _mobEnt10.m_5448_();
                } else {
                    livingEntity30 = null;
                }
                livingEntity30.m_20256_(new Vec3(0.0, 0.0, 0.0));
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI16 = (WitherskeletontemplarEntity)entity;
                n60 = (Integer)_datEntI16.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n60 = 0;
            }
            if (n60 == 1) {
                float f14;
                LivingEntity livingEntity35;
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity35 = _mobEnt.m_5448_();
                } else {
                    livingEntity35 = null;
                }
                if (livingEntity35 != null) {
                    LivingEntity livingEntity36;
                    if (entity instanceof Mob) {
                        Mob _mobEnt11 = (Mob)entity;
                        livingEntity36 = _mobEnt11.m_5448_();
                    } else {
                        livingEntity36 = null;
                    }
                    f14 = entity.m_20270_(livingEntity36);
                } else {
                    f14 = -1.0f;
                }
                if (f14 > 1.0f) {
                    LivingEntity livingEntity37;
                    LivingEntity livingEntity38;
                    LivingEntity livingEntity39;
                    LivingEntity livingEntity40;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity40 = mob.m_5448_();
                    } else {
                        livingEntity40 = null;
                    }
                    double d = livingEntity40.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity39 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity39 = null;
                    }
                    double d48 = livingEntity39.m_20186_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity38 = mob.m_5448_();
                    } else {
                        livingEntity38 = null;
                    }
                    double d49 = d48 + (double)livingEntity38.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity37 = mob.m_5448_();
                    } else {
                        livingEntity37 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d49, livingEntity37.m_20189_()));
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI17 = (WitherskeletontemplarEntity)entity;
                n59 = (Integer)_datEntI17.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n59 = 0;
            }
            if (n59 <= 41) {
                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI18 = (WitherskeletontemplarEntity)entity;
                n58 = (Integer)_datEntI18.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n58 = 0;
            }
            if (n58 >= 42) {
                int n61;
                if (entity instanceof WitherskeletontemplarEntity) {
                    _datEntI = (WitherskeletontemplarEntity)entity;
                    n61 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                } else {
                    n61 = 0;
                }
                if (n61 <= 58) {
                    entity.m_20256_(new Vec3(0.0, 0.6, 0.0));
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI19 = (WitherskeletontemplarEntity)entity;
                n57 = (Integer)_datEntI19.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n57 = 0;
            }
            if (n57 >= 59) {
                entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI20 = (WitherskeletontemplarEntity)entity;
                n56 = (Integer)_datEntI20.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n56 = 0;
            }
            if (n56 == 20) {
                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)ParticleTypes.f_123812_, x, y + 0.0, z, 0.0, 0.0, 0.0);
                _center = new Vec3(x, y, z);
                List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound3) {
                    float f15;
                    if (entityiterator instanceof WitherskeletontemplarEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f15 = _livEnt.m_21233_();
                    } else {
                        f15 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f15 / 4.0f + 0.0f);
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI21 = (WitherskeletontemplarEntity)entity;
                n55 = (Integer)_datEntI21.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n55 = 0;
            }
            if (n55 == 62) {
                if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 15, 1));
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:thunderstorm")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:thunderstorm")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.TEMPLARLIGHTNING.get()), x, y + 2.0, z, 0.0, 0.0, 0.0);
                if (theta >= 360.0) {
                    theta = 0.0;
                }
                if (theta == 0.0) {
                    for (int index7 = 0; index7 < 360; ++index7) {
                        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x + 0.2 * Math.cos(theta), y + 3.5, z + 0.2 * Math.sin(theta), 3.0 * Math.cos(theta), 0.0, 3.0 * Math.sin(theta));
                        theta += 1.0;
                    }
                }
                for (int index8 = 0; index8 < 16; ++index8) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel _level8 = (ServerLevel)world;
                    LightningBolt lightningBolt = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level8);
                    lightningBolt.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)(x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)), (double)y, (double)(z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-64, (int)64)))));
                    _level8.m_7967_((Entity)lightningBolt);
                }
                _center = new Vec3(x, y, z);
                List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound4) {
                    float f16;
                    if (entityiterator instanceof WitherskeletontemplarEntity) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f16 = _livEnt.m_21233_();
                    } else {
                        f16 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f16 / 4.0f + 0.0f);
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI22 = (WitherskeletontemplarEntity)entity;
                n54 = (Integer)_datEntI22.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n54 = 0;
            }
            if (n54 == 80 && world instanceof Level) {
                _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletonshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:witherskeletonshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI23 = (WitherskeletontemplarEntity)entity;
                n53 = (Integer)_datEntI23.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n53 = 0;
            }
            if (n53 == 94) {
                _center = new Vec3(x, y, z);
                List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(60.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound5) {
                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) != 2 || entityiterator instanceof WitherskeletontemplarEntity || entityiterator instanceof Player || entityiterator instanceof SwordedgecutEntity || entityiterator instanceof SwordedgeslashEntity) continue;
                    entityiterator.m_142467_(Entity.RemovalReason.DISCARDED);
                    entityiterator.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                    entityiterator.m_142467_(Entity.RemovalReason.UNLOADED_WITH_PLAYER);
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                for (int index9 = 0; index9 < 256; ++index9) {
                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STAR.get()), x, y + 2.0, z, (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
                }
                if (world instanceof ServerLevel) {
                    ServerLevel projectileLevel = (ServerLevel)world;
                    Projectile _entityToSpawn = new Object(){

                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                            SwordedgecutEntity entityToSpawn = new SwordedgecutEntity((EntityType<? extends SwordedgecutEntity>)((EntityType)UltimateskeletonsModEntities.SWORDEDGECUT.get()), level);
                            entityToSpawn.m_5602_(shooter);
                            entityToSpawn.m_36781_(damage);
                            entityToSpawn.m_36735_(knockback);
                            entityToSpawn.m_20225_(true);
                            entityToSpawn.m_36767_(piercing);
                            entityToSpawn.m_20254_(100);
                            entityToSpawn.m_36762_(true);
                            return entityToSpawn;
                        }
                    }.getArrow((Level)projectileLevel, entity, 1000.0f, 1, (byte)5);
                    _entityToSpawn.m_6034_(x, y + 1.8, z);
                    _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 4.0f, 0.0f);
                    projectileLevel.m_7967_((Entity)_entityToSpawn);
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI24 = (WitherskeletontemplarEntity)entity;
                n52 = (Integer)_datEntI24.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n52 = 0;
            }
            if (n52 >= 116) {
                if (entity instanceof WitherskeletontemplarEntity) {
                    WitherskeletontemplarEntity _datEntSetI7 = (WitherskeletontemplarEntity)entity;
                    _datEntSetI7.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WitherskeletontemplarEntity) {
                    WitherskeletontemplarEntity _datEntSetI8 = (WitherskeletontemplarEntity)entity;
                    _datEntSetI8.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationID, (Object)0);
                }
            }
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n2 = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationID);
        } else {
            n2 = 0;
        }
        if (n2 == 4) {
            int n62;
            int n63;
            int n64;
            int n65;
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI25 = (WitherskeletontemplarEntity)entity;
                n65 = (Integer)_datEntI25.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n65 = 0;
            }
            if (n65 == 1) {
                float f;
                LivingEntity livingEntity;
                if (entity instanceof Mob) {
                    Mob _mobEnt12 = (Mob)entity;
                    livingEntity = _mobEnt12.m_5448_();
                } else {
                    livingEntity = null;
                }
                if (livingEntity != null) {
                    LivingEntity livingEntity41;
                    if (entity instanceof Mob) {
                        Mob _mobEnt13 = (Mob)entity;
                        livingEntity41 = _mobEnt13.m_5448_();
                    } else {
                        livingEntity41 = null;
                    }
                    f = entity.m_20270_(livingEntity41);
                } else {
                    f = -1.0f;
                }
                if (f > 1.0f) {
                    LivingEntity livingEntity42;
                    LivingEntity livingEntity43;
                    LivingEntity livingEntity44;
                    LivingEntity livingEntity45;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity45 = mob.m_5448_();
                    } else {
                        livingEntity45 = null;
                    }
                    double d = livingEntity45.m_20185_();
                    if (entity instanceof Mob) {
                        _mobEnt3 = (Mob)entity;
                        livingEntity44 = _mobEnt3.m_5448_();
                    } else {
                        livingEntity44 = null;
                    }
                    double d50 = livingEntity44.m_20186_();
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity43 = mob.m_5448_();
                    } else {
                        livingEntity43 = null;
                    }
                    double d51 = d50 + (double)livingEntity43.m_20206_() / 1.5;
                    if (entity instanceof Mob) {
                        Mob mob = (Mob)entity;
                        livingEntity42 = mob.m_5448_();
                    } else {
                        livingEntity42 = null;
                    }
                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d51, livingEntity42.m_20189_()));
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI26 = (WitherskeletontemplarEntity)entity;
                n64 = (Integer)_datEntI26.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n64 = 0;
            }
            if (n64 >= 1) {
                int n66;
                if (entity instanceof WitherskeletontemplarEntity) {
                    WitherskeletontemplarEntity _datEntI27 = (WitherskeletontemplarEntity)entity;
                    n66 = (Integer)_datEntI27.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
                } else {
                    n66 = 0;
                }
                if (n66 <= 24) {
                    entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI28 = (WitherskeletontemplarEntity)entity;
                n63 = (Integer)_datEntI28.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n63 = 0;
            }
            if (n63 == 13) {
                LivingEntity _entity7;
                if (entity instanceof LivingEntity && !(_entity7 = (LivingEntity)entity).m_9236_().m_5776_()) {
                    _entity7.m_7292_(new MobEffectInstance(MobEffects.f_19601_, 5, 1));
                }
                if (world instanceof Level) {
                    Level _level9 = (Level)world;
                    if (!_level9.m_5776_()) {
                        _level9.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level9.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                for (int index10 = 0; index10 < 16; ++index10) {
                    if (world instanceof ServerLevel) {
                        ServerLevel projectileLevel = (ServerLevel)world;
                        Projectile projectile = new Object(){

                            public Projectile getFireball(Level level, Entity shooter) {
                                SmallFireball entityToSpawn = new SmallFireball(EntityType.f_20527_, level);
                                entityToSpawn.m_5602_(shooter);
                                return entityToSpawn;
                            }
                        }.getFireball((Level)projectileLevel, entity);
                        projectile.m_6034_(x + entity.m_20154_().f_82479_ * 2.0, y + 1.5, z + entity.m_20154_().f_82481_ * 2.0);
                        projectile.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 0.2f, 4.0f);
                        projectileLevel.m_7967_((Entity)projectile);
                    }
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel projectileLevel = (ServerLevel)world;
                    Projectile projectile = new Object(){

                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            HarrowEntity entityToSpawn = new HarrowEntity((EntityType<? extends HarrowEntity>)((EntityType)UltimateskeletonsModEntities.HARROW.get()), level);
                            entityToSpawn.m_5602_(shooter);
                            entityToSpawn.m_36781_(damage);
                            entityToSpawn.m_36735_(knockback);
                            entityToSpawn.m_20225_(true);
                            entityToSpawn.m_20254_(100);
                            entityToSpawn.m_36762_(true);
                            return entityToSpawn;
                        }
                    }.getArrow((Level)projectileLevel, entity, 500.0f, 1);
                    projectile.m_6034_(x + entity.m_20154_().f_82479_ * 1.0, y + 1.5, z + entity.m_20154_().f_82481_ * 1.0);
                    projectile.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 2.0f, 4.0f);
                    projectileLevel.m_7967_((Entity)projectile);
                }
                for (int index11 = 0; index11 < 12; ++index11) {
                    if (!(world instanceof ServerLevel)) continue;
                    ServerLevel projectileLevel = (ServerLevel)world;
                    Projectile projectile = new Object(){

                        public Projectile getFireball(Level level, Entity shooter) {
                            LargeFireball entityToSpawn = new LargeFireball(EntityType.f_20463_, level);
                            entityToSpawn.m_5602_(shooter);
                            return entityToSpawn;
                        }
                    }.getFireball((Level)projectileLevel, entity);
                    projectile.m_6034_(x + entity.m_20154_().f_82479_ * 2.0, y + 2.0, z + entity.m_20154_().f_82481_ * 2.0);
                    projectile.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 0.1f, 6.0f);
                    projectileLevel.m_7967_((Entity)projectile);
                }
                Vec3 _center3 = new Vec3(x, y, z);
                List<Entity> _entfound6 = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(4.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                for (Entity entityiterator : _entfound6) {
                    float f;
                    float f17;
                    if (entityiterator instanceof WitherskeletontemplarEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268526_)), 88.0f);
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f17 = _livEnt.m_21233_();
                    } else {
                        f17 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f17 / 80.0f + 40.0f);
                    DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f = _livEnt.m_21233_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource6, f / 80.0f + 40.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 40.0f);
                }
            }
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI29 = (WitherskeletontemplarEntity)entity;
                n62 = (Integer)_datEntI29.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n62 = 0;
            }
            if (n62 >= 25) {
                if (entity instanceof WitherskeletontemplarEntity) {
                    WitherskeletontemplarEntity _datEntSetI9 = (WitherskeletontemplarEntity)entity;
                    _datEntSetI9.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WitherskeletontemplarEntity) {
                    WitherskeletontemplarEntity _datEntSetI10 = (WitherskeletontemplarEntity)entity;
                    _datEntSetI10.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationID, (Object)0);
                }
            }
        }
        if (entity instanceof WitherskeletontemplarEntity) {
            _datEntI2 = (WitherskeletontemplarEntity)entity;
            n = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 6) {
            int n67;
            if (entity instanceof WitherskeletontemplarEntity) {
                WitherskeletontemplarEntity _datEntI30 = (WitherskeletontemplarEntity)entity;
                n67 = (Integer)_datEntI30.m_20088_().m_135370_(WitherskeletontemplarEntity.DATA_animationTick);
            } else {
                n67 = 0;
            }
            if (n67 >= 6) {
                if (entity instanceof WitherskeletontemplarEntity) {
                    WitherskeletontemplarEntity _datEntSetI11 = (WitherskeletontemplarEntity)entity;
                    _datEntSetI11.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof WitherskeletontemplarEntity) {
                    WitherskeletontemplarEntity _datEntSetI12 = (WitherskeletontemplarEntity)entity;
                    _datEntSetI12.m_20088_().m_135381_(WitherskeletontemplarEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof WitherskeletontemplarEntity) {
                    ((WitherskeletontemplarEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

