/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.nbt.ListTag
 *  net.minecraft.nbt.StringTag
 *  net.minecraft.nbt.Tag
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.item.ItemEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Items
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.block.BaseEntityBlock
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.RenderShape
 *  net.minecraft.world.level.block.SoundType
 *  net.minecraft.world.level.block.entity.BlockEntity
 *  net.minecraft.world.level.block.entity.BlockEntityType
 *  net.minecraft.world.level.block.state.BlockBehaviour
 *  net.minecraft.world.level.block.state.BlockBehaviour$Properties
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.BlockHitResult
 *  net.minecraft.world.phys.shapes.CollisionContext
 *  net.minecraft.world.phys.shapes.Shapes
 *  net.minecraft.world.phys.shapes.VoxelShape
 */
package firis.mobbottle.common.block;

import firis.mobbottle.MobBottle;
import firis.mobbottle.common.blockentity.MobBottleBlockEntity;
import firis.mobbottle.common.helper.FirisUtil;
import java.util.Optional;
import javax.annotation.Nullable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class MobBottleBlock
extends BaseEntityBlock {
    protected static final VoxelShape VS_MOB_BOTTLE_BLOCK = Shapes.m_83064_((AABB)new AABB(0.125, 0.0, 0.125, 0.875, 1.0, 0.875));

    public MobBottleBlock() {
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

    public BlockEntity m_142194_(BlockPos pos, BlockState state) {
        return new MobBottleBlockEntity(pos, state);
    }

    public void m_6402_(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity entity, ItemStack stack) {
        Optional optBlockEntity = level.m_141902_(pos, (BlockEntityType)MobBottle.FirisBlockEntityType.BLOCK_ENTITY_TYPE.get());
        if (!optBlockEntity.isEmpty()) {
            ((MobBottleBlockEntity)((Object)optBlockEntity.get())).setMobBottleData(stack, this.getHorizontalDirection(entity));
        }
    }

    public void m_5707_(Level level, BlockPos pos, BlockState state, Player player) {
        BlockEntity blockentity = level.m_7702_(pos);
        if (blockentity instanceof MobBottleBlockEntity) {
            MobBottleBlockEntity mobBottleBlockEntity = (MobBottleBlockEntity)blockentity;
            if (!level.f_46443_) {
                ItemStack itemstack = new ItemStack((ItemLike)MobBottle.FirisItems.MOB_BOTTLE.get());
                mobBottleBlockEntity.m_187476_(itemstack);
                ItemEntity itementity = new ItemEntity(level, (double)pos.m_123341_() + 0.5, (double)pos.m_123342_() + 0.5, (double)pos.m_123343_() + 0.5, itemstack);
                itementity.m_32060_();
                level.m_7967_((Entity)itementity);
            }
        }
        super.m_5707_(level, pos, state, player);
    }

    protected Direction getHorizontalDirection(@Nullable LivingEntity entity) {
        return entity == null ? Direction.NORTH : entity.m_6350_();
    }

    public InteractionResult m_6227_(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult blockHitResult) {
        BlockEntity blockentity = level.m_7702_(pos);
        if (blockentity instanceof MobBottleBlockEntity) {
            MobBottleBlockEntity mbBlockEntity = (MobBottleBlockEntity)blockentity;
            ItemStack stack = player.m_21120_(hand);
            if (stack.m_41619_()) {
                return InteractionResult.SUCCESS;
            }
            Block block = Block.m_49814_((Item)stack.m_41720_());
            String itemId = FirisUtil.getIdFromItem(stack.m_41720_(), "");
            if (block.equals(MobBottle.FirisBlocks.MOB_BOTTLE.get())) {
                mbBlockEntity.setMobBottleBlock((Block)MobBottle.FirisBlocks.MOB_BOTTLE_EMPTY.get());
            } else if (itemId.endsWith("_sword")) {
                mbBlockEntity.setMobBottleBlock(Blocks.f_50016_);
            } else if (!block.m_49966_().m_60795_()) {
                mbBlockEntity.setMobBottleBlock(block);
            } else if (itemId.endsWith("_hoe")) {
                mbBlockEntity.setMobBottleScalePlus();
            } else if (itemId.endsWith("_axe")) {
                mbBlockEntity.setMobBottleScaleMinus();
            } else if (itemId.endsWith("_pickaxe")) {
                mbBlockEntity.setMobBottlePositionPlus();
            } else if (itemId.endsWith("_shovel")) {
                mbBlockEntity.setMobBottlePositionMinus();
            } else if (itemId.endsWith("minecraft:writable_book")) {
                CompoundTag mbTag = mbBlockEntity.getCopyMobBottleTag();
                ItemStack bookStack = new ItemStack((ItemLike)Items.f_42615_);
                bookStack.m_41784_();
                bookStack.m_41700_("author", (Tag)StringTag.m_129297_((String)player.m_7755_().getString()));
                bookStack.m_41700_("filtered_title", (Tag)StringTag.m_129297_((String)"MobBottle"));
                bookStack.m_41700_("title", (Tag)StringTag.m_129297_((String)("MobBottle[" + pos.m_123344_() + "]")));
                ListTag listtag = new ListTag();
                listtag.add((Object)StringTag.m_129297_((String)mbTag.toString()));
                bookStack.m_41700_("pages", (Tag)listtag);
                bookStack.m_41700_("mobbottle", (Tag)mbTag);
                player.m_21008_(hand, bookStack);
            } else if (itemId.endsWith("minecraft:written_book")) {
                CompoundTag mbTag = stack.m_41737_("mobbottle");
                if (mbTag != null) {
                    mbBlockEntity.setCopyMobBottleTag(mbTag);
                }
            } else if (itemId.endsWith("minecraft:stick")) {
                mbBlockEntity.setFigureMode();
            }
        }
        return InteractionResult.SUCCESS;
    }

    public RenderShape m_7514_(BlockState p_49232_) {
        return RenderShape.INVISIBLE;
    }
}

