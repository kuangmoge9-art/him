package com.himdev.him.entity;

public enum HimGuardianMode {
    NONE("none", 0),
    FOLLOW("follow", -1),
    TIMED_FOLLOW("timed_follow", 2 * 60 * 20);

    private final String serializedName;
    private final int defaultDurationTicks;

    HimGuardianMode(String serializedName, int defaultDurationTicks) {
        this.serializedName = serializedName;
        this.defaultDurationTicks = defaultDurationTicks;
    }

    public String serializedName() {
        return serializedName;
    }

    public int defaultDurationTicks() {
        return defaultDurationTicks;
    }

    public boolean isTimed() {
        return this == TIMED_FOLLOW;
    }

    public HimGuardianMode nextSelectable() {
        return this == TIMED_FOLLOW ? FOLLOW : TIMED_FOLLOW;
    }

    public static HimGuardianMode fromSerializedName(String value) {
        for (HimGuardianMode mode : values()) {
            if (mode.serializedName.equals(value)) {
                return mode;
            }
        }
        return FOLLOW;
    }
}
