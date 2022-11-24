package com.joostmsoftware.pfti.config;

import com.joostmsoftware.jxlib.config.JXLibConfigHelper;
import com.joostmsoftware.jxlib.config.JXLibConfigProvider;
import com.joostmsoftware.jxlib.config.SimpleConfig;
import com.joostmsoftware.pfti.Pfti;
import net.minecraft.util.Pair;

public class PftiConfig {

    private static JXLibConfigProvider configProvider;
    private static SimpleConfig CONFIG;
    private static JXLibConfigHelper HELPER;

    public static int DURATION_OF_STATUSEFFECT;

    public static void loadConfig() {
        configProvider = new JXLibConfigProvider();
        createConfig();

        CONFIG = SimpleConfig.of(Pfti.NAMESPACE + "Config").provider(configProvider).request();

        assignConfigs();
    }

    private static void createConfig() {
        configProvider.addKeyValuePair(new Pair<>("config.pfti.statuspetitem.statusDuration", 5), "determent's how long the effect is running per tick");
    }

    private static void assignConfigs() {
        DURATION_OF_STATUSEFFECT = CONFIG.getOrDefault("config.pfti.statuspetitem.statusDuration", 5);

        System.out.println("Amount of configs that correctly loaded: " + configProvider.getConfigArray().size());
    }
}
