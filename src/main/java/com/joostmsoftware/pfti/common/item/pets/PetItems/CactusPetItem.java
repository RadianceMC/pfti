package com.joostmsoftware.pfti.common.item.pets.PetItems;

import com.joostmsoftware.pfti.common.item.pets.PetItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CactusPetItem extends PetItem {
    public CactusPetItem(int petTier, Settings settings) {
        super(petTier, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (entity instanceof PlayerEntity player) {
                player.damage(DamageSource.CACTUS, 1);
            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
