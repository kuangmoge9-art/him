/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.item.BlockItem
 *  net.minecraft.world.item.CreativeModeTabs
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.entity.BlockEntityType
 *  net.minecraft.world.level.block.entity.BlockEntityType$Builder
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.EntityRenderersEvent$RegisterRenderers
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.BuildCreativeModeTabContentsEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
 *  net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent
 *  net.minecraftforge.fml.event.lifecycle.InterModProcessEvent
 *  net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.ForgeRegistries$Keys
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegisterEvent
 *  net.minecraftforge.registries.RegistryObject
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package firis.mobbottle;

import firis.mobbottle.client.renderer.MobBottleBlockEntityRenderer;
import firis.mobbottle.common.block.MobBottleBlock;
import firis.mobbottle.common.block.MobBottleEmptyBlock;
import firis.mobbottle.common.blockentity.MobBottleBlockEntity;
import firis.mobbottle.common.item.MobBottleBlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(value="mobbottle")
public class MobBottle {
    public static final String MODID = "mobbottle";
    public static final Logger LOGGER = LogManager.getLogger();

    public MobBottle() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::CreativeModeTabEventBuildContents);
        MinecraftForge.EVENT_BUS.register((Object)this);
    }

    private void setup(FMLCommonSetupEvent event) {
    }

    private void enqueueIMC(InterModEnqueueEvent event) {
    }

    private void processIMC(InterModProcessEvent event) {
    }

    public void CreativeModeTabEventBuildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.f_256869_) {
            event.m_246326_((ItemLike)FirisBlocks.MOB_BOTTLE_EMPTY.get());
            event.m_246326_((ItemLike)FirisBlocks.MOB_BOTTLE.get());
        }
    }

    public static class FirisBlocks {
        public static final RegistryObject<Block> MOB_BOTTLE = RegistryObject.create((ResourceLocation)new ResourceLocation("mobbottle", "mob_bottle"), (IForgeRegistry)ForgeRegistries.BLOCKS);
        public static final RegistryObject<Block> MOB_BOTTLE_EMPTY = RegistryObject.create((ResourceLocation)new ResourceLocation("mobbottle", "mob_bottle_empty"), (IForgeRegistry)ForgeRegistries.BLOCKS);
    }

    @Mod.EventBusSubscriber(modid="mobbottle", value={Dist.CLIENT}, bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientRegistryEvents {
        @SubscribeEvent
        public static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer((BlockEntityType)FirisBlockEntityType.BLOCK_ENTITY_TYPE.get(), MobBottleBlockEntityRenderer::new);
        }
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(RegisterEvent event) {
            event.register(ForgeRegistries.Keys.BLOCKS, helper -> {
                helper.register(new ResourceLocation(MobBottle.MODID, "mob_bottle"), (Object)new MobBottleBlock());
                helper.register(new ResourceLocation(MobBottle.MODID, "mob_bottle_empty"), (Object)new MobBottleEmptyBlock());
            });
        }

        @SubscribeEvent
        public static void onItemsRegistry(RegisterEvent event) {
            event.register(ForgeRegistries.Keys.ITEMS, helper -> {
                helper.register(new ResourceLocation(MobBottle.MODID, "mob_bottle"), (Object)new MobBottleBlockItem((Block)FirisBlocks.MOB_BOTTLE.get()));
                helper.register(new ResourceLocation(MobBottle.MODID, "mob_bottle_empty"), (Object)new BlockItem((Block)FirisBlocks.MOB_BOTTLE_EMPTY.get(), new Item.Properties().m_41487_(64)));
            });
        }

        @SubscribeEvent
        public static void onBlockEntityType(RegisterEvent event) {
            event.register(ForgeRegistries.Keys.BLOCK_ENTITY_TYPES, helper -> helper.register(new ResourceLocation(MobBottle.MODID, "mob_bottle_be"), (Object)BlockEntityType.Builder.m_155273_(MobBottleBlockEntity::new, (Block[])new Block[]{(Block)FirisBlocks.MOB_BOTTLE.get()}).m_58966_(null)));
        }
    }

    public static class FirisBlockEntityType {
        public static final RegistryObject<BlockEntityType<MobBottleBlockEntity>> BLOCK_ENTITY_TYPE = RegistryObject.create((ResourceLocation)new ResourceLocation("mobbottle", "mob_bottle_be"), (IForgeRegistry)ForgeRegistries.BLOCK_ENTITY_TYPES);
    }

    public static class FirisItems {
        public static final RegistryObject<Item> MOB_BOTTLE = RegistryObject.create((ResourceLocation)new ResourceLocation("mobbottle", "mob_bottle"), (IForgeRegistry)ForgeRegistries.ITEMS);
        public static final RegistryObject<Item> MOB_BOTTLE_EMPTY = RegistryObject.create((ResourceLocation)new ResourceLocation("mobbottle", "mob_bottle"), (IForgeRegistry)ForgeRegistries.ITEMS);
    }
}

