package com.infiniteam.butterminecraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MagicCrystalBlock extends Block {

    public MagicCrystalBlock() {
        super(Properties.create(Material.PACKED_ICE)
                .hardnessAndResistance(1.0f, 1.0f)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
                /*.setRequiresTool()*/
        );
    }
}
