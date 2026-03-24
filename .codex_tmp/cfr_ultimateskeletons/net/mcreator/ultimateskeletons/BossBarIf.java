/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.player.LocalPlayer
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.phys.AABB
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.ultimateskeletons;

import java.util.Comparator;
import java.util.List;
import net.mcreator.ultimateskeletons.BossBarGui;
import net.mcreator.ultimateskeletons.Deathgodentity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class BossBarIf {
    public static boolean execute() {
        Minecraft mc = Minecraft.m_91087_();
        LocalPlayer player = mc.f_91074_;
        if (player != null) {
            double x = player.m_20185_();
            double y = player.m_20186_();
            double z = player.m_20189_();
            Vec3 _center = new Vec3(x, y, z);
            List<Entity> _entfound = player.m_9236_().m_6443_(Entity.class, new AABB(_center, _center).m_82400_(200.0), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.m_20238_(_center))).toList();
            BossBarGui.entityHealths.clear();
            for (Entity entityiterator : _entfound) {
                Deathgodentity sb;
                if (!(entityiterator instanceof Deathgodentity) || !(sb = (Deathgodentity)entityiterator).isBar()) continue;
                float maxHealth = sb.m_21233_();
                float health = sb.m_21223_();
                BossBarGui.entityHealths.put((Deathgodentity)entityiterator, Float.valueOf(health));
            }
            return true;
        }
        return false;
    }
}

