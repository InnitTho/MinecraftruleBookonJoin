package me.saeko.acceptrules.Listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class AcceptRulesListner implements Listener {

    @EventHandler
    public void onButtonClick(InventoryClickEvent event) {
        // Check if the clicked item is the "Accept Rules" button
        if (event.getCurrentItem() != null && event.getCurrentItem().getItemMeta() != null
                && event.getCurrentItem().getItemMeta().getDisplayName().equals("Accept Rules")) {
            event.setCancelled(true);

            Player player = (Player) event.getWhoClicked();
            Bukkit.dispatchCommand(player, "acceptrules");
        }
    }
}