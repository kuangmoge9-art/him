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
public class MultiverseexplosionParticle
extends TextureSheetParticle {
    private final SpriteSet spriteSet;

    public static MultiverseexplosionParticleProvider provider(SpriteSet spriteSet) {
        return new MultiverseexplosionParticleProvider(spriteSet);
    }

    protected MultiverseexplosionParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        this.m_107250_(0.2f, 0.2f);
        this.f_107225_ = 33;
        this.f_107226_ = 0.0f;
        this.f_107219_ = false;
        this.f_107215_ = vx * 1.0;
        this.f_107216_ = vy * 1.0;
        this.f_107217_ = vz * 1.0;
        this.m_108335_(spriteSet);
    }

    public int m_6355_(float partialTick) {
        return 0xF000F0;
    }

    public boolean shouldCull() {
        return false;
    }

    public RenderTypeee getRenderType() {
        return RenderTypeee.INSTANCE;
    }

    public void m_5989_() {
        this.f_107663_ = (6.0f - (float)this.f_107224_ * 0.1f) * (float)this.f_107224_;
        this.f_107227_ = 1.0f - 0.03f * (float)this.f_107224_;
        this.f_107229_ = 1.0f - 0.03f * (float)this.f_107224_;
        this.f_107228_ = 1.0f - 0.03f * (float)this.f_107224_;
        super.m_5989_();
    }

    public static class MultiverseexplosionParticleProvider
    implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public MultiverseexplosionParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            MultiverseexplosionParticle particle = new MultiverseexplosionParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
            return particle;
        }
    }
}

