package com.infiniteam.butterminecraft.world.gen;

import com.infiniteam.butterminecraft.ButterMinecraft;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ButterMinecraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreGenHandler {

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            //Nether generation
            if (biome.getCategory() == Biome.Category.NETHER) {

                //End Generation
            } else if (biome.getCategory() == Biome.Category.THEEND) {

                //Overworld generation
            } else {

            }
        }
    }

    private static void genOre (Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler,
                                BlockState defaultBlockState, int size) {
        //CountRangeConfig range = new CountRangeConfig()
    }
}
