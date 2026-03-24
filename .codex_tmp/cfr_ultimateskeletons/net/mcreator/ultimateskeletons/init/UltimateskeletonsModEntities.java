/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.EntityType$Builder
 *  net.minecraft.world.entity.MobCategory
 *  net.minecraftforge.event.entity.EntityAttributeCreationEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.ultimateskeletons.init;

import net.mcreator.ultimateskeletons.entity.AdamanshockEntity;
import net.mcreator.ultimateskeletons.entity.AdamanswordedgeEntity;
import net.mcreator.ultimateskeletons.entity.AdamantiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.AdminiumshockEntity;
import net.mcreator.ultimateskeletons.entity.BallEntity;
import net.mcreator.ultimateskeletons.entity.BedrockgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.BlackholeEntity;
import net.mcreator.ultimateskeletons.entity.BlazetitanEntity;
import net.mcreator.ultimateskeletons.entity.CavespidertitanEntity;
import net.mcreator.ultimateskeletons.entity.ChainEntity;
import net.mcreator.ultimateskeletons.entity.ChaoscolossusEntity;
import net.mcreator.ultimateskeletons.entity.ChaoslightningballEntity;
import net.mcreator.ultimateskeletons.entity.ChaosrainEntity;
import net.mcreator.ultimateskeletons.entity.CreeperfireballEntity;
import net.mcreator.ultimateskeletons.entity.CreepertitanEntity;
import net.mcreator.ultimateskeletons.entity.DangerEntity;
import net.mcreator.ultimateskeletons.entity.DeathlaserEntity;
import net.mcreator.ultimateskeletons.entity.DeathshockEntity;
import net.mcreator.ultimateskeletons.entity.DeathskullEntity;
import net.mcreator.ultimateskeletons.entity.DeathwitherbeamEntity;
import net.mcreator.ultimateskeletons.entity.DemontiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.ElectricbombEntity;
import net.mcreator.ultimateskeletons.entity.EndermantitanEntity;
import net.mcreator.ultimateskeletons.entity.EnderrainEntity;
import net.mcreator.ultimateskeletons.entity.EnergyskeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.ExplosionshockwaveEntity;
import net.mcreator.ultimateskeletons.entity.ExplosiontitanEntity;
import net.mcreator.ultimateskeletons.entity.FlashballEntity;
import net.mcreator.ultimateskeletons.entity.GalaxyEntity;
import net.mcreator.ultimateskeletons.entity.GamalightningEntity;
import net.mcreator.ultimateskeletons.entity.GhasttitanEntity;
import net.mcreator.ultimateskeletons.entity.GhostlightningEntity;
import net.mcreator.ultimateskeletons.entity.GiantadamantiumEntity;
import net.mcreator.ultimateskeletons.entity.GiantadminiumEntity;
import net.mcreator.ultimateskeletons.entity.GiantblazeEntity;
import net.mcreator.ultimateskeletons.entity.GiantdemontiumEntity;
import net.mcreator.ultimateskeletons.entity.GiantharcadiumEntity;
import net.mcreator.ultimateskeletons.entity.GiantharrowEntity;
import net.mcreator.ultimateskeletons.entity.GiantironEntity;
import net.mcreator.ultimateskeletons.entity.GiantskeletonEntity;
import net.mcreator.ultimateskeletons.entity.GianttitanusEntity;
import net.mcreator.ultimateskeletons.entity.GiantvoidEntity;
import net.mcreator.ultimateskeletons.entity.GiantwebEntity;
import net.mcreator.ultimateskeletons.entity.GiantwitherskeletonEntity;
import net.mcreator.ultimateskeletons.entity.GiantwithireniumEntity;
import net.mcreator.ultimateskeletons.entity.GreenlightningEntity;
import net.mcreator.ultimateskeletons.entity.GrowtherEntity;
import net.mcreator.ultimateskeletons.entity.HarcadiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.HarrowEntity;
import net.mcreator.ultimateskeletons.entity.IrongolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.LightningballEntity;
import net.mcreator.ultimateskeletons.entity.MasterballEntity;
import net.mcreator.ultimateskeletons.entity.MultiversespaceEntity;
import net.mcreator.ultimateskeletons.entity.OmegafishEntity;
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.mcreator.ultimateskeletons.entity.PosionEntity;
import net.mcreator.ultimateskeletons.entity.PurplelightningEntity;
import net.mcreator.ultimateskeletons.entity.PushhandEntity;
import net.mcreator.ultimateskeletons.entity.RainbowlightningEntity;
import net.mcreator.ultimateskeletons.entity.RedlightningEntity;
import net.mcreator.ultimateskeletons.entity.ShiningEntity;
import net.mcreator.ultimateskeletons.entity.SkeletonharrawEntity;
import net.mcreator.ultimateskeletons.entity.SkeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.SlimelaunchEntity;
import net.mcreator.ultimateskeletons.entity.SolarskeletonEntity;
import net.mcreator.ultimateskeletons.entity.SpaceEntity;
import net.mcreator.ultimateskeletons.entity.SpidertitanEntity;
import net.mcreator.ultimateskeletons.entity.StarSpiritEntity;
import net.mcreator.ultimateskeletons.entity.StarbladeEntity;
import net.mcreator.ultimateskeletons.entity.StarlightDeathEntity;
import net.mcreator.ultimateskeletons.entity.StarlightblackholeEntity;
import net.mcreator.ultimateskeletons.entity.StarlightfazhenEntity;
import net.mcreator.ultimateskeletons.entity.StarlightningEntity;
import net.mcreator.ultimateskeletons.entity.StarlightskeletonEntity;
import net.mcreator.ultimateskeletons.entity.StarshockEntity;
import net.mcreator.ultimateskeletons.entity.StarskeletonEntity;
import net.mcreator.ultimateskeletons.entity.StarskeletonpowertitanEntity;
import net.mcreator.ultimateskeletons.entity.StarspawngalaxyEntity;
import net.mcreator.ultimateskeletons.entity.StarswordedgecutEntity;
import net.mcreator.ultimateskeletons.entity.SunsEntity;
import net.mcreator.ultimateskeletons.entity.SwordedgecutEntity;
import net.mcreator.ultimateskeletons.entity.SwordedgeslashEntity;
import net.mcreator.ultimateskeletons.entity.SwordsofstarEntity;
import net.mcreator.ultimateskeletons.entity.TTTTEEEESSSSTTTTTEntity;
import net.mcreator.ultimateskeletons.entity.TitanfireballEntity;
import net.mcreator.ultimateskeletons.entity.TitanspiritEntity;
import net.mcreator.ultimateskeletons.entity.TitanswordedgeEntity;
import net.mcreator.ultimateskeletons.entity.TitanusgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.mcreator.ultimateskeletons.entity.VoidgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.WardentitanEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontemplarEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.WithireniumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.YitaiballEntity;
import net.mcreator.ultimateskeletons.entity.ZombiepigmantitanEntity;
import net.mcreator.ultimateskeletons.entity.ZombietitanEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class UltimateskeletonsModEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.ENTITY_TYPES, (String)"ultimateskeletons");
    public static final RegistryObject<EntityType<UltimatedeathskullEntity>> ULTIMATEDEATHSKULL = UltimateskeletonsModEntities.register("ultimatedeathskull", EntityType.Builder.m_20704_(UltimatedeathskullEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024).setUpdateInterval(3).setCustomClientFactory(UltimatedeathskullEntity::new).m_20719_().m_20699_(0.6f, 3.0f));
    public static final RegistryObject<EntityType<DeathlaserEntity>> DEATHLASER = UltimateskeletonsModEntities.register("deathlaser", EntityType.Builder.m_20704_(DeathlaserEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(640).setUpdateInterval(3).setCustomClientFactory(DeathlaserEntity::new).m_20719_().m_20699_(2.0f, 2.0f));
    public static final RegistryObject<EntityType<DeathshockEntity>> DEATHSHOCK = UltimateskeletonsModEntities.register("deathshock", EntityType.Builder.m_20704_(DeathshockEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(640).setUpdateInterval(3).setCustomClientFactory(DeathshockEntity::new).m_20719_().m_20699_(2.0f, 2.0f));
    public static final RegistryObject<EntityType<PushhandEntity>> PUSHHAND = UltimateskeletonsModEntities.register("pushhand", EntityType.Builder.m_20704_(PushhandEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(640).setUpdateInterval(3).setCustomClientFactory(PushhandEntity::new).m_20719_().m_20699_(2.0f, 2.0f));
    public static final RegistryObject<EntityType<DeathwitherbeamEntity>> DEATHWITHERBEAM = UltimateskeletonsModEntities.register("deathwitherbeam", EntityType.Builder.m_20704_(DeathwitherbeamEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(640).setUpdateInterval(3).setCustomClientFactory(DeathwitherbeamEntity::new).m_20719_().m_20699_(2.0f, 2.0f));
    public static final RegistryObject<EntityType<ChainEntity>> CHAIN = UltimateskeletonsModEntities.register("chain", EntityType.Builder.m_20704_(ChainEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(640).setUpdateInterval(3).setCustomClientFactory(ChainEntity::new).m_20719_().m_20699_(2.0f, 2.0f));
    public static final RegistryObject<EntityType<MultiversespaceEntity>> MULTIVERSESPACE = UltimateskeletonsModEntities.register("multiversespace", EntityType.Builder.m_20704_(MultiversespaceEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024).setUpdateInterval(3).setCustomClientFactory(MultiversespaceEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<DeathskullEntity>> DEATHSKULL = UltimateskeletonsModEntities.register("deathskull", EntityType.Builder.m_20704_(DeathskullEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024).setUpdateInterval(3).setCustomClientFactory(DeathskullEntity::new).m_20719_().m_20699_(0.6f, 2.5f));
    public static final RegistryObject<EntityType<ElectricbombEntity>> ELECTRICBOMB = UltimateskeletonsModEntities.register("electricbomb", EntityType.Builder.m_20704_(ElectricbombEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(640).setUpdateInterval(3).setCustomClientFactory(ElectricbombEntity::new).m_20719_().m_20699_(2.0f, 2.0f));
    public static final RegistryObject<EntityType<SpaceEntity>> SPACE = UltimateskeletonsModEntities.register("space", EntityType.Builder.m_20704_(SpaceEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpaceEntity::new).m_20719_().m_20699_(1.0f, 1.0f));
    public static final RegistryObject<EntityType<SolarskeletonEntity>> SOLARSKELETON = UltimateskeletonsModEntities.register("solarskeleton", EntityType.Builder.m_20704_(SolarskeletonEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(480).setUpdateInterval(3).setCustomClientFactory(SolarskeletonEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<WitherskeletontemplarEntity>> WITHERSKELETONTEMPLAR = UltimateskeletonsModEntities.register("witherskeletontemplar", EntityType.Builder.m_20704_(WitherskeletontemplarEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(480).setUpdateInterval(3).setCustomClientFactory(WitherskeletontemplarEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<SwordedgeslashEntity>> SWORDEDGESLASH = UltimateskeletonsModEntities.register("swordedgeslash", EntityType.Builder.m_20704_(SwordedgeslashEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(SwordedgeslashEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<SwordedgecutEntity>> SWORDEDGECUT = UltimateskeletonsModEntities.register("swordedgecut", EntityType.Builder.m_20704_(SwordedgecutEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(SwordedgecutEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<HarrowEntity>> HARROW = UltimateskeletonsModEntities.register("harrow", EntityType.Builder.m_20704_(HarrowEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(HarrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<StarskeletonEntity>> STARSKELETON = UltimateskeletonsModEntities.register("starskeleton", EntityType.Builder.m_20704_(StarskeletonEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(480).setUpdateInterval(3).setCustomClientFactory(StarskeletonEntity::new).m_20719_().m_20699_(0.6f, 2.2f));
    public static final RegistryObject<EntityType<OriginallightningEntity>> ORIGINALLIGHTNING = UltimateskeletonsModEntities.register("originallightning", EntityType.Builder.m_20704_(OriginallightningEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OriginallightningEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<GalaxyEntity>> GALAXY = UltimateskeletonsModEntities.register("galaxy", EntityType.Builder.m_20704_(GalaxyEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GalaxyEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<StarswordedgecutEntity>> STARSWORDEDGECUT = UltimateskeletonsModEntities.register("starswordedgecut", EntityType.Builder.m_20704_(StarswordedgecutEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(StarswordedgecutEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<StarspawngalaxyEntity>> STARSPAWNGALAXY = UltimateskeletonsModEntities.register("starspawngalaxy", EntityType.Builder.m_20704_(StarspawngalaxyEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarspawngalaxyEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<SunsEntity>> SUNS = UltimateskeletonsModEntities.register("suns", EntityType.Builder.m_20704_(SunsEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(640).setUpdateInterval(3).setCustomClientFactory(SunsEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<SwordsofstarEntity>> SWORDSOFSTAR = UltimateskeletonsModEntities.register("swordsofstar", EntityType.Builder.m_20704_(SwordsofstarEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(SwordsofstarEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<RainbowlightningEntity>> RAINBOWLIGHTNING = UltimateskeletonsModEntities.register("rainbowlightning", EntityType.Builder.m_20704_(RainbowlightningEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(RainbowlightningEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<StarlightskeletonEntity>> STARLIGHTSKELETON = UltimateskeletonsModEntities.register("starlightskeleton", EntityType.Builder.m_20704_(StarlightskeletonEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarlightskeletonEntity::new).m_20719_().m_20699_(0.6f, 2.0f));
    public static final RegistryObject<EntityType<StarlightningEntity>> STARLIGHTNING = UltimateskeletonsModEntities.register("starlightning", EntityType.Builder.m_20704_(StarlightningEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(StarlightningEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<SlimelaunchEntity>> SLIMELAUNCH = UltimateskeletonsModEntities.register("slimelaunch", EntityType.Builder.m_20704_(SlimelaunchEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(SlimelaunchEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<BallEntity>> BALL = UltimateskeletonsModEntities.register("ball", EntityType.Builder.m_20704_(BallEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BallEntity::new).m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<StarbladeEntity>> STARBLADE = UltimateskeletonsModEntities.register("starblade", EntityType.Builder.m_20704_(StarbladeEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(StarbladeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<StarlightblackholeEntity>> STARLIGHTBLACKHOLE = UltimateskeletonsModEntities.register("starlightblackhole", EntityType.Builder.m_20704_(StarlightblackholeEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(640).setUpdateInterval(3).setCustomClientFactory(StarlightblackholeEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<StarlightfazhenEntity>> STARLIGHTFAZHEN = UltimateskeletonsModEntities.register("starlightfazhen", EntityType.Builder.m_20704_(StarlightfazhenEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(640).setUpdateInterval(3).setCustomClientFactory(StarlightfazhenEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<StarSpiritEntity>> STAR_SPIRIT = UltimateskeletonsModEntities.register("star_spirit", EntityType.Builder.m_20704_(StarSpiritEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024).setUpdateInterval(3).setCustomClientFactory(StarSpiritEntity::new).m_20719_().m_20699_(0.6f, 2.0f));
    public static final RegistryObject<EntityType<StarlightDeathEntity>> STARLIGHT_DEATH = UltimateskeletonsModEntities.register("starlight_death", EntityType.Builder.m_20704_(StarlightDeathEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024).setUpdateInterval(3).setCustomClientFactory(StarlightDeathEntity::new).m_20719_().m_20699_(0.6f, 2.0f));
    public static final RegistryObject<EntityType<WitherskeletontitanEntity>> WITHERSKELETONTITAN = UltimateskeletonsModEntities.register("witherskeletontitan", EntityType.Builder.m_20704_(WitherskeletontitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024).setUpdateInterval(3).setCustomClientFactory(WitherskeletontitanEntity::new).m_20719_().m_20699_(0.6f, 2.0f));
    public static final RegistryObject<EntityType<TTTTEEEESSSSTTTTTEntity>> TTTTEEEESSSSTTTTT = UltimateskeletonsModEntities.register("tttteeeessssttttt", EntityType.Builder.m_20704_(TTTTEEEESSSSTTTTTEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1024).setUpdateInterval(3).setCustomClientFactory(TTTTEEEESSSSTTTTTEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<TitanspiritEntity>> TITANSPIRIT = UltimateskeletonsModEntities.register("titanspirit", EntityType.Builder.m_20704_(TitanspiritEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(TitanspiritEntity::new).m_20719_().m_20699_(1.0f, 1.0f));
    public static final RegistryObject<EntityType<GrowtherEntity>> GROWTHER = UltimateskeletonsModEntities.register("growther", EntityType.Builder.m_20704_(GrowtherEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GrowtherEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<DangerEntity>> DANGER = UltimateskeletonsModEntities.register("danger", EntityType.Builder.m_20704_(DangerEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DangerEntity::new).m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<GiantwitherskeletonEntity>> GIANTWITHERSKELETON = UltimateskeletonsModEntities.register("giantwitherskeleton", EntityType.Builder.m_20704_(GiantwitherskeletonEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(GiantwitherskeletonEntity::new).m_20719_().m_20699_(0.6f, 2.0f));
    public static final RegistryObject<EntityType<EnergyskeletontitanEntity>> ENERGYSKELETONTITAN = UltimateskeletonsModEntities.register("energyskeletontitan", EntityType.Builder.m_20704_(EnergyskeletontitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(EnergyskeletontitanEntity::new).m_20719_().m_20699_(0.6f, 2.0f));
    public static final RegistryObject<EntityType<PurplelightningEntity>> PURPLELIGHTNING = UltimateskeletonsModEntities.register("purplelightning", EntityType.Builder.m_20704_(PurplelightningEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(PurplelightningEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<SkeletontitanEntity>> SKELETONTITAN = UltimateskeletonsModEntities.register("skeletontitan", EntityType.Builder.m_20704_(SkeletontitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(SkeletontitanEntity::new).m_20719_().m_20699_(0.6f, 2.0f));
    public static final RegistryObject<EntityType<SkeletonharrawEntity>> SKELETONHARRAW = UltimateskeletonsModEntities.register("skeletonharraw", EntityType.Builder.m_20704_(SkeletonharrawEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(SkeletonharrawEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<GiantharrowEntity>> GIANTHARROW = UltimateskeletonsModEntities.register("giantharrow", EntityType.Builder.m_20704_(GiantharrowEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GiantharrowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<GiantskeletonEntity>> GIANTSKELETON = UltimateskeletonsModEntities.register("giantskeleton", EntityType.Builder.m_20704_(GiantskeletonEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(GiantskeletonEntity::new).m_20719_().m_20699_(0.6f, 2.0f));
    public static final RegistryObject<EntityType<IrongolemtitanEntity>> IRONGOLEMTITAN = UltimateskeletonsModEntities.register("irongolemtitan", EntityType.Builder.m_20704_(IrongolemtitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(IrongolemtitanEntity::new).m_20719_().m_20699_(0.6f, 2.625f));
    public static final RegistryObject<EntityType<GiantironEntity>> GIANTIRON = UltimateskeletonsModEntities.register("giantiron", EntityType.Builder.m_20704_(GiantironEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GiantironEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<EndermantitanEntity>> ENDERMANTITAN = UltimateskeletonsModEntities.register("endermantitan", EntityType.Builder.m_20704_(EndermantitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(EndermantitanEntity::new).m_20719_().m_20699_(0.6f, 3.1f));
    public static final RegistryObject<EntityType<ChaoscolossusEntity>> CHAOSCOLOSSUS = UltimateskeletonsModEntities.register("chaoscolossus", EntityType.Builder.m_20704_(ChaoscolossusEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(ChaoscolossusEntity::new).m_20719_().m_20699_(0.6f, 3.1f));
    public static final RegistryObject<EntityType<RedlightningEntity>> REDLIGHTNING = UltimateskeletonsModEntities.register("redlightning", EntityType.Builder.m_20704_(RedlightningEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(RedlightningEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<ExplosiontitanEntity>> EXPLOSIONTITAN = UltimateskeletonsModEntities.register("explosiontitan", EntityType.Builder.m_20704_(ExplosiontitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExplosiontitanEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<ShiningEntity>> SHINING = UltimateskeletonsModEntities.register("shining", EntityType.Builder.m_20704_(ShiningEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(ShiningEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<CreepertitanEntity>> CREEPERTITAN = UltimateskeletonsModEntities.register("creepertitan", EntityType.Builder.m_20704_(CreepertitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(CreepertitanEntity::new).m_20719_().m_20699_(0.6f, 1.7f));
    public static final RegistryObject<EntityType<ExplosionshockwaveEntity>> EXPLOSIONSHOCKWAVE = UltimateskeletonsModEntities.register("explosionshockwave", EntityType.Builder.m_20704_(ExplosionshockwaveEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ExplosionshockwaveEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<WardentitanEntity>> WARDENTITAN = UltimateskeletonsModEntities.register("wardentitan", EntityType.Builder.m_20704_(WardentitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(WardentitanEntity::new).m_20719_().m_20699_(0.6f, 3.125f));
    public static final RegistryObject<EntityType<CreeperfireballEntity>> CREEPERFIREBALL = UltimateskeletonsModEntities.register("creeperfireball", EntityType.Builder.m_20704_(CreeperfireballEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(CreeperfireballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<EnderrainEntity>> ENDERRAIN = UltimateskeletonsModEntities.register("enderrain", EntityType.Builder.m_20704_(EnderrainEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(EnderrainEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<ChaosrainEntity>> CHAOSRAIN = UltimateskeletonsModEntities.register("chaosrain", EntityType.Builder.m_20704_(ChaosrainEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(ChaosrainEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<SpidertitanEntity>> SPIDERTITAN = UltimateskeletonsModEntities.register("spidertitan", EntityType.Builder.m_20704_(SpidertitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(SpidertitanEntity::new).m_20719_().m_20699_(1.6f, 0.9f));
    public static final RegistryObject<EntityType<GiantwebEntity>> GIANTWEB = UltimateskeletonsModEntities.register("giantweb", EntityType.Builder.m_20704_(GiantwebEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GiantwebEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<PosionEntity>> POSION = UltimateskeletonsModEntities.register("posion", EntityType.Builder.m_20704_(PosionEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(PosionEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<StarskeletonpowertitanEntity>> STARSKELETONPOWERTITAN = UltimateskeletonsModEntities.register("starskeletonpowertitan", EntityType.Builder.m_20704_(StarskeletonpowertitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(StarskeletonpowertitanEntity::new).m_20719_().m_20699_(0.6f, 2.0f));
    public static final RegistryObject<EntityType<TitanswordedgeEntity>> TITANSWORDEDGE = UltimateskeletonsModEntities.register("titanswordedge", EntityType.Builder.m_20704_(TitanswordedgeEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(TitanswordedgeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<GhostlightningEntity>> GHOSTLIGHTNING = UltimateskeletonsModEntities.register("ghostlightning", EntityType.Builder.m_20704_(GhostlightningEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GhostlightningEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<GhasttitanEntity>> GHASTTITAN = UltimateskeletonsModEntities.register("ghasttitan", EntityType.Builder.m_20704_(GhasttitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(GhasttitanEntity::new).m_20719_().m_20699_(1.0f, 1.0f));
    public static final RegistryObject<EntityType<TitanfireballEntity>> TITANFIREBALL = UltimateskeletonsModEntities.register("titanfireball", EntityType.Builder.m_20704_(TitanfireballEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(TitanfireballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<VoidgolemtitanEntity>> VOIDGOLEMTITAN = UltimateskeletonsModEntities.register("voidgolemtitan", EntityType.Builder.m_20704_(VoidgolemtitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(VoidgolemtitanEntity::new).m_20719_().m_20699_(0.7f, 2.625f));
    public static final RegistryObject<EntityType<GiantvoidEntity>> GIANTVOID = UltimateskeletonsModEntities.register("giantvoid", EntityType.Builder.m_20704_(GiantvoidEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GiantvoidEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<BlazetitanEntity>> BLAZETITAN = UltimateskeletonsModEntities.register("blazetitan", EntityType.Builder.m_20704_(BlazetitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(BlazetitanEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<GiantblazeEntity>> GIANTBLAZE = UltimateskeletonsModEntities.register("giantblaze", EntityType.Builder.m_20704_(GiantblazeEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GiantblazeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<LightningballEntity>> LIGHTNINGBALL = UltimateskeletonsModEntities.register("lightningball", EntityType.Builder.m_20704_(LightningballEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(LightningballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<ZombietitanEntity>> ZOMBIETITAN = UltimateskeletonsModEntities.register("zombietitan", EntityType.Builder.m_20704_(ZombietitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(ZombietitanEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<GreenlightningEntity>> GREENLIGHTNING = UltimateskeletonsModEntities.register("greenlightning", EntityType.Builder.m_20704_(GreenlightningEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GreenlightningEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<MasterballEntity>> MASTERBALL = UltimateskeletonsModEntities.register("masterball", EntityType.Builder.m_20704_(MasterballEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(MasterballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<ZombiepigmantitanEntity>> ZOMBIEPIGMANTITAN = UltimateskeletonsModEntities.register("zombiepigmantitan", EntityType.Builder.m_20704_(ZombiepigmantitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(ZombiepigmantitanEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<FlashballEntity>> FLASHBALL = UltimateskeletonsModEntities.register("flashball", EntityType.Builder.m_20704_(FlashballEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(FlashballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<GamalightningEntity>> GAMALIGHTNING = UltimateskeletonsModEntities.register("gamalightning", EntityType.Builder.m_20704_(GamalightningEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GamalightningEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<CavespidertitanEntity>> CAVESPIDERTITAN = UltimateskeletonsModEntities.register("cavespidertitan", EntityType.Builder.m_20704_(CavespidertitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(CavespidertitanEntity::new).m_20719_().m_20699_(1.6f, 0.9f));
    public static final RegistryObject<EntityType<OmegafishEntity>> OMEGAFISH = UltimateskeletonsModEntities.register("omegafish", EntityType.Builder.m_20704_(OmegafishEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(OmegafishEntity::new).m_20719_().m_20699_(0.5f, 0.51f));
    public static final RegistryObject<EntityType<ChaoslightningballEntity>> CHAOSLIGHTNINGBALL = UltimateskeletonsModEntities.register("chaoslightningball", EntityType.Builder.m_20704_(ChaoslightningballEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(ChaoslightningballEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<StarshockEntity>> STARSHOCK = UltimateskeletonsModEntities.register("starshock", EntityType.Builder.m_20704_(StarshockEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StarshockEntity::new).m_20719_().m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<HarcadiumgolemtitanEntity>> HARCADIUMGOLEMTITAN = UltimateskeletonsModEntities.register("harcadiumgolemtitan", EntityType.Builder.m_20704_(HarcadiumgolemtitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(HarcadiumgolemtitanEntity::new).m_20719_().m_20699_(0.7f, 2.625f));
    public static final RegistryObject<EntityType<GiantharcadiumEntity>> GIANTHARCADIUM = UltimateskeletonsModEntities.register("giantharcadium", EntityType.Builder.m_20704_(GiantharcadiumEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GiantharcadiumEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<BedrockgolemtitanEntity>> BEDROCKGOLEMTITAN = UltimateskeletonsModEntities.register("bedrockgolemtitan", EntityType.Builder.m_20704_(BedrockgolemtitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(BedrockgolemtitanEntity::new).m_20699_(0.7f, 2.625f));
    public static final RegistryObject<EntityType<GiantadminiumEntity>> GIANTADMINIUM = UltimateskeletonsModEntities.register("giantadminium", EntityType.Builder.m_20704_(GiantadminiumEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GiantadminiumEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<AdminiumshockEntity>> ADMINIUMSHOCK = UltimateskeletonsModEntities.register("adminiumshock", EntityType.Builder.m_20704_(AdminiumshockEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdminiumshockEntity::new).m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<AdamantiumgolemtitanEntity>> ADAMANTIUMGOLEMTITAN = UltimateskeletonsModEntities.register("adamantiumgolemtitan", EntityType.Builder.m_20704_(AdamantiumgolemtitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(AdamantiumgolemtitanEntity::new).m_20699_(0.7f, 2.625f));
    public static final RegistryObject<EntityType<GiantadamantiumEntity>> GIANTADAMANTIUM = UltimateskeletonsModEntities.register("giantadamantium", EntityType.Builder.m_20704_(GiantadamantiumEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GiantadamantiumEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<AdamanshockEntity>> ADAMANSHOCK = UltimateskeletonsModEntities.register("adamanshock", EntityType.Builder.m_20704_(AdamanshockEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdamanshockEntity::new).m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<DemontiumgolemtitanEntity>> DEMONTIUMGOLEMTITAN = UltimateskeletonsModEntities.register("demontiumgolemtitan", EntityType.Builder.m_20704_(DemontiumgolemtitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(DemontiumgolemtitanEntity::new).m_20699_(0.7f, 2.625f));
    public static final RegistryObject<EntityType<GiantdemontiumEntity>> GIANTDEMONTIUM = UltimateskeletonsModEntities.register("giantdemontium", EntityType.Builder.m_20704_(GiantdemontiumEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GiantdemontiumEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<AdamanswordedgeEntity>> ADAMANSWORDEDGE = UltimateskeletonsModEntities.register("adamanswordedge", EntityType.Builder.m_20704_(AdamanswordedgeEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(AdamanswordedgeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<YitaiballEntity>> YITAIBALL = UltimateskeletonsModEntities.register("yitaiball", EntityType.Builder.m_20704_(YitaiballEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YitaiballEntity::new).m_20699_(0.6f, 1.8f));
    public static final RegistryObject<EntityType<WithireniumgolemtitanEntity>> WITHIRENIUMGOLEMTITAN = UltimateskeletonsModEntities.register("withireniumgolemtitan", EntityType.Builder.m_20704_(WithireniumgolemtitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(WithireniumgolemtitanEntity::new).m_20699_(0.7f, 2.625f));
    public static final RegistryObject<EntityType<GiantwithireniumEntity>> GIANTWITHIRENIUM = UltimateskeletonsModEntities.register("giantwithirenium", EntityType.Builder.m_20704_(GiantwithireniumEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GiantwithireniumEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<TitanusgolemtitanEntity>> TITANUSGOLEMTITAN = UltimateskeletonsModEntities.register("titanusgolemtitan", EntityType.Builder.m_20704_(TitanusgolemtitanEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2048).setUpdateInterval(3).setCustomClientFactory(TitanusgolemtitanEntity::new).m_20699_(0.6f, 2.625f));
    public static final RegistryObject<EntityType<GianttitanusEntity>> GIANTTITANUS = UltimateskeletonsModEntities.register("gianttitanus", EntityType.Builder.m_20704_(GianttitanusEntity::new, (MobCategory)MobCategory.MISC).setCustomClientFactory(GianttitanusEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).m_20699_(0.5f, 0.5f));
    public static final RegistryObject<EntityType<BlackholeEntity>> BLACKHOLE = UltimateskeletonsModEntities.register("blackhole", EntityType.Builder.m_20704_(BlackholeEntity::new, (MobCategory)MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackholeEntity::new).m_20699_(0.6f, 1.8f));

    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return REGISTRY.register(registryname, () -> entityTypeBuilder.m_20712_(registryname));
    }

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            UltimatedeathskullEntity.init();
            DeathlaserEntity.init();
            DeathshockEntity.init();
            PushhandEntity.init();
            DeathwitherbeamEntity.init();
            ChainEntity.init();
            MultiversespaceEntity.init();
            DeathskullEntity.init();
            ElectricbombEntity.init();
            SpaceEntity.init();
            SolarskeletonEntity.init();
            WitherskeletontemplarEntity.init();
            StarskeletonEntity.init();
            OriginallightningEntity.init();
            GalaxyEntity.init();
            StarspawngalaxyEntity.init();
            SunsEntity.init();
            StarlightskeletonEntity.init();
            BallEntity.init();
            StarlightblackholeEntity.init();
            StarlightfazhenEntity.init();
            StarSpiritEntity.init();
            StarlightDeathEntity.init();
            WitherskeletontitanEntity.init();
            TTTTEEEESSSSTTTTTEntity.init();
            TitanspiritEntity.init();
            DangerEntity.init();
            GiantwitherskeletonEntity.init();
            EnergyskeletontitanEntity.init();
            SkeletontitanEntity.init();
            GiantskeletonEntity.init();
            IrongolemtitanEntity.init();
            EndermantitanEntity.init();
            ChaoscolossusEntity.init();
            ExplosiontitanEntity.init();
            CreepertitanEntity.init();
            ExplosionshockwaveEntity.init();
            WardentitanEntity.init();
            SpidertitanEntity.init();
            StarskeletonpowertitanEntity.init();
            GhasttitanEntity.init();
            VoidgolemtitanEntity.init();
            BlazetitanEntity.init();
            ZombietitanEntity.init();
            ZombiepigmantitanEntity.init();
            CavespidertitanEntity.init();
            OmegafishEntity.init();
            StarshockEntity.init();
            HarcadiumgolemtitanEntity.init();
            BedrockgolemtitanEntity.init();
            AdminiumshockEntity.init();
            AdamantiumgolemtitanEntity.init();
            AdamanshockEntity.init();
            DemontiumgolemtitanEntity.init();
            YitaiballEntity.init();
            WithireniumgolemtitanEntity.init();
            TitanusgolemtitanEntity.init();
            BlackholeEntity.init();
        });
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put((EntityType)ULTIMATEDEATHSKULL.get(), UltimatedeathskullEntity.createAttributes().m_22265_());
        event.put((EntityType)DEATHLASER.get(), DeathlaserEntity.createAttributes().m_22265_());
        event.put((EntityType)DEATHSHOCK.get(), DeathshockEntity.createAttributes().m_22265_());
        event.put((EntityType)PUSHHAND.get(), PushhandEntity.createAttributes().m_22265_());
        event.put((EntityType)DEATHWITHERBEAM.get(), DeathwitherbeamEntity.createAttributes().m_22265_());
        event.put((EntityType)CHAIN.get(), ChainEntity.createAttributes().m_22265_());
        event.put((EntityType)MULTIVERSESPACE.get(), MultiversespaceEntity.createAttributes().m_22265_());
        event.put((EntityType)DEATHSKULL.get(), DeathskullEntity.createAttributes().m_22265_());
        event.put((EntityType)ELECTRICBOMB.get(), ElectricbombEntity.createAttributes().m_22265_());
        event.put((EntityType)SPACE.get(), SpaceEntity.createAttributes().m_22265_());
        event.put((EntityType)SOLARSKELETON.get(), SolarskeletonEntity.createAttributes().m_22265_());
        event.put((EntityType)WITHERSKELETONTEMPLAR.get(), WitherskeletontemplarEntity.createAttributes().m_22265_());
        event.put((EntityType)STARSKELETON.get(), StarskeletonEntity.createAttributes().m_22265_());
        event.put((EntityType)ORIGINALLIGHTNING.get(), OriginallightningEntity.createAttributes().m_22265_());
        event.put((EntityType)GALAXY.get(), GalaxyEntity.createAttributes().m_22265_());
        event.put((EntityType)STARSPAWNGALAXY.get(), StarspawngalaxyEntity.createAttributes().m_22265_());
        event.put((EntityType)SUNS.get(), SunsEntity.createAttributes().m_22265_());
        event.put((EntityType)STARLIGHTSKELETON.get(), StarlightskeletonEntity.createAttributes().m_22265_());
        event.put((EntityType)BALL.get(), BallEntity.createAttributes().m_22265_());
        event.put((EntityType)STARLIGHTBLACKHOLE.get(), StarlightblackholeEntity.createAttributes().m_22265_());
        event.put((EntityType)STARLIGHTFAZHEN.get(), StarlightfazhenEntity.createAttributes().m_22265_());
        event.put((EntityType)STAR_SPIRIT.get(), StarSpiritEntity.createAttributes().m_22265_());
        event.put((EntityType)STARLIGHT_DEATH.get(), StarlightDeathEntity.createAttributes().m_22265_());
        event.put((EntityType)WITHERSKELETONTITAN.get(), WitherskeletontitanEntity.createAttributes().m_22265_());
        event.put((EntityType)TTTTEEEESSSSTTTTT.get(), TTTTEEEESSSSTTTTTEntity.createAttributes().m_22265_());
        event.put((EntityType)TITANSPIRIT.get(), TitanspiritEntity.createAttributes().m_22265_());
        event.put((EntityType)DANGER.get(), DangerEntity.createAttributes().m_22265_());
        event.put((EntityType)GIANTWITHERSKELETON.get(), GiantwitherskeletonEntity.createAttributes().m_22265_());
        event.put((EntityType)ENERGYSKELETONTITAN.get(), EnergyskeletontitanEntity.createAttributes().m_22265_());
        event.put((EntityType)SKELETONTITAN.get(), SkeletontitanEntity.createAttributes().m_22265_());
        event.put((EntityType)GIANTSKELETON.get(), GiantskeletonEntity.createAttributes().m_22265_());
        event.put((EntityType)IRONGOLEMTITAN.get(), IrongolemtitanEntity.createAttributes().m_22265_());
        event.put((EntityType)ENDERMANTITAN.get(), EndermantitanEntity.createAttributes().m_22265_());
        event.put((EntityType)CHAOSCOLOSSUS.get(), ChaoscolossusEntity.createAttributes().m_22265_());
        event.put((EntityType)EXPLOSIONTITAN.get(), ExplosiontitanEntity.createAttributes().m_22265_());
        event.put((EntityType)CREEPERTITAN.get(), CreepertitanEntity.createAttributes().m_22265_());
        event.put((EntityType)EXPLOSIONSHOCKWAVE.get(), ExplosionshockwaveEntity.createAttributes().m_22265_());
        event.put((EntityType)WARDENTITAN.get(), WardentitanEntity.createAttributes().m_22265_());
        event.put((EntityType)SPIDERTITAN.get(), SpidertitanEntity.createAttributes().m_22265_());
        event.put((EntityType)STARSKELETONPOWERTITAN.get(), StarskeletonpowertitanEntity.createAttributes().m_22265_());
        event.put((EntityType)GHASTTITAN.get(), GhasttitanEntity.createAttributes().m_22265_());
        event.put((EntityType)VOIDGOLEMTITAN.get(), VoidgolemtitanEntity.createAttributes().m_22265_());
        event.put((EntityType)BLAZETITAN.get(), BlazetitanEntity.createAttributes().m_22265_());
        event.put((EntityType)ZOMBIETITAN.get(), ZombietitanEntity.createAttributes().m_22265_());
        event.put((EntityType)ZOMBIEPIGMANTITAN.get(), ZombiepigmantitanEntity.createAttributes().m_22265_());
        event.put((EntityType)CAVESPIDERTITAN.get(), CavespidertitanEntity.createAttributes().m_22265_());
        event.put((EntityType)OMEGAFISH.get(), OmegafishEntity.createAttributes().m_22265_());
        event.put((EntityType)STARSHOCK.get(), StarshockEntity.createAttributes().m_22265_());
        event.put((EntityType)HARCADIUMGOLEMTITAN.get(), HarcadiumgolemtitanEntity.createAttributes().m_22265_());
        event.put((EntityType)BEDROCKGOLEMTITAN.get(), BedrockgolemtitanEntity.createAttributes().m_22265_());
        event.put((EntityType)ADMINIUMSHOCK.get(), AdminiumshockEntity.createAttributes().m_22265_());
        event.put((EntityType)ADAMANTIUMGOLEMTITAN.get(), AdamantiumgolemtitanEntity.createAttributes().m_22265_());
        event.put((EntityType)ADAMANSHOCK.get(), AdamanshockEntity.createAttributes().m_22265_());
        event.put((EntityType)DEMONTIUMGOLEMTITAN.get(), DemontiumgolemtitanEntity.createAttributes().m_22265_());
        event.put((EntityType)YITAIBALL.get(), YitaiballEntity.createAttributes().m_22265_());
        event.put((EntityType)WITHIRENIUMGOLEMTITAN.get(), WithireniumgolemtitanEntity.createAttributes().m_22265_());
        event.put((EntityType)TITANUSGOLEMTITAN.get(), TitanusgolemtitanEntity.createAttributes().m_22265_());
        event.put((EntityType)BLACKHOLE.get(), BlackholeEntity.createAttributes().m_22265_());
    }
}

