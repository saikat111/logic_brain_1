package com.logichexa.logicbrain1.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.logichexa.logicbrain1.data.model.ConversationModel
import com.logichexa.logicbrain1.data.model.MessageModel

@Database(
    entities = [ConversationModel::class, MessageModel::class],
    version = 1,
    exportSchema = false
)
abstract class ConversAIDatabase : RoomDatabase() {
    abstract fun conversAIDao(): ConversAIDao
}