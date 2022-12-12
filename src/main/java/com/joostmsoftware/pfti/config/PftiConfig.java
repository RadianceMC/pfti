package com.joostmsoftware.pfti.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "pfti")
public class PftiConfig implements ConfigData {
    public static int effectDuration = 5;
    int test = 0;
}
