package com.example.runningtrackerapp.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    val img: Bitmap?,
    val timestamp: Long,
    val avgSpeedInKMH: Float,
    val distanceInMeters: Int,
    val timeInMillis: Long,
    val caloriesBurned: Int,

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0

)
