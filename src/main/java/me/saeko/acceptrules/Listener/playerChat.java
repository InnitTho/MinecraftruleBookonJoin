package me.saeko.acceptrules.Listener;

import me.saeko.acceptrules.AcceptRules;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;


public class playerChat implements Listener {

    AcceptRules mainplugin = AcceptRules.getPlugin();

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e){

        Player p = e.getPlayer();

        if(mainplugin.getRulesList().contains(p)){
            p.kickPlayer("Please accept the rules");
            e.setCancelled(true);
        }
    }
}
