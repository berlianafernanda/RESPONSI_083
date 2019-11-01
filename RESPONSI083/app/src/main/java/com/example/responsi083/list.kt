package com.example.listview_icon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.responsi083.R

class list : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<food> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list)

        rvFood = findViewById(R.id.rvFood)
        rvFood.setHasFixedSize(true)
        list.addAll(detail.listfood)
        showFoodList()
    }

    private fun showFoodList(){
        rvFood.layoutManager = LinearLayoutManager(this)
        val list: list = list (list)
        rvFood.adapter = list
    }
}


