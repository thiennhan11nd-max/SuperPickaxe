package com.pickaxe;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class PickaxePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("cup").setExecutor(new PickaxeCommand());
        getCommand("cuplist").setExecutor(new PickaxeCommand());
        Bukkit.getPluginManager().registerEvents(new PickaxeListener(), this);
        PickaxeCraft.registerRecipes(this);
        getLogger().info("SuperPickaxe da bat! 10 Cup + 1 Cup Mem Mai!");
    }
}
