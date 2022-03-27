package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)


        // Transaction
        // 작업의 단위 -> 시작과 끝이 있다.
        // A, B, C, D
        val fragmentmanager = supportFragmentManager
        val fragmentFirst = FragmentFirst()
        (findViewById<TextView>(R.id.add)).setOnClickListener {
            val transaction = fragmentmanager.beginTransaction() // 시작
            transaction.replace(R.id.root, fragmentFirst)
            transaction.commit() // 끝
        }
        (findViewById<TextView>(R.id.remove)).setOnClickListener {

        }

        // Commit
        // 1> commit
        // 2> commitAllowingStateLoss
        // 3> commitNow
        // 4> commitNowAllowStateLoss
    }
}