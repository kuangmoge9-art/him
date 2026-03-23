package com.himdev.him.gametest;

import com.himdev.him.HimMod;
import com.himdev.him.registry.HimEffects;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.world.entity.EntityType;
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
}
