package com.himdev.him.gametest;

import com.himdev.him.HimMod;
import com.himdev.him.guardian.DivinePunisher;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameRules;
import net.minecraftforge.gametest.GameTestHolder;
import net.minecraftforge.gametest.PrefixGameTestTemplate;

@GameTestHolder(HimMod.MOD_ID)
@PrefixGameTestTemplate(false)
public final class HimPunishmentGameTests {
    private HimPunishmentGameTests() {
    }

    @GameTest(template = "empty", batch = "him_punishment_drops")
    public static void punishedPigDropsLoot(GameTestHelper helper) {
        ServerLevel level = helper.getLevel();
        level.getGameRules().getRule(GameRules.RULE_DOMOBLOOT).set(true, level.getServer());
        Pig pig = helper.spawn(EntityType.PIG, 2, 0, 0);

        DivinePunisher punisher = new DivinePunisher();
        punisher.punish(level, pig);

        helper.runAfterDelay(5, () -> {
            helper.assertFalse(pig.isAlive(), "Expected punished pig to die");
            var nearbyItems = level.getEntitiesOfClass(ItemEntity.class, pig.getBoundingBox().inflate(8.0D));
            var nearbyXp = level.getEntitiesOfClass(ExperienceOrb.class, pig.getBoundingBox().inflate(8.0D));
            boolean foundPorkchop = nearbyItems.stream().anyMatch(item -> item.getItem().is(Items.PORKCHOP));
            helper.assertTrue(
                    foundPorkchop,
                    "Expected punished pig to drop porkchop, nearby items="
                            + nearbyItems.stream().map(item -> item.getItem().toString() + "@" + item.blockPosition()).toList()
                            + ", xp=" + nearbyXp.size()
            );
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_punishment_attacker")
    public static void lethalMobDamagePunishesAttacker(GameTestHelper helper) {
        Player player = TestPlayers.spawnSurvivalPlayer(helper);
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);

        player.setHealth(1.0F);
        player.hurt(helper.getLevel().damageSources().mobAttack(zombie), 20.0F);

        helper.runAfterDelay(5, () -> {
            helper.assertFalse(zombie.isAlive(), "Expected attacker to be punished");
            helper.succeed();
        });
    }
}
