/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderTarget
 *  com.mojang.blaze3d.platform.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.BufferBuilder
 *  com.mojang.blaze3d.vertex.BufferBuilder$RenderedBuffer
 *  com.mojang.blaze3d.vertex.BufferUploader
 *  com.mojang.blaze3d.vertex.DefaultVertexFormat
 *  com.mojang.blaze3d.vertex.Tesselator
 *  com.mojang.blaze3d.vertex.VertexFormat$Mode
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.renderer.ShaderInstance
 *  net.minecraft.network.chat.Component
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Vector3f
 *  org.lwjgl.opengl.GL46
 */
package net.mcreator.ultimateskeletons;

import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.BufferUploader;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat;
import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.entity.ShiningEntity;
import net.mcreator.ultimateskeletons.entity.SkeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontitanEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3f;
import org.lwjgl.opengl.GL46;

public class RenderUtils {
    public static ShaderInstance blitShader;

    public static void fastBlit(RenderTarget from, RenderTarget to) {
        RenderSystem.assertOnRenderThread();
        GlStateManager._colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GlStateManager._disableDepthTest();
        GlStateManager._depthMask((boolean)false);
        to.m_83947_(true);
        Minecraft.m_91087_().m_91385_().m_83947_(false);
        blitShader.m_173350_("DiffuseSampler", (Object)from.m_83975_());
        blitShader.m_173363_();
        GL46.glColorMaski((int)0, (boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GlStateManager._enableBlend();
        RenderSystem.defaultBlendFunc();
        Tesselator tesselator = RenderSystem.renderThreadTesselator();
        BufferBuilder bufferbuilder = tesselator.m_85915_();
        bufferbuilder.m_166779_(VertexFormat.Mode.QUADS, DefaultVertexFormat.f_85814_);
        bufferbuilder.m_5483_(-1.0, 1.0, 0.0).m_5752_();
        bufferbuilder.m_5483_(-1.0, -1.0, 0.0).m_5752_();
        bufferbuilder.m_5483_(1.0, -1.0, 0.0).m_5752_();
        bufferbuilder.m_5483_(1.0, 1.0, 0.0).m_5752_();
        BufferUploader.m_231209_((BufferBuilder.RenderedBuffer)bufferbuilder.m_231175_());
        blitShader.m_173362_();
        GlStateManager._depthMask((boolean)true);
        GlStateManager._colorMask((boolean)true, (boolean)true, (boolean)true, (boolean)true);
        GlStateManager._enableDepthTest();
    }

    public static void explosionVfx(float size, int time, Vec3 position, @Nullable Vec3 colour, Level level, boolean billboard) {
        ShiningEntity explosionRender = new ShiningEntity((EntityType)UltimateskeletonsModEntities.SHINING.get(), level);
        explosionRender.m_20219_(position);
        explosionRender.m_20088_().m_135381_(ShiningEntity.DATA_SIZE, (Object)Float.valueOf(size));
        explosionRender.m_20088_().m_135381_(ShiningEntity.DATA_TIME, (Object)time);
        explosionRender.m_20088_().m_135381_(ShiningEntity.DATA_TIMER, (Object)time);
        if (colour != null) {
            explosionRender.m_20088_().m_135381_(ShiningEntity.DATA_COLOUR, (Object)new Vector3f((float)colour.f_82479_, (float)colour.f_82480_, (float)colour.f_82481_));
        }
        explosionRender.m_20088_().m_135381_(ShiningEntity.DATA_IS_BILLBOARD, (Object)billboard);
        level.m_7967_((Entity)explosionRender);
    }

    public static void spawn(int killCount, Vec3 position, Level level, String getDisplayName) {
        WitherskeletontitanEntity witherskeletontitan = new WitherskeletontitanEntity((EntityType<WitherskeletontitanEntity>)((EntityType)UltimateskeletonsModEntities.WITHERSKELETONTITAN.get()), level);
        witherskeletontitan.m_20219_(position);
        witherskeletontitan.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_Tick, (Object)killCount);
        witherskeletontitan.m_6593_((Component)Component.m_237113_((String)getDisplayName));
        level.m_7967_((Entity)witherskeletontitan);
    }

    public static void spawn1(int killCount, Vec3 position, Level level, String getDisplayName) {
        SkeletontitanEntity witherskeletontitan = new SkeletontitanEntity((EntityType<SkeletontitanEntity>)((EntityType)UltimateskeletonsModEntities.SKELETONTITAN.get()), level);
        witherskeletontitan.m_20219_(position);
        witherskeletontitan.m_20088_().m_135381_(WitherskeletontitanEntity.DATA_Tick, (Object)killCount);
        witherskeletontitan.m_6593_((Component)Component.m_237113_((String)getDisplayName));
        level.m_7967_((Entity)witherskeletontitan);
    }

    public static void explosionVfx(float size, int time, Vec3 position, @Nullable Vec3 colour, Level level) {
        RenderUtils.explosionVfx(size, time, position, colour, level, false);
    }
}

