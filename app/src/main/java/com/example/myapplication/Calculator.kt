package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Calculator : AppCompatActivity() {
    lateinit var one: Button
    lateinit var two: Button
    lateinit var three: Button
    lateinit var four: Button
    lateinit var five: Button
    lateinit var six: Button
    lateinit var seven: Button
    lateinit var eight: Button
    lateinit var nine: Button
    lateinit var zero: Button
    lateinit var ca: Button
    lateinit var plus: Button
    lateinit var equal: Button
    lateinit var result: TextView

    var input: String = ""
    var temp: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        findviews()
        setNumberTextViewListner()

        ca.setOnClickListener {
            input = ""
            temp = ""
            result.text = "0"
        }

        plus.setOnClickListener {
            temp = result.text.toString()
            result.text = ""
            input = ""
        }

        equal.setOnClickListener {
            val finalResult : String = (input.toInt() + temp.toInt()).toString()
            result.text = finalResult
            temp = finalResult
        }

    }

    fun setNumberTextViewListner() {
        val numberTextViewList: List<TextView> = listOf(
            one, two, three, four, five, six, seven, eight, nine, zero
        )

        val listner = object : View.OnClickListener {
            override fun onClick(p0: View?) {
                input += (p0 as Button).text
                result.text = input
            }
        }

        numberTextViewList.forEach {
            it.setOnClickListener(listner)
        }
    }

    fun findviews() {
        one = findViewById(R.id.button1)
        two = findViewById(R.id.button2)
        three = findViewById(R.id.button3)
        ca = findViewById(R.id.button4)
        four = findViewById(R.id.button5)
        five = findViewById(R.id.button6)
        six = findViewById(R.id.button7)
        plus = findViewById(R.id.button8)
        seven = findViewById(R.id.button9)
        eight = findViewById(R.id.button10)
        nine = findViewById(R.id.button11)
        zero = findViewById(R.id.button12)
        equal = findViewById(R.id.button13)
        result = findViewById(R.id.text1)
    }
}