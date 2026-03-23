# Him Appearance Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Upgrade `Him`'s visual presentation into a classic Herobrine look with a darker Steve-like texture, subtle model proportion changes, and glowing white eyes, without changing gameplay behavior.

**Architecture:** Keep the existing humanoid entity and rendering path intact. Apply the appearance update in three isolated layers: main texture refresh, eye-only emissive render layer, and model-layer proportion tuning. Verify after each stage that gameplay tests still pass and the client still launches cleanly.

**Tech Stack:** Java 17, Minecraft Forge 1.20.1, vanilla/Forge entity renderer stack, PNG texture assets, Gradle, JUnit 5, Forge GameTest

---

## Assumptions

- The active implementation workspace is `D:\mc-mod-dev\Him-dev\.worktrees\codex-him-mod`.
- Existing gameplay behavior is already verified and must remain unchanged.
- No GeckoLib, shader pack integration, or custom animation framework will be introduced.
- The glow effect will be implemented with a standard extra render layer rather than a full-screen or post-process effect.
- Manual acceptance for this task depends on `runClient`, but automated regression checks still gate completion first.

## Planned File Structure

### Model / Renderer

- Modify: `src/main/java/com/himdev/him/client/model/HimModel.java`
- Modify: `src/main/java/com/himdev/him/client/render/HimRenderer.java`
- Create: `src/main/java/com/himdev/him/client/render/layer/HimEyesLayer.java`

### Visual Assets

- Modify: `src/main/resources/assets/him/textures/entity/him.png`
- Create: `src/main/resources/assets/him/textures/entity/him_eyes.png`

### Verification / Docs

- Modify: `docs/superpowers/specs/2026-03-23-him-appearance-design.md` only if a proven engine limitation appears during implementation

## Task 1: Refresh The Main Herobrine Texture

**Files:**
- Modify: `src/main/resources/assets/him/textures/entity/him.png`

- [ ] **Step 1: Capture the current texture baseline**

Read the existing texture file and record its current dimensions and placeholder state so the change stays asset-compatible.

Run: `Get-Item src/main/resources/assets/him/textures/entity/him.png | Select-Object Name,Length`

Expected: A single existing texture file is present.

- [ ] **Step 2: Create the updated classic Herobrine texture**

Replace the placeholder texture with a 64x64 player-style texture that follows the approved direction:

- Steve-like face and hair layout
- pure white eyes with no pupils
- darker brown hair
- paler skin
- desaturated teal shirt
- darker blue/purple pants
- subtle grime and shadow detail

Do not add blood, monster flesh, or non-classic horror motifs.

- [ ] **Step 3: Verify the texture file remains structurally valid**

Run: `Get-Item src/main/resources/assets/him/textures/entity/him.png | Select-Object Name,Length`

Expected: The texture still exists and has been updated.

- [ ] **Step 4: Commit the texture refresh**

```bash
git add src/main/resources/assets/him/textures/entity/him.png
git commit -m "feat: refresh Him main Herobrine texture"
```

## Task 2: Add The Eye Glow Render Layer

**Files:**
- Create: `src/main/java/com/himdev/him/client/render/layer/HimEyesLayer.java`
- Modify: `src/main/java/com/himdev/him/client/render/HimRenderer.java`
- Create: `src/main/resources/assets/him/textures/entity/him_eyes.png`

- [ ] **Step 1: Write the failing client-side smoke expectation**

Define the failure condition before implementation:

- `HimRenderer` does not attach an eye-specific render layer
- `him_eyes.png` does not exist

Use code inspection first, not guesswork.

Run: `Get-Content src/main/java/com/himdev/him/client/render/HimRenderer.java`

Expected: No custom eye layer is currently attached.

- [ ] **Step 2: Add the eye overlay texture**

Create `him_eyes.png` as an eye-only mask:

- transparent everywhere except the white eye area
- aligned to the main face texture layout
- no glow baked into surrounding skin

- [ ] **Step 3: Implement the eye render layer**

Create `HimEyesLayer` using the standard Forge/vanilla extra render-layer pattern for emissive-style eyes.

Requirements:

- draw only the eye texture
- use a bright eye-specific render type suitable for night visibility
- do not tint the rest of the model

- [ ] **Step 4: Attach the layer to the renderer**

Update `HimRenderer` to add `HimEyesLayer` in its constructor while keeping the main texture path unchanged.

- [ ] **Step 5: Run compile verification**

Run: `.\gradlew.bat compileJava`

Expected: PASS

- [ ] **Step 6: Commit the glow-layer work**

```bash
git add src/main/java/com/himdev/him/client/render/HimRenderer.java src/main/java/com/himdev/him/client/render/layer/HimEyesLayer.java src/main/resources/assets/him/textures/entity/him_eyes.png
git commit -m "feat: add glowing Herobrine eyes layer"
```

## Task 3: Tune The Humanoid Model Proportions

**Files:**
- Modify: `src/main/java/com/himdev/him/client/model/HimModel.java`

- [ ] **Step 1: Inspect the current model layer definition**

Run: `Get-Content src/main/java/com/himdev/him/client/model/HimModel.java`

Expected: The current model is essentially the default humanoid mesh with no proportion tuning.

- [ ] **Step 2: Add the failing visual acceptance target**

Record the intended changes before implementation:

- slightly more severe head presentation
- wider shoulders
- slightly longer arms
- still unmistakably a player-like silhouette

These are visual-only adjustments. Do not change entity dimensions or hitbox values in `HimEntity`.

- [ ] **Step 3: Implement minimal model-layer proportion adjustments**

Modify `createBodyLayer()` so the baked cubes produce a subtly uncanny silhouette while remaining compatible with vanilla humanoid animation.

Constraints:

- keep the same named parts expected by `HumanoidModel`
- avoid radical mesh expansion
- do not touch entity attributes or size registration

- [ ] **Step 4: Run compile verification**

Run: `.\gradlew.bat compileJava`

Expected: PASS

- [ ] **Step 5: Commit the model tuning**

```bash
git add src/main/java/com/himdev/him/client/model/HimModel.java
git commit -m "feat: tune Him model proportions"
```

## Task 4: Regression Verification For Gameplay Safety

**Files:**
- No intended code changes unless a regression is found

- [ ] **Step 1: Run the full unit suite**

Run: `.\gradlew.bat test`

Expected: PASS

- [ ] **Step 2: Run the full GameTest suite**

Run: `.\gradlew.bat runGameTestServer`

Expected: PASS with all required GameTests green

- [ ] **Step 3: If a regression appears, fix only the proven cause**

Use evidence from the failing test output. Do not speculate about rendering changes affecting gameplay without a concrete failure path.

- [ ] **Step 4: Commit only if any regression fix was required**

```bash
git add <only the files changed by the proven fix>
git commit -m "fix: preserve Him gameplay behavior during appearance update"
```

## Task 5: Client Smoke And Visual Acceptance

**Files:**
- Modify only if the smoke test reveals a proven visual defect

- [ ] **Step 1: Launch the client**

Run: `.\gradlew.bat runClient`

Expected: Client starts successfully.

- [ ] **Step 2: Perform the visual inspection checklist**

Validate in-client:

- the spawn egg is obtainable
- `Him` still spawns
- only one `Him` persists
- the face reads as classic Herobrine
- the body texture is darker and less placeholder-like
- eyes glow in darkness
- the silhouette feels subtly uncanny, not monstrous
- no missing texture, black/purple texture, or missing model parts appear
- combat, rescue, and invulnerability still behave as before

- [ ] **Step 3: If a visual defect appears, fix the exact asset or renderer issue**

Fix only the proven issue:

- UV mismatch -> adjust texture alignment or model cube mapping
- missing glow -> correct render layer or overlay texture
- silhouette too extreme -> dial back model proportions

- [ ] **Step 4: Re-run `runClient` after any visual fix**

Run: `.\gradlew.bat runClient`

Expected: Visual acceptance passes.

- [ ] **Step 5: Commit the final accepted visual polish**

```bash
git add src/main/java/com/himdev/him/client/model/HimModel.java src/main/java/com/himdev/him/client/render/HimRenderer.java src/main/java/com/himdev/him/client/render/layer/HimEyesLayer.java src/main/resources/assets/him/textures/entity/him.png src/main/resources/assets/him/textures/entity/him_eyes.png
git commit -m "feat: optimize Him Herobrine appearance"
```

## Task 6: Final Audit And Documentation Check

**Files:**
- Modify: `docs/superpowers/specs/2026-03-23-him-appearance-design.md` only if a real engine limitation is proven

- [ ] **Step 1: Audit the final result against the spec**

Confirm the delivered appearance still matches:

- classic Herobrine identity
- player-like silhouette
- eye-only glow
- no gameplay-side dimension change

- [ ] **Step 2: Document only proven engine limits**

If a desired visual behavior could not be achieved because of a verified Forge/vanilla limitation, write the exact limitation back into the spec with concrete evidence.

- [ ] **Step 3: Verify the worktree is clean**

Run: `git status --short`

Expected: no output

- [ ] **Step 4: Hand off for branch completion**

After implementation is done and verified, invoke `verification-before-completion`, then `finishing-a-development-branch`.
