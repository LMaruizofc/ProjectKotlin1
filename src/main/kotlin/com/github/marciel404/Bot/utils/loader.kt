package com.github.marciel404.Bot.utils

import com.github.marciel404.Bot.buttons.Buttons
import com.github.marciel404.Bot.commands.Actions
import com.github.marciel404.Bot.commands.Gerais
import com.github.marciel404.Bot.commands.Moderation
import com.github.marciel404.Bot.events.Ready
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.entities.Activity
import net.dv8tion.jda.api.requests.GatewayIntent
import net.dv8tion.jda.api.utils.ChunkingFilter
import net.dv8tion.jda.api.utils.MemberCachePolicy
import net.dv8tion.jda.api.utils.cache.CacheFlag

val client = JDABuilder.createDefault(token)
        .enableIntents(GatewayIntent.MESSAGE_CONTENT)
        .disableCache(CacheFlag.ACTIVITY)
        .disableCache(CacheFlag.CLIENT_STATUS)
        .disableCache(CacheFlag.VOICE_STATE)
        .setMemberCachePolicy(MemberCachePolicy.VOICE.or(MemberCachePolicy.OWNER))
        .setChunkingFilter(ChunkingFilter.NONE)
        .disableIntents(GatewayIntent.GUILD_PRESENCES, GatewayIntent.GUILD_MESSAGE_TYPING)
        .setActivity(Activity.watching("Minhas Engrenagens"))
        .addEventListeners(Ready(), Gerais(), Moderation(), Buttons(), Actions())
        .build()