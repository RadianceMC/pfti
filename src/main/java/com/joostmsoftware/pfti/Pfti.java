package com.joostmsoftware.pfti;

import com.joostmsoftware.pfti.common.registry.*;
import com.joostmsoftware.pfti.config.PftiConfig;
import com.radiancemc.radiancelib.api.config.BasePrismConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class Pfti implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Pfti");

    public static final String MOD_ID = "pfti";
    public static final String NAMESPACE = "PetsFromTheInventory";

    /**
     * Commonly used to link the identifier with the modid, and it's path.
     * @param path the path of where you want to store it.
     * @return a new Identifier with the provided modid and specified path.
     */
    public static Identifier ID(String path) {
        return new Identifier(MOD_ID, path);
    }

    public static final ItemGroup GROUP = FabricItemGroupBuilder.build(ID("group"), ()-> new ItemStack(Items.SPAWNER));

    public static PftiConfig.Config config;
    private static final File config_file = FabricLoader.getInstance().getConfigDir().resolve("pfti.json5").toFile();

    @Override
    public void onInitialize() {
        config = PftiConfig.load(config_file);

        ItemRegistry.registerItems();

        LootTableRegistry.loadModifiedLootTables();

        LOGGER.info("Loaded al registries from: Pets from the Inventory");
    }
}
