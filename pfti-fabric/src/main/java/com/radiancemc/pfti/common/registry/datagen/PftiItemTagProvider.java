package com.radiancemc.pfti.common.registry.datagen;

import com.radiancemc.pfti.common.item.PftiItems;
import com.radiancemc.pfti.common.registry.TagRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.HolderLookup;
import net.minecraft.registry.RegistryKeys;

import java.util.concurrent.CompletableFuture;

public class PftiItemTagProvider extends FabricTagProvider<Item> {


    /**
     * Constructs a new {@link FabricTagProvider} with the default computed path.
     *
     * <p>Common implementations of this class are provided.
     *
     * @param output           the {@link FabricDataOutput} instance
     * @param registriesFuture the backing registry for the tag type
     */
    public PftiItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(TagRegistry.PETS)
                .addTag(TagRegistry.BEE_PET)
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
        getOrCreateTagBuilder(TagRegistry.BEE_PET).add(PftiItems.BEE_PET);
    }
}
