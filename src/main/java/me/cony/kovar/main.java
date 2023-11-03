package me.cony.kovar;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin implements Listener {

    public void onEnable() {
        System.out.println("Plugin byl nacten");



    }

    public void onDisable() {
        System.out.println("Plugin byl vypnut");
    }
}
