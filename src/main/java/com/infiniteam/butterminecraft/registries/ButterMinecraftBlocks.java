package com.infiniteam.butterminecraft.registries;

import com.infiniteam.butterminecraft.ButterMinecraft;
import com.infiniteam.butterminecraft.blocks.EternalIceBlock;
import com.infiniteam.butterminecraft.blocks.HypokuteGrass;
import com.infiniteam.butterminecraft.blocks.MagicCrystalBlock;
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
    public static final RegistryObject<BushBlock> HYPOKUTE_GRASS_BLOCK = BLOCKS.register("hypokute_grass", HypokuteGrass::new);
}
