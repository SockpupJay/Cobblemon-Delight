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

public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}
}
