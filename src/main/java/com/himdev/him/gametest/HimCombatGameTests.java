package com.himdev.him.gametest;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestAssertException;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.gametest.GameTestHolder;
import net.minecraftforge.gametest.PrefixGameTestTemplate;

@GameTestHolder(HimMod.MOD_ID)
@PrefixGameTestTemplate(false)
public final class HimCombatGameTests {
    private HimCombatGameTests() {
    }

    @GameTest(template = "empty", batch = "him_combat_passive")
    public static void himDoesNotAttackNearbyHostileMobWithoutAnger(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        helper.getLevel().setDayTime(18000L);
        HimEntity him = HimEntity.spawnForTest(helper.getLevel(), helper.absolutePos(BlockPos.ZERO));
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 4, 0, 0);

        helper.runAfterDelay(40, () -> {
            helper.assertTrue(him.isAlive(), "Expected test Him to survive uniqueness registration");
            helper.assertTrue(
                    zombie.isAlive(),
                    "Expected nearby hostile mob to remain alive until it angers Him, zombieHealth=" + zombie.getHealth() + ", target=" + him.getTarget()
            );
            helper.assertTrue(
                    him.getTarget() == null,
                    "Expected Him to stay passive without anger, target=" + him.getTarget()
            );
            HimTestState.removeHimForTest(helper, him);
            zombie.remove(net.minecraft.world.entity.Entity.RemovalReason.DISCARDED);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_combat_anger_target")
    public static void himAttacksOnlyHostileMobThatAngeredHim(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        level.setDayTime(18000L);
        HimEntity him = HimEntity.spawnForTest(level, helper.absolutePos(BlockPos.ZERO));
        Zombie nearbyBystander = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);
        Zombie attacker = helper.spawn(EntityType.ZOMBIE, 6, 0, 0);

        him.hurt(level.damageSources().mobAttack(attacker), 5.0F);

        helper.runAfterDelay(40, () -> {
            helper.assertTrue(him.isAlive(), "Expected test Him to survive uniqueness registration");
            helper.assertTrue(
                    him.getTarget() == attacker || !attacker.isAlive(),
                    "Expected Him to lock onto the mob that angered him, target=" + him.getTarget() + ", attackerAlive=" + attacker.isAlive()
            );
            helper.assertTrue(
                    nearbyBystander.isAlive(),
                    "Expected uninvolved nearby hostile mob to stay alive, bystanderHealth=" + nearbyBystander.getHealth() + ", target=" + him.getTarget()
            );
            helper.assertFalse(attacker.isAlive(), "Expected anger target to be punished");
            HimTestState.removeHimForTest(helper, him);
            nearbyBystander.remove(Entity.RemovalReason.DISCARDED);
            attacker.remove(Entity.RemovalReason.DISCARDED);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_combat_external_target")
    public static void himAcceptsExternalHostileTargetAssignments(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        level.setDayTime(18000L);
        HimEntity him = HimEntity.spawnForTest(level, helper.absolutePos(BlockPos.ZERO));
        Zombie nearbyBystander = helper.spawn(EntityType.ZOMBIE, 14, 0, 0);
        Zombie attacker = helper.spawn(EntityType.ZOMBIE, 6, 0, 0);

        him.setTarget(attacker);

        helper.runAfterDelay(40, () -> {
            helper.assertTrue(him.isAlive(), "Expected test Him to survive uniqueness registration");
            helper.assertTrue(
                    him.getTarget() == attacker || !attacker.isAlive(),
                    "Expected Him to preserve the external hostile target, target=" + him.getTarget() + ", attackerAlive=" + attacker.isAlive()
            );
            helper.assertTrue(
                    nearbyBystander.isAlive(),
                    "Expected uninvolved nearby hostile mob to stay alive under external targeting, bystanderHealth=" + nearbyBystander.getHealth() + ", target=" + him.getTarget()
            );
            helper.assertFalse(attacker.isAlive(), "Expected external hostile target to be punished");
            HimTestState.removeHimForTest(helper, him);
            nearbyBystander.remove(Entity.RemovalReason.DISCARDED);
            attacker.remove(Entity.RemovalReason.DISCARDED);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_combat_external_target_non_enemy")
    public static void himAcceptsExternalNonEnemyMobTargetAssignments(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        level.setDayTime(18000L);
        HimEntity him = HimEntity.spawnForTest(level, helper.absolutePos(BlockPos.ZERO));
        Zombie nearbyBystander = helper.spawn(EntityType.ZOMBIE, 14, 0, 0);
        IronGolem directedTarget = helper.spawn(EntityType.IRON_GOLEM, 6, 0, 0);

        him.setTarget(directedTarget);

        helper.runAfterDelay(40, () -> {
            helper.assertTrue(him.isAlive(), "Expected test Him to survive uniqueness registration");
            helper.assertTrue(
                    him.getTarget() == directedTarget || !directedTarget.isAlive(),
                    "Expected Him to preserve the external non-Enemy mob target, target=" + him.getTarget() + ", directedTargetAlive=" + directedTarget.isAlive()
            );
            helper.assertTrue(
                    nearbyBystander.isAlive(),
                    "Expected uninvolved nearby hostile mob to stay alive under external non-Enemy targeting, bystanderHealth=" + nearbyBystander.getHealth() + ", target=" + him.getTarget()
            );
            helper.assertFalse(directedTarget.isAlive(), "Expected external non-Enemy mob target to be punished");
            HimTestState.removeHimForTest(helper, him);
            nearbyBystander.remove(Entity.RemovalReason.DISCARDED);
            directedTarget.remove(Entity.RemovalReason.DISCARDED);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_combat_player_safe")
    public static void himNeverTargetsPlayer(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        helper.getLevel().setDayTime(18000L);
        HimEntity him = HimEntity.spawnForTest(helper.getLevel(), helper.absolutePos(BlockPos.ZERO));
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(2, 0, 0));

        helper.runAfterDelay(80, () -> {
            helper.assertTrue(him.isAlive(), "Expected test Him to survive uniqueness registration");
            helper.assertTrue(him.getTarget() == null || !(him.getTarget() instanceof Player), "Expected Him to never target players");
            helper.assertTrue(player.isAlive(), "Expected player to remain unharmed");
            helper.assertTrue(Math.abs(player.getHealth() - player.getMaxHealth()) < 0.01F, "Expected player health to remain untouched");
            him.remove(net.minecraft.world.entity.Entity.RemovalReason.DISCARDED);
            player.remove(net.minecraft.world.entity.Entity.RemovalReason.DISCARDED);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_environment_pursuit")
    public static void himKeepsPursuitThroughAwkwardTerrain(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        level.setDayTime(18000L);
        BlockPos origin = helper.absolutePos(BlockPos.ZERO);
        HimTestState.buildAwkwardPursuitCourse(helper, origin);
        HimEntity him = HimEntity.spawnForTest(level, origin);
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);
        him.hurt(level.damageSources().mobAttack(zombie), 5.0F);

        helper.runAfterDelay(40, () -> {
            if (zombie.isAlive()) {
                throw new GameTestAssertException("Expected Him to finish pursuit through awkward terrain, zombieHealth=" + zombie.getHealth() + ", himPos=" + him.blockPosition() + ", zombiePos=" + zombie.blockPosition() + ", target=" + him.getTarget());
            }
            HimTestState.removeHimForTest(helper, him);
            zombie.remove(Entity.RemovalReason.DISCARDED);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_player_presence", timeoutTicks = 240)
    public static void himDoesNotRiseToAHighObservationPointWhenPlayerIsNear(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        level.setDayTime(6000L);
        BlockPos origin = helper.absolutePos(BlockPos.ZERO);
        HimTestState.buildObservationArena(helper, origin);
        HimEntity him = HimEntity.spawnForTest(level, origin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(3, 0, 0));
        double startY = him.getY();

        helper.startSequence()
                .thenExecuteFor(180, () -> {
                    if (isInObservationBand(him, origin, startY)) {
                        throw new GameTestAssertException("Expected Him to stay out of the raised observation area when only a nearby player is present, himPos=" + him.blockPosition() + ", y=" + him.getY());
                    }
                })
                .thenExecute(() -> {
                    if (him.getY() > startY + 1.0D) {
                        throw new GameTestAssertException("Expected Him to remain near ground level after the nearby-player idle period, y=" + him.getY() + ", startY=" + startY + ", himPos=" + him.blockPosition());
                    }

                    HimTestState.removeHimForTest(helper, him);
                    player.remove(net.minecraft.world.entity.Entity.RemovalReason.DISCARDED);
                    helper.succeed();
                });
    }

    private static double horizontalDistance(double x1, double z1, double x2, double z2) {
        double dx = x1 - x2;
        double dz = z1 - z2;
        return Math.sqrt(dx * dx + dz * dz);
    }

    private static boolean isInObservationBand(HimEntity him, BlockPos origin, double startY) {
        double originX = origin.getX() + 0.5D;
        double originZ = origin.getZ() + 0.5D;
        return him.getY() >= startY + 1.5D
                && him.getY() <= startY + 8.0D
                && horizontalDistance(him.getX(), him.getZ(), originX, originZ) <= 12.0D;
    }
}
