package com.logichexa.logicbrain1.domain.repository

interface FirebaseRepository {
    suspend fun isThereUpdate(): Boolean
}