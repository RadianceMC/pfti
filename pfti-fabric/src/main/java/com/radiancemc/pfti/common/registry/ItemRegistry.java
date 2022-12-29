package com.radiancemc.pfti.common.registry;

import com.radiancemc.pfti.Pfti;
import com.radiancemc.pfti.common.item.PftiItems;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemRegistry {
    public static void registerItems() {
        PftiItems.PETS.forEach(ItemRegistry::registerItem);
        PftiItems.ITEMS.forEach(ItemRegistry::registerItem);
    }

    public static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, Pfti.ID(name), item);
    }
}
