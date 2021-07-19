package com.example.personalitytype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class IsfjActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isfj)

        var personalKey = intent.getStringExtra("PersonalKey")
//        Toast.makeText(this,personalKey,Toast.LENGTH_LONG).show()
        textView = findViewById(R.id.textView)
        textView.text = personalKey
    }
}