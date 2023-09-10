package com.github.marciel404.Bot

import com.github.marciel404.Bot.utils.*

class Main {

    companion object{

        @JvmStatic
        suspend fun main(args: Array<String>){
            System.setProperty(org.slf4j.simple.SimpleLogger.LOG_FILE_KEY, "null")
            client
            loadCommands()
        }


    }

}

