package com.example.hellofromoanh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //change color of the textView string by tapping the button
        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Oanh", "button tapped")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.purple_500))
        }
        //change background color by tapping button
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Oanh", "button2 tapped")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.teal_700))
        }
        //change text string
        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Oanh", "button3 tapped")
            findViewById<TextView>(R.id.textView).text = "Android is awesome"
        }
        //reset all settings by tapping background
        findViewById<ConstraintLayout>(R.id.backgroundView).setOnClickListener {
            Log.i("Oanh", "background tapped")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.green_highlight))
            findViewById<TextView>(R.id.textView).text = "Hello from Oanh"
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.orange))
        }

    }
}