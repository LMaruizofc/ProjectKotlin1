package com.github.marciel404.Bot.classes

import net.dv8tion.jda.api.entities.Member
import net.dv8tion.jda.api.entities.User
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent
import net.dv8tion.jda.api.interactions.components.buttons.Button


fun ButtonKiss(user: User, member: User) : Button {

    val button = Button.primary("kiss-${member.id}","Ola")

    return button
}