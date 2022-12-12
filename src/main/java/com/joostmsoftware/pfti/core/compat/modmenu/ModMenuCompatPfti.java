package com.joostmsoftware.pfti.core.compat.modmenu;

import com.joostmsoftware.pfti.config.PftiConfig;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;

public class ModMenuCompatPfti implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(PftiConfig.class, parent).get();
    }
}
