package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class NumberPickActivity : AppCompatActivity() {
    private val clearButton: Button by lazy {
        findViewById<Button>(R.id.numClearButton)
    }

    private val pickButton: Button by lazy {
        findViewById<Button>(R.id.numPickButton)
    }

    private val generateButton: Button by lazy {
        findViewById<Button>(R.id.generateNumButton)
    }

    private val numberPicker: NumberPicker by lazy {
        findViewById<NumberPicker>(R.id.numPick)
    }

    private val numberTextViewList: List<TextView> by lazy {
        listOf<TextView>(
            findViewById<TextView>(R.id.numOne),
            findViewById<TextView>(R.id.numTwo),
            findViewById<TextView>(R.id.numThree),
            findViewById<TextView>(R.id.numFour),
            findViewById<TextView>(R.id.numFive),
            findViewById<TextView>(R.id.numSix)
        )
    }

    private var didRun = false

    private val pickNumberSet = hashSetOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_pick)

        numberPicker.minValue = 1
        numberPicker.maxValue = 45

        initGenerateButton()
        initPickButton()
        initClearButton()
    }

    private fun initGenerateButton() {
        generateButton.setOnClickListener {
            val list = getRandomNumber()

            didRun = true

            list.forEachIndexed { index, number ->
                val textView = numberTextViewList[index]
                textView.text = number.toString()
                textView.isVisible = true
            }
        }
    }

    private fun getRandomNumber(): List<Int> {
        val numList = mutableListOf<Int>().apply {
            for (i in 1..45) {
                if (pickNumberSet.contains(i)) {
                    continue
                }
                this.add(i)
            }
            this.shuffle()
        }

        val newNumList = pickNumberSet.toList() + numList.subList(0, 6 - pickNumberSet.size)

        return newNumList.sorted()
    }

    private fun initPickButton() {
        pickButton.setOnClickListener {
            if (didRun) {
                Toast.makeText(this, "초기화 후에 시도해주세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (pickNumberSet.size >= 6) {
                Toast.makeText(this, "번호는 6개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (pickNumberSet.contains(numberPicker.value)) {
                Toast.makeText(this, "이미 선택한 번호입니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val textView = numberTextViewList[pickNumberSet.size]
            textView.text = numberPicker.value.toString()
            textView.isVisible = true

            pickNumberSet.add(numberPicker.value)
        }
    }

    private fun initClearButton() {
        clearButton.setOnClickListener {
            didRun = false
            pickNumberSet.clear()
            numberTextViewList.forEach {
                it.isVisible = false
            }
        }
    }
}