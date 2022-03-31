package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Activity_Context_01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context01)

        findViewById<TextView>(R.id.changeactivity).setOnClickListener {
            startActivity(
                Intent(this, Activity_Context_02::class.java)
            )
        }

        findViewById<TextView>(R.id.testmethod).setOnClickListener {
            (applicationContext as MasterApplication).methodFromApplication()
            val user = (applicationContext as MasterApplication).userId
            Log.d("testt", "user id ${user}")
        }

    }
}