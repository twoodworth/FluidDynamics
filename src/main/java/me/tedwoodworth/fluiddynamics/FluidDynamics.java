package me.tedwoodworth.fluiddynamics;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class FluidDynamics extends JavaPlugin {
    public static FluidDynamics plugin;


    @Override
    public void onEnable() {
        plugin = this;
    }

    @Override
    public void onDisable() {
    }
}
