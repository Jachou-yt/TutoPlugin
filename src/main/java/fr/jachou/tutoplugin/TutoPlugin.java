package fr.jachou.tutoplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class TutoPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Management.load();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Management.unload();
    }
}
