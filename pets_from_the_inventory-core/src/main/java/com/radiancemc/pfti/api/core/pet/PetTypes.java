package com.radiancemc.pfti.api.core.pet;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;

public enum PetTypes implements BasePet {
    BEE(1, 1, null),
    CACTUS(1, 1, null),
    CAT(1, 1, StatusEffects.NIGHT_VISION),
    DOLPHIN(1, 1, StatusEffects.DOLPHINS_GRACE),
    IRON_GOLEM(1, 5, StatusEffects.RESISTANCE),
    MINING(1, 5, StatusEffects.HASTE),
    SQUID(1, 1, null),
    SUGARCANE(1, 5, StatusEffects.SPEED),
    TATER(1, 1, null)
    ;

    private final int minTier;
    private final int maxTier;
    private final StatusEffect effect;

    PetTypes(int minTier, int maxTier, StatusEffect effect) {
        this.minTier = minTier;
        this.maxTier = maxTier;
        this.effect = effect;
    }

    @Override
    public int getMinTier() {
        return minTier;
    }

    @Override
    public int getMaxTier() {
        return maxTier;
    }

    @Override
    public StatusEffect getStatusEffect() {
        return effect;
    }
}
