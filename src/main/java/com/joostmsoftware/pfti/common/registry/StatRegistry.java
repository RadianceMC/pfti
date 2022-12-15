package com.joostmsoftware.pfti.common.registry;

import com.joostmsoftware.pfti.common.stat.PftiStats;
import net.minecraft.stat.StatFormatter;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StatRegistry {
    public static void registerStats() {
        PftiStats.loadStatsInRegistry();
    }

    public static void registerStat(String path, Identifier statIdentifier) {
        Registry.register(Registry.CUSTOM_STAT, path, statIdentifier);
        Stats.CUSTOM.getOrCreateStat(statIdentifier, StatFormatter.DEFAULT);
    }
}
