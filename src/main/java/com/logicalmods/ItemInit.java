package com.logicalmods;

import com.logicalmods.fuel.FuelItemBase;
import com.logicalmods.item.ClipperBase;
import com.logicalmods.item.SplitterBase;
import com.logicalmods.util.Tiers;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemInit {

    //Register method
    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }

    // Create a Deferred Register to hold Items which will all be registered under the "tgtools" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TreeGuyTools.MODID);

    // Creates a new BlockItem with the id "tgtools:example_block", combining the namespace and path
    //public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem("example_block", BlockInit.EXAMPLE_BLOCK);

    // Clipper list
    public static final DeferredItem<Item> T1_CLIPPERS = ITEMS.register("t1_clippers", () -> new ClipperBase(new Item.Properties().durability(56)));
    public static final DeferredItem<Item> T2_CLIPPERS = ITEMS.register("t2_clippers", () -> new ClipperBase(new Item.Properties().durability(112)));
    public static final DeferredItem<Item> T3_CLIPPERS = ITEMS.register("t3_clippers", () -> new ClipperBase(new Item.Properties().durability(672)));
    public static final DeferredItem<Item> T4_CLIPPERS = ITEMS.register("t4_clippers", () -> new ClipperBase(new Item.Properties().durability(1120)));

    //Splitter list
    public static final DeferredItem<Item> T1_SPLITTER = ITEMS.register("t1_splitter", () -> new SplitterBase(Tiers.T1, new Item.Properties()));
    public static final DeferredItem<Item> T2_SPLITTER = ITEMS.register("t2_splitter", () -> new SplitterBase(Tiers.T2, new Item.Properties()));
    public static final DeferredItem<Item> T3_SPLITTER = ITEMS.register("t3_splitter", () -> new SplitterBase(Tiers.T3, new Item.Properties()));
    public static final DeferredItem<Item> T4_SPLITTER = ITEMS.register("t4_splitter", () -> new SplitterBase(Tiers.T4, new Item.Properties()));

    //Fuel item list
    public static final DeferredItem<Item> FIREWOOD_LOG = ITEMS.register("firewood", () -> new FuelItemBase(new Item.Properties().stacksTo(16), 400));
    public static final DeferredItem<Item> CHOPPED_LEAVES = ITEMS.register("chopped_leaves", () -> new FuelItemBase(new Item.Properties().stacksTo(32), 285));


}
