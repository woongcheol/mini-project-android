package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat

class Activity_Resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        findViewById<TextView>(R.id.text).setOnClickListener {
//            (it as TextView).text = resources.getText(R.string.app_name)
//            it.background = resources.getDrawable(R.drawable.ic_launcher_background, null)
//            it.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)
//            it.background = ResourcesCompat.getDrawable(resources, R.drawable.ic_launcher_background, null)
        }
    }
}