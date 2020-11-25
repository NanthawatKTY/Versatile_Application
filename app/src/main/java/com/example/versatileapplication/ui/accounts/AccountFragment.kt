package com.example.versatileapplication.ui.accounts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.versatileapplication.R

class AccountFragment : Fragment() {

    private lateinit var accountViewModel: AccountViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        accountViewModel = ViewModelProvider(this).get(AccountViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_account, container, false)
        val textView: TextView = root.findViewById(R.id.text_greet_user)
        accountViewModel.textGreet.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}