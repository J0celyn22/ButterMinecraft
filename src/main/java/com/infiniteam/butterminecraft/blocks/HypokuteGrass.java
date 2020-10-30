package com.infiniteam.butterminecraft.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HypokuteGrass extends BushBlock {

    public HypokuteGrass(/*Block.Properties properties*/) {
        super(/*properties);*/
                AbstractBlock.Properties.create(Material.PLANTS)
                //.hardnessAndResistance(0.0f, 0.0f)
                .zeroHardnessAndResistance()
                .harvestLevel(4)
                .harvestTool(ToolType.HOE)
                .notSolid()
                //.doesNotBlockMovement().notOpaque().pushDestroys().build()
                //.notOpaque()
                /*.setRequiresTool()*/
                .sound(SoundType.WET_GRASS) //TODO changer le son
        );/**/
    }
}
