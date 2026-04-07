package com.himdev.him.gametest;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import com.himdev.him.spawn.FirstJoinHimSpawnController;
import it.unimi.dsi.fastutil.longs.LongSet;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestAssertException;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ForcedChunksSavedData;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.world.ForgeChunkManager;
import net.minecraftforge.gametest.GameTestHolder;
import net.minecraftforge.gametest.PrefixGameTestTemplate;

@GameTestHolder(HimMod.MOD_ID)
@PrefixGameTestTemplate(false)
public final class HimSpawnGameTests {
    private HimSpawnGameTests() {
    }

    @GameTest(template = "empty", batch = "him_spawn_uniqueness")
    public static void spawningSecondHimDoesNotLeaveTwoInstances(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        HimEntity.spawnForTest(level, helper.absolutePos(BlockPos.ZERO));
        HimEntity.spawnForTest(level, helper.absolutePos(new BlockPos(2, 0, 0)));

        helper.runAfterDelay(2, () -> {
            var himEntities = level.getEntitiesOfClass(HimEntity.class, new AABB(helper.absolutePos(BlockPos.ZERO)).inflate(32.0D));
            long count = himEntities.size();
            if (count != 1) {
                throw new GameTestAssertException("Expected exactly one Him entity after duplicate spawn attempt, got " + count);
            }
            himEntities.forEach(entity -> HimTestState.removeHimForTest(helper, entity));
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_spawn_invulnerability")
    public static void himIgnoresStandardDamage(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        HimEntity him = HimEntity.spawnForTest(helper.getLevel(), helper.absolutePos(BlockPos.ZERO));
        boolean hurt = him.hurt(helper.getLevel().damageSources().generic(), 1000.0F);

        if (hurt) {
            throw new GameTestAssertException("Expected Him to reject standard damage");
        }
        if (!him.isAlive()) {
            throw new GameTestAssertException("Expected Him to remain alive");
        }
        HimTestState.removeHimForTest(helper, him);
        helper.succeed();
    }

    @GameTest(template = "empty", batch = "him_spawn_first_login")
    public static void firstLoginSpawnsHimOnlyOnceBehindPlayer(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(2, 0, 2));

        FirstJoinHimSpawnController.handlePlayerLogin(player);
        FirstJoinHimSpawnController.handlePlayerLogin(player);

        helper.runAfterDelay(2, () -> {
            var himEntities = level.getEntitiesOfClass(HimEntity.class, new AABB(player.blockPosition()).inflate(16.0D));
            long count = himEntities.size();
            if (count != 1) {
                throw new GameTestAssertException("Expected exactly one first-login Him spawn, got " + count);
            }

            HimEntity him = himEntities.get(0);
            if (him.getZ() >= player.getZ()) {
                throw new GameTestAssertException("Expected Him to spawn behind the south-facing player, himZ=" + him.getZ() + ", playerZ=" + player.getZ());
            }

            HimTestState.removeHimForTest(helper, him);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_spawn_command")
    public static void himCannotBeSummonedByCommand(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        Vec3 summonPos = Vec3.atBottomCenterOf(helper.absolutePos(BlockPos.ZERO));
        int result = level.getServer().getCommands().performPrefixedCommand(
                level.getServer()
                        .createCommandSourceStack()
                        .withPermission(4)
                        .withSuppressedOutput()
                        .withLevel(level)
                        .withPosition(summonPos),
                "summon him:him ~ ~ ~"
        );

        helper.runAfterDelay(2, () -> {
            long himCount = level.getEntitiesOfClass(HimEntity.class, new AABB(summonPos, summonPos).inflate(8.0D)).size();
            if (result != 0) {
                throw new GameTestAssertException("Expected summon command to fail for Him, got result " + result);
            }
            if (himCount != 0) {
                throw new GameTestAssertException("Expected summon command to leave no Him entities, found " + himCount);
            }
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_spawn_chunk_loading", timeoutTicks = 160)
    public static void himKeepsExactlyOneTickingChunkLoadedAndReleasesIt(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        HimEntity him = HimEntity.spawnForTest(level, helper.absolutePos(BlockPos.ZERO));

        helper.runAfterDelay(2, () -> {
            int ticketCount = tickingEntityChunkCount(level);
            if (ticketCount != 9) {
                throw new GameTestAssertException("Expected Him to force exactly nine ticking chunks after spawn, got " + ticketCount);
            }

            BlockPos farChunkPos = helper.absolutePos(new BlockPos(32, 0, 0));
            him.moveTo(farChunkPos.getX() + 0.5D, farChunkPos.getY(), farChunkPos.getZ() + 0.5D, 0.0F, 0.0F);
        });

        helper.runAfterDelay(6, () -> {
            int ticketCount = tickingEntityChunkCount(level);
            if (ticketCount != 9) {
                throw new GameTestAssertException("Expected Him chunk forcing to move as a 3x3 area without leaking old tickets, got " + ticketCount);
            }
            if (!ForgeChunkManager.hasForcedChunks(level)) {
                throw new GameTestAssertException("Expected Him to keep forced chunks active while present");
            }

            HimTestState.removeHimForTest(helper, him);
        });

        helper.runAfterDelay(10, () -> {
            int ticketCount = tickingEntityChunkCount(level);
            if (ticketCount != 0) {
                throw new GameTestAssertException("Expected Him chunk tickets to release after authorized removal, got " + ticketCount);
            }
            helper.succeed();
        });
    }

    private static int tickingEntityChunkCount(ServerLevel level) {
        ForcedChunksSavedData data = level.getDataStorage()
                .computeIfAbsent(ForcedChunksSavedData::load, ForcedChunksSavedData::new, ForcedChunksSavedData.FILE_ID);
        return data.getEntityForcedChunks()
                .getTickingChunks()
                .values()
                .stream()
                .mapToInt(LongSet::size)
                .sum();
    }
}
