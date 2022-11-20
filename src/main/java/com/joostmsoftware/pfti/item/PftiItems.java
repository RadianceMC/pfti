package com.joostmsoftware.pfti.item;

import com.joostmsoftware.pfti.Pfti;
import com.joostmsoftware.pfti.item.pets.*;
import com.joostmsoftware.pfti.item.pets.PetItems.*;
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
    public static final PetItem TATER_PET = new TaterPetItem(1, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem CAT_PET = new CatPetItem(StatusEffects.NIGHT_VISION, 1, new Item.Settings().group(Pfti.GROUP).maxCount(1));
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
        PETS.put("tater_pet", TATER_PET);
    }
}
