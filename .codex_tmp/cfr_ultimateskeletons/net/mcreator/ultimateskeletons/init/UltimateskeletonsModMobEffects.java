/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffect
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.ultimateskeletons.init;

import net.mcreator.ultimateskeletons.potion.DeathcureMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class UltimateskeletonsModMobEffects {
    public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.MOB_EFFECTS, (String)"ultimateskeletons");
    public static final RegistryObject<MobEffect> DEATHCURE = REGISTRY.register("deathcure", () -> new DeathcureMobEffect());
}

