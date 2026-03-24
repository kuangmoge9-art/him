/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.particle.ParticleProvider
 *  net.minecraft.client.particle.SpriteSet
 *  net.minecraft.client.particle.TextureSheetParticle
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 */
package net.mcreator.ultimateskeletons.client.particle;

import net.mcreator.ultimateskeletons.RenderTypeee;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(value=Dist.CLIENT)
public class Smoke3Particle
extends TextureSheetParticle {
    private final SpriteSet spriteSet;

    public static Smoke3ParticleProvider provider(SpriteSet spriteSet) {
        return new Smoke3ParticleProvider(spriteSet);
    }

    protected Smoke3Particle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        this.m_107250_(0.2f, 0.2f);
        this.f_107663_ *= 4.0f;
        this.f_107225_ = Math.max(1, 15 + (this.f_107223_.m_188503_(8) - 4));
        this.f_107226_ = 0.0f;
        this.f_107219_ = false;
        this.f_107215_ = vx * 1.0;
        this.f_107216_ = vy * 1.0;
        this.f_107217_ = vz * 1.0;
        this.m_108335_(spriteSet);
    }

    public boolean shouldCull() {
        return false;
    }

    public int m_6355_(float partialTick) {
        return 0xF000F0;
    }

    public RenderTypeee getRenderType() {
        return RenderTypeee.INSTANCE;
    }

    public void m_5989_() {
        super.m_5989_();
        this.f_107227_ = 1.0f - 0.05f * (float)this.f_107224_;
        this.f_107229_ = 1.0f - 0.05f * (float)this.f_107224_;
        this.f_107228_ = 1.0f - 0.05f * (float)this.f_107224_;
    }

    public static class Smoke3ParticleProvider
    implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Smoke3ParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            Smoke3Particle particle = new Smoke3Particle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
            return particle;
        }
    }
}

