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
                        .with(TagEntry.m_qvbpbjtq(TagRegistry.PETS));
                tableBuilder.pool(poolBuilder);
            }

            if (source.isBuiltin() && LootTables.ABANDONED_MINESHAFT_CHEST.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .conditionally(RandomChanceLootCondition.builder(0.10f))
                        .with(TagEntry.m_qvbpbjtq(TagRegistry.MINING_PETS));
                tableBuilder.pool(poolBuilder);
            }
        });
    }
}
