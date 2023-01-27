package com.bosses.biome.init;

import com.bosses.biome.entity.OtterEntity;
import com.bosses.biome.util.Util;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Util.MODID);

    public static final RegistryObject<EntityType<OtterEntity>> FOX = ENTITIES.register("fox", () -> EntityType.Builder.of(OtterEntity::new, MobCategory.CREATURE).build(Util.MODID + ":fox"));
}
