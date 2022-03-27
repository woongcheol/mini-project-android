package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentFirst : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // inflater : XML을 화면에 사용할 준비를 한다.
        // container : fragment에서 사용될 XML의 부모뷰
        // attachToRoot : 루트에 붙일지 말지(X), 언제 붙을지
        val view = inflater.inflate(R.layout.activity_first_fragment, container, false)
        (view.findViewById<TextView>(R.id.call_activity)).setOnClickListener {
            (activity as FragmentActivity).printTestLog()
        }

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val data: String? = arguments?.getString("key")
        Log.d("testt", "data is" + data)
    }

    fun printTestLog() {
        Log.d("testt", "print test log from fragment")
    }
}