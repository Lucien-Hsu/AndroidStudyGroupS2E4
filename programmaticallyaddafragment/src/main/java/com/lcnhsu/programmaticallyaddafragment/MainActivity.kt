package com.lcnhsu.programmaticallyaddafragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class MainActivity : AppCompatActivity() {
    val TAG = "MYDEMO"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            //新增一個片段
            add<AFragment>(R.id.fragment_container_view)
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            supportFragmentManager.commit {
                Log.d(TAG, "commit: ")
                setReorderingAllowed(true)
                //取代片段
                replace<BFragment>(R.id.fragment_container_view)
            }
        }

    }
}