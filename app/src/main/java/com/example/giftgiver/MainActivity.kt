package com.example.giftgiver


import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    lateinit var image : ImageView
    lateinit var button : Button
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image  = findViewById(R.id.ivgift)
        button  = findViewById(R.id.btnGift)
        text = findViewById(R.id.tvGift)

        button.setOnClickListener {


            Toast.makeText(this, "Here are your gift", Toast.LENGTH_SHORT).show()

            gifter()

        }

    }

    private fun gifter()
    {

        val giftnum  = Random.nextInt(1,6)


        var choosen = when(giftnum) {
            1 -> R.drawable.gift1
            2 -> R.drawable.gift
            3 -> R.drawable.gift3
            4 -> R.drawable.gift4
            5 -> R.drawable.gift5
            else -> R.drawable.gift6
        }



        text.text=""

        image.setImageResource(choosen)


    }
}