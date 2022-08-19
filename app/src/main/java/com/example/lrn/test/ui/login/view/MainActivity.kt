package com.example.lrn.test.ui.login.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lrn.test.ui.users.view.activity.UsersActivity
import com.example.lrn.databinding.ActivityMainBinding
import com.example.lrn.test.ui.login.viewmodel.MainActivityViewModel

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {

   //     Stetho.initializeWithDefaults(this);

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.activityMainLoginButton.setOnClickListener(this)

         viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
     //   binding.activityMainCountTextView.text = viewModel.count.toString()

        // observing the second value of our view model class
        viewModel.getSeconds().observe(this, Observer {

            binding.activityMainCountTextView.text=it.toString()
        })

        viewModel.getFinished().observe(this,Observer{
            if (it){

            }
        })

    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.activityMainLoginButton -> {
                /*binding.activityMainUserNameTextInput.error =
                    resources.getString(R.string.app_name)
                viewModel.setC(7)
                binding.activityMainCountTextView.text = viewModel.count.toString()

                viewModel.start()*/

                startActivity(Intent(this@MainActivity, UsersActivity::class.java))

            }


        }
    }
}