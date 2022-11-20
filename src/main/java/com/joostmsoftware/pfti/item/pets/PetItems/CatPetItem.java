package com.joostmsoftware.pfti.item.pets.PetItems;

import com.joostmsoftware.pfti.item.pets.StatusEffectPetItem;
import net.minecraft.entity.effect.StatusEffect;
public class CatPetItem extends StatusEffectPetItem {
    public CatPetItem(StatusEffect effect, int petTier, Settings settings) {
        super(effect, petTier, settings);
        statusEffect = effect;
        maxTier = setMaxTier(1);
    }
}
