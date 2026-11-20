package net.sockpupjay.cobblemondelight.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties POKEBEEF = new FoodProperties.Builder().nutrition(8).saturationModifier(12.08f).build();

    public static final FoodProperties POKECHICKEN = new FoodProperties.Builder().nutrition(6).saturationModifier(7.2f).build();

    public static final FoodProperties POKELAMB = new FoodProperties.Builder().nutrition(6).saturationModifier(9.6f).build();

    public static final FoodProperties POKEFISH = new FoodProperties.Builder().nutrition(5).saturationModifier(6.0f).build();

    public static final FoodProperties POKEPORK = new FoodProperties.Builder().nutrition(8).saturationModifier(12.8f).build();

    public static final FoodProperties RAW = new FoodProperties.Builder().nutrition(2).saturationModifier(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 400), 0.35f).build();
}
