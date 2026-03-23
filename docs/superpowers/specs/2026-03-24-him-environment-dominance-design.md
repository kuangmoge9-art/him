# Him Environment Dominance Design

## Summary

Phase 2 upgrades `Him` from "cannot be harmed or erased" to "cannot be meaningfully restrained by the world around him." The target is a creator-tier entity that still feels grounded while wandering, but immediately reasserts control whenever terrain, fluids, confinement, or hostile pathing conditions try to slow, trap, or derail him.

## Goals

- Prevent normal world conditions from trapping or stalling `Him`.
- Let `Him` retain a mostly natural walking presence during calm wandering.
- Escalate environmental dominance when `Him` is chasing, rescuing, returning, or otherwise acting with intent.
- Ensure lava, water flow, cramped spaces, and awkward terrain stop being lasting obstacles.
- Preserve current guarantees:
  - invulnerability
  - untouchability
  - in-process return
  - uniqueness
  - player rescue
  - hostile combat
- Add automated proof that `Him` can escape obstruction and continue acting normally.

## Non-Goals

- No overt phase-through-walls spectacle as a default idle behavior.
- No new particle, sound, or cinematic effects.
- No new combat powers in this phase.
- No conversion of all movement into permanent hovering, teleporting, or ghosting.

## Chosen Approach

Use a state-driven environment-dominance model.

### Calm State

When `Him` is simply wandering without urgency:

- movement should still look close to normal entity movement
- minor terrain interaction is acceptable
- environmental correction should stay quiet unless he is truly obstructed

This keeps the entity from feeling fake or bugged during ordinary encounters.

### Dominant State

When `Him` is pursuing a hostile, intervening in player protection, returning after removal, or clearly obstructed by the environment:

- environmental interference should stop mattering in a lasting way
- `Him` should recover forward progress quickly
- the world should feel incapable of pinning him down

This is the main fantasy target for the phase.

## Environment Obstruction Detection

The system should treat the environment as interfering when one or more of these conditions persist beyond a short threshold:

- `Him` is trying to move but makes almost no real progress
- `Him` remains embedded in solid space or cramped geometry
- fluids repeatedly drag or redirect him
- pathing repeatedly fails while a valid target or intent exists
- terrain causes repeated hesitation during pursuit or rescue

The phase should prefer simple, evidence-driven signals over broad guesswork.

## Response Ladder

Environmental correction should escalate in steps rather than jumping straight to dramatic relocation.

### Step 1: Motion Correction

If obstruction is light:

- clear unwanted drift
- restore forward motion
- suppress fluid-led or collision-led deviation

### Step 2: Local Escape

If obstruction continues:

- move `Him` to a very nearby safe point
- preserve the sense that he stayed in the same local encounter
- keep orientation and intent stable

### Step 3: Forced Reassertion

If local escape still fails:

- apply a short, decisive relocation within the immediate area
- prioritize getting `Him` back into actionable space
- avoid theatrical long-range relocation

This ladder should make `Him` feel overpowering without turning every movement into obvious cheating.

## Environment Cases To Cover

This phase should explicitly cover:

- lava and other hazardous liquids
- flowing water and directional fluid pressure
- narrow tunnels and cramped corners
- partial enclosure or burial
- awkward height changes, pits, and uneven terrain
- failed pursuit caused by hostile pathing geometry

The core requirement is not that `Him` never touches these environments, but that they cannot keep control over him.

## Behavioral Requirements

After this phase:

- wandering still looks mostly natural when nothing is wrong
- if the world starts trapping or dragging `Him`, he recovers quickly
- while chasing, rescuing, or returning, `Him` should behave like terrain is a weak suggestion rather than a real limitation
- environmental pressure should no longer make `Him` look clumsy, confused, or stuck
- current rescue, punishment, uniqueness, return, and invulnerability behavior must still work

## Validation Strategy

Acceptance must be evidence-based.

Automated checks should cover at least:

- `Him` escapes from a cramped or blocked position
- `Him` resists being held back by fluid movement
- `Him` maintains effective pursuit through awkward terrain
- `Him` still completes a return cycle correctly after removal
- existing invulnerability and rescue/combat coverage still passes

Manual smoke testing should confirm that:

- calm wandering still looks believable
- dominant-state movement feels stronger rather than glitchier

## Deliverables

- obstruction detection for environment-driven trapping
- layered correction behavior for escape and terrain dominance
- automated checks for fluid, confinement, and pathing resilience
- no regressions in current `Him` behavior

## Acceptance Criteria

This phase is complete only if all of the following are true:

- `Him` can no longer be meaningfully pinned down by ordinary terrain or fluids.
- `Him` escapes cramped or obstructed situations in a stable way.
- `Him` keeps effective pursuit and rescue behavior in messy terrain.
- Wandering remains visually calmer when no obstruction exists.
- Existing uniqueness, return, invulnerability, rescue, punishment, and combat checks still pass.
- The mod rebuilds into a playable jar after the upgrade.

## Risks And Focus

The highest-risk points are:

1. making obstruction recovery strong enough without making idle movement look broken
2. improving pursuit through terrain without introducing teleporty or erratic behavior

Implementation should prove those two points first, then run the full regression suite.
