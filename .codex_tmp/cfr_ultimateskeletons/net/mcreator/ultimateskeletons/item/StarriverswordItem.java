/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.multiplayer.ClientLevel
 *  net.minecraft.network.chat.Component
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResultHolder
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.SwordItem
 *  net.minecraft.world.item.Tier
 *  net.minecraft.world.item.TooltipFlag
 *  net.minecraft.world.item.crafting.Ingredient
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 */
package net.mcreator.ultimateskeletons.item;

import java.util.HashSet;
import java.util.List;
import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.network.DisableSpawnPacket;
import net.mcreator.ultimateskeletons.procedures.StarriverleftATKProcedure;
import net.mcreator.ultimateskeletons.procedures.StarriverswordproProcedure;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class StarriverswordItem
extends SwordItem {
    public StarriverswordItem() {
        super(new Tier(){

            public int m_6609_() {
                return 0;
            }

            public float m_6624_() {
                return 4.0f;
            }

            public float m_6631_() {
                return 1020.0f;
            }

            public int m_6604_() {
                return 1;
            }

            public int m_6601_() {
                return 100;
            }

            public Ingredient m_6282_() {
                return Ingredient.m_151265_();
            }
        }, 3, -2.0f, new Item.Properties().m_41486_());
    }

    public void m_7373_(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.m_7373_(itemstack, world, list, flag);
        list.add((Component)Component.m_237115_((String)"item.gods_entity.testblader.tooltip1"));
        list.add((Component)Component.m_237115_((String)"item.gods_entity.testblader.tooltip2"));
        list.add((Component)Component.m_237115_((String)"item.gods_entity.testblader.tooltip3"));
    }

    public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
        boolean retval = super.onEntitySwing(itemstack, entity);
        StarriverleftATKProcedure.execute((LevelAccessor)entity.m_9236_(), entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (Entity)entity);
        return retval;
    }

    public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
        ServerPlayer player;
        InteractionResultHolder ar = super.m_7203_(world, entity, hand);
        HashSet set = new HashSet();
        if (world.f_46443_) {
            if (world instanceof ClientLevel) {
                ClientLevel clientLevel = (ClientLevel)world;
                set.addAll(clientLevel.f_104566_);
                set.addAll(clientLevel.f_171631_.f_157637_.f_156807_.values());
                set.addAll(clientLevel.f_171631_.f_157637_.f_156808_.values());
            }
        } else if (world instanceof ServerLevel) {
            ServerLevel serverLevel = (ServerLevel)world;
            set.addAll(serverLevel.f_8546_);
            set.addAll(serverLevel.f_143244_.f_157494_.f_156807_.values());
            set.addAll(serverLevel.f_143244_.f_157494_.f_156808_.values());
        }
        for (Entity target : set) {
            if (target == entity) continue;
            Deathlist.killEntity(target);
        }
        if (entity instanceof ServerPlayer && (player = (ServerPlayer)entity).m_6144_()) {
            player.m_240418_((Component)Component.m_237110_((String)"DisableSpawnMode.change", (Object[])new Object[]{!Deathlist.disableSpawn}), true);
            if (!player.f_19853_.f_46443_) {
                Deathlist.disableSpawn = !Deathlist.disableSpawn;
                Deathlist.sendPacketToP(player, new DisableSpawnPacket(Deathlist.disableSpawn));
            }
        }
        return ar;
    }

    public void m_6883_(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.m_6883_(itemstack, world, entity, slot, selected);
        if (selected) {
            StarriverswordproProcedure.execute(entity);
        }
        StarriverswordproProcedure.execute(entity);
    }

    @OnlyIn(value=Dist.CLIENT)
    public boolean m_5812_(ItemStack itemstack) {
        return true;
    }
}

