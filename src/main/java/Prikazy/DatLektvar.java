package Prikazy;

import Utility.LektvarSoustredeni;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class DatLektvar implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player hrac){
            if(hrac.hasPermission("kovar.lektvar.soustredeni")){
                if(args.length == 0){

                    ItemStack lektvar = LektvarSoustredeni.Lektvar();
                    hrac.getInventory().addItem(lektvar);

                    hrac.sendMessage(ChatColor.GREEN + " Obdržel jsi lektvar soustředění");

                }else {
                    Player target = Bukkit.getPlayerExact(args[0]);

                    if(target == null){
                        hrac.sendMessage(ChatColor.RED + " Tento hráč neexistuje");
                        return true;
                    }

                    ItemStack lektvar = LektvarSoustredeni.Lektvar();
                    target.getInventory().addItem(lektvar);

                    target.sendMessage(ChatColor.GREEN + " Obdržel jsi lektvar soustředění");

                }


            }


        }






        return true;
    }
}
