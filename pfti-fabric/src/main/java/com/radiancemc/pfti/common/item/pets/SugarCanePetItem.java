package com.radiancemc.pfti.common.item.pets;

import com.radiancemc.pfti.api.core.pet.PetTypes;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SugarCanePetItem extends StatusEffectPetItem {


    public SugarCanePetItem(int petTier, PetTypes type, Settings settings) {
        super(petTier, type, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("tooltip.sugarcanepetitem.info"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
