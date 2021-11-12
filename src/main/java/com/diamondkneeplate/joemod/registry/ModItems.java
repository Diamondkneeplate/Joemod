package com.diamondkneeplate.joemod.registry;

import com.diamondkneeplate.joemod.Joemod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Items
    public static final Item joeite = new Item(new Item.Settings().group(Joemod.ITEM_GROUP));
    public static final Item rhysite = new Item(new Item.Settings().group(Joemod.ITEM_GROUP));
    public static final Item cool_joeite = new Item(new Item.Settings().group(Joemod.ITEM_GROUP));

    //Block items
    public static final BlockItem joeite_block = new BlockItem(ModBlocks.joeite_block, new Item.Settings().group(Joemod.ITEM_GROUP));
    public static final BlockItem gegul_man = new BlockItem(ModBlocks.gegul_man, new Item.Settings().group(Joemod.ITEM_GROUP));
    public static final BlockItem joeite_ore = new BlockItem(ModBlocks.joeite_ore, new Item.Settings().group(Joemod.ITEM_GROUP));
    
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Joemod.MODID, "joeite"), joeite);
        Registry.register(Registry.ITEM, new Identifier(Joemod.MODID, "rhysite"), rhysite);
        Registry.register(Registry.ITEM, new Identifier(Joemod.MODID, "cool_joeite"), cool_joeite);
        Registry.register(Registry.ITEM, new Identifier(Joemod.MODID, "joeite_block"), joeite_block);
        Registry.register(Registry.ITEM, new Identifier(Joemod.MODID, "gegul_man"), gegul_man);
        Registry.register(Registry.ITEM, new Identifier(Joemod.MODID, "joeite_ore"), joeite_ore);

    }
}