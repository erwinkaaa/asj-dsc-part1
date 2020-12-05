package com.example.asjdsc.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.asjdsc.R
import kotlinx.android.synthetic.main.activity_food.*

class FoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val foods = DataSource.provideFoods()
        val adapter = FoodAdapter(object : FoodAdapter.FoodOnClickListener {
            override fun onClick(food: Food) {
                Toast.makeText(this@FoodActivity, food.foodName, Toast.LENGTH_SHORT).show()
            }
        })

        rv_food.adapter = adapter

        adapter.setData(foods)
    }
}