package com.joostmsoftware.pfti.item.pets.PetItems;

import com.joostmsoftware.pfti.item.pets.PetItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TaterPetItem extends PetItem {


    public TaterPetItem(int petTier, Settings settings) {
        super(petTier, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("taterpetitem.info").formatted(Formatting.GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
