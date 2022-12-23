package com.joostmsoftware.pfti.common.item.pets;

import com.joostmsoftware.pfti.Pfti;
import com.joostmsoftware.pfti.config.PftiConfig;
import com.joostmsoftware.pfti.core.api.pet.PetTypes;
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

    public StatusEffectPetItem(int petTier, PetTypes type, Settings settings) {
        super(petTier, type, settings);
        statusEffect = type.getStatusEffect();
        effectDuration = Pfti.config.effectDuration;
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            for (int i = types.getMinTier(); i <= types.getMaxTier(); i++) {
                if (i == currentTier && i == maxTier) {
                    tooltip.add(new TranslatableText("tooltip.petitem.enchantment", statusEffect.getName()).formatted(Formatting.YELLOW));
                } else if (i == currentTier) {
                    tooltip.add(new TranslatableText("tooltip.petitem.enchantment", statusEffect.getName()).formatted(Formatting.YELLOW));
                }
            }
        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient) {
            if (entity instanceof PlayerEntity player) {
                if (hasPetInInventory(player, slot)) {
                    if (currentTier == 1) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 0, true, false, true));
                    } else if (currentTier == 2) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 1, true, false, true));
                    } else if (currentTier == 3) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 2, true, false, true));
                    } else if (currentTier == 4) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 3, true, false, true));
                    } else if (currentTier == 5){
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 4, true, false, true));
                    }
                }
                if (player.getOffHandStack() == stack) {
                    if (currentTier == 1) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 0, true, false, true));
                    } else if (currentTier == 2) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 1, true, false, true));
                    } else if (currentTier == 3) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 2, true, false, true));
                    } else if (currentTier == 4) {
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 3, true, false, true));
                    } else if (currentTier == 5){
                        player.addStatusEffect(new StatusEffectInstance(statusEffect, effectDuration, 4, true, false, true));
                    }
                }
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
