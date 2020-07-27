package com.github.rknull;

import com.github.rknull.block.Double_goods_furnace;
import com.github.rknull.block.ObsidianRubikCube;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,"otherscraft");
    public static RegistryObject<Block> double_goods_furnace = BLOCKS.register("double_goods_furnace",()->{
        return new Double_goods_furnace();
    });

    public static RegistryObject<Block> obsidianRubikCube = BLOCKS.register("obsidianRubikCube",()->{
        return new ObsidianRubikCube();
    });
}
