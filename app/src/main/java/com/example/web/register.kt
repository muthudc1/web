package com.example.web

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        signupText=  findViewById(R.id.signupText)

        signupText.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}