package dev.unowly.list;

import net.minecraft.component.type.FoodComponent;

public class FoodList {
//BURGER
    public static final FoodComponent HAMBURGER = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(0.3F)
            .build();
    public static final FoodComponent CHEESEBURGER = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(0.3F)
            .build();
//CHEESE
    public static final FoodComponent CHEESE_WHEEL = new FoodComponent.Builder()
            .nutrition(20)
            .saturationModifier(2.5F)
            .build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .build();
    public static final FoodComponent CHEESE_SLICE = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.4F)
            .build();
//BACON
    public static final FoodComponent RAW_BACON = new FoodComponent.Builder()
        .nutrition(2)
        .saturationModifier(0.3F)
        .build();
    public static final FoodComponent COOKED_BACON = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.3F)
            .build();
//EGGS
    public static final FoodComponent SCRUMBLED_EGG = new FoodComponent.Builder()
        .nutrition(8)
        .saturationModifier(0.3F)
        .build();
}
