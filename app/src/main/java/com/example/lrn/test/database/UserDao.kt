package com.example.lrn.test.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.lrn.test.data.model.User

@Dao
interface UserDao {

    @Insert
    fun insert(user: User)

    @Update
    fun update(user: User)

    @Delete
    fun delete(user: User)

    @Query("select * from users_table")
    fun getAllUsers():LiveData<List<User>>


}