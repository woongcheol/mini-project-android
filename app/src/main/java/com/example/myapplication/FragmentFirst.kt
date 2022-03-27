package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        return inflater.inflate(R.layout.activity_first_fragment, container, false)

    }
}