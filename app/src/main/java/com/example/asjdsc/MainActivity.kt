package com.example.asjdsc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.asjdsc.birthday.BirthdayActivity
import com.example.asjdsc.dice.DiceActivity
import com.example.asjdsc.food.FoodActivity
import com.example.asjdsc.tip.TipActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_birthday.setOnClickListener {
            startActivity(Intent(this@MainActivity, BirthdayActivity::class.java))
        }

        btn_dice.setOnClickListener {
            startActivity(Intent(this@MainActivity, DiceActivity::class.java))
        }

        btn_tip.setOnClickListener {
            startActivity(Intent(this@MainActivity, TipActivity::class.java))
        }

        btn_food.setOnClickListener {
            startActivity(Intent(this@MainActivity, FoodActivity::class.java))
        }
    }
}