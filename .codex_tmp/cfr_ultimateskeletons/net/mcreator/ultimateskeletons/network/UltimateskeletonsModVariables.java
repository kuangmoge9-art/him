/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.core.Direction
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.nbt.Tag
 *  net.minecraft.network.FriendlyByteBuf
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.level.ServerLevelAccessor
 *  net.minecraft.world.level.saveddata.SavedData
 *  net.minecraftforge.common.capabilities.Capability
 *  net.minecraftforge.common.capabilities.CapabilityManager
 *  net.minecraftforge.common.capabilities.CapabilityToken
 *  net.minecraftforge.common.capabilities.ICapabilityProvider
 *  net.minecraftforge.common.capabilities.ICapabilitySerializable
 *  net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent
 *  net.minecraftforge.common.util.FakePlayer
 *  net.minecraftforge.common.util.LazyOptional
 *  net.minecraftforge.event.AttachCapabilitiesEvent
 *  net.minecraftforge.event.entity.player.PlayerEvent$Clone
 *  net.minecraftforge.event.entity.player.PlayerEvent$PlayerChangedDimensionEvent
 *  net.minecraftforge.event.entity.player.PlayerEvent$PlayerLoggedInEvent
 *  net.minecraftforge.event.entity.player.PlayerEvent$PlayerRespawnEvent
 *  net.minecraftforge.eventbus.api.SubscribeEvent
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber
 *  net.minecraftforge.fml.common.Mod$EventBusSubscriber$Bus
 *  net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent
 *  net.minecraftforge.network.NetworkEvent$Context
 *  net.minecraftforge.network.PacketDistributor
 */
package net.mcreator.ultimateskeletons.network;

import java.util.function.Supplier;
import net.mcreator.ultimateskeletons.UltimateskeletonsMod;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.PacketDistributor;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class UltimateskeletonsModVariables {
    public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get((CapabilityToken)new CapabilityToken<PlayerVariables>(){});

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        UltimateskeletonsMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
        UltimateskeletonsMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
    }

    @SubscribeEvent
    public static void init(RegisterCapabilitiesEvent event) {
        event.register(PlayerVariables.class);
    }

    public static class SavedDataSyncMessage {
        private final int type;
        private SavedData data;

        public SavedDataSyncMessage(FriendlyByteBuf buffer) {
            this.type = buffer.readInt();
            CompoundTag nbt = buffer.m_130260_();
            if (nbt != null) {
                this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
                SavedData savedData = this.data;
                if (savedData instanceof MapVariables) {
                    MapVariables mapVariables = (MapVariables)savedData;
                    mapVariables.read(nbt);
                } else {
                    savedData = this.data;
                    if (savedData instanceof WorldVariables) {
                        WorldVariables worldVariables = (WorldVariables)savedData;
                        worldVariables.read(nbt);
                    }
                }
            }
        }

        public SavedDataSyncMessage(int type, SavedData data) {
            this.type = type;
            this.data = data;
        }

        public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
            buffer.writeInt(message.type);
            if (message.data != null) {
                buffer.m_130079_(message.data.m_7176_(new CompoundTag()));
            }
        }

        public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
            NetworkEvent.Context context = contextSupplier.get();
            context.enqueueWork(() -> {
                if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
                    if (message.type == 0) {
                        MapVariables.clientSide = (MapVariables)message.data;
                    } else {
                        WorldVariables.clientSide = (WorldVariables)message.data;
                    }
                }
            });
            context.setPacketHandled(true);
        }
    }

    public static class PlayerVariablesSyncMessage {
        private final PlayerVariables data;

        public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
            this.data = new PlayerVariables();
            this.data.readNBT((Tag)buffer.m_130260_());
        }

        public PlayerVariablesSyncMessage(PlayerVariables data) {
            this.data = data;
        }

        public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
            buffer.m_130079_((CompoundTag)message.data.writeNBT());
        }

        public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
            NetworkEvent.Context context = contextSupplier.get();
            context.enqueueWork(() -> {
                if (!context.getDirection().getReceptionSide().isServer()) {
                    PlayerVariables variables = (PlayerVariables)Minecraft.m_91087_().f_91074_.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new PlayerVariables());
                    variables.defence = message.data.defence;
                    variables.camerashake = message.data.camerashake;
                    variables.killcount = message.data.killcount;
                }
            });
            context.setPacketHandled(true);
        }
    }

    public static class PlayerVariables {
        public boolean defence = false;
        public double camerashake = 0.0;
        public double killcount = 0.0;

        public void syncPlayerVariables(Entity entity) {
            if (entity instanceof ServerPlayer) {
                ServerPlayer serverPlayer = (ServerPlayer)entity;
                UltimateskeletonsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), (Object)new PlayerVariablesSyncMessage(this));
            }
        }

        public Tag writeNBT() {
            CompoundTag nbt = new CompoundTag();
            nbt.m_128379_("defence", this.defence);
            nbt.m_128347_("camerashake", this.camerashake);
            nbt.m_128347_("killcount", this.killcount);
            return nbt;
        }

        public void readNBT(Tag tag) {
            CompoundTag nbt = (CompoundTag)tag;
            this.defence = nbt.m_128471_("defence");
            this.camerashake = nbt.m_128459_("camerashake");
            this.killcount = nbt.m_128459_("killcount");
        }
    }

    @Mod.EventBusSubscriber
    private static class PlayerVariablesProvider
    implements ICapabilitySerializable<Tag> {
        private final PlayerVariables playerVariables = new PlayerVariables();
        private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> this.playerVariables);

        private PlayerVariablesProvider() {
        }

        @SubscribeEvent
        public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
            if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer)) {
                event.addCapability(new ResourceLocation("ultimateskeletons", "player_variables"), (ICapabilityProvider)new PlayerVariablesProvider());
            }
        }

        public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
            return cap == PLAYER_VARIABLES_CAPABILITY ? this.instance.cast() : LazyOptional.empty();
        }

        public Tag serializeNBT() {
            return this.playerVariables.writeNBT();
        }

        public void deserializeNBT(Tag nbt) {
            this.playerVariables.readNBT(nbt);
        }
    }

    public static class MapVariables
    extends SavedData {
        public static final String DATA_NAME = "ultimateskeletons_mapvars";
        public boolean spawnquit = false;
        static MapVariables clientSide = new MapVariables();

        public static MapVariables load(CompoundTag tag) {
            MapVariables data = new MapVariables();
            data.read(tag);
            return data;
        }

        public void read(CompoundTag nbt) {
            this.spawnquit = nbt.m_128471_("spawnquit");
        }

        public CompoundTag m_7176_(CompoundTag nbt) {
            nbt.m_128379_("spawnquit", this.spawnquit);
            return nbt;
        }

        public void syncData(LevelAccessor world) {
            this.m_77762_();
            if (world instanceof Level && !world.m_5776_()) {
                UltimateskeletonsMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), (Object)new SavedDataSyncMessage(0, this));
            }
        }

        public static MapVariables get(LevelAccessor world) {
            if (world instanceof ServerLevelAccessor) {
                ServerLevelAccessor serverLevelAcc = (ServerLevelAccessor)world;
                return (MapVariables)serverLevelAcc.m_6018_().m_7654_().m_129880_(Level.f_46428_).m_8895_().m_164861_(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
            }
            return clientSide;
        }
    }

    public static class WorldVariables
    extends SavedData {
        public static final String DATA_NAME = "ultimateskeletons_worldvars";
        static WorldVariables clientSide = new WorldVariables();

        public static WorldVariables load(CompoundTag tag) {
            WorldVariables data = new WorldVariables();
            data.read(tag);
            return data;
        }

        public void read(CompoundTag nbt) {
        }

        public CompoundTag m_7176_(CompoundTag nbt) {
            return nbt;
        }

        public void syncData(LevelAccessor world) {
            Level level;
            this.m_77762_();
            if (world instanceof Level && !(level = (Level)world).m_5776_()) {
                UltimateskeletonsMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(() -> ((Level)level).m_46472_()), (Object)new SavedDataSyncMessage(1, this));
            }
        }

        public static WorldVariables get(LevelAccessor world) {
            if (world instanceof ServerLevel) {
                ServerLevel level = (ServerLevel)world;
                return (WorldVariables)level.m_8895_().m_164861_(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
            }
            return clientSide;
        }
    }

    @Mod.EventBusSubscriber
    public static class EventBusVariableHandlers {
        @SubscribeEvent
        public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
            if (!event.getEntity().m_9236_().m_5776_()) {
                ((PlayerVariables)event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new PlayerVariables())).syncPlayerVariables((Entity)event.getEntity());
            }
        }

        @SubscribeEvent
        public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
            if (!event.getEntity().m_9236_().m_5776_()) {
                ((PlayerVariables)event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new PlayerVariables())).syncPlayerVariables((Entity)event.getEntity());
            }
        }

        @SubscribeEvent
        public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
            if (!event.getEntity().m_9236_().m_5776_()) {
                ((PlayerVariables)event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new PlayerVariables())).syncPlayerVariables((Entity)event.getEntity());
            }
        }

        @SubscribeEvent
        public static void clonePlayer(PlayerEvent.Clone event) {
            event.getOriginal().revive();
            PlayerVariables original = (PlayerVariables)event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new PlayerVariables());
            PlayerVariables clone = (PlayerVariables)event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse((Object)new PlayerVariables());
            if (!event.isWasDeath()) {
                clone.defence = original.defence;
                clone.camerashake = original.camerashake;
                clone.killcount = original.killcount;
            }
        }

        @SubscribeEvent
        public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
            if (!event.getEntity().m_9236_().m_5776_()) {
                MapVariables mapdata = MapVariables.get((LevelAccessor)event.getEntity().m_9236_());
                WorldVariables worlddata = WorldVariables.get((LevelAccessor)event.getEntity().m_9236_());
                if (mapdata != null) {
                    UltimateskeletonsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getEntity()), (Object)new SavedDataSyncMessage(0, mapdata));
                }
                if (worlddata != null) {
                    UltimateskeletonsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getEntity()), (Object)new SavedDataSyncMessage(1, worlddata));
                }
            }
        }

        @SubscribeEvent
        public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
            WorldVariables worlddata;
            if (!event.getEntity().m_9236_().m_5776_() && (worlddata = WorldVariables.get((LevelAccessor)event.getEntity().m_9236_())) != null) {
                UltimateskeletonsMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer)event.getEntity()), (Object)new SavedDataSyncMessage(1, worlddata));
            }
        }
    }
}

