/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.player.Player
 *  net.minecraftforge.event.entity.living.LivingAttackEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package net.mcreator.ultimateskeletons.procedures;

import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.Titangodentity;
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
import net.mcreator.ultimateskeletons.entity.StarspawngalaxyEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Quit1Procedure {
    @SubscribeEvent
    public static void onEntityAttacked(LivingAttackEvent event) {
        if (event != null && event.getEntity() != null) {
            Quit1Procedure.execute((Event)event, (Entity)event.getEntity(), event.getSource().m_7639_());
        }
    }

    public static void execute(Entity entity, Entity sourceentity) {
        Quit1Procedure.execute(null, entity, sourceentity);
    }

    private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
        LivingEntity _livEnt;
        Mob _entity;
        if (entity == null || sourceentity == null) {
            return;
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

