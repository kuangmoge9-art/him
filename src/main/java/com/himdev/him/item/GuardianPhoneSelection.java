package com.himdev.him.item;

import com.himdev.him.entity.HimGuardianMode;

public enum GuardianPhoneSelection {
    FOLLOW("follow"),
    TIMED_FOLLOW("timed_follow"),
    CANCEL_FOLLOW("cancel_follow");

    private final String serializedName;

    GuardianPhoneSelection(String serializedName) {
        this.serializedName = serializedName;
    }

    public String serializedName() {
        return serializedName;
    }

    public String translationKey() {
        return "item.him.guardian_phone.action." + serializedName;
    }

    public boolean isCancel() {
        return this == CANCEL_FOLLOW;
    }

    public HimGuardianMode guardianMode() {
        return this == TIMED_FOLLOW ? HimGuardianMode.TIMED_FOLLOW : HimGuardianMode.FOLLOW;
    }
}
