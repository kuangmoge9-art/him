/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.Holder
 *  net.minecraft.core.Vec3i
 *  net.minecraft.core.particles.ParticleOptions
 *  net.minecraft.core.particles.SimpleParticleType
 *  net.minecraft.core.registries.Registries
 *  net.minecraft.resources.ResourceKey
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.Mth
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.damagesource.DamageSource
 *  net.minecraft.world.damagesource.DamageTypes
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LightningBolt
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.monster.Creeper
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.event.entity.EntityJoinLevelEvent
 *  net.minecraftforge.eventbus.api.Event
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.procedures;

import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.entity.StarskeletonEntity;
import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.Vec3i;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber
public class Creeperrrrrr2Procedure {
    @SubscribeEvent
    public static void onEntitySpawned(EntityJoinLevelEvent event) {
        Creeperrrrrr2Procedure.execute((Event)event, (LevelAccessor)event.getLevel(), event.getEntity().m_20185_(), event.getEntity().m_20186_(), event.getEntity().m_20189_(), event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        Creeperrrrrr2Procedure.execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (ForgeRegistries.ENTITY_TYPES.getKey((Object)entity.m_6095_()).toString().equals("creeperrrrrr:creeper_1")) {
            if (world instanceof Level) {
                Level _level = (Level)world;
                if (!_level.m_5776_()) {
                    _level.m_5594_(null, BlockPos.m_274561_((double)x, (double)y, (double)z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 40.0f, 1.0f);
                } else {
                    _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:spawn")), SoundSource.NEUTRAL, 40.0f, 1.0f, false);
                }
            }
            for (int index0 = 0; index0 < 12; ++index0) {
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE_1.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE_2.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MUTIVERSE.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
                world.m_7106_((ParticleOptions)((SimpleParticleType)UltimateskeletonsModParticleTypes.MULTIVERSE_3.get()), x + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), y + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-4, (int)4), z + (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-8, (int)8), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3), (double)Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)-3, (int)3));
            }
            Vec3 _center = new Vec3(x, y, z);
            List<Entity> _entfound = world.m_6443_(Entity.class, new AABB(_center, _center).m_82400_(50.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            for (Entity entityiterator : _entfound) {
                float f;
                if (Mth.m_216271_((RandomSource)RandomSource.m_216327_(), (int)1, (int)2) == 1) {
                    if (entityiterator instanceof Creeper || entityiterator instanceof Player) continue;
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage")))), 1280.0f);
                    entityiterator.m_6469_(new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(DamageTypes.f_268724_)), 1280.0f);
                    continue;
                }
                if (entityiterator instanceof UltimatedeathskullEntity || entityiterator instanceof Creeper || entityiterator instanceof Player) continue;
                DamageSource damageSource = new DamageSource((Holder)world.m_9598_().m_175515_(Registries.f_268580_).m_246971_(ResourceKey.m_135785_((ResourceKey)Registries.f_268580_, (ResourceLocation)new ResourceLocation("ultimateskeletons:diaodamage"))));
                if (entityiterator instanceof LivingEntity) {
                    LivingEntity _livEnt = (LivingEntity)entityiterator;
                    f = _livEnt.m_21223_();
                } else {
                    f = -1.0f;
                }
                entityiterator.m_6469_(damageSource, f);
                if (entityiterator instanceof LivingEntity) {
                    LivingEntity _entity = (LivingEntity)entityiterator;
                    _entity.m_21153_(0.0f);
                }
                if (entityiterator.m_9236_().m_5776_()) continue;
                entityiterator.m_146870_();
            }
        }
        if (entity instanceof StarskeletonEntity && world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel)world;
            LightningBolt entityToSpawn = (LightningBolt)EntityType.f_20465_.m_20615_((Level)_level);
            entityToSpawn.m_20219_(Vec3.m_82539_((Vec3i)BlockPos.m_274561_((double)x, (double)y, (double)z)));
            _level.m_7967_((Entity)entityToSpawn);
        }
    }
}

