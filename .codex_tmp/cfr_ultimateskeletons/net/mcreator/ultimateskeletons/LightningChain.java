/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.PoseStack
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.renderer.MultiBufferSource
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Matrix4f
 */
package net.mcreator.ultimateskeletons;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public class LightningChain {
    private final Vec3 start;
    private final Vec3 end;
    private final float thickness;
    private final int color;
    private final int segments;

    public LightningChain(PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, Vec3 start, Vec3 end, float thickness, int color, int segments) {
        this.start = start;
        this.end = end;
        this.thickness = thickness;
        this.color = color;
        this.segments = segments;
        this.LightningChainRender(poseStack, bufferSource, packedLight, start, end, thickness, color, segments);
    }

    public void LightningChainRender(PoseStack poseStack, MultiBufferSource bufferSource, int packedLight, Vec3 start, Vec3 end, float thickness, int color, int segments) {
        Vec3[] points = this.generateLightningPath(start, end, segments, 0.5f);
        this.render3DLightning(poseStack, bufferSource, points, thickness, color, packedLight);
    }

    private Vec3[] generateLightningPath(Vec3 start, Vec3 end, int segments, float jitter) {
        int i;
        Vec3[] points = new Vec3[segments + 1];
        points[0] = start;
        points[segments] = end;
        Random random = new Random();
        Vec3 direction = end.m_82546_(start).m_82541_();
        float[] offsetsX = new float[segments + 1];
        float[] offsetsY = new float[segments + 1];
        float[] offsetsZ = new float[segments + 1];
        for (i = 0; i <= segments; ++i) {
            offsetsX[i] = (random.nextFloat() - 0.5f) * jitter;
            offsetsY[i] = (random.nextFloat() - 0.5f) * jitter;
            offsetsZ[i] = (random.nextFloat() - 0.5f) * jitter;
            if (i <= 0) continue;
            offsetsX[i] = offsetsX[i] * 0.5f + offsetsX[i - 1] * 0.5f;
            offsetsY[i] = offsetsY[i] * 0.5f + offsetsY[i - 1] * 0.5f;
            offsetsZ[i] = offsetsZ[i] * 0.5f + offsetsZ[i - 1] * 0.5f;
        }
        for (i = 1; i < segments; ++i) {
            double progress = (double)i / (double)segments;
            Vec3 base = start.m_165921_(end, progress);
            points[i] = base.m_82520_((double)offsetsX[i], (double)offsetsY[i], (double)offsetsZ[i]);
        }
        return points;
    }

    private void render3DLightning(PoseStack poseStack, MultiBufferSource bufferSource, Vec3[] points, float thickness, int color, int packedLight) {
        int i;
        VertexConsumer buffer = bufferSource.m_6299_(RenderType.m_110502_());
        Matrix4f matrix = poseStack.m_85850_().m_252922_();
        float r = (float)(color >> 16 & 0xFF) / 255.0f;
        float g = (float)(color >> 8 & 0xFF) / 255.0f;
        float b = (float)(color & 0xFF) / 255.0f;
        float a = (float)(color >> 24 & 0xFF) / 255.0f;
        ArrayList<Vec3> vertices = new ArrayList<Vec3>();
        ArrayList normals = new ArrayList();
        for (i = 0; i < points.length - 1; ++i) {
            Vec3 current = points[i];
            Vec3 next = points[i + 1];
            Vec3 direction = next.m_82546_(current).m_82541_();
            Vec3 ortho1 = new Vec3(direction.f_82480_, -direction.f_82479_, 0.0).m_82541_();
            if (ortho1.m_82556_() < 0.01) {
                ortho1 = new Vec3(direction.f_82481_, 0.0, -direction.f_82479_).m_82541_();
            }
            Vec3 ortho2 = direction.m_82537_(ortho1).m_82541_();
            Vec3[] currentVertices = new Vec3[]{current.m_82549_(ortho1.m_82490_((double)thickness)).m_82549_(ortho2.m_82490_((double)thickness)), current.m_82549_(ortho1.m_82490_((double)thickness)).m_82546_(ortho2.m_82490_((double)thickness)), current.m_82546_(ortho1.m_82490_((double)thickness)).m_82546_(ortho2.m_82490_((double)thickness)), current.m_82546_(ortho1.m_82490_((double)thickness)).m_82549_(ortho2.m_82490_((double)thickness))};
            Vec3[] nextVertices = new Vec3[]{next.m_82549_(ortho1.m_82490_((double)thickness)).m_82549_(ortho2.m_82490_((double)thickness)), next.m_82549_(ortho1.m_82490_((double)thickness)).m_82546_(ortho2.m_82490_((double)thickness)), next.m_82546_(ortho1.m_82490_((double)thickness)).m_82546_(ortho2.m_82490_((double)thickness)), next.m_82546_(ortho1.m_82490_((double)thickness)).m_82549_(ortho2.m_82490_((double)thickness))};
            this.addQuad(vertices, currentVertices[0], currentVertices[1], nextVertices[1], nextVertices[0]);
            this.addQuad(vertices, currentVertices[1], currentVertices[2], nextVertices[2], nextVertices[1]);
            this.addQuad(vertices, currentVertices[2], currentVertices[3], nextVertices[3], nextVertices[2]);
            this.addQuad(vertices, currentVertices[3], currentVertices[0], nextVertices[0], nextVertices[3]);
        }
        for (i = 0; i < vertices.size(); i += 4) {
            for (int j = 0; j < 4; ++j) {
                Vec3 vertex = (Vec3)vertices.get(i + j);
                buffer.m_252986_(matrix, (float)vertex.f_82479_, (float)vertex.f_82480_, (float)vertex.f_82481_).m_85950_(r, g, b, a).m_85969_(packedLight).m_5752_();
            }
        }
    }

    private void addQuad(List<Vec3> vertices, Vec3 v1, Vec3 v2, Vec3 v3, Vec3 v4) {
        vertices.add(v1);
        vertices.add(v2);
        vertices.add(v3);
        vertices.add(v4);
    }
}

