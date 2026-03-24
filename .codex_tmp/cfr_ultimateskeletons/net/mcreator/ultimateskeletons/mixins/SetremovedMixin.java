/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.Level
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.mcreator.ultimateskeletons.mixins;

import net.mcreator.ultimateskeletons.Titangodentity;
import net.mcreator.ultimateskeletons.entity.StarlightDeathEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={LivingEntity.class})
public abstract class SetremovedMixin {
    @Inject(method={"tickDeath"}, at={@At(value="HEAD")}, cancellable=true)
    private void Death(CallbackInfo ci) {
        Titangodentity dem;
        Entity e = (Entity)this;
        Level world = e.m_9236_();
        boolean loop = false;
        double x = e.m_20185_();
        double y = e.m_20186_();
        double z = e.m_20189_();
        if (e instanceof Titangodentity && (double)(dem = (Titangodentity)e).m_21223_() > 0.1) {
            ci.cancel();
        }
        if (e instanceof StarlightDeathEntity) {
            StarlightDeathEntity starlightDeath = (StarlightDeathEntity)e;
            if (!starlightDeath.weak) {
                ci.cancel();
            }
        }
    }
}

