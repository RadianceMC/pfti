package com.radiancemc.pfti.api.core.pet;

import com.radiancemc.pfti.api.core.pet.types.PetTypes;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BasePetItem extends PetItem{

    public int currentTier;
    public PetTypes.BasePetTypes basePetTypes;

    public BasePetItem(int petTier, PetTypes.BasePetTypes basePetTypes, Settings settings) {
        super(basePetTypes.getCoreType(), settings);
        this.basePetTypes = basePetTypes;
        this.currentTier = petTier;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            for (int i = basePetTypes.getMinTier(); i <= basePetTypes.getMaxTier() + 1; i++) {
                if (i == currentTier && i == maxTier) {
                    tooltip.add(new TranslatableText("tooltip.petitem.tier_max", i).formatted(Formatting.AQUA));
                } else if (i == currentTier) {
                    tooltip.add(new TranslatableText("tooltip.petitem.tier", i).formatted(Formatting.AQUA));
                }
            }
        } else {
            tooltip.add(new TranslatableText("tooltip.petitem.shift").formatted(Formatting.GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
