/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.nbt.CompoundTag
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.EntityType
 *  net.minecraft.world.level.Level
 */
package firis.mobbottle.common.helper;

import java.util.Optional;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class FirisEntityHelper {
    public static Entity createEntityFromTag(CompoundTag tag, Level level) {
        Entity entity = null;
        try {
            Optional optEntityType = EntityType.m_20637_((CompoundTag)tag);
            entity = ((EntityType)optEntityType.get()).m_20615_(level);
            entity.m_20258_(tag);
        }
        catch (Exception e) {
            entity = null;
        }
        return entity;
    }

    public static CompoundTag createTagFromEntity(Entity entity) {
        CompoundTag tag = new CompoundTag();
        entity.m_20223_(tag);
        return tag;
    }
}

