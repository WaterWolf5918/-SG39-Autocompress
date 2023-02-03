




package tk.waterwolf.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import tk.waterwolf.FusionLib;
import tk.waterwolf.ItemManager;
import tk.waterwolf.SG30DLL;

public class OnInventoryInteract implements Listener{
    public OnInventoryInteract(SG30DLL plugin) { 
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void InventoryInteract(InventoryClickEvent event) {
        Bukkit.getScheduler().scheduleSyncDelayedTask(SG30DLL.getPlugin(), new Runnable() {
            @Override
            public void run() {
                ItemManager.HandleSlotEvent(event);
            }
        }, 2L); //20 Tick (1 Sec     
    }
}
