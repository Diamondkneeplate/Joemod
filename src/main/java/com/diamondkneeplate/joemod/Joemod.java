package com.diamondkneeplate.joemod;

import com.diamondkneeplate.joemod.registry.ModBlocks;
import com.diamondkneeplate.joemod.registry.ModItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootTableEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.util.Identifier;




public class Joemod implements ModInitializer {
    public static final ItemGroup Item_group = null;

    public static final String MODID = "joe";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier(MODID, "joemod"),
        () -> new ItemStack(ModItems.joeite));
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    
        
    }
}