package com.himdev.him.gametest;

import com.himdev.him.HimMod;
import com.himdev.him.entity.HimEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.gametest.framework.GameTest;
import net.minecraft.gametest.framework.GameTestAssertException;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.gametest.GameTestHolder;
import net.minecraftforge.gametest.PrefixGameTestTemplate;
import net.minecraftforge.registries.ForgeRegistries;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@GameTestHolder(HimMod.MOD_ID)
@PrefixGameTestTemplate(false)
public final class MobBottleCompatGameTests {
    private static final ResourceLocation MOB_BOTTLE_ITEM_ID = ResourceLocation.fromNamespaceAndPath("mobbottle", "mob_bottle");
    private static final ResourceLocation MOB_BOTTLE_EMPTY_ITEM_ID = ResourceLocation.fromNamespaceAndPath("mobbottle", "mob_bottle_empty");
    private static final ResourceLocation HIM_ENTITY_ID = ResourceLocation.fromNamespaceAndPath(HimMod.MOD_ID, "him");

    private MobBottleCompatGameTests() {
    }

    @GameTest(template = "empty", batch = "him_mobbottle_capture", timeoutTicks = 120)
    public static void mobBottleCannotCaptureHim(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        HimEntity him = HimEntity.spawnForTest(level, helper.absolutePos(BlockPos.ZERO));
        him.setNoAi(true);
        him.setNoGravity(true);
        him.setDeltaMovement(Vec3.ZERO);

        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(1, 0, 0));
        Item mobBottleItem = getRequiredItem(MOB_BOTTLE_ITEM_ID);
        ItemStack bottleStack = new ItemStack(mobBottleItem);
        player.setItemInHand(InteractionHand.MAIN_HAND, bottleStack);

        invokeMobBottleLeftClick(player.getMainHandItem(), player, him);

        helper.runAfterDelay(2, () -> {
            ItemStack handStack = player.getMainHandItem();
            if (!him.isAlive() || him.isRemoved() || level.getEntity(him.getUUID()) != him) {
                throw new GameTestAssertException("Expected MobBottle to leave Him alive and present after capture attempt");
            }
            if (handStack.getItem() != mobBottleItem) {
                throw new GameTestAssertException("Expected failed MobBottle capture to leave the original bottle item in hand");
            }
            if (handStack.getTagElement("mob") != null) {
                throw new GameTestAssertException("Expected failed MobBottle capture to leave no mob NBT in the held bottle");
            }
            HimTestState.removeHimForTest(helper, him);
            player.remove(Entity.RemovalReason.DISCARDED);
            helper.succeed();
        });
    }

    @GameTest(template = "empty", batch = "him_mobbottle_release", timeoutTicks = 120)
    public static void himTaggedMobBottlePurifiesInsteadOfSpawningHim(GameTestHelper helper) {
        HimTestState.resetUniqueHim(helper);
        ServerLevel level = helper.getLevel();
        Player player = TestPlayers.spawnSurvivalPlayer(helper, new BlockPos(2, 0, 0));
        Item mobBottleItem = getRequiredItem(MOB_BOTTLE_ITEM_ID);
        Item emptyBottleItem = getRequiredItem(MOB_BOTTLE_EMPTY_ITEM_ID);

        ItemStack bottleStack = new ItemStack(mobBottleItem);
        bottleStack.getOrCreateTag().put("mob", himEntityTag());
        bottleStack.getOrCreateTag().putString("mob_name", "Him");
        player.setItemInHand(InteractionHand.MAIN_HAND, bottleStack);

        BlockPos targetPos = helper.absolutePos(new BlockPos(3, 0, 0));
        BlockHitResult hitResult = new BlockHitResult(Vec3.atCenterOf(targetPos), Direction.UP, targetPos, false);
        invokeMobBottleUseOn(player.getMainHandItem(), new UseOnContext(player, InteractionHand.MAIN_HAND, hitResult));

        helper.runAfterDelay(2, () -> {
            ItemStack handStack = player.getMainHandItem();
            long himCount = level.getEntitiesOfClass(HimEntity.class, new AABB(targetPos).inflate(16.0D)).size();
            if (handStack.getItem() != emptyBottleItem) {
                throw new GameTestAssertException("Expected Him-filled MobBottle to purify into mob_bottle_empty on use");
            }
            if (handStack.getTagElement("mob") != null) {
                throw new GameTestAssertException("Expected purified MobBottle to have no mob NBT");
            }
            if (himCount != 0L) {
                throw new GameTestAssertException("Expected Him-filled MobBottle use to spawn no Him entities, found " + himCount);
            }
            player.remove(Entity.RemovalReason.DISCARDED);
            helper.succeed();
        });
    }

    private static CompoundTag himEntityTag() {
        CompoundTag tag = new CompoundTag();
        tag.putString("id", HIM_ENTITY_ID.toString());
        return tag;
    }

    private static Item getRequiredItem(ResourceLocation itemId) {
        Item item = ForgeRegistries.ITEMS.getValue(itemId);
        if (item == null) {
            throw new GameTestAssertException("Expected registered item " + itemId + " to be available during MobBottle compatibility test");
        }
        return item;
    }

    private static void invokeMobBottleLeftClick(ItemStack stack, Player player, Entity target) {
        try {
            Method onLeftClickEntity = stack.getItem().getClass().getMethod("onLeftClickEntity", ItemStack.class, Player.class, Entity.class);
            onLeftClickEntity.invoke(stack.getItem(), stack, player, target);
        } catch (NoSuchMethodException | IllegalAccessException exception) {
            throw new GameTestAssertException("Unable to invoke MobBottleBlockItem.onLeftClickEntity(...): " + exception);
        } catch (InvocationTargetException exception) {
            Throwable cause = exception.getCause() != null ? exception.getCause() : exception;
            throw new GameTestAssertException("MobBottleBlockItem.onLeftClickEntity(...) threw: " + cause);
        }
    }

    private static void invokeMobBottleUseOn(ItemStack stack, UseOnContext context) {
        Method useOn = findUseOnMethod(stack.getItem().getClass());
        try {
            useOn.invoke(stack.getItem(), context);
        } catch (IllegalAccessException exception) {
            throw new GameTestAssertException("Unable to access MobBottleBlockItem useOn(...): " + exception);
        } catch (InvocationTargetException exception) {
            Throwable cause = exception.getCause() != null ? exception.getCause() : exception;
            throw new GameTestAssertException("MobBottleBlockItem useOn(...) threw: " + cause);
        }
    }

    private static Method findUseOnMethod(Class<?> itemClass) {
        try {
            return itemClass.getMethod("useOn", UseOnContext.class);
        } catch (NoSuchMethodException ignored) {
        }
        try {
            return itemClass.getMethod("m_6225_", UseOnContext.class);
        } catch (NoSuchMethodException exception) {
            throw new GameTestAssertException("Unable to resolve MobBottleBlockItem useOn signature: " + exception);
        }
    }
}
