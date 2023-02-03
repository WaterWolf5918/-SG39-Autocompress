package tk.waterwolf;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import tk.waterwolf.FusionLib;





public class CompressManager {


    // static String[] megaCompressWhitelist = {
    // FusionLib.getColored("&bCompressed Coal"),
    // FusionLib.getColored("&bCompressed Copper"),
    // FusionLib.getColored("&bCompressed Netherite"),
    // FusionLib.getColored("&bCompressed oak log"),
    // FusionLib.getColored("&bCompressed Stone"),
    // FusionLib.getColored("&bCompressed Iron"),
    // FusionLib.getColored("&bCompressed Redstone"),
    // FusionLib.getColored("&bCompressed Gold"),
    // FusionLib.getColored("&bCompressed Lapis"),
    // FusionLib.getColored("&bCompressed Emerald"),
    // FusionLib.getColored("&bCompressed Obsidian"),
    // FusionLib.getColored("&bCompressed Lime"),
    // FusionLib.getColored("&bCompressed Magenta"),
    // FusionLib.getColored("&bCompressed Melon"),
    // FusionLib.getColored("&bCompressed Cookie")
    // };

    // private static ArrayList<String> t;
    // t.add

    // ArrayList<String> megaCompressWhitelist = new ArrayList<String>();
    // megaCompressWhitelist.add();


    public static void checkCompress(Player player){
        ArrayList<String> megaCompressWhitelist = new ArrayList<String>();
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Coal"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Copper"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Netherite"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed oak log"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Stone"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Iron"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Redstone"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Gold"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Lapis"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Emerald"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Obsidian"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Lime"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Magenta"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Melon"));
        megaCompressWhitelist.add(FusionLib.getColored("&bCompressed Cookie"));







        for (int i = 0; i < player.getInventory().getSize(); i++) {
            Boolean compressMsg = FusionLib.GetAutocompressMsgToggle(player);
            if (player.getInventory().getItem(i) != null && player.getInventory().getItem(i).getType() != Material.AIR){
                if (player.getInventory().getItem(i).getAmount() == 64) {
                    if (player.getInventory().getItem(i).getEnchantments().isEmpty()) {
                        FusionLib.Debug("Normal Compress", true);
                        autoCompress(player,i);
                    }else{
                        FusionLib.Debug("Might need mega compressed | check whitelist", compressMsg);
                        if (player.getInventory().getItem(i).getItemMeta().getDisplayName() != null && megaCompressWhitelist.contains(player.getInventory().getItem(i).getItemMeta().getDisplayName())){
                            FusionLib.Debug("Item needs mega compressed", compressMsg);
                        }
                    }
                }
            } // remove later
        }
    }


    public static void autoCompress(Player player, int i){
        ItemStack item = player.getInventory().getItem(i);
        Inventory Inv = player.getInventory();
        Boolean compressMsg = FusionLib.GetAutocompressMsgToggle(player);
        switch (item.getType().name()) {
            case "COAL":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Coal&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedCoal());
                break;
            case "OAK_LOG":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Wood&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedWood());
                break;
            case "NETHERITE_INGOT":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Netherite&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedNetherite());
                break;
            case "COPPER_INGOT":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Copper&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedCopper());
                break;
            case "COBBLESTONE":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7STONE&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedStone());
                break;
            case "IRON_INGOT":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Iron&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedIron());
                break;
            case "REDSTONE":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Redstone&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedRedstone());
                break;
            case "GOLD_INGOT":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Gold&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedGold());
                break;
            case "LAPIS_LAZULI":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Lapis&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedLapis());
                break;
            case "DIAMOND":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Diamond&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedDiamond());
                break;
            case "EMERALD":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Emerald&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedEmerald());
                break;
            case "OBSIDIAN":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Obsidain&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedObsidian());
                break;
            case "LIME_WOOL":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Lime Wool&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedLime());
                break;
            case "MAGENTA_WOOL":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Magenta Wool &r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedMagenta());
                break;
            case "MELON_SLICE":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Melon&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedMelon());
                break;
            case "COOKIE":
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Cookie&r", player, true);
                }
                Inv.setItem(i, new ItemStack(Material.AIR));
                Inv.addItem(OreLib.CompressedCookie());
                break;
            default:
                break;
            }
    }
}
