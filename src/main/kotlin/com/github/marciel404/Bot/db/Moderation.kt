package com.github.marciel404.Bot.db

import com.github.marciel404.Bot.utils.*
import com.mongodb.ConnectionString
import com.mongodb.MongoException
import com.mongodb.client.MongoClients;
import com.mongodb.client.model.UpdateOptions
import com.mongodb.client.model.Updates
import org.bson.Document

class Moderation {

    val client = MongoClients.create(ConnectionString(mongokey))
    var db = client.getDatabase(database)
    var invites = db.getCollection("invites")

    fun addInvite(guildId: String, memberId: String, qnt: Int) {

        try {

            var query = Document()
                .append("_id", "${guildId}_${memberId}")

            var update = Updates.inc("qnt", +qnt)

            val upsert = UpdateOptions().upsert(true)

            invites.updateOne(query, update, upsert)

            println("Adicionado $qnt invites")
        } catch (error: MongoException) {

            println("Error: $error")

        }
    }

    fun rmvInvite(guildId: String,memberId: String, qnt: Int) {

        try {

            var query = Document()
                .append("_id", "${guildId}_${memberId}")

            var update = Updates.inc("qnt", - qnt)

            val upsert = UpdateOptions().upsert(true)

            invites.updateOne(query, update, upsert)

            println("Removido $qnt invites")

        } catch (error: MongoException) {

            println("Error: $error")

        }
    }
}