package com.himdev.him.item;

import com.himdev.him.entity.HimEntity;
import com.himdev.him.entity.HimGuardianMode;
import com.himdev.him.entity.HimRemovalAuthorizer;
import com.himdev.him.registry.HimEntityTypes;
import com.himdev.him.util.HimLog;
import com.himdev.him.world.HimLocator;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public final class GuardianPhoneItem extends Item {
    private static final String MODE_TAG = "GuardianMode";

    public GuardianPhoneItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (player.isShiftKeyDown()) {
            if (!level.isClientSide()) {
                HimGuardianMode nextMode = modeOf(stack).nextSelectable();
                setMode(stack, nextMode);
                player.displayClientMessage(
                        Component.translatable("item.him.guardian_phone.mode_switched", modeComponent(nextMode)).withStyle(ChatFormatting.GOLD),
                        true
                );
            }
            return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
        }

        if (!(level instanceof ServerLevel serverLevel)) {
            return InteractionResultHolder.sidedSuccess(stack, true);
        }

        HimGuardianMode mode = modeOf(stack);
        HimEntity him = summonOrRecall(serverLevel, player);
        if (him == null) {
            player.displayClientMessage(Component.translatable("item.him.guardian_phone.failed").withStyle(ChatFormatting.RED), true);
            return InteractionResultHolder.fail(stack);
        }

        him.activateGuardian(player, mode);
        HimLog.info("him guardian_phone_used player={} mode={} him={}", player.getScoreboardName(), mode.serializedName(), him.getUUID());
        player.displayClientMessage(
                Component.translatable("item.him.guardian_phone.activated", modeComponent(mode)).withStyle(ChatFormatting.AQUA),
                true
        );
        return InteractionResultHolder.sidedSuccess(stack, false);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.translatable("item.him.guardian_phone.tooltip.use").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable("item.him.guardian_phone.tooltip.switch").withStyle(ChatFormatting.DARK_GRAY));
        tooltip.add(
                Component.translatable("item.him.guardian_phone.tooltip.mode", modeComponent(modeOf(stack)))
                        .withStyle(ChatFormatting.GOLD)
        );
    }

    public static HimGuardianMode modeOf(ItemStack stack) {
        if (!stack.hasTag() || !stack.getTag().contains(MODE_TAG)) {
            return HimGuardianMode.FOLLOW;
        }
        return HimGuardianMode.fromSerializedName(stack.getTag().getString(MODE_TAG));
    }

    public static void setMode(ItemStack stack, HimGuardianMode mode) {
        stack.getOrCreateTag().putString(MODE_TAG, mode.serializedName());
    }

    private static Component modeComponent(HimGuardianMode mode) {
        return Component.translatable("item.him.guardian_phone.mode." + mode.serializedName());
    }

    @Nullable
    private static HimEntity summonOrRecall(ServerLevel level, Player player) {
        HimEntity existing = HimLocator.activeHim(level);
        if (existing != null && existing.level() != level) {
            HimRemovalAuthorizer.authorize(existing.getUUID());
            existing.remove(Entity.RemovalReason.DISCARDED);
            existing = null;
        }

        if (existing != null && !existing.isRemoved()) {
            return existing;
        }

        HimEntity him = HimEntityTypes.HIM.get().create(level);
        if (him == null) {
            return null;
        }

        him.moveTo(player.getX(), player.getY(), player.getZ(), player.getYRot(), player.getXRot());
        if (!level.addFreshEntity(him) || him.isRemoved()) {
            return null;
        }
        return him;
    }
}
