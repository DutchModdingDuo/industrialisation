package com.bonka95.Industrialisation.init;

import com.bonka95.Industrialisation.item.ItemIndustCoal;
import com.bonka95.Industrialisation.item.ItemMod;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Merlijn on 31-3-2015.
 */
public class ModItems {
    public static final ItemMod IndustCoal = new ItemIndustCoal();

    public static void init()
    {
        GameRegistry.registerItem(IndustCoal, "IndustCoal");
    }
}