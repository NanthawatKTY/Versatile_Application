package com.example.versatileapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AgeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Age Fragment"
    }
    val text: LiveData<String> = _text
}