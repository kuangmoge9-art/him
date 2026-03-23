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
}
