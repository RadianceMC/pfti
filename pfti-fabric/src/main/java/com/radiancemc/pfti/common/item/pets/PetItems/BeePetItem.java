package com.radiancemc.pfti.common.item.pets.PetItems;

import com.radiancemc.pfti.api.core.pet.PetItem;
import com.radiancemc.pfti.api.core.pet.PetTypes;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class BeePetItem extends PetItem {


    public BeePetItem(int petTier, @NotNull PetTypes type, Settings settings) {
        super(petTier, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
