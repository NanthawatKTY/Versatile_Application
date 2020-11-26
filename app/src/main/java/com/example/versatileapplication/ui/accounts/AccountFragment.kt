package com.example.versatileapplication.ui.accounts

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.versatileapplication.R
import com.example.versatileapplication.ui.accounts.loginPage.LoginFragment
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

//        // This is used to hide the status bar and make the splash screen as a full screen activity.
//        val window
//        window.setFlags(
//            WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN
//        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        /*super.onViewCreated(view, savedInstanceState)*/
        card_view_login_out.setOnClickListener{
            startActivity(Intent(this.context, LoginFragment::class.java))
            println("Test login")
        }
    }

}