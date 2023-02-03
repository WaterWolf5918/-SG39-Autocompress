package tk.waterwolf.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;


import net.milkbowl.vault.permission.Permission;

import tk.waterwolf.SG30DLL;

public class CompressTab implements TabCompleter{

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Permission perms = SG30DLL.getPermissions();
        Boolean admin = perms.playerHas(player,"SGDLL.compress.admin");
        //what layer of args you are on /compress [1] [2] [3] [etc]
        switch(args.length){
            case 1:
                List<String> argsList = new ArrayList<>();
                argsList.add("off");
                argsList.add("on");
                argsList.add("message");
                if (admin){argsList.add("admin");}
                return argsList;
            case 2:
                List<String> argsList2 = new ArrayList<>();
                argsList2.add("on");
                argsList2.add("off");
                if (admin){
                    argsList2.add("give");
                    argsList2.add("giveAll");
                }
                return argsList2;    
             case 3:
                List<String> argsList3 = new ArrayList<>();
                if (admin){
                    argsList3.add("CompressedCoal");
                    argsList3.add("CompressedCopper");
                    argsList3.add("CompressedStone");
                    argsList3.add("CompressedIron");
                    argsList3.add("CompressedRedstone");
                    argsList3.add("CompressedGold");
                    argsList3.add("CompressedLapis");
                    argsList3.add("CompressedEmerald");
                    argsList3.add("CompressedObsidian");
                    argsList3.add("CompressedLime");
                    argsList3.add("CompressedMagenta");
                    argsList3.add("CompressedMelon");
                    argsList3.add("CompressedCookie");
                }
                return argsList3;
            default:
                break;
        }


        return null;
    }
    
}
