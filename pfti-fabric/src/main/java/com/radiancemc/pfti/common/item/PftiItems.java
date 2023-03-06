package com.radiancemc.pfti.common.item;

import com.radiancemc.pfti.Pfti;
import com.radiancemc.pfti.api.core.pet.BasePetItem;
import com.radiancemc.pfti.api.core.pet.PetItem;
import com.radiancemc.pfti.api.core.pet.types.PetTypes;
import com.radiancemc.pfti.common.item.pets.*;
import net.minecraft.item.Item;
import java.util.HashMap;
import java.util.Map;

public class PftiItems {
    public static final Map<String, PetItem> PETS = new HashMap<>();
    public static final Map<String, Item> ITEMS = new HashMap<>();
    public static final StatusEffectPetItem MINING_PET1 = new MiningPetItem(1, PetTypes.StatusPetTypes.MINING, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem MINING_PET2 = new MiningPetItem(2, PetTypes.StatusPetTypes.MINING, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem MINING_PET3 = new MiningPetItem(3, PetTypes.StatusPetTypes.MINING, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem MINING_PET4 = new MiningPetItem(4, PetTypes.StatusPetTypes.MINING, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem MINING_PET5 = new MiningPetItem(5, PetTypes.StatusPetTypes.MINING, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem SUGAR_CANE_PET1 = new SugarCanePetItem(1, PetTypes.StatusPetTypes.SUGARCANE, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem SUGAR_CANE_PET2 = new SugarCanePetItem(2, PetTypes.StatusPetTypes.SUGARCANE, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem SUGAR_CANE_PET3 = new SugarCanePetItem(3, PetTypes.StatusPetTypes.SUGARCANE, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem SUGAR_CANE_PET4 = new SugarCanePetItem(4, PetTypes.StatusPetTypes.SUGARCANE, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem SUGAR_CANE_PET5 = new SugarCanePetItem(5, PetTypes.StatusPetTypes.SUGARCANE, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem IRON_GOLEM = new IronGolemPetItem(1, PetTypes.StatusPetTypes.IRON_GOLEM, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem IRON_GOLEM2 = new IronGolemPetItem(2, PetTypes.StatusPetTypes.IRON_GOLEM, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem IRON_GOLEM3 = new IronGolemPetItem(3, PetTypes.StatusPetTypes.IRON_GOLEM , new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem IRON_GOLEM4 = new IronGolemPetItem(4, PetTypes.StatusPetTypes.IRON_GOLEM, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem IRON_GOLEM5 = new IronGolemPetItem(5, PetTypes.StatusPetTypes.IRON_GOLEM, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem CAT_PET = new CatPetItem( 1, PetTypes.StatusPetTypes.CAT, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final StatusEffectPetItem DOLPHIN_PET = new DolphinPetItem(1, PetTypes.StatusPetTypes.DOLPHIN, new Item.Settings().group(Pfti.GROUP).maxCount(1));

    public static final BasePetItem TATER_PET = new TaterPetItem(1, PetTypes.BasePetTypes.TATER, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final BasePetItem CACTUS_PET = new CactusPetItem(1, PetTypes.BasePetTypes.CACTUS, new Item.Settings().group(Pfti.GROUP).maxCount(1));
    public static final BasePetItem BEE_PET = new BeePetItem(1, PetTypes.BasePetTypes.BEE, new Item.Settings().group(Pfti.GROUP).maxCount(1));


    public static final Item PET_SOUL = new Item(new Item.Settings().group(Pfti.GROUP));

    static {
        ITEMS.put("pet_soul", PET_SOUL);

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
        PETS.put("bee_pet", BEE_PET);
    }
}
