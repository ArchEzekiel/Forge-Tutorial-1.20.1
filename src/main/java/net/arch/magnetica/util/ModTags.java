package net.arch.magnetica.util;

import net.arch.magnetica.Magnetica;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Blocks
    {
        /*public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        public static final TagKey<Block> SAPPHIRE_ORES = tag("sapphire_ores");*/

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Magnetica.MOD_ID, name));
        }
    }

    public static class Items
    {

        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Magnetica.MOD_ID, name));
        }
    }
}
