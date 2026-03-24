/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.FriendlyByteBuf
 *  net.minecraftforge.network.NetworkEvent$Context
 */
package net.mcreator.ultimateskeletons.network;

import java.util.function.Supplier;
import net.mcreator.ultimateskeletons.Deathlist;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

public class DisableSpawnPacket {
    private final boolean disableSpawn;

    public DisableSpawnPacket(boolean disableSpawn) {
        this.disableSpawn = disableSpawn;
    }

    public DisableSpawnPacket(FriendlyByteBuf buffer) {
        this.disableSpawn = buffer.readBoolean();
    }

    public void toBytes(FriendlyByteBuf buffer) {
        buffer.writeBoolean(this.disableSpawn);
    }

    public void handler(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            Deathlist.disableSpawn = this.disableSpawn;
        });
        ctx.get().setPacketHandled(true);
    }
}

