# Him MobBottle Immunity Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Make MobBottle unable to capture or release `Him`, and purify any already-filled `Him` bottle into an empty MobBottle instead of spawning `Him`.

**Architecture:** Keep the change isolated in the compat layer. Add a small `MobBottleCompat` helper for `Him` entity/NBT detection, then use `@Pseudo` mixins against `MobBottleBlockItem` to block the capture path and purify the release path before entity creation happens. Do not change `HimEntity` core behavior.

**Tech Stack:** Java 17, Minecraft Forge 1.20.1, Sponge Mixin, JUnit 5

---

### Task 1: Lock the compat contract with tests

**Files:**
- Modify: `D:\mc-mod-dev\Him-dev\src\test\java\com\himdev\him\compat\UltimateSkeletonsCompatMixinConfigTest.java`
- Create: `D:\mc-mod-dev\Him-dev\src\test\java\com\himdev\him\compat\MobBottleCompatTest.java`

- [ ] **Step 1: Write the failing mixin registration test**

```java
assertTrue(config.contains("\"MobBottleBlockItemCaptureMixin\""));
assertTrue(config.contains("\"MobBottleBlockItemUseOnMixin\""));
assertNotNull(Class.forName("com.himdev.him.compat.mixin.MobBottleBlockItemCaptureMixin"));
assertNotNull(Class.forName("com.himdev.him.compat.mixin.MobBottleBlockItemUseOnMixin"));
```

- [ ] **Step 2: Run test to verify it fails**

Run: `.\gradlew test --tests com.himdev.him.compat.UltimateSkeletonsCompatMixinConfigTest`
Expected: FAIL because the new MobBottle mixins are not registered yet.

- [ ] **Step 3: Write failing helper tests**

```java
assertTrue(MobBottleCompat.isHimEntityType(HimEntityTypes.HIM.get()));
assertTrue(MobBottleCompat.isHimEntityTag(himTag));
assertFalse(MobBottleCompat.isHimEntityTag(nonHimTag));
assertTrue(MobBottleCompat.purifyFilledBottle(stack, emptyBottleItem));
```

- [ ] **Step 4: Run helper tests to verify they fail**

Run: `.\gradlew test --tests com.himdev.him.compat.MobBottleCompatTest`
Expected: FAIL because `MobBottleCompat` does not exist yet.

- [ ] **Step 5: Commit**

```bash
git add src/test/java/com/himdev/him/compat/UltimateSkeletonsCompatMixinConfigTest.java src/test/java/com/himdev/him/compat/MobBottleCompatTest.java
git commit -m "test: add MobBottle compat coverage for Him"
```

### Task 2: Implement the minimal MobBottle compat helper

**Files:**
- Create: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\compat\MobBottleCompat.java`
- Test: `D:\mc-mod-dev\Him-dev\src\test\java\com\himdev\him\compat\MobBottleCompatTest.java`

- [ ] **Step 1: Write the minimal helper implementation**

```java
public static boolean isHimEntity(Entity entity) { ... }
public static boolean isHimEntityType(EntityType<?> type) { ... }
public static boolean isHimEntityTag(@Nullable CompoundTag tag) { ... }
public static boolean purifyFilledBottle(ItemStack stack, Item emptyBottleItem) { ... }
```

- [ ] **Step 2: Run helper tests to verify they pass**

Run: `.\gradlew test --tests com.himdev.him.compat.MobBottleCompatTest`
Expected: PASS

- [ ] **Step 3: Commit**

```bash
git add src/main/java/com/himdev/him/compat/MobBottleCompat.java src/test/java/com/himdev/him/compat/MobBottleCompatTest.java
git commit -m "feat: add MobBottle Him compat helper"
```

### Task 3: Add MobBottle mixins for capture and release interception

**Files:**
- Create: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\compat\mixin\MobBottleBlockItemCaptureMixin.java`
- Create: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\compat\mixin\MobBottleBlockItemUseOnMixin.java`
- Modify: `D:\mc-mod-dev\Him-dev\src\main\resources\him.compat.mixins.json`
- Modify: `D:\mc-mod-dev\Him-dev\src\test\java\com\himdev\him\compat\UltimateSkeletonsCompatMixinConfigTest.java`

- [ ] **Step 1: Add the capture mixin**

```java
if (MobBottleCompat.isHimEntity(entity)) {
    cir.setReturnValue(false);
}
```

- [ ] **Step 2: Add the use-on purification mixin**

```java
if (MobBottleCompat.isHimFilledBottle(stack)) {
    MobBottleCompat.replacePlayerHandWithEmptyBottle(context);
    cir.setReturnValue(InteractionResult.SUCCESS);
}
```

- [ ] **Step 3: Register the mixins**

```json
"MobBottleBlockItemCaptureMixin",
"MobBottleBlockItemUseOnMixin"
```

- [ ] **Step 4: Run the config test to verify it passes**

Run: `.\gradlew test --tests com.himdev.him.compat.UltimateSkeletonsCompatMixinConfigTest`
Expected: PASS

- [ ] **Step 5: Commit**

```bash
git add src/main/java/com/himdev/him/compat/mixin/MobBottleBlockItemCaptureMixin.java src/main/java/com/himdev/him/compat/mixin/MobBottleBlockItemUseOnMixin.java src/main/resources/him.compat.mixins.json src/test/java/com/himdev/him/compat/UltimateSkeletonsCompatMixinConfigTest.java
git commit -m "feat: make MobBottle ignore Him"
```

### Task 4: Verify the focused regression surface

**Files:**
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\compat\MobBottleCompat.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\compat\mixin\MobBottleBlockItemCaptureMixin.java`
- Verify: `D:\mc-mod-dev\Him-dev\src\main\java\com\himdev\him\compat\mixin\MobBottleBlockItemUseOnMixin.java`

- [ ] **Step 1: Run the targeted compat tests**

Run: `.\gradlew test --tests com.himdev.him.compat.UltimateSkeletonsCompatMixinConfigTest --tests com.himdev.him.compat.MobBottleCompatTest`
Expected: PASS

- [ ] **Step 2: Run a compile check**

Run: `.\gradlew compileJava compileTestJava`
Expected: BUILD SUCCESSFUL

- [ ] **Step 3: Commit**

```bash
git add .
git commit -m "test: verify MobBottle Him immunity"
```
