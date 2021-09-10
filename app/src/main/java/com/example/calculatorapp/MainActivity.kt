package com.example.calculator

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var no1: EditText? = null
    var no2: EditText? = null
    var add: Button? = null
    var mul: Button? = null
    var div: Button? = null
    var sub: Button? = null
    var equal: Button? = null
    var answer: TextView? = null
    var ans = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // for text views
        no1 = findViewById(R.id.first_no)
        no2 = findViewById(R.id.second_no)

        // for button with operations
        add = findViewById(R.id.add)
        mul = findViewById(R.id.mul)
        div = findViewById(R.id.div)
        sub = findViewById(R.id.sub)

        // for equal to button
        equal = findViewById(R.id.equals)

        // for answer field
        answer = findViewById(R.id.answer)
        add.setOnClickListener(View.OnClickListener {
            val num1 = no1.getText().toString()
            val num2 = no2.getText().toString()
            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(applicationContext, "Enter Numbers", Toast.LENGTH_SHORT).show()
            } else {
                val a = no1.getText().toString().toDouble()
                val b = no2.getText().toString().toDouble()
                ans = a + b
            }
        })
        sub.setOnClickListener(View.OnClickListener {
            val num1 = no1.getText().toString()
            val num2 = no2.getText().toString()
            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(applicationContext, "Enter Numbers", Toast.LENGTH_SHORT).show()
            } else {
                val a = no1.getText().toString().toDouble()
                val b = no2.getText().toString().toDouble()
                ans = a - b
            }
        })
        mul.setOnClickListener(View.OnClickListener {
            val num1 = no1.getText().toString()
            val num2 = no2.getText().toString()
            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(applicationContext, "Enter Numbers", Toast.LENGTH_SHORT).show()
            } else {
                val a = no1.getText().toString().toDouble()
                val b = no2.getText().toString().toDouble()
                ans = a * b
            }
        })
        div.setOnClickListener(View.OnClickListener {
            val num1 = no1.getText().toString()
            val num2 = no2.getText().toString()
            if (num1.isEmpty() || num2.isEmpty()) {
                Toast.makeText(applicationContext, "Enter Numbers", Toast.LENGTH_SHORT).show()
            } else {
                val a = no1.getText().toString().toDouble()
                val b = no2.getText().toString().toDouble()
                if (b != 0.0) ans = a / b else Toast.makeText(
                    applicationContext,
                    "Enter Valid Numbers",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
        equal.setOnClickListener(View.OnClickListener {
            val ans1 = ans.toString()
            answer.setText(ans1)
            ans = 0.0
        })
    }
}