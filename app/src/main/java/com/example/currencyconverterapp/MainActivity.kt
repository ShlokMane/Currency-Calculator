package com.example.currencyconverterapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currencyET: EditText = findViewById(R.id.moneyET)
        val rupeesButton: Button = findViewById(R.id.rupeesBtn)
        val dollarsButton: Button = findViewById(R.id.dollarsBtn)
        val convertedAmountTV: TextView = findViewById(R.id.convertedAmountTV)

        rupeesButton.setOnClickListener {
            if (currencyET.text.isEmpty() || currencyET.text.isBlank()) {
                Toast.makeText(this, getString(R.string.warning_enter_amount), Toast.LENGTH_SHORT)
                    .show()
            } else {
                val amount = currencyET.text.toString().toInt()
                val rupeeAmount = amount * 80.00
                convertedAmountTV.text = getString(R.string.converted_amount, rupeeAmount)
            }
        }

        dollarsButton.setOnClickListener {
            if (currencyET.text.isEmpty() || currencyET.text.isBlank()) {
                Toast.makeText(this, getString(R.string.warning_enter_amount), Toast.LENGTH_SHORT)
                    .show()
            } else {
                val amount = currencyET.text.toString().toInt()
                val dollarAmount = amount / 80.00
                convertedAmountTV.text = getString(R.string.converted_amount, dollarAmount)
            }
        }
    }
}