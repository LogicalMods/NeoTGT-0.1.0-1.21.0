package com.logicalmods.common;

import com.logicalmods.TreeGuyTools;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TabInit {

    //Register method
    public static void register(IEventBus bus){
        TGTABS.register(bus);
    }

    // Creates deferred register for tabs
    public static final DeferredRegister<CreativeModeTab> TGTABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TreeGuyTools.MODID);

    // Creates the tab itself and accepts items, BlockItem are accepted at the addCreative() in main
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TG_TAB = TGTABS.register("neotgt", () -> CreativeModeTab.builder()
            .title(Component.translatable("creativeTab.tgtools"))
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
