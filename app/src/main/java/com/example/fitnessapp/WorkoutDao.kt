package com.example.fitnessapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface WorkoutDao {

    @Query("SELECT * FROM workouts")
    fun getAll(): List<Workout>

    @Query("SELECT * FROM workouts WHERE level = :level")
    fun findByLevel(level: String) : List<Workout>

    @Insert
    fun insertAll(vararg workouts: Workout)

    @Delete
    fun delete(workout: Workout)

}
