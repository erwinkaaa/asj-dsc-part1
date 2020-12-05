package com.example.asjdsc.tip

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.asjdsc.R
import kotlinx.android.synthetic.main.activity_tip.*

class TipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip)

        btn_hitung.setOnClickListener { hitungTip() }
    }

    private fun hitungTip() {
        val input = et_nominal.text.toString()

        if (input.isEmpty()) {
            return
        }

        val nominal = input.toInt()

        val tipPercentage = when (rg_service.checkedRadioButtonId) {
            R.id.rb_baik -> 0.20
            R.id.rb_cukup -> 0.15
            else -> 0.10
        }

        val totalTip = nominal * tipPercentage

        tv_result.text = getString(R.string.total_tip, totalTip.toString())
    }
}