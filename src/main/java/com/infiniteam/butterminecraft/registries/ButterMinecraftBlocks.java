package com.infiniteam.butterminecraft.registries;

import com.infiniteam.butterminecraft.ButterMinecraft;
import com.infiniteam.butterminecraft.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.BushBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ButterMinecraftBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ButterMinecraft.MOD_ID);

    //public static final DeferredRegister<BushBlock> BUSH_BLOCK_DEFERRED_REGISTER = DeferredRegister.create(ForgeRegistries.BUSH_BLOCK_DEFERRED_REGISTER, ButterMinecraft.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> ETERNAL_ICE_BLOCK = BLOCKS.register("eternal_ice_block", EternalIceBlock::new);
    public static final RegistryObject<Block> MAGIC_CRYSTAL_BLOCK = BLOCKS.register("magic_crystal_block", MagicCrystalBlock::new);
    public static final RegistryObject<BushBlock> HYPOKUTE_GRASS = BLOCKS.register("hypokute_grass", HypokuteGrass::new);
    public static final RegistryObject<Block> BLUE_MYCELIUM_BLOCK = BLOCKS.register("blue_mycelium", BlueMycelium::new);
    public static final RegistryObject<Block> BLUE_MUSHROOM = BLOCKS.register("blue_mushroom", BlueMushroom::new);
    public static final RegistryObject<Block> BLUE_MUSHROOM_BLOCK = BLOCKS.register("blue_mushroom_block", BlueMushroomBlock::new);
    public static final RegistryObject<Block> SPOTTED_BLUE_MUSHROOM_BLOCK = BLOCKS.register("spotted_blue_mushroom_block", SpottedBlueMushroomBlock::new);
    public static final RegistryObject<Block> BLUE_MUSHROOM_STEM = BLOCKS.register("blue_mushroom_stem", BlueMushroomStem::new);
}
