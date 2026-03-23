# Him Mod Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Build a Forge 1.20.1 `Him` mod with one world-unique, invulnerable guardian entity that prevents lethal player deaths, punishes hostile attackers, and preserves normal drops and experience.

**Architecture:** Use an `entity + guardian controller` split. `HimEntity` owns presence, wandering, rendering placeholder, and combat. A separate guardian controller owns lethal damage interception, player rescue, threat resolution, divine punishment, and evidence-focused logging. This keeps global rules out of the entity AI and makes high-risk behavior testable.

**Tech Stack:** Java 17, Minecraft Forge 1.20.1 MDK, Gradle, Forge GameTest, JUnit 5

---

## Assumptions

- The mod id is `him`.
- The base Java package is `com.himdev.him`.
- Phase 1 uses a player-sized humanoid placeholder model and texture instead of a custom animation pipeline.
- The current repository only contains docs, so the first implementation task must create the Forge MDK project skeleton.
- High-risk behavior must be proven with automated tests or GameTests, not by visual inspection alone.

## Planned File Structure

### Root / Build Files

- Create: `build.gradle`
- Create: `settings.gradle`
- Create: `gradle.properties`
- Create: `gradlew`
- Create: `gradlew.bat`
- Create: `gradle/wrapper/gradle-wrapper.jar`
- Create: `gradle/wrapper/gradle-wrapper.properties`

### Main Mod Entry / Registries

- Create: `src/main/java/com/himdev/him/HimMod.java`
- Create: `src/main/java/com/himdev/him/registry/HimEntityTypes.java`
- Create: `src/main/java/com/himdev/him/registry/HimItems.java`
- Create: `src/main/java/com/himdev/him/registry/HimCreativeTabs.java`
- Create: `src/main/java/com/himdev/him/registry/HimDamageTypes.java`
- Create: `src/main/java/com/himdev/him/registry/HimEffects.java`

### Entity / AI / Rendering

- Create: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Create: `src/main/java/com/himdev/him/entity/ai/HimAttackSelector.java`
- Create: `src/main/java/com/himdev/him/entity/ai/HimRangedPunishGoal.java`
- Create: `src/main/java/com/himdev/him/entity/ai/HimMeleePunishGoal.java`
- Create: `src/main/java/com/himdev/him/client/model/HimModel.java`
- Create: `src/main/java/com/himdev/him/client/render/HimRenderer.java`
- Create: `src/main/java/com/himdev/him/client/ClientSetup.java`

### Guardian / World Logic

- Create: `src/main/java/com/himdev/him/guardian/GuardianRescueController.java`
- Create: `src/main/java/com/himdev/him/guardian/ThreatResolver.java`
- Create: `src/main/java/com/himdev/him/guardian/ThreatResolution.java`
- Create: `src/main/java/com/himdev/him/guardian/DivinePunisher.java`
- Create: `src/main/java/com/himdev/him/world/HimSavedData.java`
- Create: `src/main/java/com/himdev/him/world/HimLocator.java`
- Create: `src/main/java/com/himdev/him/util/HimLog.java`

### Resources

- Create: `src/main/resources/META-INF/mods.toml`
- Create: `src/main/resources/pack.mcmeta`
- Create: `src/main/resources/assets/him/lang/en_us.json`
- Create: `src/main/resources/assets/him/textures/entity/him.png`
- Create: `src/main/resources/assets/him/models/item/him_spawn_egg.json`
- Create: `src/main/resources/data/him/damage_type/divine_punishment.json`

### Tests

- Create: `src/test/java/com/himdev/him/HimModBootstrapTest.java`
- Create: `src/test/java/com/himdev/him/guardian/ThreatResolverTest.java`
- Create: `src/test/java/com/himdev/him/guardian/ThreatResolutionTest.java`
- Create: `src/test/java/com/himdev/him/world/HimLocatorTest.java`
- Create: `src/test/java/com/himdev/him/gametest/TestPlayers.java`
- Create: `src/test/java/com/himdev/him/gametest/HimSpawnGameTests.java`
- Create: `src/test/java/com/himdev/him/gametest/HimRescueGameTests.java`
- Create: `src/test/java/com/himdev/him/gametest/HimPunishmentGameTests.java`
- Create: `src/test/java/com/himdev/him/gametest/HimCombatGameTests.java`

## Task 1: Bootstrap The Forge Project

**Files:**
- Create: `build.gradle`
- Create: `settings.gradle`
- Create: `gradle.properties`
- Create: `gradlew`
- Create: `gradlew.bat`
- Create: `gradle/wrapper/gradle-wrapper.jar`
- Create: `gradle/wrapper/gradle-wrapper.properties`
- Create: `src/main/java/com/himdev/him/HimMod.java`
- Create: `src/main/resources/META-INF/mods.toml`
- Create: `src/main/resources/pack.mcmeta`
- Create: `src/test/java/com/himdev/him/HimModBootstrapTest.java`

- [ ] **Step 1: Import the official Forge 1.20.1 MDK skeleton**

Create the minimal Gradle and wrapper files needed to run `runClient`, `runServer`, `test`, and `gameTestServer`.

- [ ] **Step 2: Write the failing bootstrap test**

```java
package com.himdev.him;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HimModBootstrapTest {
    @Test
    void modIdRemainsStable() {
        assertEquals("him", HimMod.MOD_ID);
    }
}
```

- [ ] **Step 3: Run the test and verify it fails**

Run: `.\gradlew.bat test --tests com.himdev.him.HimModBootstrapTest`

Expected: FAIL because `HimMod` or `MOD_ID` does not exist yet.

- [ ] **Step 4: Write the minimal mod entrypoint**

```java
package com.himdev.him;

import net.minecraftforge.fml.common.Mod;

@Mod(HimMod.MOD_ID)
public final class HimMod {
    public static final String MOD_ID = "him";

    public HimMod() {
    }
}
```

`mods.toml` must use the same `modId`.

- [ ] **Step 5: Run the bootstrap test again**

Run: `.\gradlew.bat test --tests com.himdev.him.HimModBootstrapTest`

Expected: PASS

- [ ] **Step 6: Generate IDE run configs**

Run: `.\gradlew.bat genIntellijRuns`

Expected: Forge run configurations are generated successfully.

- [ ] **Step 7: Commit**

```bash
git add build.gradle settings.gradle gradle.properties gradlew gradlew.bat gradle/wrapper src/main/java/com/himdev/him/HimMod.java src/main/resources/META-INF/mods.toml src/main/resources/pack.mcmeta src/test/java/com/himdev/him/HimModBootstrapTest.java
git commit -m "build: bootstrap Forge 1.20.1 Him mod project"
```

## Task 2: Build Pure Logic For Threat Resolution And Unique Him Tracking

**Files:**
- Create: `src/main/java/com/himdev/him/guardian/ThreatResolver.java`
- Create: `src/main/java/com/himdev/him/guardian/ThreatResolution.java`
- Create: `src/main/java/com/himdev/him/world/HimSavedData.java`
- Create: `src/main/java/com/himdev/him/world/HimLocator.java`
- Create: `src/test/java/com/himdev/him/guardian/ThreatResolverTest.java`
- Create: `src/test/java/com/himdev/him/guardian/ThreatResolutionTest.java`
- Create: `src/test/java/com/himdev/him/world/HimLocatorTest.java`

- [ ] **Step 1: Write the failing threat resolver tests**

```java
@Test
void returnsEntityThreatForDirectAttacker() {
    UUID attackerId = UUID.randomUUID();

    ThreatResolution resolution = ThreatResolver.directEntity(attackerId);

    assertTrue(resolution.shouldPunish());
    assertEquals(attackerId, resolution.targetEntityId());
}

@Test
void returnsNoPunishmentForEnvironmentalDamage() {
    ThreatResolution resolution = ThreatResolver.environmental("lava");

    assertFalse(resolution.shouldPunish());
    assertEquals("lava", resolution.reason());
}
```

- [ ] **Step 2: Write the failing unique tracking tests**

```java
@Test
void rejectsSecondUniqueUuidWhenOneAlreadyRegistered() {
    HimSavedData data = new HimSavedData();
    UUID first = UUID.randomUUID();
    UUID second = UUID.randomUUID();

    assertTrue(data.tryRegister(first));
    assertFalse(data.tryRegister(second));
}
```

- [ ] **Step 3: Run the tests and verify they fail**

Run: `.\gradlew.bat test --tests com.himdev.him.guardian.* --tests com.himdev.him.world.*`

Expected: FAIL because the classes do not exist yet.

- [ ] **Step 4: Write the minimal implementation**

Requirements:

- `ThreatResolution` is an immutable result object with `shouldPunish`, `targetEntityId`, and `reason`.
- `ThreatResolver` exposes pure logic methods first; Forge event adaptation comes later.
- `HimSavedData` stores the one allowed `Him` UUID.
- `HimLocator` reads and updates `HimSavedData` without taking entity AI dependencies.

- [ ] **Step 5: Run the tests again**

Run: `.\gradlew.bat test --tests com.himdev.him.guardian.* --tests com.himdev.him.world.*`

Expected: PASS

- [ ] **Step 6: Commit**

```bash
git add src/main/java/com/himdev/him/guardian src/main/java/com/himdev/him/world src/test/java/com/himdev/him/guardian src/test/java/com/himdev/him/world
git commit -m "test: add threat resolution and unique Him logic"
```

## Task 3: Register Him, Spawn Egg, Placeholder Model, And Uniqueness Guard

**Files:**
- Create: `src/main/java/com/himdev/him/registry/HimEntityTypes.java`
- Create: `src/main/java/com/himdev/him/registry/HimItems.java`
- Create: `src/main/java/com/himdev/him/registry/HimCreativeTabs.java`
- Create: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Create: `src/main/java/com/himdev/him/client/model/HimModel.java`
- Create: `src/main/java/com/himdev/him/client/render/HimRenderer.java`
- Create: `src/main/java/com/himdev/him/client/ClientSetup.java`
- Create: `src/main/resources/assets/him/lang/en_us.json`
- Create: `src/main/resources/assets/him/textures/entity/him.png`
- Create: `src/main/resources/assets/him/models/item/him_spawn_egg.json`
- Create: `src/test/java/com/himdev/him/gametest/HimSpawnGameTests.java`

- [ ] **Step 1: Write the failing GameTest for uniqueness**

```java
@GameTest(template = "empty")
public static void spawningSecondHimDoesNotLeaveTwoInstances(GameTestHelper helper) {
    ServerLevel level = helper.getLevel();
    HimEntity.spawnForTest(level, helper.absolutePos(BlockPos.ZERO));
    HimEntity.spawnForTest(level, helper.absolutePos(new BlockPos(2, 0, 0)));

    helper.runAfterDelay(2, () -> {
        long count = level.getEntitiesOfClass(HimEntity.class, new AABB(-32, -32, -32, 32, 32, 32)).size();
        helper.assertTrue(count == 1, "Expected exactly one Him entity after duplicate spawn attempt");
        helper.succeed();
    });
}
```

- [ ] **Step 2: Write the failing GameTest for invulnerability**

```java
@GameTest(template = "empty")
public static void himIgnoresStandardDamage(GameTestHelper helper) {
    HimEntity him = HimEntity.spawnForTest(helper.getLevel(), helper.absolutePos(BlockPos.ZERO));

    boolean hurt = him.hurt(helper.getLevel().damageSources().generic(), 1000.0F);

    helper.assertFalse(hurt, "Expected Him to reject standard damage");
    helper.assertTrue(him.isAlive(), "Expected Him to remain alive");
    helper.succeed();
}
```

- [ ] **Step 3: Run the GameTests and verify they fail**

Run: `.\gradlew.bat gameTestServer --tests com.himdev.him.gametest.HimSpawnGameTests`

Expected: FAIL because registration and entity classes do not exist yet.

- [ ] **Step 4: Write the minimal entity and registry code**

Requirements:

- Register `HIM` in `HimEntityTypes`.
- Register the `Him` spawn egg in `HimItems`.
- Implement base attributes and damage rejection in `HimEntity`.
- Add `spawnForTest` to reduce GameTest boilerplate.
- Use `HimLocator` when the entity joins the world; if registration fails, remove the duplicate instance.
- Use a simple humanoid placeholder renderer and texture so the entity is visible in phase 1.

- [ ] **Step 5: Run the GameTests again**

Run: `.\gradlew.bat gameTestServer --tests com.himdev.him.gametest.HimSpawnGameTests`

Expected: PASS

- [ ] **Step 6: Run a client smoke test**

Run: `.\gradlew.bat runClient`

Expected: The mod loads and the `Him` spawn egg is available through creative inventory or commands.

- [ ] **Step 7: Commit**

```bash
git add src/main/java/com/himdev/him/registry src/main/java/com/himdev/him/entity src/main/java/com/himdev/him/client src/main/resources/assets/him src/test/java/com/himdev/him/gametest/HimSpawnGameTests.java
git commit -m "feat: add unique Him entity and spawn egg"
```

## Task 4: Add Guardian Rescue For Lethal Player Damage

**Files:**
- Create: `src/main/java/com/himdev/him/guardian/GuardianRescueController.java`
- Create: `src/main/java/com/himdev/him/registry/HimEffects.java`
- Create: `src/main/java/com/himdev/him/util/HimLog.java`
- Create: `src/test/java/com/himdev/him/gametest/TestPlayers.java`
- Create: `src/test/java/com/himdev/him/gametest/HimRescueGameTests.java`

- [ ] **Step 1: Write the failing GameTest for lethal mob rescue**

```java
@GameTest(template = "empty")
public static void lethalMobDamageRescuesPlayer(GameTestHelper helper) {
    ServerPlayer player = TestPlayers.spawnSurvivalPlayer(helper);
    Zombie zombie = EntityType.ZOMBIE.create(helper.getLevel());
    zombie.moveTo(player.position());
    helper.getLevel().addFreshEntity(zombie);

    player.setHealth(1.0F);
    player.hurt(helper.getLevel().damageSources().mobAttack(zombie), 20.0F);

    helper.runAfterDelay(2, () -> {
        helper.assertTrue(player.isAlive(), "Expected player rescue to cancel death");
        helper.assertTrue(player.getHealth() == player.getMaxHealth(), "Expected full heal after rescue");
        helper.assertTrue(player.hasEffect(HimEffects.DIVINE_PROTECTION.get()), "Expected divine protection effect");
        helper.succeed();
    });
}
```

- [ ] **Step 2: Write the failing GameTest for environmental rescue**

```java
@GameTest(template = "empty")
public static void lethalEnvironmentalDamageDoesNotPunishEntities(GameTestHelper helper) {
    ServerPlayer player = TestPlayers.spawnSurvivalPlayer(helper);
    Zombie zombie = EntityType.ZOMBIE.create(helper.getLevel());
    helper.getLevel().addFreshEntity(zombie);

    player.setHealth(1.0F);
    player.hurt(helper.getLevel().damageSources().lava(), 20.0F);

    helper.runAfterDelay(2, () -> {
        helper.assertTrue(player.isAlive(), "Expected player to be rescued from lava");
        helper.assertTrue(zombie.isAlive(), "Expected unrelated zombie to remain alive");
        helper.succeed();
    });
}
```

- [ ] **Step 3: Run the GameTests and verify they fail**

Run: `.\gradlew.bat gameTestServer --tests com.himdev.him.gametest.HimRescueGameTests`

Expected: FAIL because rescue logic and protection effect do not exist yet.

- [ ] **Step 4: Write the minimal rescue implementation**

Requirements:

- Listen to the Forge player damage event that still allows lethal interception.
- Detect whether the pending damage would kill the player.
- Cancel the lethal result.
- Heal the player to full health.
- Apply a short `DIVINE_PROTECTION` effect.
- Use `ThreatResolver` to classify the damage source.
- Log the rescue decision, but defer actual punishment until Task 5.

- [ ] **Step 5: Run the GameTests again**

Run: `.\gradlew.bat gameTestServer --tests com.himdev.him.gametest.HimRescueGameTests`

Expected: PASS

- [ ] **Step 6: Commit**

```bash
git add src/main/java/com/himdev/him/guardian/GuardianRescueController.java src/main/java/com/himdev/him/registry/HimEffects.java src/main/java/com/himdev/him/util/HimLog.java src/test/java/com/himdev/him/gametest/TestPlayers.java src/test/java/com/himdev/him/gametest/HimRescueGameTests.java
git commit -m "feat: add lethal rescue controller for players"
```

## Task 5: Implement Divine Punishment Through The Normal Death Pipeline

**Files:**
- Create: `src/main/java/com/himdev/him/registry/HimDamageTypes.java`
- Create: `src/main/java/com/himdev/him/guardian/DivinePunisher.java`
- Modify: `src/main/java/com/himdev/him/guardian/GuardianRescueController.java`
- Create: `src/main/resources/data/him/damage_type/divine_punishment.json`
- Create: `src/test/java/com/himdev/him/gametest/HimPunishmentGameTests.java`
- Modify: `src/test/java/com/himdev/him/gametest/HimRescueGameTests.java`

- [ ] **Step 1: Write the failing GameTest for punishment side effects**

```java
@GameTest(template = "empty")
public static void punishedZombieDropsLootAndExperience(GameTestHelper helper) {
    ServerLevel level = helper.getLevel();
    Zombie zombie = EntityType.ZOMBIE.create(level);
    level.addFreshEntity(zombie);

    DivinePunisher punisher = new DivinePunisher();
    punisher.punish(level, zombie);

    helper.runAfterDelay(5, () -> {
        helper.assertFalse(zombie.isAlive(), "Expected punished zombie to die");
        boolean foundDrops = !level.getEntitiesOfClass(ItemEntity.class, zombie.getBoundingBox().inflate(3)).isEmpty();
        boolean foundXp = !level.getEntitiesOfClass(ExperienceOrb.class, zombie.getBoundingBox().inflate(3)).isEmpty();
        helper.assertTrue(foundDrops || foundXp, "Expected normal death side effects after punishment");
        helper.succeed();
    });
}
```

- [ ] **Step 2: Write the failing GameTest for attacker punishment**

```java
@GameTest(template = "empty")
public static void lethalMobDamagePunishesAttacker(GameTestHelper helper) {
    ServerPlayer player = TestPlayers.spawnSurvivalPlayer(helper);
    Zombie zombie = EntityType.ZOMBIE.create(helper.getLevel());
    helper.getLevel().addFreshEntity(zombie);

    player.setHealth(1.0F);
    player.hurt(helper.getLevel().damageSources().mobAttack(zombie), 20.0F);

    helper.runAfterDelay(5, () -> {
        helper.assertFalse(zombie.isAlive(), "Expected attacker to be punished");
        helper.succeed();
    });
}
```

- [ ] **Step 3: Run the GameTests and verify they fail**

Run: `.\gradlew.bat gameTestServer --tests com.himdev.him.gametest.HimPunishmentGameTests`

Expected: FAIL because the punishment path does not exist yet.

- [ ] **Step 4: Write the minimal punishment implementation**

Requirements:

- Register the `divine_punishment` damage type.
- Implement `DivinePunisher` so it kills entities through a legal damage flow, not `discard()`.
- Update `GuardianRescueController` to call `DivinePunisher` when `ThreatResolution.shouldPunish()` is true.
- Log the target and the selected punishment path.

- [ ] **Step 5: Run the GameTests again**

Run: `.\gradlew.bat gameTestServer --tests com.himdev.him.gametest.HimPunishmentGameTests --tests com.himdev.him.gametest.HimRescueGameTests`

Expected: PASS

- [ ] **Step 6: Commit**

```bash
git add src/main/java/com/himdev/him/registry/HimDamageTypes.java src/main/java/com/himdev/him/guardian/DivinePunisher.java src/main/java/com/himdev/him/guardian/GuardianRescueController.java src/main/resources/data/him/damage_type/divine_punishment.json src/test/java/com/himdev/him/gametest/HimPunishmentGameTests.java src/test/java/com/himdev/him/gametest/HimRescueGameTests.java
git commit -m "feat: add divine punishment with normal loot flow"
```

## Task 6: Add Normal Him Combat Without Player Harm

**Files:**
- Create: `src/main/java/com/himdev/him/entity/ai/HimAttackSelector.java`
- Create: `src/main/java/com/himdev/him/entity/ai/HimRangedPunishGoal.java`
- Create: `src/main/java/com/himdev/him/entity/ai/HimMeleePunishGoal.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Create: `src/test/java/com/himdev/him/gametest/HimCombatGameTests.java`

- [ ] **Step 1: Write the failing GameTest for hostile targeting**

```java
@GameTest(template = "empty")
public static void himAttacksNearbyHostileMob(GameTestHelper helper) {
    ServerLevel level = helper.getLevel();
    HimEntity him = HimEntity.spawnForTest(level, helper.absolutePos(BlockPos.ZERO));
    Zombie zombie = EntityType.ZOMBIE.create(level);
    zombie.moveTo(helper.absolutePos(new BlockPos(4, 0, 0)).getX(), 2, 0);
    level.addFreshEntity(zombie);

    helper.runAfterDelay(60, () -> {
        helper.assertTrue(!zombie.isAlive() || zombie.getHealth() < zombie.getMaxHealth(), "Expected Him to damage or kill the hostile target");
        helper.succeed();
    });
}
```

- [ ] **Step 2: Write the failing GameTest for player safety**

```java
@GameTest(template = "empty")
public static void himNeverTargetsPlayer(GameTestHelper helper) {
    ServerLevel level = helper.getLevel();
    HimEntity him = HimEntity.spawnForTest(level, helper.absolutePos(BlockPos.ZERO));
    ServerPlayer player = TestPlayers.spawnSurvivalPlayer(helper);

    helper.runAfterDelay(80, () -> {
        helper.assertTrue(him.getTarget() == null || !(him.getTarget() instanceof ServerPlayer), "Expected Him to never target players");
        helper.assertTrue(player.isAlive(), "Expected player to remain unharmed");
        helper.succeed();
    });
}
```

- [ ] **Step 3: Run the GameTests and verify they fail**

Run: `.\gradlew.bat gameTestServer --tests com.himdev.him.gametest.HimCombatGameTests`

Expected: FAIL because combat AI does not exist yet.

- [ ] **Step 4: Write the minimal AI implementation**

Requirements:

- Register idle wandering, observation, ranged attack, and melee attack goals.
- Use `HimAttackSelector` to switch between ranged and melee based on distance.
- Restrict target filters to hostile mobs only.
- Reuse `DivinePunisher` where practical so standard combat and rescue punishment do not diverge.

- [ ] **Step 5: Run the GameTests again**

Run: `.\gradlew.bat gameTestServer --tests com.himdev.him.gametest.HimCombatGameTests`

Expected: PASS

- [ ] **Step 6: Run a client behavior smoke test**

Run: `.\gradlew.bat runClient`

Expected: `Him` is visible, wanders, does not attack players, and attacks hostile mobs.

- [ ] **Step 7: Commit**

```bash
git add src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/entity/ai src/test/java/com/himdev/him/gametest/HimCombatGameTests.java
git commit -m "feat: add Him combat behavior"
```

## Task 7: Final Verification And Acceptance Audit

**Files:**
- Modify: `src/main/java/com/himdev/him/util/HimLog.java`
- Modify: `src/main/java/com/himdev/him/guardian/GuardianRescueController.java`
- Modify: `src/main/java/com/himdev/him/guardian/DivinePunisher.java`
- Modify: `src/main/java/com/himdev/him/world/HimLocator.java`
- Modify: `docs/superpowers/specs/2026-03-23-him-mod-design.md` if engine limitations must be documented

- [ ] **Step 1: Audit log fields**

Confirm the logs cover:

- `Him` spawn attempts
- uniqueness decisions
- lethal player damage interception
- damage source classification
- punishment routing
- punishment target and result

- [ ] **Step 2: Run the full unit test suite**

Run: `.\gradlew.bat test`

Expected: PASS

- [ ] **Step 3: Run the full GameTest suite**

Run: `.\gradlew.bat gameTestServer`

Expected: PASS

- [ ] **Step 4: Run the final manual acceptance pass**

Run: `.\gradlew.bat runClient`

Validate:

- the spawn egg is obtainable
- only one `Him` exists
- `Him` ignores standard damage
- `Him` never harms players
- lethal mob damage rescues players
- rescued players are fully healed and protected
- the attacker is punished
- punishment still yields normal drops or experience
- lethal environmental damage rescues players without unrelated mob cleanup

- [ ] **Step 5: Document real engine limits only if proven**

If Forge or vanilla mechanics block a behavior, write the exact limitation back into the spec with evidence. Do not explain missing behavior through guesswork.

- [ ] **Step 6: Commit**

```bash
git add src/main/java/com/himdev/him/util/HimLog.java src/main/java/com/himdev/him/guardian src/main/java/com/himdev/him/world docs/superpowers/specs/2026-03-23-him-mod-design.md
git commit -m "test: verify Him acceptance criteria"
```
