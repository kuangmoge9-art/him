# Him Environment Dominance Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Make `Him` break out of environmental obstruction and maintain effective movement through fluids, cramped terrain, and failed pursuit geometry without losing his calm wandering feel.

**Architecture:** Keep environment-dominance state and correction logic in focused world/movement helpers rather than bloating every existing behavior branch. `HimEntity` remains the integration point for movement intent and escalation state, while dedicated helper code owns obstruction tracking, local escape, and movement correction so the feature stays testable and regression-safe.

**Tech Stack:** Forge 1.20.1, Java 17, Forge GameTest framework, Gradle, Minecraft entity movement/pathfinding APIs

---

## File Map

- Create: `src/main/java/com/himdev/him/entity/movement/HimEnvironmentPressureTracker.java`
- Create: `src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`

### Responsibility Notes

- `HimEnvironmentPressureTracker.java`: tracks short-term obstruction evidence such as stalled progress, fluid drag, and prolonged embedding.
- `HimEnvironmentDominance.java`: decides whether `Him` should stay calm or enter dominant movement correction and applies the response ladder.
- `HimEntity.java`: feeds movement/intent signals into the tracker, invokes environment correction, and preserves existing combat/rescue/return behavior.
- `HimInvulnerabilityGameTests.java`: proves `Him` escapes confinement and fluid pressure without regressing prior existence/invulnerability behavior.
- `HimCombatGameTests.java`: proves pursuit/combat still works through awkward terrain after the new correction logic.
- `HimTestState.java`: adds any tiny helper setup needed to build obstruction-focused test scenes cleanly.

### Task 1: Add Failing Environment-Dominance Proof

**Files:**
- Modify: `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`

- [ ] **Step 1: Add a failing GameTest that traps `Him` in a cramped enclosure and expects him to escape**

```java
@GameTest(template = "empty", batch = "him_environment_escape")
public static void himEscapesCrampedObstruction(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    BlockPos origin = helper.absolutePos(BlockPos.ZERO);
    HimTestState.buildTightObstruction(helper, origin);
    HimEntity him = HimEntity.spawnForTest(level, origin);

    helper.runAfterDelay(30, () -> {
        if (him.getBoundingBox().intersects(new AABB(origin))) {
            throw new GameTestAssertException("Expected Him to break out of the cramped obstruction");
        }
        HimTestState.removeHimForTest(helper, him);
        helper.succeed();
    });
}
```

- [ ] **Step 2: Add a failing GameTest that subjects `Him` to fluid drag and expects him to hold position or recover**

```java
@GameTest(template = "empty", batch = "him_environment_fluid")
public static void himResistsFluidPressure(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    BlockPos origin = helper.absolutePos(BlockPos.ZERO);
    HimTestState.buildFluidChannel(helper, origin);
    HimEntity him = HimEntity.spawnForTest(level, origin);
    double startX = him.getX();
    double startZ = him.getZ();

    helper.runAfterDelay(30, () -> {
        double drift = Math.abs(him.getX() - startX) + Math.abs(him.getZ() - startZ);
        if (drift > 1.0D) {
            throw new GameTestAssertException("Expected Him to resist lasting fluid displacement");
        }
        HimTestState.removeHimForTest(helper, him);
        helper.succeed();
    });
}
```

- [ ] **Step 3: Add a failing combat-pathing GameTest that forces awkward terrain and expects `Him` to keep pressure on a hostile target**

```java
@GameTest(template = "empty", batch = "him_environment_pursuit")
public static void himKeepsPursuitThroughAwkwardTerrain(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    BlockPos origin = helper.absolutePos(BlockPos.ZERO);
    HimTestState.buildAwkwardPursuitCourse(helper, origin);
    HimEntity him = HimEntity.spawnForTest(level, origin);
    Zombie target = helper.spawn(EntityType.ZOMBIE, 6, 0, 0);

    helper.runAfterDelay(40, () -> {
        if (him.distanceToSqr(target) > 36.0D && him.getTarget() != target) {
            throw new GameTestAssertException("Expected Him to maintain effective pursuit through awkward terrain");
        }
        HimTestState.removeHimForTest(helper, him);
        target.remove(Entity.RemovalReason.DISCARDED);
        helper.succeed();
    });
}
```

- [ ] **Step 4: Add any minimal test-scaffold helpers needed for obstruction and fluid scenes**

```java
public static void buildFluidChannel(GameTestHelper helper, BlockPos origin) { ... }
public static void buildTightObstruction(GameTestHelper helper, BlockPos origin) { ... }
public static void buildAwkwardPursuitCourse(GameTestHelper helper, BlockPos origin) { ... }
```

- [ ] **Step 5: Run GameTests to verify the new environment cases fail before implementation**

Run: `.\gradlew.bat runGameTestServer`  
Expected: the new `him_environment_*` tests fail because current code still behaves like ordinary terrain/pathing under obstruction.

- [ ] **Step 6: Commit the failing environment-dominance tests**

```bash
git add src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java src/main/java/com/himdev/him/gametest/HimCombatGameTests.java src/main/java/com/himdev/him/gametest/HimTestState.java
git commit -m "test: add Him environment dominance coverage"
```

### Task 2: Add Obstruction Tracking

**Files:**
- Create: `src/main/java/com/himdev/him/entity/movement/HimEnvironmentPressureTracker.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`

- [ ] **Step 1: Create a tracker for recent position, stall time, and fluid/embedding evidence**

```java
public final class HimEnvironmentPressureTracker {
    private Vec3 lastPosition = Vec3.ZERO;
    private int stalledTicks;
    private int embeddedTicks;
    private int fluidTicks;
    ...
}
```

- [ ] **Step 2: Add a tracker update method that samples current movement state each server tick**

```java
public void sample(HimEntity him) {
    Vec3 current = him.position();
    double moved = current.distanceTo(lastPosition);
    ...
    lastPosition = current;
}
```

- [ ] **Step 3: Expose narrow evidence queries instead of baking policy into the tracker**

```java
public boolean isPersistentlyStalled() { ... }
public boolean isPersistentlyEmbedded() { ... }
public boolean isPersistentlyDraggedByFluid() { ... }
public void resetAfterCorrection() { ... }
```

- [ ] **Step 4: Wire the tracker into `HimEntity` without changing movement behavior yet**

```java
private final HimEnvironmentPressureTracker environmentPressure = new HimEnvironmentPressureTracker();

@Override
protected void customServerAiStep() {
    environmentPressure.sample(this);
    ...
}
```

- [ ] **Step 5: Run `compileJava` to confirm the tracker layer integrates cleanly**

Run: `.\gradlew.bat compileJava`  
Expected: compilation succeeds while the new environment tests still fail.

- [ ] **Step 6: Commit the pressure-tracking layer**

```bash
git add src/main/java/com/himdev/him/entity/movement/HimEnvironmentPressureTracker.java src/main/java/com/himdev/him/entity/HimEntity.java
git commit -m "feat: track Him environment pressure"
```

### Task 3: Add State-Driven Correction Logic

**Files:**
- Create: `src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`

- [ ] **Step 1: Create a helper that decides calm vs dominant movement state from entity intent**

```java
public final class HimEnvironmentDominance {
    public boolean shouldDominate(HimEntity him, HimEnvironmentPressureTracker tracker) {
        return him.getTarget() != null || tracker.isPersistentlyEmbedded() || tracker.isPersistentlyDraggedByFluid();
    }
}
```

- [ ] **Step 2: Implement step 1 motion correction for drift and minor stall**

```java
public boolean applyMotionCorrection(HimEntity him, HimEnvironmentPressureTracker tracker) {
    if (!tracker.isPersistentlyStalled()) {
        return false;
    }
    him.setDeltaMovement(Vec3.ZERO);
    return true;
}
```

- [ ] **Step 3: Implement step 2 local escape to a nearby safe point**

```java
public boolean applyLocalEscape(HimEntity him) {
    BlockPos safe = findNearbySafeSpot(him);
    if (safe == null) {
        return false;
    }
    him.moveTo(safe.getX() + 0.5D, safe.getY(), safe.getZ() + 0.5D, him.getYRot(), him.getXRot());
    return true;
}
```

- [ ] **Step 4: Implement step 3 forced reassertion as a short decisive relocation**

```java
public void applyForcedReassertion(HimEntity him) {
    BlockPos fallback = findImmediateEscapeSpot(him.blockPosition());
    him.moveTo(fallback.getX() + 0.5D, fallback.getY(), fallback.getZ() + 0.5D, him.getYRot(), him.getXRot());
}
```

- [ ] **Step 5: Call the correction ladder from `HimEntity` before ordinary AI when obstruction or dominant intent is present**

```java
if (environmentDominance.applyIfNeeded(this, environmentPressure)) {
    syncExistenceSeal(serverLevel);
    return;
}
```

- [ ] **Step 6: Keep calm wandering behavior mostly intact by only escalating when the helper says correction is needed**

Do not replace ordinary idle movement wholesale. The new helper should intervene only under persistent obstruction or strong intent.

- [ ] **Step 7: Run the environment-focused GameTests to verify the new obstruction cases pass**

Run: `.\gradlew.bat runGameTestServer`  
Expected: the new `him_environment_*` tests pass and existing return/invulnerability tests stay green.

- [ ] **Step 8: Commit the environment-correction behavior**

```bash
git add src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java src/main/java/com/himdev/him/entity/HimEntity.java
git commit -m "feat: let Him dominate obstructing terrain"
```

### Task 4: Regression Hardening

**Files:**
- Modify: `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`

- [ ] **Step 1: Add or tighten a regression check that calm wandering still stays stable when no obstruction exists**

```java
@GameTest(template = "empty", batch = "him_environment_idle")
public static void himWandersCalmlyWithoutObstruction(GameTestHelper helper) {
    ...
}
```

- [ ] **Step 2: Add or tighten a regression check that return behavior still works with the new dominance logic active**

```java
@GameTest(template = "empty", batch = "him_environment_return_regression")
public static void himStillReturnsAfterRemovalWithEnvironmentDominance(GameTestHelper helper) {
    ...
}
```

- [ ] **Step 3: Run the full GameTest suite**

Run: `.\gradlew.bat runGameTestServer`  
Expected: all required tests pass, including environment, return, invulnerability, rescue, and combat coverage.

- [ ] **Step 4: Commit the regression hardening**

```bash
git add src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java src/main/java/com/himdev/him/gametest/HimCombatGameTests.java src/main/java/com/himdev/him/entity/HimEntity.java
git commit -m "test: lock down Him environment regressions"
```

### Task 5: Final Verification And Playable Build

**Files:**
- Modify: only if verification exposes regressions

- [ ] **Step 1: Run the full automated verification suite**

Run: `.\gradlew.bat test runGameTestServer`  
Expected: unit tests pass and all required GameTests pass.

- [ ] **Step 2: Build the distributable jar**

Run: `.\gradlew.bat build`  
Expected: `BUILD SUCCESSFUL` and an updated jar in `build/libs/`.

- [ ] **Step 3: Smoke-launch the client if the new movement behavior needs live confirmation**

Run: `.\gradlew.bat runClient`  
Expected: client opens and `Him` still wanders naturally while breaking out of obstruction when tested in-world.

- [ ] **Step 4: Inspect the final diff**

Run: `git status --short`  
Expected: only the planned files are changed before the final commit, then a clean working tree after commit.

- [ ] **Step 5: Commit the final phase result**

```bash
git add src/main/java/com/himdev/him/entity/movement/HimEnvironmentPressureTracker.java src/main/java/com/himdev/him/entity/movement/HimEnvironmentDominance.java src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java src/main/java/com/himdev/him/gametest/HimCombatGameTests.java src/main/java/com/himdev/him/gametest/HimTestState.java
git commit -m "feat: let Him overpower environmental restraint"
```
