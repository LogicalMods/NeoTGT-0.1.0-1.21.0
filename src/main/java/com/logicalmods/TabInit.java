package com.logicalmods;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TabInit {

    public static void register(IEventBus bus){
        TGTABS.register(bus);
    }

    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "tgtools" namespace
    public static final DeferredRegister<CreativeModeTab> TGTABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TreeGuyTools.MODID);

    // Creates a creative tab with the id "tgtools:example_tab" for the example item, that is placed after the combat tab
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = TGTABS.register("NeoTGT", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativeTab.tgtools"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemInit.T4_CLIPPERS.get().getDefaultInstance()).displayItems((parameters, output) -> {
                output.accept(ItemInit.T1_CLIPPERS.get());
                output.accept(ItemInit.T2_CLIPPERS.get());
                output.accept(ItemInit.T3_CLIPPERS.get());
                output.accept(ItemInit.T4_CLIPPERS.get());

                output.accept(ItemInit.T1_SPLITTER.get());
                output.accept(ItemInit.T2_SPLITTER.get());
                output.accept(ItemInit.T3_SPLITTER.get());
                output.accept(ItemInit.T4_SPLITTER.get());

                output.accept(ItemInit.FIREWOOD_LOG.get());
                output.accept(ItemInit.CHOPPED_LEAVES.get());
    }).build());
}
