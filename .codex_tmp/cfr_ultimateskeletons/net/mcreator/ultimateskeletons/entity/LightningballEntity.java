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
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.entity.projectile.AbstractArrow
 *  net.minecraft.world.entity.projectile.ItemSupplier
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.item.Items
 *  net.minecraft.world.level.ItemLike
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.LevelAccessor
 *  net.minecraft.world.phys.EntityHitResult
 *  net.minecraftforge.api.distmarker.Dist
 *  net.minecraftforge.api.distmarker.OnlyIn
 *  net.minecraftforge.network.NetworkHooks
 *  net.minecraftforge.network.PlayMessages$SpawnEntity
 *  net.minecraftforge.registries.ForgeRegistries
 *  org.joml.Vector3f
 */
package net.mcreator.ultimateskeletons.entity;

import net.mcreator.ultimateskeletons.MathUtils;
import net.mcreator.ultimateskeletons.entity.GhostlightningEntity;
import net.mcreator.ultimateskeletons.init.UltimateskeletonsModEntities;
import net.mcreator.ultimateskeletons.procedures.LightningballATKProcedure;
import net.mcreator.ultimateskeletons.procedures.LightningballalwaysProcedure;
import net.mcreator.ultimateskeletons.procedures.LightningballlightningProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import org.joml.Vector3f;

@OnlyIn(value=Dist.CLIENT, _interface=ItemSupplier.class)
public class LightningballEntity
extends AbstractArrow
implements ItemSupplier {
    public static final ItemStack PROJECTILE_ITEM = new ItemStack((ItemLike)Items.f_42452_);
    public int age;
    public int thundertick;
    private int lightningSeed = 0;

    public LightningballEntity(PlayMessages.SpawnEntity packet, Level world) {
        super((EntityType)UltimateskeletonsModEntities.LIGHTNINGBALL.get(), world);
    }

    public LightningballEntity(EntityType<? extends LightningballEntity> type, Level world) {
        super(type, world);
    }

    public LightningballEntity(EntityType<? extends LightningballEntity> type, double x, double y, double z, Level world) {
        super(type, x, y, z, world);
    }

    public LightningballEntity(EntityType<? extends LightningballEntity> type, LivingEntity entity, Level world) {
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

    public void m_6123_(Player entity) {
        super.m_6123_(entity);
        LightningballATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_());
    }

    public void m_5790_(EntityHitResult entityHitResult) {
        super.m_5790_(entityHitResult);
        LightningballATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_());
    }

    public void m_8119_() {
        super.m_8119_();
        LightningballalwaysProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_());
        ++this.age;
        ++this.thundertick;
        this.m_20242_(true);
        if (this.thundertick == 20) {
            this.thundertick = 0;
            LightningballlightningProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_());
        }
        if (!this.m_9236_().m_5776_()) {
            this.lightningAura();
            this.lightningAura2();
        } else if (this.f_19797_ % 2 == 0) {
            ++this.lightningSeed;
        }
        if (this.f_36703_) {
            LightningballATKProcedure.execute((LevelAccessor)this.m_9236_(), this.m_20185_(), this.m_20186_(), this.m_20189_());
            this.m_146870_();
        }
        if (this.age >= 200) {
            this.m_146870_();
        }
    }

    private void lightningAura() {
        float radius = 5.0f;
        for (int i = 0; i < 2; ++i) {
            GhostlightningEntity lightning = new GhostlightningEntity((EntityType<? extends Entity>)((EntityType)UltimateskeletonsModEntities.GHOSTLIGHTNING.get()), this.m_9236_());
            lightning.m_20088_().m_135381_(GhostlightningEntity.isFromSky, (Object)true);
            lightning.m_20088_().m_135381_(GhostlightningEntity.colour, (Object)new Vector3f(150.0f, 1.0f, 180.0f));
            lightning.m_20088_().m_135381_(GhostlightningEntity.size, (Object)Float.valueOf(MathUtils.randFloat(0.008f, 0.08f)));
            lightning.m_20088_().m_135381_(GhostlightningEntity.rotation, (Object)new Vector3f(MathUtils.randFloat(0.0f, 360.0f), MathUtils.randFloat(0.0f, 360.0f), MathUtils.randFloat(0.0f, 360.0f)));
            lightning.m_20219_(this.m_20182_().m_82520_(MathUtils.randDouble(-radius, radius), MathUtils.randDouble(-radius, radius), MathUtils.randDouble(-radius, radius)).m_82520_(0.0, (double)(this.m_20206_() / 2.0f), 0.0));
            this.m_9236_().m_7967_((Entity)lightning);
        }
    }

    private void lightningAura2() {
        float radius = 2.0f;
        for (int i = 0; i < 2; ++i) {
            GhostlightningEntity lightning = new GhostlightningEntity((EntityType<? extends Entity>)((EntityType)UltimateskeletonsModEntities.GHOSTLIGHTNING.get()), this.m_9236_());
            lightning.m_20088_().m_135381_(GhostlightningEntity.isFromSky, (Object)true);
            lightning.m_20088_().m_135381_(GhostlightningEntity.colour, (Object)new Vector3f(150.0f, 1.0f, 180.0f));
            lightning.m_20088_().m_135381_(GhostlightningEntity.size, (Object)Float.valueOf(MathUtils.randFloat(0.002f, 0.04f)));
            lightning.m_20088_().m_135381_(GhostlightningEntity.rotation, (Object)new Vector3f(MathUtils.randFloat(0.0f, 360.0f), MathUtils.randFloat(0.0f, 360.0f), MathUtils.randFloat(0.0f, 360.0f)));
            lightning.m_20219_(this.m_20182_().m_82520_(MathUtils.randDouble(-radius, radius), MathUtils.randDouble(-radius, radius), MathUtils.randDouble(-radius, radius)).m_82520_(0.0, (double)(this.m_20206_() / 2.0f), 0.0));
            this.m_9236_().m_7967_((Entity)lightning);
        }
    }

    public static LightningballEntity shoot(Level world, LivingEntity entity, RandomSource source) {
        return LightningballEntity.shoot(world, entity, source, 1.0f, 5.0, 5);
    }

    public static LightningballEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
        LightningballEntity entityarrow = new LightningballEntity((EntityType<? extends LightningballEntity>)((EntityType)UltimateskeletonsModEntities.LIGHTNINGBALL.get()), entity, world);
        entityarrow.m_6686_(entity.m_20252_((float)1.0f).f_82479_, entity.m_20252_((float)1.0f).f_82480_, entity.m_20252_((float)1.0f).f_82481_, power * 2.0f, 0.0f);
        entityarrow.m_20225_(true);
        entityarrow.m_36762_(false);
        entityarrow.m_36781_(damage);
        entityarrow.m_36735_(knockback);
        world.m_7967_((Entity)entityarrow);
        world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.PLAYERS, 1.0f, 1.0f / (random.m_188501_() * 0.5f + 1.0f) + power / 2.0f);
        return entityarrow;
    }

    public static LightningballEntity shoot(LivingEntity entity, LivingEntity target) {
        LightningballEntity entityarrow = new LightningballEntity((EntityType<? extends LightningballEntity>)((EntityType)UltimateskeletonsModEntities.LIGHTNINGBALL.get()), entity, entity.m_9236_());
        double dx = target.m_20185_() - entity.m_20185_();
        double dy = target.m_20186_() + (double)target.m_20192_() - 1.1;
        double dz = target.m_20189_() - entity.m_20189_();
        entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * (double)0.2f, dz, 2.0f, 12.0f);
        entityarrow.m_20225_(true);
        entityarrow.m_36781_(5.0);
        entityarrow.m_36735_(5);
        entityarrow.m_36762_(false);
        entity.m_9236_().m_7967_((Entity)entityarrow);
        entity.m_9236_().m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ultimateskeletons:lightningthrow")), SoundSource.PLAYERS, 1.0f, 1.0f / (RandomSource.m_216327_().m_188501_() * 0.5f + 1.0f));
        return entityarrow;
    }
}

