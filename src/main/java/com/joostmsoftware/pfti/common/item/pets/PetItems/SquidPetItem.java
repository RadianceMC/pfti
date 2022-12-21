package com.joostmsoftware.pfti.common.item.pets.PetItems;

import com.joostmsoftware.pfti.common.item.pets.PetItem;
import com.joostmsoftware.pfti.core.api.pet.PetTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SquidPetItem extends PetItem {


    public SquidPetItem(int petTier, PetTypes type, Settings settings) {
        super(petTier, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (entity instanceof PlayerEntity player) {
                if (player.isSwimming()) {
                    player.squaredDistanceTo(player);
                }
            }
        }

//        return SquidEntity.this.squaredDistanceTo(livingEntity) < 100.0;
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
