package com.github.marciel404.Bot.events

import net.dv8tion.jda.api.events.GenericEvent
import net.dv8tion.jda.api.events.session.ReadyEvent
import net.dv8tion.jda.api.hooks.EventListener

class Ready: EventListener {

    override fun onEvent(e: GenericEvent) {

        if (e is ReadyEvent){

            println("Eu entrei como ${e.jda.selfUser.name}")

        }
    }
}