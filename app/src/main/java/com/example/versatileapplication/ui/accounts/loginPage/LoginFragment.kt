package com.example.versatileapplication.ui.accounts.loginPage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.versatileapplication.R




class LoginFragment : Fragment() {
    private lateinit var loginFragment : LoginViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loginFragment = ViewModelProvider(this).get(LoginViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_login, container, false)
        val textWelcome: TextView = root.findViewById(R.id.text_login_title)
        loginFragment.textWelcome.observe(viewLifecycleOwner, Observer {
            textWelcome.text = it
        })
        return root
    }


}