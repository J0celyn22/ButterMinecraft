package com.infiniteam.butterminecraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class BlueMycelium extends Block {

    public BlueMycelium() {
        super(Properties.create(Material.EARTH)
                .hardnessAndResistance(1.0f, 1.0f)
                .harvestLevel(1)
                .harvestTool(ToolType.SHOVEL)
                /*.setRequiresTool()*/
                //.lightLevel((state) -> 6))
                .variableOpacity()
        );
    }
}
