/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Holder
 *  net.minecraft.sounds.Music
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.ultimateskeletons;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModSounds;
import net.minecraft.core.Holder;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModMusics {
    public static final ForgeMusic Starbgm = new ForgeMusic(UltimateskeletonsModSounds.STARBGM, 0, 0, true);
    public static final ForgeMusic Starlightspawnbgm = new ForgeMusic(UltimateskeletonsModSounds.STARLIGHTSUMMON, 0, 0, true);
    public static final ForgeMusic Dangerbgm = new ForgeMusic(UltimateskeletonsModSounds.DANGER, 0, 0, true);

    private static class ForgeMusic
    extends Music {
        private final RegistryObject<SoundEvent> registryObject;

        public ForgeMusic(RegistryObject<SoundEvent> registryObject, int minDelay, int maxDelay, boolean replaceCurrentMusic) {
            super(null, minDelay, maxDelay, replaceCurrentMusic);
            this.registryObject = registryObject;
        }

        public Holder<SoundEvent> m_263193_() {
            return (Holder)this.registryObject.getHolder().get();
        }
    }
}

