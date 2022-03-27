package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
            // fragment에 데이터를 전달하는 방법
            val bundle = Bundle()
            bundle.putString("key", "hello")
            fragmentFirst.arguments = bundle


            transaction.replace(R.id.root, fragmentFirst, "fragment_first_tag")
            transaction.commit() // 끝
        }
        (findViewById<TextView>(R.id.remove)).setOnClickListener {
            val transaction = fragmentmanager.beginTransaction()
            transaction.remove(fragmentFirst)
            transaction.commit()
        }

        (findViewById<TextView>(R.id.access_fragment)).setOnClickListener {
            // XML에 있는 fragment를 찾는 방법
//            val fragmentFirst =
//                supportFragmentManager.findFragmentById(R.id.fragment_first) as FragmentFirst
//
//            fragmentFirst.printTestLog()

            // XML에 없는 fragment를 찾는 방법
            val fragmentFirst =
                supportFragmentManager.findFragmentByTag("fragment_first_tag") as FragmentFirst

            fragmentFirst.printTestLog()
        }
        // Commit
        // 1> commit
        // 2> commitAllowingStateLoss
        // 3> commitNow
        // 4> commitNowAllowStateLoss
    }

    fun printTestLog() {
        Log.d("testt", "print test log")
    }

}