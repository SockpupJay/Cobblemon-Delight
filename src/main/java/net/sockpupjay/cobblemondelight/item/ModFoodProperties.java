package net.sockpupjay.cobblemondelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties POKEBEEF = new FoodProperties.Builder().nutrition(6).saturationModifier(0.25f).build();

    public static final FoodProperties POKECHICKEN = new FoodProperties.Builder().nutrition(6).saturationModifier(0.25f).build();

    public static final FoodProperties POKELAMB = new FoodProperties.Builder().nutrition(6).saturationModifier(0.25f).build();

    public static final FoodProperties POKEFISH = new FoodProperties.Builder().nutrition(6).saturationModifier(0.25f).build();

    public static final FoodProperties POKEPORK = new FoodProperties.Builder().nutrition(6).saturationModifier(0.25f).build();

    public static final FoodProperties RAW = new FoodProperties.Builder().nutrition(2).saturationModifier(0.15f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 400), 0.35f).build();
}
