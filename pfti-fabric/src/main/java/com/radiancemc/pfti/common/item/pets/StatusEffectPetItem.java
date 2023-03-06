package com.radiancemc.pfti.common.item.pets;

import com.radiancemc.pfti.Pfti;
import com.radiancemc.pfti.api.core.pet.PetItem;
import com.radiancemc.pfti.api.core.pet.types.PetTypes;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
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
    public PetTypes.StatusPetTypes statusPetTypes;
    public int currentTier;

    public StatusEffectPetItem(int petTier, PetTypes.StatusPetTypes statusPetTypes, Settings settings) {
        super(statusPetTypes.getCoreType(), settings);
        this.statusPetTypes = statusPetTypes;
        this.currentTier = petTier;
        statusEffect = statusPetTypes.getStatusEffect();
        effectDuration = Pfti.config.effectDuration;
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            for (int i = statusPetTypes.getMinTier(); i <= statusPetTypes.getMaxTier(); i++) {
                if (i == currentTier && i == maxTier) {
                    tooltip.add(new TranslatableText("tooltip.petitem.tier_max", i).formatted(Formatting.AQUA));
                    tooltip.add(new TranslatableText("tooltip.petitem.enchantment", statusEffect.getName()).formatted(Formatting.YELLOW));
                } else if (i == currentTier) {
                    tooltip.add(new TranslatableText("tooltip.petitem.tier", i).formatted(Formatting.AQUA));
                    tooltip.add(new TranslatableText("tooltip.petitem.enchantment", statusEffect.getName()).formatted(Formatting.YELLOW));
                }
            }
        } else {
            tooltip.add(new TranslatableText("tooltip.petitem.shift").formatted(Formatting.GRAY));
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (entity instanceof PlayerEntity player) {
                if (hasPetInInventory(player, slot)) {
                    for (int i = 1; i <= 5; i++) {
                        if (currentTier == i) {
                            player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, i-1, true, false, true));
                            break; // exit loop once the corresponding tier is found
                        }
                    }
                }
                if (hasPetInOffhand(player)) {
                    for (int i = 1; i <= 5; i++) {
                        if (currentTier == i) {
                            player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, i-1, true, false, true));
                            break; // exit loop once the corresponding tier is found
                        }
                    }
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
