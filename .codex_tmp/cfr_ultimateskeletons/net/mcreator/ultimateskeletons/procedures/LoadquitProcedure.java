/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.monster.Slime
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraftforge.event.entity.EntityJoinLevelEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package net.mcreator.ultimateskeletons.procedures;

import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.entity.ChainEntity;
import net.mcreator.ultimateskeletons.entity.DeathlaserEntity;
import net.mcreator.ultimateskeletons.entity.DeathshockEntity;
import net.mcreator.ultimateskeletons.entity.DeathskullEntity;
import net.mcreator.ultimateskeletons.entity.DeathwitherbeamEntity;
import net.mcreator.ultimateskeletons.entity.ElectricbombEntity;
import net.mcreator.ultimateskeletons.entity.MultiversespaceEntity;
import net.mcreator.ultimateskeletons.entity.PushhandEntity;
import net.mcreator.ultimateskeletons.entity.SpaceEntity;
import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class LoadquitProcedure {
    @SubscribeEvent
    public static void onEntityJoin(EntityJoinLevelEvent event) {
        LoadquitProcedure.execute((Event)event, (LevelAccessor)event.getLevel(), event.getEntity());
    }

    public static void execute(LevelAccessor world, Entity entity) {
        LoadquitProcedure.execute(null, world, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        if (!(!UltimateskeletonsModVariables.MapVariables.get((LevelAccessor)world).spawnquit || entity instanceof ChainEntity || entity instanceof DeathlaserEntity || entity instanceof DeathshockEntity || entity instanceof DeathskullEntity || entity instanceof DeathwitherbeamEntity || entity instanceof ElectricbombEntity || entity instanceof PushhandEntity || entity instanceof MultiversespaceEntity || entity instanceof SpaceEntity || entity instanceof UltimatedeathskullEntity || entity instanceof Slime || event == null || !event.isCancelable())) {
            event.setCanceled(true);
        }
    }
}

