package com.radiancemc.pfti.common.item.pets;

import com.radiancemc.pfti.api.core.pet.PetItem;
import com.radiancemc.pfti.api.core.pet.PetTypes;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TaterPetItem extends PetItem {


    public TaterPetItem(int petTier, PetTypes type, Item.Settings settings) {
        super(petTier, type, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("taterpetitem.info").formatted(Formatting.GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
