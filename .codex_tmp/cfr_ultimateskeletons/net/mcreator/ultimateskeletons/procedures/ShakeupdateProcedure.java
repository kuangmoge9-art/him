/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.world.entity.Entity
 *  net.minecraftforge.event.TickEvent$Phase
 *  net.minecraftforge.event.TickEvent$PlayerTickEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package net.mcreator.ultimateskeletons.procedures;

import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ShakeupdateProcedure {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            ShakeupdateProcedure.execute((Event)event, (Entity)event.player);
        }
    }

    public static void execute(Entity entity) {
        ShakeupdateProcedure.execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        double _setval;
        if (entity == null) {
            return;
        }
        UltimateskeletonsModVariables.PlayerVariables playerVariables = new UltimateskeletonsModVariables.PlayerVariables();
        if (((UltimateskeletonsModVariables.PlayerVariables)entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)playerVariables)).camerashake > 0.0) {
            _setval = ((UltimateskeletonsModVariables.PlayerVariables)entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new UltimateskeletonsModVariables.PlayerVariables())).camerashake / 1.2;
            entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                capability.camerashake = _setval;
                capability.syncPlayerVariables(entity);
            });
        }
        UltimateskeletonsModVariables.PlayerVariables playerVariables2 = new UltimateskeletonsModVariables.PlayerVariables();
        if (((UltimateskeletonsModVariables.PlayerVariables)entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)playerVariables2)).camerashake <= 0.05) {
            _setval = 0.0;
            entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
                capability.camerashake = _setval;
                capability.syncPlayerVariables(entity);
            });
        }
    }
}

