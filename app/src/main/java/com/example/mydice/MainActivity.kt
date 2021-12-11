package com.example.mydice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener {
            rollDice()


            /*Temporary text show
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()*/
            /*val resultTextView: TextView = findViewById(R.id.textView2)
            resultTextView.text = "6"*/
        }

    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val luckyNumber = 4

        //returns returned value in diceRoll
        /* Using if-else structure
        if (diceRoll == luckyNumber) {
            println("You win!")
        }
        else if (diceRoll == 1) {
            println("So sorry! You rolled a 1. Try again!")
        } else if (diceRoll == 2) {
            println("Sadly, you rolled a 2. Try again!")
        } else if (diceRoll == 3) {
            println("Unfortunately, you rolled a 3. Try again!")
        } else if (diceRoll == 5) {
            println("Don't cry! You rolled a 5. Try again!")
        } else {
            println("Apologies! You rolled a 6. Try again!")
        } */
        /*
        when (diceRoll) {
            luckyNumber -> println("You won!")
            1 -> println("So sorry! You rolled a 1. Try again!")
            2 -> println("Sadly, you rolled a 2. Try again!")
            3 -> println("Unfortunately, you rolled a 3. Try again!")
            5 -> println("Don't cry! You rolled a 5. Try again!")
            6 -> println("Apologies! You rolled a 6. Try again!")
        }
        */

        val diceImage: ImageView = findViewById(R.id.imageView)

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()


        /*val resultTextView: TextView = findViewById(R.id.textView2)
        resultTextView.text = diceRoll.toString()
        //converting int to string*/
    }
}
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}