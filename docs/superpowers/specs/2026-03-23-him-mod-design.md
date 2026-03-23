# Him Mod Design

## Summary

Build a Forge 1.20.1 Minecraft mod named `Him` centered on a single world-unique god-tier entity. `Him` is an invulnerable guardian that wanders the world, never harms players, can fight hostile mobs with normal combat behavior, and intervenes when any player would otherwise die.

## Goals

- Add a spawn-egg summonable `Him` entity for first-phase testing.
- Ensure only one `Him` may exist in the world at a time.
- Make `Him` immune to damage and impossible to kill by normal gameplay.
- Let `Him` wander the world as a visible entity rather than a hidden global rule.
- Give `Him` regular combat behavior so it can attack hostile mobs without relying only on rescue triggers.
- Intercept lethal damage against any player, cancel death, fully heal the player, and grant short divine protection.
- If the lethal damage source is an entity, have `Him` punish that entity through a normal death pipeline so drops and experience remain intact.
- If the lethal damage source is environmental, rescue the player without killing unrelated mobs.
- Add enough logging to prove why rescue or punishment did or did not trigger.

## Non-Goals For Phase 1

- No ritual summoning, structures, or world generation.
- No multi-phase boss fight design.
- No player god powers or player transformation into `Him`.
- No multi-`Him` support across one world.
- No advanced custom model or animation pipeline beyond what is needed to get a working first version.
- No broad world-rule rewriting such as terrain edits, gamerule mutation, or timeline control.
- No large configuration surface beyond what is required to get the first implementation working.

## Chosen Approach

The implementation should use an `entity + guardian controller` architecture.

`Him` itself owns presence and combat presentation:

- entity registration
- spawn egg support
- world wandering behavior
- hostile target engagement
- ranged-first and melee-finisher combat behavior
- complete immunity to incoming damage

A separate guardian controller owns global protection logic:

- listening for player damage events
- deciding whether the damage would be lethal
- canceling lethal death
- restoring player health
- applying short protection effects
- resolving the real threat source
- instructing `Him` to perform divine punishment
- writing evidence-focused logs

This split is preferred over putting everything inside the entity class because the core mechanic is not local AI alone. The mod has one global rule, "any player cannot die while `Him` protects the world," and that rule should stay isolated from normal entity behavior.

## Entity Design

### Him Entity

`Him` is a unique visible guardian entity.

Required properties:

- Invulnerable to all normal damage.
- Never targets players.
- Never damages players, directly or indirectly on purpose.
- Can engage hostile mobs with standard combat logic.
- Defaults to idle wandering when not in combat.
- Exists as a concrete entity so players can encounter it naturally after test spawning.

### Uniqueness Rule

Only one `Him` may exist at a time.

Phase 1 behavior:

- The spawn egg is available for testing.
- If a player attempts to spawn another `Him` while one already exists, the mod must prevent duplicate persistence.
- The uniqueness check must be deterministic and verifiable through logs.

The first implementation may scope the uniqueness guarantee to the active server world state. Cross-dimension or persistence edge cases should be documented if they are deferred.

## Combat Design

### Passive World Presence

`Him` normally wanders the world and does not proactively purge all hostile mobs.

Expected behavior:

- Idle movement and observation behavior when no target is relevant.
- Basic target acquisition for nearby hostile mobs or mobs that enter combat space.
- No harassment of neutral mobs unless the implementation requires a narrow compatibility exception.

### Normal Combat

`Him` must have normal combat tools in addition to rescue-triggered punishment.

Preferred combat style:

- Use ranged punishment as the primary opener.
- Use melee as the close-range finisher.
- Deal enough damage to feel god-tier without relying on rescue-only logic.

The first phase does not need flashy audiovisual effects, but the combat should already expose clear server-side behavior.

## Player Protection Design

### Rescue Trigger

The mod must listen to player damage through Forge events rather than polling.

When a player receives damage that would otherwise be lethal:

1. detect the pending lethal outcome
2. cancel the death-producing damage result
3. restore the player to full health
4. apply short divine protection
5. inspect the damage source
6. decide whether divine punishment should occur
7. emit logs describing the decision

This event-driven approach is required because it gives direct evidence for what damage was incoming and why the rescue path ran.

### Protection Scope

- All players are protected.
- Protection is not distance-limited.
- Rescue applies regardless of whether the player has interacted with `Him`.

### Environmental Deaths

If the lethal source is environmental, such as fall damage, lava, fire, or suffocation:

- rescue the player
- do not punish unrelated nearby mobs
- log that the rescue came from a non-entity source

## Divine Punishment Design

### Threat Resolution

If the lethal source is caused by an entity, `Him` should punish the threat entity rather than indiscriminately wiping nearby mobs.

Phase 1 threat resolution rules:

- direct hostile entity damage: punish the attacking entity
- projectile or indirect entity damage: resolve the real owner if available, otherwise punish the immediate damaging entity
- environmental damage: no punishment

### Preserve Drops And Experience

Divine punishment must not remove targets through raw deletion.

Forbidden approach:

- removing the entity with discard/despawn-only logic

Required approach:

- apply a dedicated high-power divine `DamageSource` or equivalent legal kill path
- let the target enter the normal death pipeline
- preserve item drops, experience, and normal death event flow where Forge/Minecraft allow it

This requirement exists because "monster dies and still drops loot normally" is a gameplay rule, not a cosmetic preference.

### Edge Cases

Some entity types may not die through a single generic damage path because of boss logic, invulnerability phases, or engine-specific exceptions. Phase 1 must explicitly test common hostile mobs first. Special entities can be documented as follow-up work if needed.

## Logging And Evidence

The mod must include concise server logs for the critical chain:

- `Him` spawn attempts and uniqueness decisions
- lethal player damage detection
- player rescue activation
- damage source classification
- punishment target selection
- punishment execution result

Logs should help answer:

- which player was rescued
- what damage source triggered rescue
- whether the source counted as an entity threat
- which target `Him` punished
- whether the punishment path was expected to preserve drops

The logs are part of the feature because debugging this mod must rely on evidence rather than guesswork.

## Phase 1 Deliverables

- Forge 1.20.1 mod project
- mod metadata and registration
- `Him` entity registration
- `Him` spawn egg registration
- uniqueness guard
- idle AI and combat AI
- invulnerability behavior
- global guardian controller
- lethal rescue flow
- divine punishment flow with normal death handling
- validation-oriented logging

## Acceptance Criteria

The feature is complete for phase 1 only if the following can be demonstrated in a running Forge 1.20.1 environment:

- The mod loads successfully.
- Players can obtain a `Him` spawn egg through creative inventory or commands.
- Spawning repeatedly still results in only one persistent `Him`.
- `Him` wanders the world and does not attack players.
- `Him` can use regular combat against hostile mobs.
- A player receiving lethal entity damage survives instead of dying.
- The rescued player is restored to full health and gains short divine protection.
- The responsible hostile entity is punished.
- The punished hostile entity still produces normal drops and experience.
- A player receiving lethal environmental damage is rescued without unrelated mob cleanup.
- Server logs show why the rescue and punishment path did or did not run.

## Risks And Validation Focus

The two highest-risk areas are:

1. reliable lethal-damage interception across Forge 1.20.1 event timing
2. preserving normal drops and experience while still making divine punishment feel instantaneous

Implementation and testing should prioritize proving those two points early before expanding presentation or content scope.
