package tk.waterwolf;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import org.bukkit.inventory.ItemStack;

public class CompressLevelOne {
    public static void Compress(Player player, int slot, int amount) {
        Boolean compressMsg = FusionLib.GetAutocompressMsgToggle(player);
        Inventory inv = player.getInventory();
        FusionLib.Debug("Got compress level 1 call", true);
        FusionLib.Debug(inv.getItem(slot).getType().name(), true);

        switch (inv.getItem(slot).getType().name()) {
            case "OAK_LOG": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.OAK_WOOD,
                        "Overgrown.",
                        "Packed Log");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Wood&r", player, true);
                }
                break;
            }
            case "COBBLESTONE": {
                ItemStack item = CompressUtils.levelTwoGenerateVerThree(
                        Material.COBBLED_DEEPSLATE,
                        "More rubbles.",
                        " Packed Cobblestone");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Stone&r", player, true);
                }
                break;
            }

            case "LAPIS_LAZULI": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.LAPIS_BLOCK,
                        "In Mesopotamia\'s treasure room.",
                        "Packed Lapis");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Lapis Lazuli&r", player, true);
                }
                break;
            }
            case "COAL": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.CHARCOAL,
                        "Pollution²",
                        "Packed Coal");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Coal&r", player, true);
                }
                break;
            }
            case "RAW_IRON": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.RAW_IRON_BLOCK,
                        "Packed beans.",
                        "Packed Raw Iron");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Raw Iron&r", player, true);
                }
                break;
            }
            case "IRON_INGOT": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.IRON_BLOCK,
                        "Previously a molten soup.",
                        "Packed Iron");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Iron Ingot&r", player, true);
                }
                break;
            }
            case "REDSTONE": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.REDSTONE_BLOCK,
                        "Energetic powerhouse.",
                        "Packed Redstone");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Redstone&r", player, true);
                }
                break;
            }
            case "RAW_COPPER": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.RAW_COPPER_BLOCK,
                        "Oxidization growing over it.",
                        "Packed Raw Copper");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Raw Copper&r", player, true);
                }
                break;
            }
            case "COPPER_INGOT": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.COPPER_BLOCK,
                        "Extra malleable.",
                        "Packed Copper");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Copper Ingot&r", player, true);
                }
                break;
            }
            case "RAW_GOLD": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.RAW_GOLD_BLOCK,
                        "I think Priests buy that.",
                        "Packed Raw Gold");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Raw Gold&r", player, true);
                }
                break;
            }
            case "GOLD_INGOT": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.GOLD_BLOCK,
                        "It all belongs to Smaug.",
                        "Packed Gold");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Gold Ingot&r", player, true);
                }
                break;
            }
            case "DIAMOND": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.DIAMOND_BLOCK,
                        "Now on a necklace!",
                        "Packed Diamond");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Diamond&r", player, true);
                }
                break;
            }
            case "EMERALD": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.EMERALD_BLOCK,
                        "Cherished by Cleopatra.",
                        "Packed Emerald");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Emerald&r", player, true);
                }
                break;
            }
            case "CLAY_BALL": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.CLAY,
                        "Could begin to turn into something new.",
                        "Packed Uncut Diamond");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Cut Diamound&r", player, true);
                }
                break;
            }
            case "PRISMARINE_SHARD": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.PRISMARINE,
                        "Gradient.",
                        "Packed Lonsdaleite");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Lonsdaleite&r", player, true);
                }
                break;
            }
            case "POPPED_CHORUS_FRUIT": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.PURPUR_BLOCK,
                        "Oddly organic.",
                        "Packed Endium");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Endium&r", player, true);
                }
                break;
            }
            case "AMETHYST_SHARD": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.AMETHYST_BLOCK,
                        "The whole geode.",
                        "Packed Amethyst");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Amethyst&r", player, true);
                }
                break;
            }
            case "ECHO_SHARD": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.SCULK,
                        "Is this thing alive?",
                        "Packed Sculk");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Sculk&r", player, true);
                }
                break;
            }
            case "NETHERITE_SCRAP": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.ANCIENT_DEBRIS,
                        "Plates of scraps.",
                        "Packed Debris");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Raw Netherite&r", player, true);
                }
                break;
            }
            case "NETHERITE_INGOT": {
                ItemStack item = CompressUtils.levelTwoGenerateVerTwo(
                        Material.NETHERITE_BLOCK,
                        "It became more solid...",
                        "Packed Netherite");
                item.setAmount(amount);
                inv.addItem(item);
                if (compressMsg) {
                    FusionLib.sendToPlayer("&fCompressed &7Netherite Ingot&r", player, true);
                }
                break;
            }
        }
        inv.setItem(slot, null);
    }
}
