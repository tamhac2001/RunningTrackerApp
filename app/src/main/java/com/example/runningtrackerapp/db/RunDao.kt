package com.example.runningtrackerapp.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface RunDao {

    @Upsert
    suspend fun upsertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("""SELECT * FROM running_table ORDER BY timestamp DESC""")
    fun getAllRunsSortedByDate(): Flow<List<Run>>

    @Query("""SELECT * FROM running_table ORDER BY timeInMillis DESC""")
    fun getAllRunsSortedByTimeInMillis(): Flow<List<Run>>

    @Query("""SELECT * FROM running_table ORDER BY caloriesBurned DESC""")
    fun getAllRunsSortedByCaloriesBurned(): Flow<List<Run>>

    @Query("""SELECT * FROM running_table ORDER BY avgSpeedInKMH DESC""")
    fun getAllRunsSortedByAvgSpeed(): Flow<List<Run>>

    @Query("""SELECT * FROM running_table ORDER BY distanceInMeters DESC""")
    fun getAllRunsSortedByDistance(): Flow<List<Run>>

    @Query("""SELECT SUM(timeInMillis) FROM running_table""")
    fun getTotalTimeInMillis() : Flow<Long>

    @Query("""SELECT SUM(caloriesBurned) FROM running_table""")
    fun getTotalCaloriesBurned() : Flow<Int>

    @Query("""SELECT SUM(avgSpeedInKMH) FROM running_table""")
    fun getTotalAvgSpeed() : Flow<Float>

    @Query("""SELECT SUM(distanceInMeters) FROM running_table""")
    fun getTotalDistance() : Flow<Int>
}