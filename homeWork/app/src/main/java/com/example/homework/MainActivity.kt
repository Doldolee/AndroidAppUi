package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var edittt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edittt = findViewById(R.id.txt)
    }

    fun click(view: View){
        var intent = Intent(this, detailActivity::class.java )
        intent.putExtra("text1", "안드로이드 앱 개발은 즐거워")
        startActivity(intent)
    }
}