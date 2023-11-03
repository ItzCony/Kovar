package Utility;


import Handlers.ItemBuilder;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class LektvarSoustredeni {

    public static ItemStack Lektvar(){
        ItemStack lektvar = new ItemBuilder(Material.POTION, 1).setName(ChatColor.GREEN + "Lektvar Soustředění").setLore(ChatColor.AQUA + " Zvýší šanci na vylepšení o 25%").build();
        ItemMeta lektvarMeta = lektvar.getItemMeta();
        lektvar.setItemMeta(lektvarMeta);

        return lektvar;
    }
}
