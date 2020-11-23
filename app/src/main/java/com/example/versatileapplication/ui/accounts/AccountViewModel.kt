package com.example.versatileapplication.ui.accounts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AccountViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Hello Mr.Prateep"
    }
    val text: LiveData<String> = _text
}