package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java

class Login1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 👈 Back button (goes to MainActivity)
        val backBtn = findViewById<ImageView>(R.id.back)
        backBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // 👈 Sign Up text (goes to signup activity)
        val signupText = findViewById<TextView>(R.id.signup)
        signupText.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        val switchaccount = findViewById<TextView>(R.id.switchacc)
        switchaccount.setOnClickListener {
            val intent = Intent(this, login2::class.java)
            startActivity(intent)
        }

        val loginBtn = findViewById<android.widget.Button>(R.id.login)
        loginBtn.setOnClickListener {
            val intent = Intent(this, login2::class.java)
            startActivity(intent)
        }

    }
}
