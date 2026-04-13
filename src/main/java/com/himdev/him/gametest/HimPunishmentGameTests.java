package com.himdev.him.gametest;

import com.himdev.him.HimMod;
import com.himdev.him.guardian.DivinePunisher;
import net.minecraft.core.BlockPos;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestAssertException;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.GameRules;
import net.minecraftforge.gametest.GameTestHolder;
import net.minecraftforge.gametest.PrefixGameTestTemplate;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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

    @GameTest(template = "empty", batch = "him_punishment_resistance", timeoutTicks = 160)
    public static void punishedResistanceStackedZombieStillDies(GameTestHelper helper) {
        ServerLevel level = helper.getLevel();
        Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);
        zombie.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 4, false, false));

        DivinePunisher punisher = new DivinePunisher();
        punisher.punish(level, zombie);

        helper.runAfterDelay(10, () -> {
            helper.assertFalse(zombie.isAlive(), "Expected punished resistance-stacked zombie to die");
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

    @GameTest(template = "empty", batch = "him_punishment_splitters")
    public static void punishedSlimeLeavesNoSplitOffspring(GameTestHelper helper) {
        ServerLevel level = helper.getLevel();
        Slime slime = helper.spawn(EntityType.SLIME, 2, 0, 0);
        slime.setSize(4, true);

        DivinePunisher punisher = new DivinePunisher();
        punisher.punish(level, slime);

        helper.runAfterDelay(40, () -> {
            var nearbySlimes = level.getEntitiesOfClass(Slime.class, slime.getBoundingBox().inflate(8.0D), Entity::isAlive);
            helper.assertTrue(
                    nearbySlimes.isEmpty(),
                    "Expected punished slime lineage to be fully cleared, found="
                            + nearbySlimes.stream().map(entity -> entity.getUUID() + ":size=" + entity.getSize()).toList()
            );
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_punishment_ultimate_skeletons_starlight", timeoutTicks = 160)
    public static void punishedUltimateSkeletonsStarlightSkeletonLosesAllHealth(GameTestHelper helper) {
        ServerLevel level = helper.getLevel();
        LivingEntity starlightSkeleton = (LivingEntity) createUltimateSkeletonsEntity(
                "STARLIGHTSKELETON",
                "net.mcreator.ultimateskeletons.entity.StarlightskeletonEntity",
                level,
                helper.absolutePos(new BlockPos(2, 0, 0))
        );

        DivinePunisher punisher = new DivinePunisher();
        punisher.punish(level, starlightSkeleton);

        helper.assertTrue(
                starlightSkeleton.isRemoved() || starlightSkeleton.getHealth() <= 0.0F,
                "Expected punished Ultimate Skeletons starlight skeleton to be removed or lose all health"
        );
        helper.succeed();
    }

    @GameTest(template = "empty", batch = "him_punishment_ultimate_skeletons_titan", timeoutTicks = 200)
    public static void punishedUltimateSkeletonsSkeletonTitanDies(GameTestHelper helper) {
        ServerLevel level = helper.getLevel();
        Entity skeletonTitan = spawnUltimateSkeletonsEntity(
                "SKELETONTITAN",
                "net.mcreator.ultimateskeletons.entity.SkeletontitanEntity",
                level,
                helper.absolutePos(new BlockPos(2, 0, 0))
        );

        DivinePunisher punisher = new DivinePunisher();
        punisher.punish(level, skeletonTitan);

        helper.runAfterDelay(40, () -> {
            helper.assertTrue(
                    skeletonTitan.isRemoved() || !skeletonTitan.isAlive(),
                    "Expected punished Ultimate Skeletons skeleton titan to be removed"
            );
            helper.succeed();
        });
    }

    private static Entity spawnUltimateSkeletonsEntity(String registryFieldName, String entityClassName, ServerLevel level, BlockPos pos) {
        Entity entity = createUltimateSkeletonsEntity(registryFieldName, entityClassName, level, pos);
        if (!level.addFreshEntity(entity)) {
            throw new GameTestAssertException("Unable to add Ultimate Skeletons entity to test level: " + entityClassName);
        }
        return entity;
    }

    private static Entity createUltimateSkeletonsEntity(String registryFieldName, String entityClassName, ServerLevel level, BlockPos pos) {
        try {
            Class<?> entitiesClass = Class.forName("net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities");
            Field registryField = entitiesClass.getField(registryFieldName);
            Object registryObject = registryField.get(null);
            Method get = registryObject.getClass().getMethod("get");
            EntityType<?> entityType = (EntityType<?>) get.invoke(registryObject);
            Entity entity = entityType.create(level);
            if (entity == null) {
                Class<?> entityClass = Class.forName(entityClassName);
                Constructor<?> constructor = entityClass.getConstructor(EntityType.class, net.minecraft.world.level.Level.class);
                entity = (Entity) constructor.newInstance(entityType, level);
            }
            entity.moveTo(pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D, 0.0F, 0.0F);
            return entity;
        } catch (ClassNotFoundException exception) {
            throw new GameTestAssertException("Ultimate Skeletons runtime not present: " + exception.getMessage());
        } catch (NoSuchFieldException | NoSuchMethodException | IllegalAccessException exception) {
            throw new GameTestAssertException("Unable to create Ultimate Skeletons entity " + entityClassName + ": " + exception);
        } catch (InvocationTargetException | InstantiationException exception) {
            Throwable cause = exception instanceof InvocationTargetException invocationTargetException && invocationTargetException.getCause() != null
                    ? invocationTargetException.getCause()
                    : exception;
            throw new GameTestAssertException("Ultimate Skeletons entity creation failed for " + entityClassName + ": " + cause);
        }
    }
}
