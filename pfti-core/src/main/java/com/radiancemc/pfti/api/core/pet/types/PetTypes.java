package com.radiancemc.pfti.api.core.pet.types;

import com.radiancemc.pfti.api.core.pet.BasePet;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;

public class PetTypes {
    @SuppressWarnings("unused")
    public enum CoreTypes {
        BASE("base", 1),
        STATUS("status", 2),
        WORKSTATION("workstation", 3)
        ;

        private final String name;
        private final int id;
        CoreTypes(String TypeName, int ID) {
            this.name = TypeName;
            this.id = ID;
        }

        public String getName() {
            return this.name;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum BasePetTypes implements BasePet {
        BEE("bee", CoreTypes.BASE, 1, 1),
        CACTUS("cactus", CoreTypes.BASE, 1, 1),
        TATER("tater", CoreTypes.BASE,1, 1),
        SQUID("squid", CoreTypes.BASE,1, 1),
        ;

        private final String name;
        private final CoreTypes coreTypes;
        private final int minTier;
        private final int maxTier;

        BasePetTypes(String name, CoreTypes coreTypes, int minTier, int maxTier) {
            this.name = name;
            this.coreTypes = coreTypes;
            this.minTier = minTier;
            this.maxTier = maxTier;
        }

        public String getName() {
            return name;
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
        public CoreTypes getCoreType() {
            return coreTypes;
        }
    }

    /**
     * Holds all the data for StatusEffectPets
     */
    public enum StatusPetTypes implements BasePet {
        CAT(CoreTypes.STATUS,1, 1, StatusEffects.NIGHT_VISION),
        DOLPHIN(CoreTypes.STATUS,1, 1, StatusEffects.DOLPHINS_GRACE),
        IRON_GOLEM(CoreTypes.STATUS,1, 5, StatusEffects.RESISTANCE),
        MINING(CoreTypes.STATUS,1, 5, StatusEffects.HASTE),
        SUGARCANE(CoreTypes.STATUS,1, 5, StatusEffects.SPEED),
        ;

        private final int minTier;
        private final int maxTier;
        private final StatusEffect effect;
        private final CoreTypes coreTypes;


        StatusPetTypes(CoreTypes coreTypes, int minTier, int maxTier, StatusEffect effect) {
            this.coreTypes = coreTypes;
            this.minTier = minTier;
            this.maxTier = maxTier;
            this.effect = effect;
        }

        @Override
        public int getMinTier() {
            return this.minTier;
        }

        @Override
        public int getMaxTier() {
            return this.maxTier;
        }

        @Override
        public CoreTypes getCoreType() {
            return this.coreTypes;
        }

        public StatusEffect getStatusEffect() {
            return effect;
        }
    }
}
