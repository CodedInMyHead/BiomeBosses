package com.codedinmyhead.biome.init;

import com.codedinmyhead.biome.items.Scythe;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import static com.codedinmyhead.biome.init.BlockInit.*;
import static com.codedinmyhead.biome.util.Util.MODID;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(EXAMPLE_BLOCK.get(), new Item.Properties()));
    public static final RegistryObject<Item> SCYTHE = ITEMS.register("scythe", () -> new Scythe(new Item.Properties()));
    public static final RegistryObject<Item> SWORD_ICE = ITEMS.register("sword_ice", () -> new Item(new Item.Properties()));



}
