package com.example.databinding_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.databinding_ex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.testBtnid.setOnClickListener{
            Log.e("dd","dd") //오류
            Log.w("dd","dd") //경고
            Log.i("dd","dd")//정보
            Log.d("dd","dd")//디버그
            Log.v("dd","dd")//상세

        }
    }
}