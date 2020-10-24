package com.infiniteam.butterminecraft.items;

import com.infiniteam.butterminecraft.ButterMinecraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BadButterGalette extends Item {

    public BadButterGalette() {
        super(new Properties()
                .group(ButterMinecraft.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(5)
                        .effect(() -> new EffectInstance(Effects.HUNGER, 500, 1), 0.7f)
                        .effect(() -> new EffectInstance(Effects.POISON, 250, 1),0.7f)
                        .setAlwaysEdible()
                        .build())
        );
    }
}
