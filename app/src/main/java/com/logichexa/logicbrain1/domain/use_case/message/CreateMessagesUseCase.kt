package com.logichexa.logicbrain1.domain.use_case.message

import com.logichexa.logicbrain1.data.model.MessageModel
import com.logichexa.logicbrain1.domain.repository.MessageRepository
import javax.inject.Inject

class CreateMessagesUseCase @Inject constructor(
    private val messageRepository: MessageRepository
) {
    suspend operator fun invoke(message: MessageModel) =
        messageRepository.addMessage(message)
}