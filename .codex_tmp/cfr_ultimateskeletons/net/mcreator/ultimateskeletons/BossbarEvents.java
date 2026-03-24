/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.GuiGraphics
 *  net.minecraft.client.gui.components.LerpingBossEvent
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.chat.MutableComponent
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.util.Mth
 *  net.minecraft.world.BossEvent
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.client.event.CustomizeGuiOverlayEvent$BossEventProgress
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 */
package net.mcreator.ultimateskeletons;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import net.mcreator.ultimateskeletons.Starrender;
import net.mcreator.ultimateskeletons.entity.AdamantiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.BedrockgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.BlazetitanEntity;
import net.mcreator.ultimateskeletons.entity.CavespidertitanEntity;
import net.mcreator.ultimateskeletons.entity.ChaoscolossusEntity;
import net.mcreator.ultimateskeletons.entity.CreepertitanEntity;
import net.mcreator.ultimateskeletons.entity.DemontiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.EndermantitanEntity;
import net.mcreator.ultimateskeletons.entity.EnergyskeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.GhasttitanEntity;
import net.mcreator.ultimateskeletons.entity.GiantskeletonEntity;
import net.mcreator.ultimateskeletons.entity.GiantwitherskeletonEntity;
import net.mcreator.ultimateskeletons.entity.HarcadiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.IrongolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.OmegafishEntity;
import net.mcreator.ultimateskeletons.entity.SkeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.SpidertitanEntity;
import net.mcreator.ultimateskeletons.entity.StarSpiritEntity;
import net.mcreator.ultimateskeletons.entity.StarlightDeathEntity;
import net.mcreator.ultimateskeletons.entity.StarskeletonpowertitanEntity;
import net.mcreator.ultimateskeletons.entity.TitanusgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.VoidgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.WardentitanEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.WithireniumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.ZombiepigmantitanEntity;
import net.mcreator.ultimateskeletons.entity.ZombietitanEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.LerpingBossEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.BossEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.CustomizeGuiOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.FORGE, value={Dist.CLIENT})
public class BossbarEvents {
    static Minecraft mc = Minecraft.m_91087_();
    public static int timer = 0;
    public static int cut = 0;

    public static int rgba(int red, int green, int blue, int alpha) {
        return (alpha %= 256) << 24 | (red %= 256) << 16 | (green %= 256) << 8 | (blue %= 256);
    }

    @SubscribeEvent
    public static void bossbar(CustomizeGuiOverlayEvent.BossEventProgress event) {
        LerpingBossEvent lerpingBossEvent = event.getBossEvent();
        String BossName = lerpingBossEvent.m_18861_().getString();
        UUID uuid = lerpingBossEvent.m_18860_();
        Entity player = Minecraft.m_91087_().m_91288_();
        Level world = player.m_9236_();
        double x = player.m_20185_();
        double y = player.m_20186_();
        double z = player.m_20189_();
        Vec3 center = new Vec3(x, y, z);
        if (player != null) {
            List<LivingEntity> entfound = world.m_6443_(LivingEntity.class, new AABB(center, center).m_82400_(256.0), e -> true).stream().sorted(Comparator.comparingDouble(entcnd -> entcnd.m_20238_(center))).toList();
            for (LivingEntity entityiterator : entfound) {
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof AdamantiumgolemtitanEntity) {
                    AdamantiumgolemtitanEntity adamantiumgolemtitan = (AdamantiumgolemtitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarADAMAN(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/adamantiumgolemtitanbar.png", adamantiumgolemtitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof ChaoscolossusEntity) {
                    ChaoscolossusEntity chaoscolossus = (ChaoscolossusEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarChaos(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/chaoscolossusbar.png", chaoscolossus);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof StarlightDeathEntity) {
                    StarlightDeathEntity starlightDeath = (StarlightDeathEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBar1(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/starlightdeathbar.png", starlightDeath);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof BedrockgolemtitanEntity) {
                    BedrockgolemtitanEntity bedrockgolemtitan = (BedrockgolemtitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarBedrock(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/bedrockgolemtitanbar.png", bedrockgolemtitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof VoidgolemtitanEntity) {
                    VoidgolemtitanEntity voidgolemtitan = (VoidgolemtitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarVoid(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/ultimavoidgolemtitanbar.png", voidgolemtitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof StarSpiritEntity) {
                    StarSpiritEntity starSpirit = (StarSpiritEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBar2(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/starspiritbar.png", starSpirit);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof TitanusgolemtitanEntity) {
                    TitanusgolemtitanEntity titanusgolemtitan = (TitanusgolemtitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarTitanus(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/titanusgolemtitanbar.png", titanusgolemtitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof WithireniumgolemtitanEntity) {
                    WithireniumgolemtitanEntity withireniumgolemtitan = (WithireniumgolemtitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarwith(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/withireniumgolemtitanbar.png", withireniumgolemtitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof HarcadiumgolemtitanEntity) {
                    HarcadiumgolemtitanEntity harcadiumgolemtitan = (HarcadiumgolemtitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarhar(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/harcadiumgolemtitanbar.png", harcadiumgolemtitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof DemontiumgolemtitanEntity) {
                    DemontiumgolemtitanEntity demontiumgolemtitan = (DemontiumgolemtitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBardemon(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/demontiumgolemtitanbar.png", demontiumgolemtitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof StarskeletonpowertitanEntity) {
                    StarskeletonpowertitanEntity starskeletonpowertitan = (StarskeletonpowertitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBar002(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/starpowerskeletonbar.png", starskeletonpowertitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof EnergyskeletontitanEntity) {
                    EnergyskeletontitanEntity energyskeletontitan = (EnergyskeletontitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBar00(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/energyskeletontitanbar.png", energyskeletontitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof EndermantitanEntity) {
                    EndermantitanEntity endermantitan = (EndermantitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBar001(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/endercolossusbar.png", endermantitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof IrongolemtitanEntity) {
                    IrongolemtitanEntity irongolemtitan = (IrongolemtitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBar000(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/ultimairongolemtitanbar.png", irongolemtitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof GhasttitanEntity) {
                    GhasttitanEntity ghasttitan = (GhasttitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBar003(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/ghasttitanbar.png", ghasttitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof WitherskeletontitanEntity) {
                    WitherskeletontitanEntity witherskeletontitan = (WitherskeletontitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBar0(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/wither_skeleton_titanbar.png", witherskeletontitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof WardentitanEntity) {
                    WardentitanEntity wardentitan = (WardentitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarW(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/wardentitanbar.png", wardentitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof BlazetitanEntity) {
                    BlazetitanEntity blazetitan = (BlazetitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarB(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/blazetitanbar.png", blazetitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof ZombiepigmantitanEntity) {
                    ZombiepigmantitanEntity zombiepigmantitan = (ZombiepigmantitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarP(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/zombiepigmantitanbar.png", zombiepigmantitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof CreepertitanEntity) {
                    CreepertitanEntity creepertitan = (CreepertitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarC(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/creepertitanbar.png", creepertitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof ZombietitanEntity) {
                    ZombietitanEntity zombietitan = (ZombietitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarZ(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/zombietitanbar.png", zombietitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof SkeletontitanEntity) {
                    SkeletontitanEntity skeletontitan = (SkeletontitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarS(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/skeleton_titanbar.png", skeletontitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(16 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof GiantwitherskeletonEntity) {
                    GiantwitherskeletonEntity giantwitherskeleton = (GiantwitherskeletonEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarbase1(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/basebar.png", giantwitherskeleton);
                    RenderSystem.disableBlend();
                    event.setIncrement(14 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof SpidertitanEntity) {
                    SpidertitanEntity spidertitan = (SpidertitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarSpider(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/spidertitanbar.png", spidertitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(14 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof CavespidertitanEntity) {
                    CavespidertitanEntity cavespidertitan = (CavespidertitanEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarCavespider(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/cavespidertitanbar.png", cavespidertitan);
                    RenderSystem.disableBlend();
                    event.setIncrement(14 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (uuid.equals(entityiterator.m_20148_()) && entityiterator instanceof OmegafishEntity) {
                    OmegafishEntity omegafish = (OmegafishEntity)entityiterator;
                    event.setCanceled(true);
                    RenderSystem.enableBlend();
                    BossbarEvents.drawBarFish(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/omegafishbar.png", omegafish);
                    RenderSystem.disableBlend();
                    event.setIncrement(14 + Minecraft.m_91087_().f_91062_.f_92710_);
                }
                if (!uuid.equals(entityiterator.m_20148_()) || !(entityiterator instanceof GiantskeletonEntity)) continue;
                GiantskeletonEntity giantskeleton = (GiantskeletonEntity)entityiterator;
                event.setCanceled(true);
                RenderSystem.enableBlend();
                BossbarEvents.drawBarbase2(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/basebar.png", giantskeleton);
                RenderSystem.disableBlend();
                event.setIncrement(14 + Minecraft.m_91087_().f_91062_.f_92710_);
            }
        }
        if (event.getBossEvent().m_18861_().getString().equals(Component.m_237115_((String)"entity.ultimateskeletons.starskeleton").getString())) {
            event.setCanceled(true);
            RenderSystem.enableBlend();
            BossbarEvents.drawBar(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/base.png");
            RenderSystem.disableBlend();
            event.setIncrement(14 + Minecraft.m_91087_().f_91062_.f_92710_);
        }
        if (event.getBossEvent().m_18861_().getString().equals(Component.m_237115_((String)"entity.ultimateskeletons.starlightskeleton").getString())) {
            event.setCanceled(true);
            RenderSystem.enableBlend();
            BossbarEvents.drawBar(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/starlightskeletonbar.png");
            RenderSystem.disableBlend();
            event.setIncrement(14 + Minecraft.m_91087_().f_91062_.f_92710_);
        }
        if (event.getBossEvent().m_18861_().getString().equals(Component.m_237115_((String)"entity.ultimateskeletons.witherskeletontemplar").getString())) {
            event.setCanceled(true);
            RenderSystem.enableBlend();
            BossbarEvents.drawBar(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/witherskeletontemplarbar.png");
            RenderSystem.disableBlend();
            event.setIncrement(14 + Minecraft.m_91087_().f_91062_.f_92710_);
        }
        if (event.getBossEvent().m_18861_().getString().equals(Component.m_237115_((String)"entity.ultimateskeletons.solarskeleton").getString())) {
            event.setCanceled(true);
            RenderSystem.enableBlend();
            BossbarEvents.drawBar(event.getX(), event.getY(), (BossEvent)event.getBossEvent(), event.getBossEvent().m_18861_(), "ultimateskeletons:textures/screens/guawangsolar.png");
            RenderSystem.disableBlend();
            event.setIncrement(14 + Minecraft.m_91087_().f_91062_.f_92710_);
        }
    }

    public static void drawBar(int pX, int pY, BossEvent event, Component component, String url) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 210.0f;
        float width2 = 254.0f;
        int i = (int)(event.m_142717_() * width);
        float yOffset = 7.0f;
        float healthYOffset = 46.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 14, (y += 2 + (int)yOffset) - 27, 25.0f, healthYOffset, i, 96, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 38, y, 1.0f, yOffset, (int)width2, 45, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX, y + 32, -1);
    }

    public static void drawBarbase1(int pX, int pY, BossEvent event, Component component, String url, GiantwitherskeletonEntity giantwitherskeleton) {
        float e;
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)giantwitherskeleton.get_health() + "/" + (int)giantwitherskeleton.getMax_Health()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 208.0f;
        float width2 = 208.0f;
        int i = (int)((double)(width * giantwitherskeleton.m_21223_()) / giantwitherskeleton.getMax_Health());
        float targetWidth = (float)((double)(width * giantwitherskeleton.m_21223_()) / giantwitherskeleton.getMax_Health());
        giantwitherskeleton.intermediateHealth = e = Mth.m_14179_((float)0.01f, (float)giantwitherskeleton.intermediateHealth, (float)targetWidth);
        float yOffset = 0.0f;
        float healthYOffset = 34.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 12, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 20, 256, 256);
            guiGraphics.m_280163_(new ResourceLocation(url), pX + 12, y + 19, 0.0f, yOffset + 52.0f, (int)width2, 4, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 10, y + 13, 0.0f, healthYOffset + 10.0f, (int)e, 7, 256, 256);
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 10, y + 13, 0.0f, healthYOffset + 33.0f, i, 7, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 20, -1);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 12, -1);
    }

    public static void drawBarbase2(int pX, int pY, BossEvent event, Component component, String url, GiantskeletonEntity giantskeleton) {
        float e;
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)giantskeleton.get_health() + "/" + (int)giantskeleton.getMax_Health()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 208.0f;
        float width2 = 208.0f;
        int i = (int)((double)(width * giantskeleton.m_21223_()) / giantskeleton.getMax_Health());
        float targetWidth = (float)((double)(width * giantskeleton.m_21223_()) / giantskeleton.getMax_Health());
        giantskeleton.intermediateHealth = e = Mth.m_14179_((float)0.01f, (float)giantskeleton.intermediateHealth, (float)targetWidth);
        float yOffset = 0.0f;
        float healthYOffset = 34.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 12, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 20, 256, 256);
            guiGraphics.m_280163_(new ResourceLocation(url), pX + 12, y + 19, 0.0f, yOffset + 52.0f, (int)width2, 4, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 10, y + 13, 0.0f, healthYOffset + 10.0f, (int)e, 7, 256, 256);
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 10, y + 13, 0.0f, healthYOffset, i, 7, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 20, -1);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 12, -1);
    }

    public static void drawBarFish(int pX, int pY, BossEvent event, Component component, String url, OmegafishEntity omegafish) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 183.0f;
        float width2 = 183.0f;
        int i = (int)((double)(width * omegafish.m_21223_()) / omegafish.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 56.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 38, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX, y + 18, 0.0f, healthYOffset, i, 7, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 27, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)omegafish.get_health() + "/" + (int)omegafish.getMax_Health(), posX + 2, y + 17, -1);
    }

    public static void drawBarCavespider(int pX, int pY, BossEvent event, Component component, String url, CavespidertitanEntity cavespidertitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 183.0f;
        float width2 = 183.0f;
        int i = (int)((double)(width * cavespidertitan.m_21223_()) / cavespidertitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 45.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 36, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX, y + 16, 0.0f, healthYOffset, i, 7, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)cavespidertitan.get_health() + "/" + (int)cavespidertitan.getMax_Health(), posX + 2, y + 16, -1);
    }

    public static void drawBarSpider(int pX, int pY, BossEvent event, Component component, String url, SpidertitanEntity spidertitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 183.0f;
        float width2 = 183.0f;
        int i = (int)((double)(width * spidertitan.m_21223_()) / spidertitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 45.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 36, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX, y + 16, 0.0f, healthYOffset, i, 7, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)spidertitan.get_health() + "/" + (int)spidertitan.getMax_Health(), posX + 2, y + 16, -1);
    }

    public static void drawBarZ(int pX, int pY, BossEvent event, Component component, String url, ZombietitanEntity zombietitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 185.0f;
        float width2 = 185.0f;
        int i = (int)((double)(width * zombietitan.m_21223_()) / zombietitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 41.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 34, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX, y + 15, 0.0f, healthYOffset, i, 7, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 24, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)zombietitan.get_health() + "/" + (int)zombietitan.getMax_Health(), posX + 2, y + 14, -1);
    }

    public static void drawBarS(int pX, int pY, BossEvent event, Component component, String url, SkeletontitanEntity skeletontitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)skeletontitan.get_health() + "/" + (int)skeletontitan.getMax_Health()));
        MutableComponent coloredComponent2 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + "God_skeleton_titan"));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 185.0f;
        float width2 = 185.0f;
        int i = (int)((double)(width * skeletontitan.m_21223_()) / skeletontitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 44.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 1, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 36, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 1, y + 16, 0.0f, healthYOffset, i, 51, 256, 256);
        if (skeletontitan.getkillCount() > 5000) {
            guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent2, posX + 2, y + 26, -1);
            guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 16, -1);
        } else {
            guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
            guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)skeletontitan.get_health() + "/" + (int)skeletontitan.getMax_Health(), posX + 2, y + 16, -1);
        }
    }

    public static void drawBarP(int pX, int pY, BossEvent event, Component component, String url, ZombiepigmantitanEntity zombiepigmantitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 185.0f;
        float width2 = 185.0f;
        int i = (int)((double)(width * zombiepigmantitan.m_21223_()) / zombiepigmantitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 43.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 31, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX, y + 12, 0.0f, healthYOffset, i, 7, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 21, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)zombiepigmantitan.get_health() + "/" + (int)zombiepigmantitan.getMax_Health(), posX + 2, y + 11, -1);
    }

    public static void drawBarC(int pX, int pY, BossEvent event, Component component, String url, CreepertitanEntity creepertitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)creepertitan.get_health() + "/" + (int)creepertitan.getMax_Health()));
        MutableComponent coloredComponent2 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + "Charged_creeper_titan"));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int uvX = 0;
        int posX = w / 2;
        float width = 185.0f;
        float width2 = 185.0f;
        int i = (int)((double)(width * creepertitan.m_21223_()) / creepertitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 45.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (!creepertitan.charged) {
            if (i > 0) {
                guiGraphics.m_280163_(new ResourceLocation(url), pX - 1, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 36, 256, 256);
            }
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 1, y + 17, 0.0f, healthYOffset, i, 7, 256, 256);
        } else {
            if (i > 0) {
                guiGraphics.m_280163_(new ResourceLocation(url), pX - 1, y += 1 + (int)yOffset, 0.0f, 56.0f, (int)width2, 36, 256, 256);
            }
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 1, y + 17, 0.0f, 101.0f, i, 7, 256, 256);
        }
        if (creepertitan.charged) {
            ++uvX;
            guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent2, posX + 2, y + 26, -1);
            guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 16, -1);
        } else {
            guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
            guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)creepertitan.get_health() + "/" + (int)creepertitan.getMax_Health(), posX + 2, y + 16, -1);
        }
    }

    public static void drawBarB(int pX, int pY, BossEvent event, Component component, String url, BlazetitanEntity blazetitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 185.0f;
        float width2 = 185.0f;
        int i = (int)((double)(width * blazetitan.m_21223_()) / blazetitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 50.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 1, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 35, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 1, y + 15, 0.0f, healthYOffset, i, 7, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 25, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)blazetitan.get_health() + "/" + (int)blazetitan.getMax_Health(), posX + 2, y + 15, -1);
    }

    public static void drawBarW(int pX, int pY, BossEvent event, Component component, String url, WardentitanEntity wardentitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 256.0f;
        float width2 = 256.0f;
        int i = (int)((double)(width * wardentitan.m_21223_()) / wardentitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 46.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 36, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y + 10, 0.0f, healthYOffset, i, 60, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)wardentitan.get_health() + "/" + (int)wardentitan.getMax_Health(), posX + 2, y + 16, -1);
    }

    public static void drawBar0(int pX, int pY, BossEvent event, Component component, String url, WitherskeletontitanEntity witherskeletontitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)witherskeletontitan.get_health() + "/" + (int)witherskeletontitan.getMax_Health()));
        MutableComponent coloredComponent2 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + "God_wither_skeleton_titan"));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 196.0f;
        float width2 = 196.0f;
        int i = (int)((double)(width * witherskeletontitan.m_21223_()) / witherskeletontitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 44.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 36, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y + 16, 0.0f, healthYOffset, i, 51, 256, 256);
        if (witherskeletontitan.getkillCount() > 10000) {
            guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent2, posX + 2, y + 26, -1);
            guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 16, -1);
        } else {
            guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
            guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)witherskeletontitan.get_health() + "/" + (int)witherskeletontitan.getMax_Health(), posX + 2, y + 16, -1);
        }
    }

    public static void drawBar00(int pX, int pY, BossEvent event, Component component, String url, EnergyskeletontitanEntity energyskeletontitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 196.0f;
        float width2 = 196.0f;
        int i = (int)((double)(width * energyskeletontitan.m_21223_()) / energyskeletontitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 46.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 36, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y + 16, 0.0f, healthYOffset, i, 53, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)energyskeletontitan.get_health() + "/" + (int)energyskeletontitan.getMax_Health(), posX + 2, y + 16, -1);
    }

    public static void drawBar000(int pX, int pY, BossEvent event, Component component, String url, IrongolemtitanEntity irongolemtitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 196.0f;
        float width2 = 196.0f;
        int i = (int)((double)(width * irongolemtitan.m_21223_()) / irongolemtitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 45.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 38, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y + 15, 0.0f, healthYOffset, i, 15, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 28, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)irongolemtitan.get_health() + "/" + (int)irongolemtitan.getMax_Health(), posX + 2, y + 18, -1);
    }

    public static void drawBar001(int pX, int pY, BossEvent event, Component component, String url, EndermantitanEntity endermantitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 196.0f;
        float width2 = 196.0f;
        int i = (int)((double)(width * endermantitan.m_21223_()) / endermantitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 40.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 38, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y + 8, 0.0f, healthYOffset, i, 59, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)endermantitan.get_health() + "/" + (int)endermantitan.getMax_Health(), posX + 2, y + 16, -1);
    }

    public static void drawBar002(int pX, int pY, BossEvent event, Component component, String url, StarskeletonpowertitanEntity starskeletonpowertitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 196.0f;
        float width2 = 196.0f;
        int i = (int)((double)(width * starskeletonpowertitan.m_21223_()) / starskeletonpowertitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 46.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 36, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y + 16, 0.0f, healthYOffset, i, 53, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)starskeletonpowertitan.get_health() + "/" + (int)starskeletonpowertitan.getMax_Health(), posX + 2, y + 16, -1);
    }

    public static void drawBar003(int pX, int pY, BossEvent event, Component component, String url, GhasttitanEntity ghasttitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 196.0f;
        float width2 = 196.0f;
        int i = (int)((double)(width * ghasttitan.m_21223_()) / ghasttitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 49.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 37, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y + 13, 0.0f, healthYOffset, i, 15, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)ghasttitan.get_health() + "/" + (int)ghasttitan.getMax_Health(), posX + 2, y + 16, -1);
    }

    public static void drawBardemon(int pX, int pY, BossEvent event, Component component, String url, DemontiumgolemtitanEntity demontiumgolemtitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 196.0f;
        float width2 = 196.0f;
        int i = (int)((double)(width * demontiumgolemtitan.m_21223_()) / demontiumgolemtitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 45.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 38, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y + 15, 0.0f, healthYOffset, i, 15, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 28, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)demontiumgolemtitan.get_health() + "/" + (int)demontiumgolemtitan.getMax_Health(), posX + 2, y + 18, -1);
    }

    public static void drawBarhar(int pX, int pY, BossEvent event, Component component, String url, HarcadiumgolemtitanEntity harcadiumgolemtitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 196.0f;
        float width2 = 196.0f;
        int i = (int)((double)(width * harcadiumgolemtitan.m_21223_()) / harcadiumgolemtitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 45.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 38, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y + 15, 0.0f, healthYOffset, i, 15, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 28, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)harcadiumgolemtitan.get_health() + "/" + (int)harcadiumgolemtitan.getMax_Health(), posX + 2, y + 18, -1);
    }

    public static void drawBarwith(int pX, int pY, BossEvent event, Component component, String url, WithireniumgolemtitanEntity withireniumgolemtitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 196.0f;
        float width2 = 196.0f;
        int i = (int)((double)(width * withireniumgolemtitan.m_21223_()) / withireniumgolemtitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 45.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 38, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 6, y + 15, 0.0f, healthYOffset, i, 15, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 28, -1);
        guiGraphics.m_280137_(Minecraft.m_91087_().f_91062_, (int)withireniumgolemtitan.get_health() + "/" + (int)withireniumgolemtitan.getMax_Health(), posX + 2, y + 18, -1);
    }

    public static void drawBarTitanus(int pX, int pY, BossEvent event, Component component, String url, TitanusgolemtitanEntity titanusgolemtitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)titanusgolemtitan.get_health() + "/" + (int)titanusgolemtitan.getMax_Health()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 256.0f;
        float width2 = 256.0f;
        int i = (int)((double)(width * titanusgolemtitan.m_21223_()) / titanusgolemtitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 45.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 38, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y + 15, 0.0f, healthYOffset, i, 16, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 28, -1);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 18, -1);
    }

    public static void drawBarVoid(int pX, int pY, BossEvent event, Component component, String url, VoidgolemtitanEntity voidgolemtitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)voidgolemtitan.get_health() + "/" + (int)voidgolemtitan.getMax_Health()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 256.0f;
        float width2 = 256.0f;
        int i = (int)((double)(width * voidgolemtitan.m_21223_()) / voidgolemtitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 45.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 38, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y + 15, 0.0f, healthYOffset, i, 16, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 28, -1);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 18, -1);
    }

    public static void drawBarBedrock(int pX, int pY, BossEvent event, Component component, String url, BedrockgolemtitanEntity bedrockgolemtitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)bedrockgolemtitan.get_health() + "/" + (int)bedrockgolemtitan.getMax_Health()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 256.0f;
        float width2 = 256.0f;
        int i = (int)((double)(width * bedrockgolemtitan.m_21223_()) / bedrockgolemtitan.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 45.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 38, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y + 15, 0.0f, healthYOffset, i, 16, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 28, -1);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 18, -1);
    }

    public static void drawBarChaos(int pX, int pY, BossEvent event, Component component, String url, ChaoscolossusEntity chaoscolossus) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)chaoscolossus.get_health() + "/" + (int)chaoscolossus.getMax_Health()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 256.0f;
        float width2 = 256.0f;
        int i = (int)((double)(width * chaoscolossus.m_21223_()) / chaoscolossus.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 40.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 38, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y + 8, 0.0f, healthYOffset, i, 59, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 16, -1);
    }

    public static void drawBar1(int pX, int pY, BossEvent event, Component component, String url, StarlightDeathEntity starlightDeath) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)starlightDeath.get_health() + "/" + (int)starlightDeath.getMax_Health()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 256.0f;
        float width2 = 256.0f;
        int i = (int)((double)(width * starlightDeath.m_21223_()) / starlightDeath.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 44.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 36, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y + 16, 0.0f, healthYOffset, i, 51, 256, 256);
        guiGraphics.m_285944_(Starrender.glowRenderType, pX - 33, y + 17, pX + 217, y + 24, BossbarEvents.rgba(240, 240, 240, 255));
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 16, -1);
    }

    public static void drawBarADAMAN(int pX, int pY, BossEvent event, Component component, String url, AdamantiumgolemtitanEntity adamantiumgolemtitan) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)adamantiumgolemtitan.get_health() + "/" + (int)adamantiumgolemtitan.getMax_Health()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 256.0f;
        float width2 = 256.0f;
        int i = (int)((double)(width * adamantiumgolemtitan.m_21223_()) / adamantiumgolemtitan.getMax_Health());
        if (++timer >= i) {
            timer = 0;
        }
        if (timer >= 40) {
            cut = timer - 40;
        }
        if (timer < 40) {
            cut = i - 39 + timer;
        }
        float yOffset = 0.0f;
        float healthYOffset = 46.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 40, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y + 6, 0.0f, healthYOffset, i, 40, 256, 256);
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y + 6, 0.0f, healthYOffset + 40.0f, timer, 60, 256, 256);
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y + 6, 0.0f, healthYOffset, cut, 40, 256, 256);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 30, -1);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 20, -1);
    }

    public static void drawBar2(int pX, int pY, BossEvent event, Component component, String url, StarSpiritEntity starSpirit) {
        String[] colorCodes = new String[]{"\u00a7a", "\u00a7b", "\u00a7c", "\u00a7d", "\u00a7e", "\u00a7f"};
        Random random = new Random();
        MutableComponent coloredComponent = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + component.getString()));
        MutableComponent coloredComponent1 = Component.m_237113_((String)(colorCodes[random.nextInt(colorCodes.length)] + (int)starSpirit.get_health() + "/" + (int)starSpirit.getMax_Health()));
        int w = Minecraft.m_91087_().m_91268_().m_85445_();
        int posX = w / 2;
        float width = 256.0f;
        float width2 = 256.0f;
        int i = (int)((double)(width * starSpirit.m_21223_()) / starSpirit.getMax_Health());
        float yOffset = 0.0f;
        float healthYOffset = 51.0f;
        int y = pY - 14;
        GuiGraphics guiGraphics = new GuiGraphics(Minecraft.m_91087_(), Minecraft.m_91087_().m_91269_().m_110104_());
        if (i > 0) {
            guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y += 1 + (int)yOffset, 0.0f, yOffset, (int)width2, 36, 256, 256);
        }
        guiGraphics.m_280163_(new ResourceLocation(url), pX - 36, y + 16, 0.0f, healthYOffset, i, 58, 256, 256);
        guiGraphics.m_285944_(Starrender.glowRenderType, pX - 33, y + 17, pX + 217, y + 24, BossbarEvents.rgba(240, 240, 240, 255));
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent, posX + 2, y + 26, -1);
        guiGraphics.m_280653_(Minecraft.m_91087_().f_91062_, (Component)coloredComponent1, posX + 2, y + 16, -1);
    }
}

