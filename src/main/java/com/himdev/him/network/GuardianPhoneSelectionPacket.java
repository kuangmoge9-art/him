package com.himdev.him.network;

import com.himdev.him.item.GuardianPhoneSelection;
import com.himdev.him.item.GuardianPhoneService;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public final class GuardianPhoneSelectionPacket {
    private final GuardianPhoneSelection selection;

    public GuardianPhoneSelectionPacket(GuardianPhoneSelection selection) {
        this.selection = selection;
    }

    public static void encode(GuardianPhoneSelectionPacket packet, FriendlyByteBuf buffer) {
        buffer.writeEnum(packet.selection);
    }

    public static GuardianPhoneSelectionPacket decode(FriendlyByteBuf buffer) {
        return new GuardianPhoneSelectionPacket(buffer.readEnum(GuardianPhoneSelection.class));
    }

    public static void handle(GuardianPhoneSelectionPacket packet, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            if (context.getSender() != null) {
                GuardianPhoneService.handleSelection(context.getSender(), packet.selection);
            }
        });
        context.setPacketHandled(true);
    }
}
