/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.phys.Vec3
 */
package net.mcreator.ultimateskeletons.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

public class NogravityProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        entity.m_20242_(true);
        entity.m_20256_(new Vec3(0.0, 0.0, 0.0));
    }
}

