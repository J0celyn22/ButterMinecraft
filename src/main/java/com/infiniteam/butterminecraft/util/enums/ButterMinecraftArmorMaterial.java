package com.infiniteam.butterminecraft.util.enums;

import com.infiniteam.butterminecraft.ButterMinecraft;
import com.infiniteam.butterminecraft.registries.ButterMinecraftItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ButterMinecraftArmorMaterial implements IArmorMaterial {

    ETERNAL_ICE(ButterMinecraft.MOD_ID + ":eternal_ice", 28, new int[] { 4, 7, 9, 4 }, 28,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, () ->  {return Ingredient.fromItems(ButterMinecraftItems.ETERNAL_ICE_ITEM.get()); } , 0);

    /*SPIRIT_EBONY(ButterMinecraft.MOD_ID + ":spirit_ebony", 30, new int[] { 3, 7, 8, 3 }, 33,
    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, () ->  {return Ingredient.fromItems(RegistryHandler.SPIRIT_EBONY_BLOCK.get()); });*/

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 11, 16, 15, 13 };
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    ButterMinecraftArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
                                 SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
