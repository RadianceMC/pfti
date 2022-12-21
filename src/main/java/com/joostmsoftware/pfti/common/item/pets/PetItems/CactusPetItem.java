package com.joostmsoftware.pfti.common.item.pets.PetItems;

import com.joostmsoftware.pfti.common.item.pets.PetItem;
import com.joostmsoftware.pfti.core.api.pet.PetTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CactusPetItem extends PetItem {
    public CactusPetItem(int petTier, PetTypes type, Settings settings) {
        super(petTier, type, settings);
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
