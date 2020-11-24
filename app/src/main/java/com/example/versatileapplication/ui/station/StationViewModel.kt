package com.example.versatileapplication.ui.station

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Station Fragment"
    }
    val text: LiveData<String> = _text
}