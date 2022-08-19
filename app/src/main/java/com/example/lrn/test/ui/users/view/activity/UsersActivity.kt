package com.example.lrn.test.ui.users.view.activity

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.lrn.R

class UsersActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_users)
      /*  var userRepository = UserRepository(this)

        var user = User("Shaheen","Malappuram",1)
        userRepository.insert(user)

        user = User("Sojan","Trivandrum",7)
        userRepository.insert(user)*/
    }
}