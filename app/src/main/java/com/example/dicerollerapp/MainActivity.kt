package com.example.dicerollerapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val button = findViewById<Button>(R.id.button)
            val imageView = findViewById<ImageView>(R.id.imageView)

        button.setOnClickListener {
            val rollDice =(1..6).random()

            imageView.setImageResource(when(rollDice) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> throw IllegalArgumentException("Invalid dice roll")
            })
        }
    }
}