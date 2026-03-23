# Him Appearance Design

## Summary

Optimize `Him`'s appearance toward a classic Herobrine look while keeping the existing Forge 1.20.1 gameplay logic stable. The visual target is "looks like Steve at first glance, but immediately reads as Herobrine because of the white eyes, colder palette, and slightly uncanny silhouette."

## Goals

- Keep the current humanoid animation compatibility and rendering pipeline.
- Make `Him` visually recognizable as classic Herobrine rather than a placeholder Steve skin.
- Add persistent white glowing eyes that remain visible in darkness.
- Introduce a slightly uncanny player-like silhouette without changing hitbox or combat behavior.
- Keep the work scoped to visual assets and rendering so existing rescue, punishment, and combat logic remain untouched.

## Non-Goals

- No GeckoLib or custom animation framework.
- No custom skeleton or high-poly model.
- No particle fog, distortion, teleport visuals, or cinematic effects.
- No gameplay changes, stat changes, AI changes, or collision-box changes.
- No shift toward a monster, zombie, or god-armor aesthetic.

## Chosen Direction

The appearance should follow the classic Herobrine route:

- Steve-like humanoid base
- pure white eyes with no pupils
- darker, dirtier, lower-saturation clothing
- slightly eerie body proportions
- minimal but effective emissive rendering limited to the eyes

This direction is preferred over a pure texture swap because the classic Herobrine look depends on both face recognition and silhouette tension. It is also preferred over heavy visual effects because phase 1 should remain stable and readable.

## Visual Target

`Him` should look like a corrupted or uncanny version of Steve, not a separate species.

Desired impression:

- from far away: "that looks like a player"
- from medium distance: "that is not a normal player"
- up close: unmistakably Herobrine

The design should feel cold, direct, and unsettling rather than flashy. White eyes are the primary recognition cue. Clothing and skin treatment should support that cue rather than compete with it.

## Model Strategy

### Base Model

Keep the existing humanoid model structure so it stays compatible with vanilla-style movement and attack animation.

### Proportion Adjustments

Use mild shape changes only:

- head slightly taller or more severe in presentation
- shoulders visually wider
- arms slightly longer
- torso and stance reading more rigid and upright

These adjustments should be done in the baked model layer, not by changing entity dimensions or hitboxes.

### Reasoning

Classic Herobrine is most effective when he still reads as a player model. If the silhouette drifts too far toward monster proportions, the effect is lost.

## Texture Direction

### Face

- keep Steve-like face structure
- replace normal eyes with solid white eyes
- no pupils
- no catchlight
- no blood, scars, or exaggerated horror details

### Hair

- dark brown to near-black brown
- flatter, less lively highlights than Steve

### Skin

- human skin tone, but paler and slightly colder
- avoid green, rotten, or zombie-coded coloration

### Shirt

- remain in the classic teal/green family
- reduce saturation
- add subtle wear, grime, and darker folds

### Pants

- remain in the classic blue/purple family
- darken and desaturate slightly

### Overall Contrast

Keep the base texture somewhat darker so the white eyes remain the brightest point on the model.

## Eye Glow Strategy

Add a separate eye-only render layer.

Requirements:

- only the eyes glow
- the glow should stay readable in caves, at night, and in shadows
- the effect should not brighten the whole face or body
- the result should resemble a classic emissive eye pass, not an aura

This layer is the highest-value rendering addition because it reinforces the exact feature players associate with Herobrine without requiring a large visual-effects system.

## Renderer Changes

The renderer should be split conceptually into:

- main body texture pass
- emissive eye pass

The main pass stays responsible for the normal model and texture. The emissive pass should draw only the eye region using a dedicated texture or overlay map.

The implementation should remain compatible with the current entity renderer structure and should not require replacing the whole render stack.

## Behavioral Constraints

Visual work must not affect:

- entity hitbox
- follow range
- attack timing
- rescue logic
- uniqueness logic
- damage immunity

If a model adjustment would require gameplay-facing dimension changes, reject that adjustment and stay with the existing dimensions.

## Testing Expectations

Acceptance should rely on focused smoke validation:

- `Him` remains visible and renders correctly in client runtime
- body texture is clearly Herobrine-like
- eyes remain visibly white and emissive in darkness
- no missing-texture or missing-layer issues appear
- no gameplay regression is introduced by the visual update

Because this is a visual optimization, final acceptance also requires manual inspection in `runClient`, but only after automated verification confirms the existing gameplay suite still passes.

## Deliverables

- updated `him.png` main texture
- eye-glow overlay texture if needed by the chosen render-layer implementation
- updated `HimModel` proportions
- updated `HimRenderer` with eye emissive layer
- no gameplay regressions in existing test and GameTest suites

## Acceptance Criteria

The appearance update is complete when all of the following are true:

- `Him` still renders as a stable humanoid entity in Forge 1.20.1.
- The face is immediately recognizable as classic Herobrine because of the white eyes.
- The overall clothing palette still references Steve but appears darker and more uncanny.
- The silhouette feels subtly wrong rather than heavily monstrous.
- Eye glow is visible in low-light conditions.
- Existing automated tests still pass unchanged unless a visual-only test is added.
- Client smoke verification succeeds after the visual update.
