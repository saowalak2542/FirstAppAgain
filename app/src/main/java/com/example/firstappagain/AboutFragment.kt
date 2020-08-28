package com.example.firstappagain

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.firstappagain.R

class AboutFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }
}