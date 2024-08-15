package com.logicalmods.util;

import com.logicalmods.TreeGuyTools;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class Tags {

    public static final TagKey<Block> BLOCH_HOLDER_TAG = TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(TreeGuyTools.MODID, "block_holder"));

    public static final TagKey<Item> SPLITTER = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(TreeGuyTools.MODID, "splitters_tag"));
    public static final TagKey<Item> CLIPPER = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(TreeGuyTools.MODID, "clippers_tag"));
    public static final TagKey<Item> LEAVES = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(TreeGuyTools.MODID, "leaves"));
    public static final TagKey<Item> STRIPPED_LOGS = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.fromNamespaceAndPath(TreeGuyTools.MODID, "stripped_logs"));
}
