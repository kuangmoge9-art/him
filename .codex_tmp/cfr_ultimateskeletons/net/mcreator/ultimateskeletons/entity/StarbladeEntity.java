/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.network.protocol.Packet
 *  net.minecraft.network.protocol.game.ClientGamePacketListener
 *  net.minecraft.resources.ResourceLocation
 *  net.minecraft.sounds.SoundEvent
 *  net.minecraft.sounds.SoundSource
 *  net.minecraft.util.RandomSource
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.projectile.AbstractArrow
 *  net.minecraft.world.entity.projectile.ItemSupplier
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 */
package net.mcreator.ultimateskeletons.entity;

import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModItems;
import net.mcreator.ultimateskeletons.procedures.BladeshockProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

@OnlyIn(value=Dist.CLIENT, _interface=ItemSupplier.class)
public class StarbladeEntity
extends AbstractArrow
implements ItemSupplier {
    private int age;
    private int ingroundTime;
    public static final ItemStack PROJECTILE_ITEM = new ItemStack((ItemLike)UltimateskeletonsModItems.SPAWNSTARRIVERSKELETON.get());

    public StarbladeEntity(PlayMessages.SpawnEntity packet, Level world) {
        super((EntityType)UltimateskeletonsModEntities.STARBLADE.get(), world);
    }

    public StarbladeEntity(EntityType<? extends StarbladeEntity> type, Level world) {
        super(type, world);
    }

    public StarbladeEntity(EntityType<? extends StarbladeEntity> type, double x, double y, double z, Level world) {
        super(type, x, y, z, world);
    }

    public StarbladeEntity(EntityType<? extends StarbladeEntity> type, LivingEntity entity, Level world) {
        super(type, entity, world);
    }

    public Packet<ClientGamePacketListener> m_5654_() {
        return NetworkHooks.getEntitySpawningPacket((Entity)this);
    }

    @OnlyIn(value=Dist.CLIENT)
    public ItemStack m_7846_() {
        return PROJECTILE_ITEM;
    }

    protected ItemStack m_7941_() {
        return PROJECTILE_ITEM;
    }

    protected void m_7761_(LivingEntity entity) {
        super.m_7761_(entity);
        entity.m_21317_(entity.m_21234_() - 1);
    }

    public void m_8119_() {
        ++this.age;
        super.m_8119_();
        if (this.f_36703_) {
            ++this.ingroundTime;
        }
        if (this.ingroundTime > 20) {
            this.m_142687_(Entity.RemovalReason.DISCARDED);
        }
        if (this.ingroundTime == 19) {
            BladeshockProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_(), (Entity)this);
        }
    }

    public static StarbladeEntity shoot(Level world, LivingEntity entity, RandomSource source) {
        return StarbladeEntity.shoot(world, entity, source, 1.0f, 5.0, 5);
    }

    public static StarbladeEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
        StarbladeEntity entityarrow = new StarbladeEntity((EntityType<? extends StarbladeEntity>)((EntityType)UltimateskeletonsModEntities.STARBLADE.get()), entity, world);
        entityarrow.m_6686_(entity.m_20252_((float)1.0f).f_82479_, entity.m_20252_((float)1.0f).f_82480_, entity.m_20252_((float)1.0f).f_82481_, power * 2.0f, 0.0f);
        entityarrow.m_20225_(true);
        entityarrow.m_36762_(false);
        entityarrow.m_36781_(damage);
        entityarrow.m_36735_(knockback);
        world.m_7967_((Entity)entityarrow);
        world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0f, 1.0f / (random.m_188501_() * 0.5f + 1.0f) + power / 2.0f);
        return entityarrow;
    }

    public static StarbladeEntity shoot(LivingEntity entity, LivingEntity target) {
        StarbladeEntity entityarrow = new StarbladeEntity((EntityType<? extends StarbladeEntity>)((EntityType)UltimateskeletonsModEntities.STARBLADE.get()), entity, entity.m_9236_());
        double dx = target.m_20185_() - entity.m_20185_();
        double dy = target.m_20186_() + (double)target.m_20192_() - 1.1;
        double dz = target.m_20189_() - entity.m_20189_();
        entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * (double)0.2f, dz, 2.0f, 12.0f);
        entityarrow.m_20225_(true);
        entityarrow.m_36781_(5.0);
        entityarrow.m_36735_(5);
        entityarrow.m_36762_(false);
        entity.m_9236_().m_7967_((Entity)entityarrow);
        entity.m_9236_().m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0f, 1.0f / (RandomSource.m_216327_().m_188501_() * 0.5f + 1.0f));
        return entityarrow;
    }
}

