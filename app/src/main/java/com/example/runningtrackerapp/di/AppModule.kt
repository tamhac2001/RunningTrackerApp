package com.example.runningtrackerapp.di

import android.content.Context
import androidx.room.Room
import com.example.runningtrackerapp.db.RunDao
import com.example.runningtrackerapp.db.RunningDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRunningDatabase(@ApplicationContext app: Context) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RunningDatabase.RUNNING_DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideRunDao(db: RunningDatabase) = db.dao
}