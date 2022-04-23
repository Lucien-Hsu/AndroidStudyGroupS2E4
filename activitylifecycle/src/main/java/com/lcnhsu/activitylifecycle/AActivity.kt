package com.lcnhsu.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button

class AActivity : AppCompatActivity() {
    val TAG = "MYDEMO"

    lateinit var btnToB: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "[A] onCreate: ")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aactivity)

        btnToB = findViewById(R.id.btn_to_b_activity)
        btnToB.setOnClickListener {
            Log.d(TAG, "[A] btn click")
            //創建 intent
            val intent = Intent(this, BActivity::class.java)
            //前往目的地 Activity
            startActivity(intent)
        }
    }

    override fun onStart() {
        Log.d(TAG, "[A] onStart: ")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "[A] onRestoreInstanceState: ")
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        Log.d(TAG, "[A] onResume: ")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG, "[A] onPause: ")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG, "[A] onStop: ")
        super.onStop()
    }

    override fun onRestart() {
        Log.d(TAG, "[A] onRestart: ")
        super.onRestart()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "[A] onSaveInstanceState(outState: Bundle): ")
        super.onSaveInstanceState(outState)
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        Log.d(TAG, "[A] onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle): ")
        super.onSaveInstanceState(outState, outPersistentState)
    }

    override fun onDestroy() {
        Log.d(TAG, "[A] onDestroy: ")
        super.onDestroy()
    }
}