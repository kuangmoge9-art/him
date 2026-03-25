/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.BlockPos
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.RenderShape
 *  net.minecraft.world.level.block.SoundType
 *  net.minecraft.world.level.block.state.BlockBehaviour
 *  net.minecraft.world.level.block.state.BlockBehaviour$Properties
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.shapes.CollisionContext
 *  net.minecraft.world.phys.shapes.Shapes
 *  net.minecraft.world.phys.shapes.VoxelShape
 */
package firis.mobbottle.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MobBottleEmptyBlock
extends Block {
    protected static final VoxelShape VS_MOB_BOTTLE_BLOCK = Shapes.m_83064_((AABB)new AABB(0.125, 0.0, 0.125, 0.875, 1.0, 0.875));

    public MobBottleEmptyBlock() {
        super(BlockBehaviour.Properties.m_60926_((BlockBehaviour)Blocks.f_50039_).m_60918_(SoundType.f_56744_));
    }

    public VoxelShape m_5940_(BlockState p_48816_, BlockGetter p_48817_, BlockPos p_48818_, CollisionContext p_48819_) {
        return VS_MOB_BOTTLE_BLOCK;
    }

    public float m_7749_(BlockState p_48731_, BlockGetter p_48732_, BlockPos p_48733_) {
        return 1.0f;
    }

    public boolean m_7420_(BlockState p_48740_, BlockGetter p_48741_, BlockPos p_48742_) {
        return true;
    }

    public VoxelShape m_5909_(BlockState p_48735_, BlockGetter p_48736_, BlockPos p_48737_, CollisionContext p_48738_) {
        return Shapes.m_83040_();
    }

    public RenderShape m_7514_(BlockState p_49232_) {
        return RenderShape.MODEL;
    }
}

