package com.himdev.him.gametest;

import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.world.entity.player.Player;

public final class TestPlayers {
    private TestPlayers() {
    }

    public static Player spawnSurvivalPlayer(GameTestHelper helper) {
        return spawnSurvivalPlayer(helper, BlockPos.ZERO);
    }

    public static Player spawnSurvivalPlayer(GameTestHelper helper, BlockPos pos) {
        Player player = helper.makeMockSurvivalPlayer();
        BlockPos absolutePos = helper.absolutePos(pos);
        player.moveTo(absolutePos.getX() + 0.5D, absolutePos.getY(), absolutePos.getZ() + 0.5D, 0.0F, 0.0F);
        helper.getLevel().addFreshEntity(player);
        return player;
    }
}
