package com.example.goodwords

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.goodwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 한글씨 쓰면 명언같다")
        sentenceList.add("이건 탈무드의명언이다.")
        sentenceList.add("이건 유석이의 명언이다.")
        sentenceList.add("이건 정은이의 명언이다.")
        sentenceList.add("이건 화장실의 명어니다.")
        sentenceList.add("이건 오마니의 명언이다.")
        sentenceList.add("이건 아부지으 ㅣ명언이다.")
        sentenceList.add("이건 흉아의 명언이다.")




        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener{
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)

        }
        binding.goodWordTextArea.setText(sentenceList.random())
    }


}