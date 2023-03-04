package me.saeko.acceptrules.Listener;

import me.saeko.acceptrules.AcceptRules;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class thingyThatmutes implements Listener {

    AcceptRules mainplugin = AcceptRules.getPlugin();

    @EventHandler
    public void onAsyncPlayerChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();

        if (mainplugin.getRulesList().contains(p)) {
            e.setCancelled(true);
        }
    }
}
