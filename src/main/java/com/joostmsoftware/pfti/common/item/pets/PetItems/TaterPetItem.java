package com.joostmsoftware.pfti.common.item.pets.PetItems;

import com.joostmsoftware.pfti.common.item.pets.PetItem;
import com.joostmsoftware.pfti.core.api.pet.PetTypes;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TaterPetItem extends PetItem {


    public TaterPetItem(int petTier, PetTypes type, Settings settings) {
        super(petTier, type, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("taterpetitem.info").formatted(Formatting.GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }
}