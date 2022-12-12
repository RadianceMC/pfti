package com.joostmsoftware.pfti.common.item;

import com.joostmsoftware.pfti.Pfti;
import com.joostmsoftware.pfti.common.item.pets.*;
import com.joostmsoftware.pfti.common.item.pets.PetItems.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import java.util.HashMap;
import java.util.Map;

public class PftiItems {
    public static final Map<String, Item> PETS = new HashMap<>();
    public static final StatusEffectPetItem MINING_PET1 = new MiningPetItem(StatusEffects.HASTE, 1, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem MINING_PET2 = new MiningPetItem(StatusEffects.HASTE, 2, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem MINING_PET3 = new MiningPetItem(StatusEffects.HASTE, 3, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem MINING_PET4 = new MiningPetItem(StatusEffects.HASTE, 4, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem MINING_PET5 = new MiningPetItem(StatusEffects.HASTE, 5, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem SUGAR_CANE_PET1 = new SugarCanePetItem(StatusEffects.SPEED, 1, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem SUGAR_CANE_PET2 = new SugarCanePetItem(StatusEffects.SPEED, 2, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem SUGAR_CANE_PET3 = new SugarCanePetItem(StatusEffects.SPEED, 3, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem SUGAR_CANE_PET4 = new SugarCanePetItem(StatusEffects.SPEED, 4, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem SUGAR_CANE_PET5 = new SugarCanePetItem(StatusEffects.SPEED, 5, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem IRON_GOLEM = new IronGolemPetItem(StatusEffects.RESISTANCE,1, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem IRON_GOLEM2 = new IronGolemPetItem(StatusEffects.RESISTANCE,2, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem IRON_GOLEM3 = new IronGolemPetItem(StatusEffects.RESISTANCE,3, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem IRON_GOLEM4 = new IronGolemPetItem(StatusEffects.RESISTANCE,4, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem IRON_GOLEM5 = new IronGolemPetItem(StatusEffects.RESISTANCE,5, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem CAT_PET = new CatPetItem(StatusEffects.NIGHT_VISION, 1, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem DOLPHIN_PET = new DolphinPetItem(StatusEffects.DOLPHINS_GRACE,1, new Item.Settings().group(Pfti.GROUP).maxCount(1));

    public static final PetItem TATER_PET = new TaterPetItem(1, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final PetItem CACTUS_PET = new CactusPetItem(1, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final PetItem SQUID_PET = new SquidPetItem(1, new Item.Settings().group(Pfti.GROUP).maxCount(1));


    public static final Item PET_SOUL = new Item(new Item.Settings().group(Pfti.GROUP));

    static {
        PETS.put("pet_soul", PET_SOUL);
        PETS.put("mining_pet", MINING_PET1);
        PETS.put("mining_pet_2", MINING_PET2);
        PETS.put("mining_pet_3", MINING_PET3);
        PETS.put("mining_pet_4", MINING_PET4);
        PETS.put("mining_pet_5", MINING_PET5);
        PETS.put("cat_pet", CAT_PET);
        PETS.put("sugar_cane_pet", SUGAR_CANE_PET1);
        PETS.put("sugar_cane_pet_2", SUGAR_CANE_PET2);
        PETS.put("sugar_cane_pet_3", SUGAR_CANE_PET3);
        PETS.put("sugar_cane_pet_4", SUGAR_CANE_PET4);
        PETS.put("sugar_cane_pet_5", SUGAR_CANE_PET5);
        PETS.put("iron_golem", IRON_GOLEM);
        PETS.put("iron_golem_2", IRON_GOLEM2);
        PETS.put("iron_golem_3", IRON_GOLEM3);
        PETS.put("iron_golem_4", IRON_GOLEM4);
        PETS.put("iron_golem_5", IRON_GOLEM5);
        PETS.put("tater_pet", TATER_PET);
        PETS.put("cactus_pet", CACTUS_PET);
        PETS.put("dolphin_pet", DOLPHIN_PET);
        PETS.put("squid_pet", SQUID_PET);
    }
}
