package com.example.custom_font

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var testList = mutableListOf<String>()
        testList.add("a")
        testList.add("b")
        Log.d("MainActivity",testList.toString())
    }
}