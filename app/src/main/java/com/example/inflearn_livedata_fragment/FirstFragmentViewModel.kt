package com.example.inflearn_livedata_fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstFragmentViewModel : ViewModel() {

    private var _count = MutableLiveData(0)
    val count : LiveData<Int>
        get() = _count

    fun incrementCountValue() {
        _count.value = _count.value?.plus(1)
    }

}