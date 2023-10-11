package tk.waterwolf.commands;


import tk.waterwolf.FusionLib;
import tk.waterwolf.SG30DLL;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.milkbowl.vault.permission.Permission;

public class Compress implements CommandExecutor {

    public Compress(SG30DLL plugin) {
        plugin.getCommand("Compress").setExecutor(this);
        plugin.getCommand("Compress").setTabCompleter(new CompressTab());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            FusionLib.sendToConsole("This comamnd can't be used by a console sender | Must be player", true);
            return false;
        }
        Player player = (Player) sender;
        Permission perms = SG30DLL.getPermissions();
        if (args.length < 1){
            FusionLib.sendInfo(player);
            return true;
        }else{
            String subCommand = args[0];
            switch(subCommand){
                case "1":
                case "true":
                case "on" :
                    FusionLib.SetAutocompressToggle(player, 1);
                    break;
                case "0":
                case "false":
                case "off":
                    FusionLib.SetAutocompressToggle(player, 0);
                    break;
                case "info":
                    FusionLib.sendInfo(player);
                    break;
                case "message":
                    String subArgs = args[1].toLowerCase();
                    switch (subArgs) {
                        case "1":
                        case "true":
                        case "on":
                            FusionLib.Debug(subArgs, true);
                            FusionLib.SetAutocompressMsgToggle(player, 1);
                            break;
                        case "0":
                        case "false":
                        case "off":
                            FusionLib.Debug(subArgs, true);
                            FusionLib.SetAutocompressMsgToggle(player, 0);
                            break;
                        default:
                            FusionLib.sendToPlayer("&cHey! &7Please use either '&fon&7' or '&foff&7'&r", player, true);
                            break;
                    }
                    break;
                case "admin":
                    String subSubCommand = args[1].toLowerCase();
                    switch (subSubCommand){
                        case "killswitch":
                            if (perms.playerHas(player,"SGDLL.compress.admin")){
                            //     for (ItemStack num : OreLib.CompressedMEGA()) {
                            //         player.getInventory().addItem(num);
                            //    }

                            }else{
                                FusionLib.sendToPlayer("You don't have perms for this command (did toni forget to add them?)", player, false);
                            }
                            break;
                            
                    }
                    break;
                
                default:
                    FusionLib.sendInfo(player);
                    break;
            }
        }
        return true;
    };
}




