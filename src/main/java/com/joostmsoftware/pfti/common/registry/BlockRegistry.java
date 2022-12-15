package com.joostmsoftware.pfti.common.registry;

import com.joostmsoftware.pfti.Pfti;
import com.joostmsoftware.pfti.common.block.PftiBlocks;
import com.joostmsoftware.pfti.common.custom.blockEntities.PetSummoningAltarBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static void registerBlocks() {
        PftiBlocks.loadBlocksInRegistry();
    }

    private static void registerBlock(String path, Block block) {
        Registry.register(Registry.BLOCK, Pfti.ID(path), block);
    }

    public static void registerBlockWithItem(String path, Block block) {
        Registry.register(Registry.BLOCK, Pfti.ID(path), block);
        Registry.register(Registry.ITEM, Pfti.ID(path), new BlockItem(block, new Item.Settings().group(Pfti.GROUP)));
    }

    public static BlockEntityType<PetSummoningAltarBlockEntity> registerAltarBlockEntity(String path, Block block) {
        return Registry.register(
                Registry.BLOCK_ENTITY_TYPE,
                Pfti.ID(path),
                FabricBlockEntityTypeBuilder.create(PetSummoningAltarBlockEntity::new, block).build()
        );
    }
}
