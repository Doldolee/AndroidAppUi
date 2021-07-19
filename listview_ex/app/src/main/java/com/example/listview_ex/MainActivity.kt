package com.example.listview_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("a","b"))
        list_item.add(ListViewModel("c","d"))
        list_item.add(ListViewModel("e","f"))

        //? /!
        val value:String = "a"
        val value2:String? = null
        val listAdapter = ListViewAdapter(list_item)
        val listview = findViewById<ListView>(R.id.mainListview)

        listview.adapter = listAdapter

    }
}