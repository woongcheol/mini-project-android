package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Intent_one : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_one)

        // 암시적 인텐트
        val implicitIntent: TextView = findViewById(R.id.implicit_intent)
        implicitIntent.setOnClickListener {
            val intent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "010-1111-1111"))
            startActivity(intent)
        }
    }
}