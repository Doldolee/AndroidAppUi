package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var emailEditText: EditText
    private lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailEditText = findViewById(R.id.editTextTextEmailAddress)
        titleTextView = findViewById(R.id.textViewTitle)
    }

    fun clickLogin(view: View) {
        var email = emailEditText.text

        if (email.length==0){
            Toast.makeText(view.context, "이메일을 입력해주세요", Toast.LENGTH_LONG).show()
        }
        else if (email.contains("@")){
            Toast.makeText(view.context, email, Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(view.context, "이메일을 확인해주세요", Toast.LENGTH_LONG).show()
        }

    }
}

