package com.joostmsoftware.pfti.common.custom.blockEntities;

import com.joostmsoftware.pfti.client.screen.AltarScreenHandler;
import com.joostmsoftware.pfti.common.block.PftiBlockEntities;
import com.joostmsoftware.pfti.common.item.PftiItems;
import com.joostmsoftware.pfti.core.api.ImplementedInventory;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PetSummoningAltarBlockEntity extends BlockEntity implements ImplementedInventory, ExtendedScreenHandlerFactory {
    private final DefaultedList<ItemStack> items = DefaultedList.ofSize(6, ItemStack.EMPTY);

    public PetSummoningAltarBlockEntity(BlockPos pos, BlockState state) {
        super(PftiBlockEntities.PET_SUMMONING_ALTAR, pos, state);
    }

    public static void tick(World world, BlockPos pos, BlockState state, PetSummoningAltarBlockEntity be) {
        if (world.isClient()) {
            return;
        }
    }

    private static boolean hasRecipe(PetSummoningAltarBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        return entity.getStack(0).getItem() == PftiItems.PET_SOUL;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, items);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, items);
        super.readNbt(nbt);
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.of(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return super.toInitialChunkDataNbt();
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return items;
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(pos);
    }

    @Override
    public Text getDisplayName() {
        return new TranslatableText(getCachedState().getBlock().getTranslationKey());
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int i, PlayerInventory playerInventory, PlayerEntity playerEntity) {
        return new AltarScreenHandler(i, playerInventory, this);
    }
}
