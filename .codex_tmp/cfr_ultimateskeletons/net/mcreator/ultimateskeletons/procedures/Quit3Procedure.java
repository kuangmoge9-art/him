/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.GameType
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package net.mcreator.ultimateskeletons.procedures;

import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameType;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Quit3Procedure {
    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        if (event != null && event.getEntity() != null) {
            Quit3Procedure.execute((Event)event, (Entity)event.getEntity());
        }
    }

    public static void execute(Entity entity) {
        Quit3Procedure.execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity == null) {
            return;
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
        }.checkGamemode(entity)) {
            if (entity instanceof LivingEntity) {
                float f;
                LivingEntity _entity = (LivingEntity)entity;
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entity;
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

