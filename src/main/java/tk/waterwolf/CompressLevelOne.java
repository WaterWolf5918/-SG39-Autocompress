package tk.waterwolf;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginAwareness.Flags;

public class CompressLevelOne {
    public static void Compress(Player player, int slot, int amount) {
        Inventory inv = player.getInventory();
        FusionLib.Debug("Got compress level 1 call", true);
        FusionLib.Debug(inv.getItem(slot).getType().name(), true);

        switch (inv.getItem(slot).getType().name()) {
            case "LAPIS_LAZULI": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.LAPIS_BLOCK,
                    "In Mesopotamia\'s treasure room.",
                    "Packed Lapis"
                    );
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }          
            case "COAL": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.CHARCOAL   ,
                    "Pollution²",
                    "Packed Coal"
                    );
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }            
            case "RAW_IRON": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.RAW_IRON_BLOCK,
                    "Packed beans.",
                    "Packed Raw Iron"
                    );
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "IRON_INGOT": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.IRON_BLOCK,
                    "Previously a molten soup.",
                    "Packed Iron"
                    );
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "REDSTONE": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.REDSTONE_BLOCK,
                    "Energetic powerhouse.",
                    "Packed Redstone");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "RAW_COPPER": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.RAW_COPPER_BLOCK,
                    "Oxidization growing over it.",
                    "Packed Raw Copper");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "COPPER_INGOT": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.COPPER_BLOCK,
                    "Extra malleable.",
                    "Packed Copper");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "RAW_GOLD": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.RAW_GOLD_BLOCK,
                    "I think Priests buy that.",
                    "Packed Raw Gold");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "GOLD_INGOT": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.GOLD_BLOCK,
                    "It all belongs to Smaug.",
                    "Packed Gold");
                item.setAmount(amount);

                inv.addItem(item);
                break;
            }
            case "DIAMOND": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.DIAMOND_BLOCK,
                    "Now on a necklace!",
                    "Packed Diamond");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "EMERALD": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.EMERALD_BLOCK,
                    "Cherished by Cleopatra.",
                    "Packed Emerald");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "CLAY_BALL": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.CLAY,
                    "Could begin to turn into something new.",
                    "Packed Uncut Diamond");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "PRISMARINE_SHARD": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.PRISMARINE,
                    "Gradient.",
                    "Packed Lonsdaleite");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "POPPED_CHORUS_FRUIT": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.PURPUR_BLOCK,
                    "Oddly organic.",
                    "Packed Endium");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "AMETHYST_SHARD": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.AMETHYST_BLOCK,
                    "The whole geode.",
                    "Packed Amethyst");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "ECHO_SHARD": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.SCULK,
                    "Is this thing alive?",
                    "Packed Sculk");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "NETHERITE_SCRAP": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.ANCIENT_DEBRIS,
                    "Plates of scraps.",
                    "Packed Debris");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
            case "NETHERITE_INGOT": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                    Material.NETHERITE_BLOCK,
                    "It became more solid...",
                    "Packed Netherite");
                item.setAmount(amount);
                inv.addItem(item);
                break;
            }
        }
        inv.setItem(slot, null);
    }
}
