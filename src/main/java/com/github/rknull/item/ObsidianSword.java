package com.github.rknull.item;

import com.github.rknull.ItemRegister;
import com.github.rknull.ModGroup;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class ObsidianSword extends SwordItem {
    private static IItemTier itemTier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 2000;
        }

        @Override
        public float getEfficiency() {
            return 10.0f;
        }

        @Override
        public float getAttackDamage() {
            return 4.0f;
        }

        @Override
        public int getHarvestLevel() {
            return 3;
        }

        @Override
        public int getEnchantability() {
            return 30;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(ItemRegister.obsidianIngot.get());
        }
    };

    public ObsidianSword(){
        super(itemTier,3,-2.4f,new Item.Properties().group(ModGroup.itemGroup));
    }
}
