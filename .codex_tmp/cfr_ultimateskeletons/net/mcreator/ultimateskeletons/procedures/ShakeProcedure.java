/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.ViewportEvent$ComputeCameraAngles
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package net.mcreator.ultimateskeletons.procedures;

import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.configuration.SkeletonsConfiguration;
import net.mcreator.ultimateskeletons.network.UltimateskeletonsModVariables;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value={Dist.CLIENT})
public class ShakeProcedure {
    public static ViewportEvent.ComputeCameraAngles provider = null;

    public static void setAngles(float yaw, float pitch, float roll) {
        provider.setYaw(yaw);
        provider.setPitch(pitch);
        provider.setRoll(roll);
    }

    @SubscribeEvent
    public static void computeCameraAngles(ViewportEvent.ComputeCameraAngles event) {
        provider = event;
        ClientLevel level = Minecraft.m_91087_().f_91073_;
        Entity entity = provider.getCamera().m_90592_();
        if (level != null && entity != null) {
            Vec3 entPos = entity.m_20318_((float)provider.getPartialTick());
            ShakeProcedure.execute((Event)provider, entity);
        }
    }

    public static void execute(Entity entity) {
        ShakeProcedure.execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity == null) {
            return;
        }
        if (!(((UltimateskeletonsModVariables.PlayerVariables)entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new UltimateskeletonsModVariables.PlayerVariables())).camerashake <= 0.0)) {
            ShakeProcedure.setAngles((float)((double)Minecraft.m_91087_().f_91063_.m_109153_().m_90590_() + ((UltimateskeletonsModVariables.PlayerVariables)entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new UltimateskeletonsModVariables.PlayerVariables())).camerashake * Math.sin(Math.cos(System.currentTimeMillis() / 15L) * 180.0) * (Double)SkeletonsConfiguration.SHOCKCOUNT.get()), (float)((double)Minecraft.m_91087_().f_91063_.m_109153_().m_90589_() + ((UltimateskeletonsModVariables.PlayerVariables)entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new UltimateskeletonsModVariables.PlayerVariables())).camerashake * Math.cos(Math.sin(System.currentTimeMillis() / 15L) * 180.0) * (Double)SkeletonsConfiguration.SHOCKCOUNT.get()), (float)(((UltimateskeletonsModVariables.PlayerVariables)entity.getCapability(UltimateskeletonsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new UltimateskeletonsModVariables.PlayerVariables())).camerashake * Math.cos(Math.sin(Math.cos(System.currentTimeMillis() / 15L) * 180.0) * 180.0) * (Double)SkeletonsConfiguration.SHOCKCOUNT.get()));
        }
    }
}

