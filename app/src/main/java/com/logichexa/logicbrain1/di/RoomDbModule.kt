package com.logichexa.logicbrain1.di

import android.content.Context
import androidx.room.Room
import com.logichexa.logicbrain1.data.source.local.ConversAIDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomDbModule {


    @Provides
    @Singleton
    fun provideRoomDb(@ApplicationContext appContext: Context): ConversAIDatabase =
        Room.databaseBuilder(
            appContext,
            ConversAIDatabase::class.java,
            "conversAIdb.db"
        ).build()

    @Provides
    @Singleton
    fun provideConversAIDao(conversAIDatabase: ConversAIDatabase) = conversAIDatabase.conversAIDao()
}