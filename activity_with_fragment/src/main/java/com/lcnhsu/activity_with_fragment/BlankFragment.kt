package com.lcnhsu.activity_with_fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider

class BlankFragment : Fragment() {
    val TAG = "MYDEMO"

    //viewModel 需委託 Activity 的 viewModel 來實現才能共用
    val viewModel: MainViewModel by activityViewModels()

    override fun onAttach(context: Context) {
        Log.d(TAG, "[Fragment] onAttach: ")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "[Fragment] onCreate: ")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "[Fragment] onCreateView: ")
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d(TAG, "[Fragment] onViewCreated: ")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Log.d(TAG, "[Fragment] onViewStateRestored: ")
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG, "[Fragment] onStart: ")
        super.onStart()

        //為 livedata 設置觀察者
        viewModel.getB1().observe(viewLifecycleOwner){
            //do something
        }
    }

    override fun onResume() {
        Log.d(TAG, "[Fragment] onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "[Fragment] onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "[Fragment] onStop: ")
        super.onStop()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "[Fragment] onSaveInstanceState: ")
        super.onSaveInstanceState(outState)
    }

    override fun onDestroyView() {
        Log.d(TAG, "[Fragment] onDestroyView: ")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG, "[Fragment] onDestroy: ")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG, "[Fragment] onDetach: ")
        super.onDetach()
    }
}