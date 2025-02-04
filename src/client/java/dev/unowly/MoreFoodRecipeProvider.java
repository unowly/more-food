package dev.unowly;

import dev.unowly.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MoreFoodRecipeProvider extends FabricRecipeProvider {
    public MoreFoodRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate(){
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
//CHEESE
                offerSmelting(
                        List.of(Items.MILK_BUCKET),
                        RecipeCategory.FOOD,
                        ItemInit.CHEESE_WHEEL,
                        0.1f,
                        150,
                        "food"
                );
                createShapeless(RecipeCategory.FOOD, ItemInit.CHEESE, 8)
                        .input(ItemInit.CHEESE_WHEEL)
                                .criterion(hasItem(ItemInit.CHEESE_WHEEL), conditionsFromItem(ItemInit.CHEESE_WHEEL))
                                        .offerTo(exporter);
                createShapeless(RecipeCategory.FOOD, ItemInit.CHEESE_SLICE, 16)
                        .input(ItemInit.CHEESE)
                                .criterion(hasItem(ItemInit.CHEESE), conditionsFromItem(ItemInit.CHEESE))
                                        .offerTo(exporter);
//BACON
                createShapeless(RecipeCategory.FOOD, ItemInit.RAW_BACON, 16)
                        .input(Items.PORKCHOP)
                                .criterion(hasItem(Items.PORKCHOP), conditionsFromItem(Items.PORKCHOP))
                                        .offerTo(exporter);
                offerSmelting(
                        List.of(ItemInit.RAW_BACON),
                        RecipeCategory.FOOD,
                        ItemInit.COOKED_BACON,
                        0.1f,
                        100,
                        "food"
                );
//Burger
                createShapeless(RecipeCategory.FOOD, ItemInit.CHEESEBURGER)
                    .input(Items.COOKED_BEEF)
                    .input(Items.BREAD)
                    .input(ItemInit.CHEESE_SLICE)
                    .criterion(hasItem(Items.BEEF), conditionsFromItem(Items.BEEF))
                    .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                    .criterion(hasItem(ItemInit.CHEESE), conditionsFromItem(ItemInit.CHEESE))
                    .offerTo(exporter);
                createShapeless(RecipeCategory.FOOD, ItemInit.HAMBURGER)
                    .input(Items.BREAD)
                    .input(Items.COOKED_BEEF)
                    .criterion(hasItem(Items.BEEF), conditionsFromItem(Items.BEEF))
                    .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                    .offerTo(exporter);
//EGGS
                                
            }
        };
    }

    @Override
    public String getName() {
        return "MoreFoodRecipeProvider";
    }
}
