/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  net.minecraft.client.Camera
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.particle.ParticleProvider
 *  net.minecraft.client.particle.SpriteSet
 *  net.minecraft.client.particle.TextureSheetParticle
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.util.Mth
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
package net.mcreator.ultimateskeletons.client.particle;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mcreator.ultimateskeletons.RenderTypeee;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

@OnlyIn(value=Dist.CLIENT)
public class WithireniumenergyfireParticle
extends TextureSheetParticle {
    private final SpriteSet spriteSet;

    public static WithireniumenergyfireParticleProvider provider(SpriteSet spriteSet) {
        return new WithireniumenergyfireParticleProvider(spriteSet);
    }

    protected WithireniumenergyfireParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        this.m_107250_(0.2f, 0.2f);
        this.f_107663_ *= 100.0f;
        this.f_107225_ = Math.max(1, 30 + (this.f_107223_.m_188503_(8) - 4));
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

    public void m_5744_(VertexConsumer p_107678_, Camera p_107679_, float p_107680_) {
        Vec3 vec3 = p_107679_.m_90583_();
        float f = (float)(Mth.m_14139_((double)p_107680_, (double)this.f_107209_, (double)this.f_107212_) - vec3.m_7096_());
        float f1 = (float)(Mth.m_14139_((double)p_107680_, (double)this.f_107210_, (double)this.f_107213_) - vec3.m_7098_());
        float f2 = (float)(Mth.m_14139_((double)p_107680_, (double)this.f_107211_, (double)this.f_107214_) - vec3.m_7094_());
        this.f_107227_ = 1.0f - 0.03f * (float)this.f_107224_;
        this.f_107229_ = 1.0f - 0.03f * (float)this.f_107224_;
        this.f_107228_ = 1.0f - 0.03f * (float)this.f_107224_;
        Quaternionf quaternionf = new Quaternionf((Quaternionfc)p_107679_.m_253121_());
        quaternionf.z = 0.0f;
        quaternionf.x = 0.0f;
        Vector3f[] avector3f = new Vector3f[]{new Vector3f(-1.0f, 0.0f, 0.0f), new Vector3f(-1.0f, 2.0f, 0.0f), new Vector3f(1.0f, 2.0f, 0.0f), new Vector3f(1.0f, 0.0f, 0.0f)};
        float f3 = this.m_5902_(p_107680_);
        for (int i = 0; i < 4; ++i) {
            Vector3f vector3f = avector3f[i];
            vector3f.rotate((Quaternionfc)quaternionf);
            vector3f.mul(f3);
            vector3f.add(f, f1, f2);
        }
        float f6 = this.m_5970_();
        float f7 = this.m_5952_();
        float f4 = this.m_5951_();
        float f5 = this.m_5950_();
        int j = this.m_6355_(p_107680_);
        p_107678_.m_5483_((double)avector3f[0].x(), (double)avector3f[0].y(), (double)avector3f[0].z()).m_7421_(f7, f5).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(j).m_5752_();
        p_107678_.m_5483_((double)avector3f[1].x(), (double)avector3f[1].y(), (double)avector3f[1].z()).m_7421_(f7, f4).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(j).m_5752_();
        p_107678_.m_5483_((double)avector3f[2].x(), (double)avector3f[2].y(), (double)avector3f[2].z()).m_7421_(f6, f4).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(j).m_5752_();
        p_107678_.m_5483_((double)avector3f[3].x(), (double)avector3f[3].y(), (double)avector3f[3].z()).m_7421_(f6, f5).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(j).m_5752_();
        p_107678_.m_5483_((double)avector3f[3].x(), (double)avector3f[3].y(), (double)avector3f[3].z()).m_7421_(f6, f5).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(j).m_5752_();
        p_107678_.m_5483_((double)avector3f[2].x(), (double)avector3f[2].y(), (double)avector3f[2].z()).m_7421_(f6, f4).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(j).m_5752_();
        p_107678_.m_5483_((double)avector3f[1].x(), (double)avector3f[1].y(), (double)avector3f[1].z()).m_7421_(f7, f4).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(j).m_5752_();
        p_107678_.m_5483_((double)avector3f[0].x(), (double)avector3f[0].y(), (double)avector3f[0].z()).m_7421_(f7, f5).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(j).m_5752_();
    }

    public void m_5989_() {
        super.m_5989_();
    }

    public static class WithireniumenergyfireParticleProvider
    implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public WithireniumenergyfireParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            WithireniumenergyfireParticle particle = new WithireniumenergyfireParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
            return particle;
        }
    }
}

