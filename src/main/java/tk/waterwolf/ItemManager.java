package tk.waterwolf;


import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;



public class ItemManager {
    // public static boolean canFly = false;
    static boolean canFly = false;
    static boolean canjump = false;

    public static void HandleSlotEvent(InventoryClickEvent event){
        FusionLib.Debug("Inventory Click Event Fired", true);
        Player player = (Player) event.getWhoClicked();
        HandleItem(player);        
    }
    public static void HandleItemSwitchEvent(PlayerItemHeldEvent event){
        FusionLib.Debug("ItemSwitch Event Fired", true);
        Player player = event.getPlayer();
        HandleItem(player);
    }


    public static void HandleItem(Player player){
        ItemStack MainHand = player.getInventory().getItemInMainHand();
        ItemStack OffHand = player.getInventory().getItemInOffHand();
        if (MainHand.hasItemMeta()){
            HandleNammedItem(MainHand, player);
        }
        if (OffHand.hasItemMeta()){
            HandleNammedItem(OffHand, player);
        }
        if (!MainHand.hasItemMeta() || !OffHand.hasItemMeta()){
            FusionLib.broadcast(String.valueOf(canFly));
            if (!canFly){
                if (player.hasPotionEffect(PotionEffectType.LEVITATION)){player.removePotionEffect(PotionEffectType.LEVITATION);}
            }
            canFly = false;
            if (!canjump){
                if (player.hasPotionEffect(PotionEffectType.JUMP)){player.removePotionEffect(PotionEffectType.JUMP);}
            }
            canjump = false;
            return;
        }
    }

    public static void HandleNammedItem(ItemStack Item, Player player){
        FusionLib.Debug(Item.getItemMeta().getDisplayName(), true);
        String ItemName = Item.getItemMeta().getDisplayName();
        if (ItemName.equals(FusionLib.getColored("&6DebugItem2"))){
            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 99999999, 7));
            canjump = true;
        }else if(!ItemName.equals(FusionLib.getColored("&6DebugItem2"))){
            canjump = false;
            if (player.hasPotionEffect(PotionEffectType.JUMP)){player.removePotionEffect(PotionEffectType.LEVITATION);}
        }
        if (ItemName.equals(FusionLib.getColored("&6DebugItem"))){
            player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 99999999, 7));
            canFly = true;
        }else if(!ItemName.equals(FusionLib.getColored("&6DebugItem"))){
            canFly = false;
            if (player.hasPotionEffect(PotionEffectType.LEVITATION)){player.removePotionEffect(PotionEffectType.LEVITATION);}
        }
    
    }

    public static void HandleOffhandSwitchEvent(PlayerSwapHandItemsEvent event){
        FusionLib.Debug("Offhand Event Fired", true);
        Player player = event.getPlayer();
        HandleItem(player);
    }






    public static void HandleBowFire(EntityShootBowEvent event){
        FusionLib.Debug("EntityShootBow Event Fired", true);
    }


    public static void HandleRightClick(PlayerInteractEvent event){
        FusionLib.Debug("RightClick Event Fired", true);
    }

}
