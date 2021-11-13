package com.diamondkneeplate.joemod;

import com.diamondkneeplate.joemod.registry.ModBlocks;
import com.diamondkneeplate.joemod.registry.ModItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
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
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.minecraft.world.gen.YOffset;




public class Joemod implements ModInitializer {

    public static ConfiguredFeature<?, ?> JOEITE_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.joeite_ore.getDefaultState(), 9))
     .decorate(Decorator.RANGE.configure((new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.fixed(0), YOffset.fixed(225))))).spreadHorizontally().repeat(20));
      
    public static final ItemGroup Item_group = null;

    public static final String MODID = "joe";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier(MODID, "joemod"),
        () -> new ItemStack(ModItems.joeite));
    @Override
    public void onInitialize() {

        RegistryKey<ConfiguredFeature<?,?>> joeOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier("joe", "joeite_ore"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, joeOreOverworld.getValue(), JOEITE_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, joeOreOverworld);

        ModItems.registerItems();
        ModBlocks.registerBlocks();
    
        
    }
}