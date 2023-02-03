package tk.waterwolf.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import tk.waterwolf.SG30DLL;

public class OnPlayerJoin implements Listener{
    public OnPlayerJoin(SG30DLL plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void JoinEvent(PlayerJoinEvent event) {
        //code to run when player joins //please readd this if needed
    }        
}
