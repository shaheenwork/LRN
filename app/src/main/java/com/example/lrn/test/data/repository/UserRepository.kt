package com.example.lrn.test.data.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.lrn.test.data.model.User
import com.example.lrn.test.database.UserDao
import com.example.lrn.test.database.UserDatabase

class UserRepository(context: Context) {
    var db: UserDao = UserDatabase.getInstance(context)?.UserDao()!!
    var allUsers:LiveData<List<User>> = db.getAllUsers()


    fun insert(user: User){
        db.insert(user)
    }



}