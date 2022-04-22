package fr.pomf38.ChemistQuest.items;

import fr.pomf38.ChemistQuest.ChemistQuest;
import fr.pomf38.ChemistQuest.Tabs.ItemsTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BaseItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ChemistQuest.MOD_ID);

    //Création d'un premier item le copper stick
    public static final RegistryObject<Item> copperStick = ITEMS.register("copper_stick", ()-> new Item(new Item.Properties().tab(ItemsTab.itemsTab).stacksTo(16)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
