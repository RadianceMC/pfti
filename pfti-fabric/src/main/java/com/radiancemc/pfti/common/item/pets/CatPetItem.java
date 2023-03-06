package com.radiancemc.pfti.common.item.pets;

import com.radiancemc.pfti.api.core.pet.types.PetTypes;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CatPetItem extends StatusEffectPetItem {

    public CatPetItem(int petTier, PetTypes.StatusPetTypes type, Settings settings) {
        super(petTier, type, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("tooltip.catpetitem.info"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
