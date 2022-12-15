package com.joostmsoftware.pfti.common.custom.block;

import com.joostmsoftware.pfti.common.block.PftiBlockEntities;
import com.joostmsoftware.pfti.common.custom.blockEntities.PetSummoningAltarBlockEntity;
import com.joostmsoftware.pfti.common.stat.PftiStats;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import static net.minecraft.block.BlockWithEntity.checkType;

public class PetSummoningAltarBlock extends Block implements BlockEntityProvider {
    private static final Text TITLE = new TranslatableText("container.altar");

    public PetSummoningAltarBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new PetSummoningAltarBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return checkType(type, PftiBlockEntities.PET_SUMMONING_ALTAR, PetSummoningAltarBlockEntity::tick);
    }

    @Override
    public ActionResult onUse(BlockState blockState, World world, BlockPos blockPos, PlayerEntity player, Hand hand, BlockHitResult blockHitResult) {
        if (!world.isClient) {
            NamedScreenHandlerFactory screenHandlerFactory = blockState.createScreenHandlerFactory(world, blockPos);

            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory);
                player.increaseStat(PftiStats.INTERACT_WITH_PET_ALTAR, 1);
                return ActionResult.CONSUME;
            }
        }

        Inventory blockEntity = (Inventory) world.getBlockEntity(blockPos);

        if (!player.getStackInHand(hand).isEmpty()) {
            // Check what is the first open slot and put an item from the player's hand there
            if (blockEntity.getStack(0).isEmpty()) {
                // Put the stack the player is holding into the inventory
                blockEntity.setStack(0, player.getStackInHand(hand).copy());
                // Remove the stack from the player's hand
                player.getStackInHand(hand).setCount(0);
            } else if (blockEntity.getStack(1).isEmpty()) {
                blockEntity.setStack(1, player.getStackInHand(hand).copy());
                player.getStackInHand(hand).setCount(0);
            } else {
                // If the inventory is full we'll print its contents
                System.out.println("The first slot holds "
                        + blockEntity.getStack(0) + " and the second slot holds " + blockEntity.getStack(1));
            }
        } else {
            // If the player is not holding anything we'll get give him the items in the block entity one by one

            // Find the first slot that has an item and give it to the player
            if (!blockEntity.getStack(1).isEmpty()) {
                // Give the player the stack in the inventory
                player.getInventory().offerOrDrop(blockEntity.getStack(1));
                // Remove the stack from the inventory
                blockEntity.removeStack(1);
            } else if (!blockEntity.getStack(0).isEmpty()) {
                player.getInventory().offerOrDrop(blockEntity.getStack(0));
                blockEntity.removeStack(0);
            }
        }
        return ActionResult.SUCCESS;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof PetSummoningAltarBlockEntity) {
                ItemScatterer.spawn(world, pos, (PetSummoningAltarBlockEntity)blockEntity);
                // update comparators
                world.updateComparators(pos,this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Nullable
    @Override
    public NamedScreenHandlerFactory createScreenHandlerFactory(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedScreenHandlerFactory((i, playerInventory, playerEntity) -> new CraftingScreenHandler(i, playerInventory, ScreenHandlerContext.create(world, pos)), TITLE);
    }
}
