package com.example.diet_memo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List: MutableList<DataModel>):BaseAdapter() {
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var converView = convertView
        if(converView == null){
            converView = LayoutInflater.from(parent?.context).inflate(R.layout.listviewitem,parent,false)
        }

        val date = converView?.findViewById<TextView>(R.id.listViewDateArea)
        val memo = converView?.findViewById<TextView>(R.id.listViewMemoArea)

        date!!.text = List[position].date
        memo!!.text = List[position].memo
        return converView!!
    }
}