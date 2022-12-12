package com.joostmsoftware.pfti.common.registry;

import com.joostmsoftware.pfti.Pfti;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static void registerBlocks() {

    }

    private static void registerBlock(String path, Block block) {
        Registry.register(Registry.BLOCK, Pfti.ID(path), block);
    }

    public static void registerBlockWithItem(String path, Block block) {
        Registry.register(Registry.BLOCK, Pfti.ID(path), block);
        Registry.register(Registry.ITEM, Pfti.ID(path), new BlockItem(block, new Item.Settings().group(Pfti.GROUP)));
    }
}
