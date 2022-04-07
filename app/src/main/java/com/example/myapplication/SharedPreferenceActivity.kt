package com.example.myapplication

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        // SharedPreference 사용법
        findViewById<TextView>(R.id.create).setOnClickListener {
            // Create
            val sharedPreferences = getSharedPreferences("key", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("key1","hello")
            editor.putString("key2","hello")
            editor.commit()
        }
        findViewById<TextView>(R.id.read).setOnClickListener {
            val sharedPreferences = getSharedPreferences("key", Context.MODE_PRIVATE)
            val valueOne = sharedPreferences.getString("key1", "Wrong1")
            val valueTwo = sharedPreferences.getString("key2", "Wrong2")
            Log.d("testt", valueOne!!)
            Log.d("testt", valueTwo!!)
        }

        findViewById<TextView>(R.id.update).setOnClickListener {
            val sharedPreferences = getSharedPreferences("key", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("key1","hello hello")
            editor.commit()
        }
        findViewById<TextView>(R.id.delete).setOnClickListener {
            val sharedPreferences = getSharedPreferences("key", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.clear()
            editor.commit()
        }
    }
}