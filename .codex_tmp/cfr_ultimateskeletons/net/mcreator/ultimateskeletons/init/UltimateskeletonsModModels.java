/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.EntityRenderersEvent$RegisterLayerDefinitions
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package net.mcreator.ultimateskeletons.init;

import net.mcreator.ultimateskeletons.client.model.Modelblocks;
import net.mcreator.ultimateskeletons.client.model.Modelenergyblock;
import net.mcreator.ultimateskeletons.client.model.Modelhararrow;
import net.mcreator.ultimateskeletons.client.model.Modelshockwave;
import net.mcreator.ultimateskeletons.client.model.Modelstarblade;
import net.mcreator.ultimateskeletons.client.model.Modelswordedge;
import net.mcreator.ultimateskeletons.client.model.Modelswordedgeslash;
import net.mcreator.ultimateskeletons.client.model.Modelswords;
import net.mcreator.ultimateskeletons.client.model.Modeltitanfireball;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value={Dist.CLIENT})
public class UltimateskeletonsModModels {
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(Modelswordedgeslash.LAYER_LOCATION, Modelswordedgeslash::createBodyLayer);
        event.registerLayerDefinition(Modelhararrow.LAYER_LOCATION, Modelhararrow::createBodyLayer);
        event.registerLayerDefinition(Modeltitanfireball.LAYER_LOCATION, Modeltitanfireball::createBodyLayer);
        event.registerLayerDefinition(Modelenergyblock.LAYER_LOCATION, Modelenergyblock::createBodyLayer);
        event.registerLayerDefinition(Modelshockwave.LAYER_LOCATION, Modelshockwave::createBodyLayer);
        event.registerLayerDefinition(Modelswords.LAYER_LOCATION, Modelswords::createBodyLayer);
        event.registerLayerDefinition(Modelswordedge.LAYER_LOCATION, Modelswordedge::createBodyLayer);
        event.registerLayerDefinition(Modelblocks.LAYER_LOCATION, Modelblocks::createBodyLayer);
        event.registerLayerDefinition(Modelstarblade.LAYER_LOCATION, Modelstarblade::createBodyLayer);
    }
}

