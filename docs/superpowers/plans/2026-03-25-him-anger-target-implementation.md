# Him Anger Target Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Change `Him` so he only attacks the hostile mob currently holding his anger, and stays passive when no anger target exists.

**Architecture:** Keep combat execution in the existing melee/ranged punish goals and move the behavior change into `HimEntity`. Replace proactive hostile scanning with a single anger target recorded from incoming attacks, synchronized through `setTarget`, and cleared when that target becomes invalid.

**Tech Stack:** Java 17, Minecraft Forge GameTest, existing `HimEntity` AI goals

---

### Task 1: Lock the new combat contract with GameTests

**Files:**
- Modify: `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`
- Test: `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`

- [ ] **Step 1: Write the failing passive-behavior test**

```java
@GameTest(template = "empty", batch = "him_combat_hostile")
public static void himDoesNotAttackNearbyHostileMobWithoutAnger(GameTestHelper helper) {
    // Spawn Him and a nearby zombie, wait, and assert the zombie remains alive
    // and Him does not hold that zombie as a target.
}
```

- [ ] **Step 2: Run the test to verify it fails**

Run: `./gradlew.bat runGameTestServer --args "--tests him:himDoesNotAttackNearbyHostileMobWithoutAnger"`
Expected: FAIL because current code proactively targets nearby hostile mobs.

- [ ] **Step 3: Write the failing anger-retaliation test**

```java
@GameTest(template = "empty", batch = "him_combat_hostile")
public static void himAttacksOnlyHostileMobThatAngeredHim(GameTestHelper helper) {
    // Make one zombie attack Him, keep another nearby zombie uninvolved,
    // and assert only the attacker is targeted and punished.
}
```

- [ ] **Step 4: Run the anger-retaliation test to verify it fails**

Run: `./gradlew.bat runGameTestServer --args "--tests him:himAttacksOnlyHostileMobThatAngeredHim"`
Expected: FAIL because current code does not persist a dedicated anger target.

### Task 2: Replace proactive targeting with a single anger target

**Files:**
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`

- [ ] **Step 1: Add a dedicated anger target field and validation helpers**

```java
private LivingEntity angerTarget;

private boolean isValidAngerTarget(LivingEntity target) {
    return isValidCombatTarget(target) && target.distanceToSqr(this) <= getAttributeValue(Attributes.FOLLOW_RANGE) * getAttributeValue(Attributes.FOLLOW_RANGE);
}
```

- [ ] **Step 2: Capture the attacker inside `hurt`**

```java
@Override
public boolean hurt(DamageSource source, float amount) {
    LivingEntity attacker = resolveLivingAttacker(source);
    if (isValidCombatTarget(attacker)) {
        angerTarget = attacker;
        setTarget(attacker);
    }
    return false;
}
```

- [ ] **Step 3: Remove proactive targeting paths**

```java
// Delete NearestAttackableTargetGoal registration
// Delete the customServerAiStep() fallback that scans nearest hostile mobs
```

- [ ] **Step 4: Keep the live target synchronized to anger state**

```java
if (!isValidAngerTarget(angerTarget)) {
    angerTarget = null;
}
if (getTarget() != angerTarget) {
    setTarget(angerTarget);
}
```

### Task 3: Verify the focused combat behavior

**Files:**
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`

- [ ] **Step 1: Run the focused combat tests**

Run: `./gradlew.bat runGameTestServer --args "--tests him:himDoesNotAttackNearbyHostileMobWithoutAnger,him:himAttacksOnlyHostileMobThatAngeredHim,him:himNeverTargetsPlayer"`
Expected: PASS

- [ ] **Step 2: Review diff for unintended behavior changes**

Run: `git diff -- src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/gametest/HimCombatGameTests.java docs/superpowers/plans/2026-03-25-him-anger-target-implementation.md`

