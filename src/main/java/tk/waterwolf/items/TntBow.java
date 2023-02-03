package tk.waterwolf.items;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityShootBowEvent;

import tk.waterwolf.FusionLib;

public class TntBow {
    public static void item(EntityShootBowEvent event){
        if (event.getBow().getItemMeta().getDisplayName().equals(FusionLib.getColored("&cTnt Bow"))){
            FusionLib.Debug("Tnt Bow", true);
            Entity e = event.getProjectile().getWorld().spawnEntity(event.getProjectile().getLocation(), EntityType.PRIMED_TNT);
            event.getProjectile().addPassenger(e);
            
        }
    }
}
