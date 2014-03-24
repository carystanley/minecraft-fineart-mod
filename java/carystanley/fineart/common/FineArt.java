package carystanley.extremefarming.common;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod.EventHandler;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import carystanley.extremefarming.client.renderer.entity.RenderPlantTNTPrimed;
import carystanley.extremefarming.block.BlockPlantTNT;
import carystanley.extremefarming.entity.EntityPlantTNTPrimed;

@Mod(modid = "carystanley_fineart", name = "Fine Art", version = "1.0")

public class FineArt {

    @Instance("carystanley_fineart")
    public static FineArt instance;
    
    public static Block flowerTnt = (new BlockPlantTNT(FLOWER_TNT)).setHardness(0.0F).setBlockName("extremefarming:flowerTNT").setBlockTextureName("extremefarming:tnt_flower");

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        GameRegistry.registerBlock(flowerTnt, "extremefarming:flowerTNT");
	}

    @EventHandler
	public void init(FMLInitializationEvent event) {
    	loadRecipes();
	}
	
	public void loadRecipes() {
		GameRegistry.addRecipe(new ItemStack(flowerTnt, 1), new Object[] {"X#X", "#X#", "X#X", 'X', Items.gunpowder, '#', Blocks.red_flower});
	}
}
