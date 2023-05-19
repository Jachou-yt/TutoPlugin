package fr.jachou.tutoplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandBroadcast implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (args.length < 0) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i =0; i < args.length; i++) {
                sb.append(args[i] + " ");
            }

            Bukkit.broadcastMessage(ChatColor.RED + "[BroadCast] §r" + sb.toString());
        }

        return true;
    }
}
