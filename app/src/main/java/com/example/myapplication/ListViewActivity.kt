package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        // 데이터 준비
        var carList = mutableListOf<Car>()
        for (i in 0..100) {
            carList.add(Car("${i}번째 자동차", "${i}번째 엔진"))

        }

        // 어답터 준비
        val adapter = ListViewAdapter(
            carList,
            LayoutInflater.from(this),
            this
        )


        val listView = findViewById<ListView>(R.id.listview)
        listView.adapter = adapter

    }
}

class ListViewAdapter(
    val carList: MutableList<Car>,
    val layoutInflater: LayoutInflater,
    val context: Context
) : BaseAdapter() {
    override fun getCount(): Int {
        // 전체 데이터의 크기(갯수) 리턴
        return carList.size
    }

    override fun getItem(position: Int): Any {
        // 전체 데이터 중에서 해당 번째(position)의 데이터를 리턴
        return carList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        // 해당 번째 뷰를 리턴
        val view = layoutInflater.inflate(R.layout.car_item, null)
        val carImage = view.findViewById<ImageView>(R.id.carImage)
        val nthCar = view.findViewById<TextView>(R.id.nthCar)
        val nthEngine = view.findViewById<TextView>(R.id.nthEngine)

        val car = carList.get(position)
        carImage.setImageDrawable(
            context.resources.getDrawable(R.drawable.ic_launcher_foreground, context.theme)

        )
        nthCar.text = car.nthCar
        nthEngine.text = car.nthEngine

        return view
    }
}