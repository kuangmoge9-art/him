# Him MobBattle Target Compatibility Design

**Problem:** MobBattle's mob stick assigns combat by calling `setTarget(...)` on both selected mobs. `HimEntity` currently only persists combat intent when `hurt(...)` records an `angerTarget`, so any external target assignment is cleared on the next AI tick.

**Goal:** Let `HIM` honor external hostile target assignments from mods like MobBattle while preserving the existing combat contract: no proactive hostile scanning, no player targeting, and no retaliation against invalid targets.

**Approach Options:**

1. **Recommended: synchronize valid external targets inside `setTarget(...)`.**
   - Pros: smallest change surface, works for MobBattle and any other mod that uses the vanilla target setter, keeps current anger-driven combat model intact.
   - Cons: requires careful handling so internal target clearing during escape/recovery still works.
2. Add a dedicated compatibility hook for MobBattle.
   - Pros: explicit integration point.
   - Cons: more coupling to one mod and misses other mods that use the same vanilla API.
3. Stop synchronizing `target` back to `angerTarget`.
   - Pros: simple.
   - Cons: weakens the current combat contract and makes target state easier to desynchronize.

**Chosen Design:** Override `HimEntity.setTarget(LivingEntity)` so that:
- valid hostile non-player targets are copied into `angerTarget`
- clearing the target also clears `angerTarget`
- invalid targets do not become anger state
- internal AI synchronization still converges on one source of truth

**Files:**
- Modify `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java`

**Testing:**
- Add a GameTest that reproduces the MobBattle-style interaction by calling `him.setTarget(attacker)` directly while another nearby bystander mob exists.
- Verify the new test fails before implementation and passes after the fix.
- Re-run the focused combat regression tests to confirm passive and anger-only behavior still hold.
