package com.shkethades.narutomod.client.entity.render;

import com.shkethades.narutomod.NarutoMod;
import com.shkethades.narutomod.client.entity.model.NinjaEntityModel;
import com.shkethades.narutomod.entity.NinjaEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class NinjaEntityRender extends MobRenderer<NinjaEntity, NinjaEntityModel<NinjaEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(NarutoMod.MOD_ID,
            "textures/entity/ninja_entity.png");

    public NinjaEntityRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new NinjaEntityModel<NinjaEntity>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(NinjaEntity entity) {
        return TEXTURE;
    }
}
