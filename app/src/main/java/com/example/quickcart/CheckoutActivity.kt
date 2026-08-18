package com.example.quickcart

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {

    private var quantity = 1
    private val unitPrice = 2500.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val tvQuantity: TextView = findViewById(R.id.tvQuantity)
        val tvPrice: TextView = findViewById(R.id.tvPrice)
        val btnMinus: Button = findViewById(R.id.btnMinus)
        val btnPlus: Button = findViewById(R.id.btnPlus)
        val btnPayNow: Button = findViewById(R.id.btnPayNow)

        fun updatePrice() {
            tvPrice.text = "LKR %.2f".format(unitPrice * quantity)
        }

        btnMinus.setOnClickListener {
            if (quantity > 1) {
                quantity--
                tvQuantity.text = quantity.toString()
                updatePrice()
            }
        }

        btnPlus.setOnClickListener {
            quantity++
            tvQuantity.text = quantity.toString()
            updatePrice()
        }

        btnPayNow.setOnClickListener {
            Toast.makeText(this, "Payment successful for $quantity item(s)", Toast.LENGTH_SHORT).show()
        }
    }
}