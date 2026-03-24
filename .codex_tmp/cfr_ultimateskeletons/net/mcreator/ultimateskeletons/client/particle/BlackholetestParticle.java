/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.Camera
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.particle.ParticleProvider
 *  net.minecraft.client.particle.ParticleRenderType
 *  net.minecraft.client.particle.SpriteSet
 *  net.minecraft.client.particle.TextureSheetParticle
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.util.Mth
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 */
package net.mcreator.ultimateskeletons.client.particle;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(value=Dist.CLIENT)
public class BlackholetestParticle
extends TextureSheetParticle {
    private final SpriteSet spriteSet;
    public int time = 0;
    public int size = 0;

    public static BlackholetestParticleProvider provider(SpriteSet spriteSet) {
        return new BlackholetestParticleProvider(spriteSet);
    }

    protected BlackholetestParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        this.m_107250_(0.2f, 0.2f);
        this.f_107663_ = 12.0f;
        this.f_107225_ = 200;
        this.f_107226_ = 0.0f;
        this.f_107219_ = true;
        this.f_107215_ = vx * 1.0;
        this.f_107216_ = vy * 1.0;
        this.f_107217_ = vz * 1.0;
        this.m_108335_(spriteSet);
    }

    public boolean shouldCull() {
        return false;
    }

    public ParticleRenderType m_7556_() {
        return ParticleRenderType.f_107431_;
    }

    public void m_5744_(VertexConsumer vertexConsumer, Camera camera, float partialTicks) {
        Vec3 cameraPosition = camera.m_90583_();
        this.f_107663_ = (float)this.size * 0.6f;
        this.f_107227_ = 1.0f - 0.01f * (float)this.time;
        this.f_107228_ = 1.0f - 0.01f * (float)this.time;
        this.f_107229_ = 1.0f - 0.01f * (float)this.time;
        float x = (float)(Mth.m_14139_((double)partialTicks, (double)this.f_107209_, (double)this.f_107212_) - cameraPosition.m_7096_());
        float y = (float)(Mth.m_14139_((double)partialTicks, (double)this.f_107210_, (double)this.f_107213_) - cameraPosition.m_7098_());
        float z = (float)(Mth.m_14139_((double)partialTicks, (double)this.f_107211_, (double)this.f_107214_) - cameraPosition.m_7094_());
        int segments = 32;
        float radius = this.m_5902_(partialTicks);
        int lightColor = 0xF000F0;
        float f6 = this.m_5970_();
        float f7 = this.m_5952_();
        float f4 = this.m_5951_();
        float f5 = this.m_5950_();
        float u = f7 - f6;
        float v = f5 - f4;
        for (int i = 0; i < segments; ++i) {
            float theta1 = (float)(Math.PI * (double)i / (double)segments);
            float theta2 = (float)(Math.PI * (double)(i + 1) / (double)segments);
            for (int j = 0; j < segments * 2; ++j) {
                float phi1 = (float)(Math.PI * 2 * (double)j / (double)(segments * 2));
                float phi2 = (float)(Math.PI * 2 * (double)(j + 1) / (double)(segments * 2));
                float x1 = x + radius * Mth.m_14031_((float)theta1) * Mth.m_14089_((float)phi1);
                float y1 = y + radius * Mth.m_14089_((float)theta1);
                float z1 = z + radius * Mth.m_14031_((float)theta1) * Mth.m_14031_((float)phi1);
                float x2 = x + radius * Mth.m_14031_((float)theta2) * Mth.m_14089_((float)phi1);
                float y2 = y + radius * Mth.m_14089_((float)theta2);
                float z2 = z + radius * Mth.m_14031_((float)theta2) * Mth.m_14031_((float)phi1);
                float x3 = x + radius * Mth.m_14031_((float)theta2) * Mth.m_14089_((float)phi2);
                float y3 = y + radius * Mth.m_14089_((float)theta2);
                float z3 = z + radius * Mth.m_14031_((float)theta2) * Mth.m_14031_((float)phi2);
                float x4 = x + radius * Mth.m_14031_((float)theta1) * Mth.m_14089_((float)phi2);
                float y4 = y + radius * Mth.m_14089_((float)theta1);
                float z4 = z + radius * Mth.m_14031_((float)theta1) * Mth.m_14031_((float)phi2);
                float alphaa = this.f_107230_;
                vertexConsumer.m_5483_((double)x4, (double)y4, (double)z4).m_7421_(f6 + u / 2.0f, f5).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                vertexConsumer.m_5483_((double)x3, (double)y3, (double)z3).m_7421_(f6 + u / 2.0f, f4).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                vertexConsumer.m_5483_((double)x2, (double)y2, (double)z2).m_7421_(f6, f4).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                vertexConsumer.m_5483_((double)x1, (double)y1, (double)z1).m_7421_(f6, f5).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                vertexConsumer.m_5483_((double)x1, (double)y1, (double)z1).m_7421_(f6, f5).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                vertexConsumer.m_5483_((double)x2, (double)y2, (double)z2).m_7421_(f6, f4).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                vertexConsumer.m_5483_((double)x3, (double)y3, (double)z3).m_7421_(f6 + u / 2.0f, f4).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                vertexConsumer.m_5483_((double)x4, (double)y4, (double)z4).m_7421_(f6 + u / 2.0f, f5).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                x1 = x + (radius += (float)((double)this.size * 0.1)) * Mth.m_14031_((float)theta1) * Mth.m_14089_((float)phi1);
                y1 = y + radius * Mth.m_14089_((float)theta1);
                z1 = z + radius * Mth.m_14031_((float)theta1) * Mth.m_14031_((float)phi1);
                x2 = x + radius * Mth.m_14031_((float)theta2) * Mth.m_14089_((float)phi1);
                y2 = y + radius * Mth.m_14089_((float)theta2);
                z2 = z + radius * Mth.m_14031_((float)theta2) * Mth.m_14031_((float)phi1);
                x3 = x + radius * Mth.m_14031_((float)theta2) * Mth.m_14089_((float)phi2);
                y3 = y + radius * Mth.m_14089_((float)theta2);
                z3 = z + radius * Mth.m_14031_((float)theta2) * Mth.m_14031_((float)phi2);
                x4 = x + radius * Mth.m_14031_((float)theta1) * Mth.m_14089_((float)phi2);
                y4 = y + radius * Mth.m_14089_((float)theta1);
                z4 = z + radius * Mth.m_14031_((float)theta1) * Mth.m_14031_((float)phi2);
                vertexConsumer.m_5483_((double)x1, (double)y1, (double)z1).m_7421_(f6 + u / 2.0f, f5).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                vertexConsumer.m_5483_((double)x2, (double)y2, (double)z2).m_7421_(f6 + u / 2.0f, f4).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                vertexConsumer.m_5483_((double)x3, (double)y3, (double)z3).m_7421_(f7, f4).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                vertexConsumer.m_5483_((double)x4, (double)y4, (double)z4).m_7421_(f7, f5).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, alphaa).m_85969_(lightColor).m_5752_();
                radius -= (float)((double)this.size * 0.1);
            }
        }
    }

    public void m_5989_() {
        super.m_5989_();
        if (this.f_107224_ <= 20) {
            ++this.size;
        }
        if (this.f_107224_ > 100) {
            ++this.time;
        }
    }

    public static class BlackholetestParticleProvider
    implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public BlackholetestParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            BlackholetestParticle particle = new BlackholetestParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
            return particle;
        }
    }
}

