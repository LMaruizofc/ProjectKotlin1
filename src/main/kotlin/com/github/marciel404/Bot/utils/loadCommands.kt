package com.github.marciel404.Bot.utils

import net.dv8tion.jda.api.interactions.commands.OptionType

fun loadCommands(){

    client.upsertCommand("hello","Teste").setGuildOnly(true).queue()

    client.upsertCommand("random","Escolhe um numero aleatorio").setGuildOnly(true)
            .addOption(OptionType.INTEGER,"number","Number",true).queue()

    client.upsertCommand("kiss","Beija alguem").setGuildOnly(true)
        .addOption(OptionType.USER,"member","Select Member",true).queue()
}