package com.himdev.him.world;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import com.himdev.him.util.HimLog;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.ChunkPos;
import net.minecraftforge.common.world.ForgeChunkManager;

import javax.annotation.Nullable;
import java.util.UUID;

public final class HimChunkLoading {
    private static final boolean TICKING_CHUNK = true;

    private HimChunkLoading() {
    }

    public static void registerValidationCallback() {
        ForgeChunkManager.setForcedChunkLoadingCallback(HimMod.MOD_ID, HimChunkLoading::validateTickets);
    }

    public static ChunkPos syncEntityTicket(ServerLevel level, HimEntity him, @Nullable ChunkPos previousChunk) {
        ChunkPos currentChunk = him.chunkPosition();
        if (currentChunk.equals(previousChunk)) {
            return previousChunk;
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

        if (previousChunk != null && !previousChunk.equals(currentChunk)) {
            boolean removed = ForgeChunkManager.forceChunk(
                    level,
                    HimMod.MOD_ID,
                    him.getUUID(),
                    previousChunk.x,
                    previousChunk.z,
                    false,
                    TICKING_CHUNK
            );
            HimLog.info(
                    "him chunk_ticket_moved uuid={} from={} to={} add={} remove={}",
                    him.getUUID(),
                    previousChunk,
                    currentChunk,
                    added,
                    removed
            );
        } else if (added) {
            HimLog.info("him chunk_ticket_acquired uuid={} chunk={}", him.getUUID(), currentChunk);
        }

        return currentChunk;
    }

    public static void releaseEntityTicket(ServerLevel level, UUID himId, @Nullable ChunkPos chunkPos) {
        if (chunkPos == null) {
            return;
        }

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
            HimLog.info("him chunk_ticket_released uuid={} chunk={}", himId, chunkPos);
        }
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
}
