package com.example.asjdsc.food

import com.example.asjdsc.R

object DataSource {

    fun provideFoods() : List<Food> {
        val foods = mutableListOf<Food>()
        foods.add(Food(photo = R.drawable.nasgor, foodName = "Nasgor"))
        foods.add(Food(photo = R.drawable.bakmi, foodName = "Bakmi"))
        foods.add(Food(photo = R.drawable.bakso, foodName = "Bakso"))
        foods.add(Food(photo = R.drawable.ayamgoreng, foodName = "Ayam goyeng"))
        foods.add(Food(photo = R.drawable.bakmoy, foodName = "Bakmoy"))
        foods.add(Food(photo = R.drawable.tahutek, foodName = "Tahu tek"))
        return foods
    }

}