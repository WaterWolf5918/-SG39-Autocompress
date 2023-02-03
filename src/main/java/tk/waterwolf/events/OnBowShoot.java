package tk.waterwolf.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

import tk.waterwolf.ItemManager;
import tk.waterwolf.SG30DLL;

public class OnBowShoot implements Listener{
    public OnBowShoot(SG30DLL plugin) { 
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void OnItemHeldEvent(EntityShootBowEvent event) {
        if(event.getEntity() instanceof Player) {
            ItemManager.HandleBowFire(event);
        }
    }
}
