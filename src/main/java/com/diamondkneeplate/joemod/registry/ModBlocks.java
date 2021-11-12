package com.diamondkneeplate.joemod.registry;

import java.nio.file.Path;

import com.diamondkneeplate.joemod.Joemod;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block ;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.block.Material;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.fabricmc.fabric.impl.object.builder.FabricBlockInternals.MiningLevel;

public class ModBlocks {

    public static final Block joeite_block = new Block(FabricBlockSettings
    .of(Material.METAL)
    .hardness(30f)
    .breakByTool(FabricToolTags.PICKAXES, 2)
    .resistance(800f)
    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
    .luminance(15)
    .requiresTool());

    public static final Block gegul_man = new Block(FabricBlockSettings
    .of(Material.METAL)
    .hardness(30f)
    .breakByTool(FabricToolTags.PICKAXES, 2)
    .resistance(800f)
    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
    .luminance(15)
    .requiresTool());


    public static final Block joeite_ore = new Block(FabricBlockSettings
    .of(Material.METAL)
    .hardness(10f)
    .breakByTool(FabricToolTags.PICKAXES, 2)
    .resistance(800f)
    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
    .luminance(15)
    .requiresTool());

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Joemod.MODID, "joeite_block"), joeite_block);
        Registry.register(Registry.BLOCK, new Identifier(Joemod.MODID, "gegul_man"), gegul_man);
        Registry.register(Registry.BLOCK, new Identifier(Joemod.MODID, "joeite_ore"), joeite_ore);
    }
}