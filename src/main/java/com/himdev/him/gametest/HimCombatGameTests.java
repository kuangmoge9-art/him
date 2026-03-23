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
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.gametest.GameTestHolder;
import net.minecraftforge.gametest.PrefixGameTestTemplate;

import java.util.HashSet;
import java.util.Set;

@GameTestHolder(HimMod.MOD_ID)
@PrefixGameTestTemplate(false)
public final class HimCombatGameTests {
    private HimCombatGameTests() {
    }

    @GameTest(template = "empty", batch = "him_combat_hostile")
    public static void himAttacksNearbyHostileMob(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        helper.getLevel().setDayTime(18000L);
        HimEntity him = HimEntity.spawnForTest(helper.getLevel(), helper.absolutePos(BlockPos.ZERO));
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 4, 0, 0);

        helper.runAfterDelay(20, () -> {
            helper.assertTrue(him.isAlive(), "Expected test Him to survive uniqueness registration");
            helper.assertTrue(
                    him.getTarget() == zombie || !zombie.isAlive(),
                    "Expected Him to attack the nearby hostile mob, target=" + him.getTarget() + ", zombieAlive=" + zombie.isAlive() + ", zombieHealth=" + zombie.getHealth()
            );
            him.remove(net.minecraft.world.entity.Entity.RemovalReason.DISCARDED);
            zombie.remove(net.minecraft.world.entity.Entity.RemovalReason.DISCARDED);
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

        helper.runAfterDelay(40, () -> {
            if (zombie.isAlive()) {
                throw new GameTestAssertException("Expected Him to finish pursuit through awkward terrain, zombieHealth=" + zombie.getHealth() + ", himPos=" + him.blockPosition() + ", zombiePos=" + zombie.blockPosition() + ", target=" + him.getTarget());
            }
            HimTestState.removeHimForTest(helper, him);
            zombie.remove(Entity.RemovalReason.DISCARDED);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_observation_calm")
    public static void himRisesToLocalObservationPointWhenPlayerIsNear(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        level.setDayTime(6000L);
        BlockPos origin = helper.absolutePos(BlockPos.ZERO);
        HimTestState.buildObservationArena(helper, origin);
        HimEntity him = HimEntity.spawnForTest(level, origin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(3, 0, 0));
        double startY = him.getY();

        helper.runAfterDelay(40, () -> {
            double himY = him.getY();
            double playerDistance = horizontalDistance(him.getX(), him.getZ(), player.getX(), player.getZ());
            if (himY < startY + 2.5D) {
                throw new GameTestAssertException("Expected Him to rise to a higher observation point, y=" + himY + ", startY=" + startY);
            }
            if (playerDistance > 8.0D) {
                throw new GameTestAssertException("Expected Him to stay near the nearby player, distance=" + playerDistance + ", himPos=" + him.blockPosition() + ", playerPos=" + player.blockPosition());
            }
            HimTestState.removeHimForTest(helper, him);
            player.remove(Entity.RemovalReason.DISCARDED);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_observation_priority")
    public static void himChoosesCombatOverObservationWhenHostileArrives(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        level.setDayTime(6000L);
        BlockPos origin = helper.absolutePos(BlockPos.ZERO);
        HimTestState.buildObservationArena(helper, origin);
        HimEntity him = HimEntity.spawnForTest(level, origin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(3, 0, 0));

        helper.runAfterDelay(20, () -> {
            if (him.getY() < origin.getY() + 2.5D) {
                throw new GameTestAssertException("Expected Him to reach the observation point before the hostile arrives, y=" + him.getY());
            }

            Zombie zombie = helper.spawn(EntityType.ZOMBIE, 5, 0, 0);
            helper.runAfterDelay(20, () -> {
                boolean fightingZombie = him.getTarget() == zombie || !zombie.isAlive();
                if (!fightingZombie) {
                    throw new GameTestAssertException("Expected Him to switch from observation to combat, target=" + him.getTarget() + ", zombieAlive=" + zombie.isAlive() + ", himPos=" + him.blockPosition() + ", zombiePos=" + zombie.blockPosition());
                }
                HimTestState.removeHimForTest(helper, him);
                player.remove(Entity.RemovalReason.DISCARDED);
                zombie.remove(Entity.RemovalReason.DISCARDED);
                helper.succeed();
            });
        });
    }

    @GameTest(template = "empty", batch = "him_observation_stability")
    public static void himKeepsAStableObservationPost(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        level.setDayTime(6000L);
        BlockPos origin = helper.absolutePos(BlockPos.ZERO);
        HimTestState.buildObservationArena(helper, origin);
        HimEntity him = HimEntity.spawnForTest(level, origin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(3, 0, 0));

        helper.runAfterDelay(20, () -> {
            if (him.getY() < origin.getY() + 2.5D) {
                throw new GameTestAssertException("Expected Him to reach the observation point before checking stability, y=" + him.getY());
            }

            final Set<BlockPos> visitedObservationPoints = new HashSet<>();
            final double[] minY = {Double.POSITIVE_INFINITY};
            final double[] maxY = {Double.NEGATIVE_INFINITY};

            Runnable sample = new Runnable() {
                private int samples;

                @Override
                public void run() {
                    samples++;
                    visitedObservationPoints.add(him.blockPosition());
                    minY[0] = Math.min(minY[0], him.getY());
                    maxY[0] = Math.max(maxY[0], him.getY());

                    if (samples < 4) {
                        helper.runAfterDelay(5, this);
                        return;
                    }

                    if (visitedObservationPoints.size() > 1) {
                        throw new GameTestAssertException("Expected Him to keep one observation point, visited=" + visitedObservationPoints);
                    }
                    if (maxY[0] - minY[0] > 0.35D) {
                        throw new GameTestAssertException("Expected Him to stay level while observing, minY=" + minY[0] + ", maxY=" + maxY[0]);
                    }

                    HimTestState.removeHimForTest(helper, him);
                    player.remove(Entity.RemovalReason.DISCARDED);
                    helper.succeed();
                }
            };

            helper.runAfterDelay(5, sample);
        });
    }

    private static double horizontalDistance(double x1, double z1, double x2, double z2) {
        double dx = x1 - x2;
        double dz = z1 - z2;
        return Math.sqrt(dx * dx + dz * dz);
    }
}
