package com.example.versatileapplication.ui.accounts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.w3c.dom.Text

class AccountViewModel : ViewModel() {
    private val userName: String = "Mr.Prateep"
    private val _text = MutableLiveData<String>().apply {
        value = "Hello $userName"
    }
    val textGreet: LiveData<String> = _text
}