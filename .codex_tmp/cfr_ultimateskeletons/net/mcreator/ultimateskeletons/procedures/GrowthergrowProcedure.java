/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.commands.CommandSource
 *  net.minecraft.commands.CommandSourceStack
 *  net.minecraft.core.BlockPos
 *  net.minecraft.network.chat.Component
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.MobSpawnType
 *  net.minecraft.world.entity.animal.IronGolem
 *  net.minecraft.world.entity.monster.Blaze
 *  net.minecraft.world.entity.monster.CaveSpider
 *  net.minecraft.world.entity.monster.Creeper
 *  net.minecraft.world.entity.monster.EnderMan
 *  net.minecraft.world.entity.monster.Ghast
 *  net.minecraft.world.entity.monster.Skeleton
 *  net.minecraft.world.entity.monster.Spider
 *  net.minecraft.world.entity.monster.WitherSkeleton
 *  net.minecraft.world.entity.monster.Zombie
 *  net.minecraft.world.entity.monster.warden.Warden
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.Vec2
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.ultimateskeletons.procedures;

import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.entity.GiantskeletonEntity;
import net.mcreator.ultimateskeletons.entity.GiantwitherskeletonEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;

public class GrowthergrowProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        Titangodentity _datEntSetI;
        Entity entityToSpawn;
        ServerLevel _level;
        if (entity == null) {
            return;
        }
        if (entity instanceof WitherSkeleton) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                entityToSpawn = ((EntityType)UltimateskeletonsModEntities.GIANTWITHERSKELETON.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y + 0.1), (double)z), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn != null) {
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
            }
        }
        if (entity instanceof Skeleton) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                entityToSpawn = ((EntityType)UltimateskeletonsModEntities.GIANTSKELETON.get()).m_262496_(_level, BlockPos.m_274561_((double)x, (double)(y + 0.1), (double)z), MobSpawnType.MOB_SUMMONED);
                if (entityToSpawn != null) {
                    entityToSpawn.m_146922_(world.m_213780_().m_188501_() * 360.0f);
                }
            }
        }
        if (entity instanceof IronGolem) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:irongolemtitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
        }
        if (entity instanceof Creeper) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:creepertitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
        }
        if (entity instanceof Spider) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:spidertitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
        }
        if (entity instanceof CaveSpider) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:cavespidertitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
        }
        if (entity instanceof Zombie) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:zombietitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
        }
        if (entity instanceof Blaze) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:blazetitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
        }
        if (entity instanceof Warden) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:wardentitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
        }
        if (entity instanceof Ghast) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:ghasttitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
        }
        if (entity instanceof EnderMan) {
            if (!entity.m_9236_().m_5776_()) {
                entity.m_146870_();
            }
            if (world instanceof ServerLevel) {
                _level = (ServerLevel)world;
                _level.m_7654_().m_129892_().m_230957_(new CommandSourceStack(CommandSource.f_80164_, new Vec3(x, y, z), Vec2.f_82462_, _level, 4, "", (Component)Component.m_237113_((String)""), _level.m_7654_(), null).m_81324_(), "summon ultimateskeletons:endermantitan ~ ~1 ~ {CustomName:'\"growing\"'}");
            }
        }
        if (entity instanceof GiantwitherskeletonEntity) {
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntSetI = (GiantwitherskeletonEntity)entity;
                _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_growLevel, (Object)4);
            }
            if (entity instanceof GiantwitherskeletonEntity) {
                _datEntSetI = (GiantwitherskeletonEntity)entity;
                _datEntSetI.m_20088_().m_135381_(GiantwitherskeletonEntity.DATA_killCount, (Object)200);
            }
        }
        if (entity instanceof GiantskeletonEntity) {
            if (entity instanceof GiantskeletonEntity) {
                _datEntSetI = (GiantskeletonEntity)entity;
                _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_growLevel, (Object)4);
            }
            if (entity instanceof GiantskeletonEntity) {
                _datEntSetI = (GiantskeletonEntity)entity;
                _datEntSetI.m_20088_().m_135381_(GiantskeletonEntity.DATA_killCount, (Object)200);
            }
        }
    }
}

