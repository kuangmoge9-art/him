/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.entity.PathfinderMob
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  net.minecraftforge.registries.ForgeRegistries
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.mcreator.ultimateskeletons.mixins;

import net.mcreator.ultimateskeletons.AnimatedEntity;
import net.mcreator.ultimateskeletons.Deathgodentity;
import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.entity.StarlightskeletonEntity;
import net.mcreator.ultimateskeletons.entity.StarskeletonEntity;
import net.mcreator.ultimateskeletons.entity.UltimatedeathskullEntity;
import net.mcreator.ultimateskeletons.entity.WitherskeletontemplarEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Entity.class})
public abstract class EntitysMixin {
    @Shadow
    private Level f_19853_;

    @Shadow
    public abstract double m_20185_();

    @Shadow
    public abstract double m_20186_();

    @Shadow
    public abstract double m_20189_();

    @Inject(method={"setRemoved"}, at={@At(value="HEAD")}, cancellable=true)
    private void setRemoved(Entity.RemovalReason pRemovalReason, CallbackInfo ci) {
        PathfinderMob dem;
        Entity e = (Entity)this;
        Level world = e.m_9236_();
        boolean loop = false;
        double x = e.m_20185_();
        double y = e.m_20186_();
        double z = e.m_20189_();
        if (e instanceof Titangodentity && (double)(dem = (Titangodentity)e).m_21223_() > 0.1) {
            if (world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)200.0, (double)200.0, (double)200.0), p -> true).isEmpty()) {
                if (!e.m_9236_().f_46443_) {
                    ci.cancel();
                }
            } else {
                ci.cancel();
            }
        }
        if (e instanceof UltimatedeathskullEntity && (double)(dem = (UltimatedeathskullEntity)e).m_21223_() > 0.1) {
            if (UltimatedeathskullEntity.def) {
                ci.cancel();
            } else if (!e.m_9236_().f_46443_) {
                ci.cancel();
            }
        }
        if (e instanceof WitherskeletontemplarEntity && (double)(dem = (WitherskeletontemplarEntity)e).m_21223_() > 0.1) {
            if (world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)100.0, (double)100.0, (double)100.0), p -> true).isEmpty()) {
                if (!e.m_9236_().f_46443_) {
                    ci.cancel();
                }
            } else {
                ci.cancel();
            }
        }
        if (e instanceof StarskeletonEntity && (double)(dem = (StarskeletonEntity)e).m_21223_() > 0.1) {
            if (world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)100.0, (double)100.0, (double)100.0), p -> true).isEmpty()) {
                if (!e.m_9236_().f_46443_) {
                    ci.cancel();
                }
            } else {
                ci.cancel();
            }
        }
        if (e instanceof StarlightskeletonEntity && (double)(dem = (StarlightskeletonEntity)e).m_21223_() > 0.1) {
            if (world.m_6443_(Player.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)100.0, (double)100.0, (double)100.0), p -> true).isEmpty()) {
                if (!e.m_9236_().f_46443_) {
                    ci.cancel();
                }
            } else {
                ci.cancel();
            }
        }
    }

    @Inject(method={"isRemoved"}, at={@At(value="HEAD")}, cancellable=true)
    private void isRemoved(CallbackInfoReturnable<Boolean> cir) {
        AnimatedEntity dem;
        Entity entity = (Entity)this;
        if (entity instanceof UltimatedeathskullEntity && (double)((Deathgodentity)(dem = (UltimatedeathskullEntity)entity)).m_21223_() > 0.1) {
            cir.setReturnValue((Object)false);
        }
        if ((entity = (Entity)this) instanceof Titangodentity && (double)((Titangodentity)(dem = (Titangodentity)entity)).m_21223_() > 0.1) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"setPosRaw"}, at={@At(value="HEAD")}, cancellable=true)
    private void setPosRaw(double P, double Py, double Pz, CallbackInfo info) {
        Entity e = (Entity)this;
        if (e instanceof Deathgodentity && !e.m_9236_().f_46443_ && e.m_20275_(0.0, 0.0, 0.0) != 0.0 && e.m_20275_(P, Py, Pz) >= 40000.0) {
            info.cancel();
        }
        if (e instanceof Titangodentity && !e.m_9236_().f_46443_ && e.m_20275_(0.0, 0.0, 0.0) != 0.0 && e.m_20275_(P, Py, Pz) >= 40000.0) {
            info.cancel();
        }
        if (e instanceof WitherskeletontemplarEntity && !e.m_9236_().f_46443_ && e.m_20275_(0.0, 0.0, 0.0) != 0.0 && e.m_20275_(P, Py, Pz) >= 40000.0) {
            info.cancel();
        }
        if (e instanceof StarskeletonEntity && !e.m_9236_().f_46443_ && e.m_20275_(0.0, 0.0, 0.0) != 0.0 && e.m_20275_(P, Py, Pz) >= 40000.0) {
            info.cancel();
        }
        if (e instanceof StarlightskeletonEntity && !e.m_9236_().f_46443_ && e.m_20275_(0.0, 0.0, 0.0) != 0.0 && e.m_20275_(P, Py, Pz) >= 40000.0) {
            info.cancel();
        }
        if (ForgeRegistries.ENTITY_TYPES.getKey((Object)e.m_6095_()).toString().equals("creeperrrrrr:creeper_1") && !e.m_9236_().f_46443_ && e.m_20275_(0.0, 0.0, 0.0) != 0.0 && e.m_20275_(P, Py, Pz) >= 40000.0) {
            info.cancel();
        }
    }
}

