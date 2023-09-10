package com.github.marciel404.Bot.commands

import com.github.marciel404.Bot.requests.kiss
import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import java.awt.Color
import com.github.marciel404.Bot.classes.ButtonKiss

class Actions : ListenerAdapter() {

    override fun onSlashCommandInteraction(slash: SlashCommandInteractionEvent) {

        if (slash.name == "kiss"){

            var member = slash.options[0]

            var embed = EmbedBuilder()
                .setTitle("Abraço")
                .setDescription("${slash.interaction.user} abraçou ${member.asUser.asMention}")
                .setImage(kiss())
                .setColor(Color.BLUE).build()
            slash.replyEmbeds(embed)
                .setActionRow(ButtonKiss(slash.user, member.asUser)).queue()
        }

    }

}