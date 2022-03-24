package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val textViewOne : TextView = findViewById(R.id.text1)
        val buttonOne : Button = findViewById(R.id.button1)

        Log.d("testt", textViewOne.text.toString())
    }
}