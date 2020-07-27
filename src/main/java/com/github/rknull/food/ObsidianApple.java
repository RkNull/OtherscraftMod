package com.github.rknull.food;

import com.github.rknull.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ObsidianApple extends Item {
    //创建一个药水效果实例
    private static EffectInstance effectInstance = new EffectInstance(Effects.POISON,3*20,1);
    //创建一个food(食物)对象并设置属性
    private static Food food = (new Food.Builder())
            .saturation(10)//饱食度
            .hunger(20)//回复饥饿度
            .effect(effectInstance,0.5f)//触发药水效果，1为百分百触发
            .build();
    public ObsidianApple(){
        super(new Properties().food(food).group(ModGroup.itemGroup));//把这个物品放在食物创造栏里
    }
}
