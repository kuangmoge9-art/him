/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.core.Holder
 *  net.minecraft.sounds.Music
 *  net.minecraft.sounds.Musics
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.level.Level
 *  net.minecraft.world.level.biome.Biome
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.mcreator.ultimateskeletons.mixins;

import java.util.List;
import javax.annotation.Nullable;
import net.mcreator.ultimateskeletons.ModMusics;
import net.mcreator.ultimateskeletons.entity.DangerEntity;
import net.mcreator.ultimateskeletons.entity.SolarskeletonEntity;
import net.mcreator.ultimateskeletons.entity.StarSpiritEntity;
import net.mcreator.ultimateskeletons.entity.StarlightDeathEntity;
import net.mcreator.ultimateskeletons.entity.StarlightfazhenEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.Holder;
import net.minecraft.sounds.Music;
import net.minecraft.sounds.Musics;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={Minecraft.class}, priority=-100)
public abstract class MinecraftMixin {
    @Shadow
    @Nullable
    public LocalPlayer f_91074_;
    @Shadow
    @Final
    public Gui f_91065_;

    @Inject(method={"Lnet/minecraft/client/Minecraft;getSituationalMusic()Lnet/minecraft/sounds/Music;"}, at={@At(value="HEAD")}, cancellable=true)
    private void ac_getSituationalMusic(CallbackInfoReturnable<Music> cir) {
        if (this.f_91074_ != null) {
            Level world = this.f_91074_.m_9236_();
            double x = this.f_91074_.m_20185_();
            double y = this.f_91074_.m_20186_();
            double z = this.f_91074_.m_20189_();
            List reachEntitiesList = this.f_91074_.m_9236_().m_6249_((Entity)this.f_91074_, new AABB(x - 256.0, y - 256.0, z - 256.0, x + 256.0, y + 256.0, z + 256.0), entity -> entity instanceof LivingEntity);
            for (Entity entity2 : reachEntitiesList) {
                if (!world.m_6443_(StarlightfazhenEntity.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)256.0, (double)256.0, (double)256.0), e -> true).isEmpty()) {
                    if (!(entity2 instanceof StarlightfazhenEntity)) continue;
                    StarlightfazhenEntity starlightfazhen = (StarlightfazhenEntity)entity2;
                    cir.setReturnValue((Object)ModMusics.Starlightspawnbgm);
                    continue;
                }
                if (!world.m_6443_(StarlightDeathEntity.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)256.0, (double)256.0, (double)256.0), e -> true).isEmpty()) {
                    if (!(entity2 instanceof StarlightDeathEntity)) continue;
                    StarlightDeathEntity starlightDeath = (StarlightDeathEntity)entity2;
                    cir.setReturnValue((Object)ModMusics.Starlightspawnbgm);
                    continue;
                }
                if (!world.m_6443_(StarSpiritEntity.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)256.0, (double)256.0, (double)256.0), e -> true).isEmpty()) {
                    if (!(entity2 instanceof StarSpiritEntity)) continue;
                    StarSpiritEntity starSpirit = (StarSpiritEntity)entity2;
                    cir.setReturnValue((Object)ModMusics.Starbgm);
                    continue;
                }
                if (!world.m_6443_(DangerEntity.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)256.0, (double)256.0, (double)256.0), e -> true).isEmpty()) {
                    if (!(entity2 instanceof DangerEntity)) continue;
                    DangerEntity danger = (DangerEntity)entity2;
                    cir.setReturnValue((Object)ModMusics.Dangerbgm);
                    continue;
                }
                if (!world.m_6443_(SolarskeletonEntity.class, AABB.m_165882_((Vec3)new Vec3(x, y, z), (double)256.0, (double)256.0, (double)256.0), e -> true).isEmpty()) {
                    if (!(entity2 instanceof SolarskeletonEntity)) continue;
                    SolarskeletonEntity solarskeleton = (SolarskeletonEntity)entity2;
                    cir.setReturnValue((Object)ModMusics.Starbgm);
                    continue;
                }
                Holder holder = this.f_91074_.m_9236_().m_204166_(this.f_91074_.m_20183_());
                cir.setReturnValue((Object)((Biome)holder.m_203334_()).m_47566_().orElse(Musics.f_11651_));
            }
        }
    }
}

