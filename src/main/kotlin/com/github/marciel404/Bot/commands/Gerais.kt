package com.github.marciel404.Bot.commands

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.interactions.commands.OptionType
import net.dv8tion.jda.api.interactions.components.buttons.Button
import org.jetbrains.annotations.NotNull

class Gerais : ListenerAdapter() {

    override fun onSlashCommandInteraction(@NotNull slash: SlashCommandInteractionEvent) {
        if (slash.name == "hello"){
            slash.reply("Hello ${slash.user.asMention}").queue()
        }
    }
}
