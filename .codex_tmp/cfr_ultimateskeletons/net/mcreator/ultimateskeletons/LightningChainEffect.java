/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.ultimateskeletons;

import java.util.Random;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class LightningChainEffect {
    public static void createLightningChainAtRandomPosition(Level world, Vec3 start, Entity player) {
        Random rand = new Random();
        double playerX = player.m_20185_();
        double playerY = player.m_20186_();
        double playerZ = player.m_20189_();
        double offsetX = rand.nextDouble() * 40.0 - 5.0;
        double offsetY = rand.nextDouble() * 10.0 - 1.5;
        double offsetZ = rand.nextDouble() * 40.0 - 5.0;
        Vec3 randomEndPos = new Vec3(playerX + offsetX, playerY + offsetY, playerZ + offsetZ);
        LightningChainEffect.createLightningChain(world, start, randomEndPos);
    }

    public static void createLightningChain(Level world, Vec3 start, Vec3 end) {
        Vec3 direction = end.m_82546_(start).m_82541_();
        double distance = start.m_82554_(end);
        int numParticles = 800;
        for (int i = 0; i < numParticles; ++i) {
            double progress = (double)i / (double)(numParticles - 1);
            double maxCurveAngle = Math.toRadians(60.0);
            double curveAmount = Math.sin(progress * Math.PI * 2.0) * maxCurveAngle;
            double offsetX = Math.sin(curveAmount);
            double offsetY = Math.cos(curveAmount);
            double randomOffsetX = (Math.random() - 0.5) * 0.6;
            double randomOffsetY = (Math.random() - 0.5) * 0.4;
            double randomOffsetZ = (Math.random() - 0.5) * 0.6;
            Vec3 particlePos = start.m_82549_(direction.m_82490_(progress * distance));
            particlePos = particlePos.m_82549_(new Vec3(offsetX + randomOffsetX, offsetY + randomOffsetY, randomOffsetZ));
            world.m_7106_((ParticleOptions)UltimateskeletonsModParticleTypes.STAR.get(), particlePos.f_82479_, particlePos.f_82480_, particlePos.f_82481_, 0.0, 0.0, 0.0);
        }
    }
}

