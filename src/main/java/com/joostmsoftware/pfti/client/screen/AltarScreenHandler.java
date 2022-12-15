package com.joostmsoftware.pfti.client.screen;

import com.joostmsoftware.pfti.common.screen.PftiScreens;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;

public class AltarScreenHandler extends ScreenHandler {
    //We save the blockPos we got from the Server and provide a getter for it so the BoxScreen can read that information
    private final Inventory inventory;

    public AltarScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, new SimpleInventory(5));
    }

    public AltarScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory) {
        super(PftiScreens.ALTAR_SCREEN_HANDLER, syncId);
        checkSize(inventory, 5);
        this.inventory = inventory;

        inventory.onOpen(playerInventory.player);



        this.addSlot(new Slot(inventory, 0, 86, 46));
        this.addSlot(new Slot(inventory, 1, 63, 23));
        this.addSlot(new Slot(inventory, 2, 110, 23));
        this.addSlot(new Slot(inventory, 3, 110, 69));
        this.addSlot(new Slot(inventory, 4, 63, 69));

        int m;
        int l;

        //The player inventory
        for (m = 0; m < 3; ++m) {
            for (l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + m * 9 + 9, 8 + l * 18, 84 + m * 18));
            }
        }
        //The player Hotbar
        for (m = 0; m < 9; ++m) {
            this.addSlot(new Slot(playerInventory, m, 8 + m * 18, 142));
        }
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        ItemStack newStack = ItemStack.EMPTY;

        Slot slot = this.slots.get(index);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (index < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }
        return newStack;
    }
}
