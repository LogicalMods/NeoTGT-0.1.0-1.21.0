package com.logicalmods;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockInit {

    public static void register(IEventBus bus){
        BLOCKS.register(bus);
    }

    // Create a Deferred Register to hold Blocks which will all be registered under the "tgtools" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TreeGuyTools.MODID);

    // Creates a new Block with the id "tgtools:example_block", combining the namespace and path
    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
}
