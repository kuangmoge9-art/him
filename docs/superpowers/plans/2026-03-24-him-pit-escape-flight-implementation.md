# Him Pit Escape Flight Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Let `Him` temporarily fly out of pits and similar terrain traps, then immediately return to grounded movement without regressing his existing environment-dominance behavior.

**Architecture:** Keep the new behavior as a focused pit-escape layer rather than converting `Him` into a permanent flying mob. `HimEntity` remains the integration point for state and tick flow, while a new movement helper owns pit detection, safe-landing search, and per-tick escape guidance. Existing environment-dominance correction remains the lighter-weight first response for non-pit obstruction and the fallback if short flight cannot complete cleanly.

**Tech Stack:** Forge 1.20.1, Java 17, Minecraft entity movement APIs, Forge GameTest framework, Gradle

---

## File Map

- Create: `src/main/java/com/himdev/him/entity/movement/HimPitEscapeFlight.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java`
- Modify: `src/main/java/com/himdev/him/entity/movement/HimEnvironmentPressureTracker.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`

### Responsibility Notes

- `HimPitEscapeFlight.java`: encapsulates pit-style trap detection, landing search, and short-lived flight stepping toward a safe spot.
- `HimEntity.java`: stores pit-escape state, runs the flight tick before ordinary AI when active, and restores grounded behavior on exit.
- `HimEnvironmentDominance.java`: preserves existing local escape behavior for non-pit obstruction and acts as the fallback if pit escape cannot complete.
- `HimEnvironmentPressureTracker.java`: exposes generic obstruction evidence strong enough to distinguish true terrain entrapment from brief collisions.
- `HimInvulnerabilityGameTests.java`: proves deep-pit escape, diagonal/offset escape, and grounded regression protection.
- `HimTestState.java`: builds reusable pit scenes for the new GameTests.

### Task 1: Add Failing Pit-Escape GameTests

**Files:**
- Modify: `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`

- [ ] **Step 1: Add a helper that builds a deep straight pit with nearby solid rim**

```java
public static BlockPos buildDeepEscapePit(GameTestHelper helper, BlockPos origin) {
    ServerLevel level = helper.getLevel();
    for (int dx = -1; dx <= 1; dx++) {
        for (int dz = -1; dz <= 1; dz++) {
            for (int dy = -8; dy <= 6; dy++) {
                BlockPos current = origin.offset(dx, dy, dz);
                boolean centerColumn = dx == 0 && dz == 0;
                boolean floor = dy == -8;
                level.setBlockAndUpdate(current,
                        centerColumn && !floor ? Blocks.AIR.defaultBlockState() : Blocks.STONE.defaultBlockState());
            }
        }
    }
    for (int dy = -7; dy <= 6; dy++) {
        level.setBlockAndUpdate(origin.offset(0, dy, 0), Blocks.AIR.defaultBlockState());
    }
    return origin.offset(1, 1, 0);
}
```

- [ ] **Step 2: Add a helper that builds a pit with an offset side exit so diagonal flight is required**

```java
public static BlockPos buildOffsetEscapePit(GameTestHelper helper, BlockPos origin) {
    ServerLevel level = helper.getLevel();
    buildDeepEscapePit(helper, origin);
    for (int dy = -2; dy <= 2; dy++) {
        level.setBlockAndUpdate(origin.offset(1, dy, 0), Blocks.AIR.defaultBlockState());
        level.setBlockAndUpdate(origin.offset(1, dy, 1), Blocks.AIR.defaultBlockState());
    }
    return origin.offset(2, 1, 1);
}
```

- [ ] **Step 3: Add a failing GameTest for straight pit escape**

```java
@GameTest(template = "empty", batch = "him_environment_pit_escape", timeoutTicks = 160)
public static void himTemporarilyFliesOutOfDeepPit(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    BlockPos pitOrigin = helper.absolutePos(new BlockPos(12, 0, 0));
    BlockPos expectedRim = HimTestState.buildDeepEscapePit(helper, pitOrigin);
    HimEntity him = HimEntity.spawnForTest(level, pitOrigin.below(6));

    helper.runAfterDelay(80, () -> {
        if (him.getY() < pitOrigin.getY() - 1 || him.distanceToSqr(expectedRim.getX() + 0.5D, expectedRim.getY(), expectedRim.getZ() + 0.5D) > 16.0D) {
            throw new GameTestAssertException("Expected Him to fly out of the deep pit and reach nearby safe ground");
        }
        HimTestState.removeHimForTest(helper, him);
        helper.succeed();
    });
}
```

- [ ] **Step 4: Add a failing GameTest for diagonal escape from an offset-exit pit**

```java
@GameTest(template = "empty", batch = "him_environment_pit_escape", timeoutTicks = 160)
public static void himClimbsDiagonallyOutOfOffsetPit(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    BlockPos pitOrigin = helper.absolutePos(new BlockPos(18, 0, 0));
    BlockPos expectedExit = HimTestState.buildOffsetEscapePit(helper, pitOrigin);
    HimEntity him = HimEntity.spawnForTest(level, pitOrigin.below(6));

    helper.runAfterDelay(100, () -> {
        if (him.getY() < pitOrigin.getY() - 1 || him.distanceToSqr(expectedExit.getX() + 0.5D, expectedExit.getY(), expectedExit.getZ() + 0.5D) > 20.25D) {
            throw new GameTestAssertException("Expected Him to climb diagonally out of the offset pit");
        }
        HimTestState.removeHimForTest(helper, him);
        helper.succeed();
    });
}
```

- [ ] **Step 5: Tighten the grounded regression check so pit escape does not become idle hovering**

```java
@GameTest(template = "empty", batch = "him_environment_grounded")
public static void calmHimDoesNotEnterPitEscapeFlight(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    BlockPos origin = helper.absolutePos(new BlockPos(6, 0, 0));
    HimEntity him = HimEntity.spawnForTest(level, origin);
    him.setNoAi(true);
    double startY = him.getY();

    helper.runAfterDelay(40, () -> {
        if (him.getY() > startY + 1.0D || him.isNoGravity()) {
            throw new GameTestAssertException("Expected calm Him to stay grounded when not trapped");
        }
        HimTestState.removeHimForTest(helper, him);
        helper.succeed();
    });
}
```

- [ ] **Step 6: Run the new pit-focused GameTests to verify they fail before implementation**

Run: `.\gradlew.bat runGameTestServer --tests "com.himdev.him.gametest.HimInvulnerabilityGameTests.himTemporarilyFliesOutOfDeepPit" --tests "com.himdev.him.gametest.HimInvulnerabilityGameTests.himClimbsDiagonallyOutOfOffsetPit" --tests "com.himdev.him.gametest.HimInvulnerabilityGameTests.calmHimDoesNotEnterPitEscapeFlight"`
Expected: the two new pit-escape tests fail because `Him` cannot yet perform temporary escape flight; the grounded regression should still pass or reveal an unintended hover regression.

- [ ] **Step 7: Commit the failing tests and pit-scene helpers**

```bash
git add src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java src/main/java/com/himdev/him/gametest/HimTestState.java
git commit -m "test: add Him pit escape flight coverage"
```

### Task 2: Add Pit-Flight Detection And State

**Files:**
- Create: `src/main/java/com/himdev/him/entity/movement/HimPitEscapeFlight.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/entity/movement/HimEnvironmentPressureTracker.java`

- [ ] **Step 1: Extend the pressure tracker with generic stall evidence instead of target-only pursuit stall**

```java
public boolean isPersistentlyStalled() {
    return stalledTicks >= STALLED_THRESHOLD;
}

public boolean isPersistentlyCollisionBlocked() {
    return obstructedTicks >= OBSTRUCTED_THRESHOLD;
}
```

- [ ] **Step 2: Create a helper that can recognize pit-like entrapment and search for a safe landing**

```java
public final class HimPitEscapeFlight {
    public @Nullable Vec3 findEscapeLanding(ServerLevel level, HimEntity him) { ... }
    public boolean shouldStart(ServerLevel level, HimEntity him, HimEnvironmentPressureTracker tracker) { ... }
    public Vec3 nextVelocityStep(HimEntity him, Vec3 landing) { ... }
}
```

- [ ] **Step 3: Keep landing search local and conservative**

```java
private static final int SEARCH_RADIUS = 3;
private static final int SEARCH_HEIGHT = 10;
private static final double FLIGHT_SPEED = 0.45D;
private static final double VERTICAL_BIAS = 0.18D;
```

- [ ] **Step 4: Add pit-escape state fields to `HimEntity`**

```java
private static final HimPitEscapeFlight PIT_ESCAPE_FLIGHT = new HimPitEscapeFlight();
private static final int PIT_ESCAPE_MAX_TICKS = 30;
private static final int PIT_ESCAPE_COOLDOWN_TICKS = 10;

private Vec3 pitEscapeLanding;
private int pitEscapeTicksRemaining;
private int pitEscapeCooldownTicks;
```

- [ ] **Step 5: Add small state helpers on `HimEntity`**

```java
public boolean isEscapingPit() {
    return pitEscapeTicksRemaining > 0 && pitEscapeLanding != null;
}

private void startPitEscapeFlight(Vec3 landing) { ... }
private void stopPitEscapeFlight() { ... }
```

- [ ] **Step 6: Run `compileJava` before behavior changes**

Run: `.\gradlew.bat compileJava`
Expected: compile succeeds with the new helper and entity state wired in, while the pit GameTests still fail.

- [ ] **Step 7: Commit the pit-flight scaffolding**

```bash
git add src/main/java/com/himdev/him/entity/movement/HimPitEscapeFlight.java src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/entity/movement/HimEnvironmentPressureTracker.java
git commit -m "feat: add Him pit escape flight state"
```

### Task 3: Implement Short-Lived Escape Flight

**Files:**
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/entity/movement/HimPitEscapeFlight.java`
- Modify: `src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java`

- [ ] **Step 1: Tick active pit escape before ordinary AI**

```java
@Override
protected void customServerAiStep() {
    ...
    if (tickPitEscapeFlight()) {
        environmentPressureTracker.resetAfterCorrection(this);
        return;
    }
    ...
}
```

- [ ] **Step 2: Make the active flight apply no-gravity, stop navigation, and move toward the chosen landing**

```java
private boolean tickPitEscapeFlight() {
    if (!isEscapingPit()) {
        return false;
    }
    this.getNavigation().stop();
    this.setNoGravity(true);
    Vec3 velocity = PIT_ESCAPE_FLIGHT.nextVelocityStep(this, pitEscapeLanding);
    this.setDeltaMovement(velocity);
    this.move(MoverType.SELF, this.getDeltaMovement());
    ...
}
```

- [ ] **Step 3: Exit the flight as soon as `Him` reaches safe ground or times out**

```java
if (PIT_ESCAPE_FLIGHT.hasReachedLanding(level, this, pitEscapeLanding) || pitEscapeTicksRemaining <= 0) {
    stopPitEscapeFlight();
}
```

- [ ] **Step 4: Start pit escape only after light-weight environment correction has not already solved the problem**

```java
boolean corrected = ENVIRONMENT_DOMINANCE.applyIfNeeded(this, environmentPressureTracker);
if (!corrected && PIT_ESCAPE_FLIGHT.shouldStart(serverLevel, this, environmentPressureTracker)) {
    Vec3 landing = PIT_ESCAPE_FLIGHT.findEscapeLanding(serverLevel, this);
    if (landing != null) {
        startPitEscapeFlight(landing);
        return;
    }
}
```

- [ ] **Step 5: Use existing local relocation as fallback when the short flight cannot complete**

```java
if (pitEscapeTicksRemaining <= 0 && !PIT_ESCAPE_FLIGHT.hasReachedLanding(level, this, pitEscapeLanding)) {
    stopPitEscapeFlight();
    ENVIRONMENT_DOMINANCE.forceLocalEscape(level, this);
}
```

- [ ] **Step 6: Restore grounded state cleanly after exit**

```java
private void stopPitEscapeFlight() {
    pitEscapeLanding = null;
    pitEscapeTicksRemaining = 0;
    pitEscapeCooldownTicks = PIT_ESCAPE_COOLDOWN_TICKS;
    this.setNoGravity(false);
    this.setDeltaMovement(Vec3.ZERO);
    this.fallDistance = 0.0F;
}
```

- [ ] **Step 7: Run the pit-focused GameTests until they pass**

Run: `.\gradlew.bat runGameTestServer --tests "com.himdev.him.gametest.HimInvulnerabilityGameTests.himTemporarilyFliesOutOfDeepPit" --tests "com.himdev.him.gametest.HimInvulnerabilityGameTests.himClimbsDiagonallyOutOfOffsetPit" --tests "com.himdev.him.gametest.HimInvulnerabilityGameTests.calmHimDoesNotEnterPitEscapeFlight"`
Expected: all three tests pass, demonstrating temporary flight only under real terrain confinement.

- [ ] **Step 8: Commit the escape-flight behavior**

```bash
git add src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/entity/movement/HimPitEscapeFlight.java src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java
git commit -m "feat: let Him temporarily fly out of pits"
```

### Task 4: Regression Hardening

**Files:**
- Modify: `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: only if test fixes expose gaps

- [ ] **Step 1: Keep the existing cramped-obstruction and fluid-confinement coverage green**

Run: `.\gradlew.bat runGameTestServer --tests "com.himdev.him.gametest.HimInvulnerabilityGameTests.himEscapesCrampedObstruction" --tests "com.himdev.him.gametest.HimInvulnerabilityGameTests.himEscapesFluidConfinement" --tests "com.himdev.him.gametest.HimInvulnerabilityGameTests.himStaysGroundedWhenCalm"`
Expected: all existing environment-dominance tests still pass; no regression from the pit-specific flight layer.

- [ ] **Step 2: Re-run the existing void-recovery regression because the new flight logic also touches gravity and elevation**

Run: `.\gradlew.bat runGameTestServer --tests "com.himdev.him.gametest.HimInvulnerabilityGameTests.himSurvivesShallowVoidPit"`
Expected: pass; void recovery still uses its existing dedicated path and is not hijacked by pit escape.

- [ ] **Step 3: If needed, tighten any assertions that prove grounded mode resumes after escape**

```java
helper.runAfterDelay(110, () -> {
    if (him.isNoGravity()) {
        throw new GameTestAssertException("Expected Him to restore gravity after pit escape");
    }
});
```

- [ ] **Step 4: Commit the regression hardening**

```bash
git add src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java src/main/java/com/himdev/him/entity/HimEntity.java
git commit -m "test: lock down Him pit escape regressions"
```

### Task 5: Final Verification And Build

**Files:**
- Modify: only if verification exposes regressions

- [ ] **Step 1: Run the unit test suite**

Run: `.\gradlew.bat test`
Expected: `BUILD SUCCESSFUL`

- [ ] **Step 2: Run the full GameTest suite**

Run: `.\gradlew.bat runGameTestServer`
Expected: all required GameTests pass, including pit escape, existing environment dominance, rescue, combat, and invulnerability coverage.

- [ ] **Step 3: Build the mod jar**

Run: `.\gradlew.bat build`
Expected: `BUILD SUCCESSFUL` and an updated jar in `build/libs/`

- [ ] **Step 4: Inspect the final diff**

Run: `git status --short`
Expected: only intentional tracked changes remain before the final commit, then a clean working tree after commit.

- [ ] **Step 5: Commit the final verified implementation**

```bash
git add src/main/java/com/himdev/him/entity/movement/HimPitEscapeFlight.java src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java src/main/java/com/himdev/him/entity/movement/HimEnvironmentPressureTracker.java src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java src/main/java/com/himdev/him/gametest/HimTestState.java
git commit -m "feat: add Him temporary pit escape flight"
```
