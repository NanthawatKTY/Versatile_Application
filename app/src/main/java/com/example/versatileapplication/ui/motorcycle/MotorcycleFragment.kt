package com.example.versatileapplication.ui.motorcycle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.versatileapplication.R

class MotorcycleFragment : Fragment() {
    private lateinit var motorcycleFragment: MotorcycleViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        motorcycleFragment = ViewModelProvider(this).get(MotorcycleViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_motorcycle, container, false)
        val textView: TextView = root.findViewById(R.id.text_motorcycle)
        motorcycleFragment.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}