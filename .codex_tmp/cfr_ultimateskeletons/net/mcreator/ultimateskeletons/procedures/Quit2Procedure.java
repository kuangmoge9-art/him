/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.GameType
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraftforge.event.entity.living.LivingHurtEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.entity.BallEntity;
import net.mcreator.ultimateskeletons.entity.ChainEntity;
import net.mcreator.ultimateskeletons.entity.DeathlaserEntity;
import net.mcreator.ultimateskeletons.entity.DeathshockEntity;
import net.mcreator.ultimateskeletons.entity.DeathwitherbeamEntity;
import net.mcreator.ultimateskeletons.entity.ElectricbombEntity;
import net.mcreator.ultimateskeletons.entity.ExplosionshockwaveEntity;
import net.mcreator.ultimateskeletons.entity.ExplosiontitanEntity;
import net.mcreator.ultimateskeletons.entity.GalaxyEntity;
import net.mcreator.ultimateskeletons.entity.MultiversespaceEntity;
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.mcreator.ultimateskeletons.entity.PushhandEntity;
import net.mcreator.ultimateskeletons.entity.ShiningEntity;
import net.mcreator.ultimateskeletons.entity.SpaceEntity;
import net.mcreator.ultimateskeletons.entity.StarshockEntity;
import net.mcreator.ultimateskeletons.entity.StarspawngalaxyEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
public class Quit2Procedure {
    @SubscribeEvent
    public static void onEntityAttacked(LivingHurtEvent event) {
        if (event != null && event.getEntity() != null) {
            Quit2Procedure.execute((Event)event, (LevelAccessor)event.getEntity().m_9236_(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), (Entity)event.getEntity(), event.getSource().m_7639_());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        Quit2Procedure.execute(null, world, x, y, z, entity, sourceentity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        LivingEntity _livEnt;
        Mob _entity;
        if (entity == null || sourceentity == null) {
            return;
        }
        if (entity instanceof Titangodentity && !(entity instanceof StarshockEntity) && !(entity instanceof BallEntity) && !(entity instanceof OriginallightningEntity) && world instanceof Level) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanpunch")), SoundSource.NEUTRAL, 200.0f, 1.0f);
            } else {
                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titanpunch")), SoundSource.NEUTRAL, 200.0f, 1.0f, false);
            }
        }
        if (entity instanceof Titangodentity && sourceentity instanceof Player && entity instanceof Mob) {
            _entity = (Mob)entity;
            if (sourceentity instanceof LivingEntity) {
                LivingEntity _ent = (LivingEntity)sourceentity;
                _entity.m_6710_(_ent);
            }
        }
        if (entity instanceof StarspawngalaxyEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof GalaxyEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof OriginallightningEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof Player && new Object(){

            public boolean checkGamemode(Entity _ent) {
                if (_ent instanceof ServerPlayer) {
                    ServerPlayer _serverPlayer = (ServerPlayer)_ent;
                    return _serverPlayer.f_8941_.m_9290_() == GameType.CREATIVE;
                }
                if (_ent.m_9236_().m_5776_() && _ent instanceof Player) {
                    Player _player = (Player)_ent;
                    return Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()) != null && Minecraft.m_91087_().m_91403_().m_104949_(_player.m_36316_().getId()).m_105325_() == GameType.CREATIVE;
                }
                return false;
            }
        }.checkGamemode(entity) && entity instanceof LivingEntity) {
            float f;
            _entity = (LivingEntity)entity;
            if (entity instanceof LivingEntity) {
                _livEnt = (LivingEntity)entity;
                f = _livEnt.m_21233_();
            } else {
                f = -1.0f;
            }
            _entity.m_21153_(f);
        }
        if (entity instanceof PushhandEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof DeathwitherbeamEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof DeathshockEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof DeathlaserEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof ChainEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof ElectricbombEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof MultiversespaceEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof SpaceEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof ExplosionshockwaveEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof ExplosiontitanEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
        if (entity instanceof ShiningEntity) {
            if (entity instanceof LivingEntity) {
                float f;
                _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    _livEnt = (LivingEntity)entity;
                    f = _livEnt.m_21233_();
                } else {
                    f = -1.0f;
                }
                _entity.m_21153_(f);
            }
            if (event != null && event.isCancelable()) {
                event.setCanceled(true);
            }
        }
    }
}

