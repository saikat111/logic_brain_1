package com.logichexa.logicbrain1.domain.use_case.conversation

import com.logichexa.logicbrain1.domain.repository.ConversationRepository
import javax.inject.Inject

class DeleteAllConversationUseCase @Inject constructor(
    private val conversationRepository: ConversationRepository
) {
    suspend operator fun invoke() =
        conversationRepository.deleteAllConversation()
}