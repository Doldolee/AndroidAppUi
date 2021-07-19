package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class detailActivity : AppCompatActivity() {
    private lateinit var comP: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        comP = findViewById(R.id.txx)
        var textKey = intent.getStringExtra("text1")

        comP.text = textKey
    }
}