package com.himdev.him.guardian;

import com.himdev.him.HimMod;
import com.himdev.him.registry.HimEffects;
import com.himdev.him.util.HimLog;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HimMod.MOD_ID)
public final class GuardianRescueController {
    private static final int DIVINE_PROTECTION_TICKS = 100;
    private static final int RESISTANCE_AMPLIFIER = 4;
    private static final DivinePunisher DIVINE_PUNISHER = new DivinePunisher();
    private static final HimRescueExecutionController RESCUE_EXECUTION =
            new HimRescueExecutionController(DIVINE_PUNISHER);

    private GuardianRescueController() {
    }

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        if (!(event.getEntity() instanceof Player player)) {
            return;
        }
        if (player.isCreative() || player.isSpectator()) {
            return;
        }
        if (!wouldBeLethal(player, event.getAmount())) {
            return;
        }

        ThreatResolution resolution = ThreatResolver.resolve(event.getSource());
        event.setCanceled(true);
        rescue(player);
        punishIfNeeded(player.level(), resolution);
        HimLog.info(
                "rescued player={} source={} punish={} target={} reason={}",
                player.getGameProfile().getName(),
                event.getSource().getMsgId(),
                resolution.shouldPunish(),
                resolution.targetEntityId(),
                resolution.reason()
        );
    }

    private static boolean wouldBeLethal(Player player, float incomingDamage) {
        return incomingDamage >= player.getHealth();
    }

    private static void rescue(Player player) {
        player.setHealth(player.getMaxHealth());
        player.addEffect(new MobEffectInstance(HimEffects.DIVINE_PROTECTION.get(), DIVINE_PROTECTION_TICKS, 0));
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, DIVINE_PROTECTION_TICKS, RESISTANCE_AMPLIFIER, false, true, true));
        player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, DIVINE_PROTECTION_TICKS, 0, false, true, true));
    }

    private static void punishIfNeeded(Level level, ThreatResolution resolution) {
        if (!resolution.shouldPunish() || level.isClientSide() || resolution.targetEntityId() == null) {
            return;
        }
        if (!(level instanceof net.minecraft.server.level.ServerLevel serverLevel)) {
            return;
        }
        HimLog.info("punishment routed target={} reason={}", resolution.targetEntityId(), resolution.reason());
        RESCUE_EXECUTION.executeOrFallback(serverLevel, resolution.targetEntityId());
    }
}
