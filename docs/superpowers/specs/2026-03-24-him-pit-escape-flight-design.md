# Him Pit Escape Flight Design

## Summary

Give `Him` a temporary, creator-like escape flight only when terrain genuinely traps him in a pit or similar enclosed geometry. He should rise or climb diagonally toward the nearest safe landing spot, then immediately return to normal grounded movement.

## Goals

- Let `Him` escape deep pits and similar terrain traps without staying permanently airborne.
- Preserve `Him`'s normal grounded presence during calm wandering and ordinary movement.
- Make escape behavior look like a short controlled flight rather than a teleport or permanent hover.
- Keep existing guarantees unchanged:
  - invulnerability
  - uniqueness
  - unauthorized-removal resistance
  - player rescue
  - hostile punishment
  - void recovery
  - existing environment-dominance behavior outside pit escape

## Non-Goals

- No permanent flying navigation for `Him`.
- No conversion of ordinary wandering into hovering movement.
- No replacement of void recovery with the new pit-escape flow.
- No new visual effects, particles, or sounds.
- No broad rewrite of combat AI or target selection.

## Scope

This change upgrades only the "trapped by terrain" branch of movement correction.

- Ordinary walking and idle behavior should remain grounded.
- Existing short-range environment correction can remain as the first response for light obstruction.
- A stronger temporary flight state should activate only for real pit-style confinement or equivalent terrain trapping.

## Behavioral Requirements

- If `Him` falls into a deep open pit and cannot path out, he should temporarily fly out instead of remaining trapped.
- If the exit is offset rather than straight above, `Him` should be able to climb diagonally toward the nearest safe landing spot.
- Once `Him` reaches safe ground, temporary flight should end immediately and grounded behavior should resume.
- Calm `Him` on ordinary terrain should not begin floating or hovering without obstruction.
- Short-lived bumps, wall brushes, or minor path pauses should not trigger pit-escape flight.

## Trigger Conditions

Temporary escape flight should require strong evidence that `Him` is truly trapped rather than momentarily blocked.

The trigger should combine:

- persistent lack of meaningful movement progress
- repeated collision, wall embedding, or failed local escape evidence
- terrain consistent with a pit, shaft, or enclosed depression
- at least one nearby safe candidate position above or diagonally above the current trap

The trigger should be stricter than the current obstruction checks so `Him` does not start flying during normal pursuit or casual wandering.

## Escape Flight Behavior

When the trigger fires, `Him` should enter a short-lived escape-flight state.

- temporarily disable gravity
- suspend ordinary ground navigation for the duration of the escape
- continuously move toward the nearest safe landing candidate
- prefer the closest reachable position that clears the pit and provides standing room
- allow both vertical rise and diagonal climbing so partially covered pits still work

This movement should look like a controlled ascent rather than instantaneous relocation.

## Landing Selection

Safe landing candidates should satisfy all of the following:

- the feet and head space are occupiable
- the landing volume does not collide with solid geometry
- the block below provides stable support
- the location is outside the trapped pocket or clearly higher than the confinement floor

Selection should prefer:

1. the nearest valid landing spot
2. the smallest height change that still escapes the trap
3. candidates that keep `Him` near the current encounter area

## Exit Conditions And Fallbacks

Escape flight should stop when any of the following becomes true:

- `Him` reaches a safe landing position and is no longer classified as trapped
- a short timeout is reached
- the chosen candidate becomes invalid and a fallback correction is required

After exit:

- restore gravity immediately
- clear transient flight velocity
- resume normal navigation and AI
- apply a short cooldown so `Him` does not jitter between flight and grounded states on the same obstacle

If temporary flight cannot find or reach a valid landing spot in time, the system should fall back to the existing decisive local relocation behavior instead of leaving `Him` suspended indefinitely.

## Validation

Automated coverage should prove:

- `Him` escapes a deep straight pit within a bounded number of ticks
- `Him` escapes a partially covered or offset-exit pit by climbing diagonally
- calm grounded `Him` does not enter escape flight on normal terrain
- existing environment escape, fluid escape, and grounded-regression tests still pass
- existing invulnerability, rescue, combat, uniqueness, and void-recovery tests still pass

## Acceptance Criteria

This phase is complete only if all of the following are true:

- `Him` can no longer be left permanently trapped in ordinary pits or similar terrain confinement.
- Escape uses a short temporary flight state rather than visible teleport-only behavior.
- `Him` returns to grounded behavior immediately after reaching safe terrain.
- Normal calm movement remains grounded when no true trap exists.
- Existing regression coverage for environment control and core `Him` powers remains green.
