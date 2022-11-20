package com.joostmsoftware.pfti.item.pets;

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

    public StatusEffectPetItem(StatusEffect effect, int petTier, Settings settings) {
        super(petTier, settings);
        statusEffect = effect;
        effectDuration = 5;
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
