package me.saeko.acceptrules.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import xyz.upperlevel.spigot.book.BookUtil;

public class rules implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) sender;
        BookUtil.openPlayer(p, createCommandBook(p));
        return true;
    }
    private ItemStack createCommandBook(Player p) {
        return BookUtil.writtenBook()
                .author("susko")
                .title("me when aaaaaaaaaaaaaaa")
                .pages(
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
                                                .onHover(BookUtil.HoverAction.showText("Do not bully, harass, discriminate, or use slurs."))
                                                .color(ChatColor.DARK_BLUE)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("2. Use common sense and keep server peace.")
                                                .onHover(BookUtil.HoverAction.showText("Advertising, raiding, spamming, bringing in personal drama, and posting sudden threats of self-harm are all in violation of this rule."))
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
                                                .onHover(BookUtil.HoverAction.showText("Such conversations are way too volatile to be had here."))
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


                                        BookUtil.TextBuilder.of("6. Do not steal or redistribute our resource pack; or use hacks and exploits.")
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


                                .build(),
                        new BookUtil.PageBuilder()
                                .add(

                                        BookUtil.TextBuilder.of("RP GUIDELINES")
                                                .style(ChatColor.BOLD)
                                                .color(ChatColor.DARK_AQUA)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("Terms to Know:")
                                                .color(ChatColor.DARK_GREEN)
                                                .style(ChatColor.BOLD)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("RP - Roleplay.")
                                                .color(ChatColor.DARK_GREEN)
                                                .build()
                                )
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("IC - In Character.")
                                                .color(ChatColor.DARK_GREEN)
                                                .build()
                                )
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("OOC - Out of Character.")
                                                .color(ChatColor.DARK_GREEN)
                                                .build()
                                )
                                .newLine()
                                .add(

                                        BookUtil.TextBuilder.of("Canon - Official or confirmed; information accepted as true.")
                                                .color(ChatColor.DARK_GREEN)
                                                .build()
                                )
                                .build(),
                        new BookUtil.PageBuilder()
                                .add(
                                        BookUtil.TextBuilder.of("1. Keep it 'Safe for Work'")
                                                .onHover(BookUtil.HoverAction.showText("Roleplay that is explicitly sexual is not permitted. However as a 13+ server we do allow mature topics. Romance and flirting are OK, but they shouldn't progress to vulgar conversation, touching, or sexual activity."))
                                                .color(ChatColor.DARK_GREEN)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("2. Do Not Powerplay")
                                                .onHover(BookUtil.HoverAction.showText("Powerplaying is forcing actions upon other people’s characters without asking first."))
                                                .color(ChatColor.DARK_GREEN)
                                                .build()

                                )
                                .newLine()
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("3. Do Not Auto")
                                                .onHover(BookUtil.HoverAction.showText("'Auto' is similar to powerplaying. However, this is when you perform an action and do not give others a chance to reply before continuing with the said action."))
                                                .color(ChatColor.DARK_GREEN)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("4. Do Not Godmod")
                                                .onHover(BookUtil.HoverAction.showText("Godmodding is when you give your character God-like powers."))
                                                .color(ChatColor.DARK_GREEN)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("5. No Mary Sues")
                                                .onHover(BookUtil.HoverAction.showText("A'Mary Sue' is a character too perfect to abide by logic. A Mary Sue may often have God-like powers, no flaws, and be unrealistically 'perfect' overall."))
                                                .color(ChatColor.DARK_GREEN)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("6. No Metagaming")
                                                .onHover(BookUtil.HoverAction.showText("Metagaming is when a character knows information learned OOC while IC, without learning about the said info IC first."))
                                                .color(ChatColor.DARK_GREEN)
                                                .build()
                                )
                                .newLine()
                                .newLine()
                                .add(
                                        BookUtil.TextBuilder.of("7. Consent")
                                                .onHover(BookUtil.HoverAction.showText("Consent is essential. Always make sure you have permission to join others’ roleplays. Powerplaying, godmodding and metagaming allowed, as long as you have consent from everyone you are roleplaying with."))
                                                .color(ChatColor.DARK_GREEN)
                                                .build()
                                )
                                .build()
                )
                .build();
    }
}
