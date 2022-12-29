package com.radiancemc.pfti.common.registry.datagen;

import com.radiancemc.pfti.api.core.pet.PetItem;
import com.radiancemc.pfti.common.item.PftiItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.model.BlockStateModelGenerator;
import net.minecraft.data.client.model.Models;
import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PftiModelProvider extends FabricModelProvider {


    public PftiModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        List<Map.Entry<String, PetItem>> SORTED_PETS = sortMap();
        List<PetItem> parent = new ArrayList<>();

        SORTED_PETS.forEach(stringPetItemEntry -> {
            String petId = stringPetItemEntry.getKey();
            PetItem petItem = stringPetItemEntry.getValue();
            if (petItem.toString().matches(".*[0-9].*")) {
                String serialised = petId.replaceAll("_[0123456789]", "");
                for (PetItem item : parent) {
                    if (item.toString().contains(serialised)) {
                        itemModelGenerator.register(petItem, item, Models.GENERATED);
                    }
                }
            } else {
                parent.add(petItem);
                itemModelGenerator.register(petItem, Models.GENERATED);
            }
        });


        PftiItems.ITEMS.forEach((s, item) -> {
            Item tempItem = PftiItems.ITEMS.get(s);
            itemModelGenerator.register(tempItem, Models.GENERATED);
        });
    }

    private static @NotNull List<Map.Entry<String, PetItem>> sortMap() {
        List<Map.Entry<String, PetItem>> list = new ArrayList<>(PftiItems.PETS.entrySet());
        list.sort(Map.Entry.comparingByKey());
        return list;
    }
}
