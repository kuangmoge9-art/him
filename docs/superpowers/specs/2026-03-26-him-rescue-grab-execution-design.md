# Him Rescue Grab Execution Design

**Problem:** `GuardianRescueController` currently rescues the player and immediately routes hostile attackers into `DivinePunisher`. That guarantees the rescue outcome, but it does not create the intended presentation: the already-present `Him` entity should instantly appear in front of a normal-sized hostile mob, lift it one to two blocks off the ground by the neck with one hand, hold it frozen for roughly 0.5 to 1 second, execute it, and then return to the exact spot where `Him` was before the rescue.

**Goal:** Replace direct rescue punishment against normal-sized hostile mobs with a short, reliable grab execution sequence driven by the existing world `Him` entity, while preserving the current immediate-kill fallback for oversized hostile mobs and any case where the sequence cannot be started safely.

**Approach Options:**

1. **Recommended: server-side rescue execution state plus client-side grab pose and victim render anchor.**
   - Pros: matches the requested effect closely, keeps rescue success authoritative on the server, reuses `DivinePunisher` for the actual kill, and limits the new complexity to a focused rescue-execution slice.
   - Cons: requires synchronized rescue state on `HimEntity` and a new client render layer for the grabbed victim.
2. Server-only teleport, freeze, delay, and kill without dedicated client pose handling.
   - Pros: smallest code surface.
   - Cons: looks weak in-game because the mob simply appears suspended near `Him` instead of clearly being held by the neck.
3. Full timeline animation system for both `Him` and the victim.
   - Pros: highest-fidelity presentation.
   - Cons: too large for the current codebase, increases compatibility risk with arbitrary modded hostile mobs, and is unnecessary for the requested rescue upgrade.

**Chosen Design:** Introduce a dedicated rescue-execution controller that intercepts rescue punishment for normal-sized hostile mobs, records `Him`'s current position and rotation, teleports the existing `Him` entity to a safe point in front of the target, holds the target in a frozen hanging state for 10 to 20 ticks, then delegates the final kill to `DivinePunisher` and teleports `Him` back to the recorded origin. On the client, expose enough synchronized rescue state for `HimModel` to enter a one-handed choke pose and for a new render layer to draw the victim at a fixed hand anchor. If the target is oversized, missing, invalid, or no safe staging point can be found, skip the sequence and preserve the current direct punishment path.

**Architecture:**

- Keep rescue trigger ownership in `GuardianRescueController`, but route normal-sized hostile targets through a dedicated execution API instead of directly into `DivinePunisher`.
- Keep `HimEntity` as the runtime owner of rescue-execution state because the animation and return trip belong to the unique live `Him` entity already tracked by `HimLocator`.
- Add a focused helper such as `HimRescueExecutionController` to decide whether the grab sequence is allowed, compute the rescue staging position, start the sequence, and fall back to direct punishment when the setup cannot be guaranteed.
- Reuse `DivinePunisher` unchanged for the actual kill phase so compat damage, special mob cleanup, and existing punishment semantics stay centralized.
- Gate the sequence to normal-sized hostile mobs only. Oversized or incompatible hostiles continue using the current instant punishment path.

**Execution Flow:**

1. `GuardianRescueController` rescues the player exactly as it does now.
2. When the resolved punishment target exists on the server, look up the active `Him` entity through `HimLocator`.
3. If no active `Him` can be resolved, or the target is not a normal-sized hostile `LivingEntity`, keep the current direct `DivinePunisher` path.
4. If the target qualifies, `HimRescueExecutionController` computes a safe rescue staging point in front of the victim, records `Him`'s return position and rotation, and starts a rescue execution state on `HimEntity`.
5. While the rescue execution state is active, `HimEntity` suspends normal pursuit behavior, stops navigation, faces the target, and forces the victim to a fixed hanging point one to two blocks above ground near `Him`'s right hand.
6. The victim remains fully frozen during the hold window: no movement, no attack progression, no falling, and no escape from the hanging anchor.
7. When the hold timer expires, `HimEntity` invokes `DivinePunisher` on the stored target.
8. After the kill resolves or the target disappears, `Him` is teleported back to the recorded origin, transient rescue state is cleared, and normal AI resumes.

**Target Eligibility:**

- Eligible targets must be hostile `LivingEntity` instances that are not players and not `HimEntity`.
- Prefer hostile classification based on the existing combat expectations, such as `Enemy`, rather than all `Mob` instances.
- Use collision-box size rather than health or arbitrary IDs to decide whether a target is normal-sized.
- Recommended initial thresholds:
  - max width: `<= 1.4`
  - max height: `<= 2.4`
- Any target above those thresholds should bypass the grab sequence and continue through immediate punishment.

**Server State:**

- Add synchronized rescue-execution fields to `HimEntity` for the victim identity and whether the visual grab is active.
- Keep server-only fields for:
  - return position
  - return rotation
  - hold timer
  - current rescue phase
  - rescue target UUID
- Recommended phases are minimal:
  - `IDLE`
  - `HOLDING`
  - `RETURNING`
- Keep the kill itself inside the transition out of `HOLDING` rather than introducing an additional long-lived phase.

**Behavior Integration In `HimEntity`:**

- Rescue execution should short-circuit normal AI when active.
- During the hold window:
  - stop navigation
  - suppress ordinary target pursuit
  - keep gravity and movement controlled explicitly
  - keep the victim anchored every server tick
- Returning `Him` to the recorded origin should be explicit and immediate, not path-based, because this is a rescue presentation rather than ordinary travel.
- If the victim vanishes or becomes invalid during the hold, abort the sequence cleanly, return `Him`, and clear state without leaving the entity stuck in a rescue phase.

**Client Presentation:**

- Extend `HimModel` so `setupAnim(...)` switches to a dedicated choke pose when rescue execution is active.
- The choke pose should:
  - raise and extend the right arm
  - reduce normal walk swing
  - keep the body squared to the victim
  - allow the head to bias toward the held target
- Add a new render layer such as `HimGrabVictimLayer` in the `HimRenderer` pipeline.
- The render layer should:
  - resolve the synchronized victim entity
  - position it at a fixed right-hand anchor
  - render it slightly elevated, matching the server-side hanging location
- The first version should optimize for upright vanilla-style hostiles. Non-humanoid but still normal-sized enemies may look less exact, which is acceptable for this feature scope.

**Safety And Fallbacks:**

- Rescue success remains the primary requirement. Any failure to begin or maintain the grab sequence must fall back to immediate `DivinePunisher`.
- Safe staging-point calculation must avoid placing `Him` inside solid blocks, liquids, or collision-invalid spaces.
- If the active `Him` cannot be resolved from `HimLocator`, direct punishment remains the fallback.
- If the target becomes invalid before the hold timer ends, the sequence ends without blocking `Him` from returning to normal behavior.
- Rescue execution must never leave `Him` stranded away from the original location after completion.

**Files:**

- Modify `src/main/java/com/himdev/him/guardian/GuardianRescueController.java`
- Create `src/main/java/com/himdev/him/guardian/HimRescueExecutionController.java`
- Modify `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify `src/main/java/com/himdev/him/world/HimLocator.java` only if a direct active-entity lookup helper is needed
- Modify `src/main/java/com/himdev/him/client/model/HimModel.java`
- Modify `src/main/java/com/himdev/him/client/render/HimRenderer.java`
- Create `src/main/java/com/himdev/him/client/render/layer/HimGrabVictimLayer.java`
- Modify `src/main/java/com/himdev/him/gametest/HimRescueGameTests.java`
- Modify `src/main/java/com/himdev/him/gametest/HimCombatGameTests.java` only if shared combat target assumptions need regression coverage

**Testing:**

- Add a rescue GameTest where a normal-sized hostile mob triggers lethal damage, the player is rescued, the hostile remains alive during the hold window, then dies, and `Him` returns to the pre-rescue position.
- Add a rescue GameTest that confirms oversized hostile mobs bypass the grab sequence and still die through the direct punishment path.
- Add a rescue GameTest that invalidates the victim mid-sequence and verifies `Him` clears rescue state and returns cleanly.
- Add a rescue GameTest that triggers rescue while `Him` is already mid-execution and verifies the fallback remains safe and deterministic.
- Verify existing rescue and punishment tests remain green so the new presentation layer does not regress rescue guarantees or compat kill behavior.
