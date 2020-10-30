package com.infiniteam.butterminecraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlueMushroomBlock extends Block {

    public BlueMushroomBlock() {
        super(Properties.create(Material.ORGANIC)
                .hardnessAndResistance(1.0f, 1.0f)
                .harvestLevel(1)
                .harvestTool(ToolType.HOE)
                /*.setRequiresTool()*/
                .variableOpacity()
        );
    }
}
