package com.example.rvex

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class rvAdapter(val items: MutableList<String>):RecyclerView.Adapter<rvAdapter.ViewHolder>() {

    // 리사이클러뷰의
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rvAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rvitem, parent, false)
        return ViewHolder(view)
    }

    interface ItemClick{
        fun onClick(view:View, position: Int)
    }
    var itemClick:ItemClick? = null

    override fun onBindViewHolder(holder: rvAdapter.ViewHolder, position: Int) {

        if (itemClick != null){
            holder.itemView.setOnClickListener{ v->
                itemClick?.onClick(v,position)
            }
        }
        holder.bindItems(items[position])
    }
    // 전체 리사이클러뷰의 갯수
    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItems(item: String){
            val rv_text = itemView.findViewById<TextView>(R.id.rvItem)
            rv_text.text = item

        }

    }
}