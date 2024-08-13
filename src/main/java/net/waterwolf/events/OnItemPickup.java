package net.waterwolf.events;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.waterwolf.CompressManager;
import net.waterwolf.FusionLib;
import net.waterwolf.SG30DLL;
public class OnItemPickup implements Listener {
    public OnItemPickup(SG30DLL plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onPickupItem(EntityPickupItemEvent event) {
        if(event.getEntity() instanceof Player) {
            Player player = ((Player) event.getEntity()).getPlayer();
            if(FusionLib.GetAutocompressToggle(player) == true){
                Bukkit.getScheduler().scheduleSyncDelayedTask(SG30DLL.getPlugin(), new Runnable() {
                    @Override
                    public void run() {
                        CompressManager.checkCompress(player);
                    }
                }, 2L); //20 Tick (1 Sec
            }
        }
    }

    public void subCompress(Player player){

    }

}