/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.item.context.UseOnContext
 *  net.minecraft.world.level.LevelAccessor
 */
package net.mcreator.ultimateskeletons.item;

import net.mcreator.ultimateskeletons.procedures.SpawnstarpowerskeletonProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.LevelAccessor;

public class SpawnstarpowerskeletontitanItem
extends Item {
    public SpawnstarpowerskeletontitanItem() {
        super(new Item.Properties().m_41487_(64).m_41486_().m_41497_(Rarity.COMMON));
    }

    public InteractionResult m_6225_(UseOnContext context) {
        super.m_6225_(context);
        SpawnstarpowerskeletonProcedure.execute((LevelAccessor)context.m_43725_(), context.m_8083_().m_123341_(), context.m_8083_().m_123342_(), context.m_8083_().m_123343_());
        return InteractionResult.SUCCESS;
    }
}

