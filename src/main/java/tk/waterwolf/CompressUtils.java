package tk.waterwolf;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import tk.waterwolf.FusionLib;

public class CompressUtils {
    public static ItemStack levelTwoGenerate(Material material,String loreString, String name){
        FusionLib.Debug("Making Compressed Item", true);
        ItemStack item = new ItemStack(material);
        ItemMeta itemsMeta = item.getItemMeta();
        String[] lore = {
            FusionLib.getColored("&7➤ &f" + loreString),
            FusionLib.getColored("&8&lMATERIAL"),
            FusionLib.getColored("&2")
        };

        itemsMeta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        itemsMeta.setUnbreakable(true);
        itemsMeta.setDisplayName(FusionLib.getColored("&7● &b" + name +" &7●"));
        itemsMeta.setLore(Arrays.asList(lore));
        
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack levelTwoGenerateVerTwo(Material material,String loreString, String name){
        FusionLib.Debug("Making Compressed Item", true);
        ItemStack item = new ItemStack(material);
        ItemMeta itemsMeta = item.getItemMeta();
        String[] lore = {
            FusionLib.getColored("&7➤ &f" + loreString),
            FusionLib.getColored("&8&lMATERIAL"),
            FusionLib.getColored("&2")
        };

        itemsMeta.setDisplayName(FusionLib.getColored("&7● &b" + name +" &7●"));
        itemsMeta.setLore(Arrays.asList(lore));
        
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack levelThreeGenerate(Material material,String loreString, String name){
        FusionLib.Debug("Making Compressed Item", true);
        ItemStack item = new ItemStack(material);
        ItemMeta itemsMeta = item.getItemMeta();
        String[] lore = {
            FusionLib.getColored("&7➤ &f" + loreString),
            FusionLib.getColored("&8&lMATERIAL"),
            FusionLib.getColored("&3")
        };
        
        
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemsMeta.setDisplayName(FusionLib.getColored("&7● &3" + name +" &7●"));
        itemsMeta.setLore(Arrays.asList(lore));
    
        item.setItemMeta(itemsMeta);
        item.addUnsafeEnchantment(Enchantment.LUCK, 1);
        return item;
    }
}
