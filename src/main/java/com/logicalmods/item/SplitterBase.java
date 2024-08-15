package com.logicalmods.item;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.neoforged.neoforge.common.SimpleTier;

import java.util.ArrayList;

public class SplitterBase extends AxeItem {

    public SplitterBase(Tier p_40521_, Properties p_40524_) {
        super(p_40521_, p_40524_);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }
/*
    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        final ItemStack copy = itemStack.copy();
        if (copy.hurtAndBreak(9, null, null)){
            copy.shrink(1);
        }
    }

 */
}
