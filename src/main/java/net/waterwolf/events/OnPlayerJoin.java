package net.waterwolf.events;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.waterwolf.FusionLib;
import net.waterwolf.SG30DLL;

public class OnPlayerJoin implements Listener{
    public OnPlayerJoin(SG30DLL plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void JoinEvent(PlayerJoinEvent event) {

    }        
}
