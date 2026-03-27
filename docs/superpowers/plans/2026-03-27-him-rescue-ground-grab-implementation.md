# Him Rescue Ground Grab Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Change the rescue grab execution so the hostile mob stays on the ground while `Him` holds it by the neck.

**Architecture:** Keep the current rescue execution flow and fallback logic, but replace the elevated victim anchor with a ground-level anchor in `HimEntity`. Update the client grab transform to render the victim upright with its neck aligned to `Him`'s right hand, then verify both render math and rescue hold geometry with focused tests.

**Tech Stack:** Java 17, Minecraft Forge 1.20.1, Gradle, JUnit 5, Forge GameTest

---

## File Map

- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/client/render/layer/HimGrabVictimTransform.java`
- Modify: `src/test/java/com/himdev/him/client/render/layer/HimGrabVictimTransformTest.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimRescueGameTests.java`

## Responsibility Notes

- `HimEntity.java`: owns the authoritative server-side victim anchor during rescue execution.
- `HimGrabVictimTransform.java`: defines the client-only pose math for the held victim.
- `HimGrabVictimTransformTest.java`: locks the expected upright, ground-held render transform.
- `HimRescueGameTests.java`: locks the rescue hold geometry so the victim no longer floats above the ground.

### Task 1: Replace the hanging render contract with failing upright-grounded tests

**Files:**
- Modify: `D:\mc-mod-dev\Him-dev\src\test\java\com\himdev\him\client\render\layer\HimGrabVictimTransformTest.java`

- [ ] **Step 1: Rewrite the hanging-specific assertions to describe the new upright choke pose**

```java
@Test
void heldVictimTransformKeepsHeadAboveFeet() { ... }

@Test
void heldVictimTransformKeepsFeetNearGroundInsteadOfHangingBelowHand() { ... }
```

- [ ] **Step 2: Keep the existing body-yaw cancellation assertion because facing should still stay fixed**

```java
@Test
void heldVictimTransformCancelsVictimBodyYawSoFacingStaysFixed() { ... }
```

- [ ] **Step 3: Run the focused render transform test and verify it fails for the expected reason**

Run: `.\gradlew.bat test --tests "com.himdev.him.client.render.layer.HimGrabVictimTransformTest"`
Expected: FAIL because the current transform still flips the victim into a hanging pose and drops the feet below the hand.

### Task 2: Replace the airborne victim anchor with a ground-level rescue anchor

**Files:**
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\entity\HimEntity.java`
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\gametest\HimRescueGameTests.java`

- [ ] **Step 1: Add a failing GameTest assertion that the held victim stays near the ground during rescue**

```java
helper.runAfterDelay(6, () -> {
    double groundDelta = zombie.getY() - him.getY();
    helper.assertTrue(groundDelta < 0.6D, "Expected held victim to stay on the ground instead of floating above Him");
});
```

- [ ] **Step 2: Run the focused rescue GameTest and verify it fails before implementation**

Run: `.\gradlew.bat runGameTestServer --args "--tests him:himGrabExecutesNormalHostileRescue"`
Expected: FAIL because the current rescue victim anchor still adds a raised Y offset.

- [ ] **Step 3: Change `rescueExecutionVictimAnchor()` to return a right-front ground-level anchor**

```java
private Vec3 rescueExecutionVictimAnchor() {
    Vec3 forward = horizontalFacingVector(this.getYRot());
    Vec3 right = new Vec3(-forward.z, 0.0D, forward.x);
    return this.position()
            .add(forward.scale(0.35D))
            .add(right.scale(0.55D))
            .add(0.0D, 0.05D, 0.0D);
}
```

- [ ] **Step 4: Re-run the focused rescue GameTest and verify it passes**

Run: `.\gradlew.bat runGameTestServer --args "--tests him:himGrabExecutesNormalHostileRescue"`
Expected: PASS

### Task 3: Update the client victim transform to match the new grounded choke pose

**Files:**
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\client\render\layer\HimGrabVictimTransform.java`
- Test: `D:\mc-mod-dev\Him-dev\src\test\java\com\himdev\him\client\render\layer\HimGrabVictimTransformTest.java`

- [ ] **Step 1: Remove the hanging-specific flip and height drop from the victim transform**

```java
poseStack.translate(HAND_SIDE_OFFSET, -victimHeight * NEW_NECK_ALIGNMENT_RATIO, HAND_FORWARD_OFFSET);
poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - victimBodyYawDegrees));
```

- [ ] **Step 2: Keep the victim upright and tune the vertical offset so the neck sits at the choke hand**

```java
private static final double NECK_ALIGNMENT_RATIO = 0.10D;
```

- [ ] **Step 3: Re-run the focused render transform test and verify it now passes**

Run: `.\gradlew.bat test --tests "com.himdev.him.client.render.layer.HimGrabVictimTransformTest"`
Expected: PASS

### Task 4: Run focused verification and regression checks

**Files:**
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\entity\HimEntity.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\client\render\layer\HimGrabVictimTransform.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\test\java\com\himdev\him\client\render\layer\HimGrabVictimTransformTest.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\gametest\HimRescueGameTests.java`

- [ ] **Step 1: Run the focused unit test suite for the victim transform**

Run: `.\gradlew.bat test --tests "com.himdev.him.client.render.layer.HimGrabVictimTransformTest"`
Expected: PASS

- [ ] **Step 2: Run the focused rescue execution GameTests**

Run: `.\gradlew.bat runGameTestServer --args "--tests him:him_rescue_execution_*"`
Expected: PASS

- [ ] **Step 3: Run a compile check before handoff**

Run: `.\gradlew.bat compileJava compileTestJava`
Expected: BUILD SUCCESSFUL
