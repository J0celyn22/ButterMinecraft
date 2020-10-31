package com.infiniteam.butterminecraft.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.GrassBlock;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraftforge.common.ToolType;

import java.util.function.ToIntFunction;

public class BlueMycelium extends GrassBlock {

    public BlueMycelium() {
        super(Properties.create(Material.EARTH)
                .hardnessAndResistance(1.0f, 1.0f)
                .harvestLevel(1)
                .harvestTool(ToolType.SHOVEL)
                //.setRequiresTool()
                //.variableOpacity()
        );
    }

}
