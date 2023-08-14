package com.example.runningtrackerapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database([Run::class], version = 1)
@TypeConverters(Converters::class)
abstract class RunningDatabase : RoomDatabase() {
    abstract val dao: RunDao

    companion object{
        const val RUNNING_DATABASE_NAME = "running_db"
    }
}