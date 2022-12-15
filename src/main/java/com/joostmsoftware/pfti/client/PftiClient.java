package com.joostmsoftware.pfti.client;

import com.joostmsoftware.pfti.client.screen.AltarScreen;
import com.joostmsoftware.pfti.common.screen.PftiScreens;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

@Environment(EnvType.CLIENT)
public class PftiClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HandledScreens.register(PftiScreens.ALTAR_SCREEN_HANDLER, AltarScreen::new);
    }
}
