/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraftforge.common.ForgeConfigSpec
 *  net.minecraftforge.common.ForgeConfigSpec$Builder
 *  net.minecraftforge.common.ForgeConfigSpec$ConfigValue
 */
package net.mcreator.ultimateskeletons.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class SkeletonsConfiguration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GOD;
    public static final ForgeConfigSpec.ConfigValue<Double> SHOCKCOUNT;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ALLOW;

    static {
        BUILDER.push("godslayer");
        GOD = BUILDER.define("\u706d\u795e\u6a21\u5f0f", true);
        SHOCKCOUNT = BUILDER.define("\u9707\u5c4f\u6307\u6570", (Object)1.0);
        ALLOW = BUILDER.define("\u5141\u8bb8\u8fdc\u7a0b\u9ad8\u4f24\u6280\u80fd", true);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}

