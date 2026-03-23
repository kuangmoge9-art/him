package com.himdev.him.registry;

import com.himdev.him.HimMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class HimEffects {
    private static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HimMod.MOD_ID);

    public static final RegistryObject<MobEffect> DIVINE_PROTECTION =
            EFFECTS.register("divine_protection", DivineProtectionEffect::new);

    private HimEffects() {
    }

    public static void register(IEventBus modEventBus) {
        EFFECTS.register(modEventBus);
    }

    private static final class DivineProtectionEffect extends MobEffect {
        private DivineProtectionEffect() {
            super(MobEffectCategory.BENEFICIAL, 0xF5F1D4);
        }
    }
}
