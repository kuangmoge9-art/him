/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResultHolder
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.ultimateskeletons.item;

import net.mcreator.ultimateskeletons.Deathlist;
import net.mcreator.ultimateskeletons.procedures.ClearATKProcedure;
import net.mcreator.ultimateskeletons.procedures.ClearclearProcedure;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class ClearItem
extends Item {
    public ClearItem() {
        super(new Item.Properties().m_41487_(64).m_41497_(Rarity.COMMON));
    }

    public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder ar = super.m_7203_(world, entity, hand);
        ClearclearProcedure.execute((LevelAccessor)world, entity.m_20185_(), entity.m_20186_(), entity.m_20189_());
        return ar;
    }

    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if (entity instanceof LivingEntity) {
            LivingEntity living = (LivingEntity)entity;
            Deathlist.killEntity((Entity)living);
        }
        return super.onLeftClickEntity(stack, player, entity);
    }

    public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
        boolean retval = super.onEntitySwing(itemstack, entity);
        ClearATKProcedure.execute((LevelAccessor)entity.m_9236_(), entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (Entity)entity);
        return retval;
    }
}

