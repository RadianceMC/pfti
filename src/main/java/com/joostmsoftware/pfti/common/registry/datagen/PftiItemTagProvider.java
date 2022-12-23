package com.joostmsoftware.pfti.common.registry.datagen;

import com.joostmsoftware.pfti.common.item.PftiItems;
import com.joostmsoftware.pfti.common.registry.TagRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class PftiItemTagProvider extends FabricTagProvider<Item> {
    protected PftiItemTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ITEM, "Item Tag Provider");
    }

    @Override
    protected void generateTags() {
        getOrCreateTagBuilder(TagRegistry.PETS)
                .add(PftiItems.BEE_PET)
                .addTag(TagRegistry.CACTUS_PET)
                .addTag(TagRegistry.CAT_PET)
                .addTag(TagRegistry.DOLPHIN_PET)
                .addTag(TagRegistry.IRON_GOLEM_PETS)
                .addTag(TagRegistry.MINING_PETS)
                .addTag(TagRegistry.SUGAR_CANE_PETS)
                .addTag(TagRegistry.TATER_PET);

        getOrCreateTagBuilder(TagRegistry.MINING_PETS)
                .add(PftiItems.MINING_PET1)
                .add(PftiItems.MINING_PET2)
                .add(PftiItems.MINING_PET3)
                .add(PftiItems.MINING_PET4)
                .add(PftiItems.MINING_PET5);

        getOrCreateTagBuilder(TagRegistry.IRON_GOLEM_PETS)
                .add(PftiItems.IRON_GOLEM)
                .add(PftiItems.IRON_GOLEM2)
                .add(PftiItems.IRON_GOLEM3)
                .add(PftiItems.IRON_GOLEM4)
                .add(PftiItems.IRON_GOLEM5);

        getOrCreateTagBuilder(TagRegistry.SUGAR_CANE_PETS)
                .add(PftiItems.SUGAR_CANE_PET1)
                .add(PftiItems.SUGAR_CANE_PET2)
                .add(PftiItems.SUGAR_CANE_PET3)
                .add(PftiItems.SUGAR_CANE_PET4)
                .add(PftiItems.SUGAR_CANE_PET5);

        getOrCreateTagBuilder(TagRegistry.CAT_PET).add(PftiItems.CAT_PET);
        getOrCreateTagBuilder(TagRegistry.CACTUS_PET).add(PftiItems.CACTUS_PET);
        getOrCreateTagBuilder(TagRegistry.TATER_PET).add(PftiItems.TATER_PET);
        getOrCreateTagBuilder(TagRegistry.DOLPHIN_PET).add(PftiItems.DOLPHIN_PET);
    }
}
