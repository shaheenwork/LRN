package com.example.lrn.test.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users_table")
data class User (val name:String, val place:String, @PrimaryKey(autoGenerate = true)val id:Int=0)





