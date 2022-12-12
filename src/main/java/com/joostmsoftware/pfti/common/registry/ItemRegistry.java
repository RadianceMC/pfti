package com.joostmsoftware.pfti.common.registry;

import com.joostmsoftware.pfti.Pfti;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static com.joostmsoftware.pfti.common.item.PftiItems.PETS;

public class ItemRegistry {
    public static void registerItems() {
        PETS.forEach(ItemRegistry::registerItem);
    }

    public static void registerItem(String name, Item item) {
        Registry.register(Registry.ITEM, Pfti.ID(name), item);
    }
}
