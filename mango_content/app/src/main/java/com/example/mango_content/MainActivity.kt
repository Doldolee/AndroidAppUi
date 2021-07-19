package com.example.mango_content

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/ozzOg8plVu4v",
                "https://mp-seoul-image-production-s3.mangoplate.com/722502_1555594183092059.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "뉴욕탟디저트"
            )
        )
        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/ozzOg8plVu4v",
                "https://mp-seoul-image-production-s3.mangoplate.com/722502_1555594183092059.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "뉴욕탟디저트"
            )
        )

        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/ozzOg8plVu4v",
                "https://mp-seoul-image-production-s3.mangoplate.com/722502_1555594183092059.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "뉴욕탟디저트"
            )
        )
        items.add(
            ContentsModel("https://www.mangoplate.com/restaurants/ozzOg8plVu4v",
                "https://mp-seoul-image-production-s3.mangoplate.com/722502_1555594183092059.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80",
                "뉴욕탟디저트"
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv)
        val rvadapter = rvAdapter(this, items)
        recyclerview.adapter = rvadapter

        rvadapter.itemClick = object: rvAdapter.ItemClick{
            override fun onClick(view: View, position: Int) {
                TODO("Not yet implemented")
            }

        }

        recyclerview.layoutManager = GridLayoutManager(this,2)
    }
}