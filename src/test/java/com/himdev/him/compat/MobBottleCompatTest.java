package com.himdev.him.compat;

import net.minecraft.nbt.CompoundTag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MobBottleCompatTest {
    @Test
    void detectsHimEntityTag() {
        CompoundTag himTag = new CompoundTag();
        himTag.putString("id", "him:him");

        assertTrue(MobBottleCompat.isHimEntityTag(himTag));
    }

    @Test
    void rejectsNonHimEntityTag() {
        CompoundTag zombieTag = new CompoundTag();
        zombieTag.putString("id", "minecraft:zombie");

        assertFalse(MobBottleCompat.isHimEntityTag(zombieTag));
    }

    @Test
    void detectsFilledBottleContainingHimTag() {
        CompoundTag stackTag = new CompoundTag();
        CompoundTag himTag = new CompoundTag();
        himTag.putString("id", "him:him");
        stackTag.put("mob", himTag);
        stackTag.putString("mob_name", "Him");

        assertTrue(MobBottleCompat.isFilledWithHimTag(stackTag));
    }

    @Test
    void createsPurifiedBottleTagWithoutMobData() {
        CompoundTag stackTag = new CompoundTag();
        CompoundTag himTag = new CompoundTag();
        himTag.putString("id", "him:him");
        stackTag.put("mob", himTag);
        stackTag.putString("mob_name", "Him");
        stackTag.putString("custom", "keep");

        CompoundTag purified = MobBottleCompat.createPurifiedBottleTag(stackTag);

        assertFalse(purified.contains("mob"));
        assertFalse(purified.contains("mob_name"));
        assertTrue(purified.contains("custom"));
    }
}
