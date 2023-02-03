package tk.waterwolf.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;

import tk.waterwolf.FusionLib;
import tk.waterwolf.ItemManager;
import tk.waterwolf.SG30DLL;

public class OnItemHeld implements Listener{
    public OnItemHeld(SG30DLL plugin) { 
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void OnItemHeldEvent(PlayerItemHeldEvent event) {
        Bukkit.getScheduler().scheduleSyncDelayedTask(SG30DLL.getPlugin(), new Runnable() {
            @Override
            public void run() {
                ItemManager.HandleItemSwitchEvent(event);
            }
        }, 2L); //20 Tick (1 Sec

    }
}
