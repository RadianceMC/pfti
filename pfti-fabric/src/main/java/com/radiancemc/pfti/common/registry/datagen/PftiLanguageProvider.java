package com.radiancemc.pfti.common.registry.datagen;

import com.radiancemc.pfti.Pfti;
import com.radiancemc.pfti.common.item.PftiItems;
import com.radiancemc.pfti.common.registry.TagRegistry;
import com.radiancemc.radiancelib.api.data.RadianceLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import java.io.IOException;
import java.nio.file.Path;

public class PftiLanguageProvider extends RadianceLanguageProvider {
    protected PftiLanguageProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        PftiItems.PETS.forEach((s, item) -> {
            String capitalised = capitalizeString(s);
            String name = capitalised.replaceAll("_[0123456789]", "").replaceAll("_", " ");
            translationBuilder.add(item, name);
        });

        PftiItems.ITEMS.forEach((s, item) -> {
            String capitalised = capitalizeString(s);
            String name = capitalised.replaceAll("_[0123456789]", "").replaceAll("_", " ");
            translationBuilder.add(item, name);
        });

        translationBuilder.add(Pfti.GROUP, "Pets From The Inventory");
        try {
            Path existingFilePath = dataGenerator.getModContainer().findPath("assets/pfti/lang/existing.en_us.json").get();
            translationBuilder.add(existingFilePath);
        } catch (IOException e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }

        translationBuilder.add(TagRegistry.PETS, "Pets");
        translationBuilder.add(TagRegistry.MINING_PETS, "Mining Pets");
        translationBuilder.add(TagRegistry.IRON_GOLEM_PETS, "Iron Golem Pets");
        translationBuilder.add(TagRegistry.SUGAR_CANE_PETS, "Sugar Cane Pets");
        translationBuilder.add(TagRegistry.CAT_PET, "Cat Pets");
        translationBuilder.add(TagRegistry.CACTUS_PET, "Cactus Pets");
        translationBuilder.add(TagRegistry.DOLPHIN_PET, "Dolphin Pets");
        translationBuilder.add(TagRegistry.TATER_PET, "Tater Pets");
        translationBuilder.add(TagRegistry.BEE_PET, "Bee Pets");
    }

    // https://stackoverflow.com/questions/1892765/how-to-capitalize-the-first-character-of-each-word-in-a-string
    private static String capitalizeString(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '_') {
                found = false;
            }
        }
        return String.valueOf(chars);
    }
}
