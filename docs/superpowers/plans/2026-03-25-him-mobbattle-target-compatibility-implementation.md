# Him MobBattle Target Compatibility Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Make `HIM` respect external hostile target assignments such as MobBattle's mob stick without breaking the existing anger-only combat rules.

**Architecture:** Keep `angerTarget` as the single combat source of truth, but let `setTarget(...)` ingest valid external hostile targets into that state. Preserve current target validation and target clearing semantics so recovery logic and player safety remain unchanged.

**Tech Stack:** Java 17, Minecraft Forge GameTest, existing `HimEntity` AI goals

---

### Task 1: Lock the compatibility contract with a failing GameTest

**Files:**
- Modify: `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`
- Test: `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`

- [ ] **Step 1: Write the failing external-target test**

```java
@GameTest(template = "empty", batch = "him_combat_external_target")
public static void himAcceptsExternalHostileTargetAssignments(GameTestHelper helper) {
    // Spawn Him, an attacker zombie, and an uninvolved bystander.
    // Simulate MobBattle by calling him.setTarget(attacker).
    // Assert the attacker is punished and the bystander remains alive.
}
```

- [ ] **Step 2: Run the test to verify it fails**

Run: `./gradlew.bat runGameTestServer --args "--tests him:himAcceptsExternalHostileTargetAssignments"`
Expected: FAIL because `synchronizeAngerTarget()` clears the externally assigned target.

### Task 2: Synchronize external target assignments into anger state

**Files:**
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`

- [ ] **Step 1: Override `setTarget` with anger-state synchronization**

```java
@Override
public void setTarget(@Nullable LivingEntity target) {
    if (target == null) {
        angerTarget = null;
        super.setTarget(null);
        return;
    }
    if (isValidAngerTarget(target)) {
        angerTarget = target;
        super.setTarget(target);
        return;
    }
    super.setTarget(target);
}
```

- [ ] **Step 2: Keep existing hurt-based anger capture intact**

```java
// No behavioral broadening in hurt(); external target compatibility flows through setTarget.
```

### Task 3: Verify no regression in focused combat behavior

**Files:**
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`

- [ ] **Step 1: Run the new compatibility test and existing focused combat tests**

Run: `./gradlew.bat runGameTestServer --args "--tests him:himAcceptsExternalHostileTargetAssignments,him:himDoesNotAttackNearbyHostileMobWithoutAnger,him:himAttacksOnlyHostileMobThatAngeredHim,him:himNeverTargetsPlayer"`
Expected: PASS

- [ ] **Step 2: Review the final diff**

Run: `git diff -- src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/gametest/HimCombatGameTests.java docs/superpowers/specs/2026-03-25-him-mobbattle-target-compatibility-design.md docs/superpowers/plans/2026-03-25-him-mobbattle-target-compatibility-implementation.md`
