/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  com.mojang.math.Axis
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.entity.EntityRenderer
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.texture.TextureAtlas
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  org.jetbrains.annotations.NotNull
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mcreator.ultimateskeletons.entity.GhostlightningEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class GhostlightningRenderer
extends EntityRenderer<GhostlightningEntity> {
    public GhostlightningRenderer(EntityRendererProvider.Context p_174286_) {
        super(p_174286_);
    }

    public void render(GhostlightningEntity lightningBolt, float yaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferSource, int light) {
        poseStack.m_85836_();
        poseStack.m_85841_(((Float)lightningBolt.m_20088_().m_135370_(GhostlightningEntity.size)).floatValue(), ((Float)lightningBolt.m_20088_().m_135370_(GhostlightningEntity.size)).floatValue(), ((Float)lightningBolt.m_20088_().m_135370_(GhostlightningEntity.size)).floatValue());
        poseStack.m_252781_(Axis.f_252495_.m_252977_(((Vector3f)lightningBolt.m_20088_().m_135370_(GhostlightningEntity.rotation)).x));
        poseStack.m_252781_(Axis.f_252392_.m_252977_(((Vector3f)lightningBolt.m_20088_().m_135370_(GhostlightningEntity.rotation)).y));
        poseStack.m_252781_(Axis.f_252393_.m_252977_(((Vector3f)lightningBolt.m_20088_().m_135370_(GhostlightningEntity.rotation)).z));
        if (!((Boolean)lightningBolt.m_20088_().m_135370_(GhostlightningEntity.isFromSky)).booleanValue()) {
            poseStack.m_252880_(0.0f, -130.0f, 0.0f);
        }
        float[] $$6 = new float[8];
        float[] $$7 = new float[8];
        float $$8 = 0.0f;
        float $$9 = 0.0f;
        RandomSource randomSource = RandomSource.m_216335_((long)lightningBolt.seed);
        for (int $$11 = 7; $$11 >= 0; --$$11) {
            $$6[$$11] = $$8;
            $$7[$$11] = $$9;
            $$8 += (float)(randomSource.m_188503_(11) - 5);
            $$9 += (float)(randomSource.m_188503_(11) - 5);
        }
        VertexConsumer vertexConsumer = bufferSource.m_6299_(RenderType.m_110502_());
        Matrix4f matrix4f = poseStack.m_85850_().m_252922_();
        for (int $$14 = 0; $$14 < 4; ++$$14) {
            RandomSource randomSource1 = RandomSource.m_216335_((long)lightningBolt.seed);
            for (int $$16 = 0; $$16 < 3; ++$$16) {
                int $$17 = 7;
                int $$18 = 0;
                if ($$16 > 0) {
                    $$17 = 7 - $$16;
                }
                if ($$16 > 0) {
                    $$18 = $$17 - 2;
                }
                float $$19 = $$6[$$17] - $$8;
                float $$20 = $$7[$$17] - $$9;
                for (int $$21 = $$17; $$21 >= $$18; --$$21) {
                    float $$22 = $$19;
                    float $$23 = $$20;
                    if ($$16 == 0) {
                        $$19 += (float)(randomSource1.m_188503_(11) - 5);
                        $$20 += (float)(randomSource1.m_188503_(11) - 5);
                    } else {
                        $$19 += (float)(randomSource1.m_188503_(31) - 15);
                        $$20 += (float)(randomSource1.m_188503_(31) - 15);
                    }
                    float $$24 = 0.5f;
                    float $$25 = 0.45f;
                    float $$26 = 0.45f;
                    float $$27 = 0.5f;
                    float $$28 = 0.1f + (float)$$14 * 0.2f;
                    if ($$16 == 0) {
                        $$28 *= (float)$$21 * 0.1f + 1.0f;
                    }
                    float $$29 = 0.1f + (float)$$14 * 0.2f;
                    if ($$16 == 0) {
                        $$29 *= ((float)$$21 - 1.0f) * 0.1f + 1.0f;
                    }
                    float alpha = (float)(lightningBolt.lifeTime - lightningBolt.f_19797_) / (float)lightningBolt.lifeTime;
                    alpha = Mth.m_14036_((float)alpha, (float)0.0f, (float)1.0f);
                    GhostlightningRenderer.quad(matrix4f, vertexConsumer, $$19, $$20, $$21, $$22, $$23, lightningBolt.getColour().x * alpha, lightningBolt.getColour().y * alpha, lightningBolt.getColour().z * alpha, $$28, $$29, false, false, true, false);
                    GhostlightningRenderer.quad(matrix4f, vertexConsumer, $$19, $$20, $$21, $$22, $$23, lightningBolt.getColour().x * alpha, lightningBolt.getColour().y * alpha, lightningBolt.getColour().z * alpha, $$28, $$29, true, false, true, true);
                    GhostlightningRenderer.quad(matrix4f, vertexConsumer, $$19, $$20, $$21, $$22, $$23, lightningBolt.getColour().x * alpha, lightningBolt.getColour().y * alpha, lightningBolt.getColour().z * alpha, $$28, $$29, true, true, false, true);
                    GhostlightningRenderer.quad(matrix4f, vertexConsumer, $$19, $$20, $$21, $$22, $$23, lightningBolt.getColour().x * alpha, lightningBolt.getColour().y * alpha, lightningBolt.getColour().z * alpha, $$28, $$29, false, true, false, false);
                }
            }
        }
        poseStack.m_85849_();
    }

    @NotNull
    public ResourceLocation getTextureLocation(@NotNull GhostlightningEntity ghostlightning) {
        return TextureAtlas.f_118259_;
    }

    private static void quad(Matrix4f p_253966_, VertexConsumer p_115274_, float p_115275_, float p_115276_, int p_115277_, float p_115278_, float p_115279_, float p_115280_, float p_115281_, float p_115282_, float p_115283_, float p_115284_, boolean p_115285_, boolean p_115286_, boolean p_115287_, boolean p_115288_) {
        p_115274_.m_252986_(p_253966_, p_115275_ + (p_115285_ ? p_115284_ : -p_115284_), (float)(p_115277_ * 16), p_115276_ + (p_115286_ ? p_115284_ : -p_115284_)).m_85950_(p_115280_, p_115281_, p_115282_, 0.3f).m_5752_();
        p_115274_.m_252986_(p_253966_, p_115278_ + (p_115285_ ? p_115283_ : -p_115283_), (float)((p_115277_ + 1) * 16), p_115279_ + (p_115286_ ? p_115283_ : -p_115283_)).m_85950_(p_115280_, p_115281_, p_115282_, 0.3f).m_5752_();
        p_115274_.m_252986_(p_253966_, p_115278_ + (p_115287_ ? p_115283_ : -p_115283_), (float)((p_115277_ + 1) * 16), p_115279_ + (p_115288_ ? p_115283_ : -p_115283_)).m_85950_(p_115280_, p_115281_, p_115282_, 0.3f).m_5752_();
        p_115274_.m_252986_(p_253966_, p_115275_ + (p_115287_ ? p_115284_ : -p_115284_), (float)(p_115277_ * 16), p_115276_ + (p_115288_ ? p_115284_ : -p_115284_)).m_85950_(p_115280_, p_115281_, p_115282_, 0.3f).m_5752_();
    }
}

