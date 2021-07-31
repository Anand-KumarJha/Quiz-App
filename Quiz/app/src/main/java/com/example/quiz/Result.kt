package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Result : AppCompatActivity() {
    lateinit var textView4: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        textView4 = findViewById(R.id.textView4)

        var score = intent.getIntExtra("Score",0)
        textView4.setText("${score.toString()}/3")
    }
}