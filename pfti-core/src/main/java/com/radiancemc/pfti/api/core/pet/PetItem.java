package com.radiancemc.pfti.api.core.pet;

import com.radiancemc.pfti.api.core.pet.types.PetTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;

public class PetItem extends Item implements PetUtil {
    public int maxTier;

    PetTypes.CoreTypes coreType;

    public PetItem(PetTypes.CoreTypes coreType, Settings settings) {
        super(settings);
        this.coreType = coreType;
    }

    @Override
    public boolean hasPetInInventory(@NotNull PlayerEntity player, int slot) {
        return PetUtil.super.hasPetInInventory(player, slot);
    }

    @Override
    public boolean hasPetInOffhand(PlayerEntity player) {
        return PetUtil.super.hasPetInOffhand(player);
    }
}