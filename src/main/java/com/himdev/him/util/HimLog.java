package com.himdev.him.util;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class HimLog {
    private static final Logger LOGGER = LogUtils.getLogger();

    private HimLog() {
    }

    public static void info(String pattern, Object... args) {
        LOGGER.info(pattern, args);
    }
}
