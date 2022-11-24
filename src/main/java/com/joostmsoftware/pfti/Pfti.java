package com.joostmsoftware.pfti;

import com.joostmsoftware.pfti.config.PftiConfig;
import com.joostmsoftware.pfti.registry.ItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pfti implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Pfti");

    private static final String MOD_ID = "pfti";
    public static final String NAMESPACE = "PetsFromTheInventory";

    public static Identifier ID(String path) {
        return new Identifier(MOD_ID, path);
    }

    public static final ItemGroup GROUP = FabricItemGroupBuilder.build(ID("group"), ()-> new ItemStack(Items.SPAWNER));

    @Override
    public void onInitialize() {
        PftiConfig.loadConfig();

        ItemRegistry.registerItems();

        LOGGER.info("Loaded al registries from: Pets from the Inventory");
    }
}
