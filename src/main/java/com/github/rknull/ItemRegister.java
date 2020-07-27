package com.github.rknull;

import com.github.rknull.food.ObsidianApple;
import com.github.rknull.item.ObsidianIngot;
import com.github.rknull.item.ObsidianSword;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegister {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,"otherscraft");
    public static RegistryObject<Item> obsidianIngot = ITEMS.register("obsidian_ingot",()->{
        return new ObsidianIngot();
    });

    public static RegistryObject<Item> obsidianApple = ITEMS.register("obsidian_apple",()->{
        return new ObsidianApple();
    });

    public static RegistryObject<Item> obsidianSword = ITEMS.register("obsidian_sword",()->{
        return  new ObsidianSword();
    });

    public static RegistryObject<Item> double_goods_furnace = ITEMS.register("double_goods_furnace",()->{
        return new BlockItem(BlockRegister.double_goods_furnace.get(),new Item.Properties().group(ModGroup.itemGroup));
    });

    public static RegistryObject<Item> obsidianRubikCube = ITEMS.register("obsidianRubikCube",()->{
        return new BlockItem(BlockRegister.obsidianRubikCube.get(),new Item.Properties().group(ModGroup.itemGroup));
    });
}
