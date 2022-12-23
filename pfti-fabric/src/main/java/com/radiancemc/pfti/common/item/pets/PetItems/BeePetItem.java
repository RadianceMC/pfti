package com.radiancemc.pfti.common.item.pets.PetItems;

import com.radiancemc.pfti.common.item.pets.PetItem;
import com.radiancemc.pfti.api.core.pet.PetTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class BeePetItem extends PetItem {


    public BeePetItem(int petTier, @NotNull PetTypes type, Settings settings) {
        super(petTier, type, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int range = 10;
        if (randomize(range) == 1) {
            /*
             *  this is a 1/10 change it inflicts poison on the target when the attacker is using an item
             *  (TODO) I would love to change this into when the player is using a weapon/tool
             */
            if (attacker.isPlayer() && attacker.isUsingItem()) {
                target.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON));
            }
        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private static int randomize(int maxRange) {
        Random random = new Random();
        return random.nextInt(maxRange);
    }
}
