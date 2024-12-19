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
}
