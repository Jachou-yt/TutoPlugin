package fr.jachou.tutoplugin;

import fr.jachou.tutoplugin.commands.CommandBroadcast;
import fr.jachou.tutoplugin.commands.CommandChangeGamemode;
import org.bukkit.plugin.java.JavaPlugin;

public final class TutoPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Management.load();

        getCommand("broadcast").setExecutor(new CommandBroadcast());
        getCommand("changegamemode").setExecutor(new CommandChangeGamemode());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Management.unload();
    }
}
