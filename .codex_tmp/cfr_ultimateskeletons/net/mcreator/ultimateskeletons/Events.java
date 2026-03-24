/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraftforge.event.TickEvent$LevelTickEvent
 *  net.minecraftforge.event.TickEvent$Phase
 *  net.minecraftforge.event.entity.EntityJoinLevelEvent
 *  net.minecraftforge.event.entity.living.LivingAttackEvent
 *  net.minecraftforge.event.entity.living.LivingDamageEvent
 *  net.minecraftforge.event.entity.living.LivingDeathEvent
 *  net.minecraftforge.event.entity.living.LivingEvent$LivingTickEvent
 *  net.minecraftforge.event.entity.living.LivingHurtEvent
 *  net.minecraftforge.eventbus.api.EventPriority
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package net.mcreator.ultimateskeletons;

import java.util.HashSet;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.configuration.SkeletonsConfiguration;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Events {
    @SubscribeEvent(priority=EventPriority.LOWEST)
    public static void onEntityJoinLevel(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof Titangodentity && ((Boolean)SkeletonsConfiguration.GOD.get()).booleanValue()) {
            Level world = event.getLevel();
            HashSet set = new HashSet();
            if (world.f_46443_) {
                if (world instanceof ClientLevel) {
                    ClientLevel clientLevel = (ClientLevel)world;
                    set.addAll(clientLevel.f_104566_);
                    set.addAll(clientLevel.f_171631_.f_157637_.f_156807_.values());
                    set.addAll(clientLevel.f_171631_.f_157637_.f_156808_.values());
                }
            } else if (world instanceof ServerLevel) {
                ServerLevel serverLevel = (ServerLevel)world;
                set.addAll(serverLevel.f_8546_);
                set.addAll(serverLevel.f_143244_.f_157494_.f_156807_.values());
                set.addAll(serverLevel.f_143244_.f_157494_.f_156808_.values());
            }
            for (Entity target : set) {
                if (target instanceof Player || target instanceof Titangodentity) continue;
                Deathlist.killEntity(target);
            }
        }
        if (Deathlist.disableSpawn && !(event.getEntity() instanceof Player) && !(event.getEntity() instanceof Titangodentity)) {
            event.setCanceled(true);
        }
        if (Deathlist.isDeadEntity(event.getEntity())) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent(priority=EventPriority.LOWEST)
    public static void onLivingEntityTick(LivingEvent.LivingTickEvent event) {
        if (Deathlist.disableSpawn && !(event.getEntity() instanceof Player) && !(event.getEntity() instanceof Titangodentity)) {
            Deathlist.killEntity((Entity)event.getEntity());
            event.setCanceled(true);
        }
        if (Deathlist.shouldProtect((Entity)event.getEntity())) {
            Deathlist.defense((Player)event.getEntity());
        }
    }

    @SubscribeEvent
    public static void onLevelTick(TickEvent.LevelTickEvent event) {
        if (event.phase == TickEvent.Phase.END && Deathlist.disableSpawn) {
            Level world = event.level;
            HashSet set = new HashSet();
            if (world.f_46443_) {
                if (world instanceof ClientLevel) {
                    ClientLevel clientLevel = (ClientLevel)world;
                    set.addAll(clientLevel.f_104566_);
                    set.addAll(clientLevel.f_171631_.f_157637_.f_156807_.values());
                    set.addAll(clientLevel.f_171631_.f_157637_.f_156808_.values());
                }
            } else if (world instanceof ServerLevel) {
                ServerLevel serverLevel = (ServerLevel)world;
                set.addAll(serverLevel.f_8546_);
                set.addAll(serverLevel.f_143244_.f_157494_.f_156807_.values());
                set.addAll(serverLevel.f_143244_.f_157494_.f_156808_.values());
            }
            for (Entity target : set) {
                if (target instanceof Player || target instanceof Titangodentity) continue;
                Deathlist.killEntity(target);
            }
        }
    }

    @SubscribeEvent(priority=EventPriority.LOWEST)
    public static void onEntityAttack(LivingAttackEvent event) {
        if (Deathlist.shouldProtect((Entity)event.getEntity())) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent(priority=EventPriority.LOWEST)
    public static void onEntityDie(LivingDeathEvent event) {
        if (Deathlist.shouldProtect((Entity)event.getEntity())) {
            Deathlist.defense((Player)event.getEntity());
            event.setCanceled(true);
        }
    }

    @SubscribeEvent(priority=EventPriority.LOWEST)
    public static void onEntityHurt(LivingHurtEvent event) {
        if (Deathlist.shouldProtect((Entity)event.getEntity())) {
            Deathlist.defense((Player)event.getEntity());
            event.setCanceled(true);
        }
    }

    @SubscribeEvent(priority=EventPriority.LOWEST)
    public static void onEntityDamage(LivingDamageEvent event) {
        if (Deathlist.shouldProtect((Entity)event.getEntity())) {
            Deathlist.defense((Player)event.getEntity());
            event.setCanceled(true);
        }
    }
}

