package me.saeko.acceptrules;

import me.saeko.acceptrules.Commands.acceptTherules;
import me.saeko.acceptrules.Commands.rules;
import me.saeko.acceptrules.Listener.playerChat;
import me.saeko.acceptrules.Listener.playerFirstJoinListener;
import me.saeko.acceptrules.Listener.playerMove;
import me.saeko.acceptrules.Listener.thingyThatmutes;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class AcceptRules extends JavaPlugin {
    private static AcceptRules plugin = null;

    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new playerFirstJoinListener(), this);
        getServer().getPluginManager().registerEvents(new playerMove(), this);
        getServer().getPluginManager().registerEvents(new playerChat(), this);
        getServer().getPluginManager().registerEvents(new thingyThatmutes(), this);
        getCommand("AcceptRules").setExecutor(new acceptTherules());
        getCommand("rules").setExecutor(new rules());
    }
    public static AcceptRules getPlugin(){
        return plugin;
    }
    List<Player> rulesList = new ArrayList<>();
    public List<Player> getRulesList(){
        return rulesList;
    }
}