/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Sets
 *  com.mojang.brigadier.ParseResults
 *  javax.annotation.Nullable
 *  net.minecraft.advancements.CriteriaTriggers
 *  net.minecraft.commands.CommandSourceStack
 *  net.minecraft.commands.Commands
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.BlockPos$MutableBlockPos
 *  net.minecraft.core.Direction
 *  net.minecraft.core.Vec3i
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.sounds.SoundEvents
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.Difficulty
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LightningBolt
 *  net.minecraft.world.level.BlockGetter
 *  net.minecraft.world.level.GameRules
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelReader
 *  net.minecraft.world.level.block.BaseFireBlock
 *  net.minecraft.world.level.block.Blocks
 *  net.minecraft.world.level.block.LightningRodBlock
 *  net.minecraft.world.level.block.WeatheringCopper
 *  net.minecraft.world.level.block.state.BlockState
 *  net.minecraft.world.level.block.state.properties.Property
 *  net.minecraft.world.level.gameevent.GameEvent
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.event.ForgeEventFactory
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  org.jetbrains.annotations.NotNull
 */
package net.mcreator.ultimateskeletons.entity;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Sets;
import com.mojang.brigadier.ParseResults;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LightningRodBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.network.PlayMessages;
import org.jetbrains.annotations.NotNull;

public class RainbowlightningEntity
extends LightningBolt {
    private static final int START_LIFE = 2;
    private static final double DAMAGE_RADIUS = 3.0;
    private static final double DETECTION_RADIUS = 15.0;
    private int life;
    public long seed;
    private int flashes;
    private boolean visualOnly;
    @Nullable
    private ServerPlayer cause;
    private final Set<Entity> hitEntities = Sets.newHashSet();
    private int blocksSetOnFire;
    private float damage = 1024.0f;

    public RainbowlightningEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType<RainbowlightningEntity>)((EntityType)UltimateskeletonsModEntities.RAINBOWLIGHTNING.get()), world);
    }

    public static void init() {
    }

    public static ImmutableMultimap.Builder<Object, Object> createAttributes() {
        return null;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public float getDamage() {
        return this.damage;
    }

    public void m_8119_() {
        List list1;
        super.m_8119_();
        if (this.life == 2) {
            if (this.m_9236_().m_5776_()) {
                this.m_9236_().m_7785_(this.m_20185_(), this.m_20186_(), this.m_20189_(), SoundEvents.f_12090_, SoundSource.WEATHER, 10000.0f, 0.8f + this.f_19796_.m_188501_() * 0.2f, false);
                this.m_9236_().m_7785_(this.m_20185_(), this.m_20186_(), this.m_20189_(), SoundEvents.f_12089_, SoundSource.WEATHER, 2.0f, 0.5f + this.f_19796_.m_188501_() * 0.2f, false);
            } else {
                Difficulty difficulty = this.m_9236_().m_46791_();
                if (difficulty == Difficulty.NORMAL || difficulty == Difficulty.HARD) {
                    this.m_20870_(4);
                }
                this.m_147161_();
                RainbowlightningEntity.m_147150_(this.m_9236_(), this.m_147162_());
                this.m_146850_(GameEvent.f_157772_);
                if (this.m_9236_() instanceof ServerLevel) {
                    ServerLevel serverLevel = (ServerLevel)this.m_9236_();
                    CommandSourceStack source = serverLevel.m_7654_().m_129893_();
                    Commands commands = serverLevel.m_7654_().m_129892_();
                    ParseResults parseResults1 = commands.m_82094_().parse("gamerule sendCommandFeedback false", (Object)source);
                    commands.m_242674_(parseResults1, "gamerule sendCommandFeedback false");
                    ParseResults parseResults2 = commands.m_82094_().parse("time set midnight", (Object)source);
                    commands.m_242674_(parseResults2, "time set midnight");
                    ParseResults parseResults3 = commands.m_82094_().parse("weather thunder", (Object)source);
                    commands.m_242674_(parseResults3, "weather thunder");
                }
            }
        }
        --this.life;
        if (this.life < 0) {
            if (this.flashes == 0) {
                if (this.m_9236_() instanceof ServerLevel) {
                    list1 = this.m_9236_().m_6249_((Entity)this, new AABB(this.m_20185_() - 15.0, this.m_20186_() - 15.0, this.m_20189_() - 15.0, this.m_20185_() + 15.0, this.m_20186_() + 6.0 + 15.0, this.m_20189_() + 15.0), p_147140_ -> p_147140_.m_6084_() && !this.hitEntities.contains(p_147140_));
                    for (ServerPlayer serverplayer : ((ServerLevel)this.m_9236_()).m_8795_(p_147157_ -> p_147157_.m_20270_((Entity)this) < 256.0f)) {
                        CriteriaTriggers.f_145089_.m_153391_(serverplayer, (LightningBolt)this, list1);
                    }
                }
                this.m_146870_();
            } else if (this.life < -this.f_19796_.m_188503_(10)) {
                --this.flashes;
                this.life = 1;
                this.seed = this.f_19796_.m_188505_();
                this.m_20870_(0);
            }
        }
        if (this.life >= 0) {
            if (!(this.m_9236_() instanceof ServerLevel)) {
                this.m_9236_().m_6580_(2);
            } else if (!this.visualOnly) {
                list1 = this.m_9236_().m_6249_((Entity)this, new AABB(this.m_20185_() - 3.0, this.m_20186_() - 3.0, this.m_20189_() - 3.0, this.m_20185_() + 3.0, this.m_20186_() + 6.0 + 3.0, this.m_20189_() + 3.0), Entity::m_6084_);
                for (Entity entity : list1) {
                    if (ForgeEventFactory.onEntityStruckByLightning((Entity)entity, (LightningBolt)this)) continue;
                    entity.m_8038_((ServerLevel)this.m_9236_(), (LightningBolt)this);
                }
                this.hitEntities.addAll(list1);
                if (this.cause != null) {
                    CriteriaTriggers.f_10554_.m_21721_(this.cause, (Collection)list1);
                }
            }
        }
    }

    private static void m_147150_(Level p_147151_, BlockPos p_147152_) {
        BlockState blockstate1;
        BlockPos blockpos;
        BlockState blockstate = p_147151_.m_8055_(p_147152_);
        if (blockstate.m_60713_(Blocks.f_152587_)) {
            blockpos = p_147152_.m_121945_(((Direction)blockstate.m_61143_((Property)LightningRodBlock.f_52588_)).m_122424_());
            blockstate1 = p_147151_.m_8055_(blockpos);
        } else {
            blockpos = p_147152_;
            blockstate1 = blockstate;
        }
        if (blockstate1.m_60734_() instanceof WeatheringCopper) {
            p_147151_.m_46597_(blockpos, WeatheringCopper.m_154906_((BlockState)p_147151_.m_8055_(blockpos)));
            BlockPos.MutableBlockPos blockpos$mutableblockpos = p_147152_.m_122032_();
            int i = p_147151_.f_46441_.m_188503_(3) + 3;
            for (int j = 0; j < i; ++j) {
                int k = p_147151_.f_46441_.m_188503_(8) + 1;
                RainbowlightningEntity.m_147145_(p_147151_, blockpos, blockpos$mutableblockpos, k);
            }
        }
    }

    private static void m_147145_(Level p_147146_, BlockPos p_147147_, BlockPos.MutableBlockPos p_147148_, int p_147149_) {
        Optional<BlockPos> optional;
        p_147148_.m_122190_((Vec3i)p_147147_);
        for (int i = 0; i < p_147149_ && (optional = RainbowlightningEntity.m_147153_(p_147146_, (BlockPos)p_147148_)).isPresent(); ++i) {
            p_147148_.m_122190_((Vec3i)optional.get());
        }
    }

    private static Optional<BlockPos> m_147153_(Level p_147154_, BlockPos p_147155_) {
        BlockPos blockpos;
        BlockState blockstate;
        Iterator var2 = BlockPos.m_235650_((RandomSource)p_147154_.f_46441_, (int)10, (BlockPos)p_147155_, (int)1).iterator();
        do {
            if (var2.hasNext()) continue;
            return Optional.empty();
        } while (!((blockstate = p_147154_.m_8055_(blockpos = (BlockPos)var2.next())).m_60734_() instanceof WeatheringCopper));
        BlockPos finalBlockpos = blockpos;
        WeatheringCopper.m_154899_((BlockState)blockstate).ifPresent(p_147144_ -> p_147154_.m_46597_(finalBlockpos, p_147144_));
        p_147154_.m_46796_(3002, blockpos, -1);
        return Optional.of(blockpos);
    }

    private BlockPos m_147162_() {
        Vec3 vec3 = this.m_20182_();
        return BlockPos.m_274561_((double)vec3.f_82479_, (double)(vec3.f_82480_ - 1.0E-6), (double)vec3.f_82481_);
    }

    private void m_20870_(int p_20871_) {
        if (!this.visualOnly && !this.m_9236_().f_46443_ && this.m_9236_().m_46469_().m_46207_(GameRules.f_46131_)) {
            BlockPos blockpos = this.m_20183_();
            BlockState blockstate = BaseFireBlock.m_49245_((BlockGetter)this.m_9236_(), (BlockPos)blockpos);
            if (this.m_9236_().m_8055_(blockpos).m_60795_() && blockstate.m_60710_((LevelReader)this.m_9236_(), blockpos)) {
                this.m_9236_().m_46597_(blockpos, blockstate);
                ++this.blocksSetOnFire;
            }
            for (int i = 0; i < p_20871_; ++i) {
                BlockPos blockpos1 = blockpos.m_7918_(this.f_19796_.m_188503_(3) - 1, this.f_19796_.m_188503_(3) - 1, this.f_19796_.m_188503_(3) - 1);
                blockstate = BaseFireBlock.m_49245_((BlockGetter)this.m_9236_(), (BlockPos)blockpos1);
                if (!this.m_9236_().m_8055_(blockpos1).m_60795_() || !blockstate.m_60710_((LevelReader)this.m_9236_(), blockpos1)) continue;
                this.m_9236_().m_46597_(blockpos1, blockstate);
                ++this.blocksSetOnFire;
            }
        }
    }

    private void m_147161_() {
        BlockPos blockpos = this.m_147162_();
        BlockState blockstate = this.m_9236_().m_8055_(blockpos);
        if (blockstate.m_60713_(Blocks.f_152587_)) {
            ((LightningRodBlock)blockstate.m_60734_()).m_153760_(blockstate, this.m_9236_(), blockpos);
        }
    }

    @NotNull
    public SoundSource m_5720_() {
        return SoundSource.WEATHER;
    }

    public RainbowlightningEntity(EntityType<RainbowlightningEntity> type, Level world) {
        super(type, world);
        this.f_19811_ = true;
        this.life = 5;
        this.flashes = 30;
        this.seed = this.f_19796_.m_188505_();
    }

    public Stream<Entity> m_147160_() {
        return this.hitEntities.stream().filter(Entity::m_6084_);
    }
}

