package me.saeko.acceptrules.Listener;

import me.saeko.acceptrules.AcceptRules;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;
import xyz.upperlevel.spigot.book.BookUtil;

import static me.saeko.acceptrules.Listener.playerFirstJoinListener.createCommandBook;


public class playerChat implements Listener {

    AcceptRules mainplugin = AcceptRules.getPlugin();

    @EventHandler
    public void onPlayerChat(PlayerChatEvent e){
        Player p = e.getPlayer();

        if(mainplugin.getRulesList().contains(p)){
            BookUtil.openPlayer(p, createCommandBook(p));
            e.setCancelled(true);
        }
    }
}
