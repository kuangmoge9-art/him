/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraftforge.event.entity.living.LivingEvent$LivingTickEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  software.bernie.geckolib.animatable.GeoEntity
 */
package net.mcreator.ultimateskeletons.init;

import net.mcreator.ultimateskeletons.entity.AdamantiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.BedrockgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.BlazetitanEntity;
import net.mcreator.ultimateskeletons.entity.CavespidertitanEntity;
import net.mcreator.ultimateskeletons.entity.ChainEntity;
import net.mcreator.ultimateskeletons.entity.ChaoscolossusEntity;
import net.mcreator.ultimateskeletons.entity.CreepertitanEntity;
import net.mcreator.ultimateskeletons.entity.DeathlaserEntity;
import net.mcreator.ultimateskeletons.entity.DeathshockEntity;
import net.mcreator.ultimateskeletons.entity.DeathskullEntity;
import net.mcreator.ultimateskeletons.entity.DeathwitherbeamEntity;
import net.mcreator.ultimateskeletons.entity.DemontiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.ElectricbombEntity;
import net.mcreator.ultimateskeletons.entity.EndermantitanEntity;
import net.mcreator.ultimateskeletons.entity.EnergyskeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.GalaxyEntity;
import net.mcreator.ultimateskeletons.entity.GhasttitanEntity;
import net.mcreator.ultimateskeletons.entity.GiantskeletonEntity;
import net.mcreator.ultimateskeletons.entity.GiantwitherskeletonEntity;
import net.mcreator.ultimateskeletons.entity.HarcadiumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.IrongolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.MultiversespaceEntity;
import net.mcreator.ultimateskeletons.entity.OmegafishEntity;
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.mcreator.ultimateskeletons.entity.PushhandEntity;
import net.mcreator.ultimateskeletons.entity.SkeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.SolarskeletonEntity;
import net.mcreator.ultimateskeletons.entity.SpidertitanEntity;
import net.mcreator.ultimateskeletons.entity.StarSpiritEntity;
import net.mcreator.ultimateskeletons.entity.StarlightDeathEntity;
import net.mcreator.ultimateskeletons.entity.StarlightblackholeEntity;
import net.mcreator.ultimateskeletons.entity.StarlightfazhenEntity;
import net.mcreator.ultimateskeletons.entity.StarlightskeletonEntity;
import net.mcreator.ultimateskeletons.entity.StarskeletonEntity;
import net.mcreator.ultimateskeletons.entity.StarskeletonpowertitanEntity;
import net.mcreator.ultimateskeletons.entity.StarspawngalaxyEntity;
import net.mcreator.ultimateskeletons.entity.SunsEntity;
import net.mcreator.ultimateskeletons.entity.TitanusgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.mcreator.ultimateskeletons.entity.VoidgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.WardentitanEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontemplarEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontitanEntity;
import net.mcreator.ultimateskeletons.entity.WithireniumgolemtitanEntity;
import net.mcreator.ultimateskeletons.entity.ZombiepigmantitanEntity;
import net.mcreator.ultimateskeletons.entity.ZombietitanEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib.animatable.GeoEntity;

@Mod.EventBusSubscriber
public class EntityAnimationFactory {
    @SubscribeEvent
    public static void onEntityTick(LivingEvent.LivingTickEvent event) {
        if (event != null && event.getEntity() != null) {
            GeoEntity syncable;
            Object animation;
            LivingEntity livingEntity = event.getEntity();
            if (livingEntity instanceof UltimatedeathskullEntity && !((String)(animation = (syncable = (UltimatedeathskullEntity)livingEntity).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof DeathlaserEntity && !((String)(animation = (syncable = (DeathlaserEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof DeathshockEntity && !((String)(animation = (syncable = (DeathshockEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof PushhandEntity && !((String)(animation = (syncable = (PushhandEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof DeathwitherbeamEntity && !((String)(animation = (syncable = (DeathwitherbeamEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof ChainEntity && !((String)(animation = (syncable = (ChainEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof MultiversespaceEntity && !((String)(animation = (syncable = (MultiversespaceEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof DeathskullEntity && !((String)(animation = (syncable = (DeathskullEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof ElectricbombEntity && !((String)(animation = (syncable = (ElectricbombEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof SolarskeletonEntity && !((String)(animation = (syncable = (SolarskeletonEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof WitherskeletontemplarEntity && !((String)(animation = (syncable = (WitherskeletontemplarEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof StarskeletonEntity && !((String)(animation = (syncable = (StarskeletonEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof OriginallightningEntity && !((String)(animation = (syncable = (OriginallightningEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof GalaxyEntity && !((String)(animation = (syncable = (GalaxyEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof StarspawngalaxyEntity && !((String)(animation = (syncable = (StarspawngalaxyEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof SunsEntity && !((String)(animation = (syncable = (SunsEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof StarlightskeletonEntity && !((String)(animation = (syncable = (StarlightskeletonEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof StarlightblackholeEntity && !((String)(animation = (syncable = (StarlightblackholeEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof StarlightfazhenEntity && !((String)(animation = (syncable = (StarlightfazhenEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof StarSpiritEntity && !((String)(animation = (syncable = (StarSpiritEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof StarlightDeathEntity && !((String)(animation = (syncable = (StarlightDeathEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof WitherskeletontitanEntity && !((String)(animation = (syncable = (WitherskeletontitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof GiantwitherskeletonEntity && !((String)(animation = (syncable = (GiantwitherskeletonEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof EnergyskeletontitanEntity && !((String)(animation = (syncable = (EnergyskeletontitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof SkeletontitanEntity && !((String)(animation = (syncable = (SkeletontitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof GiantskeletonEntity && !((String)(animation = (syncable = (GiantskeletonEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof IrongolemtitanEntity && !((String)(animation = (syncable = (IrongolemtitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof EndermantitanEntity && !((String)(animation = (syncable = (EndermantitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof ChaoscolossusEntity && !((String)(animation = (syncable = (ChaoscolossusEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof CreepertitanEntity && !((String)(animation = (syncable = (CreepertitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof WardentitanEntity && !((String)(animation = (syncable = (WardentitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof SpidertitanEntity && !((String)(animation = (syncable = (SpidertitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof StarskeletonpowertitanEntity && !((String)(animation = (syncable = (StarskeletonpowertitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof GhasttitanEntity && !((String)(animation = (syncable = (GhasttitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof VoidgolemtitanEntity && !((String)(animation = (syncable = (VoidgolemtitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof BlazetitanEntity && !((String)(animation = (syncable = (BlazetitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof ZombietitanEntity && !((String)(animation = (syncable = (ZombietitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof ZombiepigmantitanEntity && !((String)(animation = (syncable = (ZombiepigmantitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof CavespidertitanEntity && !((String)(animation = (syncable = (CavespidertitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof OmegafishEntity && !((String)(animation = (syncable = (OmegafishEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof HarcadiumgolemtitanEntity && !((String)(animation = (syncable = (HarcadiumgolemtitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof BedrockgolemtitanEntity && !((String)(animation = (syncable = (BedrockgolemtitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof AdamantiumgolemtitanEntity && !((String)(animation = (syncable = (AdamantiumgolemtitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof DemontiumgolemtitanEntity && !((String)(animation = (syncable = (DemontiumgolemtitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof WithireniumgolemtitanEntity && !((String)(animation = (syncable = (WithireniumgolemtitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
            if ((animation = event.getEntity()) instanceof TitanusgolemtitanEntity && !((String)(animation = (syncable = (TitanusgolemtitanEntity)((Object)animation)).getSyncedAnimation())).equals("undefined")) {
                syncable.setAnimation("undefined");
                syncable.animationprocedure = animation;
            }
        }
    }
}

