package com.joostmsoftware.pfti.common.registry;

import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class TagRegistry {
    public static final TagKey<Item> PETS = TagKey.of(Registry.ITEM_KEY, COMMON_ID("pets"));
    public static final TagKey<Item> MINING_PETS = TagKey.of(Registry.ITEM_KEY, COMMON_ID("pets/mining_pets"));
    public static final TagKey<Item> IRON_GOLEM_PETS = TagKey.of(Registry.ITEM_KEY, COMMON_ID("pets/iron_golem_pets"));
    public static final TagKey<Item> SUGAR_CANE_PETS = TagKey.of(Registry.ITEM_KEY, COMMON_ID("pets/sugar_cane_pets"));
    public static final TagKey<Item> CACTUS_PET = TagKey.of(Registry.ITEM_KEY, COMMON_ID("pets/cactus_pet"));
    public static final TagKey<Item> CAT_PET = TagKey.of(Registry.ITEM_KEY, COMMON_ID("pets/cat_pet"));
    public static final TagKey<Item> TATER_PET = TagKey.of(Registry.ITEM_KEY, COMMON_ID("pets/tater_pet"));
    public static final TagKey<Item> DOLPHIN_PET = TagKey.of(Registry.ITEM_KEY, COMMON_ID("pets/dolphin_pet"));

    private static Identifier COMMON_ID(String path) {
        return new Identifier("c", path);
    }
}
