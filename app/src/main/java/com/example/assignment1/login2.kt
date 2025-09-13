package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login2)
        Log.d("ActivityStack", "Login2 onCreate")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val signupText = findViewById<TextView>(R.id.signUpLink)
        signupText.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)


        }
        val loginBtn = findViewById<android.widget.Button>(R.id.loginButton)
        loginBtn.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)

        }
        val backBtn = findViewById<ImageView>(R.id.back)
        backBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("ActivityStack", "Login2 onDestroy")
    }

}