package com.himdev.him.client.screen;

import com.himdev.him.item.GuardianPhoneSelection;
import com.himdev.him.network.GuardianPhoneSelectionPacket;
import com.himdev.him.network.HimNetwork;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

import java.util.ArrayList;
import java.util.List;

public final class GuardianPhoneScreen extends Screen {
    private static final int PHONE_WIDTH = 214;
    private static final int PHONE_HEIGHT = 252;
    private static final int SCREEN_INSET = 12;
    private static final int CARD_HEIGHT = 46;
    private static final int CARD_GAP = 10;

    private final List<ActionCard> cards = new ArrayList<>();
    private int phoneLeft;
    private int phoneTop;
    private int screenLeft;
    private int screenTop;
    private int screenWidth;
    private int screenHeight;

    public GuardianPhoneScreen() {
        super(Component.translatable("screen.him.guardian_phone.title"));
    }

    @Override
    protected void init() {
        super.init();
        this.phoneLeft = (this.width - PHONE_WIDTH) / 2;
        this.phoneTop = (this.height - PHONE_HEIGHT) / 2;
        this.screenLeft = phoneLeft + SCREEN_INSET;
        this.screenTop = phoneTop + SCREEN_INSET;
        this.screenWidth = PHONE_WIDTH - (SCREEN_INSET * 2);
        this.screenHeight = PHONE_HEIGHT - (SCREEN_INSET * 2);

        cards.clear();
        int cardLeft = screenLeft + 16;
        int cardTop = screenTop + 66;
        int cardWidth = screenWidth - 32;
        cards.add(new ActionCard(
                GuardianPhoneSelection.FOLLOW,
                cardLeft,
                cardTop,
                cardWidth,
                CARD_HEIGHT,
                0xFF0F766E,
                Component.translatable("screen.him.guardian_phone.follow.desc"),
                Component.translatable("screen.him.guardian_phone.follow.tag")
        ));
        cards.add(new ActionCard(
                GuardianPhoneSelection.TIMED_FOLLOW,
                cardLeft,
                cardTop + CARD_HEIGHT + CARD_GAP,
                cardWidth,
                CARD_HEIGHT,
                0xFF1D4ED8,
                Component.translatable("screen.him.guardian_phone.timed_follow.desc"),
                Component.translatable("screen.him.guardian_phone.timed_follow.tag")
        ));
        cards.add(new ActionCard(
                GuardianPhoneSelection.CANCEL_FOLLOW,
                cardLeft,
                cardTop + ((CARD_HEIGHT + CARD_GAP) * 2),
                cardWidth,
                CARD_HEIGHT,
                0xFFB91C1C,
                Component.translatable("screen.him.guardian_phone.cancel_follow.desc"),
                Component.translatable("screen.him.guardian_phone.cancel_follow.tag")
        ));
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        renderBackdrop(graphics);
        renderPhoneShell(graphics);
        renderAppChrome(graphics);
        renderCards(graphics, mouseX, mouseY);
        renderFooter(graphics);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0) {
            for (ActionCard card : cards) {
                if (card.contains(mouseX, mouseY)) {
                    HimNetwork.CHANNEL.sendToServer(new GuardianPhoneSelectionPacket(card.selection()));
                    onClose();
                    return true;
                }
            }
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    private void renderBackdrop(GuiGraphics graphics) {
        graphics.fill(0, 0, this.width, this.height, 0xD80A0F17);
        for (int y = 0; y < this.height; y += 24) {
            graphics.fill(0, y, this.width, y + 1, 0x141F2937);
        }
    }

    private void renderPhoneShell(GuiGraphics graphics) {
        drawSoftShadow(graphics, phoneLeft + 6, phoneTop + 8, PHONE_WIDTH, PHONE_HEIGHT, 0x44000000);
        drawRoundedPanel(graphics, phoneLeft, phoneTop, PHONE_WIDTH, PHONE_HEIGHT, 0xFF0B1220, 0xFF293548, 0xFF4B5563);
        drawRoundedPanel(graphics, screenLeft, screenTop, screenWidth, screenHeight, 0xFF111827, 0xFF1E293B, 0xFF334155);

        int notchWidth = 58;
        int notchHeight = 10;
        int notchLeft = phoneLeft + (PHONE_WIDTH - notchWidth) / 2;
        int notchTop = phoneTop + 6;
        drawRoundedPanel(graphics, notchLeft, notchTop, notchWidth, notchHeight, 0xFF020617, 0xFF0F172A, 0xFF111827);
        graphics.fill(notchLeft + 14, notchTop + 4, notchLeft + 34, notchTop + 5, 0xFF64748B);
        graphics.fill(notchLeft + 40, notchTop + 3, notchLeft + 43, notchTop + 6, 0xFF0F172A);
    }

    private void renderAppChrome(GuiGraphics graphics) {
        int headerTop = screenTop + 10;
        graphics.fill(screenLeft + 12, headerTop + 26, screenLeft + screenWidth - 12, headerTop + 27, 0x1838BDF8);

        graphics.drawString(this.font, Component.literal("18:20"), screenLeft + 14, screenTop + 8, 0xFF94A3B8, false);
        graphics.drawString(this.font, Component.literal("4G"), screenLeft + screenWidth - 28, screenTop + 8, 0xFF94A3B8, false);

        graphics.drawCenteredString(this.font, this.title, this.width / 2, headerTop, 0xFFF8FAFC);
        graphics.drawCenteredString(
                this.font,
                Component.translatable("screen.him.guardian_phone.subtitle"),
                this.width / 2,
                headerTop + 14,
                0xFF93C5FD
        );
    }

    private void renderCards(GuiGraphics graphics, int mouseX, int mouseY) {
        for (ActionCard card : cards) {
            boolean hovered = card.contains(mouseX, mouseY);
            int bodyColor = hovered ? lighten(card.baseColor(), 0x00181818) : 0xFFF8FAFC;
            int edgeColor = hovered ? card.baseColor() : 0xFFE2E8F0;
            int shadowColor = hovered ? 0x38000000 : 0x22000000;

            drawSoftShadow(graphics, card.x() + 2, card.y() + 3, card.width(), card.height(), shadowColor);
            drawRoundedPanel(graphics, card.x(), card.y(), card.width(), card.height(), bodyColor, edgeColor, 0xFFFFFFFF);
            graphics.fill(card.x() + 6, card.y() + 6, card.x() + 12, card.y() + card.height() - 6, card.baseColor());
            graphics.fill(card.x() + 18, card.y() + 8, card.x() + 46, card.y() + 18, withAlpha(card.baseColor(), 46));

            graphics.drawString(this.font, Component.translatable(card.selection().translationKey()), card.x() + 18, card.y() + 10, 0xFF0F172A, false);
            graphics.drawString(this.font, card.description(), card.x() + 18, card.y() + 24, 0xFF64748B, false);

            int tagWidth = this.font.width(card.tag()) + 10;
            int tagLeft = card.x() + card.width() - tagWidth - 10;
            drawRoundedPanel(graphics, tagLeft, card.y() + 9, tagWidth, 12, withAlpha(card.baseColor(), 40), withAlpha(card.baseColor(), 90), withAlpha(0xFFFFFFFF, 80));
            graphics.drawCenteredString(this.font, card.tag(), tagLeft + (tagWidth / 2), card.y() + 11, card.baseColor());
        }
    }

    private void renderFooter(GuiGraphics graphics) {
        graphics.drawCenteredString(
                this.font,
                Component.translatable("screen.him.guardian_phone.footer"),
                this.width / 2,
                screenTop + screenHeight - 26,
                0xFF94A3B8
        );
        drawRoundedPanel(graphics, phoneLeft + (PHONE_WIDTH / 2) - 20, phoneTop + PHONE_HEIGHT - 10, 40, 4, 0x66E2E8F0, 0x44CBD5E1, 0x88FFFFFF);
    }

    private void drawSoftShadow(GuiGraphics graphics, int x, int y, int width, int height, int color) {
        graphics.fill(x + 2, y + 1, x + width - 2, y + height + 3, color);
        graphics.fill(x + 1, y + 2, x + width + 1, y + height + 2, color);
    }

    private void drawRoundedPanel(GuiGraphics graphics, int x, int y, int width, int height, int fillColor, int edgeColor, int highlightColor) {
        graphics.fill(x + 1, y, x + width - 1, y + height, edgeColor);
        graphics.fill(x, y + 1, x + width, y + height - 1, edgeColor);
        graphics.fill(x + 1, y + 1, x + width - 1, y + height - 1, fillColor);
        graphics.fill(x + 1, y + 1, x + width - 1, y + 2, highlightColor);
        graphics.fill(x + 1, y + 1, x + 2, y + height - 1, withAlpha(highlightColor, 140));
    }

    private static int withAlpha(int color, int alpha) {
        return (alpha << 24) | (color & 0x00FFFFFF);
    }

    private static int lighten(int color, int delta) {
        int a = (color >>> 24) & 0xFF;
        int r = Math.min(255, ((color >>> 16) & 0xFF) + ((delta >>> 16) & 0xFF));
        int g = Math.min(255, ((color >>> 8) & 0xFF) + ((delta >>> 8) & 0xFF));
        int b = Math.min(255, (color & 0xFF) + (delta & 0xFF));
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private record ActionCard(
            GuardianPhoneSelection selection,
            int x,
            int y,
            int width,
            int height,
            int baseColor,
            Component description,
            Component tag
    ) {
        private boolean contains(double mouseX, double mouseY) {
            return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
        }
    }
}
