package com.lcnhsu.demo_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

class YFragment : Fragment() {
        lateinit var btn: Button

        val args: YFragmentArgs by navArgs()

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment
            val view = inflater.inflate(R.layout.fragment_y, container, false)

            btn = view.findViewById(R.id.btn)
            btn.setOnClickListener { view ->
                view.findNavController().navigate(R.id.action_YFragment_to_XFragment)
            }

//            //safeArgs
//            val myStr = args.myStr
//            val tv = view.findViewById<TextView>(R.id.textView)
//            tv.text = myStr

            return view
        }

    }