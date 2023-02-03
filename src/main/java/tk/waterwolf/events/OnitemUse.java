package tk.waterwolf.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import tk.waterwolf.FusionLib;
import tk.waterwolf.ItemManager;
import tk.waterwolf.SG30DLL;

public class OnitemUse implements Listener{
    public OnitemUse(SG30DLL plugin) { 
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void OnItemRightClick(PlayerInteractEvent event) {
        Action a = event.getAction();
        if(a.equals(Action.RIGHT_CLICK_AIR)||a.equals(Action.RIGHT_CLICK_BLOCK)){
            FusionLib.Debug("Used",true);
            ItemManager.HandleRightClick(event);
        }
    }
}

