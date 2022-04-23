package com.lcnhsu.activity_with_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    val TAG = "MYDEMO"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "[Activity] onCreate: ")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "[Activity] onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "[Activity] onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "[Activity] onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "[Activity] onStop: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "[Activity] onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "[Activity] onDestroy: ")
    }
}