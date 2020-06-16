package com.example.android_currencyconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        convert_button.setOnClickListener {
            val amount_string = findViewById<EditText>(R.id.amount_text)
            val amt = amount_string.text.toString().toDouble()

            val amount = (amt * 76.04)
            converted_text.text = amt.toString()+"$ is equal to Rs."+amount.toString()
        }
    }
}
