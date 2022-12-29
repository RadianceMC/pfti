package com.radiancemc.pfti.common.registry;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.TagEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

public class LootTableRegistry {

    public static void loadModifiedLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (source.isBuiltin() && LootTables.DESERT_PYRAMID_CHEST.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(TagEntry.builder(TagRegistry.CACTUS_PET));
                tableBuilder.pool(poolBuilder);
            }

            if (source.isBuiltin() && LootTables.ABANDONED_MINESHAFT_CHEST.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(TagEntry.expandBuilder(TagRegistry.MINING_PETS));
                tableBuilder.pool(poolBuilder);
            }

            if (source.isBuiltin() && LootTables.BURIED_TREASURE_CHEST.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(TagEntry.expandBuilder(TagRegistry.DOLPHIN_PET));
                tableBuilder.pool(poolBuilder);
            }

            if (source.isBuiltin() &&
                    LootTables.VILLAGE_ARMORER_CHEST.equals(id) ||
                    LootTables.VILLAGE_BUTCHER_CHEST.equals(id) ||
                    LootTables.VILLAGE_CARTOGRAPHER_CHEST.equals(id) ||
                    LootTables.VILLAGE_DESERT_HOUSE_CHEST.equals(id) ||
                    LootTables.VILLAGE_FISHER_CHEST.equals(id) ||
                    LootTables.VILLAGE_FLETCHER_CHEST.equals(id) ||
                    LootTables.VILLAGE_MASON_CHEST.equals(id) ||
                    LootTables.VILLAGE_PLAINS_CHEST.equals(id) ||
                    LootTables.VILLAGE_SAVANNA_HOUSE_CHEST.equals(id) ||
                    LootTables.VILLAGE_SHEPARD_CHEST.equals(id) ||
                    LootTables.VILLAGE_SNOWY_HOUSE_CHEST.equals(id) ||
                    LootTables.VILLAGE_TAIGA_HOUSE_CHEST.equals(id) ||
                    LootTables.VILLAGE_TOOLSMITH_CHEST.equals(id) ||
                    LootTables.VILLAGE_TANNERY_CHEST.equals(id) ||
                    LootTables.VILLAGE_TEMPLE_CHEST.equals(id) ||
                    LootTables.VILLAGE_WEAPONSMITH_CHEST.equals(id)
            ) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(TagEntry.expandBuilder(TagRegistry.IRON_GOLEM_PETS));
                tableBuilder.pool(poolBuilder);
            }

            if (source.isBuiltin() && LootTables.JUNGLE_TEMPLE_CHEST.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(TagEntry.expandBuilder(TagRegistry.CAT_PET));
                tableBuilder.pool(poolBuilder);
            }

            if (source.isBuiltin() && LootTables.SHIPWRECK_TREASURE_CHEST.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(TagEntry.expandBuilder(TagRegistry.PETS));
                tableBuilder.pool(poolBuilder);
            }
        });
    }
}
