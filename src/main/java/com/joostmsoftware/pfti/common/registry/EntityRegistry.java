package com.joostmsoftware.pfti.common.registry;

import com.joostmsoftware.pfti.common.block.PftiBlockEntities;

public class EntityRegistry {
    public static void registerEntities() {
        PftiBlockEntities.loadBlockEntitiesInRegistry();
    }
}
