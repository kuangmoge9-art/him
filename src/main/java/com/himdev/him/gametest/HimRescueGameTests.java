package com.himdev.him.gametest;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import com.himdev.him.registry.HimEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;
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
    public static void himGrabExecutesNormalHostileRescue(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        BlockPos himOrigin = helper.absolutePos(new BlockPos(-4, 0, 0));
        HimEntity him = HimEntity.spawnForTest(level, himOrigin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 0));
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);
        double rescueStartY = zombie.getY();

        player.setHealth(1.0F);
        player.hurt(level.damageSources().mobAttack(zombie), 20.0F);

        helper.runAfterDelay(6, () -> {
            helper.assertTrue(player.isAlive(), "Expected rescue to keep the player alive");
            helper.assertTrue(zombie.isAlive(), "Expected normal hostile to remain alive during the choke-hold window");
            helper.assertFalse(zombie.isInvisible(), "Expected held hostile to keep its original visible body instead of switching to a transformed render copy");
            helper.assertTrue(him.isInRescueExecution(), "Expected Him rescue execution state to activate");
            helper.assertTrue(him.isRescueExecutionVisualActive(), "Expected Him rescue execution visuals to activate");
            helper.assertTrue(him.distanceToSqr(zombie) < 4.0D, "Expected Him to teleport near the hostile target");
            helper.assertTrue(him.distanceToSqr(zombie) > 0.36D, "Expected held hostile to keep a small visible gap from Him");
            helper.assertTrue(him.getY() > rescueStartY + 0.15D, "Expected Him to lift the rescue hold upward instead of staying at ground height");
            helper.assertTrue(zombie.getY() > rescueStartY + 0.15D, "Expected held hostile to rise together with Him during the rescue hold");
            helper.assertTrue(him.getY() < rescueStartY + 2.8D, "Expected rescue ascent to stay low and not fly too high");
            helper.assertTrue(Math.abs(him.getY() - zombie.getY()) < 0.45D, "Expected Him and the held hostile to keep nearly the same hover altitude");
            helper.assertTrue(Math.abs(him.getXRot()) < 1.0F, "Expected Him head pitch to stay stable during the rescue hold");
            helper.assertTrue(
                    Math.abs(Mth.wrapDegrees(him.getYHeadRot() - him.getYRot())) < 1.0F,
                    "Expected Him head yaw to stay locked with body and not wobble during the rescue hold"
            );
            helper.assertTrue(him.distanceToSqr(HimTestState.center(himOrigin)) > 1.0D, "Expected Him to leave the original position during rescue execution");
            Vec3 toVictim = zombie.position().subtract(him.position());
            Vec3 horizontalToVictim = new Vec3(toVictim.x, 0.0D, toVictim.z).normalize();
            Vec3 himForward = Vec3.directionFromRotation(0.0F, him.getYRot());
            Vec3 horizontalForward = new Vec3(himForward.x, 0.0D, himForward.z).normalize();
            helper.assertTrue(
                    horizontalForward.dot(horizontalToVictim) > 0.85D,
                    "Expected Him to face the held hostile directly during the choke-hold"
            );
            Vec3 toHim = him.position().subtract(zombie.position());
            Vec3 horizontalToHim = new Vec3(toHim.x, 0.0D, toHim.z).normalize();
            Vec3 victimBodyForward = Vec3.directionFromRotation(0.0F, zombie.getYRot());
            Vec3 victimHorizontalForward = new Vec3(victimBodyForward.x, 0.0D, victimBodyForward.z).normalize();
            helper.assertTrue(
                    victimHorizontalForward.dot(horizontalToHim) > 0.85D,
                    "Expected held hostile body to face Him during the choke-hold"
            );
            Vec3 eyeToHim = him.getEyePosition().subtract(zombie.getEyePosition()).normalize();
            helper.assertTrue(
                    zombie.getLookAngle().normalize().dot(eyeToHim) > 0.90D,
                    "Expected held hostile eyes to lock onto Him during the choke-hold"
            );
        });

        helper.runAfterDelay(24, () -> {
            helper.assertFalse(zombie.isAlive(), "Expected rescue execution to kill the held hostile after the hold window");
            helper.assertFalse(him.isInRescueExecution(), "Expected rescue execution state to clear after execution");
            helper.assertFalse(him.isRescueExecutionVisualActive(), "Expected rescue execution visuals to clear after execution");
            helper.assertTrue(him.distanceToSqr(HimTestState.center(himOrigin)) < 1.0D, "Expected Him to return to the original position after execution");
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
    public static void himClearsRescueStateWhenHeldVictimDisappears(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        BlockPos himOrigin = helper.absolutePos(new BlockPos(-4, 0, 0));
        HimEntity him = HimEntity.spawnForTest(level, himOrigin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 0));
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);

        player.setHealth(1.0F);
        player.hurt(level.damageSources().mobAttack(zombie), 20.0F);

        helper.runAfterDelay(6, () -> {
            helper.assertTrue(him.isInRescueExecution(), "Expected rescue execution to start before victim loss");
            zombie.remove(Entity.RemovalReason.DISCARDED);
        });

        helper.runAfterDelay(12, () -> {
            helper.assertFalse(him.isInRescueExecution(), "Expected rescue execution state to clear when held victim disappears");
            helper.assertFalse(him.isRescueExecutionVisualActive(), "Expected rescue execution visuals to clear when held victim disappears");
            helper.assertTrue(him.distanceToSqr(HimTestState.center(himOrigin)) < 1.0D, "Expected Him to return to the original position after victim loss");
            HimTestState.removeHimForTest(helper, him);
            HimTestState.cleanupEntity(player);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_rescue_execution_orientation", timeoutTicks = 240)
    public static void himForcesHeldHostileToFaceHim(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        BlockPos himOrigin = helper.absolutePos(new BlockPos(-4, 0, 0));
        HimEntity him = HimEntity.spawnForTest(level, himOrigin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 0));
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);

        zombie.setNoAi(true);
        zombie.setYRot(180.0F);
        zombie.setXRot(20.0F);

        player.setHealth(1.0F);
        player.hurt(level.damageSources().mobAttack(zombie), 20.0F);

        helper.runAfterDelay(6, () -> {
            helper.assertTrue(him.isInRescueExecution(), "Expected rescue execution to be active in orientation lock test");
            Vec3 toHim = him.position().subtract(zombie.position());
            Vec3 horizontalToHim = new Vec3(toHim.x, 0.0D, toHim.z).normalize();
            Vec3 victimBodyForward = Vec3.directionFromRotation(0.0F, zombie.getYRot());
            Vec3 victimHorizontalForward = new Vec3(victimBodyForward.x, 0.0D, victimBodyForward.z).normalize();
            helper.assertTrue(
                    victimHorizontalForward.dot(horizontalToHim) > 0.90D,
                    "Expected held hostile body to face Him even when victim AI is disabled"
            );
            Vec3 eyeToHim = him.getEyePosition().subtract(zombie.getEyePosition()).normalize();
            helper.assertTrue(
                    zombie.getLookAngle().normalize().dot(eyeToHim) > 0.93D,
                    "Expected held hostile eyes to lock onto Him even when victim AI is disabled"
            );
        });

        helper.runAfterDelay(24, () -> {
            helper.assertFalse(zombie.isAlive(), "Expected orientation lock test victim to be executed");
            HimTestState.removeHimForTest(helper, him);
            HimTestState.cleanupEntity(player);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_rescue_execution_reentry", timeoutTicks = 300)
    public static void himHandlesBackToBackRescuesSafely(GameTestHelper helper) {
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
        helper.runAfterDelay(4, () -> secondPlayer.hurt(level.damageSources().mobAttack(secondZombie), 20.0F));

        helper.runAfterDelay(40, () -> {
            helper.assertFalse(firstZombie.isAlive(), "Expected the first rescue victim to die");
            helper.assertFalse(secondZombie.isAlive(), "Expected the second rescue path to stay lethal even during active grab");
            helper.assertTrue(firstPlayer.isAlive() && secondPlayer.isAlive(), "Expected both rescues to succeed");
            helper.assertFalse(him.isInRescueExecution(), "Expected rescue execution state to clear after back-to-back rescues");
            helper.assertFalse(him.isRescueExecutionVisualActive(), "Expected rescue execution visuals to clear after back-to-back rescues");
            helper.assertTrue(him.distanceToSqr(HimTestState.center(himOrigin)) < 1.0D, "Expected Him to remain at the original position after back-to-back rescues");
            HimTestState.removeHimForTest(helper, him);
            HimTestState.cleanupEntity(firstPlayer);
            HimTestState.cleanupEntity(secondPlayer);
            helper.succeed();
        });
    }
}
