package com.example.versatileapplication.ui.station

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.versatileapplication.R

class StationFragment : Fragment() {

    private lateinit var stationViewModel: StationViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        stationViewModel = ViewModelProvider(this).get(StationViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_station, container, false)
        val textStation: TextView = root.findViewById(R.id.text_station)
        stationViewModel.text.observe(viewLifecycleOwner, Observer {
            textStation.text = it
        })
        return root
    }
}