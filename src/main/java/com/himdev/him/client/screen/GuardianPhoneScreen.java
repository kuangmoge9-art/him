package com.himdev.him.client.screen;

import com.himdev.him.item.GuardianPhoneSelection;
import com.himdev.him.network.GuardianPhoneSelectionPacket;
import com.himdev.him.network.HimNetwork;
import net.minecraft.Util;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public final class GuardianPhoneScreen extends Screen {
    private static final int PHONE_WIDTH = 214;
    private static final int SCREEN_INSET = 12;
    private static final int CARD_HEIGHT = 46;
    private static final int CARD_GAP = 10;
    private static final int CARD_TOP_OFFSET = 72;
    private static final int CARD_TO_FOOTER_GAP = 16;
    private static final int FOOTER_TEXT_BOTTOM_MARGIN = 22;
    private static final List<CardDefinition> CARD_DEFINITIONS = List.of(
            new CardDefinition(
                    GuardianPhoneSelection.FOLLOW,
                    0xFF0F766E,
                    Component.translatable("screen.him.guardian_phone.follow.desc"),
                    Component.translatable("screen.him.guardian_phone.follow.tag")
            ),
            new CardDefinition(
                    GuardianPhoneSelection.TIMED_FOLLOW,
                    0xFF1D4ED8,
                    Component.translatable("screen.him.guardian_phone.timed_follow.desc"),
                    Component.translatable("screen.him.guardian_phone.timed_follow.tag")
            ),
            new CardDefinition(
                    GuardianPhoneSelection.CANCEL_FOLLOW,
                    0xFFB91C1C,
                    Component.translatable("screen.him.guardian_phone.cancel_follow.desc"),
                    Component.translatable("screen.him.guardian_phone.cancel_follow.tag")
            )
    );
    private static final int PHONE_HEIGHT = requiredPhoneHeight(CARD_DEFINITIONS.size());

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
        int cardTop = screenTop + CARD_TOP_OFFSET;
        int cardWidth = screenWidth - 32;
        for (int index = 0; index < CARD_DEFINITIONS.size(); index++) {
            CardDefinition definition = CARD_DEFINITIONS.get(index);
            cards.add(new ActionCard(
                    definition.selection(),
                    cardLeft,
                    cardTop + (index * (CARD_HEIGHT + CARD_GAP)),
                    cardWidth,
                    CARD_HEIGHT,
                    definition.baseColor(),
                    definition.description(),
                    definition.tag()
            ));
        }
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        long animationTick = Util.getMillis();
        renderBackdrop(graphics, animationTick);
        renderPhoneShell(graphics, animationTick);
        renderAppChrome(graphics, animationTick);
        renderCards(graphics, mouseX, mouseY, animationTick);
        renderFooter(graphics, animationTick);
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

    private void renderBackdrop(GuiGraphics graphics, long animationTick) {
        graphics.fill(0, 0, this.width, this.height, 0xD80A0F17);
        for (int y = 0; y < this.height; y += 24) {
            graphics.fill(0, y, this.width, y + 1, 0x141F2937);
        }

        int leftGlow = withAlpha(animatedAccentColor(animationTick, 0.05F, 0.68F, 0.95F), 18);
        int rightGlow = withAlpha(animatedAccentColor(animationTick, 0.28F, 0.68F, 0.95F), 18);
        graphics.fill(phoneLeft - 24, phoneTop - 18, phoneLeft + 14, phoneTop + PHONE_HEIGHT + 18, leftGlow);
        graphics.fill(phoneLeft + PHONE_WIDTH - 14, phoneTop - 18, phoneLeft + PHONE_WIDTH + 24, phoneTop + PHONE_HEIGHT + 18, rightGlow);
    }

    private void renderPhoneShell(GuiGraphics graphics, long animationTick) {
        int shellAccent = blend(0xFF293548, animatedAccentColor(animationTick, 0.58F, 0.56F, 0.92F), 0.28F);
        int shellHighlight = blend(0xFF4B5563, animatedAccentColor(animationTick, 0.68F, 0.48F, 0.98F), 0.22F);
        int screenEdge = blend(0xFF1E293B, animatedAccentColor(animationTick, 0.16F, 0.60F, 0.88F), 0.24F);
        int screenHighlight = blend(0xFF334155, animatedAccentColor(animationTick, 0.24F, 0.54F, 0.98F), 0.28F);

        drawSoftShadow(graphics, phoneLeft + 6, phoneTop + 8, PHONE_WIDTH, PHONE_HEIGHT, 0x44000000);
        drawRoundedPanel(graphics, phoneLeft, phoneTop, PHONE_WIDTH, PHONE_HEIGHT, 0xFF0B1220, shellAccent, shellHighlight);
        drawRoundedPanel(graphics, screenLeft, screenTop, screenWidth, screenHeight, 0xFF111827, screenEdge, screenHighlight);

        int notchWidth = 58;
        int notchHeight = 10;
        int notchLeft = phoneLeft + (PHONE_WIDTH - notchWidth) / 2;
        int notchTop = phoneTop + 6;
        drawRoundedPanel(graphics, notchLeft, notchTop, notchWidth, notchHeight, 0xFF020617, 0xFF0F172A, 0xFF111827);
        graphics.fill(notchLeft + 14, notchTop + 4, notchLeft + 34, notchTop + 5, 0xFF64748B);
        graphics.fill(notchLeft + 40, notchTop + 3, notchLeft + 43, notchTop + 6, 0xFF0F172A);
    }

    private void renderAppChrome(GuiGraphics graphics, long animationTick) {
        int headerTop = screenTop + 10;
        drawAnimatedBar(graphics, screenLeft + 12, headerTop + 26, screenWidth - 24, 2, animationTick, 0.12F, 76);

        int statusColor = blend(0xFF94A3B8, animatedAccentColor(animationTick, 0.32F, 0.40F, 1.00F), 0.34F);
        int titleColor = animatedAccentColor(animationTick, 0.00F, 0.72F, 1.00F);
        int subtitleColor = blend(0xFF93C5FD, animatedAccentColor(animationTick, 0.16F, 0.56F, 1.00F), 0.42F);

        graphics.drawString(this.font, Component.literal("18:20"), screenLeft + 14, screenTop + 8, statusColor, false);
        graphics.drawString(this.font, Component.literal("4G"), screenLeft + screenWidth - 28, screenTop + 8, statusColor, false);

        graphics.drawCenteredString(this.font, this.title, this.width / 2, headerTop, titleColor);
        graphics.drawCenteredString(
                this.font,
                Component.translatable("screen.him.guardian_phone.subtitle"),
                this.width / 2,
                headerTop + 14,
                subtitleColor
        );
    }

    private void renderCards(GuiGraphics graphics, int mouseX, int mouseY, long animationTick) {
        for (ActionCard card : cards) {
            boolean hovered = card.contains(mouseX, mouseY);
            float pulse = pulse(animationTick, card.selection().ordinal() * 0.17F);
            int accentColor = blend(
                    card.baseColor(),
                    animatedAccentColor(animationTick, 0.08F + (card.selection().ordinal() * 0.13F), 0.76F, 1.00F),
                    0.18F + (pulse * 0.20F) + (hovered ? 0.12F : 0.00F)
            );
            int bodyColor = blend(0xFFF8FAFC, accentColor, hovered ? 0.18F : 0.08F);
            int edgeColor = blend(0xFFE2E8F0, accentColor, hovered ? 0.74F : 0.32F);
            int shadowColor = hovered ? 0x38000000 : 0x22000000;
            int titleTextColor = blend(0xFF0F172A, accentColor, 0.20F);
            int descTextColor = blend(0xFF64748B, accentColor, 0.24F);
            int tagFill = withAlpha(accentColor, hovered ? 76 : 46);
            int tagEdge = withAlpha(accentColor, hovered ? 140 : 98);

            drawSoftShadow(graphics, card.x() + 2, card.y() + 3, card.width(), card.height(), shadowColor);
            drawRoundedPanel(graphics, card.x(), card.y(), card.width(), card.height(), bodyColor, edgeColor, 0xFFFFFFFF);
            graphics.fill(card.x() + 6, card.y() + 6, card.x() + 12, card.y() + card.height() - 6, accentColor);
            graphics.fill(card.x() + 18, card.y() + 8, card.x() + 46, card.y() + 18, withAlpha(accentColor, 46));

            graphics.drawString(this.font, Component.translatable(card.selection().translationKey()), card.x() + 18, card.y() + 10, titleTextColor, false);
            graphics.drawString(this.font, card.description(), card.x() + 18, card.y() + 24, descTextColor, false);

            int tagWidth = this.font.width(card.tag()) + 10;
            int tagLeft = card.x() + card.width() - tagWidth - 10;
            drawRoundedPanel(graphics, tagLeft, card.y() + 9, tagWidth, 12, tagFill, tagEdge, withAlpha(0xFFFFFFFF, hovered ? 116 : 80));
            graphics.drawCenteredString(this.font, card.tag(), tagLeft + (tagWidth / 2), card.y() + 11, accentColor);
        }
    }

    private void renderFooter(GuiGraphics graphics, long animationTick) {
        int footerColor = blend(0xFF94A3B8, animatedAccentColor(animationTick, 0.44F, 0.44F, 0.96F), 0.32F);
        int homeColor = animatedAccentColor(animationTick, 0.54F, 0.58F, 0.96F);

        graphics.drawCenteredString(
                this.font,
                Component.translatable("screen.him.guardian_phone.footer"),
                this.width / 2,
                footerTextY(),
                footerColor
        );
        drawRoundedPanel(
                graphics,
                phoneLeft + (PHONE_WIDTH / 2) - 20,
                phoneTop + PHONE_HEIGHT - 10,
                40,
                4,
                withAlpha(homeColor, 102),
                withAlpha(homeColor, 76),
                withAlpha(0xFFFFFFFF, 136)
        );
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

    private void drawAnimatedBar(GuiGraphics graphics, int x, int y, int width, int height, long animationTick, float hueOffset, int alpha) {
        int segmentWidth = 6;
        for (int offset = 0; offset < width; offset += segmentWidth) {
            float segmentOffset = width <= segmentWidth ? 0.0F : offset / (float) (width - segmentWidth);
            int color = withAlpha(animatedAccentColor(animationTick, hueOffset + (segmentOffset * 0.18F), 0.74F, 0.98F), alpha);
            graphics.fill(x + offset, y, x + Math.min(width, offset + segmentWidth), y + height, color);
        }
    }

    private static int withAlpha(int color, int alpha) {
        return (alpha << 24) | (color & 0x00FFFFFF);
    }

    private static int animatedAccentColor(long animationTick, float hueOffset, float saturation, float brightness) {
        float cycle = (animationTick % 3600L) / 3600.0F;
        return 0xFF000000 | (Color.HSBtoRGB(wrapHue(cycle + hueOffset), saturation, brightness) & 0x00FFFFFF);
    }

    private static float pulse(long animationTick, float offset) {
        double angle = (((animationTick % 2800L) / 2800.0D) + offset) * Math.PI * 2.0D;
        return (float) ((Math.sin(angle) + 1.0D) * 0.5D);
    }

    private static int blend(int fromColor, int toColor, float amount) {
        float clampedAmount = Math.max(0.0F, Math.min(1.0F, amount));
        int fromA = (fromColor >>> 24) & 0xFF;
        int fromR = (fromColor >>> 16) & 0xFF;
        int fromG = (fromColor >>> 8) & 0xFF;
        int fromB = fromColor & 0xFF;
        int toA = (toColor >>> 24) & 0xFF;
        int toR = (toColor >>> 16) & 0xFF;
        int toG = (toColor >>> 8) & 0xFF;
        int toB = toColor & 0xFF;
        int a = Math.round(fromA + ((toA - fromA) * clampedAmount));
        int r = Math.round(fromR + ((toR - fromR) * clampedAmount));
        int g = Math.round(fromG + ((toG - fromG) * clampedAmount));
        int b = Math.round(fromB + ((toB - fromB) * clampedAmount));
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private static float wrapHue(float hue) {
        float wrapped = hue % 1.0F;
        return wrapped < 0.0F ? wrapped + 1.0F : wrapped;
    }

    private int footerTextY() {
        return screenTop + screenHeight - FOOTER_TEXT_BOTTOM_MARGIN;
    }

    private static int requiredPhoneHeight(int cardCount) {
        return (SCREEN_INSET * 2)
                + CARD_TOP_OFFSET
                + totalCardStackHeight(cardCount)
                + CARD_TO_FOOTER_GAP
                + FOOTER_TEXT_BOTTOM_MARGIN;
    }

    private static int totalCardStackHeight(int cardCount) {
        return (cardCount * CARD_HEIGHT) + (Math.max(0, cardCount - 1) * CARD_GAP);
    }

    private record CardDefinition(
            GuardianPhoneSelection selection,
            int baseColor,
            Component description,
            Component tag
    ) {
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
