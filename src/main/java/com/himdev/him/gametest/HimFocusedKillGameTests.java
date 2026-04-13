package com.himdev.him.gametest;

import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraftforge.gametest.GameTestHolder;
import net.minecraftforge.gametest.PrefixGameTestTemplate;

@GameTestHolder("him_focus")
@PrefixGameTestTemplate(false)
public final class HimFocusedKillGameTests {
    private HimFocusedKillGameTests() {
    }

    @GameTest(template = "empty", batch = "him_focus_punishment_drops")
    public static void focusPunishedPigDropsLoot(GameTestHelper helper) {
        HimPunishmentGameTests.punishedPigDropsLoot(helper);
    }

    @GameTest(template = "empty", batch = "him_focus_punishment_resistance", timeoutTicks = 160)
    public static void focusPunishedResistanceStackedZombieStillDies(GameTestHelper helper) {
        HimPunishmentGameTests.punishedResistanceStackedZombieStillDies(helper);
    }

    @GameTest(template = "empty", batch = "him_focus_punishment_attacker")
    public static void focusLethalMobDamagePunishesAttacker(GameTestHelper helper) {
        HimPunishmentGameTests.lethalMobDamagePunishesAttacker(helper);
    }

    @GameTest(template = "empty", batch = "him_focus_rescue_execution_normal", timeoutTicks = 240)
    public static void focusHimGrabExecutesNormalHostileRescue(GameTestHelper helper) {
        HimRescueGameTests.himGrabExecutesNormalHostileRescue(helper);
    }

    @GameTest(template = "empty", batch = "him_focus_rescue_execution_oversized")
    public static void focusHimDirectlyPunishesOversizedHostileRescue(GameTestHelper helper) {
        HimRescueGameTests.himDirectlyPunishesOversizedHostileRescue(helper);
    }
}
