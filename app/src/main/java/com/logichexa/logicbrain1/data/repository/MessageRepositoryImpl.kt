package com.logichexa.logicbrain1.data.repository

import com.logichexa.logicbrain1.data.model.MessageModel
import com.logichexa.logicbrain1.data.source.local.ConversAIDao
import com.logichexa.logicbrain1.domain.repository.MessageRepository
import javax.inject.Inject

class MessageRepositoryImpl @Inject constructor(
    private val conversAIDao: ConversAIDao,
) : MessageRepository {
    override suspend fun getMessages(conversationId: String): List<MessageModel> =
        conversAIDao.getMessages(conversationId)

    override suspend fun addMessage(message: MessageModel) =
        conversAIDao.addMessage(message)

    override suspend fun deleteMessages(conversationId: String) =
        conversAIDao.deleteMessages(conversationId)
}