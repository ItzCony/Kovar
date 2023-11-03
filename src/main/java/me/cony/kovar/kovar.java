package me.cony.kovar;

import Listenery.PouzitiLektvaru;
import Prikazy.DatLektvar;
import org.bukkit.plugin.java.JavaPlugin;

public final class kovar extends JavaPlugin {

    @Override
    public void onEnable(){

        this.getCommand("lektvar").setExecutor(new DatLektvar());
        this.getServer().getPluginManager().registerEvents(new PouzitiLektvaru(), this);


    }
}
