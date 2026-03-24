/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexConsumer
 *  com.mojang.math.Axis
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.model.EntityModel
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.particle.Particle
 *  net.minecraft.client.particle.ParticleProvider
 *  net.minecraft.client.particle.ParticleRenderType
 *  net.minecraft.client.particle.SpriteSet
 *  net.minecraft.client.particle.TextureSheetParticle
 *  net.minecraft.client.renderer.RenderType
 *  net.minecraft.client.renderer.texture.OverlayTexture
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 *  net.minecraftforge.client.event.RenderLevelStageEvent
 *  net.minecraftforge.client.event.RenderLevelStageEvent$Stage
 *  net.minecraftforge.common.MinecraftForge
 *  net.minecraftforge.event.TickEvent$ClientTickEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 */
package net.mcreator.ultimateskeletons.client.particle;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.mcreator.ultimateskeletons.client.model.Modelenergyblock;
import net.mcreator.ultimateskeletons.procedures.BlockenergyZhiProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@OnlyIn(value=Dist.CLIENT)
public class EnergyblockParticle
extends TextureSheetParticle {
    private final SpriteSet spriteSet;

    public static EnergyblockParticleProvider provider(SpriteSet spriteSet) {
        return new EnergyblockParticleProvider(spriteSet);
    }

    protected EnergyblockParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        this.m_107250_(0.2f, 0.2f);
        this.f_107663_ *= 8.0f;
        this.f_107225_ = Math.max(1, 50 + (this.f_107223_.m_188503_(40) - 20));
        this.f_107226_ = 1.0f;
        this.f_107219_ = true;
        this.f_107215_ = vx * 1.0;
        this.f_107216_ = vy * 1.0;
        this.f_107217_ = vz * 1.0;
        this.m_108335_(spriteSet);
    }

    public int m_6355_(float partialTick) {
        return 0xF000F0;
    }

    public ParticleRenderType m_7556_() {
        return ParticleRenderType.f_107434_;
    }

    public void m_5989_() {
        super.m_5989_();
    }

    public static class EnergyblockParticleProvider
    implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public EnergyblockParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            final EnergyblockParticle particle = new EnergyblockParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
            class EnergyblockRenderSequence {
                private ClientLevel world;
                private 1EnergyblockRenderSequence.EnergyblockRenderer renderer;

                EnergyblockRenderSequence() {
                }

                public void start(ClientLevel world) {
                    this.renderer = new 1EnergyblockRenderSequence.EnergyblockRenderer();
                    MinecraftForge.EVENT_BUS.register((Object)this);
                    this.world = world;
                }

                @SubscribeEvent
                public void tick(TickEvent.ClientTickEvent event) {
                    if (!particle.m_107276_()) {
                        this.end();
                    }
                }

                private void end() {
                    MinecraftForge.EVENT_BUS.unregister((Object)this.renderer);
                    MinecraftForge.EVENT_BUS.unregister((Object)this);
                }

                private class 1EnergyblockRenderSequence.EnergyblockRenderer {
                    public EntityModel model = new Modelenergyblock(Minecraft.m_91087_().m_167973_().m_171103_(Modelenergyblock.LAYER_LOCATION));
                    private float scale = (float)BlockenergyZhiProcedure.execute();
                    private int rotX = 0;
                    private int rotY = 0;
                    private int rotZ = 0;

                    public 1EnergyblockRenderSequence.EnergyblockRenderer() {
                        MinecraftForge.EVENT_BUS.register((Object)this);
                    }

                    @SubscribeEvent
                    public void render(RenderLevelStageEvent event) {
                        if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_PARTICLES) {
                            VertexConsumer consumer = Minecraft.m_91087_().m_91269_().m_110104_().m_6299_(RenderType.m_234338_((ResourceLocation)new ResourceLocation("ultimateskeletons:textures/particle/energyblock.png")));
                            Vec3 camPos = event.getCamera().m_90583_();
                            double x = Mth.m_14139_((double)event.getPartialTick(), (double)particle.f_107209_, (double)particle.f_107212_) - camPos.m_7096_();
                            double y = Mth.m_14139_((double)event.getPartialTick(), (double)particle.f_107210_, (double)particle.f_107213_) - camPos.m_7098_();
                            double z = Mth.m_14139_((double)event.getPartialTick(), (double)particle.f_107211_, (double)particle.f_107214_) - camPos.m_7094_();
                            event.getPoseStack().m_85836_();
                            event.getPoseStack().m_85837_(x, y, z);
                            event.getPoseStack().m_252781_(Axis.f_252529_.m_252977_(180.0f));
                            event.getPoseStack().m_85841_(this.scale, this.scale, this.scale);
                            event.getPoseStack().m_252781_(Axis.f_252529_.m_252977_((float)this.rotX));
                            event.getPoseStack().m_252781_(Axis.f_252436_.m_252977_((float)this.rotY));
                            event.getPoseStack().m_252781_(Axis.f_252403_.m_252977_((float)this.rotZ));
                            this.model.m_7695_(event.getPoseStack(), consumer, particle.m_6355_(event.getPartialTick()), OverlayTexture.f_118083_, 1.0f, 1.0f, 1.0f, 1.0f);
                            event.getPoseStack().m_85849_();
                        }
                    }
                }
            }
            EnergyblockRenderSequence sequence = new EnergyblockRenderSequence();
            sequence.start(worldIn);
            return particle;
        }
    }
}

