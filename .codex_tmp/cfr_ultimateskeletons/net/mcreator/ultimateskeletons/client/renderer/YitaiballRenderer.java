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
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.world.phys.Vec3
 *  org.joml.Matrix4f
 */
package net.mcreator.ultimateskeletons.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import java.awt.Color;
import java.util.Random;
import net.mcreator.ultimateskeletons.LightningChain;
import net.mcreator.ultimateskeletons.entity.YitaiballEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import org.joml.Matrix4f;

public class YitaiballRenderer
extends EntityRenderer<YitaiballEntity> {
    private static final ResourceLocation texture = new ResourceLocation("ultimateskeletons:textures/entities/enchant.png");
    private static final RenderType RENDER_TYPE = RenderType.m_110488_((ResourceLocation)texture);

    public YitaiballRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    public float xOffset(float p_117702_) {
        return (float)(Math.cos(p_117702_ * 0.01f) * 2.0);
    }

    public void render(YitaiballEntity entity, float yaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffers, int packedLight) {
        Random random = new Random();
        Vec3 start = new Vec3(0.0, (double)0.4f, 0.0);
        Vec3 end = new Vec3(entity.m_20185_() + 200.0 * ((double)random.nextFloat() - 0.5), entity.m_20186_() + 200.0 * ((double)random.nextFloat() - 0.5), entity.m_20189_() + 200.0 * ((double)random.nextFloat() - 0.5));
        float thickness = 0.02f;
        int color = -1426128896;
        int segment = 24;
        poseStack.m_85836_();
        poseStack.m_85841_(16.0f, 16.0f, 16.0f);
        int index0 = 0;
        while ((float)index0 < (float)entity.life * random.nextFloat()) {
            new LightningChain(poseStack, buffers, packedLight, start, new Vec3((double)(10.0f * random.nextFloat() - 5.0f), (double)(10.0f * random.nextFloat() - 5.0f), (double)(10.0f * random.nextFloat() - 5.0f)), thickness, color, segment);
            ++index0;
        }
        poseStack.m_85836_();
        poseStack.m_85849_();
        float $10 = (float)entity.f_19797_ + partialTicks;
        float radius = Math.max(0.08f * (1.0f + 0.2f * random.nextFloat() * (float)entity.life), 0.0f);
        poseStack.m_252781_(Axis.f_252436_.m_252977_(Mth.m_14179_((float)partialTicks, (float)entity.f_19859_, (float)entity.m_146908_()) - 90.0f));
        poseStack.m_252781_(Axis.f_252403_.m_252977_(Mth.m_14179_((float)partialTicks, (float)entity.f_19860_, (float)entity.m_146909_())));
        Matrix4f matrix = poseStack.m_85850_().m_252922_();
        VertexConsumer buffer = buffers.m_6299_(RenderType.m_110436_((ResourceLocation)texture, (float)(this.xOffset($10) % 1.0f), (float)($10 * 0.01f % 1.0f)));
        float hue = (float)(entity.f_19797_ % 100) / 100.0f;
        int rgb = Color.HSBtoRGB(hue, 1.0f, 1.0f);
        buffer.m_85950_((float)rgb, (float)rgb, (float)rgb, 0.8f);
        float u = (float)(Math.sin((double)entity.f_19797_ * 0.1) + 1.0) / 2.0f;
        float v = (float)(Math.cos((double)entity.f_19797_ * 0.1) + 1.0) / 2.0f;
        buffer.m_7421_(u, v);
        int segments = 32;
        int LONGITUDE_SEGMENTS = 32;
        int LATITUDE_SEGMENTS = 32;
        for (int i = 0; i < 32; ++i) {
            float theta1 = (float)(Math.PI * (double)i / 32.0);
            float theta2 = (float)(Math.PI * (double)(i + 1) / 32.0);
            for (int j = 0; j < 64; ++j) {
                float phi1 = (float)(Math.PI * 2 * (double)j / 64.0);
                float phi2 = (float)(Math.PI * 2 * (double)(j + 1) / 64.0);
                float x1 = radius * Mth.m_14031_((float)theta1) * Mth.m_14089_((float)phi1);
                float y1 = radius * Mth.m_14089_((float)theta1) + 0.5f;
                float z1 = radius * Mth.m_14031_((float)theta1) * Mth.m_14031_((float)phi1);
                float x2 = radius * Mth.m_14031_((float)theta2) * Mth.m_14089_((float)phi1);
                float y2 = radius * Mth.m_14089_((float)theta2) + 0.5f;
                float z2 = radius * Mth.m_14031_((float)theta2) * Mth.m_14031_((float)phi1);
                float x3 = radius * Mth.m_14031_((float)theta2) * Mth.m_14089_((float)phi2);
                float y3 = radius * Mth.m_14089_((float)theta2) + 0.5f;
                float z3 = radius * Mth.m_14031_((float)theta2) * Mth.m_14031_((float)phi2);
                float x4 = radius * Mth.m_14031_((float)theta1) * Mth.m_14089_((float)phi2);
                float y4 = radius * Mth.m_14089_((float)theta1) + 0.5f;
                float z4 = radius * Mth.m_14031_((float)theta1) * Mth.m_14031_((float)phi2);
                this.addVertex(matrix, buffer, x4, y4, z4, packedLight, 1.0f, 1.0f);
                this.addVertex(matrix, buffer, x3, y3, z3, packedLight, 1.0f, 0.0f);
                this.addVertex(matrix, buffer, x2, y2, z2, packedLight, 0.0f, 0.0f);
                this.addVertex(matrix, buffer, x1, y1, z1, packedLight, 0.0f, 1.0f);
            }
        }
        poseStack.m_85849_();
    }

    private void addVertex(Matrix4f matrix, VertexConsumer buffer, float x, float y, float z, int packedLight, float u, float v) {
        buffer.m_252986_(matrix, x, y, z).m_85950_(1.0f, 0.0f, 0.0f, 0.8f).m_7421_(u, v).m_86008_(OverlayTexture.f_118083_).m_85969_(packedLight).m_5601_(x, y, z).m_5752_();
    }

    public ResourceLocation getTextureLocation(YitaiballEntity entity) {
        return texture;
    }
}

