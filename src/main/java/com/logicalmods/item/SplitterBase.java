package com.logicalmods.item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;

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
