/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$DestFactor
 *  com.mojang.blaze3d.platform.GlStateManager$SourceFactor
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.GameRenderer
 *  net.minecraft.network.chat.Component
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.RandomSource
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.RenderGuiEvent$Pre
 *  net.minecraftforge.eventbus.api.EventPriority
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package net.mcreator.ultimateskeletons;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashMap;
import java.util.Map;
import net.mcreator.ultimateskeletons.BossBarIf;
import net.mcreator.ultimateskeletons.Caishe;
import net.mcreator.ultimateskeletons.Deathgodentity;
import net.mcreator.ultimateskeletons.NumberUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value={Dist.CLIENT})
public class BossBarGui {
    public static Map<Deathgodentity, Float> entityHealths = new HashMap<Deathgodentity, Float>();

    public static boolean BarIf1() {
        return BossBarIf.execute();
    }

    @SubscribeEvent(priority=EventPriority.NORMAL)
    public static void eventHandler(RenderGuiEvent.Pre event) {
        int w = event.getWindow().m_85445_();
        int h = event.getWindow().m_85446_();
        int posX = w / 2;
        int posY = h / 2;
        int offset = 0;
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask((boolean)false);
        RenderSystem.enableBlend();
        RenderSystem.setShader(GameRenderer::m_172817_);
        RenderSystem.blendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (BossBarGui.BarIf1()) {
            for (Map.Entry<Deathgodentity, Float> entry : entityHealths.entrySet()) {
                Deathgodentity entity = entry.getKey();
                double maxHealth = entity.getMax_Health();
                double health = (float)entity.get_health();
                String BarTexture = entity.getBarTexture();
                int barWidth2 = entity.getBarWidth();
                int barWidth3 = entity.getBarWidth2();
                int BarFrameX = entity.getBarFrameX();
                int BarFrameY = entity.getBarFrameY();
                int BarX = entity.getBarX();
                int BarY = entity.getBarY();
                int NameY = entity.getNameY();
                int getBarFrameStartingPointX = entity.getBarFrameStartingPointX();
                int getBarFrameStartingPointY = entity.getBarFrameStartingPointY();
                int getBarFrameEndY = entity.getBarFrameEndY();
                int getBartartingPointX = entity.getBartartingPointX();
                int getBarStartingPointY = entity.getBarStartingPointY();
                int getBarEndY = entity.getBarEndY();
                int BarInterval = entity.BarInterval();
                int barWidth = (int)((double)barWidth3 * health / maxHealth);
                float xOffset2 = RandomSource.m_216327_().m_188501_() * (float)entity.f_20916_ * 0.65f;
                float yOffset2 = RandomSource.m_216327_().m_188501_() * (float)entity.f_20916_ * 0.65f;
                event.getGuiGraphics().m_280163_(new ResourceLocation(BarTexture), posX - BarFrameX, posY - BarFrameY + offset, (float)getBarFrameStartingPointX, (float)getBarFrameStartingPointY, barWidth2, getBarFrameEndY, 256, 256);
                event.getGuiGraphics().m_280163_(new ResourceLocation(BarTexture), posX - BarX, posY - BarY + offset, (float)getBartartingPointX, (float)getBarStartingPointY, barWidth, getBarEndY, 256, 256);
                if (entity.ColourName()) {
                    event.getGuiGraphics().m_280653_(Minecraft.m_91087_().f_91062_, (Component)Component.m_237113_((String)Caishe.makeColour(entity.m_5446_().getString())), posX, posY - NameY + offset, -1);
                } else {
                    event.getGuiGraphics().m_280653_(Minecraft.m_91087_().f_91062_, (Component)Component.m_237113_((String)entity.m_5446_().getString()), posX, posY - NameY + offset, -1);
                }
                event.getGuiGraphics().m_280137_(Minecraft.m_91087_().f_91062_, (double)Math.round(entity.get_health() * 10.0 / NumberUtils.getNumber(entity.get_health())) / 10.0 + NumberUtils.getNumberUnit(entity.get_health()), (int)((float)posX + xOffset2), (int)((float)(posY - NameY + offset) + yOffset2 - 10.0f), -1);
                offset += BarInterval;
            }
        }
        RenderSystem.depthMask((boolean)true);
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        RenderSystem.disableBlend();
        RenderSystem.setShaderColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }
}

