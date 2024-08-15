package com.logicalmods.util;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class Tiers {

    public static final Tier T1 = new SimpleTier(
            BlockTags.LOGS,
            112,
            6,
            2.0f,
            20,
            ()-> Ingredient.of(Items.STONE)

    );    public static final Tier T2 = new SimpleTier(
            BlockTags.LOGS,
            224,
            7,
            2.2f,
            20,
            ()-> Ingredient.of(Items.IRON_INGOT)
    );
    public static final Tier T3 = new SimpleTier(
            BlockTags.LOGS,
            1344,
            8,
            2.9f,
            25,
            ()-> Ingredient.of(Items.DIAMOND)
    );
    public static final Tier T4 = new SimpleTier(
            BlockTags.LOGS,
            2240,
            10,
            3.3f,
            29,
            ()-> Ingredient.of(Items.NETHERITE_INGOT)
    );
}
