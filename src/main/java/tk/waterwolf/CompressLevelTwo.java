package tk.waterwolf;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import org.bukkit.inventory.ItemStack;


public class CompressLevelTwo {
    public static void Compress(Player player, int slot, int amount) {
        Boolean compressMsg = FusionLib.GetAutocompressMsgToggle(player);
        Inventory inv = player.getInventory();
        FusionLib.Debug("Got compress level 2 call", true);
        FusionLib.Debug(inv.getItem(slot).getType().name(), true);
        switch (inv.getItem(slot).getType().name()) {
            case "OAK_WOOD": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                        Material.SPRUCE_LOG,
                        "This is not the same log",
                        "Condensed Log");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Wood&r", player, true);
                }
                break;
            }
            case "COBBLED_DEEPSLATE": {
                ItemStack item = CompressUtils.levelThreeGenerateVerTwo(
                        Material.POLISHED_DEEPSLATE,
                        "Tons of rubbles.",
                        " Condensed Cobblestone");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Stone&r", player, true);
                }
                break;
            }

            case "LAPIS_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.LAPIS_BLOCK,
                    "Spiritual stone.",
                    "Condensed Lapis"
                    );
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Lapis Lazuli&r", player, true);
                }
                break;
            }          
            case "CHARCOAL": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.COAL_BLOCK,
                    "Almost diamonds.",
                    "Condensed Coal"
                    );
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Coal&r", player, true);
                }
                break;
            }            
            case "RAW_IRON_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.RAW_IRON_BLOCK,
                    "Iron core.",
                    "Condensed Raw Iron"
                    );
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Raw Iron&r", player, true);
                }
                break;
            }
            case "IRON_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.IRON_BLOCK,
                    "Shiny as a mirror.",
                    "Condensed Iron"
                    );
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Iron&r", player, true);
                }
                break;
            }
            case "REDSTONE_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.RED_GLAZED_TERRACOTTA,
                    "ALL THE POWER.",
                    "Condensed Redstone");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Redstone&r", player, true);
                }
                break;
            }
            case "RAW_COPPER_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.RAW_COPPER_BLOCK,
                    "A penny's worth.",
                    "Condensed Raw Copper");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Raw Copper&r", player, true);
                }
                break;
            }
            case "COPPER_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.COPPER_BLOCK,
                    "Lightning will strike twice with this.",
                    "Condensed Copper");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Copper&r", player, true);
                }
                break;
            }
            case "RAW_GOLD_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.RAW_GOLD_BLOCK,
                    "Perfect for gilding armor.",
                    "Condensed Raw Gold");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Raw Gold&r", player, true);
                }
                break;
            }
            case "GOLD_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.GOLD_BLOCK,
                    "A dream for piglins to see.",
                    "Condensed Gold");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Gold&r", player, true);
                }
                break;
            }
            case "DIAMOND_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.DIAMOND_BLOCK,
                    "As shiny as your eyes.",
                    "Condensed Diamond");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Diamond&r", player, true);
                }
                break;
            }
            case "EMERALD_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.EMERALD_BLOCK,
                    "Magical gemstone.",
                    "Condensed Emerald");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Emerald&r", player, true);
                }
                break;
            }
            case "CLAY": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.CLAY,
                    "But why.",
                    "Condensed Uncut Diamond");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Cut Diamound&r", player, true);
                }
                break;
            }
            case "PRISMARINE": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.PRISMARINE,
                    "Delivered by Space.net&f",
                    "Condensed Lonsdaleite");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Lonsdaleite&r", player, true);
                }
                break;
            }
            case "PURPUR_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.PURPUR_BLOCK,
                    "Incredibly tough.",
                    "Condensed Endium");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Endium&r", player, true);
                }
                break;
            }
            case "AMETHYST_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.BUDDING_AMETHYST,
                    "Crystals upon crystals.",
                    "Condensed Amethyst");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Amethyst&r", player, true);
                }
                break;
            }
            case "SCULK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.SCULK,
                    "Its spreading...",
                    "Condensed Sculk");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Sculk&r", player, true);
                }
                break;
            }
            case "ANCIENT_DEBRIS": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.ANCIENT_DEBRIS,
                    "Reforms a chunk of something bigger.",
                    "Condensed Debris");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Raw Netherite&r", player, true);
                }
                break;
            }
            case "NETHERITE_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.NETHERITE_BLOCK,
                    "Tougher than obsidian.",
                    "Condensed Netherite");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Packed Netherite&r", player, true);
                }
                break;
            }
        }
        inv.setItem(slot, null);
    }
}
