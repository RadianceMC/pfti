package com.joostmsoftware.pfti.item.pets.PetItems;

import com.joostmsoftware.pfti.item.pets.StatusEffectPetItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SugarCanePetItem extends StatusEffectPetItem {

    public SugarCanePetItem(StatusEffect effect, int petTier, Settings settings) {
        super(effect, petTier, settings);
        statusEffect = effect;
        maxTier = setMaxTier(5);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(new TranslatableText("tooltip.sugarcanepetitem.info"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
