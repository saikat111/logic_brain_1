package com.logichexa.logicbrain1.domain.use_case.message

import com.logichexa.logicbrain1.data.model.TextCompletionsParam
import com.logichexa.logicbrain1.domain.repository.ChatRepository
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class TextCompletionsWithStreamUseCase @Inject constructor(
    private val chatRepository: ChatRepository
) {
    operator fun invoke(scope: CoroutineScope, params: TextCompletionsParam) =
        chatRepository.textCompletionsWithStream(scope, params)
}