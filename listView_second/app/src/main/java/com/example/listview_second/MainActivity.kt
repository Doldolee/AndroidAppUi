package com.example.listview_second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val list_item = mutableListOf<String>()
//        list_item.add("a")
//        list_item.add("b")

        val list_item2 = mutableListOf<ListViewModel>()
        list_item2.add(ListViewModel("a","b"))
        list_item2.add(ListViewModel("c","d"))
        list_item2.add(ListViewModel("e","f"))
        val listview = findViewById<ListView>(R.id.mainListView)
        val adapter = ListviewAdapter(list_item2)

        listview.adapter = adapter

        listview.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this,list_item2[position].text1, Toast.LENGTH_SHORT).show()
        }
    }
}