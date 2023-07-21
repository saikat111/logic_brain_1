package com.logichexa.logicbrain1.domain.repository

import com.logichexa.logicbrain1.data.model.TextCompletionsParam
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow

interface ChatRepository {
    fun textCompletionsWithStream(scope: CoroutineScope, params: TextCompletionsParam): Flow<String>
}