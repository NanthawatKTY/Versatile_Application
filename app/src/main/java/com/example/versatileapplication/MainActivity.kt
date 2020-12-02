package com.example.versatileapplication

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.versatileapplication.fragments.login.SignInFragment
import com.example.versatileapplication.fragments.userinfo.UserInfoFragment
import kotlinx.android.synthetic.main.fragment_account.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_menuLists)

        val navController = findNavController(R.id.nav_host_fragment)
        val signInFrag = SignInFragment()
        val userInfoFrag = UserInfoFragment()
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.

//        card_view_login_out.setOnClickListener{
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.)
//            }
//        }
        //val appBarConfiguration = AppBarConfiguration(setOf(R.id.navigation_age, R.id.navigation_dashboard, R.id.navigation_notifications))
       // setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}