package com.shkethades.narutomod.init;

import com.shkethades.narutomod.NarutoMod;
import com.shkethades.narutomod.entities.AlliedNinjaEntity;
import com.shkethades.narutomod.entities.NinjaEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class NarutoEntities {
    public static final DeferredRegister<EntityType<?>> NINJA_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, NarutoMod.MOD_ID);
    public static final RegistryObject<EntityType<NinjaEntity>> NINJA_ENTITY = NINJA_TYPES.register("ninja_entity",
            () -> EntityType.Builder.<NinjaEntity>create(NinjaEntity::new, EntityClassification.CREATURE).size(0.9f, 1.3f).build(new ResourceLocation(NarutoMod.MOD_ID, "ninja_entity").toString()));
    public static final RegistryObject<EntityType<AlliedNinjaEntity>> ALLIED_NINJA_ENTITY = NINJA_TYPES.register("allied_ninja_entity",
            () -> EntityType.Builder.<AlliedNinjaEntity>create(AlliedNinjaEntity::new, EntityClassification.CREATURE).size(0.9f, 1.3f).build(new ResourceLocation(NarutoMod.MOD_ID, "allied_ninja_entity").toString()));
    // TODO: 6/7/20  public static final RegistryObject<EntityType<>> SHURIKEN = ENTITY_TYPES.register();
}