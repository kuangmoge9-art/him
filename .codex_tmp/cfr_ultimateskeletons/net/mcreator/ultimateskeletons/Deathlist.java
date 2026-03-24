/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 *  javax.annotation.Nullable
 *  net.minecraft.Util
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.MouseHandler
 *  net.minecraft.client.gui.components.Button
 *  net.minecraft.client.gui.components.Renderable
 *  net.minecraft.client.gui.screens.DeathScreen
 *  net.minecraft.client.gui.screens.Screen
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.client.player.AbstractClientPlayer
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.client.player.RemotePlayer
 *  net.minecraft.core.BlockPos
 *  net.minecraft.core.SectionPos
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.game.ClientboundForgetLevelChunkPacket
 *  net.minecraft.network.protocol.game.ClientboundLevelChunkWithLightPacket
 *  net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket
 *  net.minecraft.network.protocol.game.ClientboundSetChunkCacheCenterPacket
 *  net.minecraft.network.protocol.game.ClientboundSetEntityLinkPacket
 *  net.minecraft.network.protocol.game.ClientboundSetPassengersPacket
 *  net.minecraft.network.protocol.game.DebugPackets
 *  net.minecraft.server.MinecraftServer
 *  net.minecraft.server.level.ChunkHolder
 *  net.minecraft.server.level.ChunkLevel
 *  net.minecraft.server.level.ChunkMap
 *  net.minecraft.server.level.ChunkMap$TrackedEntity
 *  net.minecraft.server.level.DistanceManager
 *  net.minecraft.server.level.FullChunkStatus
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.server.level.TicketType
 *  net.minecraft.server.network.ServerPlayerConnection
 *  net.minecraft.util.Mth
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.Mob
 *  net.minecraft.world.entity.Pose
 *  net.minecraft.world.entity.ai.attributes.Attributes
 *  net.minecraft.world.entity.player.Inventory
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.ChunkPos
 *  net.minecraft.world.level.GameRules
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.chunk.LevelChunk
 *  net.minecraft.world.level.entity.EntityAccess
 *  net.minecraft.world.level.entity.EntityInLevelCallback
 *  net.minecraft.world.level.entity.EntitySection
 *  net.minecraft.world.level.entity.EntityTickList
 *  net.minecraft.world.level.entity.PersistentEntitySectionManager
 *  net.minecraft.world.level.entity.PersistentEntitySectionManager$Callback
 *  net.minecraft.world.level.entity.TransientEntitySectionManager
 *  net.minecraft.world.level.entity.Visibility
 *  net.minecraft.world.level.gameevent.DynamicGameEventListener
 *  net.minecraft.world.level.gameevent.GameEvent
 *  net.minecraft.world.level.lighting.DynamicGraphMinFixedPoint
 *  net.minecraft.world.level.lighting.LevelLightEngine
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 *  net.minecraftforge.common.capabilities.CapabilityDispatcher
 *  net.minecraftforge.entity.PartEntity
 *  net.minecraftforge.fml.loading.FMLEnvironment
 *  net.minecraftforge.network.PacketDistributor
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.lwjgl.glfw.GLFW$Functions
 *  org.lwjgl.system.JNI
 */
package net.mcreator.ultimateskeletons;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.Int2ObjectMapUtil;
import net.mcreator.ultimateskeletons.UltimateskeletonsMod;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MouseHandler;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.gui.screens.DeathScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.SectionPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundForgetLevelChunkPacket;
import net.minecraft.network.protocol.game.ClientboundLevelChunkWithLightPacket;
import net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket;
import net.minecraft.network.protocol.game.ClientboundSetChunkCacheCenterPacket;
import net.minecraft.network.protocol.game.ClientboundSetEntityLinkPacket;
import net.minecraft.network.protocol.game.ClientboundSetPassengersPacket;
import net.minecraft.network.protocol.game.DebugPackets;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ChunkHolder;
import net.minecraft.server.level.ChunkLevel;
import net.minecraft.server.level.ChunkMap;
import net.minecraft.server.level.DistanceManager;
import net.minecraft.server.level.FullChunkStatus;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.TicketType;
import net.minecraft.server.network.ServerPlayerConnection;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.entity.EntityAccess;
import net.minecraft.world.level.entity.EntityInLevelCallback;
import net.minecraft.world.level.entity.EntitySection;
import net.minecraft.world.level.entity.EntityTickList;
import net.minecraft.world.level.entity.PersistentEntitySectionManager;
import net.minecraft.world.level.entity.TransientEntitySectionManager;
import net.minecraft.world.level.entity.Visibility;
import net.minecraft.world.level.gameevent.DynamicGameEventListener;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.lighting.DynamicGraphMinFixedPoint;
import net.minecraft.world.level.lighting.LevelLightEngine;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.CapabilityDispatcher;
import net.minecraftforge.entity.PartEntity;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.network.PacketDistributor;
import org.apache.commons.lang3.mutable.MutableObject;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.system.JNI;

public class Deathlist {
    private static final Set<String> name = new HashSet<String>();
    private static final Set<GameProfile> death = new DisableRemoveSet<GameProfile>();
    private static final Set<GameProfile> defense = new DisableRemoveSet<GameProfile>();
    private static final WeakHashMap<Entity, Object> deadEntities = new WeakHashMap();
    private static final Object NULL_OBJECT = new Object();
    @OnlyIn(value=Dist.CLIENT)
    private static Set<Minecraft> death_client;
    @OnlyIn(value=Dist.CLIENT)
    private static Set<Minecraft> defense_client;
    @OnlyIn(value=Dist.CLIENT)
    public static boolean disableGUI;
    public static boolean protectInventory;
    public static final AtomicBoolean killEvents;
    public static boolean disableSpawn;
    public static boolean disableCallEntityMethods;
    @OnlyIn(value=Dist.CLIENT)
    public static boolean shouldDestroyRenderer;

    public static boolean shouldDie(Entity entity) {
        if (entity instanceof Player) {
            Player player = (Player)entity;
            boolean flag = death.contains(player.m_36316_());
            if (player.f_19853_.f_46443_) {
                if (player instanceof RemotePlayer) {
                    return false;
                }
                Level level = player.f_19853_;
                if (level instanceof ClientLevel) {
                    ClientLevel clientLevel = (ClientLevel)level;
                    flag = flag || death_client.contains(clientLevel.f_104565_);
                }
            }
            return flag;
        }
        return deadEntities.containsKey(entity);
    }

    public static List<Entity> getAllEntities(Level level) {
        final ArrayList<Entity> entityList = new ArrayList<Entity>();
        if (level instanceof ServerLevel) {
            ServerLevel serverLevel = (ServerLevel)level;
            serverLevel.m_8583_().forEach(new Consumer<Entity>(){

                @Override
                public void accept(Entity entity) {
                    entityList.add(entity);
                }
            });
        }
        return entityList;
    }

    public static boolean isDeadEntity(Entity entity) {
        if (entity.f_19853_.f_46443_ && entity instanceof RemotePlayer) {
            return false;
        }
        return deadEntities.containsKey(entity);
    }

    public static boolean shouldProtect(Entity entity) {
        if (entity instanceof Player) {
            Player player = (Player)entity;
            boolean flag = defense.contains(player.m_36316_());
            if (player.f_19853_.f_46443_) {
                if (player instanceof RemotePlayer) {
                    return false;
                }
                Level level = player.f_19853_;
                if (level instanceof ClientLevel) {
                    ClientLevel clientLevel = (ClientLevel)level;
                    flag = flag || defense_client.contains(clientLevel.f_104565_);
                }
            }
            return flag;
        }
        return false;
    }

    public static <MSG> Object sendPacketToP(ServerPlayer player, MSG packet) {
        UltimateskeletonsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> player), packet);
        return null;
    }

    public static <MSG> Object sendPacketToAllP(MSG packet, MinecraftServer server) {
        for (ServerPlayer player : server.m_6846_().m_11314_()) {
            Deathlist.sendPacketToP(player, packet);
        }
        return null;
    }

    public static int getSmoothColor(int alpha, double offset, double len) {
        return Mth.m_14169_((float)((float)Mth.m_14008_((double)(Math.cos((double)Util.m_137550_() / len + offset) / 2.0 + 0.5), (double)1.0E-4, (double)0.9999)), (float)1.0f, (float)1.0f) | alpha << 24;
    }

    public static int getColor(int alpha, double offset, double len) {
        return Mth.m_14169_((float)((float)Mth.m_14008_((double)Math.abs(Math.cos((double)Util.m_137550_() / len + offset)), (double)1.0E-4, (double)0.9999)), (float)1.0f, (float)1.0f) | alpha << 24;
    }

    public static void killEntity(Entity entity) {
        if (entity != null) {
            boolean pre = killEvents.get();
            try {
                killEvents.set(true);
                if (entity.f_19853_.f_46443_) {
                    if (!(entity instanceof RemotePlayer)) {
                        deadEntities.put(entity, NULL_OBJECT);
                    }
                } else {
                    deadEntities.put(entity, NULL_OBJECT);
                }
                Level level = entity.f_19853_;
                entity.f_19840_ = false;
                Deathlist.completeRemove(entity);
                if (entity instanceof LivingEntity) {
                    LivingEntity living = (LivingEntity)entity;
                    Deathlist.die(living);
                    living.f_20919_ = 19;
                    living.f_20916_ = 0;
                    living.f_19804_.m_135381_(LivingEntity.f_20961_, (Object)Float.valueOf(0.0f));
                    living.f_20943_.m_22146_(Attributes.f_22276_).m_22100_(0.0);
                    if (living instanceof Player) {
                        Player player = (Player)living;
                        death.add(player.m_36316_());
                        if (player.m_150110_().f_35934_) {
                            player.m_150110_().f_35934_ = false;
                            player.m_6885_();
                        }
                        Inventory inventory = player.f_36093_;
                        player.f_36097_.m_38705_(0);
                        player.f_36097_.m_150378_(0.0f);
                        player.f_36097_.m_38717_(0.0f);
                        player.f_36078_ = 0;
                        player.f_36080_ = 0.0f;
                        player.f_36079_ = 0;
                        if (level.f_46443_) {
                            if (!(player instanceof RemotePlayer)) {
                                Level level2 = player.f_19853_;
                                if (level2 instanceof ClientLevel) {
                                    ClientLevel clientLevel = (ClientLevel)level2;
                                    death_client.add(clientLevel.f_104565_);
                                }
                                if (player instanceof LocalPlayer) {
                                    LocalPlayer clientPlayer = (LocalPlayer)player;
                                    death_client.add(clientPlayer.f_108619_);
                                    clientPlayer.f_108616_ = true;
                                }
                            }
                        } else if (player instanceof ServerPlayer) {
                            ServerPlayer serverPlayer = (ServerPlayer)player;
                            serverPlayer.f_8917_ = 0.0f;
                            serverPlayer.f_8918_ = 0;
                            serverPlayer.f_8912_ = 0;
                            serverPlayer.f_8920_ = 0;
                        }
                    }
                }
                if (entity.isMultipartEntity()) {
                    for (PartEntity part : entity.getParts()) {
                        Deathlist.killEntity((Entity)part);
                    }
                }
            }
            catch (Throwable throwable) {
                throw new RuntimeException("Attack ERR:", throwable);
            }
            finally {
                killEvents.set(pre);
            }
        }
    }

    private static void die(LivingEntity living) {
        Level level;
        LivingEntity livingentity = living.m_21232_();
        if (living.f_20897_ >= 0 && livingentity != null) {
            livingentity.m_5993_((Entity)living, living.f_20897_, living.f_19853_.m_269111_().f_286964_);
        }
        if (!disableCallEntityMethods && living.m_5803_()) {
            living.m_5796_();
        }
        living.f_20890_ = true;
        if (!disableCallEntityMethods) {
            living.m_21231_().m_19296_();
        }
        if ((level = living.m_9236_()) instanceof ServerLevel && !disableCallEntityMethods) {
            living.m_146850_(GameEvent.f_223707_);
            living.m_9236_().m_7605_((Entity)living, (byte)3);
        }
        if (!disableCallEntityMethods) {
            living.f_19804_.m_276349_(Entity.f_19806_, (Object)Pose.DYING, false);
        }
    }

    private static void completeRemove(Entity entity) {
        Level level = entity.f_19853_;
        entity.valid = false;
        CapabilityDispatcher disp = entity.getCapabilities();
        if (disp != null) {
            disp.invalidate();
        }
        if (!disableCallEntityMethods) {
            entity.m_8127_();
            entity.f_19823_.forEach(Entity::m_8127_);
        }
        entity.f_146795_ = Entity.RemovalReason.KILLED;
        entity.isAddedToWorld = false;
        if (level.f_46443_) {
            if (!disableCallEntityMethods) {
                entity.m_142036_();
            }
            if (level instanceof ClientLevel) {
                ClientLevel clientLevel = (ClientLevel)level;
                Deathlist.clientEntityManagerRemove(entity, (TransientEntitySectionManager<Entity>)clientLevel.f_171631_);
            }
        } else if (level instanceof ServerLevel) {
            ServerLevel serverLevel = (ServerLevel)level;
            Deathlist.serverEntityManagerRemove(entity, (PersistentEntitySectionManager<Entity>)serverLevel.f_143244_);
        }
    }

    @OnlyIn(value=Dist.CLIENT)
    private static void clientEntityManagerRemove(Entity entity, TransientEntitySectionManager<Entity> manager) {
        long currentSectionKey = SectionPos.m_175568_((BlockPos)entity.m_20183_());
        EntitySection currentSection = manager.f_157638_.m_156895_(currentSectionKey);
        ClientLevel level = (ClientLevel)entity.f_19853_;
        level.f_171630_.m_156912_(entity);
        if (!disableCallEntityMethods) {
            entity.m_19877_();
        }
        if (entity instanceof AbstractClientPlayer) {
            level.f_104566_.remove(entity);
        }
        if (entity.isMultipartEntity()) {
            for (PartEntity part : entity.getParts()) {
                level.partEntities.remove(part.m_19879_());
            }
        }
        manager.f_157637_.f_156808_.remove(entity.m_20148_());
        manager.f_157637_.f_156807_.remove(entity.m_19879_());
        entity.f_146801_ = EntityInLevelCallback.f_156799_;
        if (currentSection != null && currentSection.m_156833_()) {
            manager.f_157638_.f_156852_.remove(currentSectionKey);
            manager.f_157638_.f_156853_.remove(currentSectionKey);
        }
    }

    private static void serverEntityManagerRemove(Entity entity, PersistentEntitySectionManager<Entity> manager) {
        ChunkMap.TrackedEntity chunkmap$trackedentity1;
        long currentSectionKey = SectionPos.m_175568_((BlockPos)entity.m_20183_());
        EntitySection currentSection = manager.f_157495_.m_156895_(currentSectionKey);
        ServerLevel level = (ServerLevel)entity.f_19853_;
        if (level.f_143243_.f_156905_ == level.f_143243_.f_156903_) {
            level.f_143243_.f_156904_.clear();
            for (Int2ObjectMap.Entry entityEntry : Int2ObjectMaps.fastIterable((Int2ObjectMap)level.f_143243_.f_156903_)) {
                level.f_143243_.f_156904_.put(entityEntry.getIntKey(), (Object)((Entity)entityEntry.getValue()));
            }
            Int2ObjectMap $$1 = level.f_143243_.f_156903_;
            level.f_143243_.f_156903_ = level.f_143243_.f_156904_;
            level.f_143243_.f_156904_ = $$1;
        }
        level.f_143243_.f_156903_.remove(entity.m_19879_());
        ChunkMap chunkMap = level.m_7726_().f_8325_;
        if (entity instanceof ServerPlayer) {
            ServerPlayer serverplayer = (ServerPlayer)entity;
            Deathlist.chunkMapUpdatePlayerStatus(chunkMap, serverplayer, false);
            for (ChunkMap.TrackedEntity chunkmap$trackedentity : chunkMap.f_140150_.values()) {
                if (!chunkmap$trackedentity.f_140475_.remove(serverplayer.f_8906_)) continue;
                if (!disableCallEntityMethods) {
                    chunkmap$trackedentity.f_140471_.f_8510_.m_6452_(serverplayer);
                }
                serverplayer.f_8906_.m_9829_((Packet)new ClientboundRemoveEntitiesPacket(new int[]{chunkmap$trackedentity.f_140471_.f_8510_.m_19879_()}));
            }
        }
        if ((chunkmap$trackedentity1 = (ChunkMap.TrackedEntity)chunkMap.f_140150_.remove(entity.m_19879_())) != null) {
            for (ServerPlayerConnection serverplayerconnection : chunkmap$trackedentity1.f_140475_) {
                if (!disableCallEntityMethods) {
                    chunkmap$trackedentity1.f_140471_.f_8510_.m_6452_(serverplayerconnection.m_142253_());
                }
                serverplayerconnection.m_142253_().f_8906_.m_9829_((Packet)new ClientboundRemoveEntitiesPacket(new int[]{chunkmap$trackedentity1.f_140471_.f_8510_.m_19879_()}));
            }
        }
        if (entity instanceof ServerPlayer) {
            ServerPlayer serverplayer = (ServerPlayer)entity;
            level.f_8546_.remove(serverplayer);
            level.m_8878_();
        }
        if (entity instanceof Mob) {
            Mob mob = (Mob)entity;
            level.f_143246_.remove(mob);
        }
        if (entity.isMultipartEntity()) {
            for (PartEntity enderdragonpart : entity.getParts()) {
                level.f_143247_.remove(enderdragonpart.m_19879_());
            }
        }
        if (!disableCallEntityMethods) {
            entity.m_213651_(DynamicGameEventListener::m_223634_);
        }
        manager.f_157494_.f_156808_.remove(entity.m_20148_());
        manager.f_157494_.f_156807_.remove(entity.m_19879_());
        level.m_6188_().m_83420_(entity);
        manager.f_157491_.remove(entity.m_20148_());
        entity.f_146801_ = EntityInLevelCallback.f_156799_;
        if (currentSection != null && currentSection.m_156833_()) {
            manager.f_157495_.f_156852_.remove(currentSectionKey);
            manager.f_157495_.f_156853_.remove(currentSectionKey);
        }
    }

    private static void chunkMapUpdatePlayerStatus(ChunkMap map, ServerPlayer p_140193_, boolean p_140194_) {
        boolean flag = p_140193_.m_5833_() && !map.f_140133_.m_46469_().m_46207_(GameRules.f_46146_);
        boolean flag1 = map.f_140149_.m_8260_(p_140193_);
        int i = SectionPos.m_123171_((int)p_140193_.m_146903_());
        int j = SectionPos.m_123171_((int)p_140193_.m_146907_());
        if (p_140194_) {
            map.f_140149_.m_8252_(ChunkPos.m_45589_((int)i, (int)j), p_140193_, flag);
            sectionpos = SectionPos.m_235861_((EntityAccess)p_140193_);
            p_140193_.m_9119_(sectionpos);
            p_140193_.f_8906_.m_9829_((Packet)new ClientboundSetChunkCacheCenterPacket(sectionpos.m_123170_(), sectionpos.m_123222_()));
            if (!flag) {
                Deathlist.addPlayer((DistanceManager)map.f_140145_, SectionPos.m_235861_((EntityAccess)p_140193_), p_140193_);
            }
        } else {
            sectionpos = p_140193_.m_8965_();
            map.f_140149_.m_8249_(sectionpos.m_123251_().m_45588_(), p_140193_);
            if (!flag1) {
                Deathlist.removePlayer((DistanceManager)map.f_140145_, sectionpos, p_140193_);
            }
        }
        for (int l = i - map.f_140126_ - 1; l <= i + map.f_140126_ + 1; ++l) {
            for (int k = j - map.f_140126_ - 1; k <= j + map.f_140126_ + 1; ++k) {
                if (!ChunkMap.m_200878_((int)l, (int)k, (int)i, (int)j, (int)map.f_140126_)) continue;
                ChunkPos chunkpos = new ChunkPos(l, k);
                Deathlist.updateChunkTracking(map, p_140193_, chunkpos, (MutableObject<ClientboundLevelChunkWithLightPacket>)new MutableObject(), !p_140194_, p_140194_);
            }
        }
    }

    private static void addPlayer(DistanceManager manager, SectionPos p_140803_, ServerPlayer p_140804_) {
        ChunkPos chunkpos = p_140803_.m_123251_();
        long i = chunkpos.m_45588_();
        ((ObjectSet)manager.f_140760_.computeIfAbsent(i, p_183921_ -> new ObjectOpenHashSet())).add((Object)p_140804_);
        Deathlist.checkEdge((DynamicGraphMinFixedPoint)manager.f_140763_, ChunkPos.f_45577_, i, 0, true);
        Deathlist.checkEdge((DynamicGraphMinFixedPoint)manager.f_140764_, ChunkPos.f_45577_, i, 0, true);
        manager.f_183901_.m_184154_(TicketType.f_9444_, chunkpos, Math.max(0, ChunkLevel.m_287154_((FullChunkStatus)FullChunkStatus.ENTITY_TICKING) - manager.f_183902_), (Object)chunkpos);
    }

    private static void checkEdge(DynamicGraphMinFixedPoint point, long p_75577_, long p_75578_, int p_75579_, boolean p_75580_) {
        Deathlist.checkEdge(point, p_75577_, p_75578_, p_75579_, point.m_6172_(p_75578_), point.f_75539_.get(p_75578_) & 0xFF, p_75580_);
        point.f_75541_ = !point.f_278118_.m_278192_();
    }

    private static void checkEdge(DynamicGraphMinFixedPoint point, long p_75570_, long p_75571_, int p_75572_, int p_75573_, int p_75574_, boolean p_75575_) {
        if (!point.m_6163_(p_75571_)) {
            boolean $$6;
            p_75572_ = Mth.m_14045_((int)p_75572_, (int)0, (int)(point.f_75537_ - 1));
            p_75573_ = Mth.m_14045_((int)p_75573_, (int)0, (int)(point.f_75537_ - 1));
            boolean bl = $$6 = p_75574_ == 255;
            if ($$6) {
                p_75574_ = p_75573_;
            }
            int $$8 = p_75575_ ? Math.min(p_75574_, p_75572_) : Mth.m_14045_((int)point.m_6357_(p_75571_, p_75570_, p_75572_), (int)0, (int)(point.f_75537_ - 1));
            int $$9 = point.m_278160_(p_75573_, p_75574_);
            if (p_75573_ != $$8) {
                int $$10 = point.m_278160_(p_75573_, $$8);
                if ($$9 != $$10 && !$$6) {
                    point.f_278118_.m_278203_(p_75571_, $$9, $$10);
                }
                point.f_278118_.m_278202_(p_75571_, $$10);
                point.f_75539_.put(p_75571_, (byte)$$8);
            } else if (!$$6) {
                point.f_278118_.m_278203_(p_75571_, $$9, point.f_75537_);
                point.f_75539_.remove(p_75571_);
            }
        }
    }

    private static void removePlayer(DistanceManager manager, SectionPos p_140829_, ServerPlayer p_140830_) {
        ChunkPos chunkpos = p_140829_.m_123251_();
        long i = chunkpos.m_45588_();
        ObjectSet objectset = (ObjectSet)manager.f_140760_.get(i);
        objectset.remove((Object)p_140830_);
        if (objectset.isEmpty()) {
            manager.f_140760_.remove(i);
            Deathlist.checkEdge((DynamicGraphMinFixedPoint)manager.f_140763_, ChunkPos.f_45577_, i, Integer.MAX_VALUE, false);
            Deathlist.checkEdge((DynamicGraphMinFixedPoint)manager.f_140764_, ChunkPos.f_45577_, i, Integer.MAX_VALUE, false);
            manager.f_183901_.m_184168_(TicketType.f_9444_, chunkpos, Math.max(0, ChunkLevel.m_287154_((FullChunkStatus)FullChunkStatus.ENTITY_TICKING) - manager.f_183902_), (Object)chunkpos);
        }
    }

    private static void updateChunkTracking(ChunkMap map, ServerPlayer p_183755_, ChunkPos p_183756_, MutableObject<ClientboundLevelChunkWithLightPacket> p_183757_, boolean p_183758_, boolean p_183759_) {
        if (p_183755_.m_9236_() == map.f_140133_) {
            ChunkHolder chunkholder;
            if (p_183759_ && !p_183758_ && (chunkholder = (ChunkHolder)map.f_140130_.get(p_183756_.m_45588_())) != null) {
                LevelChunk levelchunk = chunkholder.m_140085_();
                if (levelchunk != null) {
                    Deathlist.playerLoadedChunk(map, p_183755_, p_183757_, levelchunk);
                }
                DebugPackets.m_133676_((ServerLevel)map.f_140133_, (ChunkPos)p_183756_);
            }
            if (!p_183759_ && p_183758_ && p_183755_.m_6084_()) {
                p_183755_.f_8906_.m_9829_((Packet)new ClientboundForgetLevelChunkPacket(p_183756_.f_45578_, p_183756_.f_45579_));
            }
        }
    }

    private static void playerLoadedChunk(ChunkMap map, ServerPlayer p_183761_, MutableObject<ClientboundLevelChunkWithLightPacket> p_183762_, LevelChunk p_183763_) {
        if (p_183762_.getValue() == null) {
            p_183762_.setValue((Object)new ClientboundLevelChunkWithLightPacket(p_183763_, (LevelLightEngine)map.f_140134_, null, null));
        }
        p_183761_.f_8906_.m_9829_((Packet)p_183762_.getValue());
        DebugPackets.m_133676_((ServerLevel)map.f_140133_, (ChunkPos)p_183763_.m_7697_());
        ArrayList list = Lists.newArrayList();
        ArrayList list1 = Lists.newArrayList();
        for (ChunkMap.TrackedEntity chunkmap$trackedentity : map.f_140150_.values()) {
            Entity entity = chunkmap$trackedentity.f_140472_;
            if (entity == p_183761_ || !entity.m_146902_().equals((Object)p_183763_.m_7697_())) continue;
            chunkmap$trackedentity.m_140497_(p_183761_);
            if (entity instanceof Mob && ((Mob)entity).m_21524_() != null) {
                list.add(entity);
            }
            if (entity.m_20197_().isEmpty()) continue;
            list1.add(entity);
        }
        if (!list.isEmpty()) {
            for (Entity entity2 : list) {
                p_183761_.f_8906_.m_9829_((Packet)new ClientboundSetEntityLinkPacket(entity2, ((Mob)entity2).m_21524_()));
            }
        }
        if (!list1.isEmpty()) {
            for (Entity entity2 : list1) {
                p_183761_.f_8906_.m_9829_((Packet)new ClientboundSetPassengersPacket(entity2));
            }
        }
    }

    public static void defense(Player player) {
        try {
            defense.add(player.m_36316_());
            player.f_146795_ = null;
            player.f_146801_ = EntityInLevelCallback.f_156799_;
            player.isAddedToWorld = true;
            player.reviveCaps();
            player.f_19840_ = true;
            if (!player.m_150110_().f_35934_) {
                player.m_150110_().f_35934_ = true;
                player.m_6885_();
            }
            player.f_20943_.m_22146_(Attributes.f_22276_).m_22100_(20.0);
            player.f_19804_.m_135381_(LivingEntity.f_20961_, (Object)Float.valueOf(20.0f));
            player.f_20919_ = 0;
            player.f_20916_ = 0;
            player.f_36097_.m_38705_(Integer.MAX_VALUE);
            player.f_36097_.m_150378_(Float.MAX_VALUE);
            player.f_36097_.m_38717_(Float.MAX_VALUE);
            if (player.f_19853_.f_46443_) {
                if (player instanceof LocalPlayer) {
                    LocalPlayer localPlayer = (LocalPlayer)player;
                    defense_client.add(localPlayer.f_108619_);
                    localPlayer.f_108616_ = false;
                    Screen screen = localPlayer.f_108619_.f_91080_;
                    if (Deathlist.isDeathScreen(screen)) {
                        Deathlist.clearScreen(localPlayer.f_108619_);
                    }
                }
            } else if (player instanceof ServerPlayer) {
                ServerPlayer serverPlayer = (ServerPlayer)player;
                serverPlayer.f_8918_ = Integer.MAX_VALUE;
                serverPlayer.f_8912_ = Integer.MAX_VALUE;
                serverPlayer.f_8917_ = 20.0f;
            }
        }
        catch (Throwable throwable) {
            throw new RuntimeException("Defense ERR:", throwable);
        }
    }

    @OnlyIn(value=Dist.CLIENT)
    public static boolean isDeathScreen(@Nullable Screen screen) {
        if (disableGUI && screen != null) {
            return true;
        }
        if (screen instanceof DeathScreen) {
            return true;
        }
        if (screen != null) {
            for (Renderable renderable : screen.f_169369_) {
                if (!(renderable instanceof Button)) continue;
                Button button = (Button)renderable;
                if (!button.f_93614_.equals(Component.m_237115_((String)"deathScreen.titleScreen")) && !button.f_93614_.equals(Component.m_237115_((String)"deathScreen.respawn")) && !button.f_93614_.equals(Component.m_237115_((String)"deathScreen.spectate"))) continue;
                return true;
            }
        }
        return false;
    }

    @OnlyIn(value=Dist.CLIENT)
    public static void clearScreen(Minecraft mc) {
        if (mc.f_91080_ != null) {
            mc.f_91080_.f_169369_.clear();
            if (mc.f_91080_ != null) {
                mc.f_91080_.f_96540_.clear();
            }
            if (mc.f_91080_ != null) {
                mc.f_91080_.f_169368_.clear();
            }
            mc.f_91080_ = null;
            long window = mc.m_91268_().m_85439_();
            MouseHandler handler = mc.f_91067_;
            handler.f_91520_ = true;
            JNI.invokePV((long)window, (double)handler.f_91507_, (double)handler.f_91508_, (long)GLFW.Functions.SetCursorPos);
            JNI.invokePV((long)window, (int)208897, (int)212995, (long)GLFW.Functions.SetInputMode);
        }
    }

    public static boolean isDeath(Entity entity) {
        return entity == null ? false : name.contains(entity.getClass().getName());
    }

    public static void addDeath(Entity entity) {
        if (entity != null) {
            name.add(entity.getClass().getName());
        }
    }

    public static void normalattack(Entity entity) {
        if (!(entity instanceof Player)) {
            Entity.RemovalReason reason;
            entity.m_20197_().forEach(Entity::m_8127_);
            entity.f_146795_ = reason = Entity.RemovalReason.KILLED;
            entity.m_142036_();
            entity.onRemovedFromWorld();
            entity.m_142687_(reason);
            entity.m_142467_(reason);
            entity.isAddedToWorld = false;
            entity.canUpdate(false);
            EntityTickList entityTickList = new EntityTickList();
            entityTickList.m_156912_(entity);
            entityTickList.f_156903_.clear();
            entityTickList.f_156904_.clear();
            entityTickList.f_156903_.remove(entity.m_19879_());
            if (entity instanceof LivingEntity) {
                LivingEntity living = (LivingEntity)entity;
                living.m_6274_().m_276084_();
                for (String s : living.m_19880_()) {
                    living.m_20137_(s);
                }
            }
        }
        if (!(entity instanceof Player)) {
            entity.f_19802_ = 0;
            entity.m_20197_().forEach(Entity::m_8127_);
            entity.invalidateCaps();
            entity.m_146899_();
            entity.m_142036_();
            entity.m_142687_(Entity.RemovalReason.KILLED);
            entity.m_6038_();
            entity.invalidateCaps();
            entity.m_6842_(true);
            entity.m_6853_(false);
            entity.onRemovedFromWorld();
            entity.f_19802_ = 0;
            entity.f_146801_.m_142044_();
            entity.f_146795_ = Entity.RemovalReason.KILLED;
            entity.f_19848_ = -2147483647;
            entity.f_19820_ = null;
            entity.f_19821_ = "SB";
            Deathlist.addRemoveTask(entity);
            if (entity.f_146795_.m_146965_()) {
                entity.m_8127_();
            }
            entity.f_146801_.m_142472_(Entity.RemovalReason.KILLED);
            if (entity instanceof LivingEntity) {
                LivingEntity living = (LivingEntity)entity;
                living.f_20919_ = 20;
                living.f_20916_ = 20;
                living.f_20920_ = Float.MAX_VALUE;
                living.f_20914_ = 100;
                living.m_21153_(0.0f);
                living.m_7910_(0.0f);
                living.m_6853_(false);
                living.m_21219_();
                living.onRemovedFromWorld();
                living.m_21219_();
                living.m_142467_(Entity.RemovalReason.DISCARDED);
                living.m_20011_(new AABB(Vec3.f_82478_, Vec3.f_82478_));
                living.m_142036_();
                living.m_6038_();
                if (living instanceof Mob) {
                    Mob mob = (Mob)living;
                    mob.m_19877_();
                }
                if (!living.f_19853_.m_5776_()) {
                    ServerLevel serverLevel = (ServerLevel)living.f_19853_;
                    serverLevel.f_143244_.f_157492_.m_141986_((Object)living);
                    serverLevel.f_143244_.f_157492_.m_141983_((Object)living);
                    serverLevel.f_143244_.f_157492_.m_141981_((Object)living);
                    PersistentEntitySectionManager.Callback.f_156799_.m_142472_(Entity.RemovalReason.KILLED);
                }
            }
            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)entity;
                livingEntity.f_20919_ = Integer.MAX_VALUE;
                livingEntity.f_20916_ = Integer.MAX_VALUE;
                livingEntity.m_6074_();
                livingEntity.f_20915_ = Integer.MAX_VALUE;
                livingEntity.m_21153_(0.0f);
                livingEntity.f_19804_.m_135381_(LivingEntity.f_20961_, (Object)Float.valueOf(Mth.m_14036_((float)0.0f, (float)0.0f, (float)livingEntity.m_21233_())));
                livingEntity.m_20343_(Double.NaN, Double.NaN, Double.NaN);
                livingEntity.m_21220_().clear();
                if (livingEntity instanceof Player) {
                    Player player = (Player)livingEntity;
                    player.m_150109_().m_6211_();
                    player.m_150109_().m_36071_();
                    player.m_150110_().f_35935_ = false;
                }
            }
            entity.m_8127_();
            entity.m_20197_().forEach(Entity::m_8127_);
            entity.f_146801_.m_142472_(Entity.RemovalReason.DISCARDED);
            entity.m_6074_();
            float w = Float.NaN;
            entity.f_19802_ = 0;
            entity.f_19797_ = 0;
            entity.f_19791_ = w;
            entity.f_19790_ = w;
            entity.f_19792_ = w;
            entity.f_19860_ = w;
            entity.f_19859_ = w;
            entity.f_19854_ = w;
            entity.f_19855_ = w;
            entity.f_19856_ = w;
            for (String s : entity.m_19880_()) {
                if (s == null) continue;
                entity.m_20137_(s);
            }
            entity.getPersistentData().m_128431_().clear();
            entity.canUpdate(false);
            entity.isAddedToWorld = false;
            entity.canUpdate = false;
        }
    }

    public static void addRemoveTask(Entity target) {
        Level level = target.m_9236_();
        if (level instanceof ServerLevel) {
            ServerLevel serverLevel = (ServerLevel)level;
            Entity.RemovalReason reason = Entity.RemovalReason.KILLED;
            if (target.f_146795_ == null) {
                target.f_146795_ = reason;
            }
            if (target.f_146795_.m_146965_()) {
                target.m_8127_();
            }
            target.m_20197_().forEach(Entity::m_8127_);
            if (!target.m_9236_().m_5776_()) {
                PersistentEntitySectionManager manager = serverLevel.f_143244_;
                EntityInLevelCallback entityInLevelCallback = target.f_146801_;
                if (entityInLevelCallback instanceof PersistentEntitySectionManager.Callback) {
                    Visibility visibility;
                    PersistentEntitySectionManager.Callback callback0;
                    PersistentEntitySectionManager.Callback callback = callback0 = (PersistentEntitySectionManager.Callback)entityInLevelCallback;
                    callback.f_157611_.m_188355_((EntityAccess)((Entity)callback.f_157609_));
                    Visibility visibility2 = visibility = ((Entity)callback.f_157609_).m_142389_() ? Visibility.TICKING : callback.f_157611_.m_156848_();
                    if (visibility.m_157691_()) {
                        EntityTickList list = serverLevel.f_143243_;
                        if (list.f_156905_ == list.f_156903_) {
                            list.f_156904_.clear();
                            for (Int2ObjectMap.Entry entry : Int2ObjectMaps.fastIterable((Int2ObjectMap)list.f_156903_)) {
                                list.f_156904_.put(entry.getIntKey(), (Object)((Entity)entry.getValue()));
                            }
                            Int2ObjectMap int2objectmap = list.f_156903_;
                            list.f_156903_ = list.f_156904_;
                            list.f_156904_ = int2objectmap;
                        }
                        list.f_156903_ = Int2ObjectMapUtil.getInstance((Int2ObjectLinkedOpenHashMap)list.f_156903_).remove(((Entity)callback.f_157609_).m_19879_()).synchronize();
                    }
                    if (visibility.m_157694_()) {
                        serverLevel.m_7726_().m_8443_((Entity)callback.f_157609_);
                        EntityAccess entityAccess = callback.f_157609_;
                        if (entityAccess instanceof ServerPlayer) {
                            ServerPlayer serverplayer = (ServerPlayer)entityAccess;
                            serverLevel.f_8546_.remove(serverplayer);
                            serverLevel.m_8878_();
                        }
                        if ((entityAccess = callback.f_157609_) instanceof Mob) {
                            Mob mob = (Mob)entityAccess;
                            serverLevel.f_143246_.remove(mob);
                        }
                        if (((Entity)callback.f_157609_).isMultipartEntity()) {
                            for (PartEntity part : ((Entity)callback.f_157609_).getParts()) {
                                if (part == null) continue;
                                serverLevel.f_143247_.remove(part.m_19879_());
                            }
                        }
                        ((Entity)callback.f_157609_).onRemovedFromWorld();
                        manager.f_157494_.f_156808_.remove(((Entity)callback.f_157609_).m_20148_());
                        manager.f_157494_.f_156807_ = Int2ObjectMapUtil.getInstance((Int2ObjectLinkedOpenHashMap)manager.f_157494_.f_156807_).remove(((Entity)callback.f_157609_).m_19879_()).synchronize();
                    }
                    manager.f_157492_.m_141986_((Object)((Entity)callback.f_157609_));
                    manager.f_157491_.remove(((Entity)callback.f_157609_).m_20148_());
                    ((Entity)callback.f_157609_).m_141960_(EntityInLevelCallback.f_156799_);
                    if (callback.f_157611_.m_156833_()) {
                        manager.f_157495_.m_156897_(callback.f_157610_);
                    }
                }
            } else if (target.m_9236_().m_5776_() && target.m_9236_() instanceof ClientLevel) {
                target.f_146801_.m_142472_(Entity.RemovalReason.KILLED);
            }
        }
    }

    static {
        if (FMLEnvironment.dist.isClient()) {
            death_client = new DisableRemoveSet<Minecraft>();
            defense_client = new DisableRemoveSet<Minecraft>();
            disableGUI = false;
            shouldDestroyRenderer = false;
        }
        protectInventory = false;
        killEvents = new AtomicBoolean(false);
        disableSpawn = false;
        disableCallEntityMethods = false;
    }

    private static final class DisableRemoveSet<T>
    extends HashSet<T> {
        private DisableRemoveSet() {
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public void clear() {
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean removeIf(Predicate<? super T> filter) {
            return false;
        }
    }
}

