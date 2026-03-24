/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.advancements.Advancement
 *  net.minecraft.advancements.AdvancementProgress
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraftforge.event.entity.EntityJoinLevelEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.ArrayList;
import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.entity.StarSpiritEntity;
import net.mcreator.ultimateskeletons.entity.StarlightDeathEntity;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class AchievespawnProcedure {
    @SubscribeEvent
    public static void onEntitySpawned(EntityJoinLevelEvent event) {
        AchievespawnProcedure.execute((Event)event, (LevelAccessor)event.getLevel(), event.getEntity());
    }

    public static void execute(LevelAccessor world, Entity entity) {
        AchievespawnProcedure.execute(null, world, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
        AdvancementProgress _ap;
        Advancement _adv;
        ServerPlayer _player;
        if (entity == null) {
            return;
        }
        if (entity instanceof StarSpiritEntity) {
            for (Entity entityiterator : new ArrayList(world.m_6907_())) {
                if (!(entityiterator instanceof ServerPlayer)) continue;
                _player = (ServerPlayer)entityiterator;
                _adv = _player.f_8924_.m_129889_().m_136041_(new ResourceLocation("ultimateskeletons:starach"));
                _ap = _player.m_8960_().m_135996_(_adv);
                if (_ap.m_8193_()) continue;
                for (String criteria : _ap.m_8219_()) {
                    _player.m_8960_().m_135988_(_adv, criteria);
                }
            }
        }
        if (entity instanceof StarlightDeathEntity) {
            for (Entity entityiterator : new ArrayList(world.m_6907_())) {
                if (!(entityiterator instanceof ServerPlayer)) continue;
                _player = (ServerPlayer)entityiterator;
                _adv = _player.f_8924_.m_129889_().m_136041_(new ResourceLocation("ultimateskeletons:starlightach"));
                _ap = _player.m_8960_().m_135996_(_adv);
                if (_ap.m_8193_()) continue;
                for (String criteria : _ap.m_8219_()) {
                    _player.m_8960_().m_135988_(_adv, criteria);
                }
            }
        }
    }
}

