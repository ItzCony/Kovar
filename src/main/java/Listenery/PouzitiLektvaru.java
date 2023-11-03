package Listenery;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PouzitiLektvaru implements Listener {

    @EventHandler
    public void Pozreti(PlayerInteractEvent event){
        Player hrac = event.getPlayer();
        ItemStack vruce = hrac.getInventory().getItemInMainHand();
        if (vruce.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GREEN + "Lektvar Soustředění")){
            vruce.setAmount(vruce.getAmount() - 1);
            hrac.sendMessage(ChatColor.AQUA + " Pozřel jsi lektvar soustředěná");
            hrac.playSound(hrac, Sound.ENTITY_VILLAGER_TRADE, 1,1);
        }
    }
}
