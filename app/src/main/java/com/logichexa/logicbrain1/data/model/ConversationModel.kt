package com.logichexa.logicbrain1.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "conversations")
data class ConversationModel(
    @PrimaryKey(autoGenerate = false)
    var id: String = Date().time.toString(),
    var title: String = "",
    var createdAt: String = Calendar.getInstance().time.toString()
)