package com.radiancemc.pfti.api.core.pet;

import com.radiancemc.pfti.api.core.pet.types.PetTypes;

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
     * Gets the coretype of a pet. <br />
     * @return The coretype of a pet. Useful for making sure it has the right type.
     */
    PetTypes.CoreTypes getCoreType();
}
