
package net.mangomeep.copper_rage.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.mangomeep.copper_rage.CopperRage;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {
    
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CopperRage.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CopperRage.LOGGER.debug("Registering Mod Items for " + CopperRage.MOD_ID);
    }
}
