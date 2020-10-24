package com.infiniteam.butterminecraft.registries;

import com.infiniteam.butterminecraft.ButterMinecraft;
import com.infiniteam.butterminecraft.blocks.BlockItemBase;
import com.infiniteam.butterminecraft.items.BadButterGalette;
import com.infiniteam.butterminecraft.items.ButterGalette;
import com.infiniteam.butterminecraft.items.ItemBase;
import com.infiniteam.butterminecraft.util.enums.ButterMinecraftArmorMaterial;
import com.infiniteam.butterminecraft.util.enums.ButterMinecraftItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ButterMinecraftItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ButterMinecraft.MOD_ID);

    //Items
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", ItemBase::new);
    public static final RegistryObject<Item> UNSALTED_BUTTER = ITEMS.register("unsalted_butter", ItemBase::new);
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", ItemBase::new);
    public static final RegistryObject<ButterGalette> BUTTER_GALETTE = ITEMS.register("butter_galette", ButterGalette::new);
    public static final RegistryObject<BadButterGalette> BAD_BUTTER_GALETTE = ITEMS.register("bad_butter_galette", BadButterGalette::new);

    //Tools
    public static final RegistryObject<SwordItem> ETERNAL_ICE_SWORD = ITEMS.register("eternal_ice_sword",
            () -> new SwordItem(ButterMinecraftItemTier.ETERNAL_ICE, 8, -2.4f, new Item.Properties().group(ButterMinecraft.TAB)));

    public static final RegistryObject<PickaxeItem> ETERNAL_ICE_PICKAXE = ITEMS.register("eternal_ice_pickaxe",
            () -> new PickaxeItem(ButterMinecraftItemTier.ETERNAL_ICE, 6, -2.8f, new Item.Properties().group(ButterMinecraft.TAB)));

    public static final RegistryObject<ShovelItem> ETERNAL_ICE_SHOVEL = ITEMS.register("eternal_ice_shovel",
            () -> new ShovelItem(ButterMinecraftItemTier.ETERNAL_ICE, 6.5f, -3f, new Item.Properties().group(ButterMinecraft.TAB)));

    public static final RegistryObject<AxeItem> ETERNAL_ICE_AXE = ITEMS.register("eternal_ice_axe",
            () -> new AxeItem(ButterMinecraftItemTier.ETERNAL_ICE, 10, -3f, new Item.Properties().group(ButterMinecraft.TAB)));

    public static final RegistryObject<HoeItem> ETERNAL_ICE_HOE = ITEMS.register("eternal_ice_hoe",
            () -> new HoeItem(ButterMinecraftItemTier.ETERNAL_ICE, 1, 0, new Item.Properties().group(ButterMinecraft.TAB)));

    //Armors
    public static final RegistryObject<ArmorItem> ETERNAL_ICE_HELMET = ITEMS.register("eternal_ice_helmet",
            () -> new ArmorItem(ButterMinecraftArmorMaterial.ETERNAL_ICE, EquipmentSlotType.HEAD, new Item.Properties().group(ButterMinecraft.TAB)));

    public static final RegistryObject<ArmorItem> ETERNAL_ICE_CHESTPLATE = ITEMS.register("eternal_ice_chestplate",
            () -> new ArmorItem(ButterMinecraftArmorMaterial.ETERNAL_ICE, EquipmentSlotType.CHEST, new Item.Properties().group(ButterMinecraft.TAB)));

    public static final RegistryObject<ArmorItem> ETERNAL_ICE_LEGGINGS = ITEMS.register("eternal_ice_leggings",
            () -> new ArmorItem(ButterMinecraftArmorMaterial.ETERNAL_ICE, EquipmentSlotType.LEGS, new Item.Properties().group(ButterMinecraft.TAB)));

    public static final RegistryObject<ArmorItem> ETERNAL_ICE_BOOTS = ITEMS.register("eternal_ice_boots",
            () -> new ArmorItem(ButterMinecraftArmorMaterial.ETERNAL_ICE, EquipmentSlotType.FEET, new Item.Properties().group(ButterMinecraft.TAB)));

    //Block Items
    public static final RegistryObject<Item> ETERNAL_ICE_ITEM = ITEMS.register("eternal_ice_block",
            () -> new BlockItemBase(ButterMinecraftBlocks.ETERNAL_ICE_BLOCK.get()));

    public static final RegistryObject<Item> MAGIC_CRYSTAL_ITEM = ITEMS.register("magic_crystal_block",
            () -> new BlockItemBase(ButterMinecraftBlocks.MAGIC_CRYSTAL_BLOCK.get()));

    public static final RegistryObject<Item> HYPOKUTE_GRASS_ITEM = ITEMS.register("hypokute_grass",
            () -> new BlockItemBase(ButterMinecraftBlocks.HYPOKUTE_GRASS_BLOCK.get()));
}
