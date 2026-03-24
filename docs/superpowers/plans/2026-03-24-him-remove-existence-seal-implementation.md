# Him Remove Existence Seal Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Remove `Him`'s automatic return-after-removal behavior and the external-removal retaliation path without changing unrelated abilities.

**Architecture:** Delete the existence-seal recovery loop and external-threat retaliation integration, then update GameTests and helper cleanup code to reflect removal as a terminal state. Preserve unauthorized deletion blocking and all non-removal gameplay behavior.

**Tech Stack:** Java, Minecraft Forge 1.20.1, Forge GameTest, Gradle

---

### Task 1: Update Removal Expectations First

**Files:**
- Modify: `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`

- [ ] **Step 1: Write the failing test**

Change the removal GameTests so they expect `Him` to remain absent after `setRemoved(...)` and authorized `remove(...)`, and remove retaliation-only tests.

- [ ] **Step 2: Run test to verify it fails**

Run: `./gradlew.bat test --tests com.himdev.him.gametest.HimInvulnerabilityGameTests`
Expected: FAIL because the current existence-seal logic still recreates `Him`.

- [ ] **Step 3: Write minimal implementation**

Remove the production code that restores `Him` after removal and remove retaliation triggering.

- [ ] **Step 4: Run test to verify it passes**

Run: `./gradlew.bat test --tests com.himdev.him.gametest.HimInvulnerabilityGameTests`
Expected: PASS for the updated removal expectations.

- [ ] **Step 5: Commit**

```bash
git add src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java src/main/java/com/himdev/him/world/HimExistenceSeal.java src/main/java/com/himdev/him/world/HimExistenceWatcher.java src/main/java/com/himdev/him/guardian/ExternalThreatRetaliator.java
git commit -m "refactor: remove Him existence seal recovery"
```

### Task 2: Remove Existence-Seal Recovery Wiring

**Files:**
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`
- Delete: `src/main/java/com/himdev/him/world/HimExistenceSeal.java`
- Delete: `src/main/java/com/himdev/him/world/HimExistenceWatcher.java`
- Delete: `src/main/java/com/himdev/him/guardian/ExternalThreatRetaliator.java`

- [ ] **Step 1: Write the failing test**

Use the updated removal GameTests from Task 1 as the red state.

- [ ] **Step 2: Run test to verify it fails**

Run: `./gradlew.bat test --tests com.himdev.him.gametest.HimInvulnerabilityGameTests`
Expected: FAIL while removed `Him` is still being restored.

- [ ] **Step 3: Write minimal implementation**

Delete the existence-seal classes, remove their imports/usages, and keep helper cleanup focused on uniqueness only.

- [ ] **Step 4: Run test to verify it passes**

Run: `./gradlew.bat test --tests com.himdev.him.gametest.HimInvulnerabilityGameTests`
Expected: PASS.

- [ ] **Step 5: Commit**

```bash
git add src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/gametest/HimTestState.java src/main/java/com/himdev/him/world/HimExistenceSeal.java src/main/java/com/himdev/him/world/HimExistenceWatcher.java src/main/java/com/himdev/him/guardian/ExternalThreatRetaliator.java
git commit -m "refactor: remove Him removal recovery wiring"
```

### Task 3: Verify Unrelated Behavior Still Holds

**Files:**
- Modify: `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`
- Test: `src/main/java/com/himdev/him/gametest/HimRescueGameTests.java`

- [ ] **Step 1: Write the failing test**

No new production behavior is added here; use regression tests already present for unchanged abilities.

- [ ] **Step 2: Run test to verify baseline**

Run: `./gradlew.bat test --tests com.himdev.him.gametest.HimInvulnerabilityGameTests --tests com.himdev.him.gametest.HimRescueGameTests`
Expected: PASS for unauthorized deletion resistance, invulnerability, environment dominance, void recovery, and rescue behavior.

- [ ] **Step 3: Write minimal implementation**

Only adjust tests or helpers if a failure is caused by removed existence-seal assumptions.

- [ ] **Step 4: Run test to verify it passes**

Run: `./gradlew.bat test --tests com.himdev.him.gametest.HimInvulnerabilityGameTests --tests com.himdev.him.gametest.HimRescueGameTests`
Expected: PASS.

- [ ] **Step 5: Commit**

```bash
git add src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java src/main/java/com/himdev/him/gametest/HimRescueGameTests.java
git commit -m "test: verify Him behavior after removal rollback"
```
