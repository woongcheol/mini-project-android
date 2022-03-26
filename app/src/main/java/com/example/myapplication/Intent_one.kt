package com.example.myapplication

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

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

        // 명시적 인텐트
        val intentOne: TextView = findViewById(R.id.intent_one)
        intentOne.setOnClickListener {
            val intent: Intent = Intent()
            val componentName: ComponentName = ComponentName(
                "com.example.myapplication",
                "com.example.myapplication.Intent_two"
            )
            intent.component = componentName
            startActivity(intent)
        }

        // 명시적 인텐트2
        (findViewById<TextView>(R.id.intent_two)).apply {
            this.setOnClickListener {
                startActivity(
                    Intent(this@Intent_one, Intent_two::class.java)
                )
            }
        }

        // 명시적 인텐트 + data 전달
        (findViewById<TextView>(R.id.intent_three)).apply {
            this.setOnClickListener {
                val intent = Intent(this@Intent_one, Intent_two::class.java)
                intent.putExtra("extra-data", "data-one")
                startActivity(intent)
            }
        }

        // 명시적 인텐트 + result 받기 1
        (findViewById<TextView>(R.id.intent_four)).apply {
            this.setOnClickListener {
                val intent = Intent(this@Intent_one, Intent_two::class.java)
                startActivityForResult(intent, 1)
            }
        }

        // 명시적 인텐트 + result 받기 2
        val startActivityLauncher: ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) {
            when (it.resultCode) {
                RESULT_OK -> {
                    Log.d("dataa", it.data?.extras?.getString("result")!!)
                }
            }
        }

        (findViewById<TextView>(R.id.intent_five)).apply {
            this.setOnClickListener {
                val intent = Intent(this@Intent_one, Intent_two::class.java)
                startActivityLauncher.launch(intent)
            }
        }

        // 명시적 인텐트 + 이미지 URI 전달
        (findViewById<TextView>(R.id.intent_six)).apply {
            this.setOnClickListener {
                val intent = Intent(this@Intent_one, Intent_two::class.java).apply {
                    val imageUri =
                        Uri.parse("android.resource://" + packageName + "/drawable/" + "drawable_practice")
                    this.action = Intent.ACTION_SEND
                    this.putExtra(Intent.EXTRA_STREAM, imageUri)
                    this.setType("image/*")
                }
                startActivity(intent)
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (requestCode) {
            1 -> {
                when (resultCode) {
                    RESULT_OK -> {
                        val data: String? = data?.extras?.getString("result")
                        Log.d("dataa", data!!)
                    }
                }
            }
            2 -> {}
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}