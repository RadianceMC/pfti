package com.radiancemc.pfti.common.item.pets;

import com.radiancemc.pfti.api.core.pet.BasePetItem;
import com.radiancemc.pfti.api.core.pet.types.PetTypes;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class BeePetItem extends BasePetItem {


    public BeePetItem(int petTier, @NotNull PetTypes.BasePetTypes type, Settings settings) {
        super(petTier, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
