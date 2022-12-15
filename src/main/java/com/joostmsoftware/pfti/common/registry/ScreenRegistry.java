package com.joostmsoftware.pfti.common.registry;

import com.joostmsoftware.pfti.common.screen.PftiScreens;

public class ScreenRegistry {

    public static void registerScreens() {
        PftiScreens.loadScreensInRegistry();
    }
}
