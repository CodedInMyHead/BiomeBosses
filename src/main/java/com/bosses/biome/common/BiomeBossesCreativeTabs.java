package com.bosses.biome.common;


import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class BiomeBossesCreativeTabs {

    public static final CreativeModeTab MICHA = CreativeModeTab.builder(CreativeModeTab.Row.BOTTOM, 0)
            .title(Component.translatable("itemGroup.micha"))
            .icon(() -> new ItemStack(Items.DIAMOND_PICKAXE))
            .displayItems((p_260132_, p_259554_, p_259053_) -> {})
            .build();

    public static final CreativeModeTab FLORIAN = CreativeModeTab.builder(CreativeModeTab.Row.BOTTOM, 0)
            .title(Component.translatable("itemGroup.florian"))
            .icon(() -> new ItemStack(Items.DIAMOND_PICKAXE))
            .displayItems((p_260132_, p_259554_, p_259053_) -> {
            })
            .build();

    public static final CreativeModeTab SHANINE = CreativeModeTab.builder(CreativeModeTab.Row.BOTTOM, 0)
            .title(Component.translatable("itemGroup.shanine"))
            .icon(() -> new ItemStack(Items.DIAMOND_PICKAXE))
            .displayItems((p_260132_, p_259554_, p_259053_) -> {
            })
            .build();

    public static final CreativeModeTab LEGACY = CreativeModeTab.builder(CreativeModeTab.Row.BOTTOM, 0)
            .title(Component.translatable("itemGroup.legacy"))
            .icon(() -> new ItemStack(Items.DIAMOND_PICKAXE))
            .displayItems((p_260132_, p_259554_, p_259053_) -> {
            })
            .build();
}
