/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleType
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.RegisterParticleProvidersEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package net.mcreator.ultimateskeletons.init;

import net.mcreator.ultimateskeletons.client.particle.AdamanblockParticle;
import net.mcreator.ultimateskeletons.client.particle.BlackholetestParticle;
import net.mcreator.ultimateskeletons.client.particle.BladerushParticle;
import net.mcreator.ultimateskeletons.client.particle.CosmicParticle;
import net.mcreator.ultimateskeletons.client.particle.CutParticle;
import net.mcreator.ultimateskeletons.client.particle.DeathenergylightningParticle;
import net.mcreator.ultimateskeletons.client.particle.DeathimplosionParticle;
import net.mcreator.ultimateskeletons.client.particle.DeathshineParticle;
import net.mcreator.ultimateskeletons.client.particle.DeathshiningParticle;
import net.mcreator.ultimateskeletons.client.particle.EnergyblockParticle;
import net.mcreator.ultimateskeletons.client.particle.EnergyholeParticle;
import net.mcreator.ultimateskeletons.client.particle.EnergypowerParticle;
import net.mcreator.ultimateskeletons.client.particle.FlameParticle;
import net.mcreator.ultimateskeletons.client.particle.LightningParticle;
import net.mcreator.ultimateskeletons.client.particle.Multiverse1Particle;
import net.mcreator.ultimateskeletons.client.particle.Multiverse2Particle;
import net.mcreator.ultimateskeletons.client.particle.Multiverse3Particle;
import net.mcreator.ultimateskeletons.client.particle.MultiverseParticle;
import net.mcreator.ultimateskeletons.client.particle.MultiverseexplosionParticle;
import net.mcreator.ultimateskeletons.client.particle.MultiversewaveParticle;
import net.mcreator.ultimateskeletons.client.particle.MutiverseParticle;
import net.mcreator.ultimateskeletons.client.particle.NahParticle;
import net.mcreator.ultimateskeletons.client.particle.PanParticle;
import net.mcreator.ultimateskeletons.client.particle.ShaParticle;
import net.mcreator.ultimateskeletons.client.particle.Smoke1Particle;
import net.mcreator.ultimateskeletons.client.particle.Smoke2Particle;
import net.mcreator.ultimateskeletons.client.particle.Smoke3Particle;
import net.mcreator.ultimateskeletons.client.particle.StarParticle;
import net.mcreator.ultimateskeletons.client.particle.StarblockParticle;
import net.mcreator.ultimateskeletons.client.particle.SunParticle;
import net.mcreator.ultimateskeletons.client.particle.TemplarlightningParticle;
import net.mcreator.ultimateskeletons.client.particle.UlstarblastParticle;
import net.mcreator.ultimateskeletons.client.particle.UltimatebreakerParticle;
import net.mcreator.ultimateskeletons.client.particle.UniverseParticle;
import net.mcreator.ultimateskeletons.client.particle.WithireniumenergyfireParticle;
import net.mcreator.ultimateskeletons.client.particle.ZhanParticle;
import net.mcreator.ultimateskeletons.client.particle.ZhanhugeParticle;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.core.particles.ParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value={Dist.CLIENT})
public class UltimateskeletonsModParticles {
    @SubscribeEvent
    public static void registerParticles(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.SMOKE_1.get(), Smoke1Particle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.SMOKE_2.get(), Smoke2Particle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.SMOKE_3.get(), Smoke3Particle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.ENERGYPOWER.get(), EnergypowerParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.ENERGYHOLE.get(), EnergyholeParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEWAVE.get(), MultiversewaveParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.MULTIVERSEEXPLOSION.get(), MultiverseexplosionParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.DEATHSHINING.get(), DeathshiningParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.DEATHENERGYLIGHTNING.get(), DeathenergylightningParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.DEATHSHINE.get(), DeathshineParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.DEATHIMPLOSION.get(), DeathimplosionParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.MUTIVERSE.get(), MutiverseParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE_1.get(), Multiverse1Particle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE_2.get(), Multiverse2Particle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE_3.get(), Multiverse3Particle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE.get(), MultiverseParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.STAR.get(), StarParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.ENERGYBLOCK.get(), EnergyblockParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.TEMPLARLIGHTNING.get(), TemplarlightningParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.SUN.get(), SunParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.ULTIMATEBREAKER.get(), UltimatebreakerParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.COSMIC.get(), CosmicParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.UNIVERSE.get(), UniverseParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.ULSTARBLAST.get(), UlstarblastParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.ZHAN.get(), ZhanParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.CUT.get(), CutParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.BLADERUSH.get(), BladerushParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.SHA.get(), ShaParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.FLAME.get(), FlameParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.BLACKHOLETEST.get(), BlackholetestParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.PAN.get(), PanParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.STARBLOCK.get(), StarblockParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.LIGHTNING.get(), LightningParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.ZHANHUGE.get(), ZhanhugeParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.NAH.get(), NahParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.ADAMANBLOCK.get(), AdamanblockParticle::provider);
        event.registerSpriteSet((ParticleType)UltimateskeletonsModParticleTypes.WITHIRENIUMENERGYFIRE.get(), WithireniumenergyfireParticle::provider);
    }
}

