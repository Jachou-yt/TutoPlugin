package fr.jachou.tutoplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandChangeGamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.getGameMode() == GameMode.SURVIVAL) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("Vous êtes maintenant en créatif");
            } else if (player.getGameMode() == GameMode.CREATIVE) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("Vous êtes maintenant en survie");
            }
        } else {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "Seul un joueur peut éxécuter cette commande !");
        }

        return true;
    }
}
