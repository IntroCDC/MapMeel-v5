package br.com.mapmeel.v5;
/*
 * Written by IntroCDC, Bruno Coêlho at 01/02/2019 - 17:00
 */

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class MapMain extends JavaPlugin {

    private static Plugin plugin;

    public static Plugin getPlugin() {
        return plugin;
    }

    public void onEnable() {
        
    }

    public void onLoad() {
        plugin = this;
    }

}
