# Him Divine Observation Design

## Summary

This document defines the first concrete slice of phase 3 "godlike presence" for `Him`.

The goal of this slice is not full teleportation, phasing, or spectacle. It is a focused behavioral upgrade: when `Him` is calmly observing nearby players, he should occasionally occupy a visibly unnatural elevated position, remain still for a short time, and stare with deliberate intent.

The desired feeling is not "flying mob" and not "pathfinding bug." The desired feeling is: `Him` chose an impossible place to watch you from.

## Goals

- Give `Him` a believable first phase-3 "godlike presence" behavior.
- Make calm observation of players feel intentional, quiet, and unsettling.
- Let `Him` occasionally hover or remain in an obviously abnormal vantage point near a player.
- Keep the behavior rare and controlled so it reads as presence, not noise.
- Preserve all prior guarantees:
  - uniqueness
  - invulnerability
  - in-process return
  - environment dominance
  - player rescue
  - hostile combat

## Non-Goals

- No full phasing through walls in this slice.
- No short-range blink teleport spectacle.
- No new sound, particle, or cinematic effects.
- No permanent hovering as the default movement model.
- No conversion of chase or rescue behavior into airborne behavior.

## Chosen Approach

Use an observation-state-driven presentation.

`Him` should only show this behavior when all of the following are true:

- a player is nearby
- `Him` is not in a high-urgency state such as pursuit, rescue, return, or active combat
- a suitable observation point exists nearby

When those conditions are satisfied, `Him` may enter an observation state, move to a clearly abnormal vantage point, hold position calmly, face the player, and then resume normal activity.

This keeps the behavior purposeful and avoids turning `Him` into a constantly floating creature.

## Core Behavior

After this slice:

- `Him` still behaves mostly normally during ordinary roaming
- while peacefully observing a nearby player, he can occasionally choose to stop watching from an impossible-looking position
- once in place, he should remain calm and still rather than bobbing or fidgeting
- the pause should feel like deliberate surveillance, not indecision
- after a short hold, he should return to normal movement without awkward snapping or repeated retriggering

The overall impression should be quiet dominance, not flashy mobility.

## Observation Point Selection

The system should prefer nearby points that are:

- slightly above the player or surrounding terrain
- near rooflines, treetops, ledges, or local terrain rises
- visually exposed enough that a player can clearly notice the stare
- local to the current encounter rather than distant or theatrical

The system should reject points that are:

- excessively high or far away
- obviously cramped or unstable
- likely to trap `Him`
- likely to look like a navigation mistake

If no suitable point exists, `Him` should simply continue normal behavior.

## Stability Rules

To prevent the feature from reading as a bug:

- the behavior should trigger only occasionally
- `Him` should not chain multiple observation perches back-to-back
- `Him` should not oscillate up and down while holding position
- the hold duration should be short but noticeable
- exiting the state should return control cleanly to normal movement

The slice should favor fewer, cleaner observation moments over frequent noisy ones.

## Behavioral Boundaries

This slice must not override or disrupt:

- hostile target pursuit
- player rescue interception
- post-removal return behavior
- environment escape logic
- uniqueness enforcement
- ordinary passive roaming when no player is near

Observation should always lose priority to stronger intent.

## Validation Strategy

Acceptance must be evidence-based.

Automated checks should cover at least:

- `Him` can enter observation behavior when a player is nearby and he is calm
- chosen observation behavior does not trigger during active combat or rescue
- hold behavior remains stable instead of jittering vertically
- `Him` exits observation cleanly and resumes normal activity
- prior invulnerability, return, uniqueness, rescue, combat, and environment-dominance coverage still passes

Manual smoke testing should confirm:

- the behavior looks intentional
- the stillness reads as cold observation
- the frequency is low enough to stay unsettling

## Deliverables

- observation-state trigger for calm nearby-player situations
- local observation-point selection logic
- calm hold behavior with player-facing orientation
- cooldown or gating to prevent noisy repetition
- automated regression coverage for the new behavior

## Acceptance Criteria

This slice is complete only if all of the following are true:

- `Him` occasionally observes nearby players from a visibly abnormal local position.
- The observation posture feels calm and deliberate rather than glitchy.
- The behavior does not become constant or spammy.
- High-priority behaviors such as rescue, pursuit, return, and terrain dominance still work.
- Existing automated coverage continues to pass.
- The mod rebuilds into a playable jar after the change.

## Risks And Focus

The highest-risk points are:

1. making the observation position feel uncanny without looking broken
2. keeping the hold stable so it reads as a stare instead of vertical drift
3. adding godlike presence without accidentally weakening urgent behaviors

Implementation should prove those three points before expanding phase 3 further.
