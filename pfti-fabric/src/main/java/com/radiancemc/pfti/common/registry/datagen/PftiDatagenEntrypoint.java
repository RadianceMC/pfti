package com.radiancemc.pfti.common.registry.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PftiDatagenEntrypoint implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        final FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(PftiModelProvider::new);
        pack.addProvider(PftiLanguageProvider::new);
        pack.addProvider(PftiItemTagProvider::new);
    }
}
