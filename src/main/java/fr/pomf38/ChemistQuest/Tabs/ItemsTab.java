package fr.pomf38.ChemistQuest.Tabs;

import fr.pomf38.ChemistQuest.items.BaseItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ItemsTab {
    public static final CreativeModeTab itemsTab = new CreativeModeTab("items_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BaseItems.copperStick.get());
        }
    };
}
