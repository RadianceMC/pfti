package com.joostmsoftware.pfti.common.registry.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PftiDatagenEntrypoint implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(PftiModelProvider::new);
        fabricDataGenerator.addProvider(PftiLanguageProvider::new);
        fabricDataGenerator.addProvider(PftiItemTagProvider::new);
    }
}
