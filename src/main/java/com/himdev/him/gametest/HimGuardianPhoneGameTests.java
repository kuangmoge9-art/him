package com.himdev.him.gametest;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import com.himdev.him.entity.HimGuardianMode;
import com.himdev.him.item.GuardianPhoneAutoEquipController;
import com.himdev.him.item.GuardianPhoneItem;
import com.himdev.him.registry.HimItems;
import com.himdev.him.world.HimLocator;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestAssertException;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.gametest.GameTestHolder;
import net.minecraftforge.gametest.PrefixGameTestTemplate;

@GameTestHolder(HimMod.MOD_ID)
@PrefixGameTestTemplate(false)
public final class HimGuardianPhoneGameTests {
    private HimGuardianPhoneGameTests() {
    }

    @GameTest(template = "empty", batch = "him_guardian_phone_autoequip")
    public static void guardianPhoneAutoAppearsInMainHand(GameTestHelper helper) {
        Player player = TestPlayers.spawnSurvivalPlayer(helper, BlockPos.ZERO);
        player.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack(Items.STONE));

        GuardianPhoneAutoEquipController.ensurePhoneInMainHand(player);

        helper.runAfterDelay(1, () -> {
            ItemStack mainHand = player.getMainHandItem();
            if (!mainHand.is(HimItems.GUARDIAN_PHONE.get())) {
                throw new GameTestAssertException("Expected phone to auto-equip into the player's main hand, found=" + mainHand);
            }
            if (countStacks(player, HimItems.GUARDIAN_PHONE.get()) != 1) {
                throw new GameTestAssertException("Expected exactly one phone after auto-equip");
            }
            if (countStacks(player, Items.STONE) != 1) {
                throw new GameTestAssertException("Expected displaced main-hand item to remain in the player's inventory");
            }

            HimTestState.cleanupEntity(player);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_guardian_phone_follow", timeoutTicks = 160)
    public static void guardianPhoneSummonsPersistentFollower(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        Player player = TestPlayers.spawnSurvivalPlayer(helper, BlockPos.ZERO);
        ItemStack phone = new ItemStack(HimItems.GUARDIAN_PHONE.get());
        player.setItemInHand(InteractionHand.MAIN_HAND, phone);

        phone.getItem().use(level, player, InteractionHand.MAIN_HAND);

        helper.runAfterDelay(2, () -> {
            HimEntity him = HimLocator.activeHim(level);
            if (him == null || !him.isAlive()) {
                throw new GameTestAssertException("Expected guardian phone to summon Him");
            }
            if (!him.isGuardingPlayer(player)) {
                throw new GameTestAssertException("Expected summoned Him to bind to the phone owner");
            }

            player.moveTo(10.5D, player.getY(), 0.5D, 0.0F, 0.0F);
        });

        helper.runAfterDelay(16, () -> {
            HimEntity him = HimLocator.activeHim(level);
            if (him == null || him.isRemoved()) {
                throw new GameTestAssertException("Expected summoned Him to stay active in permanent mode");
            }
            if (him.distanceToSqr(player) > 16.0D) {
                throw new GameTestAssertException("Expected Him to follow the guarded player, himPos=" + him.position() + ", playerPos=" + player.position());
            }

            HimTestState.removeHimForTest(helper, him);
            HimTestState.cleanupEntity(player);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_guardian_phone_protect", timeoutTicks = 160)
    public static void guardianPhoneMakesHimPunishPlayerAttacker(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        Player player = TestPlayers.spawnSurvivalPlayer(helper, BlockPos.ZERO);
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);
        ItemStack phone = new ItemStack(HimItems.GUARDIAN_PHONE.get());
        player.setItemInHand(InteractionHand.MAIN_HAND, phone);

        phone.getItem().use(level, player, InteractionHand.MAIN_HAND);
        helper.runAfterDelay(2, () -> player.hurt(level.damageSources().mobAttack(zombie), 1.0F));

        helper.runAfterDelay(24, () -> {
            HimEntity him = HimLocator.activeHim(level);
            if (him == null || him.isRemoved()) {
                throw new GameTestAssertException("Expected Him to remain present while protecting the player");
            }
            if (!player.isAlive()) {
                throw new GameTestAssertException("Expected guarded player to survive the protection test");
            }
            if (zombie.isAlive()) {
                throw new GameTestAssertException("Expected Him to punish the mob that hurt the guarded player");
            }

            HimTestState.removeHimForTest(helper, him);
            HimTestState.cleanupEntity(player);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_guardian_phone_timed", timeoutTicks = 160)
    public static void guardianPhoneTimedModeLeavesAfterDurationExpires(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        Player player = TestPlayers.spawnSurvivalPlayer(helper, BlockPos.ZERO);
        ItemStack phone = new ItemStack(HimItems.GUARDIAN_PHONE.get());
        GuardianPhoneItem.setMode(phone, HimGuardianMode.TIMED_FOLLOW);
        player.setItemInHand(InteractionHand.MAIN_HAND, phone);

        phone.getItem().use(level, player, InteractionHand.MAIN_HAND);

        helper.runAfterDelay(2, () -> {
            HimEntity him = HimLocator.activeHim(level);
            if (him == null || him.guardianMode() != HimGuardianMode.TIMED_FOLLOW) {
                throw new GameTestAssertException("Expected guardian phone timed mode to summon a timed guardian");
            }
            him.activateGuardian(player, HimGuardianMode.TIMED_FOLLOW, 5);
        });

        helper.runAfterDelay(12, () -> {
            HimEntity him = HimLocator.activeHim(level);
            if (him != null && !him.isRemoved()) {
                throw new GameTestAssertException("Expected timed guardian mode to make Him leave once the timer expired");
            }

            HimTestState.cleanupEntity(player);
            helper.succeed();
        });
    }

    private static int countStacks(Player player, net.minecraft.world.item.Item item) {
        int count = 0;
        for (int slot = 0; slot < player.getInventory().getContainerSize(); slot++) {
            if (player.getInventory().getItem(slot).is(item)) {
                count++;
            }
        }
        return count;
    }
}
