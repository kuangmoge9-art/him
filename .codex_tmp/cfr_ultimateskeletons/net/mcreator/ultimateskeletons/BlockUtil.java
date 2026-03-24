/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.BlockPos$MutableBlockPos
 *  net.minecraft.core.Vec3i
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.item.FallingBlockEntity
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.Explosion
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.state.BlockState
 */
package net.mcreator.ultimateskeletons;

import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Vec3i;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class BlockUtil {
    public static void destroySphericalArea(Level level, BlockPos center, int radius) {
        BlockPos.MutableBlockPos currentPos = new BlockPos.MutableBlockPos();
        int minX = center.m_123341_() - radius;
        int maxX = center.m_123341_() + radius;
        int minY = Mth.m_14045_((int)(center.m_123342_() - radius), (int)level.m_141937_(), (int)level.m_151558_());
        int maxY = Mth.m_14045_((int)(center.m_123342_() + radius), (int)level.m_141937_(), (int)level.m_151558_());
        int minZ = center.m_123343_() - radius;
        int maxZ = center.m_123343_() + radius;
        for (int x = minX; x <= maxX; ++x) {
            for (int z = minZ; z <= maxZ; ++z) {
                for (int y = maxY; y >= minY; --y) {
                    BlockState state;
                    currentPos.m_122178_(x, y, z);
                    double distSq = currentPos.m_123331_((Vec3i)center);
                    double radiusSq = radius * radius;
                    if (!(distSq <= radiusSq) || (state = level.m_8055_((BlockPos)currentPos)).m_60795_()) continue;
                    FallingBlockEntity.m_201971_((Level)level, (BlockPos)BlockPos.m_274561_((double)currentPos.m_123341_(), (double)currentPos.m_123342_(), (double)currentPos.m_123343_()), (BlockState)state);
                }
            }
        }
    }

    public static void destroySphericalArea0(Level level, BlockPos center, int radius) {
        Explosion dummyExplosion = new Explosion(level, null, (double)center.m_123341_(), (double)center.m_123342_(), (double)center.m_123343_(), 10.0f, List.of());
        BlockPos.MutableBlockPos currentPos = new BlockPos.MutableBlockPos();
        int minBuildHeight = level.m_6042_().f_156647_();
        int maxBuildHeight = level.m_6042_().f_156648_() + minBuildHeight;
        int minX = center.m_123341_() - radius;
        int maxX = center.m_123341_() + radius;
        int minY = Mth.m_14045_((int)(center.m_123342_() - radius), (int)minBuildHeight, (int)maxBuildHeight);
        int maxY = Mth.m_14045_((int)(center.m_123342_() + radius), (int)minBuildHeight, (int)maxBuildHeight);
        int minZ = center.m_123343_() - radius;
        int maxZ = center.m_123343_() + radius;
        for (int x = minX; x <= maxX; ++x) {
            for (int z = minZ; z <= maxZ; ++z) {
                for (int y = maxY; y >= minY; --y) {
                    BlockState state;
                    currentPos.m_122178_(x, y, z);
                    if (!(currentPos.m_123331_((Vec3i)center) <= (double)(radius * radius)) || (state = level.m_8055_((BlockPos)currentPos)).m_60795_() || !(state.m_60800_((BlockGetter)level, (BlockPos)currentPos) >= 0.0f)) continue;
                    level.m_7731_((BlockPos)currentPos, Blocks.f_50016_.m_49966_(), 3);
                }
            }
        }
    }
}

