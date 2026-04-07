package com.himdev.him.client.screen;

import com.himdev.him.item.GuardianPhoneSelection;
import com.himdev.him.network.GuardianPhoneSelectionPacket;
import com.himdev.him.network.HimNetwork;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public final class GuardianPhoneScreen extends Screen {
    private static final int BUTTON_WIDTH = 160;
    private static final int BUTTON_HEIGHT = 20;
    private static final int BUTTON_GAP = 8;

    public GuardianPhoneScreen() {
        super(Component.translatable("screen.him.guardian_phone.title"));
    }

    @Override
    protected void init() {
        super.init();
        int left = (this.width - BUTTON_WIDTH) / 2;
        int top = (this.height - ((BUTTON_HEIGHT * 3) + (BUTTON_GAP * 2))) / 2 + 12;

        addRenderableWidget(modeButton(left, top, GuardianPhoneSelection.FOLLOW));
        addRenderableWidget(modeButton(left, top + BUTTON_HEIGHT + BUTTON_GAP, GuardianPhoneSelection.TIMED_FOLLOW));
        addRenderableWidget(modeButton(left, top + ((BUTTON_HEIGHT + BUTTON_GAP) * 2), GuardianPhoneSelection.CANCEL_FOLLOW));
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        renderBackground(graphics);
        super.render(graphics, mouseX, mouseY, partialTick);

        graphics.drawCenteredString(this.font, this.title, this.width / 2, this.height / 2 - 52, 0xF1F5F9);
        graphics.drawCenteredString(
                this.font,
                Component.translatable("screen.him.guardian_phone.subtitle"),
                this.width / 2,
                this.height / 2 - 36,
                0x94A3B8
        );
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    private Button modeButton(int x, int y, GuardianPhoneSelection selection) {
        return Button.builder(Component.translatable(selection.translationKey()), button -> {
            HimNetwork.CHANNEL.sendToServer(new GuardianPhoneSelectionPacket(selection));
            onClose();
        }).bounds(x, y, BUTTON_WIDTH, BUTTON_HEIGHT).build();
    }
}
