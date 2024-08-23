package com.logicalmods.common;

import com.logicalmods.TreeGuyTools;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockInit {

    //Register method
    public static void register(IEventBus bus){
        BLOCKS.register(bus);
    }

    //Creates deferred register for blocks themselves, BlockItem will be accepted at addCreative() in main
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TreeGuyTools.MODID);

    // Creates a new block
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
}
