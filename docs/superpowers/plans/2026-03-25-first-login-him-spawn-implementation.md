# First Login Him Spawn Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Spawn `Him` exactly once per world when the first real player logs in, placing him behind that player, and never auto-spawn him again for that save.

**Architecture:** Add a world-scoped `SavedData` gate for the one-time auto-spawn and a small server-side controller that listens for `PlayerLoggedInEvent`. Keep the trigger logic separate from `HimEntity` uniqueness enforcement so the new feature only decides whether to attempt the first spawn while the existing entity logic still prevents duplicates.

**Tech Stack:** Forge 1.20.1 event bus, Minecraft `SavedData`, JUnit 5, Forge GameTest

---

### Task 1: Add world gate and behind-player spawn helper tests

**Files:**
- Create: `src/test/java/com/himdev/him/world/FirstJoinHimSpawnStateTest.java`
- Create: `src/test/java/com/himdev/him/spawn/FirstJoinHimSpawnPlacementTest.java`
- Modify: `src/main/java/com/himdev/him/world/HimSavedData.java`
- Create: `src/main/java/com/himdev/him/spawn/FirstJoinHimSpawnPlacement.java`

- [ ] **Step 1: Write the failing tests**

```java
@Test
void marksAutoSpawnAsTriggeredOnlyOnce() {
    HimSavedData data = new HimSavedData();

    assertTrue(data.tryMarkFirstJoinSpawnTriggered());
    assertFalse(data.tryMarkFirstJoinSpawnTriggered());
}

@Test
void resolvesPositionBehindPlayerFromYaw() {
    Vec3 behindSouthFacing = FirstJoinHimSpawnPlacement.positionBehind(new Vec3(0.5D, 64.0D, 0.5D), 0.0F, 2.0D);

    assertEquals(0.5D, behindSouthFacing.x, 1.0E-6D);
    assertEquals(-1.5D, behindSouthFacing.z, 1.0E-6D);
}
```

- [ ] **Step 2: Run tests to verify they fail**

Run: `./gradlew test --tests com.himdev.him.world.FirstJoinHimSpawnStateTest --tests com.himdev.him.spawn.FirstJoinHimSpawnPlacementTest`
Expected: FAIL because the new state flag and placement helper do not exist yet.

- [ ] **Step 3: Write the minimal implementation**

```java
public boolean tryMarkFirstJoinSpawnTriggered() {
    if (firstJoinSpawnTriggered) {
        return false;
    }
    firstJoinSpawnTriggered = true;
    setDirty();
    return true;
}
```

```java
public static Vec3 positionBehind(Vec3 playerBase, float yawDegrees, double distance) {
    double radians = Math.toRadians(yawDegrees);
    double x = playerBase.x + Mth.sin((float) radians) * distance;
    double z = playerBase.z - Mth.cos((float) radians) * distance;
    return new Vec3(x, playerBase.y, z);
}
```

- [ ] **Step 4: Run tests to verify they pass**

Run: `./gradlew test --tests com.himdev.him.world.FirstJoinHimSpawnStateTest --tests com.himdev.him.spawn.FirstJoinHimSpawnPlacementTest`
Expected: PASS

- [ ] **Step 5: Commit**

```bash
git add src/main/java/com/himdev/him/world/HimSavedData.java src/main/java/com/himdev/him/spawn/FirstJoinHimSpawnPlacement.java src/test/java/com/himdev/him/world/FirstJoinHimSpawnStateTest.java src/test/java/com/himdev/him/spawn/FirstJoinHimSpawnPlacementTest.java
git commit -m "test: cover first-login Him spawn state and placement"
```

### Task 2: Add first-login controller regression test

**Files:**
- Create: `src/main/java/com/himdev/him/spawn/FirstJoinHimSpawnController.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimSpawnGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`

- [ ] **Step 1: Write the failing GameTest**

```java
@GameTest(template = "empty", batch = "him_spawn_first_login")
public static void firstLoginSpawnsHimOnlyOnceBehindPlayer(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    Player player = TestPlayers.spawnSurvivalPlayer(helper);

    FirstJoinHimSpawnController.handlePlayerLogin(player);
    FirstJoinHimSpawnController.handlePlayerLogin(player);

    helper.runAfterDelay(2, () -> {
        var himEntities = helper.getLevel().getEntitiesOfClass(HimEntity.class, new AABB(player.blockPosition()).inflate(16.0D));
        helper.assertTrue(himEntities.size() == 1, "Expected one auto-spawned Him");
        helper.succeed();
    });
}
```

- [ ] **Step 2: Run test to verify it fails**

Run: `./gradlew runGameTestServer --args "--tests him:him_spawn_first_login.*"`
Expected: FAIL because there is no login controller and no behind-player auto-spawn behavior.

- [ ] **Step 3: Write the minimal implementation**

```java
@SubscribeEvent
public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
    handlePlayerLogin(event.getEntity());
}
```

```java
public static void handlePlayerLogin(Player player) {
    if (!(player.level() instanceof ServerLevel level) || player instanceof FakePlayer) {
        return;
    }
    // gate by world saved data, then spawn Him behind the player
}
```

- [ ] **Step 4: Run test to verify it passes**

Run: `./gradlew runGameTestServer --args "--tests him:him_spawn_first_login.*"`
Expected: PASS

- [ ] **Step 5: Commit**

```bash
git add src/main/java/com/himdev/him/spawn/FirstJoinHimSpawnController.java src/main/java/com/himdev/him/gametest/HimSpawnGameTests.java src/main/java/com/himdev/him/gametest/HimTestState.java
git commit -m "feat: auto-spawn Him on first login only"
```

### Task 3: Verify focused regression coverage

**Files:**
- Modify: `docs/superpowers/plans/2026-03-25-first-login-him-spawn-implementation.md`

- [ ] **Step 1: Run focused unit tests**

Run: `./gradlew test --tests com.himdev.him.world.FirstJoinHimSpawnStateTest --tests com.himdev.him.spawn.FirstJoinHimSpawnPlacementTest`
Expected: PASS

- [ ] **Step 2: Run focused GameTests**

Run: `./gradlew runGameTestServer --args "--tests him:him_spawn_first_login.*"`
Expected: PASS

- [ ] **Step 3: Run broader spawn regression tests**

Run: `./gradlew runGameTestServer --args "--tests him:him_spawn_*"`
Expected: PASS

- [ ] **Step 4: Update plan notes if implementation diverged**

```markdown
- Verified first-login one-time spawn and existing spawn uniqueness behavior together.
```

- [ ] **Step 5: Commit**

```bash
git add docs/superpowers/plans/2026-03-25-first-login-him-spawn-implementation.md
git commit -m "docs: record first-login Him spawn verification"
```
