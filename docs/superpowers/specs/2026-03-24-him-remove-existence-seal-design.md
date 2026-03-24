# Him Remove Existence Seal Design

## Summary

Remove the behavior that makes `Him` automatically return after in-process removal and remove the follow-up retaliation that targets nearby threats after that return. Keep every unrelated behavior unchanged.

## Goals

- Stop recreating `Him` after external or authorized removal.
- Stop retaliating against nearby threats after external removal.
- Keep uniqueness, invulnerability, combat, player rescue, and void recovery behavior unchanged.

## Scope

This change removes only two capabilities:

- automatic existence-seal recovery
- external-removal retaliation

Everything else should behave exactly as before, including unauthorized deletion resistance through `kill()` and unapproved `remove(...)`.

## Behavioral Requirements

- If `Him` is removed through `setRemoved(...)`, he should stay gone.
- If `Him` is removed through an authorized `remove(...)`, he should stay gone.
- No hostile mobs should be punished as a side effect of that removal.
- No other `Him` abilities should regress.

## Validation

- Update GameTests so removal now expects absence instead of return.
- Remove retaliation expectations tied to external removal.
- Re-run focused tests for deletion resistance, removal absence, rescue, and movement/invulnerability behavior that should remain intact.
