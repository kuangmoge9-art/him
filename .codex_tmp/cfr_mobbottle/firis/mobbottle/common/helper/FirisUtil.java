/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.core.Holder$Reference
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.level.block.Block
 *  net.minecraftforge.registries.ForgeRegistries
 */
package firis.mobbottle.common.helper;

import java.util.Optional;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public class FirisUtil {
    public static Block getBlockFromId(String blockId, Block defBlock) {
        Block block = defBlock;
        ResourceKey referenceKey = ResourceKey.m_135785_((ResourceKey)Registries.f_256747_, (ResourceLocation)new ResourceLocation(blockId));
        Optional holderBlock = ForgeRegistries.BLOCKS.getDelegate(referenceKey);
        if (!holderBlock.isEmpty()) {
            block = (Block)((Holder.Reference)holderBlock.get()).get();
        }
        return block;
    }

    public static String getIdFromBlock(Block block, String defBlockId) {
        String blockId = defBlockId;
        Optional holderBlock = ForgeRegistries.BLOCKS.getDelegate((Object)block);
        if (!holderBlock.isEmpty()) {
            ResourceLocation rl = ((Holder.Reference)holderBlock.get()).m_205785_().m_135782_();
            blockId = rl.toString();
        }
        return blockId;
    }

    public static String getIdFromItem(Item item, String defItemId) {
        String itemId = defItemId;
        Optional holderItem = ForgeRegistries.ITEMS.getDelegate((Object)item);
        if (!holderItem.isEmpty()) {
            ResourceLocation rl = ((Holder.Reference)holderItem.get()).m_205785_().m_135782_();
            itemId = rl.toString();
        }
        return itemId;
    }
}

