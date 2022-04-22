package fr.pomf38.ChemistQuest.items;

import fr.pomf38.ChemistQuest.ChemistQuest;
import fr.pomf38.ChemistQuest.Tabs.ItemsTab;
import net.minecraft.world.item.*;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Tools {
    public static final DeferredRegister<Item> TOOLS = DeferredRegister.create(ForgeRegistries.ITEMS, ChemistQuest.MOD_ID);

    //Création des items en  copper
    public static final RegistryObject<Item> copperSword = TOOLS.register("copper_sword", ()-> new SwordItem(ModItemTier.COPPER,2,3.0F,new Item.Properties().tab(ItemsTab.itemsTab).stacksTo(1)));
    public static final RegistryObject<Item> copperPickaxe = TOOLS.register("copper_pickaxe",()-> new PickaxeItem(ModItemTier.COPPER,1,1.2F,new Item.Properties().tab(ItemsTab.itemsTab).stacksTo(1)));
    public static final RegistryObject<Item> copperAxe = TOOLS.register("copper_axe",()->new AxeItem(ModItemTier.COPPER,4,0.9f,new Item.Properties().tab(ItemsTab.itemsTab).stacksTo(1)));
    public static final RegistryObject<Item> copperHoe = TOOLS.register("copper_hoe",()->new HoeItem(ModItemTier.COPPER,1,4f,new Item.Properties().tab(ItemsTab.itemsTab).stacksTo(1)));
    public static final RegistryObject<Item> copperShovel = TOOLS.register("copper_shovel",()->new ShovelItem(ModItemTier.COPPER,1,1.2f,new Item.Properties().tab(ItemsTab.itemsTab).stacksTo(1)));


    public static void register(IEventBus eventBus){
        TOOLS.register(eventBus);
    }
}
