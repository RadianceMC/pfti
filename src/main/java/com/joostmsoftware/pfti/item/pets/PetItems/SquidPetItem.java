package com.joostmsoftware.pfti.item.pets.PetItems;

import com.joostmsoftware.pfti.item.pets.PetItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SquidPetItem extends PetItem {
    public SquidPetItem(int petTier, Settings settings) {
        super(petTier, settings);
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
