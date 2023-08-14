package com.example.runningtrackerapp.repository

import com.example.runningtrackerapp.db.Run
import com.example.runningtrackerapp.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val runDao: RunDao
) {
    suspend fun upsertRun(run: Run) = runDao.upsertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()
}