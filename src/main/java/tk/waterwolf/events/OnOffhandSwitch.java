package tk.waterwolf.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import tk.waterwolf.ItemManager;
import tk.waterwolf.SG30DLL;

public class OnOffhandSwitch implements Listener{
    public OnOffhandSwitch(SG30DLL plugin) { 
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void OnOffhandSwitchEvent(PlayerSwapHandItemsEvent event) {
        Bukkit.getScheduler().scheduleSyncDelayedTask(SG30DLL.getPlugin(), new Runnable() {
            @Override
            public void run() {
                ItemManager.HandleOffhandSwitchEvent(event);
            }
        }, 2L); //20 Tick (1 Sec
    }
}
