package com.himdev.him.network;

import com.himdev.him.HimMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public final class HimNetwork {
    private static final String PROTOCOL_VERSION = "1";
    private static int nextMessageId;

    public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(
            ResourceLocation.fromNamespaceAndPath(HimMod.MOD_ID, "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    private HimNetwork() {
    }

    public static void register() {
        nextMessageId = 0;
        CHANNEL.registerMessage(
                nextMessageId++,
                GuardianPhoneSelectionPacket.class,
                GuardianPhoneSelectionPacket::encode,
                GuardianPhoneSelectionPacket::decode,
                GuardianPhoneSelectionPacket::handle
        );
    }
}
