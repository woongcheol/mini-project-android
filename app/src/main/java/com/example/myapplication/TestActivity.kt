package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)


        // 뷰를 코틀린 파일(Activity)로 가져오는 방법
        val textViewOne : TextView = findViewById(R.id.text1)
        val buttonOne : Button = findViewById(R.id.button1)

        Log.d("testt", textViewOne.text.toString())

        // Listener 사용 방법
        buttonOne.setOnClickListener {
            Log.d("testt", "버튼 클릭!!")
        }

        // Listener 사용 방법 - 풀 버젼
        val clickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("testt", "버튼 클릭!!")
            }
        }

        buttonOne.setOnClickListener(clickListener)

        // Listener 사용 방법 - 축약 버젼 1
        buttonOne.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("testt", "버튼 클릭!!")
            }
        })
    }
}