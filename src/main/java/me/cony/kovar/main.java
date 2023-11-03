package me.cony.kovar;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
        System.out.println("Plugin byl nacten");



    }

    public void onDisable() {
        System.out.println("Plugin byl vypnut");
    }
}
