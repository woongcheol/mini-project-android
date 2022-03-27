package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        val currentThread = Thread.currentThread()
        Log.d("testt", "" + currentThread)

//        Thread {
//            val currentThread = Thread.currentThread()
//            for (a in 1..1000) {
//                Log.d("testt", "" + a + currentThread)
//            }
//        }.start()
//
//        Thread {
//            val currentThread = Thread.currentThread()
//            for (a in 1..1000) {
//                Log.d("testt", "" + a + currentThread)
//            }
//        }.start()

        Thread {
            val currentThread = Thread.currentThread()
            Log.d("testt", "A" + currentThread)
            // UI 관련 작업을 메인 쓰레드가 아닌 쓰레드에서 하려고 하면 해당
            // 작업 메이쓰레드의 queue로 들어간다. -> 에러가 발생하지 않을 수 있다.

            runOnUiThread {
                findViewById<TextView>(R.id.test).text = "changed"
            }
        }.start()

    }
}