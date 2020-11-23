package com.example.versatileapplication.ui.wallet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WalletViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Wallet Fragment"
    }
    val text: LiveData<String> = _text
}