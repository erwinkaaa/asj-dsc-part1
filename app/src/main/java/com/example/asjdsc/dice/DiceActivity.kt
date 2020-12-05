package com.example.asjdsc.dice

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.asjdsc.R
import kotlinx.android.synthetic.main.activity_dice.*

class DiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)

        btn_roll.setOnClickListener { roll() }
    }

    private fun roll() {
        val dice = Dice(sides = 6)

        val resource = when (dice.roll()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        iv_dice.setImageResource(resource)

        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()
    }
}