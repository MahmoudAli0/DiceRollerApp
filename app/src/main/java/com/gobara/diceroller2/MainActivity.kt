package com.gobara.diceroller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    lateinit var DiceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnRoll : Button= findViewById(R.id.btnRoll)
        btnRoll.setOnClickListener{
            DiceRoll()
        }
        DiceImage=findViewById(R.id.diceImage)
    }

    private fun DiceRoll() {
        val number= Random().nextInt(6) +1
        val drwableResourses= when (number) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        DiceImage.setImageResource(drwableResourses)
    }
}