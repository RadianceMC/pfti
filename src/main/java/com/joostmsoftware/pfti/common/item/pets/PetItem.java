package com.joostmsoftware.pfti.common.item.pets;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PetItem extends Item {
    public int minTier;
    public int maxTier;
    public int currentTier;

    public PetItem(int petTier, Settings settings) {
        super(settings);
        currentTier = setCurrentTier(petTier);
        minTier = setMinTier(minTier);
        maxTier = setMaxTier(maxTier);
    }

    public boolean hasPetInInventory(PlayerEntity player, int slot) {
        ItemStack pet = player.getInventory().getStack(slot);
        return !pet.isEmpty();
    }

    public int getMinTier() {
        return 1;
    }

    public int getCurrentTier() {
        return this.currentTier;
    }

    public int getMaxTier() {
        return 1;
    }

    public int setMinTier(int minTier) {
        this.minTier = minTier;
        return this.minTier;
    }

    public int setCurrentTier(int currentTier) {
        this.currentTier = currentTier;
        return currentTier;
    }

    public int setMaxTier(int maxTier) {
        this.maxTier = maxTier;
        return this.maxTier;
    }
}