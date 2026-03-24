/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.entity.EntityRendererProvider$Context
 *  net.minecraft.client.renderer.entity.LightningBoltRenderer
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.LightningBolt
 *  org.joml.Matrix4f
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.Random;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LightningBoltRenderer;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LightningBolt;
import org.joml.Matrix4f;

public class RainbowlightningRenderer
extends LightningBoltRenderer {
    private static final Random RANDOM = new Random();

    public RainbowlightningRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public void m_7392_(LightningBolt p_115266_, float p_115267_, float p_115268_, PoseStack p_115269_, MultiBufferSource p_115270_, int p_115271_) {
        float colorIntensity;
        float[] $6 = new float[32];
        float[] $7 = new float[32];
        float $8 = 0.0f;
        float $9 = 0.0f;
        Random random = new Random();
        float $$10 = p_115267_ + p_115268_;
        float red = colorIntensity = (float)((Math.sin($$10 * 0.1f) + 1.0) / 2.0);
        float green = 1.0f - colorIntensity;
        float blue = 0.5f;
        float r = random.nextFloat();
        float g = random.nextFloat();
        float b = random.nextFloat();
        RandomSource $10 = RandomSource.m_216335_((long)p_115266_.f_20859_);
        for (int $11 = 31; $11 >= 0; --$11) {
            $6[$11] = $8;
            $7[$11] = $9;
            $8 += (float)($10.m_188503_(5) - 2);
            $9 += (float)($10.m_188503_(5) - 2);
        }
        VertexConsumer $12 = p_115270_.m_6299_(RenderType.m_110502_());
        Matrix4f $13 = p_115269_.m_85850_().m_252922_();
        for (int $14 = 0; $14 < 4; ++$14) {
            RandomSource $15 = RandomSource.m_216335_((long)p_115266_.f_20859_);
            for (int $16 = 0; $16 < 4; ++$16) {
                int $17 = 31;
                int $18 = 0;
                if ($16 > 0) {
                    $17 = 31 - $16;
                }
                if ($16 > 0) {
                    $18 = $17 - 16;
                }
                float $19 = $6[$17] - $8;
                float $20 = $7[$17] - $9;
                for (int $21 = $17; $21 >= $18; --$21) {
                    float $22 = $19;
                    float $23 = $20;
                    if ($16 == 0) {
                        $19 += (float)($15.m_188503_(5) - 2);
                        $20 += (float)($15.m_188503_(5) - 2);
                    } else {
                        $19 += (float)($15.m_188503_(7) - 3);
                        $20 += (float)($15.m_188503_(7) - 3);
                    }
                    float $28 = 0.05f + (float)$14 * 0.05f;
                    if ($16 == 0) {
                        $28 *= (float)$21 * 0.05f + 1.0f;
                    }
                    float $29 = 0.05f + (float)$14 * 0.05f;
                    if ($16 == 0) {
                        $29 *= ((float)$21 - 1.0f) * 0.05f + 1.0f;
                    }
                    RainbowlightningRenderer.Myquad($13, $12, $19, $20, $21, $22, $23, r, g, b, $28, $29, false, false, true, false);
                    RainbowlightningRenderer.Myquad($13, $12, $19, $20, $21, $22, $23, r, g, b, $28, $29, true, false, true, true);
                    RainbowlightningRenderer.Myquad($13, $12, $19, $20, $21, $22, $23, r, g, b, $28, $29, true, true, false, true);
                    RainbowlightningRenderer.Myquad($13, $12, $19, $20, $21, $22, $23, r, g, b, $28, $29, false, true, false, false);
                }
            }
        }
    }

    private static void Myquad(Matrix4f p_253966_, VertexConsumer p_115274_, float p_115275_, float p_115276_, int p_115277_, float p_115278_, float p_115279_, float p_115280_, float p_115281_, float p_115282_, float p_115283_, float p_115284_, boolean p_115285_, boolean p_115286_, boolean p_115287_, boolean p_115288_) {
        p_115274_.m_252986_(p_253966_, p_115275_ + (p_115285_ ? p_115284_ : -p_115284_), (float)(p_115277_ * 4), p_115276_ + (p_115286_ ? p_115284_ : -p_115284_)).m_85950_(p_115280_, p_115281_, p_115282_, 0.3f).m_5752_();
        p_115274_.m_252986_(p_253966_, p_115278_ + (p_115285_ ? p_115283_ : -p_115283_), (float)((p_115277_ + 1) * 4), p_115279_ + (p_115286_ ? p_115283_ : -p_115283_)).m_85950_(p_115280_, p_115281_, p_115282_, 0.3f).m_5752_();
        p_115274_.m_252986_(p_253966_, p_115278_ + (p_115287_ ? p_115283_ : -p_115283_), (float)((p_115277_ + 1) * 4), p_115279_ + (p_115288_ ? p_115283_ : -p_115283_)).m_85950_(p_115280_, p_115281_, p_115282_, 0.3f).m_5752_();
        p_115274_.m_252986_(p_253966_, p_115275_ + (p_115287_ ? p_115284_ : -p_115284_), (float)(p_115277_ * 4), p_115276_ + (p_115288_ ? p_115284_ : -p_115284_)).m_85950_(p_115280_, p_115281_, p_115282_, 0.3f).m_5752_();
    }
}

