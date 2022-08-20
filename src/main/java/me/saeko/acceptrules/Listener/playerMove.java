package me.saeko.acceptrules.Listener;

import de.leonhard.storage.Yaml;
import me.saeko.acceptrules.AcceptRules;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class playerMove implements Listener {

    AcceptRules mainplugin = AcceptRules.getPlugin();

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent e){

        Player p = e.getPlayer();

        if(mainplugin.getRulesList().contains(p)){
            p.kickPlayer("Please accept the rules");
            e.setCancelled(true);

        }
    }
}
