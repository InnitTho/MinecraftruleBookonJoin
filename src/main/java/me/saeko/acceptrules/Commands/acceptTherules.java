package me.saeko.acceptrules.Commands;

import de.leonhard.storage.Yaml;
import me.saeko.acceptrules.AcceptRules;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;
import org.jetbrains.annotations.NotNull;

public class acceptTherules implements CommandExecutor {
    //Mom come pick me up im scared
    AcceptRules mainplugin = AcceptRules.getPlugin();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        Player p = (Player) sender;

        if (mainplugin.getRulesList().contains(p)) {
            Yaml yaml = new Yaml(p.getUniqueId() + ".yml", mainplugin.getDataFolder() + "/players/");
            yaml.set("rules", true);
            mainplugin.getRulesList().remove(p);
            // TODO: Hook into the central plugin please
            p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.RESET + "\uE004" + ChatColor.DARK_GRAY + "] " + ChatColor.GREEN + "Thank you for accepting the rules");

            // Pdani: Please don't use commands if spigot has an api for it.
            //        Also, what is the point of doing this?
            /*ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
            String commandTwo = "team leave "+p.getName();
            Bukkit.dispatchCommand(console, commandTwo);

            String commandThree = "team join Player "+p.getName();
            Bukkit.dispatchCommand(console, commandThree);*/
            // Ignore this NPE warning, if everything works perfectly, this should never throw.
            Scoreboard board = mainplugin.getServer().getScoreboardManager().getMainScoreboard();
            Team team = board.getEntryTeam(p.getName());
            if(team != null)
                team.removeEntry(p.getName());
            Team player = board.getTeam("Player");
            if(player != null)
                player.addEntry(p.getName());


        } else {
            // TODO: Hook into the central plugin please
            p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.RESET + "\uE004" + ChatColor.DARK_GRAY + "] " + ChatColor.RED + "You have already accepted the rules");
        }

        return true;
    }
}