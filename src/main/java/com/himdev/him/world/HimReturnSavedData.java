package com.himdev.him.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.SavedData;

public final class HimReturnSavedData extends SavedData {
    private static final String PRESENT_KEY = "present";
    private static final String DIMENSION_KEY = "dimension";
    private static final String X_KEY = "x";
    private static final String Y_KEY = "y";
    private static final String Z_KEY = "z";
    private static final String Y_ROT_KEY = "yRot";
    private static final String X_ROT_KEY = "xRot";

    private boolean present;
    private ResourceKey<Level> dimension;
    private double x;
    private double y;
    private double z;
    private float yRot;
    private float xRot;

    public static HimReturnSavedData load(CompoundTag tag) {
        HimReturnSavedData data = new HimReturnSavedData();
        if (tag.getBoolean(PRESENT_KEY)) {
            String dimensionId = tag.getString(DIMENSION_KEY);
            ResourceLocation location = ResourceLocation.tryParse(dimensionId);
            if (location != null) {
                data.present = true;
                data.dimension = ResourceKey.create(Registries.DIMENSION, location);
                data.x = tag.getDouble(X_KEY);
                data.y = tag.getDouble(Y_KEY);
                data.z = tag.getDouble(Z_KEY);
                data.yRot = tag.getFloat(Y_ROT_KEY);
                data.xRot = tag.getFloat(X_ROT_KEY);
            }
        }

        return data;
    }

    public boolean isPresent() {
        return present;
    }

    public ResourceKey<Level> dimension() {
        return dimension;
    }

    public boolean isValid() {
        return present && dimension != null;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double z() {
        return z;
    }

    public float yRot() {
        return yRot;
    }

    public float xRot() {
        return xRot;
    }

    public void update(ResourceKey<Level> dimension, double x, double y, double z, float yRot, float xRot) {
        this.present = true;
        this.dimension = dimension;
        this.x = x;
        this.y = y;
        this.z = z;
        this.yRot = yRot;
        this.xRot = xRot;
        setDirty();
    }

    public void clear() {
        if (present) {
            present = false;
            setDirty();
        }
    }

    @Override
    public CompoundTag save(CompoundTag tag) {
        tag.putBoolean(PRESENT_KEY, present);
        if (present && dimension != null) {
            tag.putString(DIMENSION_KEY, dimension.location().toString());
            tag.putDouble(X_KEY, x);
            tag.putDouble(Y_KEY, y);
            tag.putDouble(Z_KEY, z);
            tag.putFloat(Y_ROT_KEY, yRot);
            tag.putFloat(X_ROT_KEY, xRot);
        }
        return tag;
    }
}
