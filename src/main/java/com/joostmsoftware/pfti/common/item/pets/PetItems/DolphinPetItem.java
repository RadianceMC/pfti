package com.joostmsoftware.pfti.common.item.pets.PetItems;

import com.joostmsoftware.pfti.common.item.pets.StatusEffectPetItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DolphinPetItem extends StatusEffectPetItem {

    public DolphinPetItem(StatusEffect effect, int petTier, Settings settings) {
        super(effect, petTier, settings);
        setMaxTier(1);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (entity instanceof PlayerEntity player) {
                if (player.isSwimming()) {
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
