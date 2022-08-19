package com.example.lrn.test.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.lrn.test.data.model.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase:RoomDatabase(){

    abstract fun UserDao():UserDao

    companion object{
        private var INSTANCE: UserDatabase? = null

        fun getInstance(context: Context):UserDatabase?{

            if (INSTANCE==null){
                synchronized(UserDatabase::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        UserDatabase::class.java,
                        "userDB"
                    ).allowMainThreadQueries().build()
                }
            }

            return INSTANCE

        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

}