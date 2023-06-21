package tk.waterwolf;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginAwareness.Flags;

public class CompressLevelTwo {
    public static void Compress(Player player, int slot, int amount) {
        Inventory inv = player.getInventory();
        FusionLib.Debug("Got compress level 2 call", true);
        FusionLib.Debug(inv.getItem(slot).getType().name(), true);
        switch (inv.getItem(slot).getType().name()) {
            case "LAPIS_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.LAPIS_BLOCK,
                    "Spiritual stone.",
                    "Condensed Lapis"
                    );
                item.setAmount(amount);
                inv.addItem(item);
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
                break;
            }
            case "REDSTONE_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.RED_GLAZED_TERRACOTTA,
                    "ALL THE POWER.",
                    "Condensed Redstone");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "RAW_COPPER_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.RAW_COPPER_BLOCK,
                    "A penny's worth.",
                    "Condensed Raw Copper");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "COPPER_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.COPPER_BLOCK,
                    "Lightning will strike twice with this.",
                    "Condensed Copper");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "RAW_GOLD_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.RAW_GOLD_BLOCK,
                    "Perfect for gilding armor.",
                    "Condensed Raw Gold");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "GOLD_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.GOLD_BLOCK,
                    "A dream for piglins to see.",
                    "Condensed Gold");
                item.setAmount(amount);

                inv.addItem(item);
                break;
            }
            case "DIAMOND_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.DIAMOND_BLOCK,
                    "As shiny as your eyes.",
                    "Condensed Diamond");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "EMERALD_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.EMERALD_BLOCK,
                    "Magical gemstone.",
                    "Condensed Emerald");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "CLAY": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.CLAY,
                    "But why.",
                    "Condensed Uncut Diamond");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "PRISMARINE": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.PRISMARINE,
                    "Delivered by Space.net&f",
                    "Condensed Lonsdaleite");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "PURPUR_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.PURPUR_BLOCK,
                    "Incredibly tough.",
                    "Condensed Endium");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "AMETHYST_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.BUDDING_AMETHYST,
                    "Crystals upon crystals.",
                    "Condensed Amethyst");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "SCULK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.SCULK,
                    "Its spreading...",
                    "Condensed Sculk");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "ANCIENT_DEBRIS": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.ANCIENT_DEBRIS,
                    "Reforms a chunk of something bigger.",
                    "Condensed Debris");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "NETHERITE_BLOCK": {
                ItemStack item = CompressUtils.levelThreeGenerate(
                    Material.NETHERITE_BLOCK,
                    "Tougher than obsidian.",
                    "Condensed Netherite");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
        }
        inv.setItem(slot, null);
    }
}
