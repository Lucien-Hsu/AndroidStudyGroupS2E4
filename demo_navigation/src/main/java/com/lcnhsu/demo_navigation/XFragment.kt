package com.lcnhsu.demo_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class XFragment : Fragment() {
    lateinit var btn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_x, container, false)

        btn = view.findViewById(R.id.btn)
        btn.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_XFragment_to_YFragment)

//            //safeArgs
//            val myStr = "Hello~"
//            view.findNavController().navigate(XFragmentDirections.actionXFragmentToYFragment(myStr))
        }

        return view
    }

}

