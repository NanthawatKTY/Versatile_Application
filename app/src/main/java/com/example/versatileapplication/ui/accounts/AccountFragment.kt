package com.example.versatileapplication.ui.accounts

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController

import com.example.versatileapplication.R
import kotlinx.android.synthetic.main.fragment_account.*

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


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        /*super.onViewCreated(view, savedInstanceState)*/
//        card_view_login_out.setOnClickListener{
//            val intentCardLogin = Intent(this.context, SignInFragment::class.java)
//            startActivity(intentCardLogin)
//        }

        card_view_login_out.setOnClickListener {
            it.findNavController().navigate(R.id.action_navigation_account_to_navigation_signin)
        }

        card_view_userinfo.setOnClickListener {
            it.findNavController().navigate(R.id.action_navigation_account_to_navigation_user_info)
        }

        card_viewSetting.setOnClickListener {
            it.findNavController().navigate(R.id.action_navigation_account_to_navigation_settings)
        }

    }


}