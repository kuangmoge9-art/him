/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.server.level.ServerPlayer
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResultHolder
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.AbstractArrow$Pickup
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.ProjectileWeaponItem
 *  net.minecraft.world.item.Rarity
 *  net.minecraft.world.item.UseAnim
 *  net.minecraft.world.level.Level
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 */
package net.mcreator.ultimateskeletons.item;

import net.mcreator.ultimateskeletons.entity.SlimelaunchEntity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SpawnslimeItem
extends Item {
    public SpawnslimeItem() {
        super(new Item.Properties().m_41487_(64).m_41497_(Rarity.COMMON));
    }

    public UseAnim m_6164_(ItemStack itemstack) {
        return UseAnim.BOW;
    }

    public int m_8105_(ItemStack itemstack) {
        return 72000;
    }

    @OnlyIn(value=Dist.CLIENT)
    public boolean m_5812_(ItemStack itemstack) {
        return true;
    }

    public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder ar = InteractionResultHolder.m_19100_((Object)entity.m_21120_(hand));
        if (entity.m_150110_().f_35937_ || this.findAmmo(entity) != ItemStack.f_41583_) {
            ar = InteractionResultHolder.m_19090_((Object)entity.m_21120_(hand));
            entity.m_6672_(hand);
        }
        return ar;
    }

    public void m_5929_(Level world, LivingEntity entity, ItemStack itemstack, int count) {
        if (!world.m_5776_() && entity instanceof ServerPlayer) {
            ServerPlayer player = (ServerPlayer)entity;
            ItemStack stack = this.findAmmo((Player)player);
            if (player.m_150110_().f_35937_ || stack != ItemStack.f_41583_) {
                SlimelaunchEntity projectile = SlimelaunchEntity.shoot(world, entity, world.m_213780_());
                if (player.m_150110_().f_35937_) {
                    projectile.f_36705_ = AbstractArrow.Pickup.CREATIVE_ONLY;
                } else if (stack.m_41763_()) {
                    if (stack.m_220157_(1, world.m_213780_(), player)) {
                        stack.m_41774_(1);
                        stack.m_41721_(0);
                        if (stack.m_41619_()) {
                            player.m_150109_().m_36057_(stack);
                        }
                    }
                } else {
                    stack.m_41774_(1);
                    if (stack.m_41619_()) {
                        player.m_150109_().m_36057_(stack);
                    }
                }
            }
            entity.m_21253_();
        }
    }

    private ItemStack findAmmo(Player player) {
        ItemStack stack = ProjectileWeaponItem.m_43010_((LivingEntity)player, e -> e.m_41720_() == SlimelaunchEntity.PROJECTILE_ITEM.m_41720_());
        if (stack == ItemStack.f_41583_) {
            for (int i = 0; i < player.m_150109_().f_35974_.size(); ++i) {
                ItemStack teststack = (ItemStack)player.m_150109_().f_35974_.get(i);
                if (teststack == null || teststack.m_41720_() != SlimelaunchEntity.PROJECTILE_ITEM.m_41720_()) continue;
                stack = teststack;
                break;
            }
        }
        return stack;
    }
}

