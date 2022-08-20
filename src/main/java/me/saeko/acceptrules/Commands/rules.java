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
                                .build()
                )
                .build();
    }
}

