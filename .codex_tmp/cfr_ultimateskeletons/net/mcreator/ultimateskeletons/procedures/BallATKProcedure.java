/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Holder
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.PathfinderMob
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
import net.mcreator.ultimateskeletons.entity.AdamanshockEntity;
import net.mcreator.ultimateskeletons.entity.AdamantiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.AdminiumshockEntity;
import net.mcreator.ultimateskeletons.entity.BallEntity;
import net.mcreator.ultimateskeletons.entity.BedrockgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.CreepertitanEntity;
import net.mcreator.ultimateskeletons.entity.ExplosionshockwaveEntity;
import net.mcreator.ultimateskeletons.entity.ExplosiontitanEntity;
import net.mcreator.ultimateskeletons.entity.ShiningEntity;
import net.mcreator.ultimateskeletons.entity.StarSpiritEntity;
import net.mcreator.ultimateskeletons.entity.StarlightDeathEntity;
import net.mcreator.ultimateskeletons.entity.StarlightskeletonEntity;
import net.mcreator.ultimateskeletons.entity.StarshockEntity;
import net.mcreator.ultimateskeletons.entity.StarskeletonEntity;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class BallATKProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        List<Entity> _entfound;
        Object _datEntI;
        PathfinderMob _datEntI2;
        Vec3 _center;
        PathfinderMob _datEntI3;
        PathfinderMob _datEntSetI;
        if (entity == null) {
            return;
        }
        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
        if (entity instanceof BallEntity) {
            int n;
            _datEntSetI = (BallEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof BallEntity) {
                _datEntI3 = (BallEntity)entity;
                n = (Integer)_datEntI3.m_20088_().m_135370_(BallEntity.DATA_Tick);
            } else {
                n = 0;
            }
            synchedEntityData.m_135381_(BallEntity.DATA_Tick, (Object)(n + 1));
        }
        if (entity instanceof StarshockEntity) {
            int n;
            _datEntSetI = (StarshockEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof StarshockEntity) {
                _datEntI3 = (StarshockEntity)entity;
                n = (Integer)_datEntI3.m_20088_().m_135370_(StarshockEntity.DATA_Tick);
            } else {
                n = 0;
            }
            synchedEntityData.m_135381_(StarshockEntity.DATA_Tick, (Object)(n + 1));
        }
        if (entity instanceof AdminiumshockEntity) {
            int n;
            _datEntSetI = (AdminiumshockEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof AdminiumshockEntity) {
                _datEntI3 = (AdminiumshockEntity)entity;
                n = (Integer)_datEntI3.m_20088_().m_135370_(AdminiumshockEntity.DATA_Tick);
            } else {
                n = 0;
            }
            synchedEntityData.m_135381_(AdminiumshockEntity.DATA_Tick, (Object)(n + 1));
        }
        if (entity instanceof AdamanshockEntity) {
            int n;
            _datEntSetI = (AdamanshockEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof AdamanshockEntity) {
                _datEntI3 = (AdamanshockEntity)entity;
                n = (Integer)_datEntI3.m_20088_().m_135370_(AdamanshockEntity.DATA_Tick);
            } else {
                n = 0;
            }
            synchedEntityData.m_135381_(AdamanshockEntity.DATA_Tick, (Object)(n + 1));
        }
        if (entity instanceof ExplosionshockwaveEntity) {
            int n;
            _datEntSetI = (ExplosionshockwaveEntity)entity;
            SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
            if (entity instanceof ExplosionshockwaveEntity) {
                _datEntI3 = (ExplosionshockwaveEntity)entity;
                n = (Integer)_datEntI3.m_20088_().m_135370_(ExplosionshockwaveEntity.DATA_Tick);
            } else {
                n = 0;
            }
            synchedEntityData.m_135381_(ExplosionshockwaveEntity.DATA_Tick, (Object)(n + 1));
        }
        if (entity instanceof ExplosionshockwaveEntity) {
            int n;
            int n2;
            _center = new Vec3(x, y, z);
            AABB aABB = new AABB(_center, _center);
            if (entity instanceof ExplosionshockwaveEntity) {
                _datEntI2 = (ExplosionshockwaveEntity)entity;
                n2 = (Integer)_datEntI2.m_20088_().m_135370_(ExplosionshockwaveEntity.DATA_Tick);
            } else {
                n2 = 0;
            }
            if (entity instanceof ExplosionshockwaveEntity) {
                _datEntI = (ExplosionshockwaveEntity)entity;
                n = (Integer)_datEntI.m_20088_().m_135370_(ExplosionshockwaveEntity.DATA_Tick);
            } else {
                n = 0;
            }
            _entfound = world.m_6443_(Entity.class, aABB.m_82400_((double)(n2 * n) * 0.8 / 2.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound) {
                float f;
                double _setval = 3.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
                if (!(entityiterator instanceof ExplosionshockwaveEntity || entityiterator instanceof ExplosiontitanEntity || entityiterator instanceof ShiningEntity || entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player)) {
                    entityiterator.f_19802_ = 0;
                    Deathlist.normalattack(entityiterator);
                }
                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                    if (entityiterator instanceof CreepertitanEntity || entityiterator instanceof ExplosiontitanEntity || entityiterator instanceof ShiningEntity || entityiterator instanceof ExplosionshockwaveEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 128000.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 128000.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage")))), 25600.0f);
                    continue;
                }
                if (entityiterator instanceof ExplosiontitanEntity || entityiterator instanceof ShiningEntity || entityiterator instanceof ExplosionshockwaveEntity || entityiterator instanceof Player || entityiterator instanceof CreepertitanEntity || !(entityiterator instanceof LivingEntity)) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_));
                if (entityiterator instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21223_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f * 10.0f);
                if (!(entityiterator instanceof LivingEntity)) continue;
                LivingEntity _entity = (LivingEntity)entityiterator;
                _entity.m_21153_(0.0f);
            }
        }
        if (entity instanceof AdamanshockEntity) {
            int n;
            int n3;
            _center = new Vec3(x, y, z);
            AABB aABB = new AABB(_center, _center);
            if (entity instanceof AdamanshockEntity) {
                _datEntI2 = (AdamanshockEntity)entity;
                n3 = (Integer)_datEntI2.m_20088_().m_135370_(AdamanshockEntity.DATA_Tick);
            } else {
                n3 = 0;
            }
            if (entity instanceof AdamanshockEntity) {
                _datEntI = (AdamanshockEntity)entity;
                n = (Integer)_datEntI.m_20088_().m_135370_(AdamanshockEntity.DATA_Tick);
            } else {
                n = 0;
            }
            _entfound = world.m_6443_(Entity.class, aABB.m_82400_((double)(n3 * n * 2) / 2.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound) {
                float f;
                double _setval = 4.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
                if (!(entityiterator instanceof AdamanshockEntity) && !(entityiterator instanceof AdamantiumgolemtitanEntity) && entityiterator instanceof LivingEntity && !(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                    entityiterator.f_19802_ = 0;
                    Deathlist.normalattack(entityiterator);
                }
                if (entityiterator instanceof AdamanshockEntity || entityiterator instanceof AdamantiumgolemtitanEntity) continue;
                entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 2560000.0f);
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))));
                if (entityiterator instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21223_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f / 2.0f + 2666666.0f);
            }
        }
        if (entity instanceof AdminiumshockEntity) {
            int n;
            int n4;
            _center = new Vec3(x, y, z);
            AABB aABB = new AABB(_center, _center);
            if (entity instanceof AdminiumshockEntity) {
                _datEntI2 = (AdminiumshockEntity)entity;
                n4 = (Integer)_datEntI2.m_20088_().m_135370_(AdminiumshockEntity.DATA_Tick);
            } else {
                n4 = 0;
            }
            if (entity instanceof AdminiumshockEntity) {
                _datEntI = (AdminiumshockEntity)entity;
                n = (Integer)_datEntI.m_20088_().m_135370_(AdminiumshockEntity.DATA_Tick);
            } else {
                n = 0;
            }
            _entfound = world.m_6443_(Entity.class, aABB.m_82400_((double)(n4 * n) * 1.6 / 2.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound) {
                float f;
                double _setval = 4.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
                if (!(entityiterator instanceof AdminiumshockEntity) && !(entityiterator instanceof BedrockgolemtitanEntity) && entityiterator instanceof LivingEntity && !(entityiterator instanceof Titangodentity) && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() && !(entityiterator instanceof Player)) {
                    entityiterator.f_19802_ = 0;
                    Deathlist.normalattack(entityiterator);
                }
                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                    float f2;
                    if (entityiterator instanceof BedrockgolemtitanEntity || entityiterator instanceof AdminiumshockEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 1280000.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 1280000.0f);
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))));
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt = (LivingEntity)entityiterator;
                        f2 = _livEnt.m_21223_();
                    } else {
                        f2 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f2 / 4.0f + 1666666.0f);
                    continue;
                }
                if (entityiterator instanceof BedrockgolemtitanEntity || entityiterator instanceof AdminiumshockEntity || entityiterator instanceof Player || !(entityiterator instanceof LivingEntity)) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_));
                if (entityiterator instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21223_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f);
                if (!(entityiterator instanceof LivingEntity)) continue;
                LivingEntity _entity = (LivingEntity)entityiterator;
                _entity.m_21153_(0.0f);
            }
        }
        if (entity instanceof StarshockEntity) {
            int n;
            int n5;
            _center = new Vec3(x, y, z);
            AABB aABB = new AABB(_center, _center);
            if (entity instanceof StarshockEntity) {
                _datEntI2 = (StarshockEntity)entity;
                n5 = (Integer)_datEntI2.m_20088_().m_135370_(StarshockEntity.DATA_Tick);
            } else {
                n5 = 0;
            }
            if (entity instanceof StarshockEntity) {
                _datEntI = (StarshockEntity)entity;
                n = (Integer)_datEntI.m_20088_().m_135370_(StarshockEntity.DATA_Tick);
            } else {
                n = 0;
            }
            _entfound = world.m_6443_(Entity.class, aABB.m_82400_((double)(n5 * n) * 1.6 / 2.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound) {
                float f;
                double _setval = 3.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
                if (!(entityiterator instanceof StarlightskeletonEntity || entityiterator instanceof StarskeletonEntity || entityiterator instanceof StarshockEntity || !(entityiterator instanceof LivingEntity) || entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player)) {
                    entityiterator.f_19802_ = 0;
                    Deathlist.normalattack(entityiterator);
                }
                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                    float f3;
                    if (entityiterator instanceof StarSpiritEntity || entityiterator instanceof StarskeletonEntity || entityiterator instanceof StarshockEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 1280000.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 1280000.0f);
                    DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage"))));
                    if (entityiterator instanceof LivingEntity) {
                        LivingEntity _livEnt = (LivingEntity)entityiterator;
                        f3 = _livEnt.m_21223_();
                    } else {
                        f3 = -1.0f;
                    }
                    entityiterator.m_6469_(damageSource, f3 / 4.0f + 666666.0f);
                    continue;
                }
                if (entityiterator instanceof StarSpiritEntity || entityiterator instanceof StarskeletonEntity || entityiterator instanceof Player || entityiterator instanceof StarshockEntity || !(entityiterator instanceof LivingEntity)) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_));
                if (entityiterator instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21223_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f);
                if (!(entityiterator instanceof LivingEntity)) continue;
                LivingEntity _entity = (LivingEntity)entityiterator;
                _entity.m_21153_(0.0f);
            }
        }
        if (entity instanceof BallEntity) {
            int n;
            int n6;
            _center = new Vec3(x, y, z);
            AABB aABB = new AABB(_center, _center);
            if (entity instanceof BallEntity) {
                _datEntI2 = (BallEntity)entity;
                n6 = (Integer)_datEntI2.m_20088_().m_135370_(BallEntity.DATA_Tick);
            } else {
                n6 = 0;
            }
            if (entity instanceof BallEntity) {
                _datEntI = (BallEntity)entity;
                n = (Integer)_datEntI.m_20088_().m_135370_(BallEntity.DATA_Tick);
            } else {
                n = 0;
            }
            _entfound = world.m_6443_(Entity.class, aABB.m_82400_((double)(n6 * n) * 1.2 / 2.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound) {
                float f;
                double _setval = 3.0;
                entityiterator.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                    capability.camerashake = _setval;
                    capability.syncPlayerVariables(entityiterator);
                });
                if (!(entityiterator instanceof StarlightskeletonEntity || entityiterator instanceof StarskeletonEntity || entityiterator instanceof BallEntity || !(entityiterator instanceof LivingEntity) || entityiterator instanceof Titangodentity || !((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue() || entityiterator instanceof Player)) {
                    entityiterator.f_19802_ = 0;
                    Deathlist.normalattack(entityiterator);
                }
                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                    if (entityiterator instanceof StarlightskeletonEntity || entityiterator instanceof StarlightDeathEntity || entityiterator instanceof BallEntity) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268515_)), 128000.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 128000.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:titangoddamage")))), 51200.0f);
                    continue;
                }
                if (entityiterator instanceof StarlightskeletonEntity || entityiterator instanceof StarlightDeathEntity || entityiterator instanceof Player || entityiterator instanceof BallEntity || !(entityiterator instanceof LivingEntity)) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_));
                if (entityiterator instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21223_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f);
                if (!(entityiterator instanceof LivingEntity)) continue;
                LivingEntity _entity = (LivingEntity)entityiterator;
                _entity.m_21153_(0.0f);
            }
        }
    }
}

