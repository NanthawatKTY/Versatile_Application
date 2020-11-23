package com.example.versatileapplication.ui.motorcycle

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MotorcycleViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Motorcycle Fragment"
    }
    val text: LiveData<String> = _text
}