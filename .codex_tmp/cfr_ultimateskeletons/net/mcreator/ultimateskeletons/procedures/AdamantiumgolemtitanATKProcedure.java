/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.arguments.EntityAnchorArgument$Anchor
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.ParticleTypes
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
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
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.Projectile
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.configuration.SkeletonsConfiguration;
import net.mcreator.ultimateskeletons.entity.AdamanswordedgeEntity;
import net.mcreator.ultimateskeletons.entity.AdamantiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.GiantadamantiumEntity;
import net.mcreator.ultimateskeletons.entity.TitanusgolemtitanEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
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
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

public class AdamantiumgolemtitanATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        int n;
        Object _mobEnt;
        AdamantiumgolemtitanEntity _datEntI;
        block871: {
            int n2;
            block873: {
                LivingEntity _livEnt;
                List<Entity> _entfound;
                block872: {
                    int n3;
                    int n4;
                    int n5;
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    int n10;
                    float f;
                    LivingEntity livingEntity;
                    int n11;
                    int n12;
                    int n13;
                    int n14;
                    int n15;
                    int n16;
                    Object entityToSpawn;
                    int n17;
                    Vec3 _center;
                    int n18;
                    Mob _mobEnt2;
                    AdamantiumgolemtitanEntity _datEntI2;
                    AdamantiumgolemtitanEntity _datEntSetI;
                    Level _level;
                    double theta;
                    block868: {
                        int n19;
                        block870: {
                            block869: {
                                int n20;
                                int n21;
                                float f2;
                                LivingEntity livingEntity2;
                                int n22;
                                block865: {
                                    LivingEntity livingEntity3;
                                    block866: {
                                        block867: {
                                            LivingEntity livingEntity4;
                                            float f3;
                                            LivingEntity livingEntity5;
                                            LivingEntity livingEntity6;
                                            int n23;
                                            int n24;
                                            float f4;
                                            float f5;
                                            block862: {
                                                int n25;
                                                int n26;
                                                Titangodentity _datEntI3;
                                                block864: {
                                                    block863: {
                                                        int n27;
                                                        int n28;
                                                        int n29;
                                                        int n30;
                                                        ServerLevel _level2;
                                                        int n31;
                                                        int n32;
                                                        Mob _entity;
                                                        block861: {
                                                            int n33;
                                                            LivingEntity _entity2;
                                                            LivingEntity _entity22;
                                                            if (entity == null) {
                                                                return;
                                                            }
                                                            theta = 0.0;
                                                            ((LivingEntity)entity).m_21051_(Attributes.f_22285_).m_22100_(100.0);
                                                            if (entity instanceof LivingEntity && !(_entity22 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                _entity22.m_7292_(new MobEffectInstance(MobEffects.f_19606_, 10000000, 3));
                                                            }
                                                            if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).m_9236_().m_5776_()) {
                                                                _entity2.m_7292_(new MobEffectInstance(MobEffects.f_19605_, 10000000, 10));
                                                            }
                                                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                                                int n34;
                                                                AdamantiumgolemtitanEntity _datEntSetI2 = (AdamantiumgolemtitanEntity)entity;
                                                                SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                                                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                                                    AdamantiumgolemtitanEntity _datEntI32 = (AdamantiumgolemtitanEntity)entity;
                                                                    n34 = (Integer)_datEntI32.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                                                } else {
                                                                    n34 = 0;
                                                                }
                                                                synchedEntityData.m_135381_(AdamantiumgolemtitanEntity.DATA_spawnTick, (Object)(n34 + 1));
                                                            }
                                                            if (!entity.m_5446_().getString().equals("growing")) break block861;
                                                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                                                _datEntI = (AdamantiumgolemtitanEntity)entity;
                                                                n33 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                                            } else {
                                                                n33 = 0;
                                                            }
                                                            if (n33 <= 720) {
                                                                int n35;
                                                                int n36;
                                                                entity.m_6593_((Component)Component.m_237113_((String)"growing"));
                                                                entity.f_19802_ = 20;
                                                                if (entity instanceof LivingEntity) {
                                                                    ((LivingEntity)entity).f_20919_ = 0;
                                                                }
                                                                if (entity instanceof Mob) {
                                                                    _entity = (Mob)entity;
                                                                    _entity.m_6710_(null);
                                                                }
                                                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                                                    _datEntI3 = (AdamantiumgolemtitanEntity)entity;
                                                                    n36 = (Integer)_datEntI3.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                                                } else {
                                                                    n36 = 0;
                                                                }
                                                                if (n36 <= 10 && entity instanceof AdamantiumgolemtitanEntity) {
                                                                    ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.spawn");
                                                                }
                                                                if (entity instanceof TitanusgolemtitanEntity) {
                                                                    _datEntI3 = (TitanusgolemtitanEntity)entity;
                                                                    n35 = (Integer)_datEntI3.m_20088_().m_135370_(TitanusgolemtitanEntity.DATA_spawnTick);
                                                                } else {
                                                                    n35 = 0;
                                                                }
                                                                if (n35 == 720) {
                                                                    if (world instanceof Level) {
                                                                        _level = (Level)world;
                                                                        if (!_level.m_5776_()) {
                                                                            _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                                        } else {
                                                                            _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                                        }
                                                                    }
                                                                    if (!world.m_5776_() && world.m_7654_() != null) {
                                                                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Ultimate_adamantium_destroyer has been created!!!"), false);
                                                                    }
                                                                }
                                                                if (!entity.m_20096_() && entity.m_20186_() < -63.0) {
                                                                    entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                                                }
                                                            }
                                                            break block862;
                                                        }
                                                        if (entity instanceof AdamantiumgolemtitanEntity) {
                                                            _datEntI = (AdamantiumgolemtitanEntity)entity;
                                                            n32 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                                        } else {
                                                            n32 = 0;
                                                        }
                                                        if (n32 > 180) break block862;
                                                        entity.m_6593_((Component)Component.m_237113_((String)"Adamantium_destroyer"));
                                                        entity.f_19802_ = 20;
                                                        if (entity instanceof LivingEntity) {
                                                            ((LivingEntity)entity).f_20919_ = 0;
                                                        }
                                                        if (entity instanceof Mob) {
                                                            _entity = (Mob)entity;
                                                            _entity.m_6710_(null);
                                                        }
                                                        if (entity instanceof AdamantiumgolemtitanEntity) {
                                                            _datEntI3 = (AdamantiumgolemtitanEntity)entity;
                                                            n31 = (Integer)_datEntI3.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                                        } else {
                                                            n31 = 0;
                                                        }
                                                        if (n31 <= 1) {
                                                            if (world instanceof Level) {
                                                                Level _level22 = (Level)world;
                                                                if (!_level22.m_5776_()) {
                                                                    _level22.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 400.0f, 1.0f);
                                                                } else {
                                                                    _level22.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 400.0f, 1.0f, false);
                                                                }
                                                            }
                                                            if (world instanceof ServerLevel) {
                                                                _level2 = (ServerLevel)world;
                                                                Entity entityToSpawn2 = ((EntityType)UltimateskeletonsModEntities.YITAIBALL.get()).m_262496_(_level2, BlockPos.m_274561_((double)x, (double)(y + 50.0), (double)z), MobSpawnType.MOB_SUMMONED);
                                                                if (entityToSpawn2 != null) {
                                                                    entityToSpawn2.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                                                }
                                                            }
                                                        }
                                                        if (entity instanceof AdamantiumgolemtitanEntity) {
                                                            _datEntI3 = (AdamantiumgolemtitanEntity)entity;
                                                            n30 = (Integer)_datEntI3.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                                        } else {
                                                            n30 = 0;
                                                        }
                                                        if (n30 <= 10 && entity instanceof AdamantiumgolemtitanEntity) {
                                                            ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.release");
                                                        }
                                                        if (entity instanceof AdamantiumgolemtitanEntity) {
                                                            _datEntI3 = (AdamantiumgolemtitanEntity)entity;
                                                            n29 = (Integer)_datEntI3.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                                        } else {
                                                            n29 = 0;
                                                        }
                                                        if (n29 == 110) {
                                                            if (world instanceof Level) {
                                                                _level2 = (Level)world;
                                                                if (!_level2.m_5776_()) {
                                                                    _level2.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                                } else {
                                                                    _level2.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                                }
                                                            }
                                                            Vec3 _center2 = new Vec3(x, y, z);
                                                            List<Entity> _entfound2 = world.m_6443_(Entity.class, new AABB(_center2, _center2).m_82400_(512.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center2))).toList();
                                                            for (Entity entity2 : _entfound2) {
                                                                double _setval = 6.0;
                                                                entity2.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                                    capability.camerashake = _setval;
                                                                    capability.syncPlayerVariables(entity2);
                                                                });
                                                            }
                                                        }
                                                        if (entity instanceof AdamantiumgolemtitanEntity) {
                                                            _datEntI3 = (AdamantiumgolemtitanEntity)entity;
                                                            n28 = (Integer)_datEntI3.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                                        } else {
                                                            n28 = 0;
                                                        }
                                                        if (n28 == 51) break block863;
                                                        if (entity instanceof AdamantiumgolemtitanEntity) {
                                                            AdamantiumgolemtitanEntity _datEntI4 = (AdamantiumgolemtitanEntity)entity;
                                                            n27 = (Integer)_datEntI4.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                                        } else {
                                                            n27 = 0;
                                                        }
                                                        if (n27 != 147) break block864;
                                                    }
                                                    if (world instanceof Level) {
                                                        Level _level3 = (Level)world;
                                                        if (!_level3.m_5776_()) {
                                                            _level3.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 100.0f, 1.0f);
                                                        } else {
                                                            _level3.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 100.0f, 1.0f, false);
                                                        }
                                                    }
                                                    Vec3 _center3 = new Vec3(x, y, z);
                                                    _entfound = world.m_6443_(Entity.class, new AABB(_center3, _center3).m_82400_(512.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center3))).toList();
                                                    for (Entity entityiterator3 : _entfound) {
                                                        double _setval = 12.0;
                                                        entityiterator3.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                                            capability.camerashake = _setval;
                                                            capability.syncPlayerVariables(entityiterator3);
                                                        });
                                                    }
                                                    if (theta >= 360.0) {
                                                        theta = 0.0;
                                                    }
                                                    if (theta == 0.0) {
                                                        for (int index0 = 0; index0 < 360; ++index0) {
                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ADAMANBLOCK.get()), x + 4.0 * Math.cos(theta), y + 98.0, z + 4.0 * Math.sin(theta), 12.0 * Math.cos(theta), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), 12.0 * Math.sin(theta));
                                                            world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ADAMANBLOCK.get()), x + 4.0 * Math.cos(theta), y + 2.0, z + 4.0 * Math.sin(theta), 12.0 * Math.cos(theta), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), 12.0 * Math.sin(theta));
                                                            theta += 1.0;
                                                        }
                                                    }
                                                }
                                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                                    _datEntI3 = (AdamantiumgolemtitanEntity)entity;
                                                    n26 = (Integer)_datEntI3.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                                } else {
                                                    n26 = 0;
                                                }
                                                if (n26 == 147) {
                                                    if (theta >= 360.0) {
                                                        theta = 0.0;
                                                    }
                                                    if (theta == 0.0) {
                                                        for (int index1 = 0; index1 < 8; ++index1) {
                                                            if (world instanceof ServerLevel) {
                                                                ServerLevel projectileLevel = (ServerLevel)world;
                                                                Projectile _entityToSpawn = new Object(){

                                                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                                                        AdamanswordedgeEntity entityToSpawn = new AdamanswordedgeEntity((EntityType<? extends AdamanswordedgeEntity>)((EntityType)UltimateskeletonsModEntities.ADAMANSWORDEDGE.get()), level);
                                                                        entityToSpawn.m_5602_(shooter);
                                                                        entityToSpawn.m_36781_(damage);
                                                                        entityToSpawn.m_36735_(knockback);
                                                                        entityToSpawn.m_20225_(true);
                                                                        entityToSpawn.m_36767_(piercing);
                                                                        entityToSpawn.m_20254_(100);
                                                                        entityToSpawn.m_36762_(true);
                                                                        return entityToSpawn;
                                                                    }
                                                                }.getArrow((Level)projectileLevel, entity, 1000000.0f, 4, (byte)100);
                                                                _entityToSpawn.m_6034_(x + 8.0 * Math.cos(theta), y + 24.0, z + 8.0 * Math.sin(theta));
                                                                _entityToSpawn.m_6686_(Math.cos(theta), 0.0, Math.sin(theta), 6.0f, 0.0f);
                                                                projectileLevel.m_7967_((Entity)_entityToSpawn);
                                                            }
                                                            theta += 40.0;
                                                        }
                                                    }
                                                }
                                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                                    _datEntI3 = (AdamantiumgolemtitanEntity)entity;
                                                    n25 = (Integer)_datEntI3.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                                } else {
                                                    n25 = 0;
                                                }
                                                if (n25 == 180 && !world.m_5776_() && world.m_7654_() != null) {
                                                    world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"Ultimate_adamantium_destroyer has been released!!!"), false);
                                                }
                                                if (!entity.m_20096_() && entity.m_20186_() < -63.0) {
                                                    entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                                }
                                            }
                                            if (!world.m_5776_()) {
                                                int n37;
                                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                                    _datEntI = (AdamantiumgolemtitanEntity)entity;
                                                    n37 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                                                } else {
                                                    n37 = 0;
                                                }
                                                if (n37 != 0) {
                                                    float f6;
                                                    if (entity instanceof LivingEntity) {
                                                        LivingEntity _livEnt3 = (LivingEntity)entity;
                                                        f6 = _livEnt3.m_21223_();
                                                    } else {
                                                        f6 = -1.0f;
                                                    }
                                                    if (f6 <= 0.0f) {
                                                        for (int index2 = 0; index2 < 16; ++index2) {
                                                            if (!(entity instanceof AdamantiumgolemtitanEntity)) continue;
                                                            ((AdamantiumgolemtitanEntity)entity).setAnimation("empty");
                                                        }
                                                    }
                                                }
                                            }
                                            if (entity instanceof LivingEntity) {
                                                LivingEntity _livEnt2 = (LivingEntity)entity;
                                                f5 = _livEnt2.m_21223_();
                                            } else {
                                                f5 = -1.0f;
                                            }
                                            if (f5 > 0.0f) {
                                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                                    AdamantiumgolemtitanEntity _datEntSetI3 = (AdamantiumgolemtitanEntity)entity;
                                                    _datEntSetI3.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_deathTick, (Object)0);
                                                }
                                                for (int index3 = 0; index3 < 24; ++index3) {
                                                    world.m_7106_((ParticleOptions)ParticleTypes.f_175830_, x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), y + Math.random() * (double)entity.m_20206_(), z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0) * (double)entity.m_20205_(), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0));
                                                }
                                            }
                                            if (entity instanceof LivingEntity) {
                                                LivingEntity _livEnt2 = (LivingEntity)entity;
                                                f4 = _livEnt2.m_21223_();
                                            } else {
                                                f4 = -1.0f;
                                            }
                                            if (f4 <= 0.0f) {
                                                int n38;
                                                if (entity instanceof Mob) {
                                                    Mob _entity = (Mob)entity;
                                                    _entity.m_6710_(null);
                                                }
                                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                                    AdamantiumgolemtitanEntity _datEntI5 = (AdamantiumgolemtitanEntity)entity;
                                                    n38 = (Integer)_datEntI5.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                                                } else {
                                                    n38 = 0;
                                                }
                                                if (n38 == 0) {
                                                    int n39;
                                                    int n40;
                                                    if (entity instanceof AdamantiumgolemtitanEntity) {
                                                        int n41;
                                                        _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                        if (entity instanceof AdamantiumgolemtitanEntity) {
                                                            AdamantiumgolemtitanEntity _datEntI6 = (AdamantiumgolemtitanEntity)entity;
                                                            n41 = (Integer)_datEntI6.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_deathTick);
                                                        } else {
                                                            n41 = 0;
                                                        }
                                                        synchedEntityData.m_135381_(AdamantiumgolemtitanEntity.DATA_deathTick, (Object)(n41 + 1));
                                                    }
                                                    if (entity instanceof AdamantiumgolemtitanEntity) {
                                                        AdamantiumgolemtitanEntity _datEntI22 = (AdamantiumgolemtitanEntity)entity;
                                                        n40 = (Integer)_datEntI22.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_deathTick);
                                                    } else {
                                                        n40 = 0;
                                                    }
                                                    if (n40 == 1 && world instanceof Level) {
                                                        Level _level4 = (Level)world;
                                                        if (!_level4.m_5776_()) {
                                                            _level4.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 200.0f, 0.8f);
                                                        } else {
                                                            _level4.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death")), SoundSource.NEUTRAL, 200.0f, 0.8f, false);
                                                        }
                                                    }
                                                    if (entity instanceof AdamantiumgolemtitanEntity) {
                                                        ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.death");
                                                    }
                                                    if (entity instanceof AdamantiumgolemtitanEntity) {
                                                        _datEntI2 = (AdamantiumgolemtitanEntity)entity;
                                                        n39 = (Integer)_datEntI2.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_deathTick);
                                                    } else {
                                                        n39 = 0;
                                                    }
                                                    if (n39 >= 600 && !entity.m_9236_().m_5776_()) {
                                                        entity.m_142467_(Entity.RemovalReason.UNLOADED_TO_CHUNK);
                                                    }
                                                }
                                            }
                                            if (world.m_5776_()) break block865;
                                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                                _datEntI = (AdamantiumgolemtitanEntity)entity;
                                                n24 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_spawnTick);
                                            } else {
                                                n24 = 0;
                                            }
                                            if (n24 <= 180) break block865;
                                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                                AdamantiumgolemtitanEntity _datEntI7 = (AdamantiumgolemtitanEntity)entity;
                                                n23 = (Integer)_datEntI7.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                                            } else {
                                                n23 = 0;
                                            }
                                            if (n23 != 0 && entity instanceof AdamantiumgolemtitanEntity) {
                                                int n42;
                                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                                SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                                    AdamantiumgolemtitanEntity _datEntI8 = (AdamantiumgolemtitanEntity)entity;
                                                    n42 = (Integer)_datEntI8.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                                                } else {
                                                    n42 = 0;
                                                }
                                                synchedEntityData.m_135381_(AdamantiumgolemtitanEntity.DATA_animationTick, (Object)(n42 + 1));
                                            }
                                            if (entity instanceof Mob) {
                                                Mob _mobEnt3 = (Mob)entity;
                                                livingEntity6 = _mobEnt3.m_5448_();
                                            } else {
                                                livingEntity6 = null;
                                            }
                                            if (livingEntity6 == null) break block866;
                                            if (entity instanceof Mob) {
                                                _mobEnt2 = (Mob)entity;
                                                v27 = _mobEnt2.m_5448_();
                                            } else {
                                                v27 = livingEntity5 = null;
                                            }
                                            if (livingEntity5 instanceof LivingEntity) {
                                                LivingEntity _livEnt4 = livingEntity5;
                                                f3 = _livEnt4.m_21223_();
                                            } else {
                                                f3 = -1.0f;
                                            }
                                            if (f3 <= 0.0f) break block867;
                                            if (entity instanceof Mob) {
                                                _mobEnt = (Mob)entity;
                                                livingEntity4 = _mobEnt.m_5448_();
                                            } else {
                                                livingEntity4 = null;
                                            }
                                            if (livingEntity4.m_6084_()) break block866;
                                        }
                                        if (entity instanceof Mob) {
                                            Mob mob = (Mob)entity;
                                            mob.m_6710_(null);
                                        }
                                    }
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt4 = (Mob)entity;
                                        livingEntity3 = _mobEnt4.m_5448_();
                                    } else {
                                        livingEntity3 = null;
                                    }
                                    if (livingEntity3 != null) {
                                        float f7;
                                        LivingEntity livingEntity7;
                                        LivingEntity livingEntity8;
                                        LivingEntity livingEntity9;
                                        LivingEntity livingEntity10;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity10 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity10 = null;
                                        }
                                        double d = livingEntity10.m_20185_();
                                        if (entity instanceof Mob) {
                                            Mob _mobEnt5 = (Mob)entity;
                                            livingEntity9 = _mobEnt5.m_5448_();
                                        } else {
                                            livingEntity9 = null;
                                        }
                                        double d2 = livingEntity9.m_20186_();
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity8 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity8 = null;
                                        }
                                        double d3 = d2 + (double)livingEntity8.m_20206_() / 1.5;
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            livingEntity7 = _mobEnt2.m_5448_();
                                        } else {
                                            livingEntity7 = null;
                                        }
                                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d3, livingEntity7.m_20189_()));
                                        if (entity instanceof Mob) {
                                            _mobEnt2 = (Mob)entity;
                                            v38 = _mobEnt2.m_5448_();
                                        } else {
                                            v38 = _mobEnt = null;
                                        }
                                        if (_mobEnt instanceof LivingEntity) {
                                            LivingEntity _livEnt5 = (LivingEntity)_mobEnt;
                                            f7 = _livEnt5.m_21223_();
                                        } else {
                                            f7 = -1.0f;
                                        }
                                        if (f7 > 0.0f) {
                                            int n43;
                                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                                AdamantiumgolemtitanEntity _datEntI9 = (AdamantiumgolemtitanEntity)entity;
                                                n43 = (Integer)_datEntI9.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                                            } else {
                                                n43 = 0;
                                            }
                                            if (n43 == 0) {
                                                float f8;
                                                LivingEntity livingEntity11;
                                                Mob _mobEnt3;
                                                Mob _mobEnt4;
                                                Mob _mobEnt5;
                                                Mob _mobEnt6;
                                                float f9;
                                                LivingEntity livingEntity12;
                                                float f10;
                                                LivingEntity livingEntity13;
                                                if (entity instanceof Mob) {
                                                    Mob mob = (Mob)entity;
                                                    livingEntity13 = mob.m_5448_();
                                                } else {
                                                    livingEntity13 = null;
                                                }
                                                if (livingEntity13 != null) {
                                                    LivingEntity livingEntity14;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt11 = (Mob)entity;
                                                        livingEntity14 = _mobEnt11.m_5448_();
                                                    } else {
                                                        livingEntity14 = null;
                                                    }
                                                    f10 = entity.m_20270_(livingEntity14);
                                                } else {
                                                    f10 = -1.0f;
                                                }
                                                if (f10 >= 160.0f) {
                                                    entity.m_6858_(true);
                                                } else {
                                                    entity.m_6858_(false);
                                                }
                                                if (entity instanceof Mob) {
                                                    Mob mob = (Mob)entity;
                                                    livingEntity12 = mob.m_5448_();
                                                } else {
                                                    livingEntity12 = null;
                                                }
                                                if (livingEntity12 != null) {
                                                    LivingEntity livingEntity15;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt12 = (Mob)entity;
                                                        livingEntity15 = _mobEnt12.m_5448_();
                                                    } else {
                                                        livingEntity15 = null;
                                                    }
                                                    f9 = entity.m_20270_(livingEntity15);
                                                } else {
                                                    f9 = -1.0f;
                                                }
                                                if (f9 > 75.0f) {
                                                    float f11;
                                                    LivingEntity livingEntity16;
                                                    LivingEntity livingEntity17;
                                                    float f12;
                                                    LivingEntity livingEntity18;
                                                    LivingEntity livingEntity19;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt9 = (Mob)entity;
                                                        livingEntity19 = _mobEnt9.m_5448_();
                                                    } else {
                                                        livingEntity19 = null;
                                                    }
                                                    double d4 = livingEntity19.m_20185_() - entity.m_20185_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity18 = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity18 = null;
                                                    }
                                                    if (livingEntity18 != null) {
                                                        LivingEntity livingEntity20;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt13 = (Mob)entity;
                                                            livingEntity20 = _mobEnt13.m_5448_();
                                                        } else {
                                                            livingEntity20 = null;
                                                        }
                                                        f12 = entity.m_20270_(livingEntity20);
                                                    } else {
                                                        f12 = -1.0f;
                                                    }
                                                    double d5 = d4 / (double)f12 * 0.7;
                                                    if (entity instanceof Mob) {
                                                        _mobEnt5 = (Mob)entity;
                                                        livingEntity17 = _mobEnt5.m_5448_();
                                                    } else {
                                                        livingEntity17 = null;
                                                    }
                                                    double d6 = livingEntity17.m_20189_() - entity.m_20189_();
                                                    if (entity instanceof Mob) {
                                                        _mobEnt6 = (Mob)entity;
                                                        livingEntity16 = _mobEnt6.m_5448_();
                                                    } else {
                                                        livingEntity16 = null;
                                                    }
                                                    if (livingEntity16 != null) {
                                                        LivingEntity livingEntity21;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt14 = (Mob)entity;
                                                            livingEntity21 = _mobEnt14.m_5448_();
                                                        } else {
                                                            livingEntity21 = null;
                                                        }
                                                        f11 = entity.m_20270_(livingEntity21);
                                                    } else {
                                                        f11 = -1.0f;
                                                    }
                                                    entity.m_20256_(new Vec3(d5, 0.0, d6 / (double)f11 * 0.7));
                                                } else {
                                                    LivingEntity livingEntity22;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt15 = (Mob)entity;
                                                        livingEntity22 = _mobEnt15.m_5448_();
                                                    } else {
                                                        livingEntity22 = null;
                                                    }
                                                    if (livingEntity22.m_20206_() > 8.0f) {
                                                        float f13;
                                                        LivingEntity livingEntity23;
                                                        if (entity instanceof Mob) {
                                                            Mob _mobEnt8 = (Mob)entity;
                                                            livingEntity23 = _mobEnt8.m_5448_();
                                                        } else {
                                                            livingEntity23 = null;
                                                        }
                                                        if (livingEntity23 != null) {
                                                            LivingEntity livingEntity24;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity24 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity24 = null;
                                                            }
                                                            f13 = entity.m_20270_(livingEntity24);
                                                        } else {
                                                            f13 = -1.0f;
                                                        }
                                                        if (f13 > 50.0f) {
                                                            float f14;
                                                            LivingEntity livingEntity25;
                                                            LivingEntity livingEntity26;
                                                            float f15;
                                                            LivingEntity livingEntity27;
                                                            LivingEntity livingEntity28;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity28 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity28 = null;
                                                            }
                                                            double d7 = livingEntity28.m_20185_() - entity.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                Mob _mobEnt7 = (Mob)entity;
                                                                livingEntity27 = _mobEnt7.m_5448_();
                                                            } else {
                                                                livingEntity27 = null;
                                                            }
                                                            if (livingEntity27 != null) {
                                                                LivingEntity livingEntity29;
                                                                if (entity instanceof Mob) {
                                                                    Mob _mobEnt62 = (Mob)entity;
                                                                    livingEntity29 = _mobEnt62.m_5448_();
                                                                } else {
                                                                    livingEntity29 = null;
                                                                }
                                                                f15 = entity.m_20270_(livingEntity29);
                                                            } else {
                                                                f15 = -1.0f;
                                                            }
                                                            double d8 = d7 / (double)f15 * 0.5;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity26 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity26 = null;
                                                            }
                                                            double d9 = livingEntity26.m_20189_() - entity.m_20189_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity25 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity25 = null;
                                                            }
                                                            if (livingEntity25 != null) {
                                                                LivingEntity livingEntity30;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity30 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity30 = null;
                                                                }
                                                                f14 = entity.m_20270_(livingEntity30);
                                                            } else {
                                                                f14 = -1.0f;
                                                            }
                                                            entity.m_20256_(new Vec3(d8, 0.0, d9 / (double)f14 * 0.5));
                                                        }
                                                    } else {
                                                        float f16;
                                                        LivingEntity livingEntity31;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt6 = (Mob)entity;
                                                            livingEntity31 = _mobEnt6.m_5448_();
                                                        } else {
                                                            livingEntity31 = null;
                                                        }
                                                        if (livingEntity31 != null) {
                                                            LivingEntity livingEntity32;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt5 = (Mob)entity;
                                                                livingEntity32 = _mobEnt5.m_5448_();
                                                            } else {
                                                                livingEntity32 = null;
                                                            }
                                                            f16 = entity.m_20270_(livingEntity32);
                                                        } else {
                                                            f16 = -1.0f;
                                                        }
                                                        if (f16 > 12.0f) {
                                                            float f17;
                                                            LivingEntity livingEntity33;
                                                            LivingEntity livingEntity34;
                                                            float f18;
                                                            LivingEntity livingEntity35;
                                                            LivingEntity livingEntity36;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity36 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity36 = null;
                                                            }
                                                            double d10 = livingEntity36.m_20185_() - entity.m_20185_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity35 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity35 = null;
                                                            }
                                                            if (livingEntity35 != null) {
                                                                LivingEntity livingEntity37;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity37 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity37 = null;
                                                                }
                                                                f18 = entity.m_20270_(livingEntity37);
                                                            } else {
                                                                f18 = -1.0f;
                                                            }
                                                            double d11 = d10 / (double)f18 * 0.5;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt = (Mob)entity;
                                                                livingEntity34 = _mobEnt.m_5448_();
                                                            } else {
                                                                livingEntity34 = null;
                                                            }
                                                            double d12 = livingEntity34.m_20189_() - entity.m_20189_();
                                                            if (entity instanceof Mob) {
                                                                _mobEnt4 = (Mob)entity;
                                                                livingEntity33 = _mobEnt4.m_5448_();
                                                            } else {
                                                                livingEntity33 = null;
                                                            }
                                                            if (livingEntity33 != null) {
                                                                LivingEntity livingEntity38;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity38 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity38 = null;
                                                                }
                                                                f17 = entity.m_20270_(livingEntity38);
                                                            } else {
                                                                f17 = -1.0f;
                                                            }
                                                            entity.m_20256_(new Vec3(d11, 0.0, d12 / (double)f17 * 0.5));
                                                        }
                                                    }
                                                }
                                                if (entity instanceof Mob) {
                                                    Mob mob = (Mob)entity;
                                                    livingEntity11 = mob.m_5448_();
                                                } else {
                                                    livingEntity11 = null;
                                                }
                                                if (livingEntity11 != null) {
                                                    LivingEntity livingEntity39;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt16 = (Mob)entity;
                                                        livingEntity39 = _mobEnt16.m_5448_();
                                                    } else {
                                                        livingEntity39 = null;
                                                    }
                                                    f8 = entity.m_20270_(livingEntity39);
                                                } else {
                                                    f8 = -1.0f;
                                                }
                                                if (f8 < 512.0f) {
                                                    AdamantiumgolemtitanEntity _datEntSetI2;
                                                    float f19;
                                                    LivingEntity livingEntity40;
                                                    if (entity instanceof Mob) {
                                                        Mob _mobEnt17 = (Mob)entity;
                                                        livingEntity40 = _mobEnt17.m_5448_();
                                                    } else {
                                                        livingEntity40 = null;
                                                    }
                                                    if (livingEntity40 != null) {
                                                        LivingEntity livingEntity41;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt6 = (Mob)entity;
                                                            livingEntity41 = _mobEnt6.m_5448_();
                                                        } else {
                                                            livingEntity41 = null;
                                                        }
                                                        f19 = entity.m_20270_(livingEntity41);
                                                    } else {
                                                        f19 = -1.0f;
                                                    }
                                                    if (f19 <= 60.0f) {
                                                        LivingEntity livingEntity42;
                                                        if (entity instanceof Mob) {
                                                            _mobEnt5 = (Mob)entity;
                                                            livingEntity42 = _mobEnt5.m_5448_();
                                                        } else {
                                                            livingEntity42 = null;
                                                        }
                                                        if (livingEntity42.m_20206_() > 6.0f) {
                                                            if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)4) == 4) {
                                                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                                                    _datEntSetI2 = (AdamantiumgolemtitanEntity)entity;
                                                                    _datEntSetI2.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)9));
                                                                }
                                                            } else if (entity instanceof AdamantiumgolemtitanEntity) {
                                                                _datEntSetI2 = (AdamantiumgolemtitanEntity)entity;
                                                                _datEntSetI2.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)4);
                                                            }
                                                        } else if (entity instanceof AdamantiumgolemtitanEntity) {
                                                            AdamantiumgolemtitanEntity _datEntSetI4 = (AdamantiumgolemtitanEntity)entity;
                                                            _datEntSetI4.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)3));
                                                        }
                                                    }
                                                    if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)10) == 5) {
                                                        int n44;
                                                        if (entity instanceof AdamantiumgolemtitanEntity) {
                                                            AdamantiumgolemtitanEntity _datEntI10 = (AdamantiumgolemtitanEntity)entity;
                                                            n44 = (Integer)_datEntI10.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                                                        } else {
                                                            n44 = 0;
                                                        }
                                                        if (n44 == 0) {
                                                            float f20;
                                                            LivingEntity livingEntity43;
                                                            if (entity instanceof Mob) {
                                                                _mobEnt6 = (Mob)entity;
                                                                livingEntity43 = _mobEnt6.m_5448_();
                                                            } else {
                                                                livingEntity43 = null;
                                                            }
                                                            if (livingEntity43 != null) {
                                                                LivingEntity livingEntity44;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt5 = (Mob)entity;
                                                                    livingEntity44 = _mobEnt5.m_5448_();
                                                                } else {
                                                                    livingEntity44 = null;
                                                                }
                                                                f20 = entity.m_20270_(livingEntity44);
                                                            } else {
                                                                f20 = -1.0f;
                                                            }
                                                            if (f20 > 80.0f) {
                                                                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)30) == 5 && entity instanceof AdamantiumgolemtitanEntity) {
                                                                    _datEntSetI2 = (AdamantiumgolemtitanEntity)entity;
                                                                    _datEntSetI2.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)9);
                                                                }
                                                            } else {
                                                                float f21;
                                                                LivingEntity livingEntity45;
                                                                if (entity instanceof Mob) {
                                                                    _mobEnt3 = (Mob)entity;
                                                                    livingEntity45 = _mobEnt3.m_5448_();
                                                                } else {
                                                                    livingEntity45 = null;
                                                                }
                                                                if (livingEntity45 != null) {
                                                                    LivingEntity livingEntity46;
                                                                    if (entity instanceof Mob) {
                                                                        _mobEnt4 = (Mob)entity;
                                                                        livingEntity46 = _mobEnt4.m_5448_();
                                                                    } else {
                                                                        livingEntity46 = null;
                                                                    }
                                                                    f21 = entity.m_20270_(livingEntity46);
                                                                } else {
                                                                    f21 = -1.0f;
                                                                }
                                                                if (f21 > 60.0f && entity instanceof AdamantiumgolemtitanEntity) {
                                                                    AdamantiumgolemtitanEntity _datEntSetI5 = (AdamantiumgolemtitanEntity)entity;
                                                                    _datEntSetI5.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)5, (int)10));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (entity.m_20186_() < -63.0) {
                                            entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                        }
                                    } else if (entity.m_20186_() < -63.0) {
                                        entity.m_20256_(new Vec3(0.0, 2.0, 0.0));
                                    }
                                }
                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                    _datEntI = (AdamantiumgolemtitanEntity)entity;
                                    n22 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                                } else {
                                    n22 = 0;
                                }
                                if (n22 != true) break block868;
                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                    ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zt");
                                }
                                if (entity instanceof Mob) {
                                    Mob _mobEnt18 = (Mob)entity;
                                    livingEntity2 = _mobEnt18.m_5448_();
                                } else {
                                    livingEntity2 = null;
                                }
                                if (livingEntity2 != null) {
                                    LivingEntity livingEntity47;
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt22 = (Mob)entity;
                                        livingEntity47 = _mobEnt22.m_5448_();
                                    } else {
                                        livingEntity47 = null;
                                    }
                                    f2 = entity.m_20270_(livingEntity47);
                                } else {
                                    f2 = -1.0f;
                                }
                                if (f2 > 1.0f) {
                                    LivingEntity livingEntity48;
                                    LivingEntity livingEntity49;
                                    LivingEntity livingEntity50;
                                    LivingEntity livingEntity51;
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt19 = (Mob)entity;
                                        livingEntity51 = _mobEnt19.m_5448_();
                                    } else {
                                        livingEntity51 = null;
                                    }
                                    double d = livingEntity51.m_20185_();
                                    if (entity instanceof Mob) {
                                        _mobEnt = (Mob)entity;
                                        livingEntity50 = _mobEnt.m_5448_();
                                    } else {
                                        livingEntity50 = null;
                                    }
                                    double d13 = livingEntity50.m_20186_();
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt20 = (Mob)entity;
                                        livingEntity49 = _mobEnt20.m_5448_();
                                    } else {
                                        livingEntity49 = null;
                                    }
                                    double d14 = d13 + (double)livingEntity49.m_20206_() / 1.5;
                                    if (entity instanceof Mob) {
                                        Mob _mobEnt21 = (Mob)entity;
                                        livingEntity48 = _mobEnt21.m_5448_();
                                    } else {
                                        livingEntity48 = null;
                                    }
                                    entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d14, livingEntity48.m_20189_()));
                                }
                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                    AdamantiumgolemtitanEntity _datEntI11 = (AdamantiumgolemtitanEntity)entity;
                                    n21 = (Integer)_datEntI11.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                                } else {
                                    n21 = 0;
                                }
                                if (n21 == 56) break block869;
                                if (entity instanceof AdamantiumgolemtitanEntity) {
                                    _datEntI2 = (AdamantiumgolemtitanEntity)entity;
                                    n20 = (Integer)_datEntI2.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                                } else {
                                    n20 = 0;
                                }
                                if (n20 != 96) break block870;
                            }
                            if (world instanceof Level) {
                                Level _level5 = (Level)world;
                                if (!_level5.m_5776_()) {
                                    _level5.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level5.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            Vec3 _center4 = new Vec3(x, y, z);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center4, _center4).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center4))).toList();
                            for (Entity entityiterator : _entfound) {
                                float f22;
                                float f23;
                                float f24;
                                float f25;
                                float f26;
                                float f27;
                                LivingEntity _livEnt3;
                                float f28;
                                if (entityiterator instanceof AdamantiumgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    LivingEntity _livEnt6 = (LivingEntity)entityiterator;
                                    f28 = _livEnt6.m_21233_();
                                } else {
                                    f28 = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource, f28 / 10.0f + 2000000.0f);
                                if (entityiterator instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                    entityiterator.f_19802_ = 0;
                                    Deathlist.normalattack(entityiterator);
                                }
                                DamageSource damageSource2 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt3 = (LivingEntity)entityiterator;
                                    f27 = _livEnt3.m_21233_();
                                } else {
                                    f27 = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource2, f27 / 10.0f + 2000000.0f);
                                DamageSource damageSource3 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt3 = (LivingEntity)entityiterator;
                                    f26 = _livEnt3.m_21233_();
                                } else {
                                    f26 = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource3, f26 / 10.0f + 2000000.0f);
                                entityiterator.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entityiterator.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource4 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entityiterator;
                                    f25 = _livEnt.m_21233_();
                                } else {
                                    f25 = -1.0f;
                                }
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt3 = (LivingEntity)entityiterator;
                                    f24 = _livEnt3.m_21223_();
                                } else {
                                    f24 = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource4, (f25 + f24) / 5.0f + 2.0E7f);
                                DamageSource damageSource5 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt = (LivingEntity)entityiterator;
                                    f23 = _livEnt.m_21233_();
                                } else {
                                    f23 = -1.0f;
                                }
                                if (entityiterator instanceof LivingEntity) {
                                    _livEnt3 = (LivingEntity)entityiterator;
                                    f22 = _livEnt3.m_21223_();
                                } else {
                                    f22 = -1.0f;
                                }
                                entityiterator.m_6469_(damageSource5, (f23 + f22) / 5.0f + 2.0E7f);
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI12 = (AdamantiumgolemtitanEntity)entity;
                            n19 = (Integer)_datEntI12.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n19 = 0;
                        }
                        if (n19 >= 120) {
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                ((AdamantiumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        _datEntI = (AdamantiumgolemtitanEntity)entity;
                        n18 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                    } else {
                        n18 = 0;
                    }
                    if (n18 == 2) {
                        int n45;
                        int n46;
                        float f29;
                        LivingEntity livingEntity52;
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.zj");
                        }
                        if (entity instanceof Mob) {
                            Mob _mobEnt22 = (Mob)entity;
                            livingEntity52 = _mobEnt22.m_5448_();
                        } else {
                            livingEntity52 = null;
                        }
                        if (livingEntity52 != null) {
                            LivingEntity livingEntity53;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity53 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity53 = null;
                            }
                            f29 = entity.m_20270_(livingEntity53);
                        } else {
                            f29 = -1.0f;
                        }
                        if (f29 > 1.0f) {
                            LivingEntity livingEntity54;
                            LivingEntity livingEntity55;
                            LivingEntity livingEntity56;
                            LivingEntity livingEntity57;
                            if (entity instanceof Mob) {
                                Mob _mobEnt23 = (Mob)entity;
                                livingEntity57 = _mobEnt23.m_5448_();
                            } else {
                                livingEntity57 = null;
                            }
                            double d = livingEntity57.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity56 = _mobEnt.m_5448_();
                            } else {
                                livingEntity56 = null;
                            }
                            double d15 = livingEntity56.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt24 = (Mob)entity;
                                livingEntity55 = _mobEnt24.m_5448_();
                            } else {
                                livingEntity55 = null;
                            }
                            double d16 = d15 + (double)livingEntity55.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt25 = (Mob)entity;
                                livingEntity54 = _mobEnt25.m_5448_();
                            } else {
                                livingEntity54 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d16, livingEntity54.m_20189_()));
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI13 = (AdamantiumgolemtitanEntity)entity;
                            n46 = (Integer)_datEntI13.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n46 = 0;
                        }
                        if (n46 == 36) {
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            _center = new Vec3(x, y, z);
                            List<Entity> _entfound3 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(100.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity3 : _entfound3) {
                                float f30;
                                float f31;
                                float f32;
                                float f33;
                                float f34;
                                float f35;
                                LivingEntity _livEnt4;
                                float f36;
                                if (entity3 instanceof AdamantiumgolemtitanEntity || !(entity3 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    LivingEntity _livEnt8 = (LivingEntity)entity3;
                                    f36 = _livEnt8.m_21233_();
                                } else {
                                    f36 = -1.0f;
                                }
                                entity3.m_6469_(damageSource, f36 / 20.0f + 2000000.0f);
                                if (entity3 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity3 instanceof Player)) {
                                    entity3.f_19802_ = 0;
                                    Deathlist.normalattack(entity3);
                                }
                                DamageSource damageSource6 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt4 = (LivingEntity)entity3;
                                    f35 = _livEnt4.m_21233_();
                                } else {
                                    f35 = -1.0f;
                                }
                                entity3.m_6469_(damageSource6, f35 / 20.0f + 2000000.0f);
                                DamageSource damageSource7 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt4 = (LivingEntity)entity3;
                                    f34 = _livEnt4.m_21233_();
                                } else {
                                    f34 = -1.0f;
                                }
                                entity3.m_6469_(damageSource7, f34 / 20.0f + 2000000.0f);
                                entity3.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entity3.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource8 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    LivingEntity _livEnt7 = (LivingEntity)entity3;
                                    f33 = _livEnt7.m_21233_();
                                } else {
                                    f33 = -1.0f;
                                }
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt4 = (LivingEntity)entity3;
                                    f32 = _livEnt4.m_21223_();
                                } else {
                                    f32 = -1.0f;
                                }
                                entity3.m_6469_(damageSource8, (f33 + f32) / 5.0f + 2.0E7f);
                                DamageSource damageSource9 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity3 instanceof LivingEntity) {
                                    LivingEntity _livEnt5 = (LivingEntity)entity3;
                                    f31 = _livEnt5.m_21233_();
                                } else {
                                    f31 = -1.0f;
                                }
                                if (entity3 instanceof LivingEntity) {
                                    _livEnt4 = (LivingEntity)entity3;
                                    f30 = _livEnt4.m_21223_();
                                } else {
                                    f30 = -1.0f;
                                }
                                entity3.m_6469_(damageSource9, (f31 + f30) / 5.0f + 2.0E7f);
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI14 = (AdamantiumgolemtitanEntity)entity;
                            n45 = (Integer)_datEntI14.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n45 = 0;
                        }
                        if (n45 >= 60) {
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                ((AdamantiumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        _datEntI = (AdamantiumgolemtitanEntity)entity;
                        n17 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                    } else {
                        n17 = 0;
                    }
                    if (n17 == 3) {
                        int n47;
                        int n48;
                        float f37;
                        LivingEntity livingEntity58;
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.gt");
                        }
                        if (entity instanceof Mob) {
                            Mob _mobEnt26 = (Mob)entity;
                            livingEntity58 = _mobEnt26.m_5448_();
                        } else {
                            livingEntity58 = null;
                        }
                        if (livingEntity58 != null) {
                            LivingEntity livingEntity59;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity59 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity59 = null;
                            }
                            f37 = entity.m_20270_(livingEntity59);
                        } else {
                            f37 = -1.0f;
                        }
                        if (f37 > 1.0f) {
                            LivingEntity livingEntity60;
                            LivingEntity livingEntity61;
                            LivingEntity livingEntity62;
                            LivingEntity livingEntity63;
                            if (entity instanceof Mob) {
                                Mob _mobEnt27 = (Mob)entity;
                                livingEntity63 = _mobEnt27.m_5448_();
                            } else {
                                livingEntity63 = null;
                            }
                            double d = livingEntity63.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity62 = _mobEnt.m_5448_();
                            } else {
                                livingEntity62 = null;
                            }
                            double d17 = livingEntity62.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt28 = (Mob)entity;
                                livingEntity61 = _mobEnt28.m_5448_();
                            } else {
                                livingEntity61 = null;
                            }
                            double d18 = d17 + (double)livingEntity61.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt29 = (Mob)entity;
                                livingEntity60 = _mobEnt29.m_5448_();
                            } else {
                                livingEntity60 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d18, livingEntity60.m_20189_()));
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI15 = (AdamantiumgolemtitanEntity)entity;
                            n48 = (Integer)_datEntI15.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n48 = 0;
                        }
                        if (n48 == 48) {
                            for (int index4 = 0; index4 < 64; ++index4) {
                                if (!(world instanceof ServerLevel)) continue;
                                ServerLevel _level6 = (ServerLevel)world;
                                entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level6, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0))), MobSpawnType.MOB_SUMMONED);
                                if (entityToSpawn == null) continue;
                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                            if (world instanceof Level) {
                                Level _level7 = (Level)world;
                                if (!_level7.m_5776_()) {
                                    _level7.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level7.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            _center = new Vec3(x, y, z);
                            List<Entity> _entfound4 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(160.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity4 : _entfound4) {
                                float f38;
                                float f39;
                                float f40;
                                float f41;
                                float f42;
                                float f43;
                                LivingEntity _livEnt6;
                                float f44;
                                if (entity4 instanceof AdamantiumgolemtitanEntity || !(entity4 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    LivingEntity _livEnt10 = (LivingEntity)entity4;
                                    f44 = _livEnt10.m_21233_();
                                } else {
                                    f44 = -1.0f;
                                }
                                entity4.m_6469_(damageSource, f44 / 20.0f + 4200000.0f);
                                if (entity4 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity4 instanceof Player)) {
                                    entity4.f_19802_ = 0;
                                    Deathlist.normalattack(entity4);
                                }
                                DamageSource damageSource10 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt6 = (LivingEntity)entity4;
                                    f43 = _livEnt6.m_21233_();
                                } else {
                                    f43 = -1.0f;
                                }
                                entity4.m_6469_(damageSource10, f43 / 20.0f + 4200000.0f);
                                DamageSource damageSource11 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt6 = (LivingEntity)entity4;
                                    f42 = _livEnt6.m_21233_();
                                } else {
                                    f42 = -1.0f;
                                }
                                entity4.m_6469_(damageSource11, f42 / 20.0f + 4200000.0f);
                                entity4.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entity4.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource12 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    LivingEntity _livEnt9 = (LivingEntity)entity4;
                                    f41 = _livEnt9.m_21233_();
                                } else {
                                    f41 = -1.0f;
                                }
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt6 = (LivingEntity)entity4;
                                    f40 = _livEnt6.m_21223_();
                                } else {
                                    f40 = -1.0f;
                                }
                                entity4.m_6469_(damageSource12, (f41 + f40) / 5.0f + 4.2E7f);
                                DamageSource damageSource13 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity4 instanceof LivingEntity) {
                                    LivingEntity _livEnt7 = (LivingEntity)entity4;
                                    f39 = _livEnt7.m_21233_();
                                } else {
                                    f39 = -1.0f;
                                }
                                if (entity4 instanceof LivingEntity) {
                                    _livEnt6 = (LivingEntity)entity4;
                                    f38 = _livEnt6.m_21223_();
                                } else {
                                    f38 = -1.0f;
                                }
                                entity4.m_6469_(damageSource13, (f39 + f38) / 5.0f + 4.2E7f);
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI16 = (AdamantiumgolemtitanEntity)entity;
                            n47 = (Integer)_datEntI16.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n47 = 0;
                        }
                        if (n47 >= 80) {
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                ((AdamantiumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        _datEntI = (AdamantiumgolemtitanEntity)entity;
                        n16 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                    } else {
                        n16 = 0;
                    }
                    if (n16 == 4) {
                        int n49;
                        int n50;
                        float f45;
                        LivingEntity livingEntity64;
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.attack");
                        }
                        if (entity instanceof Mob) {
                            Mob _mobEnt30 = (Mob)entity;
                            livingEntity64 = _mobEnt30.m_5448_();
                        } else {
                            livingEntity64 = null;
                        }
                        if (livingEntity64 != null) {
                            LivingEntity livingEntity65;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity65 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity65 = null;
                            }
                            f45 = entity.m_20270_(livingEntity65);
                        } else {
                            f45 = -1.0f;
                        }
                        if (f45 > 1.0f) {
                            LivingEntity livingEntity66;
                            LivingEntity livingEntity67;
                            LivingEntity livingEntity68;
                            LivingEntity livingEntity69;
                            if (entity instanceof Mob) {
                                Mob _mobEnt31 = (Mob)entity;
                                livingEntity69 = _mobEnt31.m_5448_();
                            } else {
                                livingEntity69 = null;
                            }
                            double d = livingEntity69.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity68 = _mobEnt.m_5448_();
                            } else {
                                livingEntity68 = null;
                            }
                            double d19 = livingEntity68.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt32 = (Mob)entity;
                                livingEntity67 = _mobEnt32.m_5448_();
                            } else {
                                livingEntity67 = null;
                            }
                            double d20 = d19 + (double)livingEntity67.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt33 = (Mob)entity;
                                livingEntity66 = _mobEnt33.m_5448_();
                            } else {
                                livingEntity66 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d20, livingEntity66.m_20189_()));
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI17 = (AdamantiumgolemtitanEntity)entity;
                            n50 = (Integer)_datEntI17.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n50 = 0;
                        }
                        if (n50 == 14) {
                            for (int index5 = 0; index5 < 32; ++index5) {
                                if (!(world instanceof ServerLevel)) continue;
                                ServerLevel _level8 = (ServerLevel)world;
                                entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level8, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0))), MobSpawnType.MOB_SUMMONED);
                                if (entityToSpawn == null) continue;
                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                            if (world instanceof Level) {
                                Level _level9 = (Level)world;
                                if (!_level9.m_5776_()) {
                                    _level9.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level9.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 64.0, y, z + entity.m_20154_().f_82481_ * 64.0);
                            List<Entity> _entfound5 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity5 : _entfound5) {
                                float f46;
                                float f47;
                                float f48;
                                float f49;
                                float f50;
                                float f51;
                                float f52;
                                LivingEntity _livEnt8;
                                float f53;
                                if (entity5 instanceof AdamantiumgolemtitanEntity || !(entity5 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    LivingEntity _livEnt12 = (LivingEntity)entity5;
                                    f53 = _livEnt12.m_21233_();
                                } else {
                                    f53 = -1.0f;
                                }
                                entity5.m_6469_(damageSource, f53 / 20.0f + 8400000.0f);
                                DamageSource damageSource14 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt8 = (LivingEntity)entity5;
                                    f52 = _livEnt8.m_21233_();
                                } else {
                                    f52 = -1.0f;
                                }
                                entity5.m_6469_(damageSource14, f52 / 20.0f + 8400000.0f);
                                if (entity5 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity5 instanceof Player)) {
                                    entity5.f_19802_ = 0;
                                    Deathlist.normalattack(entity5);
                                }
                                DamageSource damageSource15 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt8 = (LivingEntity)entity5;
                                    f51 = _livEnt8.m_21233_();
                                } else {
                                    f51 = -1.0f;
                                }
                                entity5.m_6469_(damageSource15, f51 / 20.0f + 8400000.0f);
                                DamageSource damageSource16 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt8 = (LivingEntity)entity5;
                                    f50 = _livEnt8.m_21233_();
                                } else {
                                    f50 = -1.0f;
                                }
                                entity5.m_6469_(damageSource16, f50 / 20.0f + 8400000.0f);
                                if (!(entity5.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource17 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    LivingEntity _livEnt11 = (LivingEntity)entity5;
                                    f49 = _livEnt11.m_21233_();
                                } else {
                                    f49 = -1.0f;
                                }
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt8 = (LivingEntity)entity5;
                                    f48 = _livEnt8.m_21223_();
                                } else {
                                    f48 = -1.0f;
                                }
                                entity5.m_6469_(damageSource17, (f49 + f48) / 5.0f + 8.4E7f);
                                DamageSource damageSource18 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity5 instanceof LivingEntity) {
                                    LivingEntity _livEnt9 = (LivingEntity)entity5;
                                    f47 = _livEnt9.m_21233_();
                                } else {
                                    f47 = -1.0f;
                                }
                                if (entity5 instanceof LivingEntity) {
                                    _livEnt8 = (LivingEntity)entity5;
                                    f46 = _livEnt8.m_21223_();
                                } else {
                                    f46 = -1.0f;
                                }
                                entity5.m_6469_(damageSource18, (f47 + f46) / 5.0f + 8.4E7f);
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI18 = (AdamantiumgolemtitanEntity)entity;
                            n49 = (Integer)_datEntI18.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n49 = 0;
                        }
                        if (n49 >= 30) {
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                ((AdamantiumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        _datEntI = (AdamantiumgolemtitanEntity)entity;
                        n15 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                    } else {
                        n15 = 0;
                    }
                    if (n15 == 5) {
                        int n51;
                        int n52;
                        float f54;
                        LivingEntity livingEntity70;
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.fs");
                        }
                        if (entity instanceof Mob) {
                            Mob _mobEnt34 = (Mob)entity;
                            livingEntity70 = _mobEnt34.m_5448_();
                        } else {
                            livingEntity70 = null;
                        }
                        if (livingEntity70 != null) {
                            LivingEntity livingEntity71;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity71 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity71 = null;
                            }
                            f54 = entity.m_20270_(livingEntity71);
                        } else {
                            f54 = -1.0f;
                        }
                        if (f54 > 1.0f) {
                            LivingEntity livingEntity72;
                            LivingEntity livingEntity73;
                            LivingEntity livingEntity74;
                            LivingEntity livingEntity75;
                            if (entity instanceof Mob) {
                                Mob _mobEnt35 = (Mob)entity;
                                livingEntity75 = _mobEnt35.m_5448_();
                            } else {
                                livingEntity75 = null;
                            }
                            double d = livingEntity75.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity74 = _mobEnt.m_5448_();
                            } else {
                                livingEntity74 = null;
                            }
                            double d21 = livingEntity74.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt36 = (Mob)entity;
                                livingEntity73 = _mobEnt36.m_5448_();
                            } else {
                                livingEntity73 = null;
                            }
                            double d22 = d21 + (double)livingEntity73.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt37 = (Mob)entity;
                                livingEntity72 = _mobEnt37.m_5448_();
                            } else {
                                livingEntity72 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d22, livingEntity72.m_20189_()));
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI19 = (AdamantiumgolemtitanEntity)entity;
                            n52 = (Integer)_datEntI19.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n52 = 0;
                        }
                        if (n52 == 40) {
                            for (int index6 = 0; index6 < 32; ++index6) {
                                if (!(world instanceof ServerLevel)) continue;
                                ServerLevel _level10 = (ServerLevel)world;
                                entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level10, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0))), MobSpawnType.MOB_SUMMONED);
                                if (entityToSpawn == null) continue;
                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                            if (world instanceof Level) {
                                Level _level11 = (Level)world;
                                if (!_level11.m_5776_()) {
                                    _level11.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level11.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (world instanceof ServerLevel) {
                                ServerLevel _level12 = (ServerLevel)world;
                                Entity entityToSpawn3 = ((EntityType)UltimateskeletonsModEntities.ADAMANSHOCK.get()).m_262496_(_level12, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 90.0), (double)y, (double)(z + entity.m_20154_().f_82481_ * 90.0)), MobSpawnType.MOB_SUMMONED);
                                if (entityToSpawn3 != null) {
                                    entityToSpawn3.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                }
                            }
                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 80.0, y, z + entity.m_20154_().f_82481_ * 80.0);
                            List<Entity> _entfound6 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(512.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity6 : _entfound6) {
                                float f55;
                                float f56;
                                float f57;
                                float f58;
                                float f59;
                                float f60;
                                float f61;
                                if (entity6 instanceof AdamantiumgolemtitanEntity || !(entity6 instanceof LivingEntity)) continue;
                                double _setval = 6.0;
                                entity6.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                    capability.camerashake = _setval;
                                    capability.syncPlayerVariables(entity6);
                                });
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity6 instanceof LivingEntity) {
                                    LivingEntity _livEnt14 = (LivingEntity)entity6;
                                    f61 = _livEnt14.m_21233_();
                                } else {
                                    f61 = -1.0f;
                                }
                                entity6.m_6469_(damageSource, f61 / 20.0f + 1.68E7f);
                                if (entity6 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity6 instanceof Player)) {
                                    entity6.f_19802_ = 0;
                                    Deathlist.normalattack(entity6);
                                }
                                DamageSource damageSource19 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity6 instanceof LivingEntity) {
                                    LivingEntity _livEnt15 = (LivingEntity)entity6;
                                    f60 = _livEnt15.m_21233_();
                                } else {
                                    f60 = -1.0f;
                                }
                                entity6.m_6469_(damageSource19, f60 / 20.0f + 1.68E7f);
                                DamageSource damageSource20 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity6 instanceof LivingEntity) {
                                    LivingEntity _livEnt16 = (LivingEntity)entity6;
                                    f59 = _livEnt16.m_21233_();
                                } else {
                                    f59 = -1.0f;
                                }
                                entity6.m_6469_(damageSource20, f59 / 20.0f + 1.68E7f);
                                entity6.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entity6.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource21 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity6 instanceof LivingEntity) {
                                    LivingEntity _livEnt13 = (LivingEntity)entity6;
                                    f58 = _livEnt13.m_21233_();
                                } else {
                                    f58 = -1.0f;
                                }
                                if (entity6 instanceof LivingEntity) {
                                    LivingEntity _livEnt17 = (LivingEntity)entity6;
                                    f57 = _livEnt17.m_21223_();
                                } else {
                                    f57 = -1.0f;
                                }
                                entity6.m_6469_(damageSource21, (f58 + f57) / 5.0f + 1.68E8f);
                                DamageSource damageSource22 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity6 instanceof LivingEntity) {
                                    LivingEntity _livEnt10 = (LivingEntity)entity6;
                                    f56 = _livEnt10.m_21233_();
                                } else {
                                    f56 = -1.0f;
                                }
                                if (entity6 instanceof LivingEntity) {
                                    LivingEntity _livEnt18 = (LivingEntity)entity6;
                                    f55 = _livEnt18.m_21223_();
                                } else {
                                    f55 = -1.0f;
                                }
                                entity6.m_6469_(damageSource22, (f56 + f55) / 5.0f + 1.68E8f);
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI20 = (AdamantiumgolemtitanEntity)entity;
                            n51 = (Integer)_datEntI20.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n51 = 0;
                        }
                        if (n51 >= 60) {
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                ((AdamantiumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        _datEntI = (AdamantiumgolemtitanEntity)entity;
                        n14 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                    } else {
                        n14 = 0;
                    }
                    if (n14 == 6) {
                        int n53;
                        int n54;
                        int n55;
                        float f62;
                        LivingEntity livingEntity76;
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.ultimaslap");
                        }
                        if (entity instanceof Mob) {
                            Mob _mobEnt38 = (Mob)entity;
                            livingEntity76 = _mobEnt38.m_5448_();
                        } else {
                            livingEntity76 = null;
                        }
                        if (livingEntity76 != null) {
                            LivingEntity livingEntity77;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity77 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity77 = null;
                            }
                            f62 = entity.m_20270_(livingEntity77);
                        } else {
                            f62 = -1.0f;
                        }
                        if (f62 > 1.0f) {
                            LivingEntity livingEntity78;
                            LivingEntity livingEntity79;
                            LivingEntity livingEntity80;
                            LivingEntity livingEntity81;
                            if (entity instanceof Mob) {
                                Mob _mobEnt39 = (Mob)entity;
                                livingEntity81 = _mobEnt39.m_5448_();
                            } else {
                                livingEntity81 = null;
                            }
                            double d = livingEntity81.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity80 = _mobEnt.m_5448_();
                            } else {
                                livingEntity80 = null;
                            }
                            double d23 = livingEntity80.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt40 = (Mob)entity;
                                livingEntity79 = _mobEnt40.m_5448_();
                            } else {
                                livingEntity79 = null;
                            }
                            double d24 = d23 + (double)livingEntity79.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt41 = (Mob)entity;
                                livingEntity78 = _mobEnt41.m_5448_();
                            } else {
                                livingEntity78 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d24, livingEntity78.m_20189_()));
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI21 = (AdamantiumgolemtitanEntity)entity;
                            n55 = (Integer)_datEntI21.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n55 = 0;
                        }
                        if (n55 == 20) {
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            _center = new Vec3(x, y, z);
                            List<Entity> _entfound7 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity7 : _entfound7) {
                                float f63;
                                float f64;
                                float f65;
                                float f66;
                                float f67;
                                float f68;
                                float f69;
                                if (entity7 instanceof AdamantiumgolemtitanEntity || !(entity7 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity7 instanceof LivingEntity) {
                                    LivingEntity _livEnt20 = (LivingEntity)entity7;
                                    f69 = _livEnt20.m_21233_();
                                } else {
                                    f69 = -1.0f;
                                }
                                entity7.m_6469_(damageSource, f69 / 10.0f + 2000000.0f);
                                if (entity7 instanceof Titangodentity) continue;
                                double _setval = 6.0;
                                entity7.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                    capability.camerashake = _setval;
                                    capability.syncPlayerVariables(entity7);
                                });
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity7 instanceof Player)) {
                                    entity7.f_19802_ = 0;
                                    Deathlist.normalattack(entity7);
                                }
                                DamageSource damageSource23 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity7 instanceof LivingEntity) {
                                    LivingEntity _livEnt21 = (LivingEntity)entity7;
                                    f68 = _livEnt21.m_21233_();
                                } else {
                                    f68 = -1.0f;
                                }
                                entity7.m_6469_(damageSource23, f68 / 10.0f + 2000000.0f);
                                DamageSource damageSource24 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity7 instanceof LivingEntity) {
                                    LivingEntity _livEnt22 = (LivingEntity)entity7;
                                    f67 = _livEnt22.m_21233_();
                                } else {
                                    f67 = -1.0f;
                                }
                                entity7.m_6469_(damageSource24, f67 / 10.0f + 2000000.0f);
                                entity7.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entity7.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource25 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity7 instanceof LivingEntity) {
                                    LivingEntity _livEnt19 = (LivingEntity)entity7;
                                    f66 = _livEnt19.m_21233_();
                                } else {
                                    f66 = -1.0f;
                                }
                                if (entity7 instanceof LivingEntity) {
                                    LivingEntity _livEnt23 = (LivingEntity)entity7;
                                    f65 = _livEnt23.m_21223_();
                                } else {
                                    f65 = -1.0f;
                                }
                                entity7.m_6469_(damageSource25, (f66 + f65) / 5.0f + 2.0E7f);
                                DamageSource damageSource26 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity7 instanceof LivingEntity) {
                                    LivingEntity _livEnt11 = (LivingEntity)entity7;
                                    f64 = _livEnt11.m_21233_();
                                } else {
                                    f64 = -1.0f;
                                }
                                if (entity7 instanceof LivingEntity) {
                                    LivingEntity _livEnt24 = (LivingEntity)entity7;
                                    f63 = _livEnt24.m_21223_();
                                } else {
                                    f63 = -1.0f;
                                }
                                entity7.m_6469_(damageSource26, (f64 + f63) / 5.0f + 2.0E7f);
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI22 = (AdamantiumgolemtitanEntity)entity;
                            n54 = (Integer)_datEntI22.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n54 = 0;
                        }
                        if (n54 == 45) {
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            for (int index7 = 0; index7 < 360; ++index7) {
                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ADAMANBLOCK.get()), x + entity.m_20154_().f_82479_ * 90.0, y + 60.0, z + entity.m_20154_().f_82481_ * 90.0, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-8.0, (double)8.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-8.0, (double)8.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-8.0, (double)8.0));
                            }
                            _center = new Vec3(x + entity.m_20154_().f_82479_ * 150.0, y, z + entity.m_20154_().f_82481_ * 150.0);
                            List<Entity> _entfound8 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(1000.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity8 : _entfound8) {
                                float f70;
                                float f71;
                                float f72;
                                float f73;
                                float f74;
                                float f75;
                                float f76;
                                if (entity8 instanceof AdamantiumgolemtitanEntity || !(entity8 instanceof LivingEntity)) continue;
                                double _setval = 6.0;
                                entity8.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                    capability.camerashake = _setval;
                                    capability.syncPlayerVariables(entity8);
                                });
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity8 instanceof LivingEntity) {
                                    LivingEntity _livEnt26 = (LivingEntity)entity8;
                                    f76 = _livEnt26.m_21233_();
                                } else {
                                    f76 = -1.0f;
                                }
                                entity8.m_6469_(damageSource, f76 / 20.0f + 6680000.0f);
                                if (entity8 instanceof Titangodentity) continue;
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity8 instanceof Player)) {
                                    entity8.f_19802_ = 0;
                                    Deathlist.normalattack(entity8);
                                }
                                DamageSource damageSource27 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity8 instanceof LivingEntity) {
                                    LivingEntity _livEnt27 = (LivingEntity)entity8;
                                    f75 = _livEnt27.m_21233_();
                                } else {
                                    f75 = -1.0f;
                                }
                                entity8.m_6469_(damageSource27, f75 / 20.0f + 6680000.0f);
                                DamageSource damageSource28 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity8 instanceof LivingEntity) {
                                    LivingEntity _livEnt28 = (LivingEntity)entity8;
                                    f74 = _livEnt28.m_21233_();
                                } else {
                                    f74 = -1.0f;
                                }
                                entity8.m_6469_(damageSource28, f74 / 20.0f + 6680000.0f);
                                if (!(entity8.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource29 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity8 instanceof LivingEntity) {
                                    LivingEntity _livEnt25 = (LivingEntity)entity8;
                                    f73 = _livEnt25.m_21233_();
                                } else {
                                    f73 = -1.0f;
                                }
                                if (entity8 instanceof LivingEntity) {
                                    LivingEntity _livEnt29 = (LivingEntity)entity8;
                                    f72 = _livEnt29.m_21223_();
                                } else {
                                    f72 = -1.0f;
                                }
                                entity8.m_6469_(damageSource29, (f73 + f72) / 5.0f + 6.68E7f);
                                DamageSource damageSource30 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity8 instanceof LivingEntity) {
                                    LivingEntity _livEnt12 = (LivingEntity)entity8;
                                    f71 = _livEnt12.m_21233_();
                                } else {
                                    f71 = -1.0f;
                                }
                                if (entity8 instanceof LivingEntity) {
                                    LivingEntity _livEnt30 = (LivingEntity)entity8;
                                    f70 = _livEnt30.m_21223_();
                                } else {
                                    f70 = -1.0f;
                                }
                                entity8.m_6469_(damageSource30, (f71 + f70) / 5.0f + 6.68E7f);
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI23 = (AdamantiumgolemtitanEntity)entity;
                            n53 = (Integer)_datEntI23.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n53 = 0;
                        }
                        if (n53 >= 70) {
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                ((AdamantiumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        _datEntI = (AdamantiumgolemtitanEntity)entity;
                        n13 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                    } else {
                        n13 = 0;
                    }
                    if (n13 == 7) {
                        int n56;
                        int n57;
                        int n58;
                        int n59;
                        float f77;
                        LivingEntity livingEntity82;
                        if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.swipe2");
                            }
                        } else if (entity instanceof AdamantiumgolemtitanEntity) {
                            ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.swipe1");
                        }
                        if (entity instanceof Mob) {
                            Mob _mobEnt42 = (Mob)entity;
                            livingEntity82 = _mobEnt42.m_5448_();
                        } else {
                            livingEntity82 = null;
                        }
                        if (livingEntity82 != null) {
                            LivingEntity livingEntity83;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity83 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity83 = null;
                            }
                            f77 = entity.m_20270_(livingEntity83);
                        } else {
                            f77 = -1.0f;
                        }
                        if (f77 > 1.0f) {
                            LivingEntity livingEntity84;
                            LivingEntity livingEntity85;
                            LivingEntity livingEntity86;
                            LivingEntity livingEntity87;
                            if (entity instanceof Mob) {
                                Mob _mobEnt43 = (Mob)entity;
                                livingEntity87 = _mobEnt43.m_5448_();
                            } else {
                                livingEntity87 = null;
                            }
                            double d = livingEntity87.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity86 = _mobEnt.m_5448_();
                            } else {
                                livingEntity86 = null;
                            }
                            double d25 = livingEntity86.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt44 = (Mob)entity;
                                livingEntity85 = _mobEnt44.m_5448_();
                            } else {
                                livingEntity85 = null;
                            }
                            double d26 = d25 + (double)livingEntity85.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt45 = (Mob)entity;
                                livingEntity84 = _mobEnt45.m_5448_();
                            } else {
                                livingEntity84 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d26, livingEntity84.m_20189_()));
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI24 = (AdamantiumgolemtitanEntity)entity;
                            n59 = (Integer)_datEntI24.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n59 = 0;
                        }
                        if (n59 == 20) {
                            if (theta >= 360.0) {
                                theta = 0.0;
                            }
                            if (theta == 0.0) {
                                for (int index8 = 0; index8 < 120; ++index8) {
                                    world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ADAMANBLOCK.get()), x + 24.0 * entity.m_20154_().f_82479_ + 1.0 * Math.cos(theta), y + 0.9, z + 24.0 * entity.m_20154_().f_82481_ + 1.0 * Math.sin(theta), 6.0 * Math.cos(theta), 0.0, 6.0 * Math.sin(theta));
                                    theta += 1.0;
                                }
                            }
                            if (world instanceof Level) {
                                Level _level13 = (Level)world;
                                if (!_level13.m_5776_()) {
                                    _level13.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level13.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:press")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            _center = new Vec3(x, y, z);
                            List<Entity> _entfound9 = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(120.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                            for (Entity entity9 : _entfound9) {
                                float f78;
                                float f79;
                                float f80;
                                float f81;
                                float f82;
                                float f83;
                                float f84;
                                if (entity9 instanceof AdamantiumgolemtitanEntity || !(entity9 instanceof LivingEntity)) continue;
                                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity9 instanceof LivingEntity) {
                                    LivingEntity _livEnt32 = (LivingEntity)entity9;
                                    f84 = _livEnt32.m_21233_();
                                } else {
                                    f84 = -1.0f;
                                }
                                entity9.m_6469_(damageSource, f84 / 10.0f + 2000000.0f);
                                if (entity9 instanceof Titangodentity) continue;
                                double _setval = 6.0;
                                entity9.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                    capability.camerashake = _setval;
                                    capability.syncPlayerVariables(entity9);
                                });
                                if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entity9 instanceof Player)) {
                                    entity9.f_19802_ = 0;
                                    Deathlist.normalattack(entity9);
                                }
                                DamageSource damageSource31 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                if (entity9 instanceof LivingEntity) {
                                    LivingEntity _livEnt33 = (LivingEntity)entity9;
                                    f83 = _livEnt33.m_21233_();
                                } else {
                                    f83 = -1.0f;
                                }
                                entity9.m_6469_(damageSource31, f83 / 10.0f + 2000000.0f);
                                DamageSource damageSource32 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                if (entity9 instanceof LivingEntity) {
                                    LivingEntity _livEnt34 = (LivingEntity)entity9;
                                    f82 = _livEnt34.m_21233_();
                                } else {
                                    f82 = -1.0f;
                                }
                                entity9.m_6469_(damageSource32, f82 / 10.0f + 2000000.0f);
                                entity9.m_20256_(new Vec3(0.0, 1.0, 0.0));
                                if (!(entity9.m_20206_() > 6.0f)) continue;
                                DamageSource damageSource33 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                if (entity9 instanceof LivingEntity) {
                                    LivingEntity _livEnt31 = (LivingEntity)entity9;
                                    f81 = _livEnt31.m_21233_();
                                } else {
                                    f81 = -1.0f;
                                }
                                if (entity9 instanceof LivingEntity) {
                                    LivingEntity _livEnt35 = (LivingEntity)entity9;
                                    f80 = _livEnt35.m_21223_();
                                } else {
                                    f80 = -1.0f;
                                }
                                entity9.m_6469_(damageSource33, (f81 + f80) / 5.0f + 2.0E7f);
                                DamageSource damageSource34 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                if (entity9 instanceof LivingEntity) {
                                    LivingEntity _livEnt13 = (LivingEntity)entity9;
                                    f79 = _livEnt13.m_21233_();
                                } else {
                                    f79 = -1.0f;
                                }
                                if (entity9 instanceof LivingEntity) {
                                    LivingEntity _livEnt36 = (LivingEntity)entity9;
                                    f78 = _livEnt36.m_21223_();
                                } else {
                                    f78 = -1.0f;
                                }
                                entity9.m_6469_(damageSource34, (f79 + f78) / 5.0f + 2.0E7f);
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI25 = (AdamantiumgolemtitanEntity)entity;
                            n58 = (Integer)_datEntI25.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n58 = 0;
                        }
                        if (n58 == 33 && world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:huiwuqiliu")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI26 = (AdamantiumgolemtitanEntity)entity;
                            n57 = (Integer)_datEntI26.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n57 = 0;
                        }
                        if (n57 == 36) {
                            ServerLevel projectileLevel;
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:summonappearance")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:summonappearance")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                }
                            }
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                                }
                            }
                            if (world instanceof ServerLevel) {
                                projectileLevel = (ServerLevel)world;
                                Projectile _entityToSpawn = new Object(){

                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        AdamanswordedgeEntity entityToSpawn = new AdamanswordedgeEntity((EntityType<? extends AdamanswordedgeEntity>)((EntityType)UltimateskeletonsModEntities.ADAMANSWORDEDGE.get()), level);
                                        entityToSpawn.m_5602_(shooter);
                                        entityToSpawn.m_36781_(damage);
                                        entityToSpawn.m_36735_(knockback);
                                        entityToSpawn.m_20225_(true);
                                        entityToSpawn.m_36762_(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow((Level)projectileLevel, entity, 1000000.0f, 1);
                                _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 32.0, y + 24.0, z + entity.m_20154_().f_82481_ * 32.0);
                                _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, 0.0, entity.m_20154_().f_82481_, 6.0f, 2.0f);
                                projectileLevel.m_7967_((Entity)_entityToSpawn);
                            }
                            if (world instanceof ServerLevel) {
                                projectileLevel = (ServerLevel)world;
                                Projectile _entityToSpawn = new Object(){

                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        AdamanswordedgeEntity entityToSpawn = new AdamanswordedgeEntity((EntityType<? extends AdamanswordedgeEntity>)((EntityType)UltimateskeletonsModEntities.ADAMANSWORDEDGE.get()), level);
                                        entityToSpawn.m_5602_(shooter);
                                        entityToSpawn.m_36781_(damage);
                                        entityToSpawn.m_36735_(knockback);
                                        entityToSpawn.m_20225_(true);
                                        entityToSpawn.m_36762_(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow((Level)projectileLevel, entity, 1000000.0f, 1);
                                _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 36.0, y + 24.0, z + entity.m_20154_().f_82481_ * 32.0);
                                _entityToSpawn.m_6686_(entity.m_20154_().f_82479_, 0.0, entity.m_20154_().f_82481_ * 2.0, 6.0f, 2.0f);
                                projectileLevel.m_7967_((Entity)_entityToSpawn);
                            }
                            if (world instanceof ServerLevel) {
                                projectileLevel = (ServerLevel)world;
                                Projectile _entityToSpawn = new Object(){

                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        AdamanswordedgeEntity entityToSpawn = new AdamanswordedgeEntity((EntityType<? extends AdamanswordedgeEntity>)((EntityType)UltimateskeletonsModEntities.ADAMANSWORDEDGE.get()), level);
                                        entityToSpawn.m_5602_(shooter);
                                        entityToSpawn.m_36781_(damage);
                                        entityToSpawn.m_36735_(knockback);
                                        entityToSpawn.m_20225_(true);
                                        entityToSpawn.m_36762_(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow((Level)projectileLevel, entity, 1000000.0f, 1);
                                _entityToSpawn.m_6034_(x + entity.m_20154_().f_82479_ * 32.0, y + 24.0, z + entity.m_20154_().f_82481_ * 32.0);
                                _entityToSpawn.m_6686_(entity.m_20154_().f_82479_ * 2.0, 0.0, entity.m_20154_().f_82481_, 6.0f, 2.0f);
                                projectileLevel.m_7967_((Entity)_entityToSpawn);
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI27 = (AdamantiumgolemtitanEntity)entity;
                            n56 = (Integer)_datEntI27.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n56 = 0;
                        }
                        if (n56 >= 55) {
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                ((AdamantiumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        _datEntI = (AdamantiumgolemtitanEntity)entity;
                        n12 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                    } else {
                        n12 = 0;
                    }
                    if (n12 == 8) {
                        int n60;
                        int n61;
                        int n62;
                        float f85;
                        LivingEntity livingEntity88;
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.blast");
                        }
                        if (entity instanceof Mob) {
                            Mob _mobEnt46 = (Mob)entity;
                            livingEntity88 = _mobEnt46.m_5448_();
                        } else {
                            livingEntity88 = null;
                        }
                        if (livingEntity88 != null) {
                            LivingEntity livingEntity89;
                            if (entity instanceof Mob) {
                                _mobEnt2 = (Mob)entity;
                                livingEntity89 = _mobEnt2.m_5448_();
                            } else {
                                livingEntity89 = null;
                            }
                            f85 = entity.m_20270_(livingEntity89);
                        } else {
                            f85 = -1.0f;
                        }
                        if (f85 > 1.0f) {
                            LivingEntity livingEntity90;
                            LivingEntity livingEntity91;
                            LivingEntity livingEntity92;
                            LivingEntity livingEntity93;
                            if (entity instanceof Mob) {
                                Mob _mobEnt47 = (Mob)entity;
                                livingEntity93 = _mobEnt47.m_5448_();
                            } else {
                                livingEntity93 = null;
                            }
                            double d = livingEntity93.m_20185_();
                            if (entity instanceof Mob) {
                                _mobEnt = (Mob)entity;
                                livingEntity92 = _mobEnt.m_5448_();
                            } else {
                                livingEntity92 = null;
                            }
                            double d27 = livingEntity92.m_20186_();
                            if (entity instanceof Mob) {
                                Mob _mobEnt48 = (Mob)entity;
                                livingEntity91 = _mobEnt48.m_5448_();
                            } else {
                                livingEntity91 = null;
                            }
                            double d28 = d27 + (double)livingEntity91.m_20206_() / 1.5;
                            if (entity instanceof Mob) {
                                Mob _mobEnt49 = (Mob)entity;
                                livingEntity90 = _mobEnt49.m_5448_();
                            } else {
                                livingEntity90 = null;
                            }
                            entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d28, livingEntity90.m_20189_()));
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI28 = (AdamantiumgolemtitanEntity)entity;
                            n62 = (Integer)_datEntI28.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n62 = 0;
                        }
                        if (n62 == 50) {
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:ultimatedeathlaser")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:ultimatedeathlaser")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                            if (world instanceof Level) {
                                _level = (Level)world;
                                if (!_level.m_5776_()) {
                                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:crit")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                                } else {
                                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:crit")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                                }
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI29 = (AdamantiumgolemtitanEntity)entity;
                            n61 = (Integer)_datEntI29.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n61 = 0;
                        }
                        if (n61 >= 50) {
                            int n63;
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntI2 = (AdamantiumgolemtitanEntity)entity;
                                n63 = (Integer)_datEntI2.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                            } else {
                                n63 = 0;
                            }
                            if (n63 <= 102) {
                                if (world instanceof ServerLevel) {
                                    ServerLevel _level14 = (ServerLevel)world;
                                    entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level14, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0))), MobSpawnType.MOB_SUMMONED);
                                    if (entityToSpawn != null) {
                                        entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                                    }
                                }
                                Vec3 _center5 = new Vec3(x + entity.m_20154_().f_82479_ * 150.0, y, z + entity.m_20154_().f_82481_ * 150.0);
                                _entfound = world.m_6443_(Entity.class, new AABB(_center5, _center5).m_82400_(1000.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center5))).toList();
                                for (Entity entityiterator : _entfound) {
                                    float f86;
                                    float f87;
                                    float f88;
                                    float f89;
                                    float f90;
                                    float f91;
                                    float f92;
                                    if (entityiterator instanceof AdamantiumgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                                    double _setval = 3.0;
                                    entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                        capability.camerashake = _setval;
                                        capability.syncPlayerVariables(entityiterator);
                                    });
                                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        LivingEntity _livEnt37 = (LivingEntity)entityiterator;
                                        f92 = _livEnt37.m_21233_();
                                    } else {
                                        f92 = -1.0f;
                                    }
                                    entityiterator.m_6469_(damageSource, f92 / 20.0f + 1680000.0f);
                                    if (entityiterator instanceof Titangodentity) continue;
                                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                                        entityiterator.f_19802_ = 0;
                                        Deathlist.normalattack(entityiterator);
                                    }
                                    DamageSource damageSource35 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        LivingEntity _livEnt38 = (LivingEntity)entityiterator;
                                        f91 = _livEnt38.m_21233_();
                                    } else {
                                        f91 = -1.0f;
                                    }
                                    entityiterator.m_6469_(damageSource35, f91 / 20.0f + 1680000.0f);
                                    DamageSource damageSource36 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        LivingEntity _livEnt39 = (LivingEntity)entityiterator;
                                        f90 = _livEnt39.m_21233_();
                                    } else {
                                        f90 = -1.0f;
                                    }
                                    entityiterator.m_6469_(damageSource36, f90 / 20.0f + 1680000.0f);
                                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                                    DamageSource damageSource37 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entityiterator;
                                        f89 = _livEnt.m_21233_();
                                    } else {
                                        f89 = -1.0f;
                                    }
                                    if (entityiterator instanceof LivingEntity) {
                                        LivingEntity _livEnt40 = (LivingEntity)entityiterator;
                                        f88 = _livEnt40.m_21223_();
                                    } else {
                                        f88 = -1.0f;
                                    }
                                    entityiterator.m_6469_(damageSource37, (f89 + f88) / 5.0f + 1.68E7f);
                                    DamageSource damageSource38 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                                    if (entityiterator instanceof LivingEntity) {
                                        _livEnt = (LivingEntity)entityiterator;
                                        f87 = _livEnt.m_21233_();
                                    } else {
                                        f87 = -1.0f;
                                    }
                                    if (entityiterator instanceof LivingEntity) {
                                        LivingEntity _livEnt41 = (LivingEntity)entityiterator;
                                        f86 = _livEnt41.m_21223_();
                                    } else {
                                        f86 = -1.0f;
                                    }
                                    entityiterator.m_6469_(damageSource38, (f87 + f86) / 5.0f + 1.68E7f);
                                }
                            }
                        }
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI30 = (AdamantiumgolemtitanEntity)entity;
                            n60 = (Integer)_datEntI30.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n60 = 0;
                        }
                        if (n60 >= 120) {
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                                _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationTick, (Object)0);
                            }
                            if (entity instanceof AdamantiumgolemtitanEntity) {
                                ((AdamantiumgolemtitanEntity)entity).setAnimation("empty");
                            }
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        _datEntI = (AdamantiumgolemtitanEntity)entity;
                        n11 = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
                    } else {
                        n11 = 0;
                    }
                    if (n11 != 9) break block871;
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.ultimashock");
                    }
                    if (entity instanceof Mob) {
                        Mob _mobEnt50 = (Mob)entity;
                        livingEntity = _mobEnt50.m_5448_();
                    } else {
                        livingEntity = null;
                    }
                    if (livingEntity != null) {
                        LivingEntity livingEntity94;
                        if (entity instanceof Mob) {
                            _mobEnt2 = (Mob)entity;
                            livingEntity94 = _mobEnt2.m_5448_();
                        } else {
                            livingEntity94 = null;
                        }
                        f = entity.m_20270_(livingEntity94);
                    } else {
                        f = -1.0f;
                    }
                    if (f > 1.0f) {
                        LivingEntity livingEntity95;
                        LivingEntity livingEntity96;
                        LivingEntity livingEntity97;
                        LivingEntity livingEntity98;
                        if (entity instanceof Mob) {
                            Mob _mobEnt51 = (Mob)entity;
                            livingEntity98 = _mobEnt51.m_5448_();
                        } else {
                            livingEntity98 = null;
                        }
                        double d = livingEntity98.m_20185_();
                        if (entity instanceof Mob) {
                            _mobEnt = (Mob)entity;
                            livingEntity97 = _mobEnt.m_5448_();
                        } else {
                            livingEntity97 = null;
                        }
                        double d29 = livingEntity97.m_20186_();
                        if (entity instanceof Mob) {
                            Mob _mobEnt52 = (Mob)entity;
                            livingEntity96 = _mobEnt52.m_5448_();
                        } else {
                            livingEntity96 = null;
                        }
                        double d30 = d29 + (double)livingEntity96.m_20206_() / 1.5;
                        if (entity instanceof Mob) {
                            Mob _mobEnt53 = (Mob)entity;
                            livingEntity95 = _mobEnt53.m_5448_();
                        } else {
                            livingEntity95 = null;
                        }
                        entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d30, livingEntity95.m_20189_()));
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        AdamantiumgolemtitanEntity _datEntI31 = (AdamantiumgolemtitanEntity)entity;
                        n10 = (Integer)_datEntI31.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n10 = 0;
                    }
                    if (n10 == 42) {
                        if (world instanceof Level) {
                            _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningshouter")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                            }
                        }
                        if (theta >= 360.0) {
                            theta = 0.0;
                        }
                        if (theta == 0.0) {
                            for (int index9 = 0; index9 < 240; ++index9) {
                                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ADAMANBLOCK.get()), x + 4.0 * Math.cos(theta), y + 50.0, z + 4.0 * Math.sin(theta), 12.0 * Math.cos(theta), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-1.0, (double)1.0), 12.0 * Math.sin(theta));
                                theta += 1.0;
                            }
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        AdamantiumgolemtitanEntity _datEntI32 = (AdamantiumgolemtitanEntity)entity;
                        n9 = (Integer)_datEntI32.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n9 = 0;
                    }
                    if (n9 == 75) {
                        if (world instanceof Level) {
                            Level _level15 = (Level)world;
                            if (!_level15.m_5776_()) {
                                _level15.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                            } else {
                                _level15.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:strike")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                            }
                        }
                        for (int index10 = 0; index10 < 32; ++index10) {
                            if (!(world instanceof ServerLevel)) continue;
                            ServerLevel _level16 = (ServerLevel)world;
                            entityToSpawn = ((EntityType)UltimateskeletonsModEntities.REDLIGHTNING.get()).m_262496_(_level16, BlockPos.m_274561_((double)(x + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0)), (double)y, (double)(z + Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-200.0, (double)200.0))), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn == null) continue;
                            entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                        Vec3 _center6 = new Vec3(x, y, z);
                        List<Entity> _entfound10 = world.m_6443_(Entity.class, new AABB(_center6, _center6).m_82400_(500.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center6))).toList();
                        for (Entity entity10 : _entfound10) {
                            double _setval = 8.0;
                            entity10.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                capability.camerashake = _setval;
                                capability.syncPlayerVariables(entity10);
                            });
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        AdamantiumgolemtitanEntity _datEntI33 = (AdamantiumgolemtitanEntity)entity;
                        n8 = (Integer)_datEntI33.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n8 = 0;
                    }
                    if (n8 == 89 && world instanceof ServerLevel) {
                        ServerLevel _level17 = (ServerLevel)world;
                        Entity entityToSpawn4 = ((EntityType)UltimateskeletonsModEntities.YITAIBALL.get()).m_262496_(_level17, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 40.0), (double)(y + 56.0), (double)(z + entity.m_20154_().f_82481_ * 40.0)), MobSpawnType.MOB_SUMMONED);
                        if (entityToSpawn4 != null) {
                            entityToSpawn4.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        AdamantiumgolemtitanEntity _datEntI34 = (AdamantiumgolemtitanEntity)entity;
                        n7 = (Integer)_datEntI34.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n7 = 0;
                    }
                    if (n7 >= 90) {
                        int n64;
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI35 = (AdamantiumgolemtitanEntity)entity;
                            n64 = (Integer)_datEntI35.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n64 = 0;
                        }
                        if (n64 <= 137) {
                            Vec3 _center7 = new Vec3(x, y, z);
                            _entfound = world.m_6443_(Entity.class, new AABB(_center7, _center7).m_82400_(1000.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center7))).toList();
                            for (Entity entityiterator : _entfound) {
                                double _setval = 3.0;
                                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                    capability.camerashake = _setval;
                                    capability.syncPlayerVariables(entityiterator);
                                });
                            }
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        AdamantiumgolemtitanEntity _datEntI36 = (AdamantiumgolemtitanEntity)entity;
                        n6 = (Integer)_datEntI36.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n6 = 0;
                    }
                    if (n6 == 139) {
                        Vec3 _center8 = new Vec3(x, y, z);
                        List<Entity> _entfound11 = world.m_6443_(Entity.class, new AABB(_center8, _center8).m_82400_(1000.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center8))).toList();
                        for (Entity entity11 : _entfound11) {
                            double _setval = 12.0;
                            entity11.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                                capability.camerashake = _setval;
                                capability.syncPlayerVariables(entity11);
                            });
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        AdamantiumgolemtitanEntity _datEntI37 = (AdamantiumgolemtitanEntity)entity;
                        n5 = (Integer)_datEntI37.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n5 = 0;
                    }
                    if (n5 >= 139) {
                        int n65;
                        if (entity instanceof AdamantiumgolemtitanEntity) {
                            AdamantiumgolemtitanEntity _datEntI38 = (AdamantiumgolemtitanEntity)entity;
                            n65 = (Integer)_datEntI38.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                        } else {
                            n65 = 0;
                        }
                        if (n65 <= 141 && world instanceof ServerLevel) {
                            ServerLevel _level18 = (ServerLevel)world;
                            entityToSpawn = ((EntityType)UltimateskeletonsModEntities.ADAMANSHOCK.get()).m_262496_(_level18, BlockPos.m_274561_((double)(x + entity.m_20154_().f_82479_ * 40.0), (double)(y + 56.0), (double)(z + entity.m_20154_().f_82481_ * 40.0)), MobSpawnType.MOB_SUMMONED);
                            if (entityToSpawn != null) {
                                entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                            }
                        }
                    }
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        AdamantiumgolemtitanEntity _datEntI39 = (AdamantiumgolemtitanEntity)entity;
                        n4 = (Integer)_datEntI39.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n4 = 0;
                    }
                    if (n4 == 42) break block872;
                    if (entity instanceof AdamantiumgolemtitanEntity) {
                        AdamantiumgolemtitanEntity _datEntI40 = (AdamantiumgolemtitanEntity)entity;
                        n3 = (Integer)_datEntI40.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
                    } else {
                        n3 = 0;
                    }
                    if (n3 != 75) break block873;
                }
                Vec3 _center = new Vec3(x + entity.m_20154_().f_82479_ * 64.0, y, z + entity.m_20154_().f_82481_ * 64.0);
                _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
                for (Entity entityiterator : _entfound) {
                    float f;
                    float f93;
                    float f94;
                    float f95;
                    float f96;
                    float f97;
                    float f98;
                    LivingEntity _livEnt14;
                    float f99;
                    if (entityiterator instanceof AdamantiumgolemtitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt42 = (LivingEntity)entityiterator;
                        f99 = _livEnt42.m_21233_();
                    } else {
                        f99 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f99 / 20.0f + 4200000.0f);
                    DamageSource damageSource39 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt14 = (LivingEntity)entityiterator;
                        f98 = _livEnt14.m_21233_();
                    } else {
                        f98 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource39, f98 / 20.0f + 4200000.0f);
                    if (entityiterator instanceof Titangodentity) continue;
                    if (((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                        entityiterator.f_19802_ = 0;
                        Deathlist.normalattack(entityiterator);
                    }
                    DamageSource damageSource40 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268448_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt14 = (LivingEntity)entityiterator;
                        f97 = _livEnt14.m_21233_();
                    } else {
                        f97 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource40, f97 / 20.0f + 4200000.0f);
                    DamageSource damageSource41 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268565_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt14 = (LivingEntity)entityiterator;
                        f96 = _livEnt14.m_21233_();
                    } else {
                        f96 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource41, f96 / 20.0f + 4200000.0f);
                    if (!(entityiterator.m_20206_() > 6.0f)) continue;
                    DamageSource damageSource42 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f95 = _livEnt.m_21233_();
                    } else {
                        f95 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt14 = (LivingEntity)entityiterator;
                        f94 = _livEnt14.m_21223_();
                    } else {
                        f94 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource42, (f95 + f94) / 5.0f + 4.2E7f);
                    DamageSource damageSource43 = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))), entity, entity);
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt = (LivingEntity)entityiterator;
                        f93 = _livEnt.m_21233_();
                    } else {
                        f93 = -1.0f;
                    }
                    if (entityiterator instanceof LivingEntity) {
                        _livEnt14 = (LivingEntity)entityiterator;
                        f = _livEnt14.m_21223_();
                    } else {
                        f = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource43, (f93 + f) / 5.0f + 4.2E7f);
                }
            }
            if (entity instanceof AdamantiumgolemtitanEntity) {
                AdamantiumgolemtitanEntity _datEntI41 = (AdamantiumgolemtitanEntity)entity;
                n2 = (Integer)_datEntI41.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
            } else {
                n2 = 0;
            }
            if (n2 >= 170) {
                if (entity instanceof AdamantiumgolemtitanEntity) {
                    AdamantiumgolemtitanEntity _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof AdamantiumgolemtitanEntity) {
                    AdamantiumgolemtitanEntity _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof AdamantiumgolemtitanEntity) {
                    ((AdamantiumgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
        if (entity instanceof AdamantiumgolemtitanEntity) {
            _datEntI = (AdamantiumgolemtitanEntity)entity;
            n = (Integer)_datEntI.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationID);
        } else {
            n = 0;
        }
        if (n == 10) {
            int n66;
            int n67;
            float f;
            LivingEntity livingEntity;
            if (entity instanceof AdamantiumgolemtitanEntity) {
                ((AdamantiumgolemtitanEntity)entity).setAnimation("animation.irongolemtitan.td");
            }
            if (entity instanceof Mob) {
                Mob _mobEnt54 = (Mob)entity;
                livingEntity = _mobEnt54.m_5448_();
            } else {
                livingEntity = null;
            }
            if (livingEntity != null) {
                LivingEntity livingEntity99;
                if (entity instanceof Mob) {
                    Mob _mobEnt55 = (Mob)entity;
                    livingEntity99 = _mobEnt55.m_5448_();
                } else {
                    livingEntity99 = null;
                }
                f = entity.m_20270_(livingEntity99);
            } else {
                f = -1.0f;
            }
            if (f > 1.0f) {
                LivingEntity livingEntity100;
                LivingEntity livingEntity101;
                LivingEntity livingEntity102;
                LivingEntity livingEntity103;
                if (entity instanceof Mob) {
                    Mob _mobEnt56 = (Mob)entity;
                    livingEntity103 = _mobEnt56.m_5448_();
                } else {
                    livingEntity103 = null;
                }
                double d = livingEntity103.m_20185_();
                if (entity instanceof Mob) {
                    _mobEnt = (Mob)entity;
                    livingEntity102 = _mobEnt.m_5448_();
                } else {
                    livingEntity102 = null;
                }
                double d31 = livingEntity102.m_20186_();
                if (entity instanceof Mob) {
                    Mob _mobEnt57 = (Mob)entity;
                    livingEntity101 = _mobEnt57.m_5448_();
                } else {
                    livingEntity101 = null;
                }
                double d32 = d31 + (double)livingEntity101.m_20206_() / 1.5;
                if (entity instanceof Mob) {
                    Mob _mobEnt58 = (Mob)entity;
                    livingEntity100 = _mobEnt58.m_5448_();
                } else {
                    livingEntity100 = null;
                }
                entity.m_7618_(EntityAnchorArgument.Anchor.EYES, new Vec3(d, d32, livingEntity100.m_20189_()));
            }
            if (entity instanceof AdamantiumgolemtitanEntity) {
                AdamantiumgolemtitanEntity _datEntI42 = (AdamantiumgolemtitanEntity)entity;
                n67 = (Integer)_datEntI42.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
            } else {
                n67 = 0;
            }
            if (n67 == 18) {
                float f100;
                LivingEntity livingEntity104;
                if (world instanceof Level) {
                    Level _level = (Level)world;
                    if (!_level.m_5776_()) {
                        _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f);
                    } else {
                        _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:swing")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
                    }
                }
                if (entity instanceof Mob) {
                    Mob _mobEnt59 = (Mob)entity;
                    livingEntity104 = _mobEnt59.m_5448_();
                } else {
                    livingEntity104 = null;
                }
                if (livingEntity104 != null) {
                    LivingEntity livingEntity105;
                    if (entity instanceof Mob) {
                        Mob _mobEnt60 = (Mob)entity;
                        livingEntity105 = _mobEnt60.m_5448_();
                    } else {
                        livingEntity105 = null;
                    }
                    f100 = entity.m_20270_(livingEntity105);
                } else {
                    f100 = -1.0f;
                }
                if (f100 > 1.0f) {
                    if (world instanceof ServerLevel) {
                        LivingEntity livingEntity106;
                        LivingEntity livingEntity107;
                        LivingEntity livingEntity108;
                        projectileLevel = (ServerLevel)world;
                        Projectile projectile = new Object(){

                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                GiantadamantiumEntity entityToSpawn = new GiantadamantiumEntity((EntityType<? extends GiantadamantiumEntity>)((EntityType)UltimateskeletonsModEntities.GIANTADAMANTIUM.get()), level);
                                entityToSpawn.m_5602_(shooter);
                                entityToSpawn.m_36781_(damage);
                                entityToSpawn.m_36735_(knockback);
                                entityToSpawn.m_20225_(true);
                                entityToSpawn.m_36762_(true);
                                return entityToSpawn;
                            }
                        }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                        projectile.m_6034_(x + entity.m_20154_().f_82479_ * 28.0, y + 55.0, z + entity.m_20154_().f_82481_ * 28.0);
                        if (entity instanceof Mob) {
                            Mob _mobEnt61 = (Mob)entity;
                            livingEntity108 = _mobEnt61.m_5448_();
                        } else {
                            livingEntity108 = null;
                        }
                        double d = livingEntity108.m_20185_() - entity.m_20185_();
                        if (entity instanceof Mob) {
                            Mob _mobEnt62 = (Mob)entity;
                            livingEntity107 = _mobEnt62.m_5448_();
                        } else {
                            livingEntity107 = null;
                        }
                        double d33 = livingEntity107.m_20186_() - 50.0 - entity.m_20186_();
                        if (entity instanceof Mob) {
                            Mob _mobEnt63 = (Mob)entity;
                            livingEntity106 = _mobEnt63.m_5448_();
                        } else {
                            livingEntity106 = null;
                        }
                        projectile.m_6686_(d, d33, livingEntity106.m_20189_() - entity.m_20189_(), 4.0f, 2.0f);
                        projectileLevel.m_7967_((Entity)projectile);
                    }
                } else if (world instanceof ServerLevel) {
                    projectileLevel = (ServerLevel)world;
                    Projectile projectile = new Object(){

                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            GiantadamantiumEntity entityToSpawn = new GiantadamantiumEntity((EntityType<? extends GiantadamantiumEntity>)((EntityType)UltimateskeletonsModEntities.GIANTADAMANTIUM.get()), level);
                            entityToSpawn.m_5602_(shooter);
                            entityToSpawn.m_36781_(damage);
                            entityToSpawn.m_36735_(knockback);
                            entityToSpawn.m_20225_(true);
                            entityToSpawn.m_36762_(true);
                            return entityToSpawn;
                        }
                    }.getArrow((Level)projectileLevel, entity, 100.0f, 1);
                    projectile.m_6034_(x + entity.m_20154_().f_82479_ * 28.0, y + 55.0, z + entity.m_20154_().f_82481_ * 28.0);
                    projectile.m_6686_(entity.m_20154_().f_82479_, entity.m_20154_().f_82480_, entity.m_20154_().f_82481_, 4.0f, 2.0f);
                    projectileLevel.m_7967_((Entity)projectile);
                }
            }
            if (entity instanceof AdamantiumgolemtitanEntity) {
                AdamantiumgolemtitanEntity _datEntI43 = (AdamantiumgolemtitanEntity)entity;
                n66 = (Integer)_datEntI43.m_20088_().m_135370_(AdamantiumgolemtitanEntity.DATA_animationTick);
            } else {
                n66 = 0;
            }
            if (n66 >= 49) {
                if (entity instanceof AdamantiumgolemtitanEntity) {
                    AdamantiumgolemtitanEntity _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationID, (Object)0);
                }
                if (entity instanceof AdamantiumgolemtitanEntity) {
                    AdamantiumgolemtitanEntity _datEntSetI = (AdamantiumgolemtitanEntity)entity;
                    _datEntSetI.m_20088_().m_135381_(AdamantiumgolemtitanEntity.DATA_animationTick, (Object)0);
                }
                if (entity instanceof AdamantiumgolemtitanEntity) {
                    ((AdamantiumgolemtitanEntity)entity).setAnimation("empty");
                }
            }
        }
    }
}

