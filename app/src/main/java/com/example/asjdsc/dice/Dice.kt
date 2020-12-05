package com.example.asjdsc.dice

class Dice(val sides: Int) {

    fun roll(): Int {
        return (1..sides).random()
    }

}