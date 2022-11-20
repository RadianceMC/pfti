package com.joostmsoftware.pfti.registry.datagen;

import com.joostmsoftware.pfti.item.PftiItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class PftiModelProvider extends FabricModelProvider {
    public PftiModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        PftiItems.PETS.forEach((s, item) -> {
            Item tempItem = PftiItems.PETS.get(s);
            itemModelGenerator.register(tempItem, Models.GENERATED);
        });
    }
}
