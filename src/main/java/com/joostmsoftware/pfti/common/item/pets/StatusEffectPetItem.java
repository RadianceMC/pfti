package com.joostmsoftware.pfti.common.item.pets;

import com.joostmsoftware.pfti.Pfti;
import com.joostmsoftware.pfti.config.PftiConfig;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class StatusEffectPetItem extends PetItem {
    public StatusEffect statusEffect;
    public static int effectDuration;



    public StatusEffectPetItem(StatusEffect effect, int petTier, Settings settings) {
        super(petTier, settings);
        statusEffect = effect;
        effectDuration = PftiConfig.effectDuration;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            for (int i = this.getMinTier(); i <= 5; i++) {
                if (i == currentTier && i == maxTier && i == 1 ) {
                    tooltip.add(new TranslatableText("tooltip.petitem.tier_max", i).formatted(Formatting.AQUA));
                    tooltip.add(new TranslatableText("tooltip.petitem.enchantment", statusEffect.getName()).formatted(Formatting.YELLOW));
                } else {
                    if (i == currentTier && i == 1) {
                        tooltip.add(new TranslatableText("tooltip.petitem.tier", i).formatted(Formatting.AQUA));
                        tooltip.add(new TranslatableText("tooltip.petitem.enchantment", statusEffect.getName()).formatted(Formatting.YELLOW));
                    } else if (i == currentTier && i == 2) {
                        tooltip.add(new TranslatableText("tooltip.petitem.tier", i).formatted(Formatting.AQUA));
                        tooltip.add(new TranslatableText("tooltip.petitem.enchantment", statusEffect.getName()).formatted(Formatting.YELLOW));
                    } else if (i == currentTier && i == 3) {
                        tooltip.add(new TranslatableText("tooltip.petitem.tier", i).formatted(Formatting.AQUA));
                        tooltip.add(new TranslatableText("tooltip.petitem.enchantment", statusEffect.getName()).formatted(Formatting.YELLOW));
                    } else if (i == currentTier && i == 4) {
                        tooltip.add(new TranslatableText("tooltip.petitem.tier", i).formatted(Formatting.AQUA));
                        tooltip.add(new TranslatableText("tooltip.petitem.enchantment", statusEffect.getName()).formatted(Formatting.YELLOW));
                    } else if (i == currentTier && i == maxTier && i == 5) {
                        tooltip.add(new TranslatableText("tooltip.petitem.tier_max", i).formatted(Formatting.AQUA));
                        tooltip.add(new TranslatableText("tooltip.petitem.enchantment", statusEffect.getName()).formatted(Formatting.YELLOW));
                    }
                }
            }
        }else {
            tooltip.add(new TranslatableText("tooltip.petitem.shift").formatted(Formatting.GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }
}
