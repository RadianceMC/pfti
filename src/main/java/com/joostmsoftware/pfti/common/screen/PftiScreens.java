package com.joostmsoftware.pfti.common.screen;

import com.joostmsoftware.pfti.Pfti;
import com.joostmsoftware.pfti.client.screen.AltarScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;

public class PftiScreens {

    public static final ScreenHandlerType<AltarScreenHandler> ALTAR_SCREEN_HANDLER;

    static {
        ALTAR_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(Pfti.ID("altar_screen_handler"), AltarScreenHandler::new);
    }

    public static void loadScreensInRegistry() {

    }
}
