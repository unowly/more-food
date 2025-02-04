package dev.unowly.init;

import dev.unowly.MoreFood;
import dev.unowly.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ItemInit {
//BURGER
    public static final Item HAMBURGER = register("hamburger",
            settings ->  new Item(settings.food(FoodList.HAMBURGER).maxCount(16)));
    public static final Item CHEESEBURGER = register("cheeseburger",
            settings ->  new Item(settings.food(FoodList.CHEESEBURGER).maxCount(16)));
//CHEESE
    public static final Item CHEESE_WHEEL = register("cheese_wheel",
            settings -> new Item(settings.food(FoodList.CHEESE_WHEEL).maxCount(16)));
    public static final Item CHEESE = register("cheese",
            settings ->  new Item(settings.food(FoodList.CHEESE).maxCount(64)));
    public static final Item CHEESE_SLICE = register("cheese_slice",
            settings -> new Item(settings.food(FoodList.CHEESE_SLICE).maxCount(64)));
//BACON
    public static final Item RAW_BACON =register("raw_bacon",
        settings -> new Item(settings.food(FoodList.RAW_BACON).maxCount(64)));
    public static final Item COOKED_BACON =register("cooked_bacon",
            settings -> new Item(settings.food(FoodList.COOKED_BACON).maxCount(64)));
//EGGS
    public static final Item SCRUMBLED_EGG = register("scrumbled_egg",
        settings -> new Item(settings.food(FoodList.SCRUMBLED_EGG).maxCount(16)));


    public static Item register(String name, java.util.function.Function<Item.Settings, Item> factory) {
        RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MoreFood.MOD_ID, name));
        Item.Settings settings = new Item.Settings().registryKey(registryKey);
        return Registry.register(Registries.ITEM, registryKey.getValue(), factory.apply(settings));
    }


    public static void init(){}
}
