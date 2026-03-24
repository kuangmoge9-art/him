/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.platform.GlStateManager$DestFactor
 *  com.mojang.blaze3d.platform.GlStateManager$SourceFactor
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.DefaultVertexFormat
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$Mode
 *  net.minecraft.client.renderer.GameRenderer
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderStateShard$EmptyTextureStateShard
 *  net.minecraft.client.renderer.RenderStateShard$MultiTextureStateShard$Builder
 *  net.minecraft.client.renderer.RenderStateShard$ShaderStateShard
 *  net.minecraft.client.renderer.RenderStateShard$TransparencyStateShard
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.RenderType$CompositeState
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.LightningBoltRenderer
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LightningBolt
 *  org.joml.Matrix4f
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Random;
import net.mcreator.ultimateskeletons.entity.RedlightningEntity;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LightningBoltRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LightningBolt;
import org.joml.Matrix4f;

public class RedlightningRenderer
extends LightningBoltRenderer {
    private static final ResourceLocation LAYER = new ResourceLocation("ultimateskeletons", "textures/entities/galaxyer.png");
    private static final ResourceLocation LAYERR = new ResourceLocation("ultimateskeletons", "textures/entities/alpha.png");
    private int time = 0;
    public static final RenderStateShard.TransparencyStateShard TRANSPARENCY_STATESHARD = new RenderStateShard.TransparencyStateShard("lightning_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc((GlStateManager.SourceFactor)GlStateManager.SourceFactor.SRC_ALPHA, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    public static final RenderType glowRenderType = RenderType.m_173215_((String)"end_portall", (VertexFormat)DefaultVertexFormat.f_85814_, (VertexFormat.Mode)VertexFormat.Mode.QUADS, (int)256, (boolean)false, (boolean)false, (RenderType.CompositeState)RenderType.CompositeState.m_110628_().m_173292_(new RenderStateShard.ShaderStateShard(GameRenderer::m_172755_)).m_173290_((RenderStateShard.EmptyTextureStateShard)new RenderStateShard.MultiTextureStateShard.Builder().m_173132_(LAYERR, false, false).m_173132_(LAYER, false, false).m_173131_()).m_110685_(TRANSPARENCY_STATESHARD).m_110691_(false));

    public RedlightningRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public void m_7392_(LightningBolt p_115266_, float p_115267_, float p_115268_, PoseStack p_115269_, MultiBufferSource p_115270_, int p_115271_) {
        ++this.time;
        if (this.time > 36) {
            this.time = 0;
        }
        float[] afloat = new float[32];
        float[] afloat1 = new float[32];
        float f = 0.0f;
        float f1 = 0.0f;
        RandomSource randomsource = RandomSource.m_216335_((long)p_115266_.f_20859_);
        float r = 0.5f - 0.0125f * (float)this.time;
        float g = 0.5f - 0.0125f * (float)this.time;
        float b = 0.5f - 0.0125f * (float)this.time;
        for (int i = 31; i >= 0; --i) {
            afloat[i] = f;
            afloat1[i] = f1;
            f += (float)(randomsource.m_188503_(5) - 2);
            f1 += (float)(randomsource.m_188503_(5) - 2);
        }
        VertexConsumer vertexconsumer = p_115270_.m_6299_(RenderType.m_110502_());
        Matrix4f matrix4f = p_115269_.m_85850_().m_252922_();
        for (int j = 0; j < 4; ++j) {
            RandomSource randomsource1 = RandomSource.m_216335_((long)p_115266_.f_20859_);
            for (int k = 0; k < 3; ++k) {
                int l = 31;
                int i1 = 0;
                if (k > 0) {
                    l = 31 - k;
                }
                if (k > 0) {
                    i1 = l - 16;
                }
                float f2 = afloat[l] - f;
                float f3 = afloat1[l] - f1;
                for (int j1 = l; j1 >= i1; --j1) {
                    float f4 = f2;
                    float f5 = f3;
                    if (k == 0) {
                        f2 += (float)(randomsource1.m_188503_(5) - 2);
                        f3 += (float)(randomsource1.m_188503_(5) - 2);
                    } else {
                        f2 += (float)(randomsource1.m_188503_(7) - 3);
                        f3 += (float)(randomsource1.m_188503_(7) - 3);
                    }
                    float f10 = 0.05f + (float)j * 0.1f;
                    if (k == 0) {
                        f10 *= (float)j1 * 0.05f + 1.0f;
                    }
                    float f11 = 0.05f + (float)j * 0.1f;
                    if (k == 0) {
                        f11 *= ((float)j1 - 1.0f) * 0.05f + 1.0f;
                    }
                    this.mquad((Entity)p_115266_, matrix4f, vertexconsumer, f2, f3, j1, f4, f5, r, g, b, f10, f11, false, false, true, false);
                    this.mquad((Entity)p_115266_, matrix4f, vertexconsumer, f2, f3, j1, f4, f5, r, g, b, f10, f11, true, false, true, true);
                    this.mquad((Entity)p_115266_, matrix4f, vertexconsumer, f2, f3, j1, f4, f5, r, g, b, f10, f11, true, true, false, true);
                    this.mquad((Entity)p_115266_, matrix4f, vertexconsumer, f2, f3, j1, f4, f5, r, g, b, f10, f11, false, true, false, false);
                }
            }
        }
    }

    private void mquad(Entity entity, Matrix4f p_253966_, VertexConsumer p_115274_, float p_115275_, float p_115276_, int p_115277_, float p_115278_, float p_115279_, float p_115280_, float p_115281_, float p_115282_, float p_115283_, float p_115284_, boolean p_115285_, boolean p_115286_, boolean p_115287_, boolean p_115288_) {
        Random random = new Random();
        if (entity instanceof RedlightningEntity) {
            RedlightningEntity redlightning = (RedlightningEntity)entity;
            float r = 0.9f;
            float g = 0.6f - (float)redlightning.flashes * 0.02f;
            float b = 0.6f - (float)redlightning.flashes * 0.02f;
            float alpha = (float)redlightning.flashes * 0.033f;
            p_115274_.m_252986_(p_253966_, p_115275_ + (p_115285_ ? p_115284_ : -p_115284_), (float)(p_115277_ * 6), p_115276_ + (p_115286_ ? p_115284_ : -p_115284_)).m_85950_(r, g, b, alpha).m_5752_();
            p_115274_.m_252986_(p_253966_, p_115278_ + (p_115285_ ? p_115283_ : -p_115283_), (float)((p_115277_ + 1) * 6), p_115279_ + (p_115286_ ? p_115283_ : -p_115283_)).m_85950_(r, g, b, alpha).m_5752_();
            p_115274_.m_252986_(p_253966_, p_115278_ + (p_115287_ ? p_115283_ : -p_115283_), (float)((p_115277_ + 1) * 6), p_115279_ + (p_115288_ ? p_115283_ : -p_115283_)).m_85950_(r, g, b, alpha).m_5752_();
            p_115274_.m_252986_(p_253966_, p_115275_ + (p_115287_ ? p_115284_ : -p_115284_), (float)(p_115277_ * 6), p_115276_ + (p_115288_ ? p_115284_ : -p_115284_)).m_85950_(r, g, b, alpha).m_5752_();
        }
    }
}

