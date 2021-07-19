package com.example.goodwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 한글씨 쓰면 명언같다")
        sentenceList.add("이건 탈무드의명언이다.")
        sentenceList.add("이건 유석이의 명언이다.")
        sentenceList.add("이건 정은이의 명언이다.")
        sentenceList.add("이건 화장실의 명어니다.")
        sentenceList.add("이건 오마니의 명언이다.")
        sentenceList.add("이건 아부지으 ㅣ명언이다.")
        sentenceList.add("이건 흉아의 명언이다.")

        val sentenceAdapter = ListViewAdapter(sentenceList)
        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter

    }
}