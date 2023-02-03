package tk.waterwolf.events;

import java.util.ArrayList;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import tk.waterwolf.FusionLib;
import tk.waterwolf.SG30DLL;

public class OnBlockPlace implements Listener{
    public OnBlockPlace(SG30DLL plugin){
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }
    

    @EventHandler
    public void BlockPlace(BlockPlaceEvent event){
        ItemStack item1 = event.getPlayer().getInventory().getItemInMainHand();
        ItemStack item2 = event.getPlayer().getInventory().getItemInOffHand();
        ArrayList<String> NoItems = new ArrayList<String>();
        NoItems.add(FusionLib.getColored("&bCompressed Coal"));
        NoItems.add(FusionLib.getColored("&bCompressed Copper"));
        NoItems.add(FusionLib.getColored("&bCompressed Netherite"));
        NoItems.add(FusionLib.getColored("&bCompressed oak log"));
        NoItems.add(FusionLib.getColored("&bCompressed Stone"));
        NoItems.add(FusionLib.getColored("&bCompressed Iron"));
        NoItems.add(FusionLib.getColored("&bCompressed Redstone"));
        NoItems.add(FusionLib.getColored("&bCompressed Gold"));
        NoItems.add(FusionLib.getColored("&bCompressed Lapis"));
        NoItems.add(FusionLib.getColored("&bCompressed Emerald"));
        NoItems.add(FusionLib.getColored("&bCompressed Obsidian"));
        NoItems.add(FusionLib.getColored("&bCompressed Lime"));
        NoItems.add(FusionLib.getColored("&bCompressed Magenta"));
        NoItems.add(FusionLib.getColored("&bCompressed Melon"));
        NoItems.add(FusionLib.getColored("&bCompressed Cookie"));

        // prestige
        NoItems.add(FusionLib.getColored("&ePart 1 of prestige token"));
        NoItems.add(FusionLib.getColored("&ePart 2 of prestige token"));
        NoItems.add(FusionLib.getColored("&ePart 3 of prestige token"));
        NoItems.add(FusionLib.getColored("&ePart 4 of prestige token"));
        //items
        NoItems.add(FusionLib.getColored("&f&lSuper pet cloud"));
        NoItems.add(FusionLib.getColored("&fPet cloud"));
        NoItems.add(FusionLib.getColored("&2&lSuper pet slime"));
        
        switch(event.getHand().toString()){
            case "HAND":
                if (item1 != null && NoItems.contains(item1.getItemMeta().getDisplayName())){
                    event.setCancelled(true);
                    FusionLib.sendToPlayer("&cHey &7You can't place this block!", event.getPlayer(), true); 
                }
                break;
            case "OFF_HAND":
            if (item2 != null && NoItems.contains(item2.getItemMeta().getDisplayName())){
                // FusionLib.Debug("Can't Place [Off Hand]" + item2.getItemMeta().getDisplayName(),true);
                event.setCancelled(true);
                FusionLib.sendToPlayer("&cHey &7You can't place this block!", event.getPlayer(), true);
            }
                break;
            default:
                break;
        }
    }
}
