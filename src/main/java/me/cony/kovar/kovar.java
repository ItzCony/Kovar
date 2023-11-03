package me.cony.kovar;

import Listenery.PouzitiLektvaru;
import Prikazy.DatLektvar;
import org.bukkit.plugin.java.JavaPlugin;

public final class kovar extends JavaPlugin {

    @Override
    public void onEnable(){

        getCommand("lektvar").setExecutor(new DatLektvar());

        getServer().getPluginManager().registerEvents(new PouzitiLektvaru(), this);


    }
    public void onDisable(){

    }
}
