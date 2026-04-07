package com.himdev.him.client;

import com.himdev.him.client.screen.GuardianPhoneScreen;
import net.minecraft.client.Minecraft;

public final class GuardianPhoneClient {
    private GuardianPhoneClient() {
    }

    public static void openPhoneScreen() {
        Minecraft minecraft = Minecraft.getInstance();
        if (minecraft == null) {
            return;
        }
        minecraft.setScreen(new GuardianPhoneScreen());
    }
}
