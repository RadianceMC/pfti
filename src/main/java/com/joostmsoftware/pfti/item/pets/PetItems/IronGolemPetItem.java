package com.joostmsoftware.pfti.item.pets.PetItems;

import com.joostmsoftware.pfti.item.pets.StatusEffectPetItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IronGolemPetItem extends StatusEffectPetItem {
    public IronGolemPetItem(StatusEffect effect, int petTier, Settings settings) {
        super(effect, petTier, settings);
        setMaxTier(5);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (entity instanceof PlayerEntity player) {
                if (hasPetInInventory(player, slot)) {
                    if (currentTier == 1) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 0, true, false, true));
                    } else if (currentTier == 2) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 1, true, false, true));
                    } else if (currentTier == 3) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 2, true, false, true));
                    } else if (currentTier == 4) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 3, true, false, true));
                    } else if (currentTier == 5){
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 4, true, false, true));
                    }
                }
                if (player.getOffHandStack() == stack) {
                    if (currentTier == 1) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 0, true, false, true));
                    } else if (currentTier == 2) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 1, true, false, true));
                    } else if (currentTier == 3) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 2, true, false, true));
                    } else if (currentTier == 4) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 3, true, false, true));
                    } else if (currentTier == 5){
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 4, true, false, true));
                    }
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
