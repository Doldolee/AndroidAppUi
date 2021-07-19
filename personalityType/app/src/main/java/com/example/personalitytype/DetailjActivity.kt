package com.example.personalitytype

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView

class DetailjActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var personalKey = intent.getStringExtra("PersonalKey")
        //Toast.makeText(this, personalKey, Toast.LENGTH_LONG).show()

        textView = findViewById(R.id.textView)
        textView.text = personalKey


        var myWebView: WebView = findViewById(R.id.webview)
        myWebView.webViewClient = WebViewClient()

        if (personalKey == "ISTJ") {
            myWebView.loadUrl("https://www.google.com/search?q=istj")
        } else if (personalKey == "ISFJ") {
            myWebView.loadUrl("https://www.google.com/search?q=isfj")
        } else if (personalKey == "INFJ") {
            myWebView.loadUrl("https://www.google.com/search?q=infj")
        } else if (personalKey == "INTJ") {
            myWebView.loadUrl("https://www.google.com/search?q=intj")
        } else if (personalKey == "ISTP") {
            myWebView.loadUrl("https://www.google.com/search?q=istp")
        } else if (personalKey == "ISFP") {
            myWebView.loadUrl("https://www.google.com/search?q=isfp")
        } else if (personalKey == "INFP") {
            myWebView.loadUrl("https://www.google.com/search?q=infp")
        } else if (personalKey == "INTP") {
            myWebView.loadUrl("https://www.google.com/search?q=intp")
        } else if (personalKey == "ESTP") {
            myWebView.loadUrl("https://www.google.com/search?q=estp")
        } else if (personalKey == "ESFP") {
            myWebView.loadUrl("https://www.google.com/search?q=esfp")
        } else if (personalKey == "ENFP") {
            myWebView.loadUrl("https://www.google.com/search?q=enfp")
        } else if (personalKey == "ENTP") {
            myWebView.loadUrl("https://www.google.com/search?q=entp")
        } else if (personalKey == "ESTJ") {
            myWebView.loadUrl("https://www.google.com/search?q=estj")
        } else if (personalKey == "ESFJ") {
            myWebView.loadUrl("https://www.google.com/search?q=esfj")
        } else if (personalKey == "ENFJ") {
            myWebView.loadUrl("https://www.google.com/search?q=enfj")
        } else if (personalKey == "ENTJ") {
            myWebView.loadUrl("https://www.google.com/search?q=entj")
        } else {
            myWebView.loadUrl("https://www.google.com/")
        }


    }
}

