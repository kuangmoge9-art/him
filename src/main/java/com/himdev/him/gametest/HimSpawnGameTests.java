package com.himdev.him.gametest;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestAssertException;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
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
}
