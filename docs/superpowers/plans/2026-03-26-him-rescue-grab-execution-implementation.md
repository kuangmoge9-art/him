# Him Rescue Grab Execution Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Replace direct rescue punishment against normal-sized hostile mobs with a short rescue grab execution sequence driven by the live `Him` entity, while preserving instant punishment fallback for oversized or unsafe targets.

**Architecture:** Keep rescue entry in `GuardianRescueController`, but route eligible rescue targets through a focused `HimRescueExecutionController` that starts and validates the sequence. Let `HimEntity` own the active execution state and server-tick hold logic, and keep the final kill inside `DivinePunisher`. Add only the minimum synchronized state needed for `HimModel` and a dedicated render layer to show the one-handed choke pose and hanging victim.

**Tech Stack:** Java 17, Minecraft Forge 1.20.1, Forge GameTest framework, Gradle, Minecraft entity AI/rendering APIs

---

## File Map

- Create: `src/main/java/com/himdev/him/guardian/HimRescueExecutionController.java`
- Create: `src/main/java/com/himdev/him/client/render/layer/HimGrabVictimLayer.java`
- Modify: `src/main/java/com/himdev/him/guardian/GuardianRescueController.java`
- Modify: `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify: `src/main/java/com/himdev/him/world/HimLocator.java`
- Modify: `src/main/java/com/himdev/him/client/model/HimModel.java`
- Modify: `src/main/java/com/himdev/him/client/render/HimRenderer.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimRescueGameTests.java`
- Modify: `src/main/java/com/himdev/him/gametest/HimTestState.java`

## Responsibility Notes

- `HimRescueExecutionController.java`: rescue-specific target eligibility, fallback routing, active `Him` lookup, safe staging-point selection, and start/abort logic for the grab sequence.
- `GuardianRescueController.java`: unchanged rescue trigger and player restoration, plus new routing from direct punishment to rescue execution when appropriate.
- `HimEntity.java`: active rescue state storage, synchronized render flags, per-tick hold logic, victim anchoring, kill timing, and return-to-origin handling.
- `HimLocator.java`: optional helper to resolve the active live `HimEntity` from the stored UUID without duplicating multi-level lookup logic.
- `HimModel.java`: choke pose when rescue execution is visually active.
- `HimRenderer.java`: install the rescue victim render layer.
- `HimGrabVictimLayer.java`: render the held victim at a fixed right-hand anchor during the hold window.
- `HimRescueGameTests.java`: lock the rescue execution contract, oversized fallback, aborted sequence cleanup, and reentry safety.
- `HimTestState.java`: tiny rescue-specific test helpers for spawning/removing the unique `Him` and building any oversized hostile fixtures if needed.

### Task 1: Lock the rescue execution contract with failing GameTests

**Files:**
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\gametest\HimRescueGameTests.java`
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\gametest\HimTestState.java`

- [ ] **Step 1: Add a failing GameTest for the normal-sized hostile rescue execution path**

```java
@GameTest(template = "empty", batch = "him_rescue_execution", timeoutTicks = 240)
public static void himGrabExecutesNormalHostileRescue(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    BlockPos himOrigin = helper.absolutePos(new BlockPos(-4, 0, 0));
    HimEntity him = HimEntity.spawnForTest(level, himOrigin);
    Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 0));
    Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);

    player.setHealth(1.0F);
    player.hurt(level.damageSources().mobAttack(zombie), 20.0F);

    helper.runAfterDelay(6, () -> {
        helper.assertTrue(player.isAlive(), "Expected rescue to keep the player alive");
        helper.assertTrue(zombie.isAlive(), "Expected victim to remain alive during the grab hold window");
        helper.assertTrue(him.distanceToSqr(zombie) < 4.0D, "Expected Him to teleport to the hostile during rescue");
    });

    helper.runAfterDelay(30, () -> {
        helper.assertFalse(zombie.isAlive(), "Expected held hostile to die after the hold window");
        helper.assertTrue(him.distanceToSqr(Vec3.atCenterOf(himOrigin)) < 1.0D, "Expected Him to return to the original rescue position");
        HimTestState.removeHimForTest(helper, him);
        player.remove(Entity.RemovalReason.DISCARDED);
        helper.succeed();
    });
}
```

- [ ] **Step 2: Add a failing GameTest that proves oversized hostiles bypass the grab sequence**

```java
@GameTest(template = "empty", batch = "him_rescue_execution")
public static void himBypassesGrabForOversizedHostileRescue(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    BlockPos himOrigin = helper.absolutePos(new BlockPos(-4, 0, 0));
    HimEntity him = HimEntity.spawnForTest(level, himOrigin);
    Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 0));
    Ravager ravager = helper.spawn(EntityType.RAVAGER, 2, 0, 0);

    player.setHealth(1.0F);
    player.hurt(level.damageSources().mobAttack(ravager), 40.0F);

    helper.runAfterDelay(4, () -> {
        helper.assertFalse(ravager.isAlive(), "Expected oversized hostile to keep the direct punishment path");
        helper.assertTrue(him.distanceToSqr(Vec3.atCenterOf(himOrigin)) < 1.0D, "Expected Him to stay at the original position for oversized rescue targets");
        HimTestState.removeHimForTest(helper, him);
        player.remove(Entity.RemovalReason.DISCARDED);
        helper.succeed();
    });
}
```

- [ ] **Step 3: Add a failing GameTest that invalidates the held victim mid-sequence and expects cleanup**

```java
@GameTest(template = "empty", batch = "him_rescue_execution", timeoutTicks = 240)
public static void himClearsRescueStateWhenHeldVictimDisappears(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    BlockPos himOrigin = helper.absolutePos(new BlockPos(-4, 0, 0));
    HimEntity him = HimEntity.spawnForTest(level, himOrigin);
    Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 0));
    Zombie zombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);

    player.setHealth(1.0F);
    player.hurt(level.damageSources().mobAttack(zombie), 20.0F);

    helper.runAfterDelay(6, () -> zombie.remove(Entity.RemovalReason.DISCARDED));
    helper.runAfterDelay(24, () -> {
        helper.assertFalse(him.isInRescueExecution(), "Expected Him to clear rescue execution state after victim loss");
        helper.assertTrue(him.distanceToSqr(Vec3.atCenterOf(himOrigin)) < 1.0D, "Expected Him to return home after victim loss");
        HimTestState.removeHimForTest(helper, him);
        player.remove(Entity.RemovalReason.DISCARDED);
        helper.succeed();
    });
}
```

- [ ] **Step 4: Add a failing GameTest that proves reentry stays deterministic while `Him` is already holding a victim**

```java
@GameTest(template = "empty", batch = "him_rescue_execution", timeoutTicks = 300)
public static void himRescueReentryFallsBackSafelyDuringActiveGrab(GameTestHelper helper) {
    HimTestState.resetUniqueHim(helper);
    ServerLevel level = helper.getLevel();
    BlockPos himOrigin = helper.absolutePos(new BlockPos(-4, 0, 0));
    HimEntity him = HimEntity.spawnForTest(level, himOrigin);
    Player firstPlayer = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 0));
    Player secondPlayer = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(0, 0, 4));
    Zombie firstZombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 0);
    Zombie secondZombie = helper.spawn(EntityType.ZOMBIE, 2, 0, 4);

    firstPlayer.setHealth(1.0F);
    secondPlayer.setHealth(1.0F);
    firstPlayer.hurt(level.damageSources().mobAttack(firstZombie), 20.0F);
    helper.runAfterDelay(4, () -> secondPlayer.hurt(level.damageSources().mobAttack(secondZombie), 20.0F));

    helper.runAfterDelay(40, () -> {
        helper.assertFalse(firstZombie.isAlive(), "Expected the first rescue victim to die");
        helper.assertFalse(secondZombie.isAlive(), "Expected the second rescue path to stay lethal even during active grab");
        helper.assertTrue(firstPlayer.isAlive() && secondPlayer.isAlive(), "Expected both rescues to succeed");
        HimTestState.removeHimForTest(helper, him);
        firstPlayer.remove(Entity.RemovalReason.DISCARDED);
        secondPlayer.remove(Entity.RemovalReason.DISCARDED);
        helper.succeed();
    });
}
```

- [ ] **Step 5: Add only the smallest test helper additions needed for rescue fixtures**

```java
public static void cleanupEntity(Entity entity) { ... }
public static Vec3 center(BlockPos pos) { ... }
```

- [ ] **Step 6: Run the focused rescue GameTests to verify they fail before implementation**

Run: `.\gradlew.bat runGameTestServer --args "--tests him:him_rescue_execution.*"`
Expected: FAIL because rescue punishment still routes directly to `DivinePunisher` and `HimEntity` has no rescue execution state.

- [ ] **Step 7: Commit the failing rescue execution tests**

```bash
git add src/main/java/com/himdev/him/gametest/HimRescueGameTests.java src/main/java/com/himdev/him/gametest/HimTestState.java
git commit -m "test: add Him rescue grab execution coverage"
```

### Task 2: Add rescue-execution routing and live `Him` lookup

**Files:**
- Create: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\guardian\HimRescueExecutionController.java`
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\guardian\GuardianRescueController.java`
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\world\HimLocator.java`

- [ ] **Step 1: Add an active-entity lookup helper in `HimLocator` so rescue code can resolve the unique live `Him`**

```java
public static HimEntity activeHim(ServerLevel level) {
    UUID himId = currentHimId(level);
    Entity entity = himId == null ? null : level.getEntity(himId);
    return entity instanceof HimEntity him && him.isAlive() && !him.isRemoved() ? him : null;
}
```

- [ ] **Step 2: Create `HimRescueExecutionController` with narrow target-eligibility checks**

```java
public boolean canUseGrabExecution(Entity target) {
    if (!(target instanceof LivingEntity living) || !(living instanceof Enemy)) {
        return false;
    }
    return living.getBbWidth() <= 1.4F && living.getBbHeight() <= 2.4F;
}
```

- [ ] **Step 3: Add safe fallback routing that preserves the current direct punishment path**

```java
public void executeOrFallback(ServerLevel level, UUID targetId) {
    Entity target = level.getEntity(targetId);
    HimEntity him = HimLocator.activeHim(level);
    if (target == null || him == null || !canUseGrabExecution(target) || !start(level, him, (LivingEntity) target)) {
        punisher.punish(level, targetId);
    }
}
```

- [ ] **Step 4: Add safe staging-point selection in front of the victim with lateral fallback probes**

```java
private @Nullable Vec3 findStagingPoint(ServerLevel level, HimEntity him, LivingEntity target) {
    Vec3 forward = target.getLookAngle().normalize();
    for (Vec3 offset : List.of(forward.scale(-0.85D), new Vec3(-forward.z, 0.0D, forward.x), new Vec3(forward.z, 0.0D, -forward.x))) {
        Vec3 candidate = target.position().add(offset);
        if (isSafeForHim(level, him, candidate)) {
            return candidate;
        }
    }
    return null;
}
```

- [ ] **Step 5: Route `GuardianRescueController` through the new controller instead of direct punishment**

```java
private static final HimRescueExecutionController RESCUE_EXECUTION = new HimRescueExecutionController(DIVINE_PUNISHER);
...
RESCUE_EXECUTION.executeOrFallback(serverLevel, resolution.targetEntityId());
```

- [ ] **Step 6: Run `compileJava` to verify the new routing layer integrates cleanly**

Run: `.\gradlew.bat compileJava`
Expected: BUILD SUCCESSFUL while the new rescue execution GameTests still fail because `HimEntity` does not yet implement the hold sequence.

- [ ] **Step 7: Commit the rescue routing layer**

```bash
git add src/main/java/com/himdev/him/guardian/HimRescueExecutionController.java src/main/java/com/himdev/him/guardian/GuardianRescueController.java src/main/java/com/himdev/him/world/HimLocator.java
git commit -m "feat: route Him rescue punishment through execution controller"
```

### Task 3: Add `HimEntity` rescue execution state, hold logic, and return-to-origin behavior

**Files:**
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\entity\HimEntity.java`
- Test: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\gametest\HimRescueGameTests.java`

- [ ] **Step 1: Add minimal rescue-execution state fields to `HimEntity`**

```java
private enum RescueExecutionPhase { IDLE, HOLDING, RETURNING }

private RescueExecutionPhase rescueExecutionPhase = RescueExecutionPhase.IDLE;
private UUID rescueExecutionTargetId;
private Vec3 rescueReturnPos;
private float rescueReturnYRot;
private float rescueReturnXRot;
private int rescueExecutionTicksRemaining;
private int rescueExecutionVictimId = -1;
private boolean rescueExecutionVisualActive;
```

- [ ] **Step 2: Add a focused start method that captures origin, teleports `Him`, and arms the timer**

```java
public boolean startRescueExecution(LivingEntity target, Vec3 stagingPoint, int holdTicks) {
    if (isInRescueExecution() || !isValidCombatTarget(target)) {
        return false;
    }
    rescueReturnPos = position();
    rescueReturnYRot = getYRot();
    rescueReturnXRot = getXRot();
    rescueExecutionTargetId = target.getUUID();
    rescueExecutionVictimId = target.getId();
    rescueExecutionTicksRemaining = holdTicks;
    rescueExecutionPhase = RescueExecutionPhase.HOLDING;
    moveTo(stagingPoint.x, stagingPoint.y, stagingPoint.z, target.getYRot(), getXRot());
    return true;
}
```

- [ ] **Step 3: Add synchronized accessors for the active victim and visual state**

```java
public boolean isInRescueExecution() { ... }
public int rescueExecutionVictimId() { ... }
public boolean isRescueExecutionVisualActive() { ... }
```

- [ ] **Step 4: Short-circuit normal AI during rescue execution and tick the hold sequence explicitly**

```java
@Override
protected void customServerAiStep() {
    ...
    if (level() instanceof ServerLevel serverLevel && tickRescueExecution(serverLevel)) {
        return;
    }
    super.customServerAiStep();
}
```

- [ ] **Step 5: Implement per-tick victim anchoring, full freeze, delayed kill, and immediate return**

```java
private boolean tickRescueExecution(ServerLevel level) {
    LivingEntity victim = resolveRescueExecutionVictim(level);
    if (rescueExecutionPhase != RescueExecutionPhase.HOLDING || victim == null || !victim.isAlive()) {
        return finishRescueExecution();
    }

    getNavigation().stop();
    setTarget(null);
    setDeltaMovement(Vec3.ZERO);
    Vec3 anchor = rescueExecutionVictimAnchor();
    victim.getNavigation().stop();
    victim.setDeltaMovement(Vec3.ZERO);
    victim.moveTo(anchor.x, anchor.y, anchor.z, victim.getYRot(), victim.getXRot());

    if (--rescueExecutionTicksRemaining <= 0) {
        DIVINE_PUNISHER.punish(level, victim);
        return finishRescueExecution();
    }
    return true;
}
```

- [ ] **Step 6: Clear all transient state on every exit path**

```java
private boolean finishRescueExecution() {
    moveTo(rescueReturnPos.x, rescueReturnPos.y, rescueReturnPos.z, rescueReturnYRot, rescueReturnXRot);
    rescueExecutionTargetId = null;
    rescueExecutionVictimId = -1;
    rescueExecutionTicksRemaining = 0;
    rescueExecutionVisualActive = false;
    rescueExecutionPhase = RescueExecutionPhase.IDLE;
    return true;
}
```

- [ ] **Step 7: Run the focused rescue GameTests to verify server behavior now passes**

Run: `.\gradlew.bat runGameTestServer --args "--tests him:him_rescue_execution.*"`
Expected: PASS for the rescue execution GameTests, even though the client-side grab pose/render layer is not implemented yet.

- [ ] **Step 8: Commit the server-side rescue execution behavior**

```bash
git add src/main/java/com/himdev/him/entity/HimEntity.java src/main/java/com/himdev/him/gametest/HimRescueGameTests.java
git commit -m "feat: add Him rescue grab execution state"
```

### Task 4: Add the rescue grab pose and victim render layer

**Files:**
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\client\model\HimModel.java`
- Modify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\client\render\HimRenderer.java`
- Create: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\client\render\layer\HimGrabVictimLayer.java`

- [ ] **Step 1: Override `setupAnim(...)` in `HimModel` so rescue execution enters a dedicated choke pose**

```java
@Override
public void setupAnim(HimEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    if (!entity.isRescueExecutionVisualActive()) {
        return;
    }
    rightArm.xRot = -1.35F;
    rightArm.yRot = -0.25F;
    leftArm.xRot = 0.10F;
    body.yRot = 0.12F;
    rightLeg.xRot = 0.0F;
    leftLeg.xRot = 0.0F;
}
```

- [ ] **Step 2: Create `HimGrabVictimLayer` to render the held victim at a fixed right-hand anchor**

```java
public void render(PoseStack poseStack, MultiBufferSource buffer, int packedLight, HimEntity him, ...) {
    if (!him.isRescueExecutionVisualActive()) {
        return;
    }
    Entity victim = him.level().getEntity(him.rescueExecutionVictimId());
    if (!(victim instanceof LivingEntity living) || !living.isAlive()) {
        return;
    }
    poseStack.pushPose();
    translateToHandAnchor(poseStack, him);
    entityRenderDispatcher.render(living, 0.0D, 0.0D, 0.0D, 0.0F, partialTick, poseStack, buffer, packedLight);
    poseStack.popPose();
}
```

- [ ] **Step 3: Register the new layer from `HimRenderer`**

```java
public HimRenderer(EntityRendererProvider.Context context) {
    super(context, new HimModel(context.bakeLayer(HimModel.LAYER_LOCATION)), 0.5F);
    this.addLayer(new HimEyesLayer(this));
    this.addLayer(new HimGrabVictimLayer(this, context.getEntityRenderDispatcher()));
}
```

- [ ] **Step 4: Keep the layer narrow and visual-only**

Do not add gameplay logic, kill timing, or fallback routing to the render layer. It should render what the server already decided.

- [ ] **Step 5: Run `compileJava` to verify client classes integrate cleanly**

Run: `.\gradlew.bat compileJava`
Expected: BUILD SUCCESSFUL

- [ ] **Step 6: Commit the rescue presentation layer**

```bash
git add src/main/java/com/himdev/him/client/model/HimModel.java src/main/java/com/himdev/him/client/render/HimRenderer.java src/main/java/com/himdev/him/client/render/layer/HimGrabVictimLayer.java
git commit -m "feat: render Him rescue grab execution"
```

### Task 5: Run focused verification and regression checks

**Files:**
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\guardian\GuardianRescueController.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\guardian\HimRescueExecutionController.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\entity\HimEntity.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\client\model\HimModel.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\client\render\HimRenderer.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\client\render\layer\HimGrabVictimLayer.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\gametest\HimRescueGameTests.java`

- [ ] **Step 1: Run the focused rescue execution suite**

Run: `.\gradlew.bat runGameTestServer --args "--tests him:him_rescue_execution.*"`
Expected: PASS

- [ ] **Step 2: Run the full rescue regression suite**

Run: `.\gradlew.bat runGameTestServer --args "--tests him:him_rescue_*.*"`
Expected: PASS for both the new rescue execution coverage and the existing environmental rescue coverage.

- [ ] **Step 3: Run punishment regression coverage that the rescue path still depends on**

Run: `.\gradlew.bat runGameTestServer --args "--tests him:him_punishment_*.*"`
Expected: PASS

- [ ] **Step 4: Run a compile check before handoff**

Run: `.\gradlew.bat compileJava compileTestJava`
Expected: BUILD SUCCESSFUL

- [ ] **Step 5: Review render and fallback edge cases manually in code before closing**

Confirm all exit paths clear rescue state, oversized targets still bypass the visual sequence, and the render layer cannot resurrect or duplicate a removed victim.
