package tk.waterwolf;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class OreLib {
    public static Enchantment CompressedEnchant = Enchantment.LURE;
    public static int CompressedLevel = 1;

    public static ItemStack CompressedWood() {
        ItemStack item = new ItemStack(Material.OAK_LOG);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed oak log"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedNetherite() {
        ItemStack item = new ItemStack(Material.NETHERITE_INGOT);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Netherite"));
        item.setItemMeta(itemsMeta);
        return item;
    }


    public static ItemStack CompressedCoal() {
        ItemStack item = new ItemStack(Material.CHARCOAL);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        List<String> lore = new ArrayList<String>();
        lore.add(FusionLib.getColored("&fPollution x2"));
        itemsMeta.setLore(lore);
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Coal"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedCopper() {
        ItemStack item = new ItemStack(Material.RAW_COPPER_BLOCK);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        List<String> lore = new ArrayList<String>();
        lore.add(FusionLib.getColored("&fTwice as electrifying."));
        itemsMeta.setLore(lore);
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Copper"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedStone() {
        ItemStack item = new ItemStack(Material.STONE);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        List<String> lore = new ArrayList<String>();
        lore.add(FusionLib.getColored("&fCreated by smashing"));
        lore.add(FusionLib.getColored("&fcobblestone together!"));
        itemsMeta.setLore(lore);
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Stone"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedIron() {
        ItemStack item = new ItemStack(Material.RAW_IRON_BLOCK);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        List<String> lore = new ArrayList<String>();
        lore.add(FusionLib.getColored("&fEven Stronger!"));
        itemsMeta.setLore(lore);
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Iron"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedRedstone() {
        ItemStack item = new ItemStack(Material.RED_DYE);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        List<String> lore = new ArrayList<String>();
        lore.add(FusionLib.getColored("&fToni loves this stuff."));
        itemsMeta.setLore(lore);
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Redstone"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedGold() {
        ItemStack item = new ItemStack(Material.RAW_GOLD_BLOCK);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        List<String> lore = new ArrayList<String>();
        lore.add(FusionLib.getColored("&fI think priests buy that."));
        itemsMeta.setLore(lore);
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Gold"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedLapis() {
        ItemStack item = new ItemStack(Material.BLUE_DYE);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        List<String> lore = new ArrayList<String>();
        lore.add(FusionLib.getColored("&fUsed for magic."));
        itemsMeta.setLore(lore);
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Lapis"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedDiamond() {
        ItemStack item = new ItemStack(Material.PRISMARINE_CRYSTALS);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        List<String> lore = new ArrayList<String>();
        lore.add(FusionLib.getColored("&fShiny^2"));
        itemsMeta.setLore(lore);
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Diamond"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedEmerald() {
        ItemStack item = new ItemStack(Material.SLIME_BALL);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        List<String> lore = new ArrayList<String>();
        lore.add(FusionLib.getColored("&fDo things get heavier when"));
        lore.add(FusionLib.getColored("&fcompressed on this server?"));
        itemsMeta.setLore(lore);
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Emerald"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedObsidian() {
        ItemStack item = new ItemStack(Material.CRYING_OBSIDIAN);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        List<String> lore = new ArrayList<String>();
        lore.add(FusionLib.getColored("&fI wonder what dimension this"));
        lore.add(FusionLib.getColored("&fportal would take you to..."));
        itemsMeta.setLore(lore);
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Obsidian"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedLime() {
        ItemStack item = new ItemStack(Material.LIME_WOOL);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Lime Wool"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedMelon() {
        ItemStack item = new ItemStack(Material.MELON_SLICE);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Melon"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedCookie() {
        ItemStack item = new ItemStack(Material.COOKIE);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Cookie"));
        item.setItemMeta(itemsMeta);
        return item;
    }

    public static ItemStack CompressedMagenta() {
        ItemStack item = new ItemStack(Material.MAGENTA_WOOL);
        item.addUnsafeEnchantment(CompressedEnchant, CompressedLevel);
        ItemMeta itemsMeta = item.getItemMeta();
        itemsMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    
        itemsMeta.setDisplayName(FusionLib.getColored("&bCompressed Magenta Wool"));
        item.setItemMeta(itemsMeta);
        return item;
    }
    public static ArrayList<ItemStack> CompressedMEGA(){
        ArrayList<ItemStack> itemList = new ArrayList<ItemStack>();
        itemList.add(CompressedWood());
        itemList.add(CompressedNetherite());        
        itemList.add(CompressedCoal());
        itemList.add(CompressedCopper());
        itemList.add(CompressedStone());
        itemList.add(CompressedIron());
        itemList.add(CompressedRedstone());
        itemList.add(CompressedGold());
        itemList.add(CompressedLapis());
        itemList.add(CompressedDiamond());
        itemList.add(CompressedEmerald());
        itemList.add(CompressedObsidian());
        itemList.add(CompressedLime());
        itemList.add(CompressedMagenta());
        itemList.add(CompressedMelon());
        itemList.add(CompressedCookie());        
        return itemList;
    }
}
