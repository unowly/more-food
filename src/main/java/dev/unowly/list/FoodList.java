package dev.unowly.list;

import net.minecraft.component.type.FoodComponent;

public class FoodList {
    public static final FoodComponent HAMBURGER = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(0.3F)
            .alwaysEdible()
            .build();
    public static final FoodComponent CHEESEBURGER = new FoodComponent.Builder()
            .nutrition(12)
            .saturationModifier(0.3F)
            .alwaysEdible()
            .build();
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
}
