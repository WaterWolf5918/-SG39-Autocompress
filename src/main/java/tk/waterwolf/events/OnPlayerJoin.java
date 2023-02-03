package tk.waterwolf.events;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import tk.waterwolf.FusionLib;
import tk.waterwolf.SG30DLL;

public class OnPlayerJoin implements Listener{
    public OnPlayerJoin(SG30DLL plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void JoinEvent(PlayerJoinEvent event) {
        //code to run when player joins //please readd this if needed
        Player player = event.getPlayer();
        FileConfiguration config = SG30DLL.getPlugin().config;
        if (config.getBoolean("youAreAwesome")) {
            player.sendMessage("You are awesome!");
            FusionLib.Debug("> > > ",true);
        } else {
            player.sendMessage("You are not awesome...");
            FusionLib.Debug(". . . ", true);
        }
    }        
}
