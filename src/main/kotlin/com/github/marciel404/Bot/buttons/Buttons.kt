package com.github.marciel404.Bot.buttons

import com.github.marciel404.Bot.classes.ButtonKiss
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import org.jetbrains.annotations.NotNull

class Buttons : ListenerAdapter() {

    override fun onButtonInteraction(@NotNull button: ButtonInteractionEvent) {

        println(button.componentId)
        println(button.interaction.user)
        println(button.interaction.message.author)
        println(button.component)
        println(button.member)

        if (button.componentId == "kiss-${button.interaction.user.id}"){

        }else{
            button.reply("Esse botão não pertence a você e sim a <@${button.componentId.removePrefix("kiss-")}>").setEphemeral(true).queue()
        }
    }
}