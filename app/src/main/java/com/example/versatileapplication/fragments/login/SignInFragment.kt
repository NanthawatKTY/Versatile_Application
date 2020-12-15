package com.example.versatileapplication.fragments.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.versatileapplication.R
import kotlinx.android.synthetic.main.fragment_sign_in.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SignInFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SignInFragment : Fragment(R.layout.fragment_sign_in) {

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

      // Have no iChange Account
      havenoIChange.setOnClickListener{
         it.findNavController().navigate(R.id.action_navigation_signin_to_navigation_signup)
      }

      // Forget Password
      forgetPassword.setOnClickListener{
         it.findNavController().navigate(R.id.action_navigation_signin_to_navigation_forgetPassword)
      }
   }
}