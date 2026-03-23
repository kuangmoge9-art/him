package com.himdev.him.guardian;

import com.himdev.him.HimMod;
import com.himdev.him.util.HimLog;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.monster.Slime;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HimMod.MOD_ID)
public final class SplittingMobCleanupController {
    private static final DivinePunisher DIVINE_PUNISHER = new DivinePunisher();

    private SplittingMobCleanupController() {
    }

    @SubscribeEvent
    public static void onEntityJoinLevel(EntityJoinLevelEvent event) {
        if (event.getLevel().isClientSide() || !(event.getLevel() instanceof ServerLevel serverLevel)) {
            return;
        }
        if (!(event.getEntity() instanceof Slime slime)) {
            return;
        }
        if (!SplittingMobCleanupTracker.shouldPunish(serverLevel, slime)) {
            return;
        }

        HimLog.info("punishment cleanup target={} type={} size={}", slime.getUUID(), slime.getType(), slime.getSize());
        DIVINE_PUNISHER.punish(serverLevel, slime);
    }
}
