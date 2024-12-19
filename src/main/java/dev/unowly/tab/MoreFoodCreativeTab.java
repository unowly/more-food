package dev.unowly.tab;

import dev.unowly.MoreFood;
import dev.unowly.init.ItemInit;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MoreFoodCreativeTab {
    public static final ItemGroup MOORE_FOOD_TAB = Registry.register(Registries.ITEM_GROUP, Identifier.of("more-food", "more-food"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ItemInit.HAMBURGER))
            .displayName(Text.translatable("itemGroup.more-food"))
            .entries((context, entries) ->{
                entries.add(ItemInit.HAMBURGER);
                entries.add(ItemInit.CHEESEBURGER);
            })
            .build());

    public static void init() {}
}
