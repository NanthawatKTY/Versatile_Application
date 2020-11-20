package com.example.versatileapplication.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.versatileapplication.R

class AgeFragment : Fragment() {

    private lateinit var ageViewModel: AgeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        ageViewModel = ViewModelProvider(this).get(AgeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_age, container, false)
        val textView: TextView = root.findViewById(R.id.text_age_title)
        ageViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}