package com.lcnhsu.activity_with_fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    //設定 MutableLiveData
    private val _b1 : MutableLiveData<Boolean> by lazy{
        val temp = MutableLiveData<Boolean>()
        temp.value = false
        temp
    }

    //getter
    fun getB1(): LiveData<Boolean> {
        return _b1
    }

    //setter
    fun setB1(b: Boolean){
        _b1.value = b
    }
}