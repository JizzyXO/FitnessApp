package com.example.fitnessapp

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class, Workout::class], version = 1)
abstract class AppDatabase: RoomDatabase(){
    abstract fun userDao(): UserDao
    abstract fun workoutDao(): WorkoutDao
}