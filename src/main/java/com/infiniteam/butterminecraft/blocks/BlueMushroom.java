package com.infiniteam.butterminecraft.blocks;

import net.minecraft.block.MushroomBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlueMushroom extends MushroomBlock {

    public BlueMushroom() {
        super(Properties.create(Material.PLANTS)
                .hardnessAndResistance(1.0f, 1.0f)
                .harvestLevel(1)
                .harvestTool(ToolType.HOE)
                /*.setRequiresTool()*/
                .variableOpacity()
        );
    }
}
