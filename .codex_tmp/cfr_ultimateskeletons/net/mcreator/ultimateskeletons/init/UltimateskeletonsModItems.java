/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraftforge.common.ForgeSpawnEggItem
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.ultimateskeletons.init;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.item.ClearItem;
import net.mcreator.ultimateskeletons.item.GrowthItem;
import net.mcreator.ultimateskeletons.item.SpawnenergyskeletonItem;
import net.mcreator.ultimateskeletons.item.SpawnslimeItem;
import net.mcreator.ultimateskeletons.item.SpawnstarpowerskeletontitanItem;
import net.mcreator.ultimateskeletons.item.SpawnstarriverskeletonItem;
import net.mcreator.ultimateskeletons.item.SpawnstarskeletonItem;
import net.mcreator.ultimateskeletons.item.StardustItem;
import net.mcreator.ultimateskeletons.item.StargranuleItem;
import net.mcreator.ultimateskeletons.item.StaringotItem;
import net.mcreator.ultimateskeletons.item.StarlightdustItem;
import net.mcreator.ultimateskeletons.item.StarlightgranuleItem;
import net.mcreator.ultimateskeletons.item.StarlightingotItem;
import net.mcreator.ultimateskeletons.item.StarriverswordItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class UltimateskeletonsModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.ITEMS, (String)"ultimateskeletons");
    public static final RegistryObject<Item> ULTIMATEDEATHSKULL_SPAWN_EGG = REGISTRY.register("ultimatedeathskull_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.ULTIMATEDEATHSKULL, -13434778, -3407668, new Item.Properties()));
    public static final RegistryObject<Item> DEATHLASER_SPAWN_EGG = REGISTRY.register("deathlaser_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.DEATHLASER, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> DEATHSHOCK_SPAWN_EGG = REGISTRY.register("deathshock_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.DEATHSHOCK, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> PUSHHAND_SPAWN_EGG = REGISTRY.register("pushhand_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.PUSHHAND, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> DEATHWITHERBEAM_SPAWN_EGG = REGISTRY.register("deathwitherbeam_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.DEATHWITHERBEAM, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> CHAIN_SPAWN_EGG = REGISTRY.register("chain_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.CHAIN, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> MULTIVERSESPACE_SPAWN_EGG = REGISTRY.register("multiversespace_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.MULTIVERSESPACE, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> DEATHSKULL_SPAWN_EGG = REGISTRY.register("deathskull_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.DEATHSKULL, -13434778, -3407668, new Item.Properties()));
    public static final RegistryObject<Item> ELECTRICBOMB_SPAWN_EGG = REGISTRY.register("electricbomb_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.ELECTRICBOMB, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> CLEAR = REGISTRY.register("clear", () -> new ClearItem());
    public static final RegistryObject<Item> SPACE_SPAWN_EGG = REGISTRY.register("space_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.SPACE, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> SOLARSKELETON_SPAWN_EGG = REGISTRY.register("solarskeleton_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.SOLARSKELETON, -26317, -154, new Item.Properties()));
    public static final RegistryObject<Item> WITHERSKELETONTEMPLAR_SPAWN_EGG = REGISTRY.register("witherskeletontemplar_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.WITHERSKELETONTEMPLAR, -13421773, -65485, new Item.Properties()));
    public static final RegistryObject<Item> STARSKELETON_SPAWN_EGG = REGISTRY.register("starskeleton_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.STARSKELETON, -16776961, -10053121, new Item.Properties()));
    public static final RegistryObject<Item> ORIGINALLIGHTNING_SPAWN_EGG = REGISTRY.register("originallightning_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.ORIGINALLIGHTNING, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> GALAXY_SPAWN_EGG = REGISTRY.register("galaxy_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.GALAXY, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> SPAWNSTARSKELETON = REGISTRY.register("spawnstarskeleton", () -> new SpawnstarskeletonItem());
    public static final RegistryObject<Item> SUNS_SPAWN_EGG = REGISTRY.register("suns_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.SUNS, -1, -256, new Item.Properties()));
    public static final RegistryObject<Item> STARRIVERSWORD = REGISTRY.register("starriversword", () -> new StarriverswordItem());
    public static final RegistryObject<Item> STARLIGHTSKELETON_SPAWN_EGG = REGISTRY.register("starlightskeleton_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.STARLIGHTSKELETON, -13382401, -10053121, new Item.Properties()));
    public static final RegistryObject<Item> SPAWNSTARRIVERSKELETON = REGISTRY.register("spawnstarriverskeleton", () -> new SpawnstarriverskeletonItem());
    public static final RegistryObject<Item> SPAWNSLIME = REGISTRY.register("spawnslime", () -> new SpawnslimeItem());
    public static final RegistryObject<Item> BALL_SPAWN_EGG = REGISTRY.register("ball_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.BALL, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> STARLIGHTBLACKHOLE_SPAWN_EGG = REGISTRY.register("starlightblackhole_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.STARLIGHTBLACKHOLE, -16777216, -16724737, new Item.Properties()));
    public static final RegistryObject<Item> STARLIGHTFAZHEN_SPAWN_EGG = REGISTRY.register("starlightfazhen_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.STARLIGHTFAZHEN, -16777216, -16724737, new Item.Properties()));
    public static final RegistryObject<Item> WITHERSKELETONTITAN_SPAWN_EGG = REGISTRY.register("witherskeletontitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.WITHERSKELETONTITAN, -10066330, -16777216, new Item.Properties()));
    public static final RegistryObject<Item> TTTTEEEESSSSTTTTT_SPAWN_EGG = REGISTRY.register("tttteeeessssttttt_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.TTTTEEEESSSSTTTTT, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> TITANSPIRIT_SPAWN_EGG = REGISTRY.register("titanspirit_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.TITANSPIRIT, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> GROWTH = REGISTRY.register("growth", () -> new GrowthItem());
    public static final RegistryObject<Item> DANGER_SPAWN_EGG = REGISTRY.register("danger_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.DANGER, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> GIANTWITHERSKELETON_SPAWN_EGG = REGISTRY.register("giantwitherskeleton_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.GIANTWITHERSKELETON, -13421773, -10066330, new Item.Properties()));
    public static final RegistryObject<Item> STARINGOT = REGISTRY.register("staringot", () -> new StaringotItem());
    public static final RegistryObject<Item> STARLIGHTINGOT = REGISTRY.register("starlightingot", () -> new StarlightingotItem());
    public static final RegistryObject<Item> STARGRANULE = REGISTRY.register("stargranule", () -> new StargranuleItem());
    public static final RegistryObject<Item> STARLIGHTGRANULE = REGISTRY.register("starlightgranule", () -> new StarlightgranuleItem());
    public static final RegistryObject<Item> STARDUST = REGISTRY.register("stardust", () -> new StardustItem());
    public static final RegistryObject<Item> STARLIGHTDUST = REGISTRY.register("starlightdust", () -> new StarlightdustItem());
    public static final RegistryObject<Item> SKELETONTITAN_SPAWN_EGG = REGISTRY.register("skeletontitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.SKELETONTITAN, -1, -13421773, new Item.Properties()));
    public static final RegistryObject<Item> GIANTSKELETON_SPAWN_EGG = REGISTRY.register("giantskeleton_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.GIANTSKELETON, -6710887, -1, new Item.Properties()));
    public static final RegistryObject<Item> IRONGOLEMTITAN_SPAWN_EGG = REGISTRY.register("irongolemtitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.IRONGOLEMTITAN, -3956365, -1, new Item.Properties()));
    public static final RegistryObject<Item> ENDERMANTITAN_SPAWN_EGG = REGISTRY.register("endermantitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.ENDERMANTITAN, -13631416, -16777216, new Item.Properties()));
    public static final RegistryObject<Item> CHAOSCOLOSSUS_SPAWN_EGG = REGISTRY.register("chaoscolossus_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.CHAOSCOLOSSUS, -65536, -13210, new Item.Properties()));
    public static final RegistryObject<Item> EXPLOSIONTITAN_SPAWN_EGG = REGISTRY.register("explosiontitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.EXPLOSIONTITAN, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> CREEPERTITAN_SPAWN_EGG = REGISTRY.register("creepertitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.CREEPERTITAN, -13369549, -16764109, new Item.Properties()));
    public static final RegistryObject<Item> EXPLOSIONSHOCKWAVE_SPAWN_EGG = REGISTRY.register("explosionshockwave_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.EXPLOSIONSHOCKWAVE, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> SPAWNENERGYSKELETON = REGISTRY.register("spawnenergyskeleton", () -> new SpawnenergyskeletonItem());
    public static final RegistryObject<Item> WARDENTITAN_SPAWN_EGG = REGISTRY.register("wardentitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.WARDENTITAN, -16751002, -16764109, new Item.Properties()));
    public static final RegistryObject<Item> SPIDERTITAN_SPAWN_EGG = REGISTRY.register("spidertitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.SPIDERTITAN, -11252412, -14015460, new Item.Properties()));
    public static final RegistryObject<Item> SPAWNSTARPOWERSKELETONTITAN = REGISTRY.register("spawnstarpowerskeletontitan", () -> new SpawnstarpowerskeletontitanItem());
    public static final RegistryObject<Item> GHASTTITAN_SPAWN_EGG = REGISTRY.register("ghasttitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.GHASTTITAN, -1, -52429, new Item.Properties()));
    public static final RegistryObject<Item> VOIDGOLEMTITAN_SPAWN_EGG = REGISTRY.register("voidgolemtitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.VOIDGOLEMTITAN, -16777216, -16777165, new Item.Properties()));
    public static final RegistryObject<Item> BLAZETITAN_SPAWN_EGG = REGISTRY.register("blazetitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.BLAZETITAN, -13261, -154, new Item.Properties()));
    public static final RegistryObject<Item> ZOMBIETITAN_SPAWN_EGG = REGISTRY.register("zombietitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.ZOMBIETITAN, -16751053, -16763956, new Item.Properties()));
    public static final RegistryObject<Item> ZOMBIEPIGMANTITAN_SPAWN_EGG = REGISTRY.register("zombiepigmantitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.ZOMBIEPIGMANTITAN, -26215, -16751104, new Item.Properties()));
    public static final RegistryObject<Item> CAVESPIDERTITAN_SPAWN_EGG = REGISTRY.register("cavespidertitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.CAVESPIDERTITAN, -16764109, -52429, new Item.Properties()));
    public static final RegistryObject<Item> OMEGAFISH_SPAWN_EGG = REGISTRY.register("omegafish_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.OMEGAFISH, -6710887, -10066330, new Item.Properties()));
    public static final RegistryObject<Item> STARSHOCK_SPAWN_EGG = REGISTRY.register("starshock_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.STARSHOCK, -1, -1, new Item.Properties()));
    public static final RegistryObject<Item> HARCADIUMGOLEMTITAN_SPAWN_EGG = REGISTRY.register("harcadiumgolemtitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.HARCADIUMGOLEMTITAN, -6749953, -3394561, new Item.Properties()));
    public static final RegistryObject<Item> BEDROCKGOLEMTITAN_SPAWN_EGG = REGISTRY.register("bedrockgolemtitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.BEDROCKGOLEMTITAN, -13421773, -6750004, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTIUMGOLEMTITAN_SPAWN_EGG = REGISTRY.register("adamantiumgolemtitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.ADAMANTIUMGOLEMTITAN, -65536, -1, new Item.Properties()));
    public static final RegistryObject<Item> DEMONTIUMGOLEMTITAN_SPAWN_EGG = REGISTRY.register("demontiumgolemtitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.DEMONTIUMGOLEMTITAN, -16777012, -26317, new Item.Properties()));
    public static final RegistryObject<Item> WITHIRENIUMGOLEMTITAN_SPAWN_EGG = REGISTRY.register("withireniumgolemtitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.WITHIRENIUMGOLEMTITAN, -205, -39424, new Item.Properties()));
    public static final RegistryObject<Item> TITANUSGOLEMTITAN_SPAWN_EGG = REGISTRY.register("titanusgolemtitan_spawn_egg", () -> new ForgeSpawnEggItem(UltimateskeletonsModEntities.TITANUSGOLEMTITAN, -13369600, -10027162, new Item.Properties()));
}

