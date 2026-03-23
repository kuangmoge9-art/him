# Him Divine Observation Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Give `Him` a calm, deliberate observation behavior where he occasionally watches nearby players from a visibly abnormal elevated position without breaking existing rescue, combat, return, or environment-dominance behavior.

**Architecture:** Keep the new behavior server-side and state-driven. `HimEntity` remains the owner of high-priority intent, while a small observation helper owns when the feature may start, where `Him` should perch, and how long he should hold position before yielding back to ordinary movement.

**Tech Stack:** Java 17, Minecraft Forge 1.20.1, existing custom entity AI/goals, Forge GameTest framework, Gradle

---

## File Map

- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
  - Wire observation behavior into the existing server AI tick
  - Expose only the state needed for the helper to decide whether observation is allowed
- Create: `src/main/java/com/himdev/him/entity/observation/HimObservationDirector.java`
  - Own observation trigger gating, perch selection, hold timing, cooldown, and player-facing orientation
- Modify: `src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java`
  - Respect the new observation hold so environment correction does not fight calm hovering
- Modify: `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`
  - Add focused behavior tests for observation trigger, non-trigger under combat pressure, and stable hold
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`
  - Add small world-building helpers for rooftop / ledge observation test setups
- Optional Modify: `src/main/java/com/himdev/him/util/HimLog.java`
  - Only if additional debug logging is needed to diagnose flaky observation tests

## Task 1: Lock The Desired Behavior In Tests

**Files:**
- Modify: `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`

- [ ] **Step 1: Add a failing calm-observation GameTest**

Create a new test in `HimCombatGameTests` that spawns `Him` and a survival player with a simple nearby rooftop or ledge setup. The test should wait long enough for calm behavior, then fail unless `Him` moved to a clearly elevated local point and is facing the player.

```java
@GameTest(template = "empty", batch = "him_divine_observation")
public static void himObservesNearbyPlayerFromAbnormalPerch(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    BlockPos origin = helper.absolutePos(BlockPos.ZERO);
    HimTestState.buildObservationPerch(helper, origin);
    HimEntity him = HimEntity.spawnForTest(helper.getLevel(), origin);
    Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(4, 0, 0));

    helper.runAfterDelay(120, () -> {
        helper.assertTrue(him.getY() >= origin.getY() + 1.0D, "Expected Him to perch above the ground");
        helper.assertTrue(him.distanceToSqr(player) < 100.0D, "Expected Him to stay in the local scene");
        helper.succeed();
    });
}
```

- [ ] **Step 2: Add a failing “do not observe during combat” GameTest**

Add a second test that gives `Him` a nearby hostile so combat intent wins. The test should fail if `Him` enters a perch hold instead of engaging the hostile.

```java
@GameTest(template = "empty", batch = "him_divine_observation_priority")
public static void himDoesNotPerchWhileCombatIsActive(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    HimEntity him = HimEntity.spawnForTest(helper.getLevel(), helper.absolutePos(BlockPos.ZERO));
    Zombie zombie = helper.spawn(EntityType.ZOMBIE, 4, 0, 0);

    helper.runAfterDelay(40, () -> {
        helper.assertTrue(him.getTarget() == zombie || !zombie.isAlive(), "Expected combat to beat observation");
        helper.assertTrue(him.getY() < helper.absolutePos(BlockPos.ZERO).getY() + 2.0D, "Expected Him not to perch away from combat");
        helper.succeed();
    });
}
```

- [ ] **Step 3: Add a failing stable-hold GameTest**

Add a third test that verifies the perched state does not bob vertically or chain multiple perch hops in quick succession.

```java
@GameTest(template = "empty", batch = "him_divine_observation_stability")
public static void himObservationHoldStaysCalm(GameTestHelper helper) {
    // sample Y while perched; fail if vertical drift exceeds a small threshold
}
```

- [ ] **Step 4: Add test-scene helpers**

Add one or two small helper builders to `HimTestState` for observation-only scenes. Keep them narrow and reusable.

```java
public static void buildObservationPerch(GameTestHelper helper, BlockPos origin) {
    ServerLevel level = helper.getLevel();
    level.setBlockAndUpdate(origin.offset(3, 0, 0), Blocks.STONE.defaultBlockState());
    level.setBlockAndUpdate(origin.offset(3, 1, 0), Blocks.STONE.defaultBlockState());
    level.setBlockAndUpdate(origin.offset(3, 2, 0), Blocks.STONE.defaultBlockState());
    level.setBlockAndUpdate(origin.offset(3, 3, 0), Blocks.AIR.defaultBlockState());
}
```

- [ ] **Step 5: Run GameTests to verify the new tests fail for the right reason**

Run: `.\gradlew.bat runGameTestServer`  
Expected: FAIL with the new observation batches complaining that `Him` never perched, perched at the wrong time, or drifted during the hold.

- [ ] **Step 6: Commit the red tests**

```bash
git add src/main/java/com/himdev/him/gametest/HimCombatGameTests.java src/main/java/com/himdev/him/gametest/HimTestState.java
git commit -m "test: add Him divine observation coverage"
```

## Task 2: Add Observation State And Trigger Gating

**Files:**
- Create: `src/main/java/com/himdev/him/entity/observation/HimObservationDirector.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`

- [ ] **Step 1: Create the failing scaffolding in the observation helper**

Create a dedicated helper that owns:
- nearby-player detection
- high-priority intent checks
- cooldown tracking
- active observation hold timing

Start with simple stubs that compile but do not satisfy the tests yet.

```java
public final class HimObservationDirector {
    public boolean tick(ServerLevel level, HimEntity him) {
        return false;
    }
}
```

- [ ] **Step 2: Wire the helper into `HimEntity` in the smallest possible way**

`HimEntity` should call the helper during `customServerAiStep()` only after urgent states have had a chance to win. Add minimal getters or package-visible helpers rather than exposing broad mutable state.

```java
if (OBSERVATION_DIRECTOR.tick(serverLevel, this)) {
    syncExistenceSeal(serverLevel);
    return;
}
```

- [ ] **Step 3: Implement trigger gating**

Make observation eligible only when all of the following are true:
- a player is within a local range
- `Him` has no active hostile target
- `Him` is not returning from removal stabilization
- `Him` is not in void recovery
- environment escape pressure is not currently active
- cooldown has expired

Keep the trigger conservative. A missed opportunity is better than a noisy false positive.

- [ ] **Step 4: Run GameTests and confirm only the trigger-related failures move**

Run: `.\gradlew.bat runGameTestServer`  
Expected: the “never observe” failure should improve or shift, while hold-position and perch-selection tests are still red.

- [ ] **Step 5: Commit the trigger layer**

```bash
git add src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/entity/observation/HimObservationDirector.java
git commit -m "feat: add Him observation state gating"
```

## Task 3: Implement Perch Selection And Calm Hold

**Files:**
- Modify: `src/main/java/com/himdev/him/entity/observation/HimObservationDirector.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java`

- [ ] **Step 1: Add local observation-point search**

Search around the nearby player for local elevated positions that are:
- only modestly above the current scene
- safe for `Him`
- local to the encounter
- visible enough to read as deliberate

Reject far, cramped, or obviously broken points.

```java
private Optional<Vec3> findObservationPerch(ServerLevel level, HimEntity him, Player player) {
    // sample nearby ledges / tops / raised blocks
}
```

- [ ] **Step 2: Implement the hold state**

When a perch is found:
- stop navigation
- move `Him` to the perch
- face the player
- hold still for a short fixed duration
- prevent gravity/bobbing during the hold

Use a cooldown after the hold to keep the behavior rare.

```java
him.getNavigation().stop();
him.setNoGravity(true);
him.setDeltaMovement(Vec3.ZERO);
him.moveTo(perch.x, perch.y, perch.z, yawToPlayer, him.getXRot());
```

- [ ] **Step 3: Ensure higher-priority systems win immediately**

If combat, rescue-adjacent intent, return stabilization, or void recovery becomes active, observation must stop without lingering. Keep this preemption explicit.

- [ ] **Step 4: Prevent environment correction from fighting a valid observation hold**

Update `HimEnvironmentDominance` or the `HimEntity` call order so a legitimate calm perch does not get mistaken for obstruction and “corrected” away.

```java
if (him.isInObservationHold()) {
    return false;
}
```

- [ ] **Step 5: Run GameTests to verify all new observation tests now pass**

Run: `.\gradlew.bat runGameTestServer`  
Expected: the three new observation batches pass, and the older environment / invulnerability / rescue / combat batches stay green.

- [ ] **Step 6: Commit the behavior layer**

```bash
git add src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/entity/observation/HimObservationDirector.java src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java
git commit -m "feat: add Him divine observation behavior"
```

## Task 4: Smoke-Test Behavior And Ship A Clean Build

**Files:**
- Modify: `src/main/java/com/himdev/him/entity/observation/HimObservationDirector.java` (only if smoke testing reveals rough edges)
- Optional Modify: `src/main/java/com/himdev/him/util/HimLog.java`

- [ ] **Step 1: Run the full verification suite**

Run: `.\gradlew.bat test runGameTestServer build`  
Expected:
- `test` completes successfully
- GameTest server reports all required tests passed
- `build` produces a fresh playable jar under `build/libs/`

- [ ] **Step 2: Do a manual client smoke test**

Run: `.\gradlew.bat runClient`  
Manual check:
- spawn `Him` with the spawn egg
- stand near him with no hostile nearby
- confirm he only occasionally chooses an odd perch
- confirm he stays calm rather than bouncing
- confirm introducing a hostile breaks the pose and resumes combat

- [ ] **Step 3: Tidy any smoke-test regressions**

If the manual pass shows spammy triggers, bad perch picks, or visible vertical drift, adjust only the observation helper. Re-run the affected verification immediately after each tweak.

- [ ] **Step 4: Record the final artifact details**

Run: `Get-Item build/libs/him-1.0.0.jar | Select-Object FullName,Length,LastWriteTime`  
Expected: one fresh jar with an updated timestamp.

- [ ] **Step 5: Commit the verified finish**

```bash
git add src/main/java/com/himdev/him/entity/observation/HimObservationDirector.java src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java src/main/java/com/himdev/him/gametest/HimCombatGameTests.java src/main/java/com/himdev/him/gametest/HimTestState.java
git commit -m "feat: ship Him divine observation slice"
```

## Notes For The Implementer

- Favor one focused helper for observation rather than spreading timers and flags across multiple unrelated files.
- Keep the feature intentionally conservative. Rare and clean is better than frequent and messy.
- Do not turn observation into generic flight. The posture should feel chosen, not permanent.
- Do not weaken any existing tests to make the new feature easier.
- If a test flakes, tighten the scene or timing before loosening the behavior guarantee.
