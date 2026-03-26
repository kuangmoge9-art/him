# Him Leash Immunity Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Make leash state ineffective against `Him`, including both vanilla lead use and direct external leash assignment.

**Architecture:** Keep the change inside `HimEntity`, where other external-control immunities already live. Add one focused GameTest in the invulnerability suite to lock the contract, then implement the minimal entity overrides needed to reject all leash attachment attempts.

**Tech Stack:** Java 17, Minecraft Forge 1.20.1, GameTest framework, JUnit 5

---

### Task 1: Lock the leash immunity contract with a failing GameTest

**Files:**
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\gametest\HimInvulnerabilityGameTests.java`

- [ ] **Step 1: Write the failing test**

```java
Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(2, 0, 4));
assertFalse(him.canBeLeashed(player));
him.setLeashedTo(player, true);
assertFalse(him.isLeashed());
```

- [ ] **Step 2: Run test to verify it fails**

Run: `.\gradlew runGameTestServer --args "--tests him:him_invulnerability_control.himRejectsAllLeashSources"`
Expected: FAIL because `HimEntity` still inherits leash behavior from `Mob`.

### Task 2: Implement the minimal leash rejection

**Files:**
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\entity\HimEntity.java`
- Test: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\gametest\HimInvulnerabilityGameTests.java`

- [ ] **Step 1: Override the vanilla leash eligibility gate**

```java
@Override
public boolean canBeLeashed(Player player) {
    return false;
}
```

- [ ] **Step 2: Override direct leash assignment**

```java
@Override
public void setLeashedTo(Entity entity, boolean sendPacket) {
}
```

- [ ] **Step 3: Run the focused GameTest to verify it passes**

Run: `.\gradlew runGameTestServer --args "--tests him:him_invulnerability_control.himRejectsAllLeashSources"`
Expected: PASS

### Task 3: Verify the focused regression surface

**Files:**
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\entity\HimEntity.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\gametest\HimInvulnerabilityGameTests.java`

- [ ] **Step 1: Run the targeted invulnerability GameTests**

Run: `.\gradlew runGameTestServer --args "--tests him:him_invulnerability_control.*"`
Expected: PASS

- [ ] **Step 2: Run a compile check**

Run: `.\gradlew compileJava compileTestJava`
Expected: BUILD SUCCESSFUL
