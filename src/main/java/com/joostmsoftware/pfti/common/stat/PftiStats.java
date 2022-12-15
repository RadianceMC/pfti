package com.joostmsoftware.pfti.common.stat;

import com.joostmsoftware.pfti.Pfti;
import com.joostmsoftware.pfti.common.registry.StatRegistry;
import net.minecraft.util.Identifier;

public class PftiStats {
    public static final Identifier INTERACT_WITH_PET_ALTAR = Pfti.ID("interact_with_pet_altar");

    public static void loadStatsInRegistry() {
        StatRegistry.registerStat("interact_with_pet_altar", INTERACT_WITH_PET_ALTAR);
    }
}
