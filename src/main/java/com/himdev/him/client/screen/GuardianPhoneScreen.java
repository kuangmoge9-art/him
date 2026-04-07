package com.himdev.him.client.screen;

import com.himdev.him.item.GuardianPhoneSelection;
import com.himdev.him.network.GuardianPhoneSelectionPacket;
import com.himdev.him.network.HimNetwork;
import net.minecraft.Util;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

import java.util.ArrayList;
import java.util.List;

public final class GuardianPhoneScreen extends Screen {
    private static final int PHONE_WIDTH = 236;
    private static final int SCREEN_INSET = 10;
    private static final int CARD_HEIGHT = 50;
    private static final int CARD_GAP = 10;
    private static final int CARD_TOP_OFFSET = 88;
    private static final int CARD_TO_FOOTER_GAP = 18;
    private static final int FOOTER_TEXT_BOTTOM_MARGIN = 20;
    private static final Component NETWORK_LABEL = Component.literal("114514G");
    private static final Component STATUS_PILL = Component.literal("HIM");
    private static final List<CardDefinition> CARD_DEFINITIONS = List.of(
            new CardDefinition(
                    GuardianPhoneSelection.FOLLOW,
                    0xFF14B8A6,
                    Component.translatable("screen.him.guardian_phone.follow.desc"),
                    Component.translatable("screen.him.guardian_phone.follow.tag")
            ),
            new CardDefinition(
                    GuardianPhoneSelection.TIMED_FOLLOW,
                    0xFF4F46E5,
                    Component.translatable("screen.him.guardian_phone.timed_follow.desc"),
                    Component.translatable("screen.him.guardian_phone.timed_follow.tag")
            ),
            new CardDefinition(
                    GuardianPhoneSelection.CANCEL_FOLLOW,
                    0xFFF97316,
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
        fillVerticalGradientRect(graphics, 0, 0, this.width, this.height, 0xF60A1121, 0xFF040813);
        int gridColor = withAlpha(0xFF87A5D6, 10);
        for (int y = 0; y < this.height; y += 18) {
            graphics.fill(0, y, this.width, y + 1, gridColor);
        }
        for (int x = 0; x < this.width; x += 22) {
            graphics.fill(x, 0, x + 1, this.height, withAlpha(0xFF1D4ED8, 8));
        }

        int pulseAlpha = 18 + Math.round(pulse(animationTick, 0.08F) * 16.0F);
        drawAmbientGlow(graphics, phoneLeft - 24, phoneTop + 18, 54, PHONE_HEIGHT - 36, withAlpha(0xFF14B8A6, pulseAlpha));
        drawAmbientGlow(graphics, phoneLeft + PHONE_WIDTH - 30, phoneTop + 28, 60, PHONE_HEIGHT - 56, withAlpha(0xFF4F46E5, pulseAlpha + 6));
    }

    private void renderPhoneShell(GuiGraphics graphics, long animationTick) {
        int shellGlow = 18 + Math.round(pulse(animationTick, 0.24F) * 10.0F);
        drawSoftShadow(graphics, phoneLeft + 8, phoneTop + 10, PHONE_WIDTH, PHONE_HEIGHT, 0x50000000);
        drawPanelSurface(graphics, phoneLeft, phoneTop, PHONE_WIDTH, PHONE_HEIGHT, 0xFF070B16, 0xFF111A2D, 0xFF273755, 0xFF425B86);
        drawPanelSurface(
                graphics,
                phoneLeft + 5,
                phoneTop + 5,
                PHONE_WIDTH - 10,
                PHONE_HEIGHT - 10,
                0xFF0A1120,
                0xFF11192B,
                0xFF162238,
                withAlpha(0xFF8AA6DB, 92 + shellGlow)
        );
        drawPanelSurface(graphics, screenLeft, screenTop, screenWidth, screenHeight, 0xFF0D1628, 0xFF131E34, 0xFF213251, 0xFF4B6EA5);

        int speakerLeft = phoneLeft + (PHONE_WIDTH / 2) - 28;
        int speakerTop = phoneTop + 7;
        drawCapsule(graphics, speakerLeft, speakerTop, 56, 10, 0xFF02050B, 0xFF0D1525, 0xFF1E2B43);
        graphics.fill(speakerLeft + 15, speakerTop + 4, speakerLeft + 41, speakerTop + 5, 0xFF5B6A87);
        graphics.fill(phoneLeft + 26, phoneTop + 9, phoneLeft + 32, phoneTop + 15, 0xFF0A1220);
        graphics.fill(phoneLeft + 28, phoneTop + 11, phoneLeft + 30, phoneTop + 13, 0xFF314664);
    }

    private void renderAppChrome(GuiGraphics graphics, long animationTick) {
        int headerLeft = screenLeft + 14;
        int headerTop = screenTop + 24;
        int headerWidth = screenWidth - 28;
        int headerHeight = 40;
        int statusY = screenTop + 9;
        int statusColor = 0xFFD8E3F8;
        int statusMuted = 0xFFA3B6D4;

        graphics.drawString(this.font, Component.literal("18:20"), screenLeft + 14, statusY, statusColor, false);

        int batteryWidth = 12;
        int batteryLeft = screenLeft + screenWidth - 16 - batteryWidth;
        drawBattery(graphics, batteryLeft, statusY + 1, batteryWidth, 7, 0xFFCFE2FF, 0xFFA3B6D4);

        int labelWidth = this.font.width(NETWORK_LABEL);
        int labelLeft = batteryLeft - 5 - labelWidth;
        graphics.drawString(this.font, NETWORK_LABEL, labelLeft, statusY, statusColor, false);
        drawSignalBars(graphics, labelLeft - 14, statusY + 7, statusMuted);

        drawPanelSurface(graphics, headerLeft, headerTop, headerWidth, headerHeight, 0xFF121D33, 0xFF182742, 0xFF294062, 0xFF5B82C1);
        graphics.fill(headerLeft + 10, headerTop + 8, headerLeft + 14, headerTop + headerHeight - 8, 0xFF14B8A6);
        graphics.fill(headerLeft + 20, headerTop + 10, headerLeft + headerWidth - 20, headerTop + 11, withAlpha(0xFF8FB5FF, 46));

        int titleColor = 0xFFF5F8FF;
        int subtitleColor = 0xFFA9BDD9;
        graphics.drawString(this.font, this.title, headerLeft + 22, headerTop + 8, titleColor, false);
        graphics.drawString(
                this.font,
                Component.translatable("screen.him.guardian_phone.subtitle"),
                headerLeft + 22,
                headerTop + 22,
                subtitleColor,
                false
        );

        int pillWidth = this.font.width(STATUS_PILL) + 14;
        int pillLeft = headerLeft + headerWidth - pillWidth - 12;
        int pillPulse = 26 + Math.round(pulse(animationTick, 0.36F) * 22.0F);
        drawCapsule(graphics, pillLeft, headerTop + 11, pillWidth, 14, 0xFF16263E, 0xFF2F4B74, withAlpha(0xFF14B8A6, 120 + pillPulse));
        graphics.drawCenteredString(this.font, STATUS_PILL, pillLeft + (pillWidth / 2), headerTop + 14, 0xFFE9FFF9);

        drawAnimatedDivider(graphics, screenLeft + 14, headerTop + headerHeight + 8, screenWidth - 28, animationTick);
    }

    private void renderCards(GuiGraphics graphics, int mouseX, int mouseY, long animationTick) {
        for (ActionCard card : cards) {
            boolean hovered = card.contains(mouseX, mouseY);
            float pulse = pulse(animationTick, card.selection().ordinal() * 0.19F);
            int accentColor = blend(card.baseColor(), 0xFFFFFFFF, 0.10F + (hovered ? 0.10F : 0.04F) + (pulse * 0.08F));
            int bodyTop = blend(0xFF10192B, accentColor, hovered ? 0.24F : 0.16F);
            int bodyBottom = blend(0xFF0C1423, accentColor, hovered ? 0.18F : 0.11F);
            int edgeColor = blend(0xFF233251, accentColor, hovered ? 0.78F : 0.58F);
            int highlightColor = blend(0xFF45658E, accentColor, hovered ? 0.82F : 0.56F);
            int titleTextColor = 0xFFF5F8FF;
            int descTextColor = 0xFF99ABC8;
            int shadowColor = hovered ? 0x54000000 : 0x38000000;
            int tagFill = blend(0xFF162238, accentColor, hovered ? 0.84F : 0.72F);
            int tagEdge = blend(0xFF365383, accentColor, hovered ? 0.92F : 0.78F);
            int tagTextColor = 0xFFF9FCFF;

            drawSoftShadow(graphics, card.x() + 2, card.y() + 4, card.width(), card.height(), shadowColor);
            drawPanelSurface(graphics, card.x(), card.y(), card.width(), card.height(), bodyTop, bodyBottom, edgeColor, highlightColor);
            graphics.fill(card.x() + 8, card.y() + 7, card.x() + 12, card.y() + card.height() - 7, accentColor);
            graphics.fill(card.x() + 18, card.y() + 9, card.x() + card.width() - 18, card.y() + 10, withAlpha(accentColor, 38));

            int tagWidth = this.font.width(card.tag()) + 14;
            int tagLeft = card.x() + card.width() - tagWidth - 12;
            drawCapsule(
                    graphics,
                    tagLeft,
                    card.y() + 10,
                    tagWidth,
                    14,
                    tagFill,
                    tagEdge,
                    withAlpha(0xFFFFFFFF, hovered ? 140 : 96)
            );

            graphics.drawString(this.font, Component.translatable(card.selection().translationKey()), card.x() + 20, card.y() + 12, titleTextColor, false);
            graphics.drawString(this.font, card.description(), card.x() + 20, card.y() + 28, descTextColor, false);
            graphics.drawCenteredString(this.font, card.tag(), tagLeft + (tagWidth / 2), card.y() + 14, tagTextColor);
        }
    }

    private void renderFooter(GuiGraphics graphics, long animationTick) {
        int footerColor = 0xFF91A7CC;
        graphics.drawCenteredString(
                this.font,
                Component.translatable("screen.him.guardian_phone.footer"),
                this.width / 2,
                footerTextY(),
                footerColor
        );

        int homeLeft = phoneLeft + (PHONE_WIDTH / 2) - 24;
        int homeTop = phoneTop + PHONE_HEIGHT - 12;
        int glowAlpha = 36 + Math.round(pulse(animationTick, 0.48F) * 28.0F);
        drawCapsule(graphics, homeLeft, homeTop, 48, 5, withAlpha(0xFF15233B, 180), withAlpha(0xFF415C88, 160), withAlpha(0xFF9CC5FF, glowAlpha));
    }

    private void drawAmbientGlow(GuiGraphics graphics, int x, int y, int width, int height, int color) {
        graphics.fill(x, y + 8, x + width, y + height - 8, color);
        graphics.fill(x + 6, y, x + width - 6, y + height, color);
    }

    private void drawSoftShadow(GuiGraphics graphics, int x, int y, int width, int height, int color) {
        graphics.fill(x + 3, y + 2, x + width - 3, y + height + 4, color);
        graphics.fill(x + 1, y + 4, x + width + 2, y + height + 2, withAlpha(color, ((color >>> 24) & 0xFF) / 2));
    }

    private void drawPanelSurface(
            GuiGraphics graphics,
            int x,
            int y,
            int width,
            int height,
            int fillTop,
            int fillBottom,
            int edgeColor,
            int highlightColor
    ) {
        graphics.fill(x + 1, y, x + width - 1, y + height, edgeColor);
        graphics.fill(x, y + 1, x + width, y + height - 1, edgeColor);
        fillVerticalGradientRect(graphics, x + 1, y + 1, width - 2, height - 2, fillTop, fillBottom);
        graphics.fill(x + 1, y + 1, x + width - 1, y + 2, highlightColor);
        graphics.fill(x + 1, y + 1, x + 2, y + height - 1, withAlpha(highlightColor, 150));
        graphics.fill(x + width - 2, y + 2, x + width - 1, y + height - 2, withAlpha(highlightColor, 52));
    }

    private void drawCapsule(GuiGraphics graphics, int x, int y, int width, int height, int fillColor, int edgeColor, int highlightColor) {
        drawPanelSurface(graphics, x, y, width, height, fillColor, blend(fillColor, 0xFF000000, 0.12F), edgeColor, highlightColor);
    }

    private void drawAnimatedDivider(GuiGraphics graphics, int x, int y, int width, long animationTick) {
        int segmentWidth = 12;
        int gap = 4;
        int cycle = (int) ((animationTick / 90L) % (segmentWidth + gap));
        for (int offset = 0; offset < width; offset += segmentWidth + gap) {
            boolean bright = ((offset + cycle) / (segmentWidth + gap)) % 2 == 0;
            int color = bright ? 0xFF59A4FF : 0xFF1D355A;
            graphics.fill(x + offset, y, x + Math.min(width, offset + segmentWidth), y + 2, withAlpha(color, bright ? 118 : 72));
        }
    }

    private void drawSignalBars(GuiGraphics graphics, int x, int baselineY, int color) {
        graphics.fill(x, baselineY, x + 2, baselineY + 2, color);
        graphics.fill(x + 3, baselineY - 2, x + 5, baselineY + 2, color);
        graphics.fill(x + 6, baselineY - 4, x + 8, baselineY + 2, color);
        graphics.fill(x + 9, baselineY - 6, x + 11, baselineY + 2, color);
    }

    private void drawBattery(GuiGraphics graphics, int x, int y, int width, int height, int fillColor, int edgeColor) {
        graphics.fill(x, y, x + width, y + height, edgeColor);
        graphics.fill(x + 1, y + 1, x + width - 1, y + height - 1, 0xFF0A1120);
        graphics.fill(x + 2, y + 2, x + width - 3, y + height - 2, fillColor);
        graphics.fill(x + width, y + 2, x + width + 2, y + height - 2, edgeColor);
    }

    private void fillVerticalGradientRect(GuiGraphics graphics, int x, int y, int width, int height, int topColor, int bottomColor) {
        for (int row = 0; row < height; row++) {
            float amount = height <= 1 ? 0.0F : row / (float) (height - 1);
            int color = blend(topColor, bottomColor, amount);
            graphics.fill(x, y + row, x + width, y + row + 1, color);
        }
    }

    private static int withAlpha(int color, int alpha) {
        return ((alpha & 0xFF) << 24) | (color & 0x00FFFFFF);
    }

    private static float pulse(long animationTick, float offset) {
        double angle = (((animationTick % 2600L) / 2600.0D) + offset) * Math.PI * 2.0D;
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
