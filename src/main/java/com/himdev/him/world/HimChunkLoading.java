package com.himdev.him.world;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import com.himdev.him.util.HimLog;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.ChunkPos;
import net.minecraftforge.common.world.ForgeChunkManager;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class HimChunkLoading {
    private static final int CHUNK_RADIUS = 1;
    private static final boolean TICKING_CHUNK = true;

    private HimChunkLoading() {
    }

    public static void registerValidationCallback() {
        ForgeChunkManager.setForcedChunkLoadingCallback(HimMod.MOD_ID, HimChunkLoading::validateTickets);
    }

    public static Set<ChunkPos> syncEntityTickets(ServerLevel level, HimEntity him, Set<ChunkPos> previousChunks) {
        Set<ChunkPos> currentChunks = trackedChunks(him.chunkPosition());
        if (currentChunks.equals(previousChunks)) {
            return previousChunks;
        }

        int addedCount = 0;
        int removedCount = 0;
        for (ChunkPos currentChunk : currentChunks) {
            if (previousChunks.contains(currentChunk)) {
                continue;
            }
            boolean added = ForgeChunkManager.forceChunk(
                    level,
                    HimMod.MOD_ID,
                    him,
                    currentChunk.x,
                    currentChunk.z,
                    true,
                    TICKING_CHUNK
            );
            if (added) {
                addedCount++;
            }
        }

        for (ChunkPos previousChunk : previousChunks) {
            if (currentChunks.contains(previousChunk)) {
                continue;
            }
            boolean removed = ForgeChunkManager.forceChunk(
                    level,
                    HimMod.MOD_ID,
                    him.getUUID(),
                    previousChunk.x,
                    previousChunk.z,
                    false,
                    TICKING_CHUNK
            );
            if (removed) {
                removedCount++;
            }
        }

        if (previousChunks.isEmpty()) {
            HimLog.info("him chunk_tickets_acquired uuid={} center={} count={}", him.getUUID(), him.chunkPosition(), addedCount);
        } else {
            HimLog.info(
                    "him chunk_tickets_synced uuid={} center={} total={} added={} removed={}",
                    him.getUUID(),
                    him.chunkPosition(),
                    currentChunks.size(),
                    addedCount,
                    removedCount
            );
        }

        return currentChunks;
    }

    public static void releaseEntityTickets(ServerLevel level, UUID himId, Set<ChunkPos> chunkPositions) {
        if (chunkPositions.isEmpty()) {
            return;
        }

        int releasedCount = 0;
        for (ChunkPos chunkPos : chunkPositions) {
            boolean removed = ForgeChunkManager.forceChunk(
                    level,
                    HimMod.MOD_ID,
                    himId,
                    chunkPos.x,
                    chunkPos.z,
                    false,
                    TICKING_CHUNK
            );
            if (removed) {
                releasedCount++;
            }
        }
        HimLog.info("him chunk_tickets_released uuid={} count={}", himId, releasedCount);
    }

    private static void validateTickets(ServerLevel level, ForgeChunkManager.TicketHelper ticketHelper) {
        UUID currentHimId = HimLocator.currentHimId(level);
        for (UUID owner : ticketHelper.getEntityTickets().keySet()) {
            if (currentHimId != null && currentHimId.equals(owner)) {
                continue;
            }
            ticketHelper.removeAllTickets(owner);
            HimLog.info("him chunk_ticket_stale_cleared uuid={} dimension={}", owner, level.dimension().location());
        }
    }

    private static Set<ChunkPos> trackedChunks(ChunkPos centerChunk) {
        Set<ChunkPos> chunks = new HashSet<>();
        for (int dx = -CHUNK_RADIUS; dx <= CHUNK_RADIUS; dx++) {
            for (int dz = -CHUNK_RADIUS; dz <= CHUNK_RADIUS; dz++) {
                chunks.add(new ChunkPos(centerChunk.x + dx, centerChunk.z + dz));
            }
        }
        return Collections.unmodifiableSet(chunks);
    }
}
