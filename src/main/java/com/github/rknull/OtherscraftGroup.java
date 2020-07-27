package com.github.rknull;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class OtherscraftGroup extends ItemGroup {
    public OtherscraftGroup(){
        super("otherscraft_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegister.obsidianIngot.get());
    }
}
