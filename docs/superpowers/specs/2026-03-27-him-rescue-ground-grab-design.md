# Him Rescue Ground Grab Design

**Problem:** The current rescue grab execution intentionally anchors the victim above the ground and renders it as a hanging body. That matches the earlier rescue design, but it no longer matches the requested presentation: when `Him` saves the player, the hostile mob should stay on the ground while being controlled by the neck.

**Goal:** Keep the current rescue trigger, hold window, punishment timing, and return-to-origin behavior, but change the rescue execution so `Him` and the victim both remain on ground level while the victim is visibly held by the neck.

**Approach Options:**

1. **Recommended: adjust both the server anchor and the client victim transform.**
   - Pros: gameplay position and rendered pose stay aligned, fixes the airborne victim completely, and keeps the change scoped to the current rescue execution path.
   - Cons: requires coordinated changes in both `HimEntity` and the grab render transform.
2. Change only the server-side anchor to ground level.
   - Pros: smallest gameplay-only change.
   - Cons: the client render layer would still draw the victim as a hanging body, so the hand/neck alignment would look wrong.
3. Replace the rescue hold with a new full animation timeline.
   - Pros: highest-fidelity presentation.
   - Cons: too large for this request and unnecessary for fixing the current mismatch.

**Chosen Design:** Keep the rescue execution controller and timing exactly as they are, but move the victim anchor from an elevated hand-hang point to a ground-level standing point near `Him`'s right hand. Update the client render transform so the victim remains upright, keeps its feet at ground level, and aligns its neck with the choke hand instead of hanging below it. Oversized hostile mobs continue to bypass the sequence and use the existing direct punishment fallback.

**Server Behavior:**

1. `GuardianRescueController` still rescues the player and routes normal-sized hostile targets through `HimRescueExecutionController`.
2. `HimRescueExecutionController` still stages `Him` at a safe point in front of the victim.
3. While the hold window is active, `HimEntity` still freezes the victim each tick and still prevents escape, attack continuation, and movement.
4. The only positional change is the victim anchor:
   - the anchor stays beside `Him`'s right side and slightly forward
   - the anchor `Y` is derived from `Him`'s feet level instead of a raised hang point
   - the victim stays on the ground rather than being lifted upward
5. The hold timer, delayed kill, and immediate return to the recorded origin remain unchanged.

**Client Presentation:**

- Keep the existing rescue choke pose in `HimModel`; it already communicates the grab.
- Change `HimGrabVictimTransform` so the rendered victim:
  - stays upright instead of flipped into a hanging pose
  - aligns the neck region to the right-hand choke point
  - keeps the feet near the ground plane instead of dropping below the hand
  - still cancels the victim's own body yaw so facing remains stable during the hold
- Leave the render layer architecture unchanged. `HimGrabVictimLayer` should continue to render only when rescue execution visuals are active.

**Compatibility And Scope:**

- The first version optimizes for upright vanilla-style hostiles such as zombies and skeletons.
- Non-humanoid but still eligible hostile mobs may not line up perfectly at the neck, but they must remain clearly ground-held rather than suspended.
- Do not add per-entity special cases unless a focused regression proves they are required.

**Safety And Fallbacks:**

- Do not change the rescue trigger, player heal/protection, oversized hostile fallback, or return-to-origin behavior.
- If the victim vanishes mid-sequence, `Him` must still clear rescue state and return normally.
- The ground-held anchor must not let the victim drift, attack, or regain gravity during the hold window.

**Files:**

- Modify `src/main/java/com/himdev/him/entity/HimEntity.java`
- Modify `src/main/java/com/himdev/him/client/render/layer/HimGrabVictimTransform.java`
- Modify `src/test/java/com/himdev/him/client/render/layer/HimGrabVictimTransformTest.java`
- Modify `src/main/java/com/himdev/him/gametest/HimRescueGameTests.java`

**Testing:**

- Update the render transform unit test to assert that the held victim stays upright and no longer hangs below the hand.
- Add or update a rescue GameTest to assert that the victim remains close to ground level during the hold window.
- Re-run the existing rescue execution tests to confirm the kill timing and `Him` return behavior remain intact.
