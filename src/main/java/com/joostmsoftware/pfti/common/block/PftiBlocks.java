package com.joostmsoftware.pfti.common.block;

import com.joostmsoftware.pfti.common.registry.BlockRegistry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.HashMap;
import java.util.Map;

public class PftiBlocks {

    public static final Map<String, Block> BLOCKS = new HashMap<>();

    public static final Block PET_SUMMONING_ALTAR = new Block(FabricBlockSettings.copyOf(Blocks.LECTERN));

    static {
        BLOCKS.put("pet_summoning_altar", PET_SUMMONING_ALTAR);
    }

    public static void loadBlocksInRegistry() {
        BLOCKS.forEach(BlockRegistry::registerBlockWithItem);
    }


}
