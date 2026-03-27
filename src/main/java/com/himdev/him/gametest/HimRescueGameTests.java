package com.himdev.him.gametest;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import com.himdev.him.registry.HimEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.gametest.GameTestHolder;
import net.minecraftforge.gametest.PrefixGameTestTemplate;

@GameTestHolder(HimMod.MOD_ID)
@PrefixGameTestTemplate(false)
public final class HimRescueGameTests {
    private HimRescueGameTests() {
    }

    @GameTest(template = "empty", batch = "him_rescue_mob")
    public static void lethalMobDamageRescuesPlayer(GameTestHelper helper) {
        Player player = TestPlayers.spawnSurvivalPlayer(helper);
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);

        player.setHealth(1.0F);
        player.hurt(helper.getLevel().damageSources().mobAttack(zombie), 20.0F);

        helper.runAfterDelay(2, () -> {
            helper.assertTrue(player.isAlive(), "Expected player rescue to cancel death");
            helper.assertTrue(Math.abs(player.getHealth() - player.getMaxHealth()) < 0.01F, "Expected full heal after rescue");
            helper.assertTrue(player.hasEffect(HimEffects.DIVINE_PROTECTION.get()), "Expected divine protection effect");
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_rescue_environment")
    public static void lethalEnvironmentalDamageDoesNotPunishEntities(GameTestHelper helper) {
        Player player = TestPlayers.spawnSurvivalPlayer(helper);
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);

        player.setHealth(1.0F);
        player.hurt(helper.getLevel().damageSources().lava(), 20.0F);

        helper.runAfterDelay(2, () -> {
            helper.assertTrue(player.isAlive(), "Expected player to be rescued from lava");
            helper.assertTrue(zombie.isAlive(), "Expected unrelated zombie to remain alive");
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_rescue_execution_normal", timeoutTicks = 240)
    public static void himDirectlyPunishesNormalHostileRescue(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        BlockPos himOrigin = helper.absolutePos(new BlockPos(-4, 0, 0));
        HimEntity him = HimEntity.spawnForTest(level, himOrigin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 0));
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);

        player.setHealth(1.0F);
        player.hurt(level.damageSources().mobAttack(zombie), 20.0F);

        helper.runAfterDelay(6, () -> {
            helper.assertTrue(player.isAlive(), "Expected rescue to keep the player alive");
            helper.assertFalse(zombie.isAlive(), "Expected rescue punishment to directly kill normal-sized hostile targets");
            helper.assertFalse(him.isInRescueExecution(), "Expected direct punishment path to keep rescue execution disabled");
            helper.assertFalse(him.isRescueExecutionVisualActive(), "Expected direct punishment path to keep rescue visuals disabled");
            helper.assertTrue(him.distanceToSqr(HimTestState.center(himOrigin)) < 1.0D, "Expected Him to stay at the original position during direct rescue punishment");
            HimTestState.removeHimForTest(helper, him);
            HimTestState.cleanupEntity(player);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_rescue_execution_oversized")
    public static void himDirectlyPunishesOversizedHostileRescue(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        BlockPos himOrigin = helper.absolutePos(new BlockPos(-4, 0, 0));
        HimEntity him = HimEntity.spawnForTest(level, himOrigin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 0));
        Ravager ravager = helper.spawn(EntityType.RAVAGER, 2, 0, 0);

        player.setHealth(1.0F);
        player.hurt(level.damageSources().mobAttack(ravager), 40.0F);

        helper.runAfterDelay(4, () -> {
            helper.assertFalse(ravager.isAlive(), "Expected oversized hostile rescue targets to be directly punished");
            helper.assertFalse(him.isInRescueExecution(), "Expected direct punishment path to keep rescue execution disabled");
            helper.assertFalse(him.isRescueExecutionVisualActive(), "Expected direct punishment path to keep rescue visuals disabled");
            helper.assertTrue(him.distanceToSqr(HimTestState.center(himOrigin)) < 1.0D, "Expected Him to stay at the original position for oversized rescue targets");
            HimTestState.removeHimForTest(helper, him);
            HimTestState.cleanupEntity(player);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_rescue_execution_cleanup", timeoutTicks = 240)
    public static void himNeverEntersRescueExecutionDuringNormalRescuePunishment(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        BlockPos himOrigin = helper.absolutePos(new BlockPos(-4, 0, 0));
        HimEntity him = HimEntity.spawnForTest(level, himOrigin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 0));
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);

        player.setHealth(1.0F);
        player.hurt(level.damageSources().mobAttack(zombie), 20.0F);

        helper.runAfterDelay(12, () -> {
            helper.assertFalse(zombie.isAlive(), "Expected normal rescue punishment target to die without a staged hold");
            helper.assertFalse(him.isInRescueExecution(), "Expected normal rescue punishment to avoid rescue execution state");
            helper.assertFalse(him.isRescueExecutionVisualActive(), "Expected normal rescue punishment to avoid rescue execution visuals");
            helper.assertTrue(him.distanceToSqr(HimTestState.center(himOrigin)) < 1.0D, "Expected Him to stay at the original position during direct rescue punishment");
            HimTestState.removeHimForTest(helper, him);
            HimTestState.cleanupEntity(player);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_rescue_execution_reentry", timeoutTicks = 300)
    public static void himHandlesBackToBackRescuesWithDirectPunishment(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        BlockPos himOrigin = helper.absolutePos(new BlockPos(-4, 0, 0));
        HimEntity him = HimEntity.spawnForTest(level, himOrigin);
        Player firstPlayer = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 0));
        Player secondPlayer = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 4));
        Zombie firstZombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);
        Zombie secondZombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 4);

        firstPlayer.setHealth(1.0F);
        secondPlayer.setHealth(1.0F);
        firstPlayer.hurt(level.damageSources().mobAttack(firstZombie), 20.0F);
        secondPlayer.hurt(level.damageSources().mobAttack(secondZombie), 20.0F);

        helper.runAfterDelay(40, () -> {
            helper.assertFalse(firstZombie.isAlive(), "Expected the first rescue victim to die");
            helper.assertFalse(secondZombie.isAlive(), "Expected the second rescue path to stay lethal");
            helper.assertTrue(firstPlayer.isAlive() && secondPlayer.isAlive(), "Expected both rescues to succeed");
            helper.assertFalse(him.isInRescueExecution(), "Expected back-to-back rescues to avoid rescue execution state");
            helper.assertFalse(him.isRescueExecutionVisualActive(), "Expected back-to-back rescues to avoid rescue execution visuals");
            helper.assertTrue(him.distanceToSqr(HimTestState.center(himOrigin)) < 1.0D, "Expected Him to remain at the original position after back-to-back direct punishments");
            HimTestState.removeHimForTest(helper, him);
            HimTestState.cleanupEntity(firstPlayer);
            HimTestState.cleanupEntity(secondPlayer);
            helper.succeed();
        });
    }
}
