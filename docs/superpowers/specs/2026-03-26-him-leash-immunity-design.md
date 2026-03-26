# Him Leash Immunity Design

**Problem:** `HimEntity` already rejects most external control surfaces, but it does not explicitly seal the leash API. That leaves two openings: vanilla lead usage through `canBeLeashed(Player)` and external code that directly calls `setLeashedTo(Entity, boolean)`.

**Goal:** Make leash state completely ineffective against `Him`, regardless of whether it comes from player interaction, vanilla code paths, or other mods calling leash APIs directly.

**Approach Options:**

1. **Recommended: block both leash entry points in `HimEntity`.**
   - Pros: smallest reliable change surface, stays inside the entity's own control contract, covers both vanilla interaction and direct forced leash assignment.
   - Cons: requires a regression test that exercises both paths.
2. Only override `canBeLeashed(Player)`.
   - Pros: minimal code.
   - Cons: incomplete because direct `setLeashedTo(...)` calls can still force leash state.
3. Let leash state happen and strip it later in tick logic.
   - Pros: broad fallback.
   - Cons: dirtier behavior, possible transient visual/state artifacts, and harder reasoning than blocking the source methods directly.

**Chosen Design:** Override `HimEntity.canBeLeashed(Player)` to always return `false`, and override `HimEntity.setLeashedTo(Entity, boolean)` to ignore external attempts to attach a leash. This keeps leash immunity local to `HimEntity` and matches the mod's existing pattern of making `Him` reject outside control rather than compensating after the fact.

**Files:**
- Modify `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify `src/main/java/com/himdev/him/gametest/HimInvulnerabilityGameTests.java`

**Testing:**
- Add a GameTest that spawns `Him` plus a mock survival player and asserts `him.canBeLeashed(player)` is `false`.
- In the same test, directly call `him.setLeashedTo(player, true)` and assert `him.isLeashed()` remains `false`.
- Verify the entity remains alive, present, and stable after the forced leash attempt.
