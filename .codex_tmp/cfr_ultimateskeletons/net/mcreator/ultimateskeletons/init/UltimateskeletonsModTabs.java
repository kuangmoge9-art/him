/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.network.chat.Component
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.CreativeModeTabs
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 *  net.minecraftforge.event.BuildCreativeModeTabContentsEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.ultimateskeletons.init;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class UltimateskeletonsModTabs {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create((ResourceKey)Registries.f_279569_, (String)"ultimateskeletons");
    public static final RegistryObject<CreativeModeTab> ULTIMATESKELETONS = REGISTRY.register("ultimateskeletons", () -> CreativeModeTab.builder().m_257941_((Component)Component.m_237115_((String)"item_group.ultimateskeletons.ultimateskeletons")).m_257737_(() -> new ItemStack((ItemLike)UltimateskeletonsModItems.SPAWNSTARSKELETON.get())).m_257501_((parameters, tabData) -> {
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.CLEAR.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.SPAWNSTARSKELETON.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARRIVERSWORD.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.SPAWNSTARRIVERSKELETON.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.SPAWNSLIME.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.BALL_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.WITHERSKELETONTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.TTTTEEEESSSSTTTTT_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.TITANSPIRIT_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.GROWTH.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.DANGER_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.GIANTWITHERSKELETON_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.SKELETONTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.GIANTSKELETON_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.IRONGOLEMTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.ENDERMANTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.CHAOSCOLOSSUS_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.EXPLOSIONTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.CREEPERTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.SPAWNENERGYSKELETON.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.WARDENTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.SPIDERTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.SPAWNSTARPOWERSKELETONTITAN.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.GHASTTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.VOIDGOLEMTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.BLAZETITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.ZOMBIETITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.ZOMBIEPIGMANTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.CAVESPIDERTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.OMEGAFISH_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARSHOCK_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.HARCADIUMGOLEMTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.BEDROCKGOLEMTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.ADAMANTIUMGOLEMTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.DEMONTIUMGOLEMTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.WITHIRENIUMGOLEMTITAN_SPAWN_EGG.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.TITANUSGOLEMTITAN_SPAWN_EGG.get());
    }).m_257652_());
    public static final RegistryObject<CreativeModeTab> SKELETONMATERIAL = REGISTRY.register("skeletonmaterial", () -> CreativeModeTab.builder().m_257941_((Component)Component.m_237115_((String)"item_group.ultimateskeletons.skeletonmaterial")).m_257737_(() -> new ItemStack((ItemLike)UltimateskeletonsModItems.STARINGOT.get())).m_257501_((parameters, tabData) -> {
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARINGOT.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARLIGHTINGOT.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARGRANULE.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARLIGHTGRANULE.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARDUST.get());
        tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARLIGHTDUST.get());
    }).m_257652_());

    @SubscribeEvent
    public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
        if (tabData.getTabKey() == CreativeModeTabs.f_256731_) {
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.ULTIMATEDEATHSKULL_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.DEATHLASER_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.DEATHSHOCK_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.PUSHHAND_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.DEATHWITHERBEAM_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.CHAIN_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.MULTIVERSESPACE_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.DEATHSKULL_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.ELECTRICBOMB_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.SPACE_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.SOLARSKELETON_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.WITHERSKELETONTEMPLAR_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARSKELETON_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.ORIGINALLIGHTNING_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.GALAXY_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.SUNS_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARLIGHTSKELETON_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARLIGHTBLACKHOLE_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.STARLIGHTFAZHEN_SPAWN_EGG.get());
            tabData.m_246326_((ItemLike)UltimateskeletonsModItems.EXPLOSIONSHOCKWAVE_SPAWN_EGG.get());
        }
    }
}

