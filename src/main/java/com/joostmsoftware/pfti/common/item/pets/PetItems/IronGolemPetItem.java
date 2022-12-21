package com.joostmsoftware.pfti.common.item.pets.PetItems;

import com.joostmsoftware.pfti.common.item.pets.StatusEffectPetItem;
import com.joostmsoftware.pfti.core.api.pet.PetTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IronGolemPetItem extends StatusEffectPetItem {

    public IronGolemPetItem(int petTier, PetTypes type, Settings settings) {
        super(petTier, type, settings);
    }
}
