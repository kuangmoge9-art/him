# Him Existence Seal Design

## Summary

Phase 1 of the next `Him` upgrade focuses on one goal: make `Him` effectively impossible to erase from inside the running game. Normal gameplay-side deletion should fail when possible, and if any in-process path still removes `Him`, he should immediately return at the recorded location with basic state preserved.

## Goals

- Strengthen `Him` against gameplay-side deletion paths beyond the current immunity work.
- Add a return mechanism so `Him` reappears even if an in-process removal still succeeds.
- Preserve basic state on return:
  - dimension
  - position
  - facing direction
- Keep the world-unique `Him` rule intact during deletion and return.
- Preserve current invulnerability, rescue, punishment, and combat behavior.
- Add automated proof that `Him` comes back if removed in-process.

## Non-Goals

- No attempt to recover from out-of-band actions such as direct save editing.
- No new godlike movement behavior such as wall phasing, hovering, or teleport theatrics.
- No major visual changes or new effects.
- No attempt to fully restore transient moment-to-moment state such as current attack target.

## Chosen Approach

Use a two-layer existence model:

1. **Deletion Interception**
   Block gameplay-side removal paths wherever the mod can directly reject them.

2. **Existence Return**
   If an in-process removal still succeeds, spawn `Him` back immediately from a compact return record.

This is preferred over pure interception because no single hook can be trusted as the only deletion path. It is also preferred over pure respawn because the best result is "you cannot erase him," not "he disappears and then returns every time."

## Return Record

The system should maintain a small authoritative record for the current world-unique `Him`.

Required fields:

- dimension
- x, y, z position
- yaw and pitch
- current unique identity ownership needed to avoid duplicate `Him`

The record should update during normal life so return behavior uses recent information rather than stale spawn data.

## Return Behavior

If `Him` is removed through an in-process path that bypasses or defeats direct interception:

- the system detects that the world-unique `Him` is gone
- the recorded return point is loaded
- `Him` is recreated immediately in the same dimension
- position and facing are restored
- uniqueness is reasserted so a second persistent `Him` does not remain

### Spawn Location Rules

- first choice: original recorded position
- fallback: an extremely nearby safe spot if the original point is invalid
- no dramatic relocation to another part of the world

This keeps the behavior consistent with the fantasy that `Him` was never truly erased.

## Behavioral Requirements

After this phase:

- common in-game deletion attempts should fail where possible
- if `Him` still gets removed in-process, he returns immediately
- return should preserve basic spatial identity
- return should not create a duplicate guardian
- rescue, punishment, and combat should continue to behave normally after return

## Validation Strategy

Acceptance must be evidence-based.

Automated checks should cover at least:

- existing invulnerability suite still passes
- a forced in-process deletion leads to `Him` being present again
- returned `Him` is near the recorded location
- returned `Him` preserves facing direction within a small tolerance
- uniqueness still holds after return
- rescue and combat still function after a return cycle

Manual smoke testing should confirm that the return behavior feels immediate and stable in a live client.

## Deliverables

- existence return record for the world-unique `Him`
- in-process removal return behavior
- automated tests for return and uniqueness after return
- no regressions in current `Him` behavior

## Acceptance Criteria

The phase is complete only if all of the following are true:

- `Him` cannot be permanently erased by in-process gameplay-side actions.
- If removed in-process, `Him` returns immediately.
- Returned `Him` preserves basic state: dimension, location, and facing.
- World uniqueness still holds after return.
- Existing invulnerability, rescue, punishment, and combat tests continue to pass.
- The mod can still be rebuilt into a playable jar after the change.

## Risks And Focus

The highest-risk points are:

1. preventing duplicate `Him` entities when return and uniqueness logic overlap
2. restoring `Him` quickly without breaking existing lifecycle assumptions

Implementation should prove those two points first before broadening scope.
