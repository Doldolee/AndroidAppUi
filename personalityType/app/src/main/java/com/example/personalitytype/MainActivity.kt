package com.example.personalitytype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickTypeButton(view: View) {
        var button = view as Button
        var intent = Intent(this@MainActivity, DetailjActivity::class.java)
        intent.putExtra("PersonalKey",button.text)
        startActivity(intent)
    }
}

