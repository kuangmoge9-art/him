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
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.mcreator.ultimateskeletons.client.particle;

import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.LinkedList;
import java.util.Queue;
import net.mcreator.ultimateskeletons.RenderTypeee;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.joml.Vector3f;
import org.joml.Vector3fc;

@OnlyIn(value=Dist.CLIENT)
public class LightningParticle
extends TextureSheetParticle {
    private final SpriteSet spriteSet;
    private final Queue<Vec3> trailQueue = new LinkedList<Vec3>();
    private static final int SMOOTHPOS = 1;
    private float trailWidth = 1.0f;
    private final float SIZE = 5.0f;
    private final Vec3 nopos = new Vec3(-1.145141919E9, -1.145141919E9, -1.145141919E9);

    public static LightningParticleProvider provider(SpriteSet spriteSet) {
        return new LightningParticleProvider(spriteSet);
    }

    protected LightningParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        int i;
        this.spriteSet = spriteSet;
        this.f_107227_ = this.f_107223_.m_188501_();
        this.f_107228_ = this.f_107223_.m_188501_();
        this.f_107229_ = this.f_107223_.m_188501_();
        this.m_107250_(0.2f, 0.2f);
        this.f_107225_ = 20;
        this.f_107226_ = 0.0f;
        this.f_107219_ = true;
        this.f_107215_ = vx * 1.0;
        this.f_107216_ = vy * 1.0;
        this.f_107217_ = vz * 1.0;
        this.trailQueue.clear();
        Vec3 now = new Vec3(this.f_107212_, this.f_107213_, this.f_107214_);
        for (i = 75; i != 0; --i) {
            this.trailQueue.add(now);
            now = new Vec3(now.m_7096_() + (double)((float)Mth.m_216271_((RandomSource)this.f_107223_, (int)-5, (int)5) / 6.25f), now.m_7098_() + (Math.random() + 0.5) * 3.3333332538604736, now.m_7094_() + (double)((float)Mth.m_216271_((RandomSource)this.f_107223_, (int)-5, (int)5) / 6.25f));
        }
        for (int _i = 0; _i < 10; ++_i) {
            Vec3 branch = new Vec3(now.f_82479_, now.f_82480_ - (double)Mth.m_216267_((RandomSource)this.f_107223_, (float)0.0f, (float)250.0f), now.f_82481_);
            this.trailQueue.add(this.nopos);
            for (i = 5 * Mth.m_216271_((RandomSource)this.f_107223_, (int)2, (int)4); i != 0; --i) {
                this.trailQueue.add(branch);
                branch = new Vec3(branch.m_7096_() + (double)((float)Mth.m_216271_((RandomSource)this.f_107223_, (int)-250, (int)250) / 70.0f), branch.m_7098_() - (Math.random() + 0.5) * 4.0, branch.m_7094_() + (double)((float)Mth.m_216271_((RandomSource)this.f_107223_, (int)-250, (int)250) / 70.0f));
            }
        }
        this.m_108335_(spriteSet);
    }

    public boolean shouldCull() {
        return false;
    }

    public int m_6355_(float partialTick) {
        return 0xF000F0;
    }

    public ParticleRenderType m_7556_() {
        return RenderTypeee.INSTANCE;
    }

    public void m_5989_() {
        if (this.f_107224_ == this.f_107225_ / 2) {
            this.trailWidth = 4.0f;
            this.trailQueue.clear();
            Vec3 now = new Vec3(this.f_107212_, this.f_107213_, this.f_107214_);
            for (int i = 75; i != 0; --i) {
                this.trailQueue.add(now);
                now = new Vec3(now.m_7096_() + (double)((float)Mth.m_216271_((RandomSource)this.f_107223_, (int)-5, (int)5) / 10.0f), now.m_7098_() + (Math.random() + 0.5) * 2.0, now.m_7094_() + (double)((float)Mth.m_216271_((RandomSource)this.f_107223_, (int)-5, (int)5) / 10.0f));
            }
        }
        super.m_5989_();
    }

    public void m_5744_(VertexConsumer vertexconsumer, Camera camera, float partialTicks) {
        Vec3 camPos = camera.m_90583_();
        Vec3 prevPos = null;
        Vector3f lastL2 = new Vector3f(0.0f, 0.0f, 0.0f);
        Vector3f lastR2 = new Vector3f(0.0f, 0.0f, 0.0f);
        boolean first = true;
        float u0 = this.m_5970_();
        float u1 = this.m_5952_();
        float v0 = this.m_5951_();
        float v1 = this.m_5950_();
        int light = this.m_6355_(partialTicks);
        int i = 0;
        for (Vec3 pos : this.trailQueue) {
            if (prevPos != this.nopos && prevPos != null && pos != this.nopos) {
                float x1 = (float)(prevPos.f_82479_ - camPos.m_7096_());
                float y1 = (float)(prevPos.f_82480_ - camPos.m_7098_());
                float z1 = (float)(prevPos.f_82481_ - camPos.m_7094_());
                float x2 = (float)(pos.f_82479_ - camPos.m_7096_());
                float y2 = (float)(pos.f_82480_ - camPos.m_7098_());
                float z2 = (float)(pos.f_82481_ - camPos.m_7094_());
                Vector3f trailDir = new Vector3f((float)(pos.f_82479_ - prevPos.f_82479_), (float)(pos.f_82480_ - prevPos.f_82480_), (float)(pos.f_82481_ - prevPos.f_82481_));
                trailDir.normalize();
                Vector3f camDir = new Vector3f((float)(camera.m_90583_().f_82479_ - pos.f_82479_), (float)(camera.m_90583_().f_82480_ - pos.f_82480_), (float)(camera.m_90583_().f_82481_ - pos.f_82481_));
                camDir.normalize();
                Vector3f rightVec = new Vector3f();
                trailDir.cross((Vector3fc)camDir, rightVec);
                rightVec.normalize().mul(this.trailWidth);
                Vector3f left1 = new Vector3f(x1, y1, z1).sub((Vector3fc)rightVec);
                Vector3f right1 = new Vector3f(x1, y1, z1).add((Vector3fc)rightVec);
                Vector3f left2 = new Vector3f(x2, y2, z2).sub((Vector3fc)rightVec);
                Vector3f right2 = new Vector3f(x2, y2, z2).add((Vector3fc)rightVec);
                if (!first) {
                    left1 = lastL2;
                    right1 = lastR2;
                } else {
                    first = false;
                }
                lastL2 = left2;
                lastR2 = right2;
                float f = ((float)this.f_107224_ + partialTicks) / (float)this.f_107225_;
                this.f_107230_ = this.f_107224_ != this.f_107225_ ? 1.0f * (1.0f - f) : 0.0f;
                vertexconsumer.m_5483_((double)left1.x(), (double)left1.y(), (double)left1.z()).m_7421_(u1, v1).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(light).m_5752_();
                vertexconsumer.m_5483_((double)left2.x(), (double)left2.y(), (double)left2.z()).m_7421_(u1, v0).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(light).m_5752_();
                vertexconsumer.m_5483_((double)right2.x(), (double)right2.y(), (double)right2.z()).m_7421_(u0, v0).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(light).m_5752_();
                vertexconsumer.m_5483_((double)right1.x(), (double)right1.y(), (double)right1.z()).m_7421_(u0, v1).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(light).m_5752_();
                vertexconsumer.m_5483_((double)right1.x(), (double)right1.y(), (double)right1.z()).m_7421_(u0, v1).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(light).m_5752_();
                vertexconsumer.m_5483_((double)right2.x(), (double)right2.y(), (double)right2.z()).m_7421_(u0, v0).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(light).m_5752_();
                vertexconsumer.m_5483_((double)left2.x(), (double)left2.y(), (double)left2.z()).m_7421_(u1, v0).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(light).m_5752_();
                vertexconsumer.m_5483_((double)left1.x(), (double)left1.y(), (double)left1.z()).m_7421_(u1, v1).m_85950_(this.f_107227_, this.f_107228_, this.f_107229_, this.f_107230_).m_85969_(light).m_5752_();
            }
            if (pos != this.nopos) {
                prevPos = pos;
            } else {
                prevPos = null;
                first = true;
            }
            ++i;
        }
    }

    public static class LightningParticleProvider
    implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public LightningParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            LightningParticle particle = new LightningParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
            return particle;
        }
    }
}

