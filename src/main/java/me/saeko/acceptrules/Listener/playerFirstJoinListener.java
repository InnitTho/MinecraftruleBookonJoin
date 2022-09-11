package me.saeko.acceptrules.Listener;

import de.leonhard.storage.Yaml;
import me.saeko.acceptrules.AcceptRules;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;
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

            Scoreboard board = mainplugin.getServer().getScoreboardManager().getMainScoreboard();
            Team noCollision = board.getTeam("noCollision");
            if(noCollision != null)
                noCollision.addEntry(p.getName());
        }
    }
    private ItemStack createCommandBook(Player p) {
        return BookUtil.writtenBook()
                .author("susko")
                .title("me when aaaaaaaaaaaaaaa")
                .pages(
                        new BookUtil.PageBuilder()

                                .add(
                                        BookUtil.TextBuilder.of("Welcome to TheServer.wtf")
                                                .color(ChatColor.DARK_GREEN)
                                                .style(ChatColor.BOLD)
                                                .build()
                                )

                                .newLine()

                                .add(

                                       BookUtil.TextBuilder.of("-------------------")
                                               .build()

                                )

                                .add(

                                        BookUtil.TextBuilder.of("To get started, check out your Phone menu. In there you can find the RolePlay Menu and HandyMan page and other things you can utilize.")
                                                .color(ChatColor.GOLD)
                                                .build()
                                )
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("--------------")
                                                .color(ChatColor.DARK_RED)
                                                .build()

                                )
                                .newLine()
                                        .add(
                                BookUtil.TextBuilder.of("Please read this entire book")
                                        .color(ChatColor.DARK_RED)
                                        .build()
                                )
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("--------------")
                                                .color(ChatColor.DARK_RED)
                                                .build()
                                )

                                .build(),
                                 new BookUtil.PageBuilder()
                                .add(
                                        BookUtil.TextBuilder.of("Also consider checking out our Discord server to get the latest updates about TheServer and to chat with our community.")
                                                .color(ChatColor.DARK_BLUE)
                                                .build()
                                )
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("[Discord]")
                                        .onClick(BookUtil.ClickAction.openUrl("http://dc.theserver.wtf/"))
                                        .onHover(BookUtil.HoverAction.showText("Click here to get the discord link"))
                                        .color(ChatColor.BLUE)
                                        .build()
                                )
                                .build(),


        new BookUtil.PageBuilder()

                .add(
                        BookUtil.TextBuilder.of("Advisory")
                                .color(ChatColor.RED)
                                .build()
                )

                .newLine()

                .add(

                        BookUtil.TextBuilder.of("-------------------")
                                .build()

                )

                .add(

                        BookUtil.TextBuilder.of("Warning; Alcoholism, Drug Usage, Smoking and various other 'mature' roleplay items are allowed for Roleplay & Realism. However, note we are a 13+ Server and allow such. With that said, absolutely NO NSFW and Slurs Will Be Tolerated!"
)
                                .color(ChatColor.DARK_RED)
                                .build()
                )


                                .build(),
                        new BookUtil.PageBuilder()

                                .add(
                                        BookUtil.TextBuilder.of("Before we can get started however, you will first have to read and accept our rules, to do that, flip to the next page.")
                                                .color(ChatColor.BLUE)
                                                .build()

                                )
                                .build(),
                        new BookUtil.PageBuilder()
                                .add(



                                        BookUtil.TextBuilder.of("Rule 1. Use Common sense")
                                                .onHover(BookUtil.HoverAction.showText("We may not have a rule for everything. That doesn't mean you can abuse a lack of a certain rule. Make sure to follow common sense on what is and what is not right."))
                                                .color(ChatColor.GOLD)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("Rule 2. Don't Publish Personal Information")
                                                .onHover(BookUtil.HoverAction.showText("Do NOT publish people's personal information because it is a breach of privacy. Information such as: home addresses, passwords, license plates, financial information, etc. Revealing personal information about people is strictly prohibited."))
                                                .color(ChatColor.GOLD)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("Rule 3. No NSFW Roleplay")
                                                .onHover(BookUtil.HoverAction.showText("Visualization of nsfw situations are in violation of this rule. Romantic tension, and vague reference are allowed, so long as they do not stem into disallowed areas as stated before."))
                                                .color(ChatColor.GOLD)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("Rule 4. Do Not Be Overly Dramatic in Any Way")
                                                .onHover(BookUtil.HoverAction.showText("This includes sudden threats of suicide or self harm for attention which is petty and will not be tolerated."))
                                                .color(ChatColor.GOLD)
                                                .build()

                                )
                                .newLine()
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("Rule 5. No Bullying")
                                                .onHover(BookUtil.HoverAction.showText("Do not start drama with anyone. If you feel like you have a problem with anyone please talk to staff."))
                                                .color(ChatColor.GOLD)
                                                .build()

                                )
                                .build(),
                                new BookUtil.PageBuilder()


                                .add(

                                        BookUtil.TextBuilder.of("Rule 6. Do Not Impersonate Staff")
                                                .onHover(BookUtil.HoverAction.showText("Pretending to work for, or even own the server to deceive players, or even just for fun is strictly prohibited."))
                                                .color(ChatColor.GOLD)
                                                .build()

                                )
                                .newLine()
                                .newLine()
                                        .add(


                                        BookUtil.TextBuilder.of("Rule 7. Do Not Mini Mod")
                                                .onHover(BookUtil.HoverAction.showText("Do not moderate as if you are staff. If you think someone is breaking the rules please talk to a staff member instead of trying to handle it yourself."))
                                                .color(ChatColor.GOLD)
                                                .build()

                                        )
                                        .newLine()
                                        .newLine()

                                        .add(


                                        BookUtil.TextBuilder.of("Rule 8. Do Not Take Models Or Textures From The Resourcepack")
                                                .onHover(BookUtil.HoverAction.showText("Stealing textures or using the server texturepack outside of the server for things such as youtube roleplays, your own server, or even things just between friends is prohibited. We worked hard on this pack, and it is protected by copyright law."))
                                                .color(ChatColor.GOLD)
                                                .build()

                                        )
                                        .newLine()
                                        .newLine()



                                                .add(

                                        BookUtil.TextBuilder.of("Rule 9. Do Not Ask To Be Given Paid Privileges")
                                                 .onHover(BookUtil.HoverAction.showText("This includes item variants, roles, etc for free. Staff are not allowed to grant you these for free and you will be given a warning."))
                                                 .color(ChatColor.GOLD)
                                                 .build()

                                                )
                                        .newLine()
                                        .newLine()



                                .build(),
                                new BookUtil.PageBuilder()

                                        .add(

                                        BookUtil.TextBuilder.of("Rule 10. No Hacking")
                                                .onHover(BookUtil.HoverAction.showText("Hacking and Exploiting is strictly prohibited. Please report any hackers or exploiters to staff."))
                                                .color(ChatColor.GOLD)
                                                .build()

                                        )
                                .newLine()
                                .newLine()



                                        .add(

                                        BookUtil.TextBuilder.of("Rule 11. Do Not Spam The Chat")
                                                .color(ChatColor.GOLD)
                                                .build()

                                        )


                                .newLine()
                                .newLine()
                                        .add(

                                        BookUtil.TextBuilder.of("Rule 12. No slurs")
                                                .color(ChatColor.GOLD)
                                                .build()

                                )
                                .newLine()
                                .newLine()

                                        .add(

                                        BookUtil.TextBuilder.of("Rule 13. No Political Conversations")
                                                .onHover(BookUtil.HoverAction.showText("Things like politics are way too volatile and unstable to deal with."))
                                                .color(ChatColor.GOLD)
                                                .build()

                                )
                                .newLine()
                                .newLine()

                                        .add(

                                                BookUtil.TextBuilder.of("[Accept Rules]")
                                                .onHover(BookUtil.HoverAction.showText("By clicking this you agree to follow the rules"))
                                                .onClick(BookUtil.ClickAction.runCommand("/AcceptRules"))
                                                .color(ChatColor.GREEN)
                                                .build()

                                )
                                .build()
                )
                .build();
    }
}