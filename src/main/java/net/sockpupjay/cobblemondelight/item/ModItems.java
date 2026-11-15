package net.sockpupjay.cobblemondelight.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sockpupjay.cobblemondelight.CobblemonDelight;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobblemonDelight.MOD_ID);

    public static final DeferredItem<Item> RAW_POKEBEEF = ITEMS.register("raw_pokebeef",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_POKECHICKEN = ITEMS.register("raw_pokechicken",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_POKEFISH = ITEMS.register("raw_pokefish",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_POKELAMB = ITEMS.register("raw_pokelamb",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_POKEPORK = ITEMS.register("raw_pokepork",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POKEBEEF = ITEMS.register("pokebeef",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POKECHICKEN = ITEMS.register("pokechicken",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POKEFISH = ITEMS.register("pokefish",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POKELAMB = ITEMS.register("pokelamb",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> POKEPORK = ITEMS.register("pokepork",
            () -> new Item(new Item.Properties()));

public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}
}
