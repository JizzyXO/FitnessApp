package com.example.fitnessapp

import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {
    val allUsers: List<User> = userDao.getAllUsers()

    fun insert (user: User){
        userDao.insertUser(user)
    }
    fun delete(user: User){
        userDao.deleteUser(user)
    }
}