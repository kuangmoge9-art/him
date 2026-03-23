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
import net.minecraft.util.Mth;
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

    @GameTest(template = "empty", batch = "him_observation_calm", timeoutTicks = 240)
    public static void himRisesToAHighLocalObservationPointWhenPlayerIsNear(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        level.setDayTime(6000L);
        BlockPos origin = helper.absolutePos(BlockPos.ZERO);
        HimTestState.buildObservationArena(helper, origin);
        HimEntity him = HimEntity.spawnForTest(level, origin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(3, 0, 0));
        double startY = him.getY();
        final boolean[] observed = {false};
        final double[] observedX = {0.0D};
        final double[] observedY = {0.0D};
        final double[] observedZ = {0.0D};
        final float[] observedYaw = {0.0F};

        helper.startSequence()
                .thenExecuteFor(180, () -> {
                    if (observed[0]) {
                        return;
                    }
                    if (!isInObservationBand(him, origin, startY)) {
                        return;
                    }

                    observed[0] = true;
                    observedX[0] = him.getX();
                    observedY[0] = him.getY();
                    observedZ[0] = him.getZ();
                    observedYaw[0] = him.getYRot();
                })
                .thenExecute(() -> {
                    if (!observed[0]) {
                        throw new GameTestAssertException("Expected Him to enter a local observation area within 180 ticks, himPos=" + him.blockPosition() + ", y=" + him.getY());
                    }

                    double playerDistance = horizontalDistance(observedX[0], observedZ[0], player.getX(), player.getZ());
                    double facingPlayer = yawDeltaToTarget(him, player);
                    if (observedY[0] < startY + 1.5D || observedY[0] > startY + 8.0D) {
                        throw new GameTestAssertException("Expected Him to rise into a local observation area, y=" + observedY[0] + ", startY=" + startY + ", himPos=" + him.blockPosition());
                    }
                    if (playerDistance > 10.0D) {
                        throw new GameTestAssertException("Expected Him to stay near the nearby player, distance=" + playerDistance + ", himPos=" + him.blockPosition() + ", playerPos=" + player.blockPosition());
                    }
                    if (facingPlayer > 60.0D) {
                        throw new GameTestAssertException("Expected Him to keep roughly facing the nearby player while observing, yawDelta=" + facingPlayer + ", himYaw=" + observedYaw[0] + ", playerPos=" + player.blockPosition());
                    }

                    HimTestState.removeHimForTest(helper, him);
                    player.remove(Entity.RemovalReason.DISCARDED);
                    helper.succeed();
                });
    }

    @GameTest(template = "empty", batch = "him_observation_priority")
    public static void himNeverStartsObservationWhileHostileIsAvailable(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        level.setDayTime(6000L);
        BlockPos origin = helper.absolutePos(BlockPos.ZERO);
        HimTestState.buildObservationArena(helper, origin);
        HimEntity him = HimEntity.spawnForTest(level, origin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(3, 0, 0));
        double startY = him.getY();
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 5, 0, 0);

        helper.startSequence()
                .thenExecuteFor(80, () -> {
                    if (!zombie.isAlive()) {
                        return;
                    }
                    if (isInObservationBand(him, origin, startY)) {
                        throw new GameTestAssertException("Expected Him to stay out of the observation area while a hostile mob is available, himPos=" + him.blockPosition() + ", zombieAlive=" + zombie.isAlive() + ", zombiePos=" + zombie.blockPosition());
                    }
                })
                .thenExecute(() -> {
                    HimTestState.removeHimForTest(helper, him);
                    player.remove(Entity.RemovalReason.DISCARDED);
                    zombie.remove(Entity.RemovalReason.DISCARDED);
                    helper.succeed();
                });
    }

    @GameTest(template = "empty", batch = "him_observation_stability", timeoutTicks = 240)
    public static void himKeepsAStableObservationPost(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        level.setDayTime(6000L);
        BlockPos origin = helper.absolutePos(BlockPos.ZERO);
        HimTestState.buildObservationArena(helper, origin);
        HimEntity him = HimEntity.spawnForTest(level, origin);
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(3, 0, 0));
        double spawnY = him.getY();
        final boolean[] observing = {false};
        final double[] baselineX = {0.0D};
        final double[] baselineY = {0.0D};
        final double[] baselineZ = {0.0D};
        final float[] baselineYaw = {0.0F};
        final Set<BlockPos> visitedObservationPoints = new HashSet<>();
        final double[] minY = {Double.POSITIVE_INFINITY};
        final double[] maxY = {Double.NEGATIVE_INFINITY};
        final double[] maxHorizontalDrift = {0.0D};
        final double[] maxYawDelta = {0.0D};
        final int[] samples = {0};

        helper.startSequence()
                .thenExecuteFor(180, () -> {
                    if (!observing[0]) {
                        if (!isInObservationBand(him, origin, spawnY)) {
                            return;
                        }

                        observing[0] = true;
                        baselineX[0] = him.getX();
                        baselineY[0] = him.getY();
                        baselineZ[0] = him.getZ();
                        baselineYaw[0] = him.getYRot();
                    }

                    samples[0]++;
                    visitedObservationPoints.add(him.blockPosition());
                    minY[0] = Math.min(minY[0], him.getY());
                    maxY[0] = Math.max(maxY[0], him.getY());
                    maxHorizontalDrift[0] = Math.max(maxHorizontalDrift[0], horizontalDistance(baselineX[0], baselineZ[0], him.getX(), him.getZ()));
                    maxYawDelta[0] = Math.max(maxYawDelta[0], Math.abs(Mth.wrapDegrees(him.getYRot() - baselineYaw[0])));
                })
                .thenExecuteFor(40, () -> {
                    if (!observing[0]) {
                        return;
                    }

                    samples[0]++;
                    visitedObservationPoints.add(him.blockPosition());
                    minY[0] = Math.min(minY[0], him.getY());
                    maxY[0] = Math.max(maxY[0], him.getY());
                    maxHorizontalDrift[0] = Math.max(maxHorizontalDrift[0], horizontalDistance(baselineX[0], baselineZ[0], him.getX(), him.getZ()));
                    maxYawDelta[0] = Math.max(maxYawDelta[0], Math.abs(Mth.wrapDegrees(him.getYRot() - baselineYaw[0])));
                })
                .thenExecute(() -> {
                    if (!observing[0]) {
                        throw new GameTestAssertException("Expected Him to enter a local observation area within 220 ticks, himPos=" + him.blockPosition() + ", y=" + him.getY());
                    }
                    if (samples[0] < 5) {
                        throw new GameTestAssertException("Expected Him to stay in the observation area long enough to sample stability, samples=" + samples[0] + ", himPos=" + him.blockPosition());
                    }
                    if (visitedObservationPoints.size() > 3) {
                        throw new GameTestAssertException("Expected Him to hold a local observation area without bouncing around, visited=" + visitedObservationPoints);
                    }
                    if (maxHorizontalDrift[0] > 1.5D) {
                        throw new GameTestAssertException("Expected Him to stay roughly in place while observing, drift=" + maxHorizontalDrift[0] + ", baseline=" + baselineX[0] + "," + baselineY[0] + "," + baselineZ[0] + ", current=" + him.blockPosition());
                    }
                    if (maxY[0] - minY[0] > 0.75D) {
                        throw new GameTestAssertException("Expected Him to stay mostly level while observing, minY=" + minY[0] + ", maxY=" + maxY[0]);
                    }
                    if (maxYawDelta[0] > 65.0D) {
                        throw new GameTestAssertException("Expected Him to keep a mostly steady look direction while observing, yawDelta=" + maxYawDelta[0]);
                    }

                    HimTestState.removeHimForTest(helper, him);
                    player.remove(Entity.RemovalReason.DISCARDED);
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

    private static double yawDeltaToTarget(HimEntity him, Player target) {
        double dx = target.getX() - him.getX();
        double dz = target.getZ() - him.getZ();
        float targetYaw = (float) Math.toDegrees(Math.atan2(-dx, dz));
        return Math.abs(Mth.wrapDegrees(him.getYRot() - targetYaw));
    }
}
