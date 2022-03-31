package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat

class Activity_Add_View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_view)

        var carList = mutableListOf<Car>()
        for (i in 0..10) {
            carList.add(Car("${i}번째 자동차", "${i}번째 엔진"))
        }

        val container = findViewById<LinearLayoutCompat>(R.id.container)
        val inflater = LayoutInflater.from(this@Activity_Add_View)
        carList.forEach {
            val carItemView = inflater.inflate(R.layout.car_item, null)
            val carImage = carItemView.findViewById<ImageView>(R.id.carImage)
            val nthCar = carItemView.findViewById<TextView>(R.id.nthCar)
            val nthEngine = carItemView.findViewById<TextView>(R.id.nthEngine)

            carImage.setImageDrawable(resources.getDrawable(R.drawable.ic_launcher_background, this.theme))
            nthCar.text = it.nthCar
            nthEngine.text = it.nthEngine

            container.addView(carItemView)
        }
    }
}

class Car(val nthCar: String, val nthEngine: String)