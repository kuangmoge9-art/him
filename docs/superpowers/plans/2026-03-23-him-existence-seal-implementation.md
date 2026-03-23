# Him Existence Seal Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Make `Him` impossible to permanently erase from inside the running game by recording his return point and recreating him immediately if an in-process removal still succeeds.

**Architecture:** Keep `HimEntity` focused on current behavior and lightweight recording hooks, and move return-state persistence plus reappearance logic into dedicated world-side helpers. Use a saved return record plus a server-side watcher so uniqueness, recovery, and respawn behavior stay testable and do not get tangled into every entity lifecycle branch.

**Tech Stack:** Forge 1.20.1, Java 17, Forge GameTest framework, Gradle, Minecraft SavedData

---

## File Map

- Create: `src/main/java/com/himdev/him/world/HimReturnSavedData.java`
- Create: `src/main/java/com/himdev/him/world/HimExistenceSeal.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/world/HimLocator.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`

### Responsibility Notes

- `HimReturnSavedData.java`: persistent world record for current `Him` return state: dimension, position, and facing.
- `HimExistenceSeal.java`: world-side API for updating the record, detecting missing `Him`, and respawning him without creating duplicates.
- `HimEntity.java`: report live position/facing into the seal and notify the seal when an authorized removal happens.
- `HimLocator.java`: continue owning uniqueness, with any small helper additions needed by the seal.
- `HimInvulnerabilityGameTests.java`: prove forced in-process removal leads to return, preserves basic state, and keeps uniqueness.
- `HimTestState.java`: clear both the uniqueness record and the new return record between tests.

### Task 1: Add Failing Proof For Deletion Return

**Files:**
- Modify: `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`

- [ ] **Step 1: Add a failing GameTest that authorizes a real removal and expects `Him` to return**

```java
@GameTest(template = "empty", batch = "him_existence_return")
public static void himReturnsAfterAuthorizedRemoval(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    HimEntity him = HimEntity.spawnForTest(level, helper.absolutePos(BlockPos.ZERO));
    UUID originalId = him.getUUID();

    HimRemovalAuthorizer.authorize(originalId);
    him.remove(Entity.RemovalReason.DISCARDED);

    helper.runAfterDelay(5, () -> {
        var himEntities = level.getEntitiesOfClass(HimEntity.class, him.getBoundingBox().inflate(8.0D));
        if (himEntities.isEmpty()) {
            throw new GameTestAssertException("Expected Him to return after authorized removal");
        }
        if (himEntities.stream().noneMatch(Entity::isAlive)) {
            throw new GameTestAssertException("Expected returned Him to be alive");
        }
        HimTestState.resetUniqueHim(helper);
        helper.succeed();
    });
}
```

- [ ] **Step 2: Add a failing GameTest that checks returned location and facing**

```java
@GameTest(template = "empty", batch = "him_existence_return_state")
public static void himReturnPreservesBasicState(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    HimEntity him = HimEntity.spawnForTest(level, helper.absolutePos(new BlockPos(3, 0, 1)));
    him.setYRot(135.0F);
    him.setXRot(10.0F);

    HimRemovalAuthorizer.authorize(him.getUUID());
    him.remove(Entity.RemovalReason.DISCARDED);

    helper.runAfterDelay(5, () -> {
        HimEntity returned = level.getEntitiesOfClass(HimEntity.class, him.getBoundingBox().inflate(8.0D))
                .stream()
                .findFirst()
                .orElseThrow(() -> new GameTestAssertException("Expected returned Him"));
        if (returned.distanceToSqr(him.getX(), him.getY(), him.getZ()) > 4.0D) {
            throw new GameTestAssertException("Expected returned Him near recorded position");
        }
        if (Math.abs(returned.getYRot() - 135.0F) > 5.0F) {
            throw new GameTestAssertException("Expected returned Him to preserve yaw");
        }
        HimTestState.resetUniqueHim(helper);
        helper.succeed();
    });
}
```

- [ ] **Step 3: Add a failing uniqueness-after-return check**

```java
@GameTest(template = "empty", batch = "him_existence_uniqueness")
public static void himReturnDoesNotCreateDuplicates(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    HimEntity him = HimEntity.spawnForTest(level, helper.absolutePos(BlockPos.ZERO));

    HimRemovalAuthorizer.authorize(him.getUUID());
    him.remove(Entity.RemovalReason.DISCARDED);

    helper.runAfterDelay(5, () -> {
        var himEntities = level.getEntitiesOfClass(HimEntity.class, him.getBoundingBox().inflate(32.0D));
        if (himEntities.size() != 1) {
            throw new GameTestAssertException("Expected exactly one Him after return, got " + himEntities.size());
        }
        HimTestState.resetUniqueHim(helper);
        helper.succeed();
    });
}
```

- [ ] **Step 4: Extend test reset so it will later be able to clear return-state data too**

```java
public static void resetUniqueHim(GameTestHelper helper) {
    ...
    HimExistenceSeal.clear(helper.getLevel().getServer());
}
```

- [ ] **Step 5: Run GameTests to verify the new return cases fail before implementation**

Run: `.\gradlew.bat runGameTestServer`  
Expected: the new `him_existence_*` tests fail because current code allows authorized removal without return.

- [ ] **Step 6: Commit the failing return tests**

```bash
git add src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java src/main/java/com/himdev/him/gametest/HimTestState.java
git commit -m "test: add Him existence seal coverage"
```

### Task 2: Add Persistent Return Record

**Files:**
- Create: `src/main/java/com/himdev/him/world/HimReturnSavedData.java`
- Create: `src/main/java/com/himdev/him/world/HimExistenceSeal.java`
- Modify: `src/main/java/com/himdev/him/world/HimLocator.java`

- [ ] **Step 1: Create a saved-data record for dimension, position, and facing**

```java
public final class HimReturnSavedData extends SavedData {
    private ResourceKey<Level> dimension = Level.OVERWORLD;
    private double x;
    private double y;
    private double z;
    private float yRot;
    private float xRot;
    private boolean present;
    ...
}
```

- [ ] **Step 2: Add `load(...)`, `save(...)`, and update/clear methods**

```java
public void update(ResourceKey<Level> dimension, double x, double y, double z, float yRot, float xRot) {
    this.dimension = dimension;
    this.x = x;
    this.y = y;
    this.z = z;
    this.yRot = yRot;
    this.xRot = xRot;
    this.present = true;
    setDirty();
}

public void clear() {
    this.present = false;
    setDirty();
}
```

- [ ] **Step 3: Create `HimExistenceSeal` as the world-side API**

```java
public final class HimExistenceSeal {
    public static void updateFrom(HimEntity him) { ... }
    public static void clear(MinecraftServer server) { ... }
    public static Optional<ReturnState> current(MinecraftServer server) { ... }
}
```

- [ ] **Step 4: Reuse the overworld data storage pattern already used by `HimLocator`**

```java
private static HimReturnSavedData getData(MinecraftServer server) {
    return server.overworld().getDataStorage().computeIfAbsent(...);
}
```

- [ ] **Step 5: Add any small helper in `HimLocator` needed to support return-time uniqueness checks**

```java
public static boolean hasActiveHim(ServerLevel level) {
    UUID current = currentHimId(level);
    return current != null && level.getServer().getEntity(current) != null;
}
```

- [ ] **Step 6: Run `compileJava` to verify the new persistence layer compiles cleanly**

Run: `.\gradlew.bat compileJava`  
Expected: compilation succeeds even though return behavior is not wired yet.

- [ ] **Step 7: Commit the return-record layer**

```bash
git add src/main/java/com/himdev/him/world/HimReturnSavedData.java src/main/java/com/himdev/him/world/HimExistenceSeal.java src/main/java/com/himdev/him/world/HimLocator.java
git commit -m "feat: add Him return state persistence"
```

### Task 3: Wire Live Recording And Immediate Return

**Files:**
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/world/HimExistenceSeal.java`

- [ ] **Step 1: Update the return record whenever `Him` is alive on the server**

```java
@Override
protected void customServerAiStep() {
    HimExistenceSeal.updateFrom(this);
    ...
}
```

- [ ] **Step 2: On authorized removal, hand control to the existence seal before the entity fully leaves**

```java
@Override
public void remove(RemovalReason reason) {
    boolean authorized = ...
    if (authorized && level() instanceof ServerLevel serverLevel && reason.shouldDestroy()) {
        HimExistenceSeal.handleAuthorizedRemoval(serverLevel, this, reason);
    }
    super.remove(reason);
}
```

- [ ] **Step 3: Implement `handleAuthorizedRemoval(...)` to respawn immediately if the removal should be sealed**

```java
public static void handleAuthorizedRemoval(ServerLevel level, HimEntity him, RemovalReason reason) {
    updateFrom(him);
    level.getServer().execute(() -> ensurePresent(level.getServer()));
}
```

- [ ] **Step 4: Implement `ensurePresent(...)` so it recreates `Him` only when the unique guardian is actually missing**

```java
public static void ensurePresent(MinecraftServer server) {
    ReturnState state = current(server).orElse(null);
    if (state == null) {
        return;
    }
    ServerLevel targetLevel = server.getLevel(state.dimension());
    if (targetLevel == null || HimLocator.hasActiveHim(targetLevel)) {
        return;
    }
    HimEntity him = HimEntityTypes.HIM.get().create(targetLevel);
    ...
    targetLevel.addFreshEntity(him);
}
```

- [ ] **Step 5: Restore recorded location and facing on return**

```java
him.moveTo(state.x(), state.y(), state.z(), state.yRot(), state.xRot());
```

- [ ] **Step 6: Keep the respawn path narrow so duplicate spawn rejection still works as the last line of defense**

Do not bypass existing uniqueness registration in `onAddedToWorld()`. The seal should recreate `Him`, not sidestep the uniqueness guard.

- [ ] **Step 7: Run GameTests to verify the new existence-return cases now pass**

Run: `.\gradlew.bat runGameTestServer`  
Expected: the new `him_existence_*` tests pass and the prior invulnerability tests remain green.

- [ ] **Step 8: Commit the wired return behavior**

```bash
git add src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/world/HimExistenceSeal.java
git commit -m "feat: make Him return after authorized removal"
```

### Task 4: Tighten Reset And Regression Safety

**Files:**
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`
- Modify: `src/main/java/com/himdev/him/world/HimExistenceSeal.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`

- [ ] **Step 1: Make test reset clear both the uniqueness record and the return record**

```java
public static void resetUniqueHim(GameTestHelper helper) {
    ...
    HimExistenceSeal.clear(helper.getLevel().getServer());
}
```

- [ ] **Step 2: Add a regression test proving rescue/combat still work after a return cycle if needed**

```java
@GameTest(template = "empty", batch = "him_existence_regression")
public static void himStillProtectsWorldAfterReturn(GameTestHelper helper) {
    ...
}
```

Only add this if the simpler return tests do not already cover enough behavior to catch regressions.

- [ ] **Step 3: Run the full GameTest suite**

Run: `.\gradlew.bat runGameTestServer`  
Expected: all required tests pass, including the new return coverage.

- [ ] **Step 4: Commit reset/regression hardening**

```bash
git add src/main/java/com/himdev/him/gametest/HimTestState.java src/main/java/com/himdev/him/world/HimExistenceSeal.java src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java
git commit -m "test: lock down Him return regressions"
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

- [ ] **Step 3: Smoke-launch the client if return behavior needs live confirmation**

Run: `.\gradlew.bat runClient`  
Expected: client opens and `Him` can still be spawned normally after the existence-seal change.

- [ ] **Step 4: Inspect the final diff**

Run: `git status --short`  
Expected: only the planned files are changed before the final commit, then a clean working tree after commit.

- [ ] **Step 5: Commit the final phase result**

```bash
git add src/main/java/com/himdev/him/world/HimReturnSavedData.java src/main/java/com/himdev/him/world/HimExistenceSeal.java src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/world/HimLocator.java src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java src/main/java/com/himdev/him/gametest/HimTestState.java
git commit -m "feat: seal Him existence in-process"
```
