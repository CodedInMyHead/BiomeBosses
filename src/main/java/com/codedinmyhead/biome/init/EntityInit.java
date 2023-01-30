package com.codedinmyhead.biome.init;

import com.codedinmyhead.biome.entity.BananaEntity;
import com.codedinmyhead.biome.entity.FoxEntity;
import com.codedinmyhead.biome.entity.OtterEntity;
import com.codedinmyhead.biome.util.Util;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Util.MODID);

    public static final RegistryObject<EntityType<OtterEntity>> OTTER = ENTITIES.register("otter", () -> EntityType.Builder.of(OtterEntity::new, MobCategory.CREATURE).build(Util.MODID + ":otter"));
    public static final RegistryObject<EntityType<BananaEntity>> BANANA = ENTITIES.register("banana", () -> EntityType.Builder.of(BananaEntity::new, MobCategory.CREATURE).build(Util.MODID + ":banana"));
    public static final RegistryObject<EntityType<FoxEntity>> FOX = ENTITIES.register("fox", () -> EntityType.Builder.of(FoxEntity::new, MobCategory.CREATURE).build(Util.MODID + ":fox"));
}
