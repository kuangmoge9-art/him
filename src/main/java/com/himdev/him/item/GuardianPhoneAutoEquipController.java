package com.himdev.him.item;

import com.himdev.him.HimMod;
import com.himdev.him.registry.HimItems;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = HimMod.MOD_ID)
public final class GuardianPhoneAutoEquipController {
    private GuardianPhoneAutoEquipController() {
    }

    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        ensurePhoneInMainHand(event.getEntity());
    }

    @SubscribeEvent
    public static void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event) {
        ensurePhoneInMainHand(event.getEntity());
    }

    public static void ensurePhoneInMainHand(Player player) {
        if (player == null || !(player.level() instanceof ServerLevel)) {
            return;
        }

        Inventory inventory = player.getInventory();
        int selectedSlot = inventory.selected;
        ItemStack mainHand = inventory.getItem(selectedSlot);
        if (mainHand.is(HimItems.GUARDIAN_PHONE.get())) {
            return;
        }

        int phoneSlot = findPhoneSlot(inventory);
        if (phoneSlot >= 0) {
            ItemStack phone = inventory.removeItemNoUpdate(phoneSlot);
            ItemStack displaced = mainHand.copy();
            inventory.setItem(selectedSlot, phone);
            if (!displaced.isEmpty()) {
                inventory.setItem(phoneSlot, displaced);
            }
            player.setItemInHand(InteractionHand.MAIN_HAND, inventory.getItem(selectedSlot));
            return;
        }

        ItemStack displaced = mainHand.copy();
        inventory.setItem(selectedSlot, new ItemStack(HimItems.GUARDIAN_PHONE.get()));
        if (!displaced.isEmpty()) {
            inventory.placeItemBackInInventory(displaced);
        }
        player.setItemInHand(InteractionHand.MAIN_HAND, inventory.getItem(selectedSlot));
    }

    private static int findPhoneSlot(Inventory inventory) {
        for (int slot = 0; slot < inventory.getContainerSize(); slot++) {
            if (inventory.getItem(slot).is(HimItems.GUARDIAN_PHONE.get())) {
                return slot;
            }
        }
        return -1;
    }
}
