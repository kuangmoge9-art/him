package com.himdev.him.compat;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;

public final class MobBottleCompat {
    private static final String MOB_TAG_KEY = "mob";
    private static final String MOB_NAME_TAG_KEY = "mob_name";
    private static final ResourceLocation HIM_ENTITY_ID = ResourceLocation.fromNamespaceAndPath(HimMod.MOD_ID, "him");
    private static final ResourceLocation MOB_BOTTLE_EMPTY_ITEM_ID = ResourceLocation.fromNamespaceAndPath("mobbottle", "mob_bottle_empty");

    private MobBottleCompat() {
    }

    public static boolean isHimEntity(Entity entity) {
        return entity instanceof HimEntity;
    }

    public static boolean isHimEntityTag(@Nullable CompoundTag tag) {
        if (tag == null || !tag.contains("id")) {
            return false;
        }
        return HIM_ENTITY_ID.toString().equals(tag.getString("id"));
    }

    public static boolean isFilledWithHim(ItemStack stack) {
        return stack.hasTag() && isFilledWithHimTag(stack.getTag());
    }

    public static boolean isFilledWithHimTag(@Nullable CompoundTag stackTag) {
        return stackTag != null && isHimEntityTag(stackTag.getCompound(MOB_TAG_KEY));
    }

    public static ItemStack createPurifiedEmptyBottle(ItemStack source, Item emptyBottleItem) {
        return new ItemStack(emptyBottleItem, source.getCount());
    }

    public static boolean purifyFilledBottle(@Nullable Player player, InteractionHand hand, ItemStack source) {
        Item emptyBottleItem = ForgeRegistries.ITEMS.getValue(MOB_BOTTLE_EMPTY_ITEM_ID);
        if (emptyBottleItem == null) {
            stripMobData(source);
            return false;
        }
        if (player != null) {
            player.setItemInHand(hand, createPurifiedEmptyBottle(source, emptyBottleItem));
            return true;
        }
        stripMobData(source);
        return false;
    }

    public static void stripMobData(ItemStack stack) {
        CompoundTag purifiedTag = createPurifiedBottleTag(stack.getTag());
        if (purifiedTag.isEmpty()) {
            stack.setTag(null);
            return;
        }
        stack.setTag(purifiedTag);
    }

    public static CompoundTag createPurifiedBottleTag(@Nullable CompoundTag sourceTag) {
        CompoundTag purifiedTag = sourceTag == null ? new CompoundTag() : sourceTag.copy();
        purifiedTag.remove(MOB_TAG_KEY);
        purifiedTag.remove(MOB_NAME_TAG_KEY);
        return purifiedTag;
    }
}
