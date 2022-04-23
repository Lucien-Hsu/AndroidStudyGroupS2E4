package com.lcnhsu.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class BActivity : AppCompatActivity() {
    val TAG = "MYDEMO"
    lateinit var btnToA: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "[B] onCreate: ")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bactivity)

        btnToA = findViewById(R.id.btn_to_a_activity)
        btnToA.setOnClickListener {
            Log.d(TAG, "[B] btn click")
            //創建 intent
            val intent = Intent(this, AActivity::class.java)
            //前往目的地 Activity
            startActivity(intent)
        }
    }

    override fun onStart() {
        Log.d(TAG, "[B] onStart: ")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "[B] onRestoreInstanceState: ")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        Log.d(TAG, "[B] onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "[B] onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "[B] onStop: ")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "[B] onRestart: ")
        super.onRestart()
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        Log.d(TAG, "[B] onSaveInstanceState: ")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onDestroy() {
        Log.d(TAG, "[B] onDestroy: ")
        super.onDestroy()
    }
}