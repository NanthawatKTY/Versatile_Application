package com.example.versatileapplication.ui.accounts.loginPage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Welcome to login page"
    }
    val textWelcome: LiveData<String> = _text
}