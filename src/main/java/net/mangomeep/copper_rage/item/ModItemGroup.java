package net.mangomeep.copper_rage.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mangomeep.copper_rage.CopperRage;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    
    public static final ItemGroup COPPER_RAGE = FabricItemGroup.builder(new Identifier(CopperRage.MOD_ID, "test_group"))
        .displayName(Text.literal("Copper Rage"))
        .icon(() -> new ItemStack(Items.COPPER_INGOT))
        .entries((enabledFeatures, entries, operatorEnabled) -> {
            entries.add(ModItems.RAW_TIN);
            entries.add(ModItems.TIN_INGOT);
        })
        .build();
}
