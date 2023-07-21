package com.logichexa.logicbrain1.domain.use_case.message

import com.logichexa.logicbrain1.domain.repository.MessageRepository
import javax.inject.Inject

class GetMessagesUseCase @Inject constructor(
    private val messageRepository: MessageRepository
) {
    suspend operator fun invoke(conversationId: String) =
        messageRepository.getMessages(conversationId = conversationId)
}