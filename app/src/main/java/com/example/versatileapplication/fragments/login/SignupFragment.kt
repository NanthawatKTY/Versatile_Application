package com.example.versatileapplication.fragments.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ArrayAdapter
import com.example.versatileapplication.R
import kotlinx.android.synthetic.main.fragment_signup.*

class SignupFragment : Fragment(R.layout.fragment_signup) {
 // TODO: Change to onViewCreated

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Create an ArrayAdapter
//        val adapter = activity?.let {
//            ArrayAdapter.createFromResource(it,
//                R.array.question_lists, android.R.layout.simple_spinner_item)
//        }
//        // Specify the layout to use when the list of choices appears
//        adapter?.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        // Apply the adapter to the spinner
//        spinnerQuestionReset.adapter = adapter
//
//    }

//    fun getValues(view: View) {
//        Toast.makeText(this, "Spinner 1 " + spinnerQuestionReset.selectedItem.toString() +
//                "\nSpinner 2 " + spinner2.selectedItem.toString(), Toast.LENGTH_LONG).show()
//    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)

        // Create an Array Adapter

        // Specify the layout to use when the list of choices appears

        spinnerQuestionReset.adapter = activity?.let {
            ArrayAdapter(
                it,
                R.layout.support_simple_spinner_dropdown_item,
                resources.getStringArray(R.array.question_lists)
            )
        }

       // val adapter = context?.let { ArrayAdapter.createFromResource(it, R.array.question_lists, android.R.layout.simple_spinner_item ) }
       //     ?.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the spinner
//        spinnerQuestion.adapter = adapter

    }


}