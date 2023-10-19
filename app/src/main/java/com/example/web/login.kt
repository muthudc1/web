package com.example.web

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


       lateinit var signupText: TextView


class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signupText=  findViewById(R.id.signupText)

        signupText.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }




    }
}


