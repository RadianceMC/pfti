package com.radiancemc.pfti.common.item.pets;

import com.radiancemc.pfti.api.core.pet.BasePetItem;
import com.radiancemc.pfti.api.core.pet.types.PetTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CactusPetItem extends BasePetItem {
    public CactusPetItem(int petTier, PetTypes.BasePetTypes type, Settings settings) {
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
