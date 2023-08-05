package me.saeko.acceptrules.Listener;

import de.leonhard.storage.Yaml;
import me.saeko.acceptrules.AcceptRules;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import xyz.upperlevel.spigot.book.BookUtil;

import java.awt.print.Book;


public class playerFirstJoinListener implements Listener {
    AcceptRules mainplugin = AcceptRules.getPlugin();

    @EventHandler
    public void onPlayerjoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        Yaml yaml = new Yaml(p.getUniqueId().toString() + ".yml", mainplugin.getDataFolder() + "/players/");
        yaml.setDefault("rules", false);

        if(!yaml.getBoolean("rules")){
            BookUtil.openPlayer(p, createCommandBook(p));
            mainplugin.getRulesList().add(p);

        }
    }

    //These can be changed to your liking while the creator gets the motivation to make this easily editable for the average user. Remember to follow the GPL v3 License.
    public static ItemStack createCommandBook(Player p) {
        return BookUtil.writtenBook()
                .author("susko")
                .title("me when aaaaaaaaaaaaaaa")
                .pages(
                        new BookUtil.PageBuilder()

                                .add(
                                        BookUtil.TextBuilder.of("Welcome to ")
                                                .color(ChatColor.BLUE)
                                                .style(ChatColor.BOLD)
                                                .build()
                                )
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("[Insert your server's name here]")
                                                .color(ChatColor.GOLD)
                                                .style(ChatColor.BOLD)
                                                .build()
                                )

                                .newLine()
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("To continue, you'll have to press the clickable ACCEPT button at the end of this book.")
                                                .color(ChatColor.DARK_AQUA)
                                                .build()
                                )
                                .build(),

                        new BookUtil.PageBuilder()

                                .add(
                                        BookUtil.TextBuilder.of("RULES")
                                                .color(ChatColor.BLUE)
                                                .style(ChatColor.BOLD)
                                                .build()
                                )

                                .newLine()
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("1. Be respectful.")
                                                .onHover(BookUtil.HoverAction.showText("Do not bully, harass, discriminate, etc."))
                                                .color(ChatColor.DARK_BLUE)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("2. Use common sense and keep server peace.")
                                                .onHover(BookUtil.HoverAction.showText("just basic common sense"))
                                                .color(ChatColor.DARK_BLUE)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("3. No publishing of personal information.")
                                                .onHover(BookUtil.HoverAction.showText("(E.g. addresses and passwords.) Less critical information, such as names, is up to the individual to share."))
                                                .color(ChatColor.DARK_BLUE)
                                                .build()

                                )
                                .newLine()
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("4. Do not discuss politics or religion.")
                                                .onHover(BookUtil.HoverAction.showText("Such sensitive topics can lead to arguments,disagreemets, etc."))
                                                .color(ChatColor.DARK_BLUE)
                                                .build()

                                )
                                .build(),
                                new BookUtil.PageBuilder()


                                .add(

                                        BookUtil.TextBuilder.of("5. Do Not mini-mod or impersonate staff.")
                                                .onHover(BookUtil.HoverAction.showText("Contact an admin or mod if you have an issue with another player needing staff attention."))
                                                .color(ChatColor.DARK_BLUE)
                                                .build()

                                )
                                .newLine()
                                .newLine()

                                        .add(


                                        BookUtil.TextBuilder.of("6.Do not use hacks and exploits.")
                                                .onHover(BookUtil.HoverAction.showText("If you catch anybody breaking this rule, report it to a staff member."))
                                                .color(ChatColor.DARK_BLUE)
                                                .build()

                                        )
                                        .newLine()
                                        .newLine()

                                        .add(
                                                BookUtil.TextBuilder.of("7. Do not ask staff to give you paid ranks or items for free.")
                                                        .color(ChatColor.DARK_BLUE)
                                                        .build()

                                        )

                                        .build(),
                                new BookUtil.PageBuilder()

                                        .add(

                                        BookUtil.TextBuilder.of("8. Remember to always listen to the staff and have fun!")
                                               .color(ChatColor.DARK_BLUE)
                                                .build()

                                        )
                                        .add(

                                                BookUtil.TextBuilder.of("[ACCEPT]")
                                                        .onHover(BookUtil.HoverAction.showText("Click to Accept"))
                                                        .onClick(BookUtil.ClickAction.runCommand("/AcceptRules"))
                                                        .color(ChatColor.DARK_GREEN)
                                                        .style(ChatColor.BOLD)
                                                        .build()

                                )
                                .build()
                )
                .build();
    }
}
