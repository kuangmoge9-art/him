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
public class DeathshiningParticle
extends TextureSheetParticle {
    private final SpriteSet spriteSet;

    public static DeathshiningParticleProvider provider(SpriteSet spriteSet) {
        return new DeathshiningParticleProvider(spriteSet);
    }

    public boolean shouldCull() {
        return false;
    }

    protected DeathshiningParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        this.m_107250_(0.2f, 0.2f);
        this.f_107663_ *= 300.0f;
        this.f_107225_ = 99;
        this.f_107226_ = 0.0f;
        this.f_107219_ = false;
        this.f_107215_ = vx * 1.0;
        this.f_107216_ = vy * 1.0;
        this.f_107217_ = vz * 1.0;
        this.m_108339_(spriteSet);
    }

    public int m_6355_(float partialTick) {
        return 0xF000F0;
    }

    public RenderTypeee getRenderType() {
        return RenderTypeee.INSTANCE;
    }

    public void m_5989_() {
        super.m_5989_();
        if (!this.f_107220_) {
            this.m_108337_(this.spriteSet.m_5819_(this.f_107224_ / 1 % 100 + 1, 100));
        }
    }

    public static class DeathshiningParticleProvider
    implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public DeathshiningParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            DeathshiningParticle particle = new DeathshiningParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
            return particle;
        }
    }
}

