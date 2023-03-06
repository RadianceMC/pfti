package com.radiancemc.pfti.api.core.pet;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PetItem extends Item implements PetUtil {
    public int minTier;
    public int maxTier;
    public int currentTier;
    public PetTypes types;

    public PetItem(int petTier, PetTypes type, Settings settings) {
        super(settings);
        minTier = type.getMinTier();
        currentTier = petTier;
        maxTier = type.getMaxTier();
        types = type;
    }

    @Override
    public boolean hasPetInInventory(@NotNull PlayerEntity player, int slot) {
        return PetUtil.super.hasPetInInventory(player, slot);
    }

    @Override
    public boolean hasPetInOffhand(PlayerEntity player) {
        return PetUtil.super.hasPetInOffhand(player);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            for (int i = types.getMinTier(); i <= types.getMaxTier() + 1; i++) {
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