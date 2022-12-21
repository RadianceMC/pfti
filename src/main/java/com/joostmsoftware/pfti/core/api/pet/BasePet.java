package com.joostmsoftware.pfti.core.api.pet;

import net.minecraft.entity.effect.StatusEffect;

public interface BasePet {
    /**
     * Gets the minimal tier of a pet.
     * @return The minimal tier of a pet, which is mostly 1. Unless specified else where.
     */
    int getMinTier();

    /**
     * Gets the max tier of a pet. <br />
     * Current max tier is between 1 and 5.
     * @return The max tier of a pet. You can return any value you want and made logically.
     */
    int getMaxTier();

    /**
     * Gets the status effect of a pet.
     * @return the effect that the pet has if any.
     */
    StatusEffect getStatusEffect();
}
