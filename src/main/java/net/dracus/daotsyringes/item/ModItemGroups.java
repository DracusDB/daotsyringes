package net.dracus.daotsyringes.item;

import net.dracus.daotsyringes.DAOTSyringes;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SYRINGES_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DAOTSyringes.MOD_ID, "syringes_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ATTACK_SYRINGE))
                    .displayName(Text.translatable("itemgroup.daotsyringes.syringes_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ACKERMAN_SYRINGE);
                        entries.add(ModItems.ARMORED_SYRINGE);
                        entries.add(ModItems.ATTACK_SYRINGE);
                        entries.add(ModItems.BEAST_SYRINGE);
                        entries.add(ModItems.CART_SYRINGE);
                        entries.add(ModItems.COLOSSAL_SYRINGE);
                        entries.add(ModItems.FEMALE_SYRINGE);
                        entries.add(ModItems.JAW_SYRINGE);
                        entries.add(ModItems.WARHAMMER_SYRINGE);
                    })

                    .build());

    public static void registerItemGroups() {
        DAOTSyringes.LOGGER.info("Registering Item Groups for " + DAOTSyringes.MOD_ID);
    }

}
