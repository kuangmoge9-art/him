package com.himdev.him.spawn;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import com.himdev.him.registry.HimEntityTypes;
import com.himdev.him.world.HimLocator;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HimMod.MOD_ID)
public final class FirstJoinHimSpawnController {
    private FirstJoinHimSpawnController() {
    }

    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        handlePlayerLogin(event.getEntity());
    }

    public static void handlePlayerLogin(Player player) {
        if (!(player.level() instanceof ServerLevel level)) {
            return;
        }
        if (HimLocator.isFirstJoinSpawnTriggered(level)) {
            return;
        }
        if (HimLocator.hasActiveHim(level)) {
            HimLocator.markFirstJoinSpawnTriggered(level);
            return;
        }

        HimEntity him = HimEntityTypes.HIM.get().create(level);
        if (him == null) {
            return;
        }

        Vec3 spawnPos = FirstJoinHimSpawnPlacement.resolve(level, player, him);
        him.moveTo(spawnPos.x, spawnPos.y, spawnPos.z, player.getYRot(), player.getXRot());
        if (level.addFreshEntity(him) && !him.isRemoved()) {
            HimLocator.markFirstJoinSpawnTriggered(level);
        }
    }
}
