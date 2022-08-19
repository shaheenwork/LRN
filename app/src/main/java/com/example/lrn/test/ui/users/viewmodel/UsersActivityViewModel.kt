package com.example.lrn.test.ui.users.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.lrn.test.data.model.User
import com.example.lrn.test.data.repository.UserRepository

class UsersActivityViewModel(application: Application): AndroidViewModel(application) {


    var repository = UserRepository(application)
    var allUsers:LiveData<List<User>> = repository.allUsers





}