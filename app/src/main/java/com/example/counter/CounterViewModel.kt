package com.example.counter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class CounterViewModel(val savedStateHandle: SavedStateHandle) : ViewModel() {

    private val _count = MutableLiveData<Int>()
    val counter: LiveData<Int>
        get() = _count

    private var count = savedStateHandle.get<Int>("Count") ?: 0


    init {
        _count.value = 0
    }

    fun incrementCounter() {
        _count.value = (_count.value ?: 0) + 1
    }

    fun resetCounter() {
        _count.value = 0
    }

}