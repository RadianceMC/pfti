package com.radiancemc.pfti.api.core.pet;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface PetUtil {
    /**
     * Checks if the player has a pet in their inventory.
     * @param player the player
     * @param slot a slot in their inventory
     * @return false if the pet is not in the players inventory.
     */
     default boolean hasPetInInventory(@NotNull PlayerEntity player, int slot) {
        ItemStack pet = player.getInventory().getStack(slot);
        if (pet.getItem() instanceof PetItem) {
            return !pet.isEmpty();
        }
        return pet.isEmpty();
    }
}
