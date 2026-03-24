/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraftforge.event.entity.EntityJoinLevelEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.entity.AdamanshockEntity;
import net.mcreator.ultimateskeletons.entity.AdminiumshockEntity;
import net.mcreator.ultimateskeletons.entity.BallEntity;
import net.mcreator.ultimateskeletons.entity.GiantskeletonEntity;
import net.mcreator.ultimateskeletons.entity.GiantwitherskeletonEntity;
import net.mcreator.ultimateskeletons.entity.OriginallightningEntity;
import net.mcreator.ultimateskeletons.entity.StarshockEntity;
import net.mcreator.ultimateskeletons.entity.YitaiballEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
public class SpawnProcedure {
    @SubscribeEvent
    public static void onEntitySpawned(EntityJoinLevelEvent event) {
        SpawnProcedure.execute((Event)event, (LevelAccessor)event.getLevel(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        SpawnProcedure.execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (!(!(entity instanceof Titangodentity) || entity instanceof OriginallightningEntity || entity instanceof StarshockEntity || entity instanceof AdamanshockEntity || entity instanceof AdminiumshockEntity || entity instanceof YitaiballEntity || entity instanceof BallEntity || !(world instanceof Level))) {
            Level _level = (Level)world;
            if (!_level.m_5776_()) {
                _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titancreation")), SoundSource.NEUTRAL, 20.0f, 1.0f);
            } else {
                _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:titancreation")), SoundSource.NEUTRAL, 20.0f, 1.0f, false);
            }
        }
        if (entity instanceof GiantwitherskeletonEntity) {
            ((GiantwitherskeletonEntity)entity).set_health(200000.0);
        }
        if (entity instanceof GiantskeletonEntity) {
            ((GiantskeletonEntity)entity).set_health(20000.0);
        }
    }
}

