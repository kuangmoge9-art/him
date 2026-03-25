/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.nbt.Tag
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.game.ClientGamePacketListener
 *  net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.block.Block
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.RenderShape
 *  net.minecraft.world.level.block.entity.BlockEntity
 *  net.minecraft.world.level.block.entity.BlockEntityType
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 *  net.minecraftforge.fml.loading.FMLEnvironment
 *  org.checkerframework.checker.nullness.qual.NonNull
 */
package firis.mobbottle.common.blockentity;

import firis.mobbottle.MobBottle;
import firis.mobbottle.common.helper.FirisEntityHelper;
import firis.mobbottle.common.helper.FirisUtil;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.checkerframework.checker.nullness.qual.NonNull;

public class MobBottleBlockEntity
extends BlockEntity {
    protected CompoundTag dataItemStackTag = new CompoundTag();
    protected Direction dataDirection = Direction.NORTH;
    protected Block dataBlock = null;
    protected float dataScale = 0.35f;
    protected float dataPositionY = 0.0f;
    @OnlyIn(value=Dist.CLIENT)
    protected Entity renderEntityCache;
    @OnlyIn(value=Dist.CLIENT)
    protected boolean isRenderEntityCache;
    @OnlyIn(value=Dist.CLIENT)
    private Map<CompoundTag, Entity> renderEntityCacheMap;

    public MobBottleBlockEntity(BlockPos p_155229_, BlockState p_155230_) {
        super((BlockEntityType)MobBottle.FirisBlockEntityType.BLOCK_ENTITY_TYPE.get(), p_155229_, p_155230_);
        if (FMLEnvironment.dist == Dist.CLIENT) {
            this.initClient();
        }
    }

    public void setMobBottleData(ItemStack stack, Direction direction) {
        this.dataItemStackTag = stack.m_41784_();
        this.dataDirection = direction;
    }

    public void setMobBottleBlock(Block block) {
        this.dataBlock = block;
        this.m_6596_();
    }

    public void setMobBottleScalePlus() {
        this.dataScale = Math.min(this.dataScale + 0.1f, 2.0f);
        this.m_6596_();
    }

    public void setMobBottleScaleMinus() {
        this.dataScale = Math.max(this.dataScale - 0.1f, 0.05f);
        this.m_6596_();
    }

    public void setMobBottlePositionPlus() {
        this.dataPositionY = Math.min(this.dataPositionY + 0.0625f, 1.0f);
        this.m_6596_();
    }

    public void setMobBottlePositionMinus() {
        this.dataPositionY = Math.max(this.dataPositionY - 0.0625f, 0.0f);
        this.m_6596_();
    }

    public void setFigureMode() {
        this.dataBlock = Blocks.f_50016_;
        this.dataScale = 1.0f;
        this.dataPositionY = 0.0f;
        this.m_6596_();
    }

    public CompoundTag getCopyMobBottleTag() {
        CompoundTag tag = new CompoundTag();
        tag.m_128359_("block", this.getDataBlockRegistryName());
        tag.m_128350_("scale", this.dataScale);
        tag.m_128350_("positiony", this.dataPositionY);
        return tag;
    }

    public void setCopyMobBottleTag(CompoundTag tag) {
        this.setDataBlockFromString(tag.m_128461_("block"));
        this.dataScale = tag.m_128457_("scale");
        this.dataPositionY = tag.m_128457_("positiony");
        this.m_6596_();
    }

    public CompoundTag m_5995_() {
        return this.serializeNBT();
    }

    public void handleUpdateTag(CompoundTag tag) {
        this.deserializeNBT(tag);
    }

    public Packet<ClientGamePacketListener> m_58483_() {
        return ClientboundBlockEntityDataPacket.m_195640_((BlockEntity)this);
    }

    protected void m_183515_(CompoundTag tag) {
        super.m_183515_(tag);
        tag.m_128365_("bottle", (Tag)this.dataItemStackTag);
        tag.m_128405_("dict", this.dataDirection.m_122411_());
        tag.m_128359_("block", this.getDataBlockRegistryName());
        tag.m_128350_("scale", this.dataScale);
        tag.m_128350_("positiony", this.dataPositionY);
    }

    public void m_142466_(CompoundTag tag) {
        super.m_142466_(tag);
        this.dataItemStackTag = tag.m_128441_("bottle") ? tag.m_128469_("bottle") : new CompoundTag();
        this.dataDirection = Direction.m_122376_((int)tag.m_128451_("dict"));
        this.setDataBlockFromString(tag.m_128461_("block"));
        this.dataScale = tag.m_128457_("scale");
        this.dataPositionY = tag.m_128457_("positiony");
    }

    protected @NonNull Block getDataBlock() {
        if (this.dataBlock == null) {
            this.dataBlock = (Block)MobBottle.FirisBlocks.MOB_BOTTLE_EMPTY.get();
        }
        return this.dataBlock;
    }

    protected void setDataBlockFromString(String blockId) {
        this.dataBlock = FirisUtil.getBlockFromId(blockId, null);
    }

    public void m_187476_(ItemStack stack) {
        if (this.dataItemStackTag.m_128441_("mob")) {
            stack.m_41751_(this.dataItemStackTag);
        }
    }

    @OnlyIn(value=Dist.CLIENT)
    protected void initClient() {
        this.renderEntityCache = null;
        this.isRenderEntityCache = false;
        this.renderEntityCacheMap = new HashMap<CompoundTag, Entity>();
    }

    @OnlyIn(value=Dist.CLIENT)
    public Entity getRenderEntity() {
        if (this.renderEntityCache == null && !this.isRenderEntityCache) {
            CompoundTag tag = this.dataItemStackTag.m_128441_("mob") ? this.dataItemStackTag.m_128469_("mob") : null;
            this.renderEntityCache = FirisEntityHelper.createEntityFromTag(tag, this.f_58857_);
            this.isRenderEntityCache = true;
        }
        return this.renderEntityCache;
    }

    @OnlyIn(value=Dist.CLIENT)
    public Direction getRenderDirection() {
        return this.dataDirection;
    }

    @OnlyIn(value=Dist.CLIENT)
    public BlockState getRenderBlockState() {
        return this.getDataBlock().m_49966_();
    }

    @OnlyIn(value=Dist.CLIENT)
    public float getRenderScale() {
        return this.dataScale;
    }

    @OnlyIn(value=Dist.CLIENT)
    public float getRenderPositionY() {
        return this.dataPositionY;
    }

    @OnlyIn(value=Dist.CLIENT)
    public void setMobBottleDataFromBEWLR(ItemStack stack) {
        this.dataItemStackTag = stack.m_41784_();
        this.dataDirection = Direction.EAST;
        if (!this.renderEntityCacheMap.containsKey(this.dataItemStackTag)) {
            this.renderEntityCache = null;
            this.isRenderEntityCache = false;
            this.renderEntityCacheMap.put(this.dataItemStackTag, this.getRenderEntity());
        }
        this.renderEntityCache = this.renderEntityCacheMap.get(this.dataItemStackTag);
        this.isRenderEntityCache = true;
        this.m_142339_((Level)Minecraft.m_91087_().f_91073_);
    }

    protected String getDataBlockRegistryName() {
        return FirisUtil.getIdFromBlock(this.getDataBlock(), null);
    }

    public RenderShape getRenderShape(BlockState p_49232_) {
        return RenderShape.INVISIBLE;
    }
}

