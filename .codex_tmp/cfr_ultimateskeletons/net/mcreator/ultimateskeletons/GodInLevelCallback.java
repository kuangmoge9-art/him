/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.Entity$RemovalReason
 *  net.minecraft.world.level.entity.EntityInLevelCallback
 */
package net.mcreator.ultimateskeletons;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.entity.EntityInLevelCallback;

public interface GodInLevelCallback
extends EntityInLevelCallback {
    public static final GodInLevelCallback NULL = new GodInLevelCallback(){

        @Override
        public void m_142044_() {
        }

        @Override
        public void m_142472_(Entity.RemovalReason p_156805_) {
        }
    };

    public void m_142044_();

    public void m_142472_(Entity.RemovalReason var1);
}

