/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  org.joml.Matrix4f
 */
package net.mcreator.ultimateskeletons;

import com.mojang.blaze3d.vertex.VertexConsumer;
import org.joml.Matrix4f;

public class BrilliantRenderer {
    public static final float HALF_SQRT_3 = (float)(Math.sqrt(3.0) / 2.0);

    public static void vertex01(VertexConsumer p_254498_, Matrix4f p_253891_, int p_254278_) {
        p_254498_.m_252986_(p_253891_, 0.0f, 0.0f, 0.0f).m_6122_(255, 255, 255, p_254278_).m_5752_();
    }

    public static void vertex2(VertexConsumer p_253956_, Matrix4f p_254053_, float p_253704_, float p_253701_, float phase) {
        int red = (int)(Math.sin(phase) * 127.0 + 128.0);
        int green = (int)(Math.sin((double)phase + 2.0943951023931953) * 127.0 + 128.0);
        int blue = (int)(Math.sin((double)phase + 4.1887902047863905) * 127.0 + 128.0);
        p_253956_.m_252986_(p_254053_, -HALF_SQRT_3 * p_253701_, p_253704_, -0.5f * p_253701_).m_6122_(red, green, blue, 128).m_5752_();
    }

    public static void vertex3(VertexConsumer p_253850_, Matrix4f p_254379_, float p_253729_, float p_254030_, float phase) {
        int red = (int)(Math.sin(phase) * 127.0 + 128.0);
        int green = (int)(Math.sin((double)phase + 2.0943951023931953) * 127.0 + 128.0);
        int blue = (int)(Math.sin((double)phase + 4.1887902047863905) * 127.0 + 128.0);
        p_253850_.m_252986_(p_254379_, HALF_SQRT_3 * p_254030_, p_253729_, -0.5f * p_254030_).m_6122_(red, green, blue, 128).m_5752_();
    }

    public static void vertex4(VertexConsumer p_254184_, Matrix4f p_254082_, float p_253649_, float p_253694_, float phase) {
        int red = (int)(Math.sin(phase) * 127.0 + 128.0);
        int green = (int)(Math.sin((double)phase + 2.0943951023931953) * 127.0 + 128.0);
        int blue = (int)(Math.sin((double)phase + 4.1887902047863905) * 127.0 + 128.0);
        p_254184_.m_252986_(p_254082_, 0.0f, p_253649_, 1.0f * p_253694_).m_6122_(red, green, blue, 128).m_5752_();
    }
}

