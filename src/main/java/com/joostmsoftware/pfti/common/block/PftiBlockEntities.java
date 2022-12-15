package com.joostmsoftware.pfti.common.block;

import com.joostmsoftware.pfti.common.custom.blockEntities.PetSummoningAltarBlockEntity;
import com.joostmsoftware.pfti.common.registry.BlockRegistry;
import net.minecraft.block.entity.BlockEntityType;

public class PftiBlockEntities {
    public static final BlockEntityType<PetSummoningAltarBlockEntity> PET_SUMMONING_ALTAR = BlockRegistry.registerAltarBlockEntity("pet_summoning_type", PftiBlocks.PET_SUMMONING_ALTAR);
}
