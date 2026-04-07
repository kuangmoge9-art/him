package com.himdev.him.item;

import com.himdev.him.entity.HimEntity;
import com.himdev.him.entity.HimRemovalAuthorizer;
import com.himdev.him.registry.HimEntityTypes;
import com.himdev.him.util.HimLog;
import com.himdev.him.world.HimLocator;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

public final class GuardianPhoneService {
    private GuardianPhoneService() {
    }

    public static boolean handleSelection(Player player, GuardianPhoneSelection selection) {
        if (player == null || !(player.level() instanceof ServerLevel serverLevel) || !hasPhoneEquipped(player)) {
            return false;
        }

        HimEntity him = HimLocator.activeHim(serverLevel);
        if (selection.isCancel()) {
            if (him != null && him.isGuardingPlayer(player)) {
                him.deactivateGuardian(player);
                player.displayClientMessage(
                        Component.translatable("item.him.guardian_phone.follow_cancelled").withStyle(ChatFormatting.YELLOW),
                        true
                );
                return true;
            }
            player.displayClientMessage(
                    Component.translatable("item.him.guardian_phone.no_follow_to_cancel").withStyle(ChatFormatting.GRAY),
                    true
            );
            return false;
        }

        him = summonOrRecall(serverLevel, player);
        if (him == null) {
            player.displayClientMessage(Component.translatable("item.him.guardian_phone.failed").withStyle(ChatFormatting.RED), true);
            return false;
        }

        him.activateGuardian(player, selection.guardianMode());
        HimLog.info(
                "him guardian_phone_used player={} action={} him={}",
                player.getScoreboardName(),
                selection.serializedName(),
                him.getUUID()
        );
        player.displayClientMessage(
                Component.translatable("item.him.guardian_phone.activated", Component.translatable(selection.translationKey()))
                        .withStyle(ChatFormatting.AQUA),
                true
        );
        return true;
    }

    public static boolean hasPhoneEquipped(Player player) {
        return player.getMainHandItem().getItem() instanceof GuardianPhoneItem
                || player.getOffhandItem().getItem() instanceof GuardianPhoneItem;
    }

    @Nullable
    public static HimEntity summonOrRecall(ServerLevel level, Player player) {
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
