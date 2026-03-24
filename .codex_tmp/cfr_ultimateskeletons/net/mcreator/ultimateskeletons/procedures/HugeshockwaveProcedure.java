/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.level.LevelAccessor;

public class HugeshockwaveProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        double theta = 0.0;
        if (theta >= 360.0) {
            theta = 0.0;
        }
        if (theta == 0.0) {
            for (int index0 = 0; index0 < 360; ++index0) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.STARBLOCK.get()), x + 1.0 * Math.cos(theta), y + 1.0, z + 1.0 * Math.sin(theta), 8.0 * Math.cos(theta), 0.0, 8.0 * Math.sin(theta));
                theta += 1.0;
            }
        }
    }
}

