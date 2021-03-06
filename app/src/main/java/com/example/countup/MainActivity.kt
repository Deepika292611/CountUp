package com.example.countup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val randomNum: Button = findViewById(R.id.random_num)
        randomNum.setOnClickListener { rollDice1() }
    }
    private fun rollDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }

private fun rollDice1(){
    val randomint = (1..6).random()
    val resultText: TextView = findViewById(R.id.result_text)
    resultText.text=randomint.toString()
}
    fun IntRange.random() =
            Random().nextInt((6 + 1) - 1) + 1

}


