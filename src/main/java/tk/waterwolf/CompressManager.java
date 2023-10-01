package tk.waterwolf;

import org.bukkit.Material;
import org.bukkit.entity.Player;
// import tk.waterwolf.items.Compressed.CompressedLevelOne;





public class CompressManager {
    public static void checkCompress(Player player){
        if(FusionLib.GetAutocompressToggle(player) == false){return;}
        for (int i = 0; i < player.getInventory().getSize(); i++) {
            if (player.getInventory().getItem(i) != null && player.getInventory().getItem(i).getType() != Material.AIR){
                // item is not null and not air
                if (player.getInventory().getItem(i).hasItemMeta() && player.getInventory().getItem(i).getItemMeta().hasLore()) {
                    //item has lore
                    int CompressedItemAmount = 0;
                    if (player.getInventory().getItem(i).getAmount() == 32) {
                        CompressedItemAmount = 1;
                    }
                    else if (player.getInventory().getItem(i).getAmount() == 64){
                        CompressedItemAmount = 2;
                    }
                    if (CompressedItemAmount != 0){
                        int loreSize = player.getInventory().getItem(i).getItemMeta().getLore().size();


                        switch(player.getInventory().getItem(i).getItemMeta().getLore().get(loreSize - 1).replace('§', '$')){
                            case "$1":{
                                FusionLib.Debug("\nLevel 1 Compress |\nSlot " + i + " |\nGiving Comprssed Item " + CompressedItemAmount + " times |\n Item name" + player.getInventory().getItem(i).getItemMeta().getDisplayName(), true);
                                CompressLevelOne.Compress(player, i,CompressedItemAmount);
                                break;
                            }
                            case "$2": {
                                FusionLib.Debug("\nLevel 2 Compress |\nSlot " + i + " |\nGiving Comprssed Item " + CompressedItemAmount + " times |\n Item name"+ player.getInventory().getItem(i).getItemMeta().getDisplayName(), true);
                                CompressLevelTwo.Compress(player, i,CompressedItemAmount);
                                break;
                            }
                            case "$3": {
                                FusionLib.Debug("\nLevel 3 Compress |\nSlot " + i + " |\nGiving Comprssed Item " + CompressedItemAmount + " times |\n Item name"+ player.getInventory().getItem(i).getItemMeta().getDisplayName(), true);
                                break;
                            }

                        }
                    }
                }
            } // remove later
        }
    }



}
