/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.syncher.SynchedEntityData
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.entity.CavespidertitanEntity;
import net.mcreator.ultimateskeletons.entity.CreepertitanEntity;
import net.mcreator.ultimateskeletons.entity.EndermantitanEntity;
import net.mcreator.ultimateskeletons.entity.GiantskeletonEntity;
import net.mcreator.ultimateskeletons.entity.GiantwitherskeletonEntity;
import net.mcreator.ultimateskeletons.entity.OmegafishEntity;
import net.mcreator.ultimateskeletons.entity.SkeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.SpidertitanEntity;
import net.mcreator.ultimateskeletons.entity.TitanspiritEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.ZombiepigmantitanEntity;
import net.mcreator.ultimateskeletons.entity.ZombietitanEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
public class KillcountProcedure {
    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        if (event != null && event.getEntity() != null) {
            KillcountProcedure.execute((Event)event, (LevelAccessor)event.getEntity().m_9236_(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), (Entity)event.getEntity(), event.getSource().m_7639_());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        KillcountProcedure.execute(null, world, x, y, z, entity, sourceentity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null) {
            return;
        }
        if (!(entity instanceof Player)) {
            Titangodentity _datEntI;
            Titangodentity _datEntSetI;
            Titangodentity _datEntI2;
            PathfinderMob _datEntI3;
            PathfinderMob _datEntSetI2;
            if (sourceentity instanceof TitanspiritEntity) {
                if (sourceentity instanceof TitanspiritEntity) {
                    int n;
                    _datEntSetI2 = (TitanspiritEntity)sourceentity;
                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                    if (sourceentity instanceof TitanspiritEntity) {
                        _datEntI3 = (TitanspiritEntity)sourceentity;
                        n = (Integer)_datEntI3.m_20088_().m_135370_(TitanspiritEntity.DATA_killCount);
                    } else {
                        n = 0;
                    }
                    synchedEntityData.m_135381_(TitanspiritEntity.DATA_killCount, (Object)(n + 1));
                }
                if (!world.m_5776_() && world.m_7654_() != null) {
                    world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"killcount+1"), false);
                }
            }
            if (sourceentity instanceof GiantwitherskeletonEntity) {
                if (sourceentity instanceof GiantwitherskeletonEntity) {
                    int n;
                    _datEntSetI2 = (GiantwitherskeletonEntity)sourceentity;
                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                    if (sourceentity instanceof GiantwitherskeletonEntity) {
                        _datEntI3 = (GiantwitherskeletonEntity)sourceentity;
                        n = (Integer)_datEntI3.m_20088_().m_135370_(GiantwitherskeletonEntity.DATA_killCount);
                    } else {
                        n = 0;
                    }
                    synchedEntityData.m_135381_(GiantwitherskeletonEntity.DATA_killCount, (Object)(n + 1));
                }
                if (!world.m_5776_() && world.m_7654_() != null) {
                    world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"killcount+1"), false);
                }
            }
            if (sourceentity instanceof GiantskeletonEntity) {
                if (sourceentity instanceof GiantskeletonEntity) {
                    int n;
                    _datEntSetI2 = (GiantskeletonEntity)sourceentity;
                    SynchedEntityData synchedEntityData = _datEntSetI2.m_20088_();
                    if (sourceentity instanceof GiantskeletonEntity) {
                        _datEntI3 = (GiantskeletonEntity)sourceentity;
                        n = (Integer)_datEntI3.m_20088_().m_135370_(GiantskeletonEntity.DATA_killCount);
                    } else {
                        n = 0;
                    }
                    synchedEntityData.m_135381_(GiantskeletonEntity.DATA_killCount, (Object)(n + 1));
                }
                if (!world.m_5776_() && world.m_7654_() != null) {
                    world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"killcount+1"), false);
                }
            }
            if (sourceentity instanceof EndermantitanEntity) {
                int n;
                if (sourceentity instanceof EndermantitanEntity) {
                    _datEntI2 = (EndermantitanEntity)sourceentity;
                    n = (Integer)_datEntI2.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                } else {
                    n = 0;
                }
                if (n < 5000) {
                    int n2;
                    int n3;
                    int n4;
                    int n5;
                    int n6;
                    if (sourceentity instanceof EndermantitanEntity) {
                        int n7;
                        _datEntSetI = (EndermantitanEntity)sourceentity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (sourceentity instanceof EndermantitanEntity) {
                            _datEntI = (EndermantitanEntity)sourceentity;
                            n7 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n7 = 0;
                        }
                        synchedEntityData.m_135381_(EndermantitanEntity.DATA_killCount, (Object)(n7 + 1));
                    }
                    if (sourceentity instanceof EndermantitanEntity) {
                        _datEntI3 = (EndermantitanEntity)sourceentity;
                        n6 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n6 = 0;
                    }
                    if (n6 < 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"endermantitankillcount+1"), false);
                    }
                    if (sourceentity instanceof EndermantitanEntity) {
                        _datEntI3 = (EndermantitanEntity)sourceentity;
                        n5 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n5 = 0;
                    }
                    if (n5 >= 100) {
                        int n8;
                        if (sourceentity instanceof EndermantitanEntity) {
                            _datEntI = (EndermantitanEntity)sourceentity;
                            n8 = (Integer)_datEntI.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                        } else {
                            n8 = 0;
                        }
                        if (n8 < 1000) {
                            if (!world.m_5776_() && world.m_7654_() != null) {
                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75endermantitankillcount+1"), false);
                            }
                        } else if (!world.m_5776_() && world.m_7654_() != null) {
                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76endermantitankillcount+1"), false);
                        }
                    }
                    if (sourceentity instanceof EndermantitanEntity) {
                        _datEntI3 = (EndermantitanEntity)sourceentity;
                        n4 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n4 = 0;
                    }
                    if (n4 == 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75\u767e\u6740\uff01"), false);
                    }
                    if (sourceentity instanceof EndermantitanEntity) {
                        _datEntI3 = (EndermantitanEntity)sourceentity;
                        n3 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n3 = 0;
                    }
                    if (n3 == 1000 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u5343\u6740\uff01\uff01"), false);
                    }
                    if (sourceentity instanceof EndermantitanEntity) {
                        _datEntI3 = (EndermantitanEntity)sourceentity;
                        n2 = (Integer)_datEntI3.m_20088_().m_135370_(EndermantitanEntity.DATA_killCount);
                    } else {
                        n2 = 0;
                    }
                    if (n2 == 5000) {
                        if (world instanceof Level) {
                            Level _level = (Level)world;
                            if (!_level.m_5776_()) {
                                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:musamu")), SoundSource.NEUTRAL, 200.0f, 1.0f);
                            } else {
                                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:musamu")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
                            }
                        }
                        if (!world.m_5776_() && world.m_7654_() != null) {
                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u6740\u6c14\u5df2\u6ee1\uff01\uff01"), false);
                        }
                    }
                }
            }
            if (sourceentity instanceof WitherskeletontitanEntity) {
                int n;
                if (sourceentity instanceof WitherskeletontitanEntity) {
                    _datEntI2 = (WitherskeletontitanEntity)sourceentity;
                    n = (Integer)_datEntI2.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                } else {
                    n = 0;
                }
                if (n < 5000) {
                    int n9;
                    int n10;
                    int n11;
                    int n12;
                    int n13;
                    if (sourceentity instanceof WitherskeletontitanEntity) {
                        int n14;
                        _datEntSetI = (WitherskeletontitanEntity)sourceentity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (sourceentity instanceof WitherskeletontitanEntity) {
                            _datEntI = (WitherskeletontitanEntity)sourceentity;
                            n14 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n14 = 0;
                        }
                        synchedEntityData.m_135381_(WitherskeletontitanEntity.DATA_Tick, (Object)(n14 + 1));
                    }
                    if (sourceentity instanceof WitherskeletontitanEntity) {
                        _datEntI3 = (WitherskeletontitanEntity)sourceentity;
                        n13 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n13 = 0;
                    }
                    if (n13 < 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"witherskeletontitankillcount+1"), false);
                    }
                    if (sourceentity instanceof WitherskeletontitanEntity) {
                        _datEntI3 = (WitherskeletontitanEntity)sourceentity;
                        n12 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n12 = 0;
                    }
                    if (n12 >= 100) {
                        int n15;
                        if (sourceentity instanceof WitherskeletontitanEntity) {
                            _datEntI = (WitherskeletontitanEntity)sourceentity;
                            n15 = (Integer)_datEntI.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                        } else {
                            n15 = 0;
                        }
                        if (n15 < 1000) {
                            if (!world.m_5776_() && world.m_7654_() != null) {
                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75witherskeletontitankillcount+1"), false);
                            }
                        } else if (!world.m_5776_() && world.m_7654_() != null) {
                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76witherskeletontitankillcount+1"), false);
                        }
                    }
                    if (sourceentity instanceof WitherskeletontitanEntity) {
                        _datEntI3 = (WitherskeletontitanEntity)sourceentity;
                        n11 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n11 = 0;
                    }
                    if (n11 == 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75\u767e\u6740\uff01"), false);
                    }
                    if (sourceentity instanceof WitherskeletontitanEntity) {
                        _datEntI3 = (WitherskeletontitanEntity)sourceentity;
                        n10 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n10 = 0;
                    }
                    if (n10 == 1000 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u5343\u6740\uff01\uff01"), false);
                    }
                    if (sourceentity instanceof WitherskeletontitanEntity) {
                        _datEntI3 = (WitherskeletontitanEntity)sourceentity;
                        n9 = (Integer)_datEntI3.m_20088_().m_135370_(WitherskeletontitanEntity.DATA_Tick);
                    } else {
                        n9 = 0;
                    }
                    if (n9 == 5000 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u6740\u6c14\u5df2\u6ee1\uff01\uff01"), false);
                    }
                }
            }
            if (sourceentity instanceof ZombiepigmantitanEntity) {
                int n;
                if (sourceentity instanceof ZombiepigmantitanEntity) {
                    _datEntI2 = (ZombiepigmantitanEntity)sourceentity;
                    n = (Integer)_datEntI2.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                } else {
                    n = 0;
                }
                if (n < 2500) {
                    int n16;
                    int n17;
                    int n18;
                    int n19;
                    int n20;
                    if (sourceentity instanceof ZombiepigmantitanEntity) {
                        int n21;
                        _datEntSetI = (ZombiepigmantitanEntity)sourceentity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (sourceentity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)sourceentity;
                            n21 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                        } else {
                            n21 = 0;
                        }
                        synchedEntityData.m_135381_(ZombiepigmantitanEntity.DATA_killCount, (Object)(n21 + 1));
                    }
                    if (sourceentity instanceof ZombietitanEntity) {
                        _datEntI3 = (ZombietitanEntity)sourceentity;
                        n20 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n20 = 0;
                    }
                    if (n20 < 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"zombiepigmantitankillcount+1"), false);
                    }
                    if (sourceentity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)sourceentity;
                        n19 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                    } else {
                        n19 = 0;
                    }
                    if (n19 >= 100) {
                        int n22;
                        if (sourceentity instanceof ZombiepigmantitanEntity) {
                            _datEntI = (ZombiepigmantitanEntity)sourceentity;
                            n22 = (Integer)_datEntI.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                        } else {
                            n22 = 0;
                        }
                        if (n22 < 1000) {
                            if (!world.m_5776_() && world.m_7654_() != null) {
                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75zombiepigmantitankillcount+1"), false);
                            }
                        } else if (!world.m_5776_() && world.m_7654_() != null) {
                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76zombiepigmantitankillcount+1"), false);
                        }
                    }
                    if (sourceentity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)sourceentity;
                        n18 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                    } else {
                        n18 = 0;
                    }
                    if (n18 == 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75\u767e\u6740\uff01"), false);
                    }
                    if (sourceentity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)sourceentity;
                        n17 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                    } else {
                        n17 = 0;
                    }
                    if (n17 == 1000 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u5343\u6740\uff01\uff01"), false);
                    }
                    if (sourceentity instanceof ZombiepigmantitanEntity) {
                        _datEntI3 = (ZombiepigmantitanEntity)sourceentity;
                        n16 = (Integer)_datEntI3.m_20088_().m_135370_(ZombiepigmantitanEntity.DATA_killCount);
                    } else {
                        n16 = 0;
                    }
                    if (n16 == 2500 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u6740\u6c14\u5df2\u6ee1\uff01\uff01"), false);
                    }
                }
            }
            if (sourceentity instanceof CreepertitanEntity) {
                int n;
                if (sourceentity instanceof CreepertitanEntity) {
                    _datEntI2 = (CreepertitanEntity)sourceentity;
                    n = (Integer)_datEntI2.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                } else {
                    n = 0;
                }
                if (n < 2500) {
                    int n23;
                    int n24;
                    int n25;
                    int n26;
                    int n27;
                    if (sourceentity instanceof CreepertitanEntity) {
                        int n28;
                        _datEntSetI = (CreepertitanEntity)sourceentity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (sourceentity instanceof CreepertitanEntity) {
                            _datEntI = (CreepertitanEntity)sourceentity;
                            n28 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                        } else {
                            n28 = 0;
                        }
                        synchedEntityData.m_135381_(CreepertitanEntity.DATA_killCount, (Object)(n28 + 1));
                    }
                    if (sourceentity instanceof CreepertitanEntity) {
                        _datEntI3 = (CreepertitanEntity)sourceentity;
                        n27 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n27 = 0;
                    }
                    if (n27 < 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"creepertitankillcount+1"), false);
                    }
                    if (sourceentity instanceof CreepertitanEntity) {
                        _datEntI3 = (CreepertitanEntity)sourceentity;
                        n26 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n26 = 0;
                    }
                    if (n26 >= 100) {
                        int n29;
                        if (sourceentity instanceof CreepertitanEntity) {
                            _datEntI = (CreepertitanEntity)sourceentity;
                            n29 = (Integer)_datEntI.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                        } else {
                            n29 = 0;
                        }
                        if (n29 < 1000) {
                            if (!world.m_5776_() && world.m_7654_() != null) {
                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75creepertitankillcount+1"), false);
                            }
                        } else if (!world.m_5776_() && world.m_7654_() != null) {
                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76creepertitankillcount+1"), false);
                        }
                    }
                    if (sourceentity instanceof CreepertitanEntity) {
                        _datEntI3 = (CreepertitanEntity)sourceentity;
                        n25 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n25 = 0;
                    }
                    if (n25 == 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75\u767e\u6740\uff01"), false);
                    }
                    if (sourceentity instanceof CreepertitanEntity) {
                        _datEntI3 = (CreepertitanEntity)sourceentity;
                        n24 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n24 = 0;
                    }
                    if (n24 == 1000 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u5343\u6740\uff01\uff01"), false);
                    }
                    if (sourceentity instanceof CreepertitanEntity) {
                        _datEntI3 = (CreepertitanEntity)sourceentity;
                        n23 = (Integer)_datEntI3.m_20088_().m_135370_(CreepertitanEntity.DATA_killCount);
                    } else {
                        n23 = 0;
                    }
                    if (n23 == 2500 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u6740\u6c14\u5df2\u6ee1\uff01\uff01"), false);
                    }
                }
            }
            if (sourceentity instanceof ZombietitanEntity) {
                int n;
                if (sourceentity instanceof ZombietitanEntity) {
                    _datEntI2 = (ZombietitanEntity)sourceentity;
                    n = (Integer)_datEntI2.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                } else {
                    n = 0;
                }
                if (n < 2500) {
                    int n30;
                    int n31;
                    int n32;
                    int n33;
                    int n34;
                    if (sourceentity instanceof ZombietitanEntity) {
                        int n35;
                        _datEntSetI = (ZombietitanEntity)sourceentity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (sourceentity instanceof ZombietitanEntity) {
                            _datEntI = (ZombietitanEntity)sourceentity;
                            n35 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                        } else {
                            n35 = 0;
                        }
                        synchedEntityData.m_135381_(ZombietitanEntity.DATA_killCount, (Object)(n35 + 1));
                    }
                    if (sourceentity instanceof ZombietitanEntity) {
                        _datEntI3 = (ZombietitanEntity)sourceentity;
                        n34 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n34 = 0;
                    }
                    if (n34 < 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"zombietitankillcount+1"), false);
                    }
                    if (sourceentity instanceof ZombietitanEntity) {
                        _datEntI3 = (ZombietitanEntity)sourceentity;
                        n33 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n33 = 0;
                    }
                    if (n33 >= 100) {
                        int n36;
                        if (sourceentity instanceof ZombietitanEntity) {
                            _datEntI = (ZombietitanEntity)sourceentity;
                            n36 = (Integer)_datEntI.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                        } else {
                            n36 = 0;
                        }
                        if (n36 < 1000) {
                            if (!world.m_5776_() && world.m_7654_() != null) {
                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75zombietitankillcount+1"), false);
                            }
                        } else if (!world.m_5776_() && world.m_7654_() != null) {
                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76zombietitankillcount+1"), false);
                        }
                    }
                    if (sourceentity instanceof ZombietitanEntity) {
                        _datEntI3 = (ZombietitanEntity)sourceentity;
                        n32 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n32 = 0;
                    }
                    if (n32 == 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75\u767e\u6740\uff01"), false);
                    }
                    if (sourceentity instanceof ZombietitanEntity) {
                        _datEntI3 = (ZombietitanEntity)sourceentity;
                        n31 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n31 = 0;
                    }
                    if (n31 == 1000 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u5343\u6740\uff01\uff01"), false);
                    }
                    if (sourceentity instanceof ZombietitanEntity) {
                        _datEntI3 = (ZombietitanEntity)sourceentity;
                        n30 = (Integer)_datEntI3.m_20088_().m_135370_(ZombietitanEntity.DATA_killCount);
                    } else {
                        n30 = 0;
                    }
                    if (n30 == 2500 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u6740\u6c14\u5df2\u6ee1\uff01\uff01"), false);
                    }
                }
            }
            if (sourceentity instanceof SkeletontitanEntity) {
                int n;
                if (sourceentity instanceof SkeletontitanEntity) {
                    _datEntI2 = (SkeletontitanEntity)sourceentity;
                    n = (Integer)_datEntI2.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                } else {
                    n = 0;
                }
                if (n < 2500) {
                    int n37;
                    int n38;
                    int n39;
                    int n40;
                    int n41;
                    if (sourceentity instanceof SkeletontitanEntity) {
                        int n42;
                        _datEntSetI = (SkeletontitanEntity)sourceentity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (sourceentity instanceof SkeletontitanEntity) {
                            _datEntI = (SkeletontitanEntity)sourceentity;
                            n42 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n42 = 0;
                        }
                        synchedEntityData.m_135381_(SkeletontitanEntity.DATA_Tick, (Object)(n42 + 1));
                    }
                    if (sourceentity instanceof SkeletontitanEntity) {
                        _datEntI3 = (SkeletontitanEntity)sourceentity;
                        n41 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n41 = 0;
                    }
                    if (n41 < 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"skeletontitankillcount+1"), false);
                    }
                    if (sourceentity instanceof SkeletontitanEntity) {
                        _datEntI3 = (SkeletontitanEntity)sourceentity;
                        n40 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n40 = 0;
                    }
                    if (n40 >= 100) {
                        int n43;
                        if (sourceentity instanceof SkeletontitanEntity) {
                            _datEntI = (SkeletontitanEntity)sourceentity;
                            n43 = (Integer)_datEntI.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                        } else {
                            n43 = 0;
                        }
                        if (n43 < 1000) {
                            if (!world.m_5776_() && world.m_7654_() != null) {
                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75skeletontitankillcount+1"), false);
                            }
                        } else if (!world.m_5776_() && world.m_7654_() != null) {
                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76skeletontitankillcount+1"), false);
                        }
                    }
                    if (sourceentity instanceof SkeletontitanEntity) {
                        _datEntI3 = (SkeletontitanEntity)sourceentity;
                        n39 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n39 = 0;
                    }
                    if (n39 == 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75\u767e\u6740\uff01"), false);
                    }
                    if (sourceentity instanceof SkeletontitanEntity) {
                        _datEntI3 = (SkeletontitanEntity)sourceentity;
                        n38 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n38 = 0;
                    }
                    if (n38 == 1000 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u5343\u6740\uff01\uff01"), false);
                    }
                    if (sourceentity instanceof SkeletontitanEntity) {
                        _datEntI3 = (SkeletontitanEntity)sourceentity;
                        n37 = (Integer)_datEntI3.m_20088_().m_135370_(SkeletontitanEntity.DATA_Tick);
                    } else {
                        n37 = 0;
                    }
                    if (n37 == 2500 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u6740\u6c14\u5df2\u6ee1\uff01\uff01"), false);
                    }
                }
            }
            if (sourceentity instanceof SpidertitanEntity) {
                int n;
                if (sourceentity instanceof SpidertitanEntity) {
                    _datEntI2 = (SpidertitanEntity)sourceentity;
                    n = (Integer)_datEntI2.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                } else {
                    n = 0;
                }
                if (n < 1500) {
                    int n44;
                    int n45;
                    int n46;
                    int n47;
                    int n48;
                    if (sourceentity instanceof SpidertitanEntity) {
                        int n49;
                        _datEntSetI = (SpidertitanEntity)sourceentity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (sourceentity instanceof SpidertitanEntity) {
                            _datEntI = (SpidertitanEntity)sourceentity;
                            n49 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                        } else {
                            n49 = 0;
                        }
                        synchedEntityData.m_135381_(SpidertitanEntity.DATA_killCount, (Object)(n49 + 1));
                    }
                    if (sourceentity instanceof SpidertitanEntity) {
                        _datEntI3 = (SpidertitanEntity)sourceentity;
                        n48 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n48 = 0;
                    }
                    if (n48 < 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"spidertitankillcount+1"), false);
                    }
                    if (sourceentity instanceof SpidertitanEntity) {
                        _datEntI3 = (SpidertitanEntity)sourceentity;
                        n47 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n47 = 0;
                    }
                    if (n47 >= 100) {
                        int n50;
                        if (sourceentity instanceof SpidertitanEntity) {
                            _datEntI = (SpidertitanEntity)sourceentity;
                            n50 = (Integer)_datEntI.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                        } else {
                            n50 = 0;
                        }
                        if (n50 < 1000) {
                            if (!world.m_5776_() && world.m_7654_() != null) {
                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75spidertitankillcount+1"), false);
                            }
                        } else if (!world.m_5776_() && world.m_7654_() != null) {
                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76spidertitankillcount+1"), false);
                        }
                    }
                    if (sourceentity instanceof SpidertitanEntity) {
                        _datEntI3 = (SpidertitanEntity)sourceentity;
                        n46 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n46 = 0;
                    }
                    if (n46 == 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75\u767e\u6740\uff01"), false);
                    }
                    if (sourceentity instanceof SpidertitanEntity) {
                        _datEntI3 = (SpidertitanEntity)sourceentity;
                        n45 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n45 = 0;
                    }
                    if (n45 == 1000 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u5343\u6740\uff01\uff01"), false);
                    }
                    if (sourceentity instanceof SpidertitanEntity) {
                        _datEntI3 = (SpidertitanEntity)sourceentity;
                        n44 = (Integer)_datEntI3.m_20088_().m_135370_(SpidertitanEntity.DATA_killCount);
                    } else {
                        n44 = 0;
                    }
                    if (n44 == 1500 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u6740\u6c14\u5df2\u6ee1\uff01\uff01"), false);
                    }
                }
            }
            if (sourceentity instanceof CavespidertitanEntity) {
                int n;
                if (sourceentity instanceof CavespidertitanEntity) {
                    _datEntI2 = (CavespidertitanEntity)sourceentity;
                    n = (Integer)_datEntI2.m_20088_().m_135370_(CavespidertitanEntity.DATA_killCount);
                } else {
                    n = 0;
                }
                if (n < 1500) {
                    int n51;
                    int n52;
                    int n53;
                    int n54;
                    int n55;
                    if (sourceentity instanceof CavespidertitanEntity) {
                        int n56;
                        _datEntSetI = (CavespidertitanEntity)sourceentity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (sourceentity instanceof CavespidertitanEntity) {
                            _datEntI = (CavespidertitanEntity)sourceentity;
                            n56 = (Integer)_datEntI.m_20088_().m_135370_(CavespidertitanEntity.DATA_killCount);
                        } else {
                            n56 = 0;
                        }
                        synchedEntityData.m_135381_(CavespidertitanEntity.DATA_killCount, (Object)(n56 + 1));
                    }
                    if (sourceentity instanceof CavespidertitanEntity) {
                        _datEntI3 = (CavespidertitanEntity)sourceentity;
                        n55 = (Integer)_datEntI3.m_20088_().m_135370_(CavespidertitanEntity.DATA_killCount);
                    } else {
                        n55 = 0;
                    }
                    if (n55 < 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"cavespidertitankillcount+1"), false);
                    }
                    if (sourceentity instanceof CavespidertitanEntity) {
                        _datEntI3 = (CavespidertitanEntity)sourceentity;
                        n54 = (Integer)_datEntI3.m_20088_().m_135370_(CavespidertitanEntity.DATA_killCount);
                    } else {
                        n54 = 0;
                    }
                    if (n54 >= 100) {
                        int n57;
                        if (sourceentity instanceof CavespidertitanEntity) {
                            _datEntI = (CavespidertitanEntity)sourceentity;
                            n57 = (Integer)_datEntI.m_20088_().m_135370_(CavespidertitanEntity.DATA_killCount);
                        } else {
                            n57 = 0;
                        }
                        if (n57 < 1000) {
                            if (!world.m_5776_() && world.m_7654_() != null) {
                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75cavespidertitankillcount+1"), false);
                            }
                        } else if (!world.m_5776_() && world.m_7654_() != null) {
                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76cavespidertitankillcount+1"), false);
                        }
                    }
                    if (sourceentity instanceof CavespidertitanEntity) {
                        _datEntI3 = (CavespidertitanEntity)sourceentity;
                        n53 = (Integer)_datEntI3.m_20088_().m_135370_(CavespidertitanEntity.DATA_killCount);
                    } else {
                        n53 = 0;
                    }
                    if (n53 == 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75\u767e\u6740\uff01"), false);
                    }
                    if (sourceentity instanceof CavespidertitanEntity) {
                        _datEntI3 = (CavespidertitanEntity)sourceentity;
                        n52 = (Integer)_datEntI3.m_20088_().m_135370_(CavespidertitanEntity.DATA_killCount);
                    } else {
                        n52 = 0;
                    }
                    if (n52 == 1000 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u5343\u6740\uff01\uff01"), false);
                    }
                    if (sourceentity instanceof CavespidertitanEntity) {
                        _datEntI3 = (CavespidertitanEntity)sourceentity;
                        n51 = (Integer)_datEntI3.m_20088_().m_135370_(CavespidertitanEntity.DATA_killCount);
                    } else {
                        n51 = 0;
                    }
                    if (n51 == 1500 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u6740\u6c14\u5df2\u6ee1\uff01\uff01"), false);
                    }
                }
            }
            if (sourceentity instanceof OmegafishEntity) {
                int n;
                if (sourceentity instanceof OmegafishEntity) {
                    _datEntI2 = (OmegafishEntity)sourceentity;
                    n = (Integer)_datEntI2.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                } else {
                    n = 0;
                }
                if (n < 1500) {
                    int n58;
                    int n59;
                    int n60;
                    int n61;
                    int n62;
                    if (sourceentity instanceof OmegafishEntity) {
                        int n63;
                        _datEntSetI = (OmegafishEntity)sourceentity;
                        SynchedEntityData synchedEntityData = _datEntSetI.m_20088_();
                        if (sourceentity instanceof OmegafishEntity) {
                            _datEntI = (OmegafishEntity)sourceentity;
                            n63 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                        } else {
                            n63 = 0;
                        }
                        synchedEntityData.m_135381_(OmegafishEntity.DATA_killCount, (Object)(n63 + 1));
                    }
                    if (sourceentity instanceof OmegafishEntity) {
                        _datEntI3 = (OmegafishEntity)sourceentity;
                        n62 = (Integer)_datEntI3.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n62 = 0;
                    }
                    if (n62 < 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"omegafishkillcount+1"), false);
                    }
                    if (sourceentity instanceof OmegafishEntity) {
                        _datEntI3 = (OmegafishEntity)sourceentity;
                        n61 = (Integer)_datEntI3.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n61 = 0;
                    }
                    if (n61 >= 100) {
                        int n64;
                        if (sourceentity instanceof OmegafishEntity) {
                            _datEntI = (OmegafishEntity)sourceentity;
                            n64 = (Integer)_datEntI.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                        } else {
                            n64 = 0;
                        }
                        if (n64 < 1000) {
                            if (!world.m_5776_() && world.m_7654_() != null) {
                                world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75omegafishkillcount+1"), false);
                            }
                        } else if (!world.m_5776_() && world.m_7654_() != null) {
                            world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76omegafishkillcount+1"), false);
                        }
                    }
                    if (sourceentity instanceof OmegafishEntity) {
                        _datEntI3 = (OmegafishEntity)sourceentity;
                        n60 = (Integer)_datEntI3.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n60 = 0;
                    }
                    if (n60 == 100 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a75\u767e\u6740\uff01"), false);
                    }
                    if (sourceentity instanceof OmegafishEntity) {
                        _datEntI3 = (OmegafishEntity)sourceentity;
                        n59 = (Integer)_datEntI3.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n59 = 0;
                    }
                    if (n59 == 1000 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u5343\u6740\uff01\uff01"), false);
                    }
                    if (sourceentity instanceof OmegafishEntity) {
                        _datEntI3 = (OmegafishEntity)sourceentity;
                        n58 = (Integer)_datEntI3.m_20088_().m_135370_(OmegafishEntity.DATA_killCount);
                    } else {
                        n58 = 0;
                    }
                    if (n58 == 1500 && !world.m_5776_() && world.m_7654_() != null) {
                        world.m_7654_().m_6846_().m_240416_((Component)Component.m_237113_((String)"\u00a76\u6740\u6c14\u5df2\u6ee1\uff01\uff01"), false);
                    }
                }
            }
        }
    }
}

