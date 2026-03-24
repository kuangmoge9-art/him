/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;

public class TestatkProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.ENERGYBLOCK.get()), x, y, z, Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)0.0, (double)2.0), Mth.m_216263_((RandomSource)RandomSource.m_216327_(), (double)-2.0, (double)2.0));
    }
}

