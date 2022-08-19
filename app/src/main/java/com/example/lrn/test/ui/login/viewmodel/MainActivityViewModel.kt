package com.example.lrn.test.ui.login.viewmodel

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    /*var count = 0;
    fun increaseCount(){
        count++
    }
    fun setC(value:Int){
        count = value
    }*/

    private val seconds= MutableLiveData<Int>()
    private val finished = MutableLiveData<Boolean>()

    fun start(){
        object : CountDownTimer(5000,1000){
            override fun onTick(p0: Long) {
                seconds.value=p0.toInt()
            }

            override fun onFinish() {
                finished.value = true
            }

        }.start()
    }

    fun getSeconds():LiveData<Int>{
        return seconds
    }

    fun getFinished():LiveData<Boolean>{
        return finished
    }

}