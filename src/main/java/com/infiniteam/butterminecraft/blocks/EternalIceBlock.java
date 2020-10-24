package com.infiniteam.butterminecraft.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EternalIceBlock extends Block {

    public EternalIceBlock() {
        super(AbstractBlock.Properties.create(Material.PACKED_ICE)
                .hardnessAndResistance(1.0f, 1.0f)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
                /*.setRequiresTool()*/
        );
    }
}
