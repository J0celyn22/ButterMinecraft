package com.infiniteam.butterminecraft.items;

import com.infiniteam.butterminecraft.ButterMinecraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ButterGalette extends Item {

    public ButterGalette() {
        super(new Item.Properties()
                .group(ButterMinecraft.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(12)
                        .effect(() -> new EffectInstance(Effects.HASTE, 72000, 1), 1)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
