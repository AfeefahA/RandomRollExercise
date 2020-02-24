package com.afa37.randomroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbtn = findViewById<Button>(R.id.rollbtn)
        val resultsTextView = findViewById<TextView>(R.id.genNumTxt)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        rollbtn.setOnClickListener {
            val randNum = Random.nextInt(seekBar.progress) + 1
            resultsTextView.text = randNum.toString()

        }
    }
}


//Exercise example from TreeHouse. Random() didn't seem to work, so it was modified for this application