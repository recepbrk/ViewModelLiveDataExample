package com.example.learningviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {

    private val countLiveData = MutableLiveData<Int>()

    init {

        countLiveData.value = 0
    }

    val counterLiveData:LiveData<Int>
        get() = countLiveData

    fun incrementCounter(){

      countLiveData.value=(counterLiveData.value ?:0) + 1
    }
}