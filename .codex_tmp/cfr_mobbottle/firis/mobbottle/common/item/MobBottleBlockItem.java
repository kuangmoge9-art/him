/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.ChatFormatting
 *  net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.nbt.Tag
 *  net.minecraft.network.chat.Component
 *  net.minecraft.network.chat.MutableComponent
 *  net.minecraft.server.level.ServerLevel
 *  net.minecraft.world.InteractionHand
 *  net.minecraft.world.InteractionResult
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.BlockItem
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.TooltipFlag
 *  net.minecraft.world.item.context.UseOnContext
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.block.Block
 *  net.minecraftforge.client.extensions.common.IClientItemExtensions
 */
package firis.mobbottle.common.item;

import firis.mobbottle.client.renderer.MobBottleBlockEntityWithoutLevelRenderer;
import firis.mobbottle.common.helper.FirisEntityHelper;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.ChatFormatting;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

public class MobBottleBlockItem
extends BlockItem {
    public MobBottleBlockItem(Block block) {
        super(block, new Item.Properties().m_41487_(1));
    }

    public InteractionResult m_6225_(UseOnContext context) {
        if (!context.m_43723_().m_6144_()) {
            Entity entity;
            ItemStack stack = context.m_43722_();
            if (!this.isCatchMobBottle(stack) && (entity = FirisEntityHelper.createEntityFromTag(stack.m_41783_().m_128469_("mob"), context.m_43725_())) != null) {
                entity.m_20219_(context.m_43720_());
                if (context.m_43725_() instanceof ServerLevel) {
                    ((ServerLevel)context.m_43725_()).m_47205_(entity);
                }
                stack.m_41751_(null);
            }
            return InteractionResult.SUCCESS;
        }
        return super.m_6225_(context);
    }

    public InteractionResult m_6880_(ItemStack stack, Player player, LivingEntity livingEntity, InteractionHand hand) {
        this.catchMobBottle(player, (Entity)livingEntity, hand);
        return InteractionResult.SUCCESS;
    }

    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        this.catchMobBottle(player, entity, InteractionHand.MAIN_HAND);
        return true;
    }

    protected boolean catchMobBottle(Player player, Entity entity, InteractionHand hand) {
        ItemStack handStack = player.m_21120_(hand);
        if (!this.isCatchMobBottle(handStack)) {
            return false;
        }
        if (entity.m_20202_() != null) {
            return false;
        }
        CompoundTag mobTag = FirisEntityHelper.createTagFromEntity(entity);
        String mobName = entity.m_5446_().getString();
        CompoundTag stackTag = handStack.m_41784_();
        stackTag.m_128365_("mob", (Tag)mobTag);
        stackTag.m_128359_("mob_name", mobName);
        entity.m_142687_(Entity.RemovalReason.UNLOADED_WITH_PLAYER);
        return true;
    }

    protected boolean isCatchMobBottle(ItemStack stack) {
        return stack.m_41737_("mob") == null;
    }

    public boolean m_5812_(ItemStack stack) {
        return stack.m_41782_() && stack.m_41783_().m_128441_("mob");
    }

    public Component m_7626_(ItemStack stack) {
        MutableComponent component = Component.m_237115_((String)this.m_5671_(stack));
        String mobName = stack.m_41784_().m_128461_("mob_name");
        if (!"".equals(mobName)) {
            component = Component.m_237115_((String)(component.getString() + "  " + mobName));
        }
        return component;
    }

    public void m_7373_(ItemStack stack, @Nullable Level level, List<Component> listComponent, TooltipFlag tooltipFlag) {
        String mobName = stack.m_41784_().m_128461_("mob_name");
        if (!"".equals(mobName)) {
            listComponent.add((Component)Component.m_237110_((String)"info.mobbottle.mob_bottle_in", (Object[])new Object[]{mobName}).m_130940_(ChatFormatting.DARK_AQUA));
        } else {
            listComponent.add((Component)Component.m_237115_((String)"info.mobbottle.mob_bottle").m_130940_(ChatFormatting.LIGHT_PURPLE));
        }
    }

    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions(){
            private final MobBottleBlockEntityWithoutLevelRenderer renderer = new MobBottleBlockEntityWithoutLevelRenderer();

            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return this.renderer;
            }
        });
    }
}

