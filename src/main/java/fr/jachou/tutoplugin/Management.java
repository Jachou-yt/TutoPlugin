package fr.jachou.tutoplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Management {
    public static void load() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Le plugin c'est démarré correctement");
    }

    public static void unload() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Le plugin c'est arrêté correctement");
    }
}
